class Point {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x : Int = _x
  def x_= (newValue: Int) = {
    if (newValue < bound) _x = newValue else printWarning()
  }

  def y : Int = _y
  def y_= (newValue : Int)  = {
    if (newValue < bound) _y = newValue else printWarning()
  }
  def printWarning() = {
    println("WARNING!! OUT OF BOUNDS")
  }
}
object GetterSetter {
  def main(args: Array[String]): Unit = {
    val point1 = new Point
    point1.x = 99
    println(s" x = ${point1.x}")
    point1.y = 100
  }
}
