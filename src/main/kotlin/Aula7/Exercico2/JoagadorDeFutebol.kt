package Aula7.Exercico2

class JoagadorDeFutebol(val nome: String,
                        var energia: Int,
                        var alegria: Int,
                        var gols: Int,
                        var experiencia: Int) {

    fun fazerGol() {
        energia -= 5
        alegria -= 10
        gols += 1
        println("GOOOOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Corri muito CANSEI, minha energia é ${energia}%")
    }
}