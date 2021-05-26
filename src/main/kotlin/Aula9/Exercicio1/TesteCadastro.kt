package Aula9.Exercicio1

fun main() {
    val professor1 = Professores("Erik", "12125")
    val professor2 = Professores("Sergio", "1278525")

    val materia1 = Materias("Kotlin")
    val materia2 = Materias("Java")

    val alua1 = Aulas(materia1,"18:00", "20:00")
    val alua2 = Aulas(materia2,"18:00", "20:00")

    val aluno1 = Alunos(1254,"Renan","Corredato")
    val aluno2 = Alunos(1254,"Cleber","Lopes")

    val curso = Cursos("Desenvolvimento Androd", listOf(alua1,alua2), listOf(aluno1,aluno1),(professor1))

    val turma = Turmas ("Turma1", curso)

    curso.listaAlunos.forEach{
        println("Nome ${it.nome} ${it.sobrenome} - RA: ${it.ra}")
    }



}

/*Exercício 1
A Digital House decidiu desenvolver um sistema de cadastro de alunos com seus
respectivos cursos, professores responsáveis e turmas, para esse sistema foram levantados
os seguintes requisitos:
• A matéria dada em cada aula possui um nome;
• A aula possui uma matéria, um horário de início e término;
• O aluno possui um RA (Registro Acadêmico), nome, sobrenome.
• O aluno pode assistir as aulas e fazer as lições de casa;
• O curso possui um nome, uma lista de aulas, uma lista de alunos e um professor
responsável;
• O professor possui um nome e um RD (Registro Docente);
• O professor por ser um Docente tem a obrigatoriedade de dar aulas e fazer a chamada
dos alunos;
• A turma deverá conter um nome e um curso associado

 */