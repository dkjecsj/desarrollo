/* Las funciones son codigos reutilizables 
y lo podemos llamar las veces que necesitemos
-La funcion es un tipo de dato 
- Las funciones puede describirse como un objeto
- Funcion o metodo es exactamente lo mismo  */

/*Hoisting: Mueve la declaracion de la funcion al inicio 
programa para que la podamos utilizar en cualquier parte 
de nuestro programa */

miFuncion(4,2);

//Declaracion de la funcion
function  miFuncion(a,b)  {
    return a + b;
}

//Llamando la funcion
let resultado= miFuncion (2,3);
console.log(resultado);

//Funciones de Tipo Expresion

//Declaracion de tipo expresion

/*let sumar = function(a,b){return a+b};
resultado = sumar(1,2);
console.log(resultado);*/

//Funcion Self Invoking que se llama a si misma, estas ya no son reutilizables.
(function (a,b){
    console.log('Ejecutamos la funcion '+ (a+b))
})(3,4); 

//Funciones como objetos
var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto)

//Funciones flecha (Arrow)

const sumarFuncionTipoFlecha = (a,b) => a+b;
resultado = sumarFuncionTipoFlecha(3,5);
console.log(resultado);

/*Argumentos y parametros en Funciones
 Parametros: Son las variables que va a recibir la funcion
 Argumentos: Son los valores que pasamos en la funcion */

 let sumar = function(a,b){

    console.log(arguments[0]);  // Propiedad arguments , esta propiedad es un Array.
    console.log(arguments[1]);
    return a + b;

 };

resultado = sumar(3,2);
console.log(resultado);

//Ejemplo Sumar Todo

let resultadoDos = sumarTodo (5, 4, 13, 10, 9);
console.log(resultadoDos);

function sumarTodo(){
    let suma = 0;
    
for (let i = 0; i < arguments.length ; i++) {
    suma += arguments[i];
    
    
}
return suma;

}

//Paso por Valor y paso por Referencia 

let x = 10;

function cambiarValor (a){
a = 20;

}

//Paso por valor
cambiarValor(x);
console.log(x);

//Creacion de un objeto

const persona = {
    nombre : 'Juan',
    apellido : 'Perez'
}

function cambiarValorObjeto (p1){
    p1.nombre = 'Carlos';
    p1.apellido = 'Lopez';
   ;
}

//paso por referencia
cambiarValorObjeto (persona);
console.log(persona);