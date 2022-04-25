import java.util.Date
//in java you wirte only on top
//in scala, mostly  import is written on the top
object Demo1{
  def hello() = {
    var date2 = new Date()
    print(date2)
  }

  def main(args: Array[String]): Unit = {
    var date1 = new Date()
    println(date1)
  }
}