algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 12/03/2019
// Se��o de Declara��es 
var
aulasem: real
vlraula: real
salprof: real
salbase: real
horativ: real
horativfinal: real
descsem: real
remun: real
salmensal: real


inicio
// Se��o de Comandos 

escreva("Numero de aulas semanais �: ")
leia(aulasem)
escreva("Digite o valor da hora-aula: ")
leia(vlraula)
salbase <- (vlraula * aulasem * 4.5)
escreval("O salario base � de:", salbase)
horativ <- (salbase * 0.05)
escreval("Hora atividade �: ", horativ)
remun <- (salbase + horativ)
descsem <- (remun * 0.1666666666666667)
escreval("Descanso semanal �: ", descsem)
salmensal <- salbase + horativ + descsem

escreva("Salario mensal �: ", salmensal)



fimalgoritmo
