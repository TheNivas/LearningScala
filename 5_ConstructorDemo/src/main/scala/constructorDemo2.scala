// Program No.: 3 => Default Parameter in  Constructor
class DemoClass2 (val a : Int = 1, val b: Double = 1.11, val c: String) {
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


object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    val demoObject21 = new DemoClass2(2,5.4,"Nivas")

//    val demoObject22 = new DemoClass2(,,"Nivas") // !can not be done like that.


    val demoObject22 = new DemoClass2(c = "NivaS")

    val demoObject23 = new DemoClass2(b = 22.3, a = 54,c  = "NIVAS")

    val result = demoObject21.addNumber()
    println(s"Result of adding numbers ${demoObject21.x} and ${demoObject21.y} are: $result")
  }

}
