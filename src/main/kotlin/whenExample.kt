fun main(args: Array<String>) {
    dayOfWeek(6)
    dayofWeekAsExpression(5)
    print(typeOfDay(6))
}

fun dayOfWeek(day:Int){
    when(day){
        1->println("Monday")
        2->println("Tuesday")
        3->println("Wednesday")
        4->println("Thursday")
        5->println("Friday")
        6->println("Saturday")
        7->println("Sunday")
        else -> {
            println("Not a Weekday of year")
        }
    }
}

// When as Expression
fun dayofWeekAsExpression(day:Int) {
    var result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6,7-> "Weekends"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Not a week day"
    }
    print("Corresponding day is " + result)
}


fun typeOfDay(day: Int): String{
    return when(day) {
        6,7->"Weekends"
        in 1..5->"Weekday"
        else -> "Not a week day"
    }
}
