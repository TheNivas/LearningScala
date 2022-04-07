import scala.util.Random
@main def run() =
    val x: Int = Random.nextInt(10)

    x match {
        case 0 => 'Zero'
        case 1 => 'One'
        case 2 => 'Two'
        case 3 => 'three'
        case 4 => 'four'
        case _ => 'other'
    }