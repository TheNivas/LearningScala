object DemoObjectB { // 1st note: instead of class, this is object
  val x = 2
  val y = 3.5
  println(s"x = $x and y = $y")
  def addValue() = x + y
}

object SingletonDemoB {
  def main(args: Array[String]): Unit = {

    //val demoObjectB1 = new DemoObjectB // 2nd note: if you uncomment it, it will give error as can not create obj of any obj.
    println(DemoObjectB.x, DemoObjectB.y) // 3rd note: Access var as obj_name.var_name
    val result = DemoObjectB.addValue() // 4th note: Access method as object_name.method()
    println(result)
  }

}
