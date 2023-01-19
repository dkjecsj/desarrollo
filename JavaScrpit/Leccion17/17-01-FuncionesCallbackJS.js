/*Funciones de tipo callback : Es una funcion que se pasa como parametro a otra funcion.
y dentro de una funcion podemos llamar a otra funcion.*/

function miFuncion1(){ //Funciones basicas
    console.log('funcion 1');


}

function miFuncion2(){
    console.log('funcion 2');

}

miFuncion1();
miFuncion2();

//Funcion de tipo callback
let imp = function imprimir(mensaje){
    console.log(mensaje);
}

function sumar(op1,op2, funcionCallback){
    let res = op1 + op2;
    funcionCallback(`Resultado: ${res}`);
}

sumar(5,3, imp)

/*Llamadas asincronas con uso setTimeout: Se pasa un funcion de tipo callback para que en el
momento en que se cumple un tiempo definido se dipare la llamada a dicha funcion*/
function miFuncionCallback(){
    console.log('saludo asincrono despues de 3 seg');
    

}

setTimeout(miFuncionCallback, 3000); //despues de 3 segundos

setTimeout(function(){ console.log('saludo asincrono 2')}, 4000);

setTimeout(() => console.log('saludo asincrono 3'), 5000);

//Funcion setInterval : Recibe una funcion de tipo callback y llama la funcion cada cierto tiempo.

let reloj = () => {
    let fecha = new Date ();
    console.log(`${fecha.getHours()} : ${fecha.getMinutes()}:${fecha.getSeconds()} `)
}

setInterval(reloj, 1000);

 