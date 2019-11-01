//variáveis

//forma mais antiga de declarar variávies
//evitar de usar essa forma
var nome = "Israel";
var idade = 48;
var manha = true;
var saldo = 455.99;

//exibindo no documento - evitar
document.write("Dados digitados: " + nome + "<br>");
document.write("Dados digitados: " + idade + "<br>");
document.write("Dados digitados: " + manha + "<br>");
document.write("Dados digitados: " + saldo + "<br>");

let n1 = 40;
let n2 = 20;
//exibir no console
console.log('Valor de N1 ' + n1);
console.log('Valor de N2 ' + n2);

const CPF = '132.196.666-66';
console.log('CPF: ' + CPF);
/*------------------------------------------------*/

//operadores matemáticos
let resultado = (n1 + n2);
console.log(n1 + " + " +  n2 + " = "+ resultado);

resultado = (n1 - n2);
console.log(n1 + " - " +  n2 + " = "+ resultado);

resultado = (n1 * n2);
console.log(n1 + " * " +  n2 + " = "+ resultado);

resultado = (n1 / n2);
console.log(n1 + " / " +  n2 + " = "+ resultado);

resultado = (n1 % n2);
console.log(n1 + " % " +  n2 + " = "+ resultado);

resultado = (n1 ** n2);
console.log(n1 + " ** " +  n2 + " = "+ resultado);

resultado = (Math.pow(n1,n2));
console.log(n1 + " ** " +  n2 + " = "+ resultado);

/*------------------------------------------------*/
//operadores relacionais

resultado = (n1 > n2);
console.log(n1 + " > " +  n2 + " = "+ resultado);

resultado = (n1 < n2);
console.log(n1 + " < " +  n2 + " = "+ resultado);

resultado = (n1 >= n2);
console.log(n1 + " >= " +  n2 + " = "+ resultado);

resultado = (n1 <= n2);
console.log(n1 + " <= " +  n2 + " = "+ resultado);

resultado = (n1 == n2);
console.log(n1 + " == " +  n2 + " = "+ resultado);

resultado = (n1 != n2);
console.log(n1 + " != " +  n2 + " = "+ resultado);


// verifica se conteúdo e tipos são iguais
n1 = 12;
n2 = '12';
resultado = (n1 === n2);
console.log(n1 + " === " +  n2 + " = "+ resultado);

//resultado = (n2*10);
//console.log(resultado);
/*------------------------------------------------*/
//operadores lógicos

n1 = 20;
n2 = 10;

//operador OU(||) para ser true - basta 1 ser true
resultado = ((n1 > n2) || (n2 > 15));
console.log(resultado);

//operador E(&&) para ser true - todos devem ser true
resultado = ((n1 > n2) && (n2 > 15));
console.log(resultado);

//operador Não(!) negar a expressão
resultado = (!((n1 > n2) && (n2 > 15)));
console.log(resultado);
