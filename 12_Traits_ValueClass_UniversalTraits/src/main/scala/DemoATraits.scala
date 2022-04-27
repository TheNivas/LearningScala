trait Car {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC")
  }
  def wheel()                      //body is not present for wheel() method
  def breaks()                     //body is not present for breaks() method
                                   // so their definition should be implemented in class that is extneding trait Car
}

class Mercedes extends  Car {
  def wheel(): Unit = {        //unimplemented wheel() method implemented here
    println("4 Wheels")
  }
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks")
  }
}

object DemoATraits {
  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.engine()
    m1.wheel()
    m1.breaks()
  }
}
