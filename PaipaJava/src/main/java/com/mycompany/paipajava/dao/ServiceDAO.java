/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paipajava.dao;

import com.mycompany.paipajava.vo.ObjectVO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.telnet.TelnetClient;

/**
 *
 * @author juliancastillo
 */
public class ServiceDAO {

    private TelnetClient telnet = new TelnetClient();
    private BufferedReader reader;
    private InputStream in;
    private PrintStream out;
    private String serverName;
    private String user;
    private String password;
    private String promptComplete;

    private String estadoa;

    /*Metodo apagar*/
    public List<String> ApagarOLT(ArrayList<ObjectVO> lists, String contras, String usuario, String ip, String port) {
        List<String> estado = new ArrayList<>();
        try {
            //leer excel java
            //    long startTime = System.currentTimeMillis();
            //Abro la conexión al telnet por el puerto 23
            telnet.connect(ip, Integer.parseInt(port));
            //Ahora necesito una forma de leer las respuestas que
            //me envía el telnet, para esto obtenemos un InputStream
            //del objeto telnet
            in = telnet.getInputStream();
            //Ahora necesito una forma de enviarle los comandos al telnet
            //para esto obtengo un OutputStream desde el objeto telnet
            out = new PrintStream(telnet.getOutputStream());

            //Ahora envuelvo el InputStream dentro de un BufferedReader
            //para que la lectura de las respuestas del telnet sean mucho
            //mas sencillas y mejor gestionadas
            reader = new BufferedReader(new InputStreamReader(in));
            //Ahora leemos de la consola a través de nuestro método
            //readUntil el cual lee de la consola hasta que el último
            //caracter (un char) sea -1 y que el prompt sea igual
            //al patron que le enviamos como argumento, en este caso
            //es hasta que el prompt despliegue el patron login:
           // System.out.print("entre");
            readUntil(">>User name:", "", "");
            //cuando el readUntil de login finaliza, procedemos a ingresar el user
            //a través del método write, el cual escribe en la consola
            write(usuario);

            //esperamos hasta que el prompt muestre la palabra password:
            //La palabra tiene que ser exacta a la que sale en el prompt
            readUntil(">>User password:", "", "");

            //Ahora ingresamos el password
            write(contras);

            //Esperamos hasta que salga el prompt de nuestro servidor
            readUntil("OLT5PAIPA>", "", "");

            //Para ver el directorio donde estamos
            write("enable");
            readUntil("OLT5PAIPA#", "", "");

            write("config");

            //Esperamos a que salga el prompt
            readUntil("OLT5PAIPA(config)#", "", "");

            for (int i = 0; i < lists.size(); i++) {
                write("interface gpon " + lists.get(i).getFrame());

                String a[] = lists.get(i).getPuerto().split("/");

                String patronBusqueda = a[0] + "" + a[1];
                for (int j = 0; j < 2; j++) {
                    readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#", patronBusqueda, "apagado");
                    write("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state off");
                }

                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#", patronBusqueda, "apagado");
                estado.add(this.estadoa);

            }
            return estado;

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                //Liberamos recursos
                out.close();
                reader.close();
                in.close();
                telnet.disconnect();

            } catch (IOException ex) {

                Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return estado;
    }

    public String readUntil(String pattern, String patronBusqueda, String funcion) {
        StringBuffer sb = new StringBuffer();

        try {
            char lastChar = pattern.charAt(pattern.length() - 1);

            boolean found = false;

            int check = in.read();
            char ch = (char) check;
            String resultado = "";
            while (check != -1) {
           //     System.out.print(ch);
                sb.append(ch);

                if (ch == lastChar) {
                    resultado = sb.toString();
                    resultado = resultado.replaceAll(" ", "");
                    //  System.out.println("RESULTADO ES: " + resultado);
                    if (resultado.contains("attribute" + patronBusqueda + "catv1operational-state") && funcion.equals("apagado")) {
                        //     System.out.println("ENTRE APAGADOO");
                        if (resultado.contains("Failure:Makeconfigurationrepeatedly")) {
                            this.estadoa = "Apagado";
                            //      System.out.println(estadoa + " ACA ESTA EL READ COMPLETO  OFF " + resultado);
                        } else {
                            //        System.out.println("ENTRE ERRORRR ONT");
                            if (resultado.contains("doesnotexist")) {
                                this.estadoa = "ONT no Existe";
                                //        System.out.println(estadoa + " ACA ESTA EL READ COMPLETO  ONT no Existe " + resultado);
                            }
                        }
                    } else {
                        if (resultado.contains("attribute" + patronBusqueda + "catv1operational-state") && funcion.equals("encendido")) {
                            //        System.out.println("ENTRE ENCENDIDO");
                            if (resultado.contains("Failure:Makeconfigurationrepeatedly")) {
                                this.estadoa = "Encendido";
                                //           System.out.println(estadoa + " ACA ESTA EL READ COMPLETO  ON " + resultado);

                            } else {
                                //             System.out.println("ENTRE ERRORRR ONT");
                                if (resultado.contains("doesnotexist")) {
                                    this.estadoa = "ONT no Existe";
                                    //                      System.out.println(estadoa + " ACA ESTA EL READ COMPLETO  ONT no Existe " + resultado);
                                }
                            }
                        }
                    }

                    if (sb.toString().endsWith(pattern)) {

                        return sb.toString();
                    }
                }
                check = in.read();
                ch = (char) check;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public void write(String value) {
        try {
            out.println(value);
            out.flush();
          //  System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Metodo encender*/
    public List<String> EncenderOLT(ArrayList<ObjectVO> lists, String contras, String usuario, String ip, String port) {
        List<String> estado = new ArrayList<>();
        try {
            //leer excel java
            //Abro la conexión al telnet por el puerto 23
            // telnet.connect("190.90.132.129", 10038);
            telnet.connect(ip, Integer.parseInt(port));
            //Ahora necesito una forma de leer las respuestas que
            //me envía el telnet, para esto obtenemos un InputStream
            //del objeto telnet
            in = telnet.getInputStream();
            //Ahora necesito una forma de enviarle los comandos al telnet
            //para esto obtengo un OutputStream desde el objeto telnet
            out = new PrintStream(telnet.getOutputStream());

            //Ahora envuelvo el InputStream dentro de un BufferedReader
            //para que la lectura de las respuestas del telnet sean mucho
            //mas sencillas y mejor gestionadas
            reader = new BufferedReader(new InputStreamReader(in));
            //Ahora leemos de la consola a través de nuestro método
            //readUntil el cual lee de la consola hasta que el último
            //caracter (un char) sea -1 y que el prompt sea igual
            //al patron que le enviamos como argumento, en este caso
            //es hasta que el prompt despliegue el patron login:
            //    System.out.print("entre");
            readUntil(">>User name:", "", "");
            //cuando el readUntil de login finaliza, procedemos a ingresar el user
            //a través del método write, el cual escribe en la consola
            //  write("pruebaapp");
            write(usuario);

            //esperamos hasta que el prompt muestre la palabra password:
            //La palabra tiene que ser exacta a la que sale en el prompt
            readUntil(">>User password:", "", "");

            //Ahora ingresamos el password
            // write("prueba123");
            write(contras);

            //Esperamos hasta que salga el prompt de nuestro servidor
            readUntil("OLT5PAIPA>", "", "");

            //Para ver el directorio donde estamos
            write("enable");
            readUntil("OLT5PAIPA#", "", "");

            write("config");

            //Esperamos a que salga el prompt
            readUntil("OLT5PAIPA(config)#", "", "");
            for (int i = 0; i < lists.size(); i++) {
                //      System.out.println("ENTRE A WHILE");
                write("interface gpon " + lists.get(i).getFrame());

                String a[] = lists.get(i).getPuerto().split("/");

                String patronBusqueda = a[0] + "" + a[1];
                for (int j = 0; j < 2; j++) {
                    //      System.out.println("ENTRE A FOR");
                    readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#", patronBusqueda, "encendido");
                    write("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state on");
                }

                //  System.out.println("SALI A WHILE");
                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#", patronBusqueda, "encendido");
                estado.add(this.estadoa);
            }

            return estado;
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                //Liberamos recursos
                out.close();
                reader.close();
                in.close();
                telnet.disconnect();

            } catch (IOException ex) {
                Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return estado;
    }
}
