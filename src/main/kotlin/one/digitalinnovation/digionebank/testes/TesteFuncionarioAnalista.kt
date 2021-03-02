package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("João da Silva","123.456.789-00", 2000.0)
    ImprimeRelatorioFuncionario.immprime(joao)
}