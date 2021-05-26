package Aula6

/*2) Escreva uma classe que receba como parâmetro uma idade, um sexo e os
anos de contribuição para a aposentadoria e desenvolva uma função que
imprime no console verdadeiro ou falso.
Lembrando que:
- A idade mínima para mulheres é de 60 anos;
- A idade mínima para homens é de 65 anos;
- Em ambos os casos as pessoas devem ter pelo menos 30 anos de contribuição.
 */

class Pessoa(val idade: Int, val sexo: Char, val anoDeContribuicao: Int) {
    fun verficarContribuicao() {
        if (idade >= 60 && sexo == 'F' && anoDeContribuicao == 30) {
            println("Parabéns, você pode se aposentar! ")
        } else if (idade >= 65 && sexo == 'M' && anoDeContribuicao == 35) {
            println("Parabéns, você pode se aposentar!")
        } else {
                println("Você não atendeu os requesitos")
        }
    }
}


fun main() {
    var joao = Pessoa(70,'M',35)
    var maisa = Pessoa(60,'F',30)
    var renan = Pessoa(64,'M',35)

    println(joao.verficarContribuicao())
    println(maisa.verficarContribuicao())
    println(renan.verficarContribuicao())

}