
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext:Boolean = i < s.length
  def next():Char = {
    val ch = s charAt i
    i += 1
    ch
  }
}

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
/*

*/

object classComposition {
  def main(args: Array[String]): Unit = {
    class RichStringIter extends StringIterator("Scala") with RichIterator
    val richStringIter = new RichStringIter
    richStringIter.foreach(println)
  }
}
