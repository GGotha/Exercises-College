Algoritmo "semnome"
// Disciplina  :  [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/02/2019
//   Crie um algoritmo que leia o valor de um dep�sito e o valor da taxa de juros. Calcular e imprimir o valor
// do rendimento e o valor total com o rendimento

Var
// Se��o de Declara��es das vari�veis
deposito: real
juros: real
rendimento: real



Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Digite seu deposito: ")
leia(deposito)
escreva("Escreva seu juros(ex: 8): ")
leia(juros)

rendimento <- (deposito * juros) / 100)
escreval("o rendimento �", rendimento)

escreva("valor total �:", deposito + rendimento)



Fimalgoritmo
