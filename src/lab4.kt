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
fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}

fun main() {
    spawnEnemy("Троль", 300)
    spawnEnemy("Король Тьмы", 500, true)
}