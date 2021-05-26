package Aula9.Exercicio2

class Fatura( val itemFaturado: String,
              val descriçãoItem: String,
              val qtCompara: Int = 0,
              val precoUnitario: Double = 0.0 ) {

    fun getTotalFatura():Double{
        return qtCompara * precoUnitario.toDouble()
    }

}