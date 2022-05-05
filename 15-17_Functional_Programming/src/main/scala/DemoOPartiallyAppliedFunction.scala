//Note :  partially implemented fn: 2
object DemoOPartiallyAppliedFunction {
  def main(args: Array[String]): Unit = {
//    fourWheeler("Mercedes", "Car", 20000000)
    car("Mercedes")  //or
    fourWheeler("Ferrari", "Racing Car", 1000000)  //not using partially implemented fn
    car("BMW")
    truck("Tesla")
  }
//partially implemented fns
  var car = fourWheeler(_:String, "car", 20000)

  var truck = fourWheeler(_:String, "Truck", 500000)

  /*
  def fourWheeler(vehicleName: String, vehicleType : String, vehicleCost : Int) = {
    println("Vehicle name is : " + vehicleName + "\nVehicle type is : " + vehicleType + " and \nvehicle cost is: " + vehicleCost)
  }
   */

  //Converting fn definition into fn variable: (input) => {output}
  val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println("Vehicle name is : " + vehicleName + "\nVehicle type is : " + vehicleType + " and \nvehicle cost is: " + vehicleCost)

  }
}
