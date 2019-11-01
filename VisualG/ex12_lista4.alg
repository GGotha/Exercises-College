algoritmo "semnome"
// Função :
// Autor :
// Data : 03/04/2019
// Seção de Declarações
var
codigoPro, codigoPais: inteiro
pesoQ, pesoG: real
preco: real
imposto: real
precototal: real
vlrfinal: real
vlrimp: real



inicio
// Seção de Comandos

escreva("Digite codigo produto: ")
leia(codigoPro)
escreva("Digite Peso Quilos: ")
leia(pesoQ)
escreva("Digite codigo pais: ")
leia(codigoPais)

pesoG <- pesoQ * 1000

escolha codigoPro
caso 1 ate 4
   preco <- 15
caso 5 ate 7
   preco <- 25
caso 8 ate 10
   preco <- 35
fimescolha

escolha codigoPais
caso 1
   imposto <- 0
caso 2
   imposto <- 0.15
caso 3
   imposto <- 0.25
fimescolha

precototal <- preco * pesog
escreval("o preco total é:", precototal)

vlrimp <- precototal * imposto
escreval("O valor imp é:", vlrimp)

vlrfinal <- precototal + vlrimp
escreval("O valor final é:", vlrfinal)



fimalgoritmo
