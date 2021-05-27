package Aula9.Exercicio2

fun main() {
    val fatura1 = Fatura("Bolacha", "agua e sal",3,3.00)

    println("Item: ${fatura1.itemFaturado}\nQuantidade: ${fatura1.qtCompara}\nPreço Unitário: ${fatura1.precoUnitario}\nCompra no valor total de R$: ${fatura1.getTotalFatura()} ")
}


/*Crie uma classe chamada Fatura que possa ser utilizado por uma loja de
suprimentos de informática para representar uma fatura de itens vendidos na loja.
Uma fatura deve incluir as seguintes informações como atributos:
● Uma lista de itens cada Item possui:
• o número do item faturado;
• a descrição do item;
• a quantidade comprada do item
• o preço unitário do item.
Sua classe Item deve conter um construtor que inicialize os quatro atributos. Se a
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não
for positivo ele deve ser configurado como 0.0.
Além disso, na classe Fatura um método chamado getTotalFatura que calcula o valor da
fatura (isso é, multiplicar a quantidade pelo preço de cada item) e depois retorna o valor
como um double.
Escreva uma classe Main de teste que demonstra as capacidades da classe Fatura

 */