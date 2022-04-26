import DemoBTrySuccessFailure.errorHandlingFunction // for accessing funciotn from B demo
import scala.util.control.Exception.catching

object DemoCCatching {
  def main(args: Array[String]): Unit = {
    val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => errorHandlingFunction(e))//e for printing exception

    //   for multiple handling
//    val catchExceptions = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply((e => errorHandlingFunction(e)))
    val a = catchExceptions(10/0)

//since we have a "()" in output so we use teh following code
    if (a.!=()){
     println(a)
     }
  }
}
