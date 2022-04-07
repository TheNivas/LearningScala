// Program No.: 2 => Parameterized Constructor
class DemoClass1 (val a : Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }
  println(s"x = ${x} and y = ${y} and z = $z")
  //or
//  println("x = " + x + " and y = " + y)

}


object ConstructorDemo1 {
  def main(args: Array[String]): Unit = {
    val demoObject2 = new DemoClass1(2,5.4,"Nivas")
    val result = demoObject2.addNumber()
    println(s"Result of adding numbers ${demoObject2.x} and ${demoObject2.y} are: $result")
  }

}
