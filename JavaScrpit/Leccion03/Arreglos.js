//let carrros = new Array ();
const carros = ['BMW', 'Mercedes', 'Volvo'];
console.log(carros);

console.log(carros[0]);
console.log(carros[2]);

for (let i = 0; i < carros.length; i++) {
    console.log(carros[i])
}

carros[1] = 'MercedesBenz';
console.log(carros[1]);

carros.push('Audi'); // push para agregar elementos al Array.
console.log(carros);

console.log(carros.length);
carros[carros.length] = 'Cadillac'

console.log(carros);

console.log(typeof carros)

// Preguntar si es un tipo Array
console.log(Array.isArray(carros));

console.log(carros instanceof Array);