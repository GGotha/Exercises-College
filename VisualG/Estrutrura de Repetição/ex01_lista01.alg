algoritmo "semnome"
// Função :
// Autor :
// Data : 17/04/2019
// Seção de Declarações
var

contador, idade: inteiro
faixa, faixa1, faixa2, faixa3, faixa4, faixa5, pessoastotal: inteiro
porcentagem: real

inicio
// Seção de Comandos


repita



   escreva("Digite sua idade:")
   leia(idade)

   se (idade <= 15) entao
      escreval("Até 15")
      faixa <- faixa + 1
   senao
      se (idade >= 16) e (idade <= 30) entao
         escreval("16 a 30")
         faixa2 <- faixa2 + 1
      senao
         se (idade >= 31) e (idade <= 45) entao
            escreval("31 a 45")
            faixa3 <- faixa3 + 1
         senao
            se (idade >= 46) e (idade <= 60) entao
               escreval("46 a 60")
               faixa4 <- faixa4 + 1
            senao
               escreval("Acima de 61")
               faixa5 <- faixa5 + 1
            fimse
         fimse
      fimse
   fimse

   contador <- contador + 1

ate(contador = 20)

escreval("------------------------------------------")
escreval("Quantidades de pessoas na faixa 1:", faixa)
escreval("Quantidades de pessoas na faixa 2:", faixa2)
escreval("Quantidades de pessoas na faixa 3:", faixa3)
escreval("Quantidades de pessoas na faixa 4:", faixa4)
escreval("Quantidades de pessoas na faixa 5:", faixa5)
escreval("------------------------------------------")

pessoastotal <- faixa + faixa2 + faixa3 + faixa4 + faixa5
porcentagem <- (faixa / pessoastotal) * 100

escreval("Pessoas total", pessoastotal)
escreval("Porcentagem de pessoas na faixa 1", porcentagem, "%")





fimalgoritmo
