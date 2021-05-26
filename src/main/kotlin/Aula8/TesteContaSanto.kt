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