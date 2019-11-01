//var a = new Array()

let coisas = [1, 2, 3, 4, 5, 6, 7];

console.log(coisas);
console.log(coisas[1]);

let palavras = ["12345", 12345, "jaburu", true, 789.0];
console.log(palavras);

let homens = ["João", "Gustavo", "Tadeu", "Verson"];
let mulheres = ["Giovanna", "Mariana", "Jacoana", "Jabura"];

homens.push("Canvas"); // insere no fim do array
mulheres.unshift("Gabriela"); // insere no inicio do array

//homens.pop(); // retira o ultimo elemento do array
homens.shift(); // retira o primeiro elemento do array

console.log(homens);
console.log(mulheres);

// let numeroUser = parseInt(prompt("Digite um numero de 0 e 10"));
// let numeros = [];
// let total = 0;
// let posicao = [];

// for (let i = 0; i < 10; i++) {
//   numeros[i] = parseInt(Math.random() * 11);
//   if (numeros[i] === numeroUser) {
//     total++;
//     posicao.push(i);
//   }
//   console.log(numeros[i]);
// }

// console.log("Total de numeros encontrados" + total);
// console.log("Indice:" + posicao);

//sortear dos arrays - 10
// 1º apenas com numeros pares
// 2º apenas com numeros multiplos de 5

let numerosPares = [];
let numerosImpares = [];

for (let i = 0; i < 10; i++) {
  numerosPares[i] = parseInt(Math.random() * 100);
  if (numerosPares[i] % 2 === 0) {
    console.log(numerosPares[i]);
    console.log("numero par");
  } else {
    console.log(numerosPares[i]);
    console.log("numero impar");
  }
}
