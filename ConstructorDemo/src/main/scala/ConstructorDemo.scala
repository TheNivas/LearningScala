// Program No.: 1 (primary constructor)
class DemoClass {
  val x = 2
  val y = 3

  def addNumber(): Int= {
    x + y
  }
  println(s"x = ${x} and y = ${y}")
  //or
//  println("x = " + x + " and y = " + y)

}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello World !!")

    val demoObject1 = new DemoClass
    val result = demoObject1.addNumber()
    println(s"Result of adding numbers ${demoObject1.x} and ${demoObject1.y} are: $result")

  }
/*
Output:
Hello World !!
x = 2 and y = 3
Result of adding numbers 2 and 3 are: 5
 */
}
