// function call by name.
object DemoICallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment()) // passing fn as param to another function.
    printValue(decrement()) // passing fn as param to another function.
  }

  def increment(): Int = {
    var x = 2
    println("value of x is " + x)
    var y = x + 1
    println("value of x after incrementing is " + y)
    y
  }
  def decrement(): Int = {
    var x = 2
    println("value of x is " + x)
    var y = x - 1
    println("value of x after decrementing is " + y)
    y
  }
  def printValue(m: => Int): Unit ={
    println("Value is  " + m)
  }
}
