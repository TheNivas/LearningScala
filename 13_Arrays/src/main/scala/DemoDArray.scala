object DemoDArray {
  def main(args: Array[String]): Unit = {
    var marks = Array(62, 82, 55, 66, 63, 73, 85, 53, 55, 65)

    //redeceRight
    var avg = marks.reduceRight((x,y) => (x+y)/2)

    var avg2 = marks.reduceRight((x,y) => {
      println(s" = value of x is :${x} and value of y is: $y and avg is ${(x+y)/2}")
      (x+y)/2
    })
    var avg3 = marks.reduceRight(_/2 + _/2)

    println(avg)
    println(avg2)
    println(avg3)

    //shorthand notations:
    var totalMarks = marks.reduceRight(_+_)
    println(s"total marks: $totalMarks")


    var maxMarks = marks.reduceRight(_ max _)
    println(s"Maximum marks: $maxMarks")

    var minMarks = marks.reduceRight(_ min _)
    println(s"Minimum marks: $minMarks")

    //without shorthand notation:

    var maxMarks2 = marks.reduceRight((x,y) => x max y)
    println(s"max2 marks: $maxMarks2")
  }
}
