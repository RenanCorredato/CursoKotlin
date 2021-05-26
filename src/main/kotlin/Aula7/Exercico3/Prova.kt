package Aula7.Exercico3

class Prova(val dificuldade: Int,
            val energiaNecesaria: Int,
) {

    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecesaria

    }
}

