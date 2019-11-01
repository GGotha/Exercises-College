algoritmo "semnome"
// Função :
// Autor :
// Data : 16/04/2019
// Seção de Declarações
var

idade: inteiro
sexo: caractere
sexomasc: inteiro
contador: inteiro
idademedia: real
idademaior: real


inicio
// Seção de Comandos

para contador de 1 ate 2 faca
   escreva("Digite sua Idade:")
   leia(idade)
   escreva("Digite seu sexo:")
   leia(sexo)

   idademedia <- idademedia + idade

   se (idade >= 18) entao
      idademaior <- idademaior + 1
   fimse

   se (sexo = "M") entao
      sexomasc <- sexomasc + 1
   fimse






fimpara
escreval("Turma Lotada")

escreval("Idademedia", idademedia / 2)
escreval("Canditato idade maior", idademaior)
escreval("Quantidade de homens", sexomasc)













fimalgoritmo
