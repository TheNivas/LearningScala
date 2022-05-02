object DemoERecursiveFunction {
  def factorial(n: Int):Int = {
    if (n <= 1)  {
      1
    }
    else{
      n * factorial(n-1) //recursive fn
    }
  }

  def   factorialshort(n: Int): Int = {
    if (n <= 1)  1 else  n * factorialshort(n-1)
//    if (n <= 1) return 1 else  n * factorialshort(n-1) //here return is optional too
  }


    def main(args: Array[String]): Unit = {
    var factshort = factorialshort(5)
    println(s"factorial using short fn  $factshort")
      var fact = factorial(5)
      println(s"factorial using normal fn  $fact")
  }
}
