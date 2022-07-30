import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("n= ")
    val n = scanner.nextInt()

    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var isHave = false

    for (element in array.indices) {
        if (array[element] == n) {

            isHave = true
            break
        }
    }
    if (isHave) {
        println("Yes $n")
    }else {
        println("No $n")
    }

}