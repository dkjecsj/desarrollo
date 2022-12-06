package calculos;

public class Calculos {

    //Atributos 
    int cedula;
    int numeroUno;
    int numeroDos;
    int resultado;
    String nombre;
    String operacion = "";
    String suma = "suma";
    String resta = "resta";
    String multiplicacion = "multiplicacion";
    String division = "division";
    String terminar = "terminar";

    //Constructor vacio
    public Calculos() {

    }

    //Metodo operaciones
    public void operador() {

        if (this.operacion.equals(suma)) {
            this.resultado = this.numeroUno + this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la suma es: " + resultado);

        } else if (this.operacion.equals(resta)) {
            this.resultado = this.numeroUno - this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la resta es :" + resultado);

        } else if (this.operacion.equals(multiplicacion)) {
            this.resultado = this.numeroUno * this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la multiplicacion es: " + resultado);

        } else if (this.operacion.equals(division)) {
            this.resultado = this.numeroUno / this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la division es: " + resultado);

        }

    }

}
