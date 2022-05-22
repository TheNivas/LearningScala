# D24: File Handling
* how to handle files 
* print statement
* take input
* read/write from commandline
* similar as java with few addition.
* mostly using java library for this.

### Read from command Line: library `scala.io._`
 #### depracated : <br>
`var age = Console.readLine()` <br>
#### instead we can use this: <br>
`var age = scala.io.StdIn.readLine.toInt` //or <br>
`var age = scala.io.StdIn.readInt()` <br>
#### Demo A:
```scala
//Read from command Line: library scala.io._
object DemoACommandLine {
  def main(args: Array[String]): Unit = {
    println("Enter you Name:")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)

    println("Enter you phone nUmber:")
    var number = scala.io.StdIn.readLine()
    println("Hi " + name + "!!  your phone number is " + number)

    println("Hello " + name + " What is your Age: ")
    // depracated :
    // var age = Console.readLine()
    //instead we can use this:
    var age = scala.io.StdIn.readLine.toInt //or
    // var age = scala.io.StdIn.readInt()
    println("and you age is: " + age)
  }
}
```
### Read a text file:
```scala
object DemoBFileRead {
  def main(args: Array[String]): Unit = {
    val sampleFile = "learningScala.txt" //location of the file

    //option 1
    println("<===================== Option 1 ========================>")
    scala.io.Source.fromFile(sampleFile).foreach(x => print(x))
    println();println()



    //option 2
    println("<===================== Option 2 ========================>")
    val lines = scala.io.Source.fromFile(sampleFile).getLines()
    lines.foreach(x => println(x))
    println()

    //option 2 in concise way using foreach loop:
    scala.io.Source.fromFile(sampleFile).getLines().foreach(x => println(x))

  }
}


```
### HOw to write in command-line
```scala
object DemoCWriteCommandLine{
  def main(args: Array[String]): Unit = {
    println("This is printing at command LIne")
  }
}
```
### How to write in file
```scala
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

```
### Error Handling:
* in case of filewriter exception comes and handled by try catch block
* in case of printwriter: use `checkError` method. for error.
```scala
    println("Error is : " + outWriter1.checkError())//false meaning no error
```
| Topic             | FileWriter + BufferedWriter                                      | PrintWriter                                         |
|-------------------|------------------------------------------------------------------|-----------------------------------------------------|
| Error Handling    | Try-Catch Block                                                  | `checkError' method                                 |
| Flushing the Data | Less costly, flush manually or it'll be flush when you close it. | Costly, it flush after data(every byte ) is written |
| Speed             | Fast                                                             | Slow                                                |


### Read CSV file:
```scala
object DemoEReadCSVFile {
  def main(args: Array[String]): Unit = {
    val sampleFile = "sampelCSVFile.csv"
    scala.io.Source.fromFile(sampleFile).getLines().foreach(x => println(x))
    println(); println()

    //or use for loop for more control on what to print
    var lines = scala.io.Source.fromFile(sampleFile).getLines()
    for (line <- lines) {
      if (line != "name, address, age"){
        println(line)
      }
    }
    println(); println()


    //or
    lines = scala.io.Source.fromFile(sampleFile).getLines()
    for (line <- lines) {
      if (line != "name, address, age")
      {
        val Array(name: String, address: String, age: String) = line.split(',')
        println(s"Name is $name, address is $address and Age is : $age")
      }
    }
  }
}
```
## Serialization:

Serializing an object means taking the data stored in an object and converting it to bytes (or a string). 
