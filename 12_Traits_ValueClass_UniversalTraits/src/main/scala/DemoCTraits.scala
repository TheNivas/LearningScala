abstract class  Vehicle {   //abstract is keyword for abstract class
  def category() //method category is not implemented

}


trait FourWheelerC{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}


trait CarC {
  var x = 1000
  val wheels = 4
  def engine(): Unit = {
    println("Engine is "+ x +" CC in car")
  }
  def wheel(): Unit = {
    println(wheels + " Wheels in car")
  }
}


class MercedesC extends Vehicle with FourWheeler with CarC {
  x = 2000      // to override x in carC trait
  override val wheels = 6 // to override val value in carC trait
  def breaks(): Unit = {
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel() // to know from where the function needs to be called/referred
  def category(): Unit = {
    println("This is mercedes $$$")
  }

  override def engine(): Unit = {
    println("Engien of Merecedes is "+ x +" CC")
  }
}


object DemoCTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesC
    m1.engine()
    m1.wheel()
    m1.breaks()
    m1.category()
  }
}
