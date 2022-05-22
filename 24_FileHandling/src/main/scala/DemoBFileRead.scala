object DemoBFileRead {
  def main(args: Array[String]): Unit = {
    val sampleFile = "learningScala.txt"

    //option 1
    println("<===================== Option 1 ========================>")
    scala.io.Source.fromFile(sampleFile).foreach(x => print(x))
    println();println()



    //option 2
    println("<===================== Option 2 ========================>")
    val lines = scala.io.Source.fromFile(sampleFile).getLines()
    lines.foreach(x => println(x))
    println()

    //option 2 in concise way using foreach loop:
    scala.io.Source.fromFile(sampleFile).getLines().foreach(x => println(x))

  }
}
