// Anonymous function
object DemoFAnonymousFunction {
 //Example 1
  /*
  // normal way to defining and increment function
  def increment(x: Int) : Int = {
    x + 1
  }
   */

  //using fn value/anonymous fns
  var increment = (x: Int) => x + 1

  def main(args: Array[String]): Unit = {
    println(" increment fn output is : " + increment(5)) //1
    printHelloWorld() //2
    println(sum(3,6)) //3
  }

  //Example 2: anonymous fn with  0 param and 0 output param
  /*
  def printHelloWorld() = {
    println("Hello World")
  }
   */
  //Using fn value/anonymous fns
  var printHelloWorld = () => println("Hello World")

  //Example 3: anonymous fn with 2 input and 1 output param
  //normal way of defining an increments fn
  def add (x: Int, y: Int) = {
    x + y
  }

  var sum = (x: Int, y: Int) => x + y

}
