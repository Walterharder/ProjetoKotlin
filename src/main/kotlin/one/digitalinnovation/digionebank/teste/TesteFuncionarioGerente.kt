package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val brenno = Gerente(nome = "Brenno dos Anjos", cpf = "123456789", 5000.0, senha = "senha12 3")
    imprimeRelatorioFuncionario.imprime(brenno)

    TesteAutenticacao().autentica(brenno)
}
