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

    /*Metodo apagar*/
    public void ApagarOLT(ArrayList<ObjectVO> lists, String contras, String usuario, String ip, String port) {
        try {
            //  long totalSum = 0;
            //leer excel java
            //    long startTime = System.currentTimeMillis();
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
            System.out.print("entre");
            readUntil(">>User name:");
            //cuando el readUntil de login finaliza, procedemos a ingresar el user
            //a través del método write, el cual escribe en la consola
            //  write("pruebaapp");
            write(usuario);

            //esperamos hasta que el prompt muestre la palabra password:
            //La palabra tiene que ser exacta a la que sale en el prompt
            readUntil(">>User password:");

            //Ahora ingresamos el password
            // write("prueba123");
            write(contras);

            //Esperamos hasta que salga el prompt de nuestro servidor
            readUntil("OLT5PAIPA>");

            //Para ver el directorio donde estamos
            write("enable");
            readUntil("OLT5PAIPA#");

            write("config");

            //Esperamos a que salga el prompt
            readUntil("OLT5PAIPA(config)#");

            for (int i = 0; i < lists.size(); i++) {

                write("interface gpon " + lists.get(i).getFrame());

                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#");
                String a[] = lists.get(i).getPuerto().split("/");
                write("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state off");
              //  readUntil("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state o ff");
                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#");  
              System.out.println("ERROR");
               // if (readUntil("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state o ff" + "\n" + "  Failure: The ONT does not exist").equals("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state o ff" + "\n" + "  Failure: The ONT does not exist")) {
                 //   System.out.println("Apagado Fallido");
               // }
                //   readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#");
                //if (readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#").equals("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#")) {
                 //   System.out.println("Apagado");
                //}

            }

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("ENTRE aca3");
        } finally {
            try {
                System.out.println("ENTRE aca");
                //Liberamos recursos
                out.close();
                reader.close();
                in.close();
                telnet.disconnect();

            } catch (IOException ex) {

                System.out.println("ENTRE aca2");
                Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public String readUntil(String pattern) {
        StringBuffer sb = new StringBuffer();

        try {
            char lastChar = pattern.charAt(pattern.length() - 1);

            boolean found = false;

            int check = in.read();
            char ch = (char) check;
            while (check != -1) {
                System.out.print(ch);
                sb.append(ch);
                if (ch == lastChar) {
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
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Metodo encender*/
    public void EncenderOLT(ArrayList<ObjectVO> lists, String contras, String usuario, String ip, String port) {
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
            System.out.print("entre");
            readUntil(">>User name:");
            //cuando el readUntil de login finaliza, procedemos a ingresar el user
            //a través del método write, el cual escribe en la consola
            //  write("pruebaapp");
            write(usuario);

            //esperamos hasta que el prompt muestre la palabra password:
            //La palabra tiene que ser exacta a la que sale en el prompt
            readUntil(">>User password:");

            //Ahora ingresamos el password
            // write("prueba123");
            write(contras);

            //Esperamos hasta que salga el prompt de nuestro servidor
            readUntil("OLT5PAIPA>");

            //Para ver el directorio donde estamos
            write("enable");
            readUntil("OLT5PAIPA#");

            write("config");

            //Esperamos a que salga el prompt
            readUntil("OLT5PAIPA(config)#");
            for (int i = 0; i < lists.size(); i++) {

                write("interface gpon " + lists.get(i).getFrame());

                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#");
                String a[] = lists.get(i).getPuerto().split("/");
                write("ont port attribute " + a[0] + " " + a[1] + " catv 1 operational-state on");

                readUntil("OLT5PAIPA(config-if-gpon-" + lists.get(i).getFrame() + ")#");
            }

            System.out.print("sali");
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
    }
}
