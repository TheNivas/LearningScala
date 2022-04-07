@main def run() = 
    //case class compared by value unlike class which compare by reference
    case class Point(x: Int, y: Int)
    val point1 = Point (1,2)
    val point2 = Point (1,2)
    val point3 = Point (2,5)

    if (point1 == point2) {
        println(s"$point1 and $point2 are same.")
    }
    else{
        println(s"$point1 and $point2 are different.")
    }

    if (point1 == point3){
        println(s"$point1 and $point3 are the same.")
    }
    else{
        println(s"$point1 and $point3 are different.")
    }
