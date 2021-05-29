package Aula16.Exercicio1

fun main() {
    val loterriaSonhos = mapOf(
        0 to "Ovos",
        1 to "Agua",
        2 to "Ecopeta",
        3 to "Denstista",
        4 to "Foto",
    )
    println(loterriaSonhos)

    val apelidosMap = mapOf(
        "João" to listOf("Juan, Fissura, Maromba"),
        "Miguel" to listOf("Night Watch, Bruce Wayne, Tampinha"),
        "Maria" to listOf("Wonder Woman, Mary, Marilene"),
        "Lucas" to listOf("Lukinha, Jorge, George"),
    )
    apelidosMap.forEach { entry ->
        entry.value.forEach { apelido ->
            println("${entry.key} - $apelido")
        }
    }


}

