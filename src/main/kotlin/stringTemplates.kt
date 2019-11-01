fun main(args: Array<String>) {
    println("Enter Two numbers")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    var result = when (operator) {
        "+" -> (a + b)
        "-" -> (a - b)
        "*" -> (a * b)
        "/" -> (a / b)
        else -> 0
    }
    println("" + a + " " + operator + " " + b + " = " + result)
    println("$a $operator $b = $result")
}
