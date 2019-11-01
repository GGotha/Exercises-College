algoritmo "semnome"
// Função :
// Autor :
// Data : 20/03/2019
// Seção de Declarações
var

salario: real

inicio
// Seção de Comandos


escreva("Digite seu salário bruto:")
leia(salario)

se (salario <= 1751.81) entao
   escreva("Seu salário liquido com 8% de alíquota será:", salario - (salario * 0.08))
senao
   se (salario >= 1751.82) e (salario <= 2919.72) entao
      escreva("Seu salário liquido com 9% de alíquota será:", salario - (salario * 0.09))
   senao
         escreva("Seu salário liquido com 11% de alíquota será:", salario - (salario * 0.11))

   fimse
fimse
fimalgoritmo
