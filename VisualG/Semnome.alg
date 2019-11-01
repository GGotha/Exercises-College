algoritmo "semnome"
// Função :
// Autor :
// Data : 09/04/2019
// Seção de Declarações
var

nome: caractere

categoria: caractere

opcao: real

nmdiarias: real
vlrdiaria: real
vlrimposto: real
vlrestadia: real
taxaservico: real

desconto: real

valortotal: real


valorfinal: real

inicio
// Seção de Comandos

escreva("Digite o nome do hóspede:")
leia(nome)

escreval("CATEGORIAS")
escreval("SU - Superior")
escreval("LX - Luxo")
escreval("LP - Luxo Premier")
escreval("SE - Suite")

escreva("Digite a categoria desejada:")
leia(categoria)

escreval("OPÇÃO")
escreval("1 - Individual")
escreval("2 - Casal")

escolha categoria
caso "SU"
   escreval("Você entrou na categoria SU")
caso "LX"
   escreval("Você entrou na categoria LX")
caso "LP"
   escreval("Você entrou na categoria LP")
caso "SE"
   escreval("Você entrou na categoria SE")
fimescolha

escreva("Digite a opção desejada:")
leia(opcao)

escreva("Digite o numero de diarias:")
leia(nmdiarias)


se (categoria = "SU") e (opcao = 1) ou (nmdiarias < 5)  entao
   vlrdiaria <- nmdiarias * 650.00
   vlrimposto <- vlrdiaria * 0.1
   vlrestadia <- vlrdiaria + vlrimposto
   escreva("Categoria SU opcao 1, o valor da diária será", vlrdiaria)
   escreval("O valor do imposto é:", vlrimposto)
   escreval("O valor da estadia é:", vlrestadia)
   taxaservico <- nmdiarias * 20.00
   escreval("A taxa de serviço é:", taxaservico)
   valortotal <- vlrestadia + taxaservico
   escreval("O valor total é", valortotal)
senao
   se (categoria = "SU") e (opcao = 2) ou (nmdiarias >= 5) entao
      vlrdiaria <- nmdiarias * 780.00
      vlrimposto <- vlrdiaria * 0.1
      vlrestadia <- vlrdiaria + vlrimposto
      escreval("Categoria SU opcao 2, o valor da diária será", vlrdiaria)
      escreval("O valor do imposto é:", vlrimposto)
      escreval("O valor da estadia é:", vlrestadia)
      taxaservico <- nmdiarias * 22.50
      escreval("A taxa de serviço é:", taxaservico)
      valortotal <- vlrestadia + taxaservico
      escreval("O valor total é", valortotal)

   senao

      se (categoria = "LX") e (opcao = 1) ou (nmdiarias < 6)  entao
         vlrdiaria <- nmdiarias * 580.00
         vlrimposto <- vlrdiaria * 0.15
         vlrestadia <- vlrdiaria + vlrimposto
         escreval("Categoria LX opcao 1, o valor da diária será", vlrdiaria)
         escreval("O valor do imposto é:", vlrimposto)
         escreval("O valor da estadia é:", vlrestadia)
         taxaservico <- nmdiarias * 20.00
         escreval("A taxa de serviço é:", taxaservico)
         valortotal <- vlrestadia + taxaservico
         escreval("O valor total é", valortotal)
      senao
         se (categoria = "LX") e (opcao = 2)  ou (nmdiarias >= 6)  entao
            vlrdiaria <- nmdiarias * 790.00
            vlrimposto <- vlrdiaria * 0.15
            vlrestadia <- vlrdiaria + vlrimposto
            escreval("Categoria LX opcao 2, o valor da diária será", vlrdiaria)
            escreval("O valor do imposto é:", vlrimposto)
            escreval("O valor da estadia é:", vlrestadia)
            taxaservico <- nmdiarias * 20.00
            escreval("A taxa de serviço é:", taxaservico)
            valortotal <- vlrestadia + taxaservico
            escreval("O valor total é", valortotal)
         senao

            se (categoria = "LP") e (opcao = 1) ou (nmdiarias < 5)  entao
               vlrdiaria <- nmdiarias * 920.00
               vlrimposto <- vlrdiaria * 0.18
               vlrestadia <- vlrdiaria + vlrimposto
               escreval("Categoria LP opcao 1, o valor da diária será", vlrdiaria)
               escreval("O valor do imposto é:", vlrimposto)
               escreval("O valor da estadia é:", vlrestadia)
               taxaservico <- nmdiarias * 20.00
               escreval("A taxa de serviço é:", taxaservico)
               valortotal <- vlrestadia + taxaservico
               escreval("O valor total é", valortotal)
            senao
               se (categoria = "LP") e (opcao = 2) ou (nmdiarias >= 5)  entao
                  vlrdiaria <- nmdiarias * 1080.00
                  vlrimposto <- vlrdiaria * 0.18
                  vlrestadia <- vlrdiaria + vlrimposto
                  escreval("Categoria LP opcao 2, o valor da diária será", vlrdiaria)
                  escreval("O valor do imposto é:", vlrimposto)
                  escreval("O valor da estadia é:", vlrestadia)
                  taxaservico <- nmdiarias * 20.00
                  escreva("A taxa de serviço é:", taxaservico)
                  valortotal <- vlrestadia + taxaservico
                  escreval("O valor total é", valortotal)
               senao
                  se (categoria = "SE") e (opcao = 1) ou (nmdiarias < 7)  entao
                     vlrdiaria <- nmdiarias * 1220.00
                     vlrimposto <- vlrdiaria * 0.20
                     vlrestadia <- vlrdiaria + vlrimposto
                     escreval("Categoria SE opcao 1, o valor da diária será", vlrdiaria)
                     escreval("O valor do imposto é:", vlrimposto)
                     escreval("O valor da estadia é:", vlrestadia)
                     taxaservico <- nmdiarias * 20.00
                     escreval("A taxa de serviço é:", taxaservico)
                     valortotal <- vlrestadia + taxaservico
                     escreval("O valor total é", valortotal)
                  senao
                     se (categoria = "SE") e (opcao = 2) ou (nmdiarias >= 7)  entao
                        vlrdiaria <- nmdiarias * 1220.00
                        vlrimposto <- vlrdiaria * 0.20
                        vlrestadia <- vlrdiaria + vlrimposto
                        escreval("Categoria SE opcao 2, o valor da diária será", vlrdiaria)
                        escreval("O valor do imposto é:", vlrimposto)
                        escreval("O valor da estadia é:", vlrestadia)
                        taxaservico <- nmdiarias * 20.00
                        escreval("A taxa de serviço é:", taxaservico)
                        valortotal <- vlrestadia + taxaservico
                        escreval("O valor total é", valortotal)
                     senao
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimse




se (nmdiarias < 5) entao
   desconto <- valortotal * 0
   escreval("Você terá um desconto de 0%", desconto)
senao
   se (nmdiarias >= 5) e (nmdiarias <= 7) entao
      desconto <- valortotal * 0.07
      escreval("Você terá um desconto de 7%", desconto)
   senao
      se (nmdiarias > 8) entao
         desconto <- valortotal * 0.08
         escreval("Você terá um desconto de 8%", desconto)
      senao
      fimse
   fimse
fimse


se (categoria = "LX") e (nmdiarias > 8) entao
   escreval("Na próxima hospedagem você terá uma diária grátis")
senao
   se (categoria = "LP") e (nmdiarias > 8) entao
      escreval("Na próxima hospedagem você terá uma diária grátis")
   fimse
fimse

escreva("O valor final é:", valortotal - desconto)


fimalgoritmo
