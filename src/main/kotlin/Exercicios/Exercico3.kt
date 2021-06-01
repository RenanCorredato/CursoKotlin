package Exercicios

fun main() {
    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4,0)
    }catch (erro1 :ArithmeticException){
        println(erro1.message)
    }
}
class CalculoMatematico{
    fun divisao(x: Int, y: Int): Int{
        return if (y==0){
            throw ArithmeticException("Divisão por zero")
        }else{
            x / y
        }
    }
}