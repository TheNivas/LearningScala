object DemoGAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listofNumbers = List(32, 33, 55, 42 ,39, 65, 45, 44, 43, 22, 11 )
    listofNumbers.foreach(num => println(s"$num : " + divisibleByThree(num)))

    //2. use with filter
//    var divisibleByThreeOutput = listofNumbers.filter((x: Int) => x%3 == 0)
//    var divisibleByThreeOutput1 = listofNumbers.filter(x => x%3 == 0)
    var divisiblebyThreeOutput2 = listofNumbers.filter(_%3 == 0)
    println(divisiblebyThreeOutput2)
  }
  //1. Traditional way
  /*
  def divisibleByThree(x: Int) = {
    x%3 == 0
  }
  */
  //anonymous way
  var divisibleByThree = (x: Int) => x%3 == 0


}
