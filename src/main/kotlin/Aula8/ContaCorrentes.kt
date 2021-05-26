package Aula8

class ContaCorrentes(clientes: Clientes):Contas(clientes) {
    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito
    }

    fun depositarChque( valorCheque: Double,
                        bancoEmissor: String,
                        dataPagamento: String){
        saldo += valorCheque
    }

    override fun sacar(valorSaque: Double) {
        saldo -= valorSaque

    }
}