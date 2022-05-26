# Functional Programming - 1
## Functions:
Group of statements for perfoming specific task.
<br>i.e.<br>
age (dob, year) <br>
premium (age, sum_assured) <br>

## Methods and function:
**method: defined in a class; have names, signature, bytecode.<br>**
**function: independent of class; may or may not have name,i.e. +, -, etc**

## Function Definition:
```scala
def functionName([arguments/params]): [return Type] = {
    function body
    return [variable]
}
```
Example: DemoAFunctions.scala
```scala
object DemoAFucntions {

  def sum (x: Int, y: Int)= {
     x+y
  }

  def main(args: Array[String]): Unit = {
    var a = sum(2,3)
    println(a)
  }
}
```
### Example: Functions with named args<br> 
DemoBFunctionWithNamedArgs.scala
```scala
object DemoBFunctionWithNamedArgs {
  def sum(x: Int, y: Int): Int = {
    println(s"value of x is $x")
    println(s"value of y is $y")
    return (x + y)
  }

  def main(args: Array[String]): Unit = {
    var a = sum(y = 2, x = 3)
    println(s"sum = $a")
  }
}
```

### Example 3: variable numbers of arguments
DemoCVariableNumberOfArgs.scala
* String* means Array[String], same goes for int array: Array[Int] = Int*

#### Notes:
1. vaiable number args. i.e. String* should always be at the end/should be the last param
2.  you can not have more than one * means only one variable length variable.
```scala
//variable number of args in a function
object DemoCVariableNumberOfArgs {
  def printMultipleTimes(n: Int, args: String*)= { // String* means array of string, for int array: Int*
    for (arg <- args) {  //for each element(arg) in args,arg will print n times
      println(arg * n)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, args = "Hello", "World", "India")
  }
}
```

### Example 4: DemoDDefaultParameter.scala
```scala
//Default parameter value
object DemoDDefaultParameter {
  def Division(x: Int = 5, y: Int = 1): Double = { // default value of y is 1 if nothing is passed in y param
    println(s"value of x is $x")
    println(s"value of y is $y")
    return (x / y.toDouble)
  }
  def main(args: Array[String]): Unit = {
    
    /*
    //for user input:
    println("Enter 2 nmbers:")
    var a: Int = readInt()
    var b: Int = readInt()
     */
    
    println(Division(3,5))     //x = 3, y = 5 output: 0.6
    println(Division(3))      //x = 3 and y is not provided so default value of y is assigned (1)
    println(Division(3,0))   // x  = 3 and y = 0 output : infinity
    println(Division(y = 3))  //x = default value 5 and y = 3 ou
  }
}
``` 
### Example 5:DemoERecursiveFunction.scala
```scala
object DemoERecursiveFunction {
  def factorial(n: Int):Int = {
    if (n <= 1)  {
      1
    }
    else{
      n * factorial(n-1) //recursive fn
    }
  }

  def   factorialshort(n: Int): Int = {
    if (n <= 1)  1 else  n * factorialshort(n-1)
    //    if (n <= 1) return 1 else  n * factorialshort(n-1) //here return is optional too
  }
  
  def main(args: Array[String]): Unit = {
    var factshort = factorialshort(5)
    println(s"factorial using short fn  $factshort")
    var fact = factorial(5)
    println(s"factorial using normal fn  $fact")
  }
}
```
<h2 align="center"><sub>*** </sub>End<sub> ***</sub></h2>

# Functional Programming - 2
### Example 1: Anonymous Function: lambda fn in another language 
* function without a name and def keyword.
* support first class function... Pass fn as param and define fn values.

