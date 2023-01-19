/*Promesas : Una promesa es un codigo que tiene varios estados, en las que se puede tener dos caminos
una en donde el codigo se ejecuto correctamente y otro en la que no*/

let miPromesa = new Promise((resolver, rechazar) => {
    let expresion = true;
    if(expresion)
    resolver('Resolvio correcto');
    else
    rechazar('se produjo un error');


});

//miPromesa.then( valor => console.log(valor), error => console.log(error));

//miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));

//Funcion setTimeout y Promesas

let promesa = new Promise((resolver) => {
    //console.log('inicio promesa');
    setTimeout(()=>resolver ('saludos con promesa y timeout'), 3000);
    //console.log('fin promesa');
});

//promesa.then(valor => console.log(valor));

//Palabra Async : esta expresion indica que una funcion regresa una promesa

async function miFunctionConPromesa(){
    return 'saludos con promesa y async';
}

//miFunctionConPromesa().then(valor => console.log(valor));

//Palabra await y async : la expresion await espera el resultado de una promesa
async function funcionConPromesaYAwait(){
    let miPromesa = new Promise (resolver =>{
        resolver('Promesa con await');
});

console.log(await miPromesa);
}

funcionConPromesaYAwait();

/*Promesa con Async , Await y setTimeout: Esta promesa se va a resolver despues de ciertos segundos
despues de ejecutar setTimeout */
async function funcionConPromesaAwaitTimeout(){
    console.log('Inicio de funcion');
    let miPromesa = new Promise(resolver => {
        setTimeout(() => resolver ('promesa con await y timeout'),3000);

    });

    console.log(await miPromesa)
    console.log('Fin de la funcion');

}

funcionConPromesaAwaitTimeout();

