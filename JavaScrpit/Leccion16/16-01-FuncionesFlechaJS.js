//Funciones flecha : Son funciones anonimas

 miFuncion = function(){
    console.log('saludos desde mi funcion');

}

let miFuncionFlecha = () => {
    console.log('Saludos desde mi funcion flecha');
}

const miFuncionFlecha2 = ()=> console.log('Saludo desde mi funcion flecha');

const saludar  = ()=>{
    return 'Saludos desde funcion felcha2'
}

const saludar2 =()=> 'saludos desde funcion flecha2';

console.log(saludar2());

const regresaObjeto = ()=> ({nombre : 'Juan'});
console.log(regresaObjeto());

const funcionConParametros = (mensaje) => console.log(mensaje);
funcionConParametros('saludo con parametros');

miFuncionFlecha();

const funcionConParametros2 = (op1, op2 )=> op1 + op2;
console.log(funcionConParametros2(3,3) );