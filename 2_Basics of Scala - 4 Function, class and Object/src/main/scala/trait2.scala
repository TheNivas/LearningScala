trait Base {
  def op: String
}

trait Foo extends Base {
  override def op = "foo"
}

trait Bar extends Base {
  override def op = "bar"
}

class AB extends Foo with Bar
class BC extends Bar with Foo


object trait2 {
  def main(args: Array[String]): Unit = {
    println((new AB).op)
    // res0: String = bar

    println((new BC).op)
    // res1: String = foo
  }
}
