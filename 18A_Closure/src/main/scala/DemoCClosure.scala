
//even or odd no.
object DemoCClosure {
  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEven1, 23))
    println(evenOrOdd(isEven1,32))
    println(evenOrOdd(isEven1,2))
    println(evenOrOdd(isEven1,3))
    println(evenOrOdd(isEven1,12))


  }
  // In fn definition
  def isEven(x: Int): Boolean = {
    x % 2 == 0
  }

  //in variable
  var div1 = 2
  val isEven1 :(Int => Boolean) = (x) => (x%div1 == 0)


  def evenOrOdd(f: Int => Boolean, x: Int) : String= {
    var evenFlag = f(x)
    if (evenFlag) s"$x is a Even Number" else s"$x is an Odd Number"
  }
}