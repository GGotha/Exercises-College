algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 23/04/2019
// Se��o de Declara��es
var
idade: inteiro
op: caractere
contador, conta, contb, contc, contd, conte: inteiro
contatotal, contbtotal, contctotal, contdtotal, contetotal: real
somaidade: real
mediaidade: real


inicio
// Se��o de Comandos


contador <- 0





escreva("Digite sua idade:")
leia(idade)


enquanto (contador >= 0) e (idade > 0) faca


   escreva("D� sua opiniao:")
   leia(op)

   escolha op
   caso "A"
      conta <- conta + 1
      escreval("�timo")
   caso "B"
      contb <- contb + 1
      escreval("Bom")
   caso "C"
      contc <- contc + 1
      escreval("Regular")
   caso "D"
      contd <- contd + 1
      escreval("Ruim")
   caso "E"
      conte <- conte + 1
      escreval("Pessimo")
   fimescolha


   contador <- contador + 1

   escreva("Digite sua idade:")
   leia(idade)
   somaidade <- (somaidade + idade)

fimenquanto


escreval("�timo:", (conta / contador) * 100, "%")
escreval("Bom:", (contb / contador) * 100, "%")
escreval("Regular:", (contc / contador) * 100, "%")
escreval("ruim:", (contd / contador) * 100, "%")
escreval("Pessimo:", (conte / contador) * 100, "%")


escreval(contador, " quantidade(s) de pessoas")

mediaidade <- (somaidade / contador)

escreva("media idade", mediaidade)










fimalgoritmo
