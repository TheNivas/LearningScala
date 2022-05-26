//class and object demo
class Car {
  var topClassExtraCost = 0
  private var roadTax = 100
  protected var xyz = 30
  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax + xyz
  def checkTax():Int = {
    roadTax = 10
    roadTax
  }
}

class smallCar extends Car {
//  println(roadTax) // produce error cuz private member of car class
  println(xyz)
}

object carExample {
  def main(args: Array[String]): Unit = {
    var bmw = new Car
//    println(bmw.xyz) //error
    bmw.topClassExtraCost = 1000
    println("TopExtraCost of BMW is :" + bmw.topClassExtraCost)
    var result = bmw.cost(100000)
    println("Total cost of BMW: " + result)
    println("total tax on BMW: " + bmw.checkTax())

    var z = new Car
    println("extra cost of z:" + z.topClassExtraCost)
    println("total tax on z: " + bmw.checkTax())


  }

}
