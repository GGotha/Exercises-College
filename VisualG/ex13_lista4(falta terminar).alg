algoritmo "semnome"
// Função :
// Autor :
// Data : 03/04/2019
// Seção de Declarações
var

turno: caractere
slrmin: real
categoria: caractere
nmtrab: real
salario: real

inicio
// Seção de Comandos

escreva("Digite seu salario minimo:")
leia(slrmin)
escreva("Digite seu turno:")
leia(turno)
escreva("Digite sua categoria:")
leia(categoria)
escreva("Digite suas horas trabalhadas:")
leia(slrmin)

escolha turno
caso "M"
   salario <- 0.10
caso "V"
   salario <- 0.15
caso "N"
   salario <- 0.12
fimescolha


escolha categoria
caso "O"
   se (slrmin >= 1000) entao
      slrmin <- slrmin * 0.07
   senao
      se (slrmin < 1000) entao
         slrmin <- slrmin * 0.05
      senao
      fimse
   fimse
caso "G"
   se (slrmin >= 2500) entao
      slrmin <- slrmin * 0.11
   senao
      se (slrmin < 2500) entao
         slrmin <- slrmin * 0.08
      senao
      fimse
   fimse
fimescolha

escreva("Salario é", slrmin)




fimalgoritmo
