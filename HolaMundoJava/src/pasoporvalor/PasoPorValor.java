
package pasoporvalor;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PasoPorValor {
    
    //Se pasa una copia del valor de la variable  al metodo que estamos llamando,
    //pero este metodo no puede modificar el valor original
    
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        System.out.println("nuevo valor = " + x);
    }
    
    public static void cambioValor (int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
