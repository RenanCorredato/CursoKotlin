package Aula14

import kotlin.math.exp

fun main() {
    nomeEidadeComDefaultArguments(sobrenome = "Corredato", ultimoNome = "Cleber")
    var nomeCompleto = nomeEIdadeComRetorno("Renan", "Cleber")

    testeLambda {
        return@testeLambda "Teste função"
    }

    testeLambda2({
        return@testeLambda2 "Teste função"
    }, 2.0)
    val number: (Double) -> Double = { numeber ->
        2.0
    }
    println(number)
    val animais = listOf("Peixe", "Gato", "Cachorro")
    animais.forEach { animaimao ->
        println(animaimao)
    }
    val nome: String? = null

    val nullSafety = NullSafety(null)
    nullSafety.sobrenome
    nullSafety.nome

    val b: String? = null
    b?.length
    println(b)
    val c: String? = "1111"
    println(c?.length ?: 0)// if else nulo

    b?.length ?: run {
        val soma = 3 + 3
        print(soma)
    }


}


fun nomeEIdade(nome: String, idade: String) {

}

fun nomeEIdadeComRetorno(nome: String, idade: String): String {
    return "O nome é $nome e a idade é $idade"
}

fun nomeEidadeComDefaultArguments(
    nome: String = "Fulando",
    sobrenome: String,
    ultimoNome: String,
) {

}

fun testeLambda(xpto: () -> String) {
    println("A minha string da minha função anonima  e ${xpto()}")
}

fun testeLambda2(xpto: () -> String, number: Double) {
    println("A minha string da minha função anonima  e ${xpto()}")
}

class NullSafety(
    val nome: String?,
    val sobrenome: String = "Rodrigo",
)
