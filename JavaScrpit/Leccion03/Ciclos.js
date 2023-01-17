let contador = 0;

while (contador < 3) {
    console.log(contador);
    contador++;
}


// DO WHIILE

do {
    console.log(contador);
    contador++;
} while (contador < 3);
console.log("fin del ciclo while")

//CICLO FOR

//PALABRA BREAK
for (let cont = 0; cont <= 10; cont++) {
    if (cont % 2 == 0)
        console.log(cont);
    break;


}

//PALABRA CONTINUE

for (let cont = 0; cont <= 10; cont++) {
    if (cont % 2 !== 0) {
        continue; //Ir a la siguiente iteracion

    } else {
        console.log(cont);
    }





}