package Aula13.ExercicioRevisao

abstract class ContaBancaria {

    abstract  val mumeroConta:Int
    abstract  val saldo:Int

    abstract fun sacar():Double
    abstract fun depositar():Double
}