import java.io._

object DemoDFileWrite {
  def main(args: Array[String]): Unit = {
//option 1: using printWriter
    val outputFile1 = "outputFile1.txt"
    val outFile1 = new File(outputFile1) //1. create an instance of file
    val outWriter1 = new PrintWriter(outFile1)//create instance of printWriter

    //Write into file
    outWriter1.write("Hello World !!! \n")
    outWriter1.write("Hello India !!! \n")
    outWriter1.write("Hello Delhi !!! \n")
    outWriter1.write("Hello Rohini !!! \n")

    //4. close the file
    outWriter1.close()
    //error checking in printWriter
    println("Error is : " + outWriter1.checkError())//false meaning no error

//Option 2: using fileWriter
    var outputFile2 = "outputFile2.txt"
    val outFile2 = new File(outputFile2) //1. create an instance of file
    val outWriter2 = new FileWriter(outFile2)//create instance of fileWriter

    //3. write into file
    outWriter2.write("Saare jaha se Achchha !\n")
    outWriter2.write("Hindustan hamara, hamara !!\n")
    outWriter2.write("saare jahaan se achha!!!\n")

    //4. closing the file
    outWriter2.close()

//Option 3 : using bufferedWriter
      var outputFile3 = "outputFile3.txt"
      val outFile3 = new File(outputFile3) //1. create an instance of file
      val outWriter3 = new FileWriter(outFile3)//2. create instance of BufferedWriter

      val bufferedWriter3 = new BufferedWriter(outWriter3) //2B: create instance of buffered writer
      //3. write into file
      bufferedWriter3.write("Nanha munna raahi hun,\n desh ka sipaahi hun\n")
      bufferedWriter3.write("Bolo mere sang\n")
      bufferedWriter3.write("Jay hind, jay hind, jay hind!!!\n")

      //4. closing the file
      bufferedWriter3.close()


  }
}
