package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}