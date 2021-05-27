package Aula15.Exercicio1

class Foto(override val nome: String,
           override val tipoDocumento: String) : ImprimivelAula15 {

    override fun imprimir() {
        println("Eu sou uma selfie - $nome - $tipoDocumento")
    }
}
