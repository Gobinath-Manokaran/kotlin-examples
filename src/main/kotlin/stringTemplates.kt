fun main(args: Array<String>) {
    var n =1
    var str = ""
    if(n>0){
        str = "positive"
    } else {
        str = "negative"
    }
    println("The number " + n + " is " + str)

    println("The number $n is ${if(n>0) "positive" else "negative"}")
}

