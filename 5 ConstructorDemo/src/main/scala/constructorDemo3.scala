// Program No.: 4 => Auxiliary Constructor
class DemoClass3 (val a : Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  println(s"x = ${x} and y = ${y} and z = $z")

  def addNumber() = {
    x + y
  }

  def this () {
    this(1,1.1, "Hello Scala !")
  println("auxiliary constructor with zero parameter")
  }

  def this (a: Int) {
    this(a, 1.1, "Hello Scala !")
    println("auxiliary constructor with One parameter")
  }

  def this (a: Int, b: Double) {
    this(a, b,  "Hello Scala !")
    println("auxiliary constructor with Two parameter")
  }

  def this (c: String) {
    this(1, 1.1, c)
    println("Auxiliary constructor with Only string as parameter")
  }
}



object ConstructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demoObject31 = new DemoClass3(2,5.4,"Nivas") // primary constructor

    val demoObject32 = new DemoClass3() //auxiliary constructor with 0 param

    val demoObject33 = new DemoClass3(12) //auxiliary constructor with 1 param

    val demoObject34 = new DemoClass3(32,55.44) //auxiliary constructor with 2 params

    val demoObject35 = new DemoClass3(c = "Hello Peops!") //auxiliary constructor with one parameter which is string

    val result = demoObject31.addNumber()
    println(s"Result of adding numbers ${demoObject31.x} and ${demoObject31.y} are: $result")
  }

}
