package Aula7.Exercico4

class Tripe(var dobrado: Boolean,
            val alturaMinima: Int,
            val alturaMaxima: Int,
            var alturaAtual: Int,
) {

    fun definirAltura(novaAlura: Int) {
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun guardar() {
        dobrar()
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar() {
        dobrado && alturaAtual == alturaMinima
    }

    fun usar() {
        desdobrar()
        alturaAtual = alturaMinima / 2
    }

    fun prontoParaUsar(): Boolean {
        return !dobrado && (alturaAtual >= alturaMaxima / 2)
    }
}