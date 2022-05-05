object DemoSScurryFunction {
  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World !"

    println("str1 and str2 using fn def: " + printSomething(str1, str2)) // instead of this: we can write
    println("str1 and str2 using scurrying: " + printScurrying(str1)(str2))  //chaining of fn
    println("str1 and str2 using fn as var : " + printScurryingVar(str1)(str2))  //fn as var

    //partially applied fn byeFunction(str)
    println("bye + str2 using partially applied fn _: " + byeFunction(str2))
  }

  def printSomething(str1: String, str2: String): String ={
    return (str1 + " " + str2)
  }

  def printScurrying(str1: String) (str2: String): String = {
    return (str1 + " " + str2)
  }

  //as fn variable
  def printScurryingVar(str3: String)= (str4: String) => str3 + " " + str4

  //
  val byeFunction = printScurrying("Bye")_

}
