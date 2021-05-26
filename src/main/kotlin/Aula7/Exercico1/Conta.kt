package Aula7.Exercico1

class Conta(
    val numConta: Int,
    var saldo: Double,
    var cliente: Cliente) {

    fun deposito(valorDepositio: Double) {
        saldo += valorDepositio
        println("Deposito R$:$valorDepositio seu novo saldo R$:$saldo")
    }

    fun saque(valorSaque: Double) {
        saldo -= valorSaque
        if (valorSaque > saldo) {
            println("Saldo insuficiente")
        } else {
            println("Saque realizada com sucesso R$:$valorSaque seu novo saldo R$:$saldo")
        }
    }
}

