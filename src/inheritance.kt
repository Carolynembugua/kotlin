 open class Animal{
    fun isMammal(){
        println("Animal is a mammal")
    }
}
open class Duck:Animal(){
    var hasFeathers = true
    fun swim(){
        println("Duck is swimming")
    }
}
class Bat:Duck(){
    var  isBlind = true
}
//you have to open a class in order to inherit
fun main() {
    var a = Animal()
    var d = Duck()
    var b = Bat()

}