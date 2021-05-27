package Aula15.Exercicio1

class Impressora(val listaimprimivel: MutableList<ImprimivelAula15> = mutableListOf()) {
    fun imprimirTodos(){
        listaimprimivel.forEach{
            it.imprimir()
        }
    }
}

fun Impressora.inserirImprimivel(imprimivelAula15: ImprimivelAula15) =
    this.listaimprimivel.add(imprimivelAula15)

