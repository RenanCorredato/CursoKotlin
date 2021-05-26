package Aula7.Exercico2

class SessaoDeTreinamento(var experiencia: Int) {
    fun terinarA(jogador: JoagadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.fazerGol()
        jogador.experiencia += experiencia
        println("Experiência final:${jogador.experiencia}")
    }
}