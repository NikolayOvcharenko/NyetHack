fun main() {

    runSimulation()

    /*
    // println({
    // val greetingFunction: (String, Int) -> String = {  playerName, numBuildings ->
    // val greetingFunction = { playerName: String, numBuildings: Int ->
    runSimulation("Gual", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        // "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        // "Welcome to SimVillage, $it! (copyright $currentYear)"
    }
    // })()
    // println(greetingFunction("Guyal", 2))
    // println("Mississippi".count{ it == 's' })
    // runSimulation("Gual", greetingFunction)

     */
}

/* inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
} */
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Gual"))
    println(greetingFunction("Gual"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings +=1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}