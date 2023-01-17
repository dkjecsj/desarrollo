/* Un objeto puede tener propiedades y metodos */

let persona = {
    nombre : 'Juan' ,
    apellido: 'Perez',
    email : 'jperez@mai.com',
    edad: 28 , 
    nombreCompleto : function(){ //Agregar metodos en los objetos
     return this.nombre + ' ' + this.apellido;
    }


}

console.log(persona.nombre);
console.log(persona);
console.log(persona.nombreCompleto());

//Creacion de objetos 

let persona2 = new Object();
persona2.nombre = 'carlos';
persona2.direccion = 'Saturno 15';
persona2.tel = '55555';

console.log(persona2.tel);

//Acceder a las propiedades de un objeto tambien podemos acceder a ellas como un arreglo.

console.log(persona['apellido']);

//for in

for (nombrePropiedad in persona){
    console.log(persona);
    console.log(persona [nombrePropiedad]);
}
//Agregar y eliminar propiedades de un objeto

persona.tel = '5555'; //Agregamos a un nuevo valor a una propiedad ya existente
console.log(persona);


delete persona.tel;
console.log(persona); //Eliminar propiedades de los objetos.

//Formas de imprimir un objeto

//1. concatenar cada valor de cada propiedad
console.log(persona.nombre + ','+ persona.apellido);

//2. for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//3. Object
let personaArray = Object.values(persona);
console.log(personaArray);

//4. Podemos usar una cadena.

let personaString = JSON.stringify(persona);
console.log(personaString);

//Metodo get en Objetos, nos permite acceder a los valores de nuestras propiedades

let datos = {
    nombre : 'Karla' ,
    apellido: 'Lopez',
    edad: 28 , 
    idioma : 'es',

    get lang(){
        return this.idioma.toUpperCase();
    },

    set lang (lang){
        this.idioma = lang.toUpperCase();
    },
     get datosCompleto(){ 
     return this.nombre + ' ' + this.apellido;
    }


}

console.log(datos.lang);
datos.lang = 'en';
console.log(datos.idioma);

//Metodo Constructor Objetos 

function Datos (nombre, apellido, email){
    this.nombre  = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){ //Agregar metodos a un metodo constructor
    return this.nombre + ' '+ this.apellido;
    }


}

//Uso Prototype : Crea propiedades para todos lps objetos.
Datos.prototype.tel = '44444';

let padre = new Datos('juan', 'perez','jperez@mail.co');
console.log(padre);
console.log(padre.nombreCompleto()); //Imprimimos la funcion
padre.tel = '111111';
console.log(padre.tel);

let madre = new Datos ('laura', 'quintero', 'laquintero@mail.com');
console.log(madre);
console.log(madre.tel);

padre.nombre = 'Carlos';
console.log(padre);
console.log(madre);

//Distintas formas de crear un objeto

let miObjeto = new Object ();
let miObjeto2 = {};

let miCadena1 = new String ('Hola');
let miCadena2 = 'hola';

let miNumero = new Number (1);
let miNumero2 = 1;

let miBoolean = new Boolean (false);
let miBoolean2 =false;

let miArreglo = new Array ();
let miArreglo2 = [];

let miFuncion = new Function();
let miFuncion2 = function(){};

// Metodo Call : Nos permite llamar un metodo, que esta definido en un objeto desde otro objeto.

let persona1 = {
    nombre: 'juan',
    apellido: 'perez',
    nombreCompleto: function(titulo, tel){ //Para los parametros no hay necesidad de usar this debido a que no son propiedades del objeto.
        return titulo+' :' + this.nombre + ' ' + this.apellido + ' ,' + tel;
    }
}
let persona3 = {
    nombre: 'carlos',
    apellido : 'Lara'

}

/*
Uso de call para usar el metodo persona1.nombreCompleto 
con los datos del objeto persona3*/
console.log(persona1.nombreCompleto());

console.log(persona1.nombreCompleto.call (persona3));

console.log(persona1.nombreCompleto.call (persona3, 'ing','44444')); //Agregamos los parametros solicitados.

//Metodo Apply : Nos permite llamar un metodo en un objeto que no tiene definido cierto metodo
let arreglo = ['ing', '44444']; //De esta manera no tenemos que pasar unoa uno los valores de los argumentos.
console.log(persona1.nombreCompleto.apply(persona3, arreglo));




