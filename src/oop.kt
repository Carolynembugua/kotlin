class Student{
    //obj must carry a characteristic and
    //properties/attribute/variables
    var age = 34
    var gender = "Male"

    //method/function/behaviour
    fun study(){
        println("Student is studying")
    }
}
//obj must be created inside main function outside the class
fun main() {
    var stud1 = Student()
    stud1.study()
    println(stud1.gender)

    var stud2 = Student()

}