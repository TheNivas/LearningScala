## if statement:
```scala
val x = 7
if (x > 5) {
  println("x is greater than 5")
}

```
## if - else statement:
```scala
if (x == 1) {
  println(" x is equal to 1")
}
else if (x == 2) {
  println(" x is equal to 2")
}
else if (x == 3) {
  println(" x is equal to 3")
}
else {
  println(" x is greater than 3")
}
```

## While Loop:
```scala
var x = 12

while (x < 10) {
      println(s"value of x is ${x}")
      x += 1
    }
```

## Do While Loop: Exit control
```scala
var x = 12
do {
  println(s" value of x = $x")
  x += 1
} while (x < 10)
}
```
## For loop:
```scala
//it will execute for i from 1  to 10, including 10 (to)
 for ( i <- 1 to 10){
      println("Value of i is " + i)
    }
```
Another VAriance of for loop: Until
```scala
//exclusive 1 to 1o not included 10
for (i <- 1 until 10){
  println("value of i is " + i)
}
```
Nested For Loop:
```scala
//Nested  forLoop
    for (i <- 1 to 10){
      for (j <- 1 to 10){
        println(s"Value of i is ${i} and value of j is ${j}")
      }
    }
```
More concise and scala way to write nested loop:
```scala
var count = 0
    for( i <- 1 to 10; j <- 1 to 10; k <-1 to 10){
      println(s"Value of i is ${i} and value of j is ${j} and value of k is $k")
      count +=1
    }
    println(count) // 1000
```
List: similar to arrays, immutable <br>
 list in scala is similar to tuple in python
```scala
//List: similar to arrays, immutable
var numberList = List(1,2,3,4,5,6,7,8,9,10)
for (i <- numberList){
  println(s"Value of i is $i")
}
```
with condition
```scala
    var numberList2 = List(1,2,3,4,5,6,7,8,9,10)
    for (i <- numberList2 if i%2 == 0){
      println(s"Value of i is $i")
    }
```
Yield:
```scala
    //yield 
    var evenNumberList = for (i <- numberList if i%2 == 0) yield i
    println(evenNumberList)
```
## Break Statement: scala 2.8
<mark>break is implemented as an object </mark>, so we'll need to make an object
```scala
import scala.util.control.Breaks
val breakObject = new Breaks
    breakObject.breakable {
      for (i <- numberList if i%2 == 0){
        println("Value of i is " + i)
        if (i == 4)
          {
            println("i am breaking at 4")
            breakObject.break()
          }
      }
    }
```
## Infinite Loop
```scala
var i = 5
while (i < 10){
 println("Value of i " + i)
 //if you forget to write next line
 // i += 1
}
```
****End****


