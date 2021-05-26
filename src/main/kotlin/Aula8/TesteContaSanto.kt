package Aula8

fun main() {
    val renan = Clientes(125,"Corredato",356484,3596)
    val maisa = Clientes(455,"Lopes",54798,547932)

    val contaPan = ContaCorrentes(maisa)
    contaPan.consultar()
    contaPan.depositar(120.0)
    contaPan.depositar(520.0)
    contaPan.consultar()



    val contaItau = ContaPoupança(renan)
    contaItau.depositar(300.0)
    contaItau.recolherJuros()
    contaItau.sacar(50.0)
    contaItau.consultar()

}