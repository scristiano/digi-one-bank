package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria do Carmo",cpf = "123.456.789-00", senha = "senha123", salario = 5000.0)

    ImprimeRelatorioFuncionario.immprime(maria)

    TesteAutenticacao().autentica(maria)
}




