//Ejemplos de  tipos de datos JavaScript
var nombre = "Carlos"; // tipo cadena o String 
console.log(nombre);

nombre = 10;
console.log(typeof nombre); //Nos muestra el tipo de dato


var numero = 1000; //Tipo numerico
console.log(numero)

var objecto = { //Tipo de dato Object
    nombre: "juan",
    apellido: "perez",
    telefono: "235246"
}

console.log(objecto)

//Tipo de dato boolean (True,False)

var bandera = true;
console.log(typeof bandera)

//Tipo de dato function
function miFuncion() {}
console.log(typeof miFuncion);

//Tipo de dato Sybol
var simbolo = Symbol("mi simbolo");
console.log(simbolo)

//Tipo clase en una function
class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

}

console.log(typeof Persona)

//Tipo undefined
var x;
console.log(x);

//null = ausencia de valor
var y = null;
console.log(typeof y);

//Arreglos son object
var autos = ['BMW', 'Audi', 'Volvo'];
console.log(autos)
console.log(typeof autos)


var z = '';
console.log(z);
console.log(typeof z)