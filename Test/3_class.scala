@main def run() = 
    class Point(var x: Int, var y : Int){
        def move(dx : Int, dy : Int): Unit = {
            x = x + dx
            y = y + dy
            println(s"After move($dx, $dy): ($x, $y)")
        }

        override def toString: String = 
            s"($x, $y)"
    }

    val pt1 = new Point(2,3)
    println(pt1.x)
    println(pt1)
    println(pt1.move(1,3))
    println()