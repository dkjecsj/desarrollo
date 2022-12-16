
package test.objetos;

public class Examenes {
    
    private int a ;
    private int b; 
    private int c;
    private int nota;
    
    
   public Examenes (){
   
   }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
   
     public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Examenes{" + "a=" + a + ", b=" + b + ", c=" + c + ", nota=" + nota + '}';
    }
    
    
   
   
}
