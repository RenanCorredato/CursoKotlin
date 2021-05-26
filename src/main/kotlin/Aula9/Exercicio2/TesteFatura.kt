package Aula9.Exercicio2

fun main() {
    val fatura1 = Fatura("Bolacha", "agua e sal",3,3.00)

    println("Item: ${fatura1.itemFaturado}\nQuantidade: ${fatura1.qtCompara}\nPreço Unitário: ${fatura1.precoUnitario}\nCompra no valor total de R$: ${fatura1.getTotalFatura()} ")
}