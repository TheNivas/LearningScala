import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("src/main/scala/input.txt")
      val a = 10/5
      println(a)
      val array1 = Array(10)
      println(array1(11))
    } catch {
      case e: FileNotFoundException => {
        println("File is not found - Exception received")
      }
      case e: IOException => {
        println("Error while reading file -Exception received")
      }
      case e: ArithmeticException => {
        println("Arithmetic Error Found")
      }
      case e: ArrayIndexOutOfBoundsException =>{
        println("Array index out of bound exception occured")
      }
      case _: Exception => {
        println("it will catch all unhandled exception")
      }
    }
        finally {
        println("It will always get executed irrespective of Exception or not")
      };
    }
}
