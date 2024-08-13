//program to determine the largest number among 4 numbers
//program to check whether a number is prime
// program to determine a leap year
import java.util.Scanner

fun main() {
    var number = Scanner(System.`in`)
    println("Enter first no :")
    var num1 = number.nextInt()
    println("Enter second no :")
    var num2 = number.nextInt()
    println("Enter third no :")
    var num3 = number.nextInt()
    println("Enter fourth no :")
    var num4 = number.nextInt()
    if (num1 >= num2 && num1 >= num3 && num1 >= num4 ){
        println("$num1 is the largest number")
    }
    else if (num2 >= num1 && num2 >= num3 && num2 >= num4 ){
        println("$num2 is the largest number")
    }
    else if (num3 >= num1 && num3 >= num2 && num3 >= num4 ){
        println("$num3 is the largest number")
    }
    else{
        println("$num4 is the largest number")
    }


}