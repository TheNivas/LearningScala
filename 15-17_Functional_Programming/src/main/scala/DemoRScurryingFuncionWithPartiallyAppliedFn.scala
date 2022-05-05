object DemoRScurryingFuncionWithPartiallyAppliedFn {
//currying fn decoration
  def add2(a: Int)(b: Int) = a + b

  def main(args: Array[String]): Unit = {
    val sum = add2(29)_   //Partially Applied Function.
    println(sum(5))
  }
}
