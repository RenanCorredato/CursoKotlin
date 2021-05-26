package Aula1

//Escrever o código que deve analisar três números inteiros e retornar o maior deles.
fun retornarMaior(num1: Int, num2: Int, num3: Int): String {
    var list = mutableListOf<Int>()

    list.add(num1)
    list.add(num2)
    list.add(num3)
    list.sort()
    return list.last().toString()

}

//Escrever o código que deve analisar duas cadeias de texto e, caso sejam.
//diferentes, retornar true, ou, caso sejam iguais, retornar false
fun compraTexto(texto1: String, texto2: String): Boolean {
    return texto1 == texto2
}

//Escrever o código que deve analisar um número inteiro e, caso ele seja par,
//retornar true, caso contrário, retorna false.
fun verificaPar(num: Int): Boolean {
    return num % 2 == 0
}

//Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares
fun primeirosInteiros() {
    for (i in 0..100 step 2) {
        println(i)
    }
}

fun verificaNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return if (numA > numC && numA > numD) {
        true
    } else numB > numC && numB > numD
}

fun primeirosCem() {
    for (i in 0..100) {
        println(i)
    }
}

fun main() {
    println("O maior numero é ${retornarMaior(1, 5, 9)}")
    println("Comparando textos ${compraTexto("Teste", "Teste")}")
    println(primeirosInteiros())
    println(verificaNumeros(1, 5, 8, 2))
    println(primeirosCem())

}