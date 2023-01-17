/*Bloque Try Catch  Finally : Manejo de excepsiones. Es decir se le da manejo aun posible error
que se pueda generar para que el programa siga funcionando y no se vea afectado.*/

'use strict'

try{ //Contiene  el error
   let  x = 10;
    miFuncion();
    throw 'Mi error';

}catch(error){
    console.log(error); // Captura el error


}
finally{ //Siempre se va a ejecutar
    console.log('Termina la revision de errores');

}
console.log('Continua');

//Clausula throws :Ar rojar un nuevo error

'use strict'
let resultado = 5;
try{
 if(isNaN(resultado)) throw 'No es un numero';
 else if(resultado === '') throw 'Es cadena vacia';
 else if(resultado >= 0 ) throw 'Valor positivo';
 else if(resultado < 0) throw 'Valor negativo'
}
catch(error){
    console.log(error);
    console.log(error.name);
    console.log(error.menssage);
}

finally{
    console.log('Termina revision de errores');
}

