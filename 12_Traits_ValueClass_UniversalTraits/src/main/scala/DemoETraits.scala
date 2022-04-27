// Value Class: can not allocate runtime object
// value class always has ONLY 1 Param with type as val
// you can not extend a value class

// value class can't extenda tarit. thats why you've a universal traits.
// can't define any var in a value calss. can only define methods.

//Benefits of value class:

trait CarE extends  Any {
  def print() = { println(this)}
}
//value class
class MercedesE (val x: Int) extends  AnyVal with CarE {
  //  var y = 1 // error
  def hello = {
    println("Hello ")
  }

}
object DemoETraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesE(5)
    m1.print()
    m1.hello
  }
}
