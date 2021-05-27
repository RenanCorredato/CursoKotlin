import Aula15.Exercicio1.*

fun main() {
    val foto = Foto("Renan", "Foto")
    val documento = Documentos("Carro","CNH")
    val contrato = Contrato("Apartamento", "Comprovante")
    val impressora = Impressora()

    impressora.inserirImprimivel(foto)
    impressora.inserirImprimivel(documento)
    impressora.inserirImprimivel(contrato)
    impressora.imprimirTodos()


}


