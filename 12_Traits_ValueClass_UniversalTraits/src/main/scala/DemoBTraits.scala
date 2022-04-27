trait FourWheeler{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}


trait CarB {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC in car")
  }
  def wheel(): Unit = {           // what if wheel defined at two places
    println("4 Wheels in car")
  }
  def breaks()                     //body is not present for breaks() method
  // so their definition should be implemented in class that is extneding trait Car
}


class MercedesB extends FourWheeler with CarB { // keyword is extend and with
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel()
}


object DemoBTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesB
    m1.engine()
    m1.wheel()
    m1.breaks()
  }
}
