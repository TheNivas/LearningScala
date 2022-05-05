object DemoPNestedFunction {
  def main(args: Array[String]): Unit = {

    /*
  def printlHello(msg: String) = {
    println("Hello " msg)
  }
   */
    //fn def into  vairable
    val printHello = (msg: String) => println("Hello " + msg)
    printHello("World !")
    printHello("!ND!A")

  }
}
