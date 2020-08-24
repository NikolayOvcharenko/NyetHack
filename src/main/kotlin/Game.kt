fun main(args: Array<String>) {
    val name = "Mardinal"
    var healthPoint = 89
    var isBlessed = true
    val isImmortal = false
    val numFireballs = 5

    // Аура
    val auraColor =
            auraColor(isBlessed, healthPoint, isImmortal)
    // println(auraColor)

    // Очки жизни
    var healthStatus =
            formatHealthStatus(healthPoint, isBlessed)

    // Cостояние игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireball() // (numFireballs)

}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoint: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoint > 50 || isImmortal
    return if (auraVisible)
        "GREEN"
    else "NONE"
}

private fun formatHealthStatus(healthPoint: Int, isBlessed: Boolean): String =
        when (healthPoint) {
            // if (healthPoint == 100)
            100 -> "is in excellent condition!"
            in 90..99 -> "has a few scratchers."
            in 75..89 -> {
                if (isBlessed) "has some minor wounds but is healing quite quickly!"
                else "has some minor wounds."
            }
            in 15..74 -> "looks pretty hurt."
            else -> "is in awful condition!"
            // return healthStatus
        }

private fun castFireball(numFireballs: Int = 2) {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    println (when(numFireballs) {
        in 1..10 -> "Tipsy"     // навеселе
        in 11..20 -> "Sloshed"  // выпивши
        in 21..30 -> "Soused"   // пьяный
        in 31..40 -> "Stewed"   // сильно пьяный
        else -> "t0aSt3d"       // в стельку
    })
}

fun shouldReturnAString(): String {
    TODO("implement the string building functionality here to return a string")
}