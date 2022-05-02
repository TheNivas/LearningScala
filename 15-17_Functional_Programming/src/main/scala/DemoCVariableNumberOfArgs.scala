//variable number of args in a function
object DemoCVariableNumberOfArgs {
  def printMultipleTimes(n: Int, args: String*)= { // String* means array of string, for int array: Int*
    for (arg <- args) {  //for each element(arg) in args,arg will print n times
      println(arg * n)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, args = "Hello", "World", "India")
  }
}
