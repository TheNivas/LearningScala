//function with named arguments
object DemoBFunctionWithNamedArgs {
  def sum(x: Int, y: Int): Int = {
    println(s"value of x is $x")
    println(s"value of y is $y")
    return (x + y)
  }

  def main(args: Array[String]): Unit = {
    var a = sum(y = 2, x = 3)
    println(s"sum = $a")
  }
}
