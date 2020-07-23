package Exercises


import kotlin.text.StringBuilder

fun reverseUsingSb(str: String): String{


    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String):String{
    var sbPhrase = StringBuilder()
    var i = str.length - 1 // tamanho da variavél -1 para ir até o 0 e pegar todas as letras

    while (i>=0){
        sbPhrase.append(str[i]) // adicoona o o valor da posicao I do parametro str revebido pela função na variavel sbPhrase
        i--
    }

    return sbPhrase.toString()
}

