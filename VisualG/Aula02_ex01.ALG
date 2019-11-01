Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/02/2019
//   Crie um algoritmo que leia o valor de um depósito e o valor da taxa de juros. Calcular e imprimir o valor
// do rendimento e o valor total com o rendimento

Var
// Seção de Declarações das variáveis
deposito: real
juros: real
rendimento: real



Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite seu deposito: ")
leia(deposito)
escreva("Escreva seu juros(ex: 8): ")
leia(juros)

rendimento <- (deposito * juros) / 100)
escreval("o rendimento é", rendimento)

escreva("valor total é:", deposito + rendimento)



Fimalgoritmo
