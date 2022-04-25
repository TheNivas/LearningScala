object Demo2 {
  def hello() = {
    import java.util.Date
    var date2 = new Date()
    print(date2)
  }

  def main(args: Array[String]): Unit = {
    import java.util.Date
    var date1 = new Date()
    println(date1)
  }
}