```scala
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
```
### Example 2:  Anonymous function
```scala
object DemoGAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listofNumbers = List(32, 33, 55, 42 ,39, 65, 45, 44, 43, 22, 11 )
    listofNumbers.foreach(num => println(s"$num : " + divisibleByThree(num)))

    //2. use with filter
    //    var divisibleByThreeOutput = listofNumbers.filter((x: Int) => x%3 == 0)
    //    var divisibleByThreeOutput1 = listofNumbers.filter(x => x%3 == 0)
    var divisiblebyThreeOutput2 = listofNumbers.filter(_%3 == 0)
    println(divisiblebyThreeOutput2)
  }
  //1. Traditional way
  /*
  def divisibleByThree(x: Int) = {
    x%3 == 0
  }
  */
  //anonymous way
  var divisibleByThree = (x: Int) => x%3 == 0
  
}
```
### Example 3: Anonymous function
```scala
object DemoHAnonymousFunction {
  def main(args: Array[String]): Unit = {
    var listofNumbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // use with Map
    var squareOfNumbers = listofNumbers.map(square)
    println(squareOfNumbers)

    // 2. just using fn definition
//    var squareOfNumbers1 = listofNumbers.map((x: Int) => x * x)
    var squareOfNumbers1 = listofNumbers.map(x => x * x)
//    var squareOfNumbers2 = listofNumbers.map(_ * _) // can't do that: it will expect 2 inputs
    println(squareOfNumbers1)

  }
  //Traditional way
  //  def square(x: Int) = x * x
  //1. Anonymous fn
  var square = (x: Int) => x * x
  var square1:Int = (x: Int) => x * x//optional to write int 
}

```
## Book: Learning Scala by jason Swartz
### Example: 4
```scala
// function call by name.
object DemoICallByName {
  def main(args: Array[String]): Unit = {
    printIncrementValue(increment()) // passing fn as param to another function.
  }

  def increment(): Int = {
    var x = 2
    println("value of x is " + x)
    var y = x + 1
    println("value of x after incrementing is " + y)
    y
  }
  def printIncrementValue(m: => Int): Unit ={
    println("Addition value is  " + m)
  }
}
```
### Example:5 passing fn with param to another function.
```scala
// function call by name.
object DemoJFunctionCallByName
{
  def main(args: Array[String]): Unit = {
    printValue(increment, 2) // passing fn as param to another function.
    printValue(decrement, 3) // passing fn as param to another function.
  }

  def increment(x: Int): Int = {
    println("value of x is " + x)
    var y = x + 1
    println("value of x after incrementing is " + y)
    y
  }
  def decrement(x: Int): Int = {
    println("value of x is " + x)
    var y = x - 1
    println("value of x after decrementing is " + y)
    y
  }
  def printValue(m:(Int) => Int, x: Int): Unit ={
    println("Value is  " + m(x))
  }
}
```
### Example 6 :
```scala
object DemoKFunctionCallByName
{
  def main(args: Array[String]): Unit = {
    println(calculator(add, 2, 4))
    println(calculator(sub, 7, 3))
      println(calculator(mul, 7, 3))
      println(calculator(div, 7, 3))
      println(calculator(rem, 7, 3))

  }

  def calculator(m: (Int, Int) => Int, x: Int, y: Int): Int = {
    m(x,y)
  }
  def add(x: Int, y: Int) = { x + y}
  def sub(x: Int, y: Int) = x - y
  def mul(x: Int, y: Int) = x * y
  def div(x: Int, y: Int) = x / y
  def rem(x: Int, y: Int) = x % y
}

```
<h2 align="center"><sub>*** </sub>End<sub> ***</sub></h2>

# Functional Programming - 3

```scala
object DemoLFunctionByValue {
  def main(args: Array[String]): Unit = {
    println("Main fn: " + exec(time())) // time is executed first and then exec fn, fn in parameter always executed first.
  }

  def time(): Long = {
    println("inside the fn:")
    return System.nanoTime()
  }

  def exec(t: Long): Long = {
    println("Entering exec fn:")
    println("time: " + t)
    println("Exiting from exec fn")
    return t
  }
}

```
Points to remember:
* it will execute the  inside fn "(time())" first then execute the <br> outside fn "exec()"
* since inside fn "time()" get executed first, it calls outside fn "exec()" with the return value of time() as a parameter of "exec()" i.e. **exec(79512772974462)**
*  it is called **fn by value**

