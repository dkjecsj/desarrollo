/* Sobreescritura en JavaScript : Sobreescribe los comportamientos de un metodo, es decir
las clases hijas dan su propio comportamiento a los metodos de la clase padre.
 */

class Empleado{
    constructor(nombre , sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
obtenerDetalles(){
    return`Empleado: nombre: ${this.nombre}, sueldo: ${this.sueldo}`;

}

}

class Gerente extends Empleado{

    constructor(nombre, sueldo, departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()} depto: ${this.departamento}`
    }
}

function imprimir(tipo){
    tipo.obtenerDetalles();
    console.log(tipo.obtenerDetalles());
    if(tipo instanceof Gerente){ //Palabra instanceof en Javascript : Nos ayuda a saber de que tipo  que estamos utilizando pertenece a cierta clase.

        console.log('Es un objeto de tipo Gerente');
    }
   else if(tipo instanceof Empleado){
        console.log('Es un objeto de tipo Empleado');
    }
   else if(tipo instanceof Object){
        console.log('Es un tipo Object');
    }
}


let empleado1 = new Empleado('Juan', 3000);
console.log(empleado1.obtenerDetalles());

let gerente1 = new Gerente('Carlos', 5000, 'Sistema');
console.log(gerente1.obtenerDetalles());

/*Polimorfismo:  Multiples formas en que se puede llamar un metodo
dependiento del tipo que estemos utilizando.*/
imprimir(empleado1);
imprimir(gerente1);




