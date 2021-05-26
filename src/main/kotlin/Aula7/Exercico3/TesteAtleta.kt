package Aula7.Exercico3

fun main() {
    val atleta1 = Atleta("Renan", 90, 90)
    val atleta2 = Atleta("Cleber", 50, 60)

    val prova1 = Prova(10, 90)
    val prova2 = Prova(90, 10)
    val prova3 = Prova(5, 30)

    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta2))
    println(prova2.podeRealizar(atleta1))

}

/*Exercício 3: Atletas e prova
1. Definir uma nova classe Atleta contendo as seguintes propriedades:
- nome
- nível
- energia
2. Definir uma nova classe Prova contendo as seguintes propriedades:
- dificuldade
-energiaNecessaria
Lista de exercícios3. Criar, na classe Prova, a função podeRealizar, que tenha como parâmetro de
entrada um objeto do tipo
Atleta. A função deve retornar true caso o atleta possa realizar a prova e, caso
contrário, false. Um atleta pode realizar a prova se tiver um nível maior ou igual à
dificuldade da prova, além de energia suficiente.
4. Definir uma nova classe chamada Exercicio3 e criar uma função main. Dentro
da função main, criar dois atletas, configurando as propriedades necessárias, e
criar três provas para cada um, também com os atributos necessários. Depois,
verificar se os atletas podem realizar essas provas.

 */