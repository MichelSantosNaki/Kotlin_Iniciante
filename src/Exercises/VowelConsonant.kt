package Exercises

fun contVowels(str: String): Int { // recebe uma string e retorna um inteiro
    val frase = str.toLowerCase() // coloca a frase em minúsculo
    val VOLWES = "aeiou"
    var total = 0

    for (letra in frase) { // pra cada letra na variavel frase
        if (letra in VOLWES) { // checo se a letra contem na variavel string VOLWES
            total++ // se tiver ,add 1 ao númeto total de vezes que aparece alguma vogal


        }

    }
    return total // retorna o total
}
 // mesma lógica que vogal mas agora é com consoante
fun countConsonants(str: String): Int {
    val frase = str.toLowerCase()
    val consonants = "bcdfghjklmnpqrstvxzyw"
    var total = 0

    for (l in frase) {
        if (l in consonants) {
            total++
        }
    }
    return total

}
                                    //uso filter, cololo pra minuscolo e chego se tem iou e retorno o length
fun countVowelsFilter(str:String) = str.filter{it.toLowerCase() in "aeiou"}.length




