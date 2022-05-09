object DemoBClosureAsVar {
  def main(args: Array[String]): Unit = {
    println(multiplier(4))
  }
  var factor = 10
  var multiplier = (x: Int ) => x * factor
//  If variable (eg. factor) is defined outside the fn body, It is called closure
  // if var used insdie fn body (i.e: factor) is neither a input param
  //not defined inside fn body


  //below fn is not a closure, cuz var factor1 is defined in fn body, not outside of fn.
  var multiplier1 = (x: Int) => {
    var factor1 = 1
    x * factor1
  }
}
