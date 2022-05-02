// function call by name.
object DemoJFunctionCallByName
{
  def main(args: Array[String]): Unit = {
    printValue(increment, 2) // passing fn as param to another function.
    printValue(decrement, 3) // passing fn as param to another function.
  }

  def increment(x: Int): Int = {
    println("value of x is " + x)
    var y = x + 1
    println("value of x after incrementing is " + y)
    y
  }
  def decrement(x: Int): Int = {
    println("value of x is " + x)
    var y = x - 1
    println("value of x after decrementing is " + y)
    y
  }
  def printValue(m:(Int) => Int, x: Int): Unit ={
    println("Value is  " + m(x))
  }
}
