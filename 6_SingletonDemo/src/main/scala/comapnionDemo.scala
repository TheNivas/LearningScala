class comapnionDemo {
var x = 5
  def getValue():Unit = {
    println(s"value of x is $x and value of y = ${comapnionDemo.y}")
  }
}
object comapnionDemo {
var y = 7.3

  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new comapnionDemo()
    println(s"value of x retrieved from companion obj is ${objectForCompanionDemoClass.x}")
    println(s"value of y when retrieved from companion obj is ${y}")
    objectForCompanionDemoClass.getValue()
  }
}
