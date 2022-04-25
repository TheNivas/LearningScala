import scala.util.control.Breaks

object DemoCForLoop {
  def main(args: Array[String]): Unit = {
    println("=====================Simple For Loop===============================")

    //it will execute for i from 1  to 10 including 10
    for ( i <- 1 to 10){
      println("Value of i is " + i)
    }
    println("=====================Until For Loop===============================")

    //exclusive 1 to 1o not included 10
    for (i <- 1 until 10){
      println("value of i is " + i)
    }
    println("=====================Nested For Loop===============================")
    //Nested  forLoop
    for (i <- 1 to 10){
      for (j <- 1 to 10){
        println(s"Value of i is ${i} and value of j is ${j}")
      }
    }
    println("=====================Scala concise way to write nested For Loop===============================")

    //Scala Concise way
    var count = 0
    for( i <- 1 to 10; j <- 1 to 10; k <-1 to 10){
      println(s"Value of i is ${i} and value of j is ${j} and value of k is $k")
      count +=1
    }
    println(count)

    //List: similar to arrays, immutable
    println("=====================list iteration using For Loop===============================")

    var numberList = List(1,2,3,4,5,6,7,8,9,10)
    for (i <- numberList){
      println(s"Value of i is $i")
    }
    // with if condition
    var numberList2 = List(1,2,3,4,5,6,7,8,9,10)
    for (i <- numberList2 if i%2 == 0){
      println(s"Value of i is $i")
    }
    //yield
    var evenNumberList = for (i <- numberList if i%2 == 0) yield i
    println(evenNumberList)


    // break statement: scala
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

  }}
