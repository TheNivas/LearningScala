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
## Example 1:
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
## Exmaple 2: Primary(parameterized) constructor:
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
/*
x = 2 and y = 5.4 and z = Nivas
Result of adding numbers 2 and 5.4 are: 7.4
 */
```
## Default parameter:
* need to pass parameters in sequence or specify plz
* provides the default values while creating params in the class.
Eg.
```scala
// Program No.: 3 => Default Parameter in  Constructor
class DemoClass2 (val a : Int = 1, val b: Double = 1.11, val c: String) {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }
  println(s"x = ${x} and y = ${y} and z = $z")
}


object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    val demoObject21 = new DemoClass2(2,5.4,"Nivas")

//    val demoObject22 = new DemoClass2(,,"Nivas") // !can not be done like that.
    
    val demoObject22 = new DemoClass2(c = "NivaS")

    val demoObject23 = new DemoClass2(b = 22.3, a = 54, c  = "NIVAS")

    val result = demoObject21.addNumber()
    println(s"Result of adding numbers ${demoObject21.x} and ${demoObject21.y} are: $result")
  }

}
```
## Auxiliary Constructor:
* in a class only have one primary constructor.
* can have more than one auxiliary constructor. 1.2,3,4,5,...
```scala
def this () {    // when no param is passed
  this(1,1.1, "Hello Scala !")
  println("auxiliary constructor with zero parameter")
}

def this (a: Int) {   //run if one param is passed
  this(a, 1.1, "Hello Scala !")
  println("auxiliary constructor with One parameter")
}

def this (a: Int, b: Double) { // run if 2 params are passed
  this(a, b,  "Hello Scala !")
  println("auxiliary constructor with Two parameter")
}
```
**if we specify all the params then ==> Primary constructor<br>if we specify zero parameter ==> auxiliary constr with 0 param.**

Eg.
```scala
// Program No.: 4 => Auxiliary Constructor
class DemoClass3 (val a : Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  println(s"x = ${x} and y = ${y} and z = $z")

  def addNumber() = {
    x + y
  }

  def this () {
    this(1,1.1, "Hello Scala !")
  println("auxiliary constructor with zero parameter")
  }

  def this (a: Int) {
    this(a, 1.1, "Hello Scala !")
    println("auxiliary constructor with One parameter")
  }

  def this (a: Int, b: Double) {
    this(a, b,  "Hello Scala !")
    println("auxiliary constructor with Two parameter")
  }

  def this (c: String) {
    this(1, 1.1, c)
    println("Auxiliary constructor with Only string as parameter")
  }
}



object ConstructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demoObject31 = new DemoClass3(2,5.4,"Nivas") // primary constructor

    val demoObject32 = new DemoClass3() //auxiliary constructor with 0 param

    val demoObject33 = new DemoClass3(12) //auxiliary constructor with 1 param

    val demoObject34 = new DemoClass3(32,55.44) //auxiliary constructor with 2 params

    val demoObject35 = new DemoClass3(c = "Hello Peops!") //auxiliary constructor with one parameter which is string

    val result = demoObject31.addNumber()
    println(s"Result of adding numbers ${demoObject31.x} and ${demoObject31.y} are: $result")
  }
}

```

<h2 align="center"><sub>*** </sub> End <sub>***</sub></h2>
