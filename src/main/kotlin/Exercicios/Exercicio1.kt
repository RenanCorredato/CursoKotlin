package Exercicios

fun main() {
    try {
        var listaVaria = listOf<String>("Pato", "Cachorro", "Gato")
        println(listaVaria[3])


    } catch (erro1: ArrayIndexOutOfBoundsException) {
        println("Erro 1 ArrayIndexOutOfBoundsException Tratado")
    }


}
