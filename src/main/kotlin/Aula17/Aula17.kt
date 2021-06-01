package Aula17

fun main() {
    try {
        val teste = 2 / 1
        val teste1: String? = null
        teste1?.length
        val teste2 = listOf(1.2, 4)

        val item3 = teste2.getOrNull(3)
        println(item3)

    } catch (erro1: ArithmeticException) {
        println("Not a number")
    } catch (erro2: NullPointerException) {
        println("Varialvel nula")
    } catch (e: Exception) {
        println("Classe mae de exception")

    }
}
