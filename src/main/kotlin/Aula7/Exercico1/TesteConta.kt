package Aula7.Exercico1

fun main() {

    val cliente1 = Cliente("Renan", "Corredato")
    val cliente2 = Cliente("Cleber", "Lopes")

    val conta1 = Conta(123, 100.00, cliente1)
    val conta2 = Conta(456, 200.00, cliente2)

    println("Saldo conta R$:${conta1.saldo}")
    println(conta1.deposito(100.00))
    println(conta1.saque(50.00))

    println("Saldo conta R$:${conta2.saldo}")
    println(conta2.deposito(120.00))
    println(conta2.saque(500.00))


}

/*Exercício 1: Clientes e contas
1. Definir uma nova classe Cliente contendo as seguintes propriedades:
- nome
- sobrenome
2. Definir uma nova classe Conta contendo as seguintes propriedades:
- número da conta
- saldo
- titular (o titular é um objeto do tipo Cliente).
3. Criar uma função chamado depósito que tenha como parâmetro de entrada
quantia em dinheiro. Como estamos fazendo um depósito, a quantia de dinheiro é
somada ao saldo. A função deve imprimir na tela o tipo de transação realizada e o
novo saldo.
4. Criar uma função chamado saque que tenha como parâmetro de entrada
quantia em dinheiro. Como estamos fazendo um saque, a quantia é subtraída do
saldo. Caso o valor do saque a realizar seja maior que o saldo disponível, imprimir
na tela: “Saldo insuficiente”. Caso contrário, a função deve imprimir na tela o tipo
de transação realizada e o novo saldo.Lista de exercícios
5. Definir uma nova classe chamada Exercicio1 e criar uma função main. Dentro da
função main, criar dois clientes, passando nome e sobrenome, e criar uma conta
para cada um, inicializando número da conta, saldo e titular. Em seguida, fazer um
depósito e um saque em cada conta.

 */
