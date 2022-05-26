@main def run() =
    val planets =
    List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
        ("Mars", 227.9), ("Jupiter", 778.3))
    planets.foreach{
    case (planet, distance) =>
        println(s"Planet $planet is $distance million kilometers from the sun")
    }


    val numPairs = List((2, 5), (3, -7), (15, 56))
        for ((a, b) <- numPairs) {
            println(a * b)
    }
