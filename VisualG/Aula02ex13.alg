algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 12/03/2019
// Se��o de Declara��es 
var
precproduto: real
qtdproduto: real
nmproduto: caractere
desconto: real
vlrtotal: real


inicio
// Se��o de Comandos 

escreva("Informe o nome do produto: ")
leia(nmproduto)
escreva("Informe a quantidade do produto: ")
leia(qtdproduto)
escreva("Informe o pre�o do produto: ")
leia(precproduto)

vlrtotal <- qtdproduto * precproduto
escreval("O valor total do pedido �:", vlrtotal)

escreva("A vista com 5% do desconto � retirado", vlrtotal * 0.05, " do seu produto")



fimalgoritmo
