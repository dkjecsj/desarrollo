let a = 3,
    b = 2;
c = 1;
d = 4;
let z = a + b;

console.log("Resultado de la suma : " + z)

z = a - b;
console.log("Resultado de la resta" + z);

z = a * b;
console.log("Resultado de la multiplicacion:" + z)

z = a / b;
console.log("Resultado de la division " + z);

z = a % b;
console.log("Resultado de operacion modulo" + z)

z = a ** b;
console.log("Resultado de operacion exponente  " + z);

//Incremento 
//Pre-Incremento (el operador ++ antes de la variable)

z = ++a;
console.log(a);
console.log(z);

//Post-incremento (el operador ++ despues de la variable)
z = b++;
console.log(b);
console.log(z);

//Decremento
//Pre-Decremento (el  operador -- antes de la variable)
z = --a;
console.log(a);
console.log(z);

//Post-Decremento (el operador -- despues de la variable)
z = b--;
console.log(b);
console.log(z);


z = a * b + c / d;
console.log(z);

z = c + a * b / d;
console.log(z);

z = (c + a) * b / d;
console.log(z);


//Operadores de asignacion 

a += 3;
console.log(a);

a -= 2;
console.log(a);

//Operadores de comparacion
z = a == b; // se revisa el valor sin importar el tipo
console.log(z);

z = a === c; // revisa los valores pero tambien los tipos
console.log(z);

z = a != c;
console.log(z);

z = a !== b;
console.log(z);

z = a < b;
console.log(z);

z = b <= c;
console.log(z)

z = a > b;
console.log(z);

z = a >= b;
console.log(z);

// Ejercicio numero par

if (a % 2 == 0) {
    console.log("Es un numero par")
} else {
    console.log("Es numero impar");

}
// Ejercicio mayor de edad

let edad = 20;
let adulto = 18;
if (edad >= adulto) {
    console.log("es adulto");
} else {
    console.log("es menor de edad");
}

// Operador logico AND  (&&) ES TRUE si ambas expresiones lo son.

let valMin = 0,
    valMax = 10;

if (a >= valMin && a <= valMax) {
    console.log("Dentro del rango")

} else {
    console.log("Fuera de rango");
}

// Operador logico OR (||) regresa TRUE si cualquiera de los operandos es TRUE

let vacaciones = false,
    diaDescanso = false;
if (vacaciones || diaDescanso) {
    console.log("Padre puede asistir al juego del hijo")

} else {

    console.log("El padre esta ocupado")

}

//Operador Ternario 

let resultado = (3 > 2) ? "Verdadero" : "Falso";

console.log(resultado);

//De String a Numero
let miNumero = "10";

// Operador isNaN
edad = Number(miNumero);
console.log(edad);

if (isNaN(edad)) {
    console.log("No es un numero")

} else {

    if (edad => 18) {
        console.log("Puede votar");


    } else {
        console.log("muy joven para votar")

    }

}