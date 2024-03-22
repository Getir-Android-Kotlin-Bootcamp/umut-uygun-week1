fun main(args: Array<String>) {
    //syf 9
    println("Hello World!");
    println(42);
    println("-----------------SYF10-------------------")
    //syf10
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    fun sum2(a: Int, b: Int) = a + b
    fun printSum(a: Int, b: Int): Unit {
        println("Sum of $a and $b is ${a + b}")
    }
    var sumVariable = sum(1,2)
    println("Sum Method: " + sumVariable)
    println("Sum2 Method: " + sum2(2,3))
    printSum(4,5);
    println("-----------------SYF11-------------------")
    //syf 11
    val a: Int = 1
    val b = 2
    val c: String
    c = "umut"
    //b = 3 val cannot be reassigned
    println("val a: " + a + "| val a type: " + a::class.simpleName)

    println("val b: " + b + "| val b type: " + b::class.simpleName)

    println("val c: " + a + "| val c type: " + c::class.simpleName)

    var d: Int = 4
    println("val d: " + d + "| val d type: " + d::class.simpleName)

    d += 1
    println("Inceremented val d: " + d + "| val d type: " + d::class.simpleName)
    println("-----------------SYF12-------------------")
    //syf 12
    val rectangle = Rectangle(5.8, 2.0)
    println("Rectangle perimeter is: ${rectangle.perimeter}")
    println("--------------------------------------")
    val sqare = Square(2.5)
    println("Square perimeter is: ${sqare.perimeter}")
    println("-----------------SYF15-------------------")
    //syf 15
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else return b
    }

    println("Method maxOf: " + maxOf(2,3));
    println("--------------------------------------")
    //syf 16
    val items = listOf("apple", "banane", "kiwi")
    for (item in items) {
        println(item)
    }
    println("--------------------------------------")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println("--------------------------------------")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println("-----------------SYF18-------------------")
    //syf18
    fun describe(obj: Any): String =
            when(obj) {
                1 -> "one"
                else -> "unknown"
            }
    println("describe method: " + describe(1))
    println("-----------------SYF18-------------------")
    //syf19
    val int1 = 10
    val int2 = 5
    if (int1 in 1..int2+1) {
        println("fits in range")
    }

    var list2 = listOf("a", "b", "c")

    if (-1 !in 0..list2.lastIndex)
    {
        println("-1 does not fits in range")
    }
    println("-----------------SYF37-------------------")
    val book = Book("1984", "George Orwell", 1949, 328)
    book.read()
    book.printDetails()

    //Syf39
    println("-----------------SYF39-------------------")
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbers = numbers2.filter { it % 2 != 0 }
    println("Odd numbers: $oddNumbers")
}

open class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}

class Square(sideLength: Double) : Rectangle(sideLength, sideLength)

data class Book(
        val title: String,
        val author: String,
        val publicationYear: Int,
        val pageCount: Int
) {
    fun read() {
        println("You are now reading: $title")
    }

    fun printDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publicationYear")
        println("Page Count: $pageCount")
    }
}
