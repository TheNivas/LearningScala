object DemoBArrays {
  def main(args: Array[String]): Unit = {
    var marks = Array(62, 82, 55, 66, 63, 73, 85, 53, 55, 65)
    //accessing option 1: using for loop
    println("accessing option 1: using for loop:")
    for (mark <- marks) {   //Accessing the elements of array
      println(mark)
    }
  //option 2: using foreach loop
    println("accessing option 2: using foreach loop:")
    marks.foreach(println)

    //Average Marks
    //find avg marks using option 1: for loop and option 2: foreach loop
    var averageMarks = 0
    //option 1: for loop
    var totalMarks = 0
    for (mark <- marks) {
      totalMarks += mark
    }

    //using foreach loop.
    //foreach: can give you single as well as multiple output, we use fn to each array element.

      totalMarks = 0
    marks.foreach(mark => totalMarks += mark)
//  marks.foreach(totalMarks += _) // short hand notation

    //map
    //always gives multiple outputs
    println("manipulating array using map adding 10 to each element:")
    //    var newMarks = marks.map(mark => mark + 10)
    var newMarks = marks.map(_ + 10) //shorthand notations
    newMarks.foreach(println)

    println("manipulating array using for loop instead -> adding 10 to each element:") //but not preferred
    val result = for(mark <- marks) yield {mark + 10}
    result.foreach(println)

    averageMarks = totalMarks/marks.length
    println("Average Marks: " + averageMarks)
  }
}
