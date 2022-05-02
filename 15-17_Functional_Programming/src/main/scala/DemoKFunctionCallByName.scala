// function call by name.
object DemoKFunctionCallByName
{
  def main(args: Array[String]): Unit = {
    println(calculator(add, 2, 4))
    println(calculator(sub, 7, 3))
      println(calculator(mul, 7, 3))
      println(calculator(div, 7, 3))
      println(calculator(rem, 7, 3))

  }

  def calculator(m: (Int, Int) => Int, x: Int, y: Int): Int = {
    m(x,y)
  }
  def add(x: Int, y: Int) = { x + y}
  def sub(x: Int, y: Int) = x - y
  def mul(x: Int, y: Int) = x * y
  def div(x: Int, y: Int) = x / y
  def rem(x: Int, y: Int) = x % y


}
