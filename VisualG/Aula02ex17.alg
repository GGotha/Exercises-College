algoritmo "semnome"
// Função :
// Autor :
// Data : 13/03/2019
// Seção de Declarações 
var

qtdfitas: real
vlraluguel: real
ftranual: real
ftratraso: real
atraso: real
vlrcmulta: real
ftranuatra: real


inicio
// Seção de Comandos 


escreva("Digite a quantidade de fitas: ")
leia(qtdfitas)
escreva("Valor cobrado por cada aluguel: ")
leia(vlraluguel)

ftranual <- (((qtdfitas * vlraluguel) * 1/3) * 12)
escreval("Faturamente anual é: ", ftranual)

ftratraso <- ftranual * 0.1

escreval("Atraso de 10% é: ", ftratraso)

ftranuatra <- ftranual - ftratraso

escreval("Descontando é:", ftranuatra)


vlrcmulta <- ((qtdfitas * 1/10) - ftranuatra)
escreva("Lucro com multa das fitas é:", vlrcmulta)

fimalgoritmo
