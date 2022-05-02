object DemoHAnonymousFunction {
  def main(args: Array[String]): Unit = {
    var listofNumbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // use with Map
    var squareOfNumbers = listofNumbers.map(square)
    println(squareOfNumbers)

    // 2. just using fn definition
//    var squareOfNumbers1 = listofNumbers.map((x: Int) => x * x)
    var squareOfNumbers1 = listofNumbers.map(x => x * x)
//    var squareOfNumbers2 = listofNumbers.map(_ * _) // can't do that: it will expect 2 inputs
    println(squareOfNumbers1)

  }
  //Traditional way
  //  def square(x: Int) = x * x
  //1. Anonymous fn
  var square = (x: Int) => x * x
  var square1:Int => Int = (x: Int) => x * x  //optional to write int
}
