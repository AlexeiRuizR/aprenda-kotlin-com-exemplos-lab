// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nomeu: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel){

    val inscritos: MutableList<Usuario> = mutableListOf()
       
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
        
  }

fun main() {
   // Estudiantes a matricular
    val estudante1 = Usuario("Alexei Ruiz")
    val estudante2 = Usuario("Maria Elice")
    val estudante3 = Usuario("João Pereira")
    val nivelAct = Nivel.INTERMEDIARIO
    val conte = ConteudoEducacional("Java", 90)
    val conte1 = ConteudoEducacional("Python", 120)
    val conte2 = ConteudoEducacional("HTML e CSS3", 60)
    val forma = Formacao("Full Stack", listOf(conte1, conte, conte2), nivelAct)
    
   
    println("DIO possui Formaçoes incríveis, um delas é ${forma.nome}")
    println("Esta formação está dividida em vários conteúdos com diferentes durações, que se apresentam abaixo:")
    forma.conteudos.forEach{println(it)}
    println("")
    forma.matricular(estudante1)
    forma.matricular(estudante2)
    forma.matricular(estudante3)
    val cant = forma.inscritos.count()
    println("$cant alunos listados abaixo matriculados:")
    forma.inscritos.forEach{ println(it)}
    println("")    
    println("O aluno ${forma.inscritos[0]} passará por treinamento em ${forma.nome}")
    println("se especializando em ${forma.conteudos[1]}")
    println("")
    println("O nível estudado será ${forma.nivel}")
}
