package Exercicios

fun main() {
    val listaNula:MutableList<String> = mutableListOf()
    listaNula?.add("Pato")
    listaNula?.add("Cachorro")
    listaNula?.add("Gato")

    try {
        println(listaNula[5])
    }catch ( erro2 : NullPointerException){
        println(erro2.stackTraceToString())
    }catch (err3:IndexOutOfBoundsException){
        println(err3.stackTraceToString())
    }
}