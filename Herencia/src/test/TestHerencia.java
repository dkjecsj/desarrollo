
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("juan", 5000);
        System.out.println("empleado1 = " + empleado1);
       /* Cliente cliente1 = new Cliente(new Date (), true , "Karla",'F', 28, "Bochica sur");
        System.out.println("cliente1 = " + cliente1);
        empleado1.setNombre("julian");*/
    }
    
}
