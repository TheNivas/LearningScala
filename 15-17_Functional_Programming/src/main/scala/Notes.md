# Functional Programming - 1
## Functions:
Group of statements for perfomain specific task.
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
2.  you can not hae more than one * means only one variable length variable.
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

# 3. Functional Programming - 3
