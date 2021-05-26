package Aula8

open class Contas(clientes: Clientes) {
    var saldo: Double = 0.0

    open fun depositar (valorDeposito: Double){
        saldo =+ valorDeposito
        println("O novo saldo é $saldo")
    }

   open fun sacar (valorSaque: Double){
       saldo =- valorSaque
       println("O novo saldo é $saldo")
    }

    open fun consultar (){
        println("O novo saldo é $saldo")
    }
}