Example 2:
```scala
object DemoMFunctionByName {
    def main(args: Array[String]): Unit = {
      println("Main fn: " + exec(time())) // time is executed first and then exec fn, fn in parameter always executed first.
    }

    def time(): Long = {
      println("inside the fn:")
      return System.nanoTime()
    }

    def exec(t: => Long): Long = {
      println("Entering exec fn:")
      println("time: " + t)
      println("Exiting from exec fn")
      return t
    }

}

```
Points to remember:
* it will first execute the outside fn "exec()" and then execute the inside fn "time()" every time t is being referred.
* since outside fn "exec()"  got executed first, it calls Inside fn "time()" using the reference variable t, it is called as **fn by Value**

##### Example :3A : Partially implemented fn:
```scala
//Note : without partially applied fn:
import java.util.Date

object DemoNPartiallyAppliedFunction {
  def main(args: Array[String]): Unit = {
    var date = new Date()
    log(date, "Hello 1")

    Thread.sleep(2000)
    log(date, msg = "Hello 2")

    Thread.sleep(2000)
    log(date, msg = "Hello 3")

  } 
  def log(date: Date, msg: String) = {
    println(msg + " " + date)
  }
}

```

### Example :3B: both doing the same thing but using partially inplementd fn
```scala
//Note :  partially implemented fn:
import java.util.Date

object DemoNPartiallyAppliedFunction {
  def main(args: Array[String]): Unit = {
    var date = new Date()
    val logWithDate = log(date, _:String) //partially applied fns: _ will the parameter that is expected by partially applied fn
    //calls log fn with params: date , and string
    logWithDate( "Hello 1 ")

    Thread.sleep(2000)
    logWithDate("Hello 2 ")

    Thread.sleep(2000)
    logWithDate("Hello 3 ")

  }
  def log(date: Date, msg: String) = {
    println(msg + date)
  }
}
```
### Example 4: Partially implemented fn: 2
```scala
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

```
### Example 5: Nested fn:
```scala
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

```
### Exaample 6: Nested Function 2
```scala
object DemoQNestedFunction {
  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("!ND1A")
  }
  def printHello(str: String) =  { //3 level of fn

    def printSomeThing(str1: String, str2 : String) = {
      printSomethingElse(str1 + " " + str2)

      def printSomethingElse(finalString: String) = {
        println(finalString)
      }
    }
    printSomeThing("Hello", str)
  }
}
```

### Example 7:nNested fn 3
```scala
object DemoRNestedFunction {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorial(7))
    println(factorial(0))
  }
  def factorial(i: Int): Int= {

    def fact(x: Int, prevResult: Int): Int = {
      if (x <= 1)
        prevResult
      else
        fact(x - 1, x * prevResult)
    }
    var z = fact(i, 1)
    return z
  }
}
```

### Example 8: Scurrying fn:
* instead of passing multiple parameter separated with commas, simply pass multiple params in separate bracket.
```scala
object DemoSScurryFunction {
  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World !"

    println("str1 and str2 using fn def: " + printSomething(str1, str2)) // instead of this: we can write
    println("str1 and str2 using scurrying: " + printScurrying(str1)(str2))  //chaining of fn
    println("str1 and str2 using fn as var : " + printScurryingVar(str1)(str2))  //fn as var

    //partially applied fn byeFunction(str)
    println("bye + str2 using partially applied fn _: " + byeFunction(str2))
  }

  def printSomething(str1: String, str2: String): String ={
    return (str1 + " " + str2)
  }

  def printScurrying(str1: String) (str2: String): String = {
    return (str1 + " " + str2)
  }

  //as fn variable
  def printScurryingVar(str3: String)= (str4: String) => str3 + " " + str4

  //
  val byeFunction = printScurrying("Bye")_
}

```
### Example 9:
```scala
object DemoRScurryingFuncionWithPartiallyAppliedFn {
//currying fn decoration
  def add2(a: Int)(b: Int) = a + b

  def main(args: Array[String]): Unit = {
    val sum = add2(29)_   //Partially Applied Function.
    println(sum(5))
  }
}

```
##### Functioning chaining(result you get is chian of fn)
= fn currying (separate params in diff bracket) + partially applied fn (i.e. use _)



<h2 align="center"><sub>*** </sub> End <sub>***</sub></h2>

