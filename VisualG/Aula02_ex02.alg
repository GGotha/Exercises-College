algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações 
//Elabore um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 18% de comissão sobre suas vendas
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês
var
nome: caractere
salario: real
vendas: real
salariofinal: real
comissaofinal: real

inicio
// Seção de Comandos 


escreva("Digite o seu nome:")
leia(nome)

escreva("Digite o seu salário:")
leia(salario)

escreva("Digite seu número de vendas efetuadas (em dinheiro)")
leia(vendas)

comissaofinal <- vendas * 0.18
escreval("Sua comissão é:", comissaofinal)

salariofinal <- salario + comissaofinal
escreva("Seu salario final é", salariofinal)



fimalgoritmo
