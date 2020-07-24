package O.O

enum class Prioridade(val id : Int){
    BAIXA(1){
        //override sobreescre algo, aqui ta escrevendo em cima da str!
        override fun toString(): String {
            return "Esse é um alerta sem muita importancia"
        }
    },MEDIA(5),ALTA(10)
}

fun main() {
    for( p in Prioridade.values()){
        println("$p - ${p.id} - ${p.ordinal}")
    }
}