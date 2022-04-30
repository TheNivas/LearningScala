class DemoClassC(a: Int, b: Double) {
  val x = a
  val y = b
  println(s"x = $x and y = $y")
  def addValue() = x + y
}


object singletonDemoC {
  def main(args: Array[String]): Unit = {

    var DemoObjectC1 = new DemoClassC(5,7.7)

    println(DemoObjectC1.x, DemoObjectC1.y)
    var result = DemoObjectC1.addValue()
    println(result)

    DemoObjectC1 = new DemoClassC(3,9.7)

    println(DemoObjectC1.x, DemoObjectC1.y)
    result = DemoObjectC1.addValue()
    println(result)
  }
}
