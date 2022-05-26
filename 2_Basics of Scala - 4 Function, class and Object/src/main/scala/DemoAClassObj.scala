//class
class CarA {
  var topClassExtraCost = 0
  var roadTax = 100
  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax
}

object DemoAClassObj {
  def main(args: Array[String]): Unit = {
    //objects
    var bmw = new CarA
    println(bmw.roadTax)  // 100
    bmw.roadTax = 200
    println(bmw.roadTax) //200

  }
}
