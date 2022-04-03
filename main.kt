fun main(){
     printOdd()
    var result=longCharacters(arrayOf("Pacy","kayitete","AkiraChix","code","codeHive"))
    println(result)
    serve(4)
    serve(6)
    serve(7)
    serve(15)
    serve(17)
    multipleNumbers()

}
fun printOdd(){
    for(n in 1..100){
        if(n%2!=0){
            println(n)
        }
    }
}
fun longCharacters(names:Array<String>):Int{
    var counting=0
    names.forEach { el->
        if(el.length>=5){
            counting++
        }
    }
    return counting
}
fun serve(age:Int){
    if(age<6){
        println("a glass of milk")
    }
    else if(age>=6 && age<15){
        println("a bottle of fanta orange.")
    }
    else{
        println("a bottle of coca cola")
    }
}
fun multipleNumbers(){
    for(number in 1..100){
        if(number%3==0 && number%5==0){
            println("FizzBuzz")
        }
        else if(number%3==0){
            println("Fizz")
        }
        else if(number%5==0){
            println("Buzz")
        }
        else{
            println(number)
        }
    }
}
