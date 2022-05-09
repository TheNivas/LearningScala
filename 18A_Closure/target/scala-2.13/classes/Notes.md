# Closure
closures are simple fn wherein variables are defined outside fn definition.
## Example:
### As a fn
```scala
//closures are simple fn wherein variables are defined outside fn definition.

object DemoAclosure {
  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }
  def multiplier (x: Int): Int = {
    x * 10
  }
}
```
### As a variable
```scala
object DemoBClosureAsVar {
  def main(args: Array[String]): Unit = {
    println(multiplier(4))
  }
  var factor = 10
  var multiplier = (x: Int ) => x * factor
//  If variable (eg. factor) is defined outside the fn body, It is called closure
// if var used insdie fn body (i.e: factor) is neither a input param 
//not defined inside fn body

```
If variable (eg. factor) is defined outside the fn body, It is called closure

### Not a closure:
```scala
    //below fn is not a closure, cuz var factor1 is defined in fn body, not outside of fn.
  var multiplier1 = (x: Int) => {
    var factor1 = 1
    x * factor1
```
### Ex: Even or Odd 
```scala
//even or odd no.
object DemoCClosure {
  def main(args: Array[String]): Unit = {
    println(evenOrOdd(23))
    println(evenOrOdd(32))
    println(evenOrOdd(2))
    println(evenOrOdd(3))
    println(evenOrOdd(12))


  }
// In fn definition
  def isEven(x: Int): Boolean = {
    x % 2 == 0
  }

  //in variable
  var div1 = 2
  val isEven1 :(Int => Boolean) = (x) => (x%div1 == 0)
  
  
  def evenOrOdd(x: Int) : String= {
    var evenFlag = isEven1(x)
    if (evenFlag) "Even Number" else "Odd Number"
  }
}

```
