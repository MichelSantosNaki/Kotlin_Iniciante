fun media(vararg notas:Float){
    println(notas.sum()/notas.size)
}

fun main() {
    media(1f,5f,2f,7f)
}