algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 27/02/2019
// Se��o de Declara��es 
//Elabore um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas
//por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 18% de comiss�o sobre suas vendas
//efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s
var
nome: caractere
salario: real
vendas: real
salariofinal: real
comissaofinal: real

inicio
// Se��o de Comandos 


escreva("Digite o seu nome:")
leia(nome)

escreva("Digite o seu sal�rio:")
leia(salario)

escreva("Digite seu n�mero de vendas efetuadas (em dinheiro)")
leia(vendas)

comissaofinal <- vendas * 0.18
escreval("Sua comiss�o �:", comissaofinal)

salariofinal <- salario + comissaofinal
escreva("Seu salario final �", salariofinal)



fimalgoritmo
