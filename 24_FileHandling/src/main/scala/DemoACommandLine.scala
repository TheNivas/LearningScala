//Read from command Line: library scala.io._
object DemoACommandLine {
  def main(args: Array[String]): Unit = {
    println("Enter you Name:")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)

    println("Enter you phone nUmber:")
    var number = scala.io.StdIn.readLine()
    println("Hi " + name + "!!  your phone number is " + number)

    println("Hello " + name + " What is your Age: ")
    // depracated :
//    var age = Console.readLine()
    //instead we can use this:
    var age = scala.io.StdIn.readLine.toInt //or
//    var age = scala.io.StdIn.readInt()
    println("and you age is: " + age)
  }
}
