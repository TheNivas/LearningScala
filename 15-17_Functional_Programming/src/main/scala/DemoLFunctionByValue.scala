object DemoLFunctionByValue {
  def main(args: Array[String]): Unit = {
    println("Main fn: " + exec(time())) // time is executed first and then exec fn, fn in parameter always executed first.
  }

  def time(): Long = {
    println("inside the fn:")
    return System.nanoTime()
  }

  def exec(t: Long): Long = {
    println("Entering exec fn:")
    println("time: " + t)
    println("Exiting from exec fn")
    return t
  }
}
