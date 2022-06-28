import Array._
object DemoFArray {
  def main(args: Array[String]): Unit = {
    var marks1 = Array(5, 7, 6, 7, 8, 9, 10)
    var marks2 = Array(9, 4, 6, 2, 7, 8, 3)

    var allMarks = concat(marks1, marks2) //concat is used to combine arrays into one
    allMarks.foreach(println)


    //var rollNo = Array ( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,..............................100 )
    //for that we have range in which end is exclusive
    var rollNo = range(1, 101) // for 1 to 100
    rollNo.foreach(print) // without space
    println
    rollNo.foreach(x => print(x + " ")) // with space
    println

    var evenNo = range(0, 101, 2)
    evenNo.foreach(i => print(i + " "))
  }
}
