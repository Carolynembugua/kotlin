import java.util.Scanner
//if you`re inputting values you have to import
fun main() {

    var read = Scanner(System.`in`)
    println("Enter the temperature of patient : ")
    var temperature = read.nextDouble()

    if (temperature > 37) {
        println("High fever")
    }
    else if (temperature < 37){
        println("Low fever")
    }
    else{
        println("Normal temperature")
    }
}