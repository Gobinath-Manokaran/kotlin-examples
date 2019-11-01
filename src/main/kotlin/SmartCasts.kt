open class Shape() {}

data class Square(val side: Int) : Shape()
data class Rectangle(val length: Int, val width: Int): Shape()

class PerimeterCalculator {
    fun perimeter(shape: Shape): Int {
        return when(shape) {
            is Square ->
                4 * shape.side
            is Rectangle ->
                2 * (shape.length + shape.width)
            else ->
                0
        }
    }
}

fun main() {
    val square = Square(4)
    val rectangle = Rectangle(4, 2)

    val perimeterCalculator = PerimeterCalculator()
    println(perimeterCalculator.perimeter(square))
    println(perimeterCalculator.perimeter(rectangle))
}
