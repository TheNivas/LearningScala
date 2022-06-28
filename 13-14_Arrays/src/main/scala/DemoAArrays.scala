object DemoAArrays {
  def main(args: Array[String]): Unit = {
    var marks = Array(62, 82, 55, 66, 63, 73, 85, 53, 55, 65)

    for (mark <- marks) {   //Accessing the elements of array
      println(mark)
    }

    //Average Marks
    var totalMarks = 0
    var averageMarks = 0

    for (mark <- marks) {
      totalMarks += mark
    }
    /*
    //java way
    for (i <- 0 to (marks.length - 1)){
      totalMarks += marks(i)
    }
 */
    print(totalMarks)
    println(marks.length)
    averageMarks = totalMarks/marks.length
    println("Average Marsk: " + averageMarks)
  }
}
