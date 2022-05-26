# Day 5: Constructors:
When an object is created, something is called and that is constructor and then constructor creates an instance of the class.<br>
Two Types:
* Primary Constructor
* Auxilary Constructor
  **Demo:**
 ```scala
class Demo {
  val x = 5
  val y = 3
  def getVAlue = {println(s"x = $x and y = $y")}
}
//objects
val demo1 = new Demo
val demo2 = new Demo
```
Example 1:
```scala
// Program No.: 1 (primary constructor)
class DemoClass {
  val x = 2
  val y = 3

  def addNumber(): Int= {x + y}
  println(s"x = ${x} and y = ${y}")
}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello World !!")

    val demoObject1 = new DemoClass
    val result = demoObject1.addNumber()
    println(s"Result of adding numbers ${demoObject1.x} and ${demoObject1.y} are: $result")

  }
/*
Output:
Hello World !!
x = 2 and y = 3
Result of adding numbers 2 and 3 are: 5
 */
}
```
Exmaple 2: Primary(parameterized) constructor:
```scala
// Program No.: 2 => Parameterized Constructor
class DemoClass1 (val a : Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  def addNumber() = x + y
  println(s"x = ${x} and y = ${y} and z = $z")
}


object ConstructorDemo1 {
  def main(args: Array[String]): Unit = {
    val demoObject2 = new DemoClass1(2,5.4,"Nivas")
    val result = demoObject2.addNumber()
    println(s"Result of adding numbers ${demoObject2.x} and ${demoObject2.y} are: $result")
  }

}

```