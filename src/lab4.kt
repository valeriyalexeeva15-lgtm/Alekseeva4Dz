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
//fun castSpell() {
//    println("Каст случайного заклинания!")
//}
//
//fun castSpell(spell: String) {
//    println("Каст заклинания $spell!")
//}
//
//fun castSpell(spell: String, power: Int) {
//    println("Каст $spell с силой $power!")
//}
//
//fun main() {
//    castSpell()
//    castSpell("Молния")
//    castSpell("Исцеление", 70)
//}

//8
//fun createWeapon(name: String): String {
//    return "Оружие: $name"
//}
//
//fun createWeapon(name: String, damage: Int): String {
//    return "Оружие: $name (Урон: $damage)"
//}
//
//fun createWeapon(damage: Int, isMagic: Boolean): String {
//    return "${if (isMagic) "Магическое" else "Обычное"} оружие (Урон: $damage)"
//}
//
//fun main() {
//    println(createWeapon("Меч"))
//    println(createWeapon("Копье", 30))
//    println(createWeapon(25, true))
//}

//9
fun heal(): String = "Лечение: +10 HP"
fun heal(amount: Int): String = "Лечение: +$amount HP"
fun heal(amount: Int, isPotion: Boolean): String {
    return if (isPotion) "Выпито зелье (+$amount HP)"
    else "Заклинание лечения (+$amount HP)"
}

fun main() {
    println(heal())
    println(heal(20))
    println(heal(60, true))
    println(heal(25, false))
}