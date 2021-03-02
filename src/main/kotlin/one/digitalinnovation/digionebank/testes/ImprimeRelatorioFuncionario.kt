package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun immprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}