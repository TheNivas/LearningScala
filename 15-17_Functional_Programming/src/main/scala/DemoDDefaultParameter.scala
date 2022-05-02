//Default parameter value

object DemoDDefaultParameter {
  def Division(x: Int = 5, y: Int = 1): Double = { // default value of y is 1 if nothing is passed in y param
    println(s"value of x is $x")
    println(s"value of y is $y")
    return (x / y.toDouble)
  }

  def main(args: Array[String]): Unit = {
    /*
    //for user input:
    println("Enter 2 nmbers:")
    var a: Int = readInt()
    var b: Int = readInt()
     */

    println(Division(3,5))     //x = 3, y = 5 output: 0.6
    println(Division(3))      //x = 3 and y is not provided so default value of y is assigned (1)
    println(Division(3,0))   // x  = 3 and y = 0 output : infinity
    println(Division(y = 3))  //x = default value 5 and y = 3 ou
  }
}
