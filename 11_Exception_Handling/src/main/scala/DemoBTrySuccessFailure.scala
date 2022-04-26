//not available in java but available in scala
import scala.util.Try
import scala.util.Success
import scala.util.Failure

object DemoBTrySuccessFailure {
  def main(args: Array[String]): Unit = {
    val a = Try(10/0)
    a match {
      case Success(value) => println(value)
      case Failure(exception) => errorHandlingFunction(exception)
    }
  }
  def errorHandlingFunction(exception: Throwable) = {
    println(exception)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")){
      println("Hello , arithmetic exception had occurred")
    }
  }
}
