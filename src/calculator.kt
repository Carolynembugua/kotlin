import java.util.Scanner

fun main() {
    var numbers = Scanner(System.`in`)
    println("Enter num1 :")
    println("Enter num2 :")
    println("Enter operator :")
    var num1 = numbers.nextDouble()
    var num2 = numbers.nextDouble()
    var ops = readln()
    var result = when(ops){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" +
                "" -> num1 % num2
        else -> "Invalid operator"
    }
    println("The answer is $result")



}