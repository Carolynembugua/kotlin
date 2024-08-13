fun main() {
    //standard library functions/inbuilt functions

    println(2+4)
    var result = Math.sqrt(144.0)
    println("The squareroot of the number is $result")

    var roundedNumber = Math.round(34.67)
    println("The output is $roundedNumber")
    Day()
    multiply()
    add(78,8)
    add(100,80)
    add(70,34)

}
fun Day(){
     println("Today is Tuesday ")
}
fun multiply(){
    var num1 = 34
    var num2 = 2
    println(num1*num2)
}

//parameters and arguments
fun add(x:Int,y:Int){
    println(x+y)
}

