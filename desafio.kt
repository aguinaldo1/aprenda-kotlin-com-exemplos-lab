enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }



data class Matricular(val nome: String, val matricular: Int) 
    
    fun ConteudoEducacional(formacao: Matricular, inscritos: MutableList<Matricular>) {
        
        if (!inscritos.contains(formacao)){
            inscritos.add(formacao)
            println("Matricula realizada com sucesso para ${formacao.nome}.")
        }else{
            println("${formacao.nome} já está matriculado.")
        }
    }

fun main() {

    val inscritos = mutableListOf(
   	Matricular("Curso de Docker", 1),
        Matricular("Curso de Kafka", 2),
        Matricular("Curso de kotlin", 3)
        )
	val formacao = Matricular("Novo Curso", 4)
    ConteudoEducacional(formacao, inscritos)
}
