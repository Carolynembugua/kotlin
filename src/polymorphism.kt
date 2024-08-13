open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
class Rectangle:Shape(){
    override fun  draw(){
        println("Drawing a rectangle")
    }
}
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}
//both class and function should be open
fun main() {
    var s = Shape()
    var r = Rectangle()
    var rh = Rhombus()

}