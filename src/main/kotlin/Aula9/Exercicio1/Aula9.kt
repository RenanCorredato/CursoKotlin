package Aula9.Exercicio1/*package Aula9

fun main() {
    val professor = Professor("Cesar Rodrigues", "1234")

    val materiaKotlin = Materia("Aula de Kotlin")
    val aulaKotlin = Aula(materiaKotlin, "19:30", "21:45")

    val materiaAndroid = Materia("Aula de Android")
    val aulaAndroid = Aula(materiaAndroid, "19:30", "21:45")

    val luci = Alunos("1234", "Luci", "Pereira")
    val gabi = Alunos("4321", "Gabi", "Nascimento")

    val curso = Curso(
        "Curso de Android 10/10",
        listOf(aulaKotlin, aulaAndroid),
        listOf(luci, gabi),
        professor
    )

    val turmaTop = Turma("Turma 1 de Android", curso)

    turmaTop.curso.listaAlunos.forEach {
        println("O nome do aluno é ${it.nome} ${it.sobrenome} e o registro " +
                "acadêmico é ${it.registroAcademico}")
    }
    println(turmaTop.curso.listaAulas)
}

class Materia(nome: String)

class Aula(materia: Materia, horaInicio: String, horaTermino: String)

open class Pessoa(nome: String)

class Professor(nome: String, registroDocente: String): Pessoa(nome)

class Aluno(
    val registroAcademico: String,
    val nome: String,
    val sobrenome: String
): Pessoa(nome) {

    fun assistirAula() {

    }

    fun fazerLicao() {

    }
}

class Curso(
    nome: String,
    val listaAulas: List<Aulas>,
    val listaAlunos: List<Alunos>,
    professor: Professor
)

class Turma(nome: String, val curso: Curso)



 */