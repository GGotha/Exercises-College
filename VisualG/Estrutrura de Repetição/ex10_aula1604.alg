algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 17/04/2019
// Se��o de Declara��es
var

numero: inteiro
chute: inteiro
contador: inteiro


inicio
// Se��o de Comandos

contador <- -1

escreva("Informe um numero:")
leia(numero)
limpatela

repita




   escreva("Informe o chute:")
   leia(chute)

   se (chute > numero) entao
      escreval("Chutou alto")
   senao
      se (chute < numero) entao
         escreval("Chutou baixo")
      fimse
   fimse

   contador <- contador + 1


ate (numero = chute)

escreval("Acertou")
escreval("Quantidade de tentativas: ", contador)


fimalgoritmo
