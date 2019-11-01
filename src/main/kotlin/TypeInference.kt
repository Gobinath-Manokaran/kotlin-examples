fun foo(int: Int?) = {
    println(int)
}
fun main(args: Array<String>) {
    listOf(42).forEach { foo(it) }
}