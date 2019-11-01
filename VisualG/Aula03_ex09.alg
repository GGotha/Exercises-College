algoritmo "semnome"
// Função :
// Autor :
// Data : 20/03/2019
// Seção de Declarações
var
salario: real
reajuste: real


inicio
// Seção de Comandos

escreva("Digite seu salario:")
leia(salario)

se (salario < 500 ) entao
   escreva("Reajuste com 15%:", salario * 0.15)
senao
   se (salario >= 500) e (salario <= 1000) entao
      escreva("Reajuste com 10%:", salario * 0.10)
   senao
      escreva("Reajuste com 5%:", salario * 0.05)
   fimse
fimse





fimalgoritmo
