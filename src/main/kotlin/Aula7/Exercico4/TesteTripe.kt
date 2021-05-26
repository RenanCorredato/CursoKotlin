package Aula7.Exercico4

fun main() {
    var tripe1 = Tripe(false, 0, 10, 5)
    println(tripe1.prontoParaGuardar())
    println(tripe1.prontoParaUsar())
    tripe1.desdobrar()
    tripe1.dobrar()
    tripe1.usar()
    tripe1.guardar()
    tripe1.definirAltura(20)
    println(tripe1.alturaAtual)
}

/*Exercício 4: Tripé
O tripé é um aparelho de três pés, com a parte superior circular ou triangular, que
permite estabilizar uma câmera e evitar os movimentos dela. Queremos modelar
o comportamento desse objeto.
1. Definir uma classe Tripé contendo as seguintes propriedades:
- Dobrado: indica o estado atual do tripé (dobrado ou não)
- alturaMinima
- alturaMaxima
- alturaAtual.
2. Definir a função definirAltura(novaAltura: Int), que receba uma altura e
modifique o valor da altura atual.
Lista de exercícios
3. Definir a função dobrar(), que permita dobrar o tripé.4. Definir a função desdobrar(), que permita desdobrar o tripé.
5. Definir a função guardar(), que permita deixar o tripé pronto para guardar. Ou
seja, ele deve estar dobrado e a altura atual deve ser a menor possível.
6. Definir a função prontoParaGuardar(), que permita verificar se o tripé está
pronto para ser guardado. Ou seja, ele deve estar dobrado e com a mínima altura
atual.
7. Definir a função usar(), que permita usar o tripé. Um tripé está pronto para usar
quando está desdobrado e com altura superior à metade da altura máxima.
8. Definir a função prontoParaUsar(), que permita verificar se o tripé está pronto
para ser usado. Ou seja, ele deve estar desdobrado e com altura superior à
metade da altura máxima.
9. Definir uma nova classe chamada Exercicio4 e criar uma função main. Dentro
da função main, criar um tripé e fazer testes com as funções definidas
anteriormente
 */