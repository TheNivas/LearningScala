object DemoQNestedFunction {
  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("!ND1A")
  }
  def printHello(str: String) =  { //3 level of fn

    def printSomeThing(str1: String, str2 : String) = {
      printSomethingElse(str1 + " " + str2)

      def printSomethingElse(finalString: String) = {
        println(finalString)
      }
    }
    printSomeThing("Hello", str)
  }


}
