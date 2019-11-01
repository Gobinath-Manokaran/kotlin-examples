package old

fun main(){
    println(format("gobi", "thoughtworks", "net"))                         // 1
    println(format("thoughtworks", "bala", "in"))                       // 2
    println(format(userName = "bala", domain = "thoughtworks"))         // 3
    println(format("frog"))
}


fun format(userName:String,domain:String,extension:String): String {
    return "$userName@$domain.$extension"
}


fun format(userName: String, domain: String) : String {
    return format(userName,domain,"com")
}

fun format(userName: String): String {
    return format(userName,"thoughtworks","com")
}
