algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 16/04/2019
// Se��o de Declara��es
var

nome: caractere
preco: real
qtd: inteiro
contador: inteiro
subtotal: real
totalgeral: real


inicio
// Se��o de Comandos

para contador de 1 ate 2 faca
   escreval(contador, "� produto")
   escreva("Escreva o nome do produto: ")
   leia(nome)

   escreva("Escreva o preco do produto: ")
   leia(preco)

   escreva("Escreva a quantidade do produto: ")
   leia(qtd)

   subtotal <- preco * qtd
   escreval("O subtotal �:", subtotal)

   totalgeral <- totalgeral + subtotal


fimpara

se (totalgeral > 100) entao
   escreva("Total geral:", totalgeral * 0.9)
senao
   escreva("Total geral:", totalgeral)



fimse






fimalgoritmo
