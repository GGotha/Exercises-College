//if

//sortear um valor entre 0 e 1
let n1 = Math.random();
console.log("Valor sorteado: " + n1);

//sortear um valor entre 0 e 99
n1 = Math.random()*100;
console.log("Valor sorteado: " + n1);

//sortear um valor entre 0 e 99 inteiro
n1 = parseInt(Math.random()*100);
console.log("Valor sorteado: " + n1);

//sortear um valor entre 0 e 99 inteiro
n1 = Math.round(Math.random()*100);
console.log("Valor sorteado: " + n1);

if (n1 % 2 == 0) {
  console.log(n1 + " é um número par");
}
else {
  console.log(n1 + " é um número ímpar");
}



//------------------------------------------
//switch
let numero = Number(prompt('Digite um número entre 0 e 2'));
console.log(numero);


  switch (numero) {
    case 0:
      console.log("Digitou o número zero");
      jaburu++
      break;
    case 1:
      console.log("Digitou o número um");
      jaburu++
      break;
    case 2:
      console.log("Digitou o número dois");
      jaburu++
      break;
    default:
    console.log("Digitou outro número qualquer");
  }
