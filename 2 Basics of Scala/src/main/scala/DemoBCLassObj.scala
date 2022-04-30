//class and object demo
class CarB {
  var topClassExtraCost = 0
  private var roadTax = 100
  protected var xyz = 30
  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax + xyz
}

class smallCarB extends CarB {
  //  println(roadTax) // produce error cuz private member of car class
  println(xyz)  //30
}


object DemoBCLassObj {
  def main(args: Array[String]): Unit = {
    var bmw = new smallCarB
  }
}
