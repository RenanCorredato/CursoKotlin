package Aula6

/*Escreva uma classe que receba uma lista de números e uma função que
imprime no console o produto ou seja o resultado de multiplicar todos os
elementos entre si.
Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7
 */

class Numeros(val listaNumeros:List<Int>){
    fun multiplicaItens(){
        var total = 1
        for (x in listaNumeros){
            total *= x
        }
        println(total)
    }
}

fun main() {
    val numero1 = Numeros (listOf(1,2,3))
    val numero2 = Numeros (listOf(1,4,8))
    val numero3 = Numeros (listOf(5,4,10,2))
    val numero4 = Numeros(listOf(2,4,2,2,4,3))

    println(numero1.multiplicaItens())
    println(numero2.multiplicaItens())
    println(numero3.multiplicaItens())
    println(numero4.multiplicaItens())
}