package Aula7.Exercico2

fun main() {
    var joagador1 = JoagadorDeFutebol("Renan", 100, 100, 20, 70)
    var sessaoDeTreinamento = SessaoDeTreinamento(10)
    var treinamentoA = sessaoDeTreinamento.terinarA(joagador1)

    println(treinamentoA)
}

/*Exercício 2: Jogadores e treinamento
1. Definir uma nova classe JogadorDeFutebol contendo as seguintes
propriedades:
- nome
- energia
- alegria
- gols
- experiência
2. Criar uma função chamado fazerGol em jogador, que tire 5 pontos de energia e
dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1. O
método deve imprimir “GOOOOL!” na tela.
3. Criar uma função chamado correr em jogador, que tire 10 pontos de energia
dele. O método deve imprimir na tela: “Cansei”.
4. Definir uma nova classe SessaoDeTreinamento contendo as seguintes
propriedades:
- experiência (ganha quando um treinamento é realizado)
Lista de exercícios5. Criar uma função chamado treinarA que tenha como parâmetro de entrada um
jogador de futebol. Como é um treinamento, o jogador precisa:
- Correr
- Fazer um Gol
- Correr
Depois que o jogador fizer essas três coisas, a experiência dele deve aumentar,
somando um ponto na experiência. A função deve imprimir a experiência inicial e
a experiência final do jogador.
6. Definir uma nova classe chamada Exercicio2 e criar uma função main. Dentro
da função main, criar dois jogadores de futebol, configurando as propriedades
necessárias, e criar uma sessão de treinamento, também com as propriedades
necessárias. Os dois jogadores devem realizar um treinamento.

 */

