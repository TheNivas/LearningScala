object DemoMFunctionByName {
    def main(args: Array[String]): Unit = {
      println("Main fn: " + exec(time()))
    }

    def time(): Long = {
      println("inside the fn:")
      return System.nanoTime()
    }

    def exec(t: => Long): Long = {
      println("Entering exec fn:")
      println("time 1: " + t)  // in this case time() will be called 3 times
      println("time 2: " + t)
      println("time 3: " + t)
      println("Exiting from exec fn")
      return t
    }

}
