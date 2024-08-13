fun main() {

    for (number in 65..70){
        println("My number is $number")
    }
    for (letter in 'd'..'f'){
        println("Letter is $letter")
    }
    for (count in 100..105){
        if (count == 103){
            break
        }
        println(count)
    }
    for (mycharacter in 'a'..'d'){
        if (mycharacter == 'b'){
            continue
        }
        println(mycharacter)

    }



}