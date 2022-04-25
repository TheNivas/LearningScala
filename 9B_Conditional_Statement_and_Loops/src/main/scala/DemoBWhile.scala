object DemoBWhile {
  def main(args: Array[String]): Unit = {
    var x = 12

//    while (x < 10) {
//      println(s"value of x is ${x}")
//      x += 1
//    }

    do {
      println(s" value of x = $x")
      x += 1
    } while (x < 10)
  }
}
