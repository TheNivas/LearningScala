import scala.collection.mutable.ArrayBuffer
//ArrayBuffer
object DemoHArray {
  def main(args: Array[String]): Unit = {
    var marks = ArrayBuffer[Int]()
    marks += 10
    marks += 3
    marks += 4
    marks += 9

    println("Printing marks so far:")
    marks.foreach(x => print(x + " "))
    marks += 7
    println
    println("Printing marks so far:")
    marks.foreach(x => print(x + " "))
    println

    marks.append(10)
    marks ++= Array(8, 6, 4, 7, 3, 7, 8, 3, 6, 5, 4 , 9)

    println("Printing marks so far:")
    marks.foreach(x => print(x + " "))
    println

    marks -= 3 //remove 3 from marks, if found multiple it'll remove only the first one
    println("Printing marks so far:")
    marks.foreach(x => print(x + " "))
    println

  }
}
