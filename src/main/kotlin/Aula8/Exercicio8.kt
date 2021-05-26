package Aula8

fun main() {
    val cesar = Cliente(1234, "Rodrigues", "23123", 2343242)
    val contaPoupancaCaixa = ContaPoupanca(cliente = cesar)
    contaPoupancaCaixa.deposito(200.0)
    contaPoupancaCaixa.recolherJuros()

    val contaCorrentItau = ContaCorrente(cliente = cesar)
    contaCorrentItau.sacar()
}

class Cliente(
    numeroCliente: Int,
    sobrenome: String,
    rg: String,
    cpf: Int
)

open class Conta(cliente: Cliente, ) {

    var saldo: Double = 0.0

    fun deposito(valor: Double) {
        saldo += valor
        println("O novo saldo é $saldo")
    }

    open fun sacar() {
        //fazer saque
    }

    fun consultarSaldo() {
        //consultar saldo
    }
}

class ContaPoupanca(cliente: Cliente, var taxaJuros: Double = 3.5): Conta(cliente = cliente) {

    fun recolherJuros() {
        val juros = saldo * (taxaJuros / 100)
        saldo += juros
        println("Meu novo saldo é $saldo")
    }
}

class ContaCorrente(cliente: Cliente): Conta(cliente = cliente) {

    fun depositarCheque() {
        //depositar um novo cheque
    }

    override fun sacar() {
        //sacar conta corrente
    }
}

/*Exercício - Banco Santander
O Banco Santander solicita a modelagem de um novo sistema. Esse sistema será
usado para registrar as contas e os clientes do banco.
Clientes: os clientes serão identificados por um número de cliente, um
sobrenome, um número de RG e um CPF.
Contas: as contas do banco permitem fazer depósitos, sacar dinheiro e consultar
o saldo. Cada conta está associada a um cliente.
Extensão:
Conta poupança: além do saldo, as contas poupança têm uma taxa de juros.
Neste tipo de conta, é possível realizar três operações:
○ Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que
quiser.
○ Sacar dinheiro: o cliente pode sacar dinheiro desde que não supere seu
saldo.
○ Recolher juros: o cliente pode recolher os juros mensais aplicados pela sua
conta poupança.
Conta corrente: além do saldo, as contas correntes têm um limite autorizado de
cheque especial. Neste tipo de conta, é possível realizar três operações:
○ Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que
quiser.
○ Depositar cheques: o cliente pode depositar cheques. Um cheque tem um
valor, um banco emissor e uma data de pagamento.Exercício - Banco Santander
○ Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo
suficiente, usar seu cheque especial.
Este exercício já é familiar pois na aula de Orientação a Objetos desenvolvemos o
UML deste exercício. Agora com base no UML desenvolvido anteriormente
implemente todo o diagrama em Java contendo todos os atributos e métodos
das classes de acordo com o que pede o enunciado

 */