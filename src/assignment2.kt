// program to determine a leap year
import java.util.Scanner

fun main() {
    val num = Scanner(System.`in`)

    println("Enter the year :")
    val year = num.nextInt()

    val leaps = when{
        year % 4 == 0 && year % 100 !=0 -> true
        year % 400 == 0 -> true
        else -> false
    }
    if (leaps){
        println("$year is a leap year")
    }
    else{
        println("$year is not a leap year")
    }



}