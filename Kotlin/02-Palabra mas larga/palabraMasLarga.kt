fun main(){
    var maxima =palabraMasLarga("jajajajja","jaja","jsjsjsks","jsjsjsjss")
    println("La palabra mas larga tiene $maxima caracteres")
    /*

    */
}

fun palabraMasLarga(vararg palabras: String):Int{
    var max = 0
    for (i in palabras) if (i.length > max) max = i.length
    return max
}//020914
/*
Las funciones con cuerpo de bloque siempre deben especificar el tipo de devolucion de forma explicita,
a menos que se pretenda que devuelvan Unit, en cuyo caso especificar el tipo de devolucion es opcional.
Kotlin no infiere tipos de devolucion para funciones con cuerpos de bloque porque dichas funciones pueden
tener un fkujo de control complejo en el cuerpo, y el tipo de devolucion no sera obvio.
*/