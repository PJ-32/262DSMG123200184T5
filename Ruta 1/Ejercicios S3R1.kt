// Clases genericas - genericos <T>
/*
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
}
*/


// constante enum - tipos personalizados
/*
enum class Difficulty {
    EASY, MEDIUM, HARD
}
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}
*/

// clase de datos - clases q no tienen metodos, asi que se le asigna unos automaticamente - data
/* equals()
hashCode() (verás este método cuando trabajes con ciertos tipos de colecciones)
toString()
componentN(): component1(), component2(), etc.
copy()
 */  /*
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
}
*/


// singleton - una sola instancia por clase
/*
object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}
fun main() {
    
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}
*/
// objetos como complementarios - companion object
// un objeto complementario te permite acceder a sus propiedades y métodos desde adentro de la clase
/*
class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
}

*/


//agregar una propiedad (de solo acceso) de extensión
/*
// val typeName.propertyName: dataType 		propertyGetter 
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"


fun main() {
    println(Quiz.progressText)
}
*/
//agregar una función de extensión
// fun typeName.functionName (parameters): returnType {functionBody}
/*
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
fun main() {
    Quiz.printProgressBar()
}
*/



//reescribir las funciones de extensión con interfaces
/*
// para varias clases que necesiten propiedades y metodos adicionales (quizas algo diferentes)

interface InterfaceName {
    //propiedades de solo acceso y metodos 
}

// una clase extiende una interfaz
class ClassName:InterfaceName {
    //el body debe implementar las mismas p y m de la interfaz con la misma firma
}
*/
//EJEMPLO de una interfaz con una clase implementandolo
/*
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}
class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
}
    
fun main() {
    Quiz().printProgressBar()
}
*/


// Funciones de alcance
// te permiten acceder de forma concisa a propiedades y métodos de una clase sin tener que acceder varias veces al nombre de la variable
/*
class Quiz{
    fun printQuiz() {
        //sin funciones de alcance
        println(question1.questionText)
        println(question1.answer)
        println(question1.difficulty)
        println()
        //con funciones de alcance
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
	}
}

fun main() {
    val quiz = Quiz()
    quiz.printQuiz()
}

//llamar a los métodos de un objeto sin una variable mediante apply()
fun main() {
    val quiz = Quiz()
    quiz.printQuiz()
   //------
   // sin variable con apply
   Quiz().apply {
       printQuiz()
    }
}
*/



//COLECCIONES
// Array
	// val variableName = arrayOf<DataType>(elemento1,ele2...)
/*
fun main(){
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    
    println(solarSystem[7])
    
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    // no puedes cambiar el tamaño del array
    // solarSystem[8] = "Pluto" daria un error porque el array no tiene 9 elementos
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
}
*/

// Listas - List y MutableList
    //colección redimensionable y ordenada que, por lo general, se implementa como un array que puede cambiar de tamaño
    // puedes agregar  y quitar elementos, practicamente es un array que se genera otro nuevo cuando lo necesita
    // List				es una interfaz que define las propiedades y los métodos relacionados con una colección ordenada de solo lectura de los elementos.
    // MutableList 		extiende la interfaz List con la definición de métodos para modificar una lista, como agregar o quitar elementos.
/**
fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size) 
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    // iterar en elementos de lista con un bucle for
    for (planet in solarSystem) {
        println(planet)
    }
}
*/
	//MutableList
/*
fun main(){
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto") //al final
    solarSystem.add(3, "Theia") // en el indice 3
    solarSystem[3] = "Future Moon"
    solarSystem.removeAt(9)//por indice
    solarSystem.remove("Future Moon")//por elemento
    println(solarSystem.contains("Pluto")) //contains() = booleano si existe
    println("Future Moon" in solarSystem) // booleano si existe
    
}
*/

// Set y MutableSet 
    // no tiene un orden específico ni permite valores duplicados.
    // +rapido para buscar que List, pero usa +memoria
    // mejor cuando quieres agregar elementos que no se deben repetir
	//no tienen indices
/*
fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    //no duplicados
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
	println(solarSystem.contains("Pluto"))
}
*/

// Map y MutableMap
	// consta de pares clave-valor
    // tiene claves unicas, pero el valor se puede repetir
    // la busqueda es +rapida que la lista
// mutableMapOf <KeyType, ValueType>(key1 to value1)
/*
fun main(){
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)
    solarSystem["Pluto"] = 5 //para añadir
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia")) //si no existe da null
    solarSystem.remove("Pluto") //remueve 
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78 //modificar
	println(solarSystem["Jupiter"])
}
*/



// FUNCIONES DE ORDEN SUPERIOR CON COLECCIONES

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
//Bucle con forEach()
    //forEach(action: (T) -> Unit)		usa it para referenciar los elementos
    // ${expression}		pueden ser Puedes acceder a propiedades, realizar operaciones matemáticas, llamar a funciones, etc y se inserta como String
/*
fun main() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}
*/
// map()
    //te permite transformar una colección en otra nueva con la misma cantidad de elementos
    //puede tener otro tipo
/*
fun main (){
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}
*/
//filter() 
	// te permite crear un subconjunto de una colección, 
	// mismo o menor tamaño, mismo tipo
    // si la expresion lambda se cumple, se incluye, sino no
/*
fun main(){
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
*/
// groupBy()
	//convierte list en map, donde la key es la expresion lambda y el value es resultado de la expresion
/*
fun main(){
    val groupedMenu = cookies.groupBy { it.softBaked }
    // lo separo en dos listas (true o false)
    // se usa elvis :? por si la lista es nula, que devuelva una vacia 
    val softBakedMenu = groupedMenu[true] ?: listOf()
	val crunchyMenu = groupedMenu[false] ?: listOf()
    
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
*/

//fold()
	//se usa para generar un valor único a partir de una colección
    // fold (valorInicial){acumulador, lambda}
    /*
fun main(){
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")
}
    */
    
    
// sortedBy()
fun main() {
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}





