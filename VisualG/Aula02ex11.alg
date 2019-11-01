algoritmo "semnome"
// Função :
// Autor :
// Data : 12/03/2019
// Seção de Declarações 
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
// Seção de Comandos 

escreva("Numero de aulas semanais é: ")
leia(aulasem)
escreva("Digite o valor da hora-aula: ")
leia(vlraula)
salbase <- (vlraula * aulasem * 4.5)
escreval("O salario base é de:", salbase)
horativ <- (salbase * 0.05)
escreval("Hora atividade é: ", horativ)
remun <- (salbase + horativ)
descsem <- (remun * 0.1666666666666667)
escreval("Descanso semanal é: ", descsem)
salmensal <- salbase + horativ + descsem

escreva("Salario mensal é: ", salmensal)



fimalgoritmo
