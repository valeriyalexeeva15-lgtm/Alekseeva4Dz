//1
//fun showGameLogo() {
//    println("=== EPIC QUEST ===")
//}
//
//fun main() {
//    showGameLogo()
//    showGameLogo()
//}

//2
//fun showEnemy(name: String, level: Int) {
//    println("Враг: $name (Уровень: $level)")
//}
//
//fun main() {
//    showEnemy("Кот", 15)
//    showEnemy("Мышь", 5)
//}

//3
//fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
//    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
//}
//
//fun main() {
//    spawnEnemy("Мышь")
//    spawnEnemy("Кот", isBoss = true)
//}

//4
//fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
//    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
//}
//
//fun main() {
//    spawnEnemy("Троль", 300)
//    spawnEnemy("Король Тьмы", 500, true)
//}

//5
//fun calculateXP(level: Int): Int {
//    return level * 1000
//}
//
//fun main() {
//    val xp = calculateXP(5)
//    println("Для 5 уровня нужно: $xp опыта")
//}

//6
//fun checkInventory(item: String): Boolean {
//    return item == "Меч"
//}
//
//fun main() {
//    println("Меч в инвентаре: ${checkInventory("Меч")}")
//    println("Зелье в инвентаре: ${checkInventory("Зелье")}")
//}

//7
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}

fun main() {
    castSpell()
    castSpell("Молния")
    castSpell("Исцеление", 70)
}