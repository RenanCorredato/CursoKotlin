package Aula15.Exercicio1

class Contrato(override val nome: String,
               override val tipoDocumento: String):ImprimivelAula15 {

    override fun imprimir() {
        println("Sou um contrato muito legal - $nome - $tipoDocumento")
    }
}
