// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: String) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
val nivel = Nivel.BASICO
val message = when (nivel) {                      
        Nivel.BASICO -> "It's nivel basico"
        Nivel.INTERMEDIARIO -> "It's nivel intermediario"
        Nivel.AVANCADO -> "It's nivel avançado"
        }
        println(message)
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
