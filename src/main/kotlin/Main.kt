fun main() {
    println(numberMan(15))
}

fun numberMan(number: Int) {

    if (number == 11 || number % 100 == 11) {
        println("Понравилось $number людям")
    } else if (number == 1 || number % 10 == 1) {
        println("Понравилось $number человеку")
    } else {
        println("Понравилось $number людям")
    }
}