algoritmo "semnome"
// Função :
// Autor :
// Data : 12/03/2019
// Seção de Declarações 
var
precproduto: real
qtdproduto: real
nmproduto: caractere
desconto: real
vlrtotal: real


inicio
// Seção de Comandos 

escreva("Informe o nome do produto: ")
leia(nmproduto)
escreva("Informe a quantidade do produto: ")
leia(qtdproduto)
escreva("Informe o preço do produto: ")
leia(precproduto)

vlrtotal <- qtdproduto * precproduto
escreval("O valor total do pedido é:", vlrtotal)

escreva("A vista com 5% do desconto é retirado", vlrtotal * 0.05, " do seu produto")



fimalgoritmo
