# Exception Handling.
Generally we don't want and error to occur in our program but still in case some errors are encountered then we can use exception ahandling.

E.g. : 
1. Read a file: ex-> file not found or file is corrupt
2. Div by 0 -> arithmetic expression error

## Error Handling:
* in java we have two expression: checked and unchecked expression
  * checked: class not found, file not found
  * unchecked: 
* we've only unchecked expression in scala.


## exception two ways: Throw  and handle
* Handle:
  * Try - Catch
  * try [ class ] - success / failure
  * catch object

```scala
import java.io.FileReader

object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    val f = new FileReader("input.txt") //gives an error cuz it doesn't exist

  }
}
```

### After creating a file of the same name in folder:

```scala
val f = new FileReader("src/main/scala/input.txt");
```

Now 
## A. Exception handling: try-catch

```scala
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("src/main/scala/input.txt");
    } catch {
      case e: FileNotFoundException =>{
        println("File is not found - Exception received")
      }
      case e: IOException => {
        println("Error while reading file -Exception received")
      }
    }
  }
}
```

if file was not found it will give file not found error and if file was found then it will just execute without any output on the screen.
<br>
Divide by zero error:

```scala
    try {
      val a = 10/0
      println(a)
    } catch {
      case e: FileNotFoundException =>{
        println("File is not found - Exception received")
      }
      case e: IOException => {
        println("Error while reading file -Exception received")
      }
}
```

It'll give error: " / by zero " and it asks us to import ArithmeticException:

```scala
    try {
      val a = 10/0
      println(a)
    } catch {
      case e: FileNotFoundException =>{
        println("File is not found - Exception received")
      }
      case e: IOException => {
        println("Error while reading file -Exception received")
      }
      case e: ArithmeticException => {
        println("Arithmetic Error Found")
      }
    }
  }
}
```

## finally block: 
**always execute no matter what**<br>
no matter if program is successfully completed or not. 
<br> i.e. <br>

* closing of files.
* in the last example the file is opened in read mode so there's not a problem if it;s not closed.
* if file is opened in write mode then it is must to close the file.

### to handle all exception that was not descirbed before

```scala
 case _: Exception => {
  println ("it will catch all unhandled exception")
}
```
### Program:

```scala
import java.io.FileReader // to read a file
import java.io.FileNotFoundException// for exception
import java.io.IOException //for I/O exception
//Arithmetic exception is present in java.lang and imported by default


object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("src/main/scala/input.txt")
      val a = 10/0
      println(a)
      var array1 = Array(10)
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
      case _: Exception => {
        println("it will catch all unhandled exception")
      }
    }
        finally {
        println("It will always get executed irrespective of Exception or not")
      }
    }
}
```
Output:
Arithmetic Error Found <br>
It will always get executed irrespective of Exception or not<br>

### out of index eror:

```scala
      val array1 = Array(10)
      println(array1(11))
```
if it will be run with above code then it'll give **it will catch all unhandeld exception**
so we need to add ArrayIndexOutOfBoundException handler<br>
i.e.<br>

```scala
      case ex: ArrayIndexOutOfBoundsException => {
        println("Array index out of bound exception occured")
      }
```
### name of the case doesn't matter, we can use anything for that.

```scala
      case xyz: ArrayIndexOutOfBoundsException =>{
  println("Array index out of bound exception occured")
}
```
but people use e generally
<br>
  _  can also be replaced by anything.<Br>
### A. Program full
```scala
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

```

# B. Try Success/Failure
* Available in scala but not in java
import packages: <br>

```scala
import scala.util.Try
import scala.util.Success
import scala.util.Failure
```

```scala
    val a = Try(10/0)
    a match {
      case Success(value) => println(value)
      case Failure(exception) => println(exception)
    }
```
Output:
if Success : result i.e. 5 <br>
if Failure : java.lang.ArithmeticException: / by zero
<br>

we can even define a function to do handle the success or failure.

### Program B full
```scala
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

```

## C. Catching Object
```scala
import scala.util.control.Exception.catching

val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => println("Arithmetic exception has occurred"))//e for printing exception
val a = catchExceptions(10/5)
println(a)
```
Output: 2
**if failure:**
```scala
    val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => println("Arithmetic exception has occurred"))//e for printing exception
    val a = catchExceptions(10/0)
    println(a)
```
Output: Arithmetic exception has occurred <br>
() 
<br>
it prints () extra to stop printing we'll do :
```scala
//since we have a "()" in output so we use teh following code
    if (a.!=()){
     println(a)
     }
```
Like in B. we can also pass function instead of printing the error.
<br>i.e.<br>
```scala

```

