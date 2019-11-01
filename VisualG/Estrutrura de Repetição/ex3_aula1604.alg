algoritmo "semnome"
// Função :
// Autor :
// Data : 16/04/2019
// Seção de Declarações
var

nome: caractere
preco: real
qtd: inteiro
contador: inteiro
subtotal: real
totalgeral: real


inicio
// Seção de Comandos

para contador de 1 ate 2 faca
   escreval(contador, "º produto")
   escreva("Escreva o nome do produto: ")
   leia(nome)

   escreva("Escreva o preco do produto: ")
   leia(preco)

   escreva("Escreva a quantidade do produto: ")
   leia(qtd)

   subtotal <- preco * qtd
   escreval("O subtotal é:", subtotal)

   totalgeral <- totalgeral + subtotal


fimpara

se (totalgeral > 100) entao
   escreva("Total geral:", totalgeral * 0.9)
senao
   escreva("Total geral:", totalgeral)



fimse






fimalgoritmo
