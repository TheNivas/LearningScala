class DemoClassA {
  val x = 2
  val y = 3.5
  println(s"x = $x and y = $y")
  def addValue() = x + y
}
object singletonDemo {
  def main(args: Array[String]): Unit = {
    val demoObjectA = new DemoClassA
    println(demoObjectA.x, demoObjectA.y)
    val result = demoObjectA.addValue()
    println(result)
  }

}
