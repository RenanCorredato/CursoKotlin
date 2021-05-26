package Aula8

class ContaPoupança(clientes: Clientes,
                    val taxaJuros:Double = 3.0):Contas(clientes){

    fun recolherJuros() {
        saldo *= taxaJuros
        println("Meu novo saldo é $saldo")
    }

    override fun sacar(valorSaque: Double) {
        saldo -= valorSaque

    }
}
