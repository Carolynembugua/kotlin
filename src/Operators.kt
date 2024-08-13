fun main() {
    //assignment operators
// arithmetic operator
    var x =12
    var y =3
    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y)//modulus

    //comparison operators
    println( x < y)
    println( x > y)
    println( x <= y)
    println( x >= y)
    println( x == y)
    println(x != y)

    //assignment operators
    var number = 56
    println(number)
    number -= 2
    println(number)

    //logic operators - ||,&&,!
    println((23 < 56) &&  (2 > 10))//and all should be true or else false
    println((23 < 56) || (2 > 10))//or
    println(!(23 < 56) || (2 > 10))//not reverses prev result

}