algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 20/03/2019
// Se��o de Declara��es
var

salario: real

inicio
// Se��o de Comandos


escreva("Digite seu sal�rio bruto:")
leia(salario)

se (salario <= 1751.81) entao
   escreva("Seu sal�rio liquido com 8% de al�quota ser�:", salario - (salario * 0.08))
senao
   se (salario >= 1751.82) e (salario <= 2919.72) entao
      escreva("Seu sal�rio liquido com 9% de al�quota ser�:", salario - (salario * 0.09))
   senao
         escreva("Seu sal�rio liquido com 11% de al�quota ser�:", salario - (salario * 0.11))

   fimse
fimse
fimalgoritmo
