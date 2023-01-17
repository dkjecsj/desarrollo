/* Clases : Una clase es una plantilla esta posee 
un nombre , atributos y metodos. A partir de esta plantilla
podemos crear instancias de  un objeto.

Un objeto es una instacia de una clase.
*/



class Persona {

    static contadorObjetosOpersona = 0; //Atributo static de nuestra clase.
     email = 'Valor default email' //Atributo no static, de nuestro objetos.

     static get MAX_OBJ(){
        return 5;
     }

    constructor(nombre, apellido ){ //Metodo para inializar los atributos de una clase
      this._nombre = nombre;
      this._apellido = apellido;
      if(Persona.contadorObjetosOpersona < Persona.MAX_OBJ){
        this.idPersona = ++Persona.contadorObjetosOpersona;
      }
      else{
        console.log('Se ha superado el limite')
      }
      


    }
/* El metodo get no se puede llamar igual que las propiedaes
 por tal razon se le agreaga un guion bajo  antes del nombre
 de la propiedad*/
         
    get nombre(){
        return this._nombre; 
    }
/*El metodo set se usa para modificar el valor del atributo*/
    set nombre(nombre){
        this._nombre = nombre;
        
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto (){ //Metodo : detro de la clase no hay necesidad de colocar la palabra fuction 
        return this.idPersona+'  '+ this._nombre + ' ' + this._apellido; // solo con colocar el nombre del metodo ya se sobreentiende que es una funcion.
   
   
        }

        toString(){ //Sobreescribimos en metodo toString de la clase padre (Object)
            //Se aplica polimorfismo (multiples formas en tiempo de ejecucion)
            //El metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo.
        return this.nombreCompleto();
        }

        static saludar(){ //Static : Un metodo static se asocia con una clase, pero no con los objetos.
            console.log('saludos desde metodo static')
        }
        
        static saludar2(persona){
            console.log(persona.nombre);
        }


}


let persona1 = new Persona('Juan', 'Perez');
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

/*Hoisting : Cuando trabajamos con clases no se aplica el concepto de hoisting 
es decir que primero tenemos que definir nuestra clase para poderla utilizar.

1. No es posible crear objetos antes de declarar la clase.
2. No se aplica el concepto de hoisting 
*/

let persona2 = new Persona ('Karla', 'Suarez');

/* Herencia: Es una caracteristica muy importante en la programacion orientada a objetos y 
podemos aplicar este concepto para reutilizar codigo y poder heredar caracteristicas desde una 
clase padre hacia una clase hija.
*/

class Empleado extends Persona { //La palabra extends nos indica que estamos heredando las caracteristicas de la clase padre
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); //Llamamos al constructor de la clase padre.
        this._departamento = departamento;
    
    }
    
    get departamento(){
        return this._departamento;
    }
    
    set departamento(departamento){
        this._departamento = departamento;
    
    }
   /*Sobreescritura : Desde la clase hija vamos a moodificar el comportamiento definido
    en el metodo de la clase padre.
    */

  nombreCompleto(){
    return super.nombreCompleto() +' , '+ this._departamento;


  }
    
     
    }

    let persona3 = new Persona('Juan', 'Perez');
    console.log(persona3);
    

    let empleado1 = new Empleado('Karla', 'Jimenez', 'Sistemas');
    console.log(empleado1);
    console.log(empleado1.nombre);
    console.log(empleado1.nombreCompleto()); //Heredar metodos 
    console.log(empleado1.toString());

//Palabra Static 
// persona1.saludar(); No es posible llamar un metodo static desde un objeto

     Persona.saludar();
     Persona.saludar2(persona1);

     Empleado.saludar(); // Las clases hijas tambien heredan los metodos static
     Empleado.saludar2(empleado1);
     
//Atributos Static

console.log(Persona.contadorObjetosOpersona); //Se debe acceder directamente con el nombre de la clase.


console.log(Empleado.contadorObjetosOpersona); // Las clases hijas tambien heredan los atributos static

//Atributos no Static
console.log(persona1.email);  //Se acceden desde los objetos
console.log(empleado1.email)


//Ejemplo de la palabra Static
console.log(persona1.toString());
console.log(empleado1.toString());
console.log(Persona.contadorObjetosOpersona);

let persona4 = new Persona ('Camila', 'Gomez');
console.log(persona4.toString());
console.log(Persona.contadorObjetosOpersona);

let persona5 = new Persona('Armando', 'Toledo');
console.log(persona5.toString());
console.log(Persona.contadorObjetosOpersona);

// Creacion de constantes static
console.log(Persona.MAX_OBJ);

