//Note :  partially implemented fn: 1
import java.util.Date

object DemoNPartiallyAppliedFunction {
  def main(args: Array[String]): Unit = {
    var date = new Date()
    val logWithDate = log(date, _:String) //partially applied fns: _ will the parameter that is expected by partially applied fn
    //calls log fn with params: date , and string
    logWithDate( "Hello 1 ")

    Thread.sleep(2000)
    logWithDate("Hello 2 ")

    Thread.sleep(2000)
    logWithDate("Hello 3 ")

  }
  def log(date: Date, msg: String) = {
    println(msg + date)
  }
}
