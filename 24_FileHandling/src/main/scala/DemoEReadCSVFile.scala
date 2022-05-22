object DemoEReadCSVFile {
  def main(args: Array[String]): Unit = {
    val sampleFile = "sampelCSVFile.csv"
    scala.io.Source.fromFile(sampleFile).getLines().foreach(x => println(x))
    println(); println()

    //or use for loop for more control on what to print
    var lines = scala.io.Source.fromFile(sampleFile).getLines()
    for (line <- lines) {
      if (line != "name, address, age"){
        println(line)
      }
    }
    println(); println()


    //or
    lines = scala.io.Source.fromFile(sampleFile).getLines()
    for (line <- lines) {
      if (line != "name, address, age")
      {
        val Array(name: String, address: String, age: String) = line.split(',')
        println(s"Name is $name, address is $address and Age is : $age")

      }
    }


  }
}
