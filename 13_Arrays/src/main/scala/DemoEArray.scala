import Array._
//multi-Dimensional array
object DemoEArray {
  def main(args: Array[String]): Unit = {
      //2D array
    var matrixEg = ofDim[Int](5,5)

    for (row <-0 to 4; column <- 0 to 4){
      if (row == column){
        matrixEg(row)(column) = 1
      }
      else {
        matrixEg(row)(column) = 0
      }
    }

    /*
    for (row <- 0 to 4){
      for (column <- 0 to 4){
        if (row == column){
          matrixEg(row)(column)  = 1
        }
        else{
          matrixEg(row)(column) = 0
        }
      }
    }
    */

    for (row <- 0 to 4){
      for (column <- 0 to 4){
        print(matrixEg(row)(column) + " ")
      }
      println()
    }
  }
}
