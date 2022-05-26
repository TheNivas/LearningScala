@main def run() = 
    var x = 4-2
    x = 4
    println(x*x)
    println({
        val y = 3
        y+1
    })
    //fn
    val addOne = (x: Int) => x + 1
    println(addOne(4))
    // val -> function and def -> method
    //function
    val add = (a : Int, b : Int) => a + b
    println(add(12,3))
    //method

    def sum (x: Int, y: Int): Int =  x + y
    println(sum(2, 10))

    def addThenMUltiply (x: Int, y: Int)(multiplier: Int): Int =  (x+y) * multiplier
    println(addThenMUltiply(2,3)(4))

    def name: String = System.getProperty("user.name")
    println("Hello, " + name + " !!")

    def getSquareString(input: Double): String= {
        val sq = input * input
        sq.toString
    }
    println(getSquareString(3.5))

    def sqaure(input: Double): Double= input * input
    println(sqaure(2.5))
