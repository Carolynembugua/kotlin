//program to check whether a number is prime
import java.util.Scanner

fun main() {
    // Utilize Scanner for user input
    val reader = Scanner(System.`in`)

    // Get the range from the user
    print("Enter the start of the range: ")
    val start = reader.nextInt()
    print("Enter the end of the range: ")
    val end = reader.nextInt()

    // Loop through the range and print prime numbers
    for (num in start..end) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}