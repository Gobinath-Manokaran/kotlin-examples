//Destructuring is a convenient way of extracting multiple values from data
// stored in objects

data class Person(val name:String, val age:Int, val email: String, val address:String)

fun main(){
    val person = Person("Gobi", 26, "gobi@gmail.com", "Thougthworks")
//    val name = person.name;
//    val age = person.age;

    val(name, age) = person
    println("$name is $age years old")


    val userAndAddressMap = mapOf<Int, String>(1 to "Gobi", 2 to "Bala")
    for((id, name) in userAndAddressMap){
        println("$id ----- $name")
    }
}
