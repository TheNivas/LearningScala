//closures are simple fn wherein variables are defined outside fn definition.

object DemoAclosure {
  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }
  def multiplier (x: Int): Int = {
    x * 10
  }
}
