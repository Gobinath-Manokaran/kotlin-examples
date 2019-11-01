//Data class is just to store state/data

data class Customer(val name: String, val age: Int, val city: String)

fun main(){
    val customer = Customer("Sachin", 19,"NY")

// Getting a property
    val name = customer.name

//Equals
    val customer1 = Customer("John",19,"NY")
    val customer2 = Customer("Steve",20,"NY")


 // Copy

    val customer3 = Customer("Peter",21,"NY")
    val customer4 = customer3.copy()

    println(customer3.equals(customer3))


    val customer5 = customer4.copy(name="James")

    // Printing the object
    println("Customer Details : $customer5")
}
