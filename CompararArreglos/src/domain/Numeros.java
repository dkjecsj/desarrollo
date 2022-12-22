
package domain;

public class Numeros {
    
    //Atributos
    private int numero;
    private int numeroMayor;
    private int numeroMenor;
    
    
    //Constructor Vacio
    public Numeros (){
     
    
     }
    
    
    //Metodos get y set

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroMayor() {
        return this.numeroMayor;
    }

    public void setNumeroMayor(int numeroMayor) {
        this.numeroMayor = numeroMayor;
    }

    public int getNumeroMenor() {
        return this.numeroMenor;
    }

    public void setNumeroMenor(int numeroMenor) {
        this.numeroMenor = numeroMenor;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + ", numeroMayor=" + numeroMayor + ", numeroMenor=" + numeroMenor + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
