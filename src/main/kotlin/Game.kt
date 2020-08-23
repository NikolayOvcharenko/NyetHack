fun main(args: Array<String>) {
    val name = "Mardinal"
    var healthPoint = 100
    var isBlessed = true
    val isImmortal = false

    // Аура
    val auraVisible = isBlessed && healthPoint > 50 || isImmortal
    println(
        if (auraVisible)
            "GREEN"
        else "NONE"
    )

    // Очки жизни
    var healthStatus =
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
        }
    println("$name $healthStatus")
}