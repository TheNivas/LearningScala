case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
   private def convertCtoF(temp: Double):Double = (temp * 1.8 + 32)
   def forecastInFarenheit: Seq[Double] = temperatures.map(convertCtoF)
   }

object test {
  def main(args: Array[String]): Unit = {
    val salaries = Seq(20000, 30000, 23000)
    val newsalaries = salaries.map(x => x*2)
    println(newsalaries)
    val newsalary = salaries.map(_*3)
    print(newsalary)

//   val x =  new WeeklyWeatherForecast()
  }
}
