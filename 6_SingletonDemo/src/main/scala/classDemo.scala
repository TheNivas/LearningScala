object employee {
  val x = 2
  val y = 3.4
  println("abc")
}
object classDemo {
  def main(args: Array[String]): Unit = {
    //val a = new employee // this is wrong cuz employee is obj not class, we can't make obj of obj.
    println(employee.x) // we can access it like that anywhere
  }
}