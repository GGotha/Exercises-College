algoritmo "semnome"
// Função :
// Autor :
// Data : 13/03/2019
// Seção de Declarações 
var
//
dianascimento: real
dianascimentototal: real
//
mesnascimento: real
mesnascimentototal: real
//
anonascimento: real
anonascimentototal: real
//
diaatual: real
diaatualtotal: real
//
mesatual: real
mesatualtotal: real
//
anoatual: real
anoatualtotal: real
//
inicio
// Seção de Comandos   .

escreva("Informe o dia do nascimento: ")
leia(dianascimento)

escreva("Informe o mes do nascimento: ")
leia(mesnascimento)

escreva("Informe o ano do nascimento: ")
leia(anonascimento)

escreva("Informe o dia atual: ")
leia(diaatual)

escreva("Informe o mes atual: ")
leia(mesatual)

escreva("Informe o ano atual: ")
leia(anoatual)

// NASCIMENTO
dianascimentototal <- diaatual  - dianascimento
mesnascimentototal <- diaatual + (30 / mesatual)
anonascimentototal <- anonascimento / 365


// ANO ATUAL

diaatualtotal <- diaatual * 30
mesatualtotal <- mesatual / 12
anoatualtotal <- anoatual / 365

escreval("dianascimentototal", dianascimentototal)

escreval("mesnascimentototal", mesnascimentototal)

escreval("anonascimentototal", anonascimentototal)

escreval("diaatualtotal", diaatualtotal)

escreval("mesatualtotal", mesatualtotal)

escreval("mesatualtotal", mesatualtotal)



fimalgoritmo
