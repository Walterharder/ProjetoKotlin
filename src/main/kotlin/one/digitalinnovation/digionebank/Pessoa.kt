package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mateus"
    var cpf: String = "432.724.038-92"
}

fun main(){
    val name = Pessoa()

    println(name.nome)
    println(name.cpf)

}