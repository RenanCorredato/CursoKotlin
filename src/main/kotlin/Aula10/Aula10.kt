package Aula10

fun main() {

    val ferrariF50 = Ferrari()
    ferrariF50.acelerar()
    ferrariF50.monitorEstilizado()
}

abstract class Automovel {

    abstract val nome: String

    abstract fun acelerar()

    abstract fun frear()

    abstract fun monitorEstilizado()
}

class Ferrari: Automovel() {

    override var nome: String = "hsdds"

    var motor = "530v"
    var cor = "vermelha"

    override fun acelerar() {
        println("Uma ferrari acelerando")
    }

    override fun frear() {
        println("Uma ferrari freando")
    }

    override fun monitorEstilizado() {
        println("Monitor estilizado")
    }

    override fun equals(other: Any?): Boolean { // sobre escrever  e reserva compara algo com algo
       // return other is Ferrari

        val outraFerrari = other as? Ferrari
        when(other){
            is Ferrari ->{
                this.nome == outraFerrari?.nome
            }
            else ->{
                super.equals(other)
            }
        }
        return super.equals(other)
    }

    override fun toString(): String {
        return "O meu nome e $nome, eu tenho $motor cavalo de potência e minha cor é $cor"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}