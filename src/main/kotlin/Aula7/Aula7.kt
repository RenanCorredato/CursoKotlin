package Aula7

import Aula7.Exercico1.Cliente

fun main() {
    //val cesar = Cliente("Cesar", "Rodrigues")
    //val cesarItau = Conta(1234, 0.0, cesar)
}

class Conta1(
    val numero: Int,
    var saldo: Double,
    val titular: Cliente
)

class Cliente1(
    val nome: String,
    val sobrenome: String
)