fun main() {

    var firstname = "carol"
    var school = "EMOBILIS"
    println(firstname)
    println(firstname[1])
    println(firstname.uppercase())
    println(school.lowercase())
    println(firstname + school)
    println(firstname +  " " + school)//to create a space in between

    //string interpolation
    println("My firstname is " +firstname+" I study at " + school)
    println("My firstname is $firstname.I study at $school")



}