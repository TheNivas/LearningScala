# Packages and Import
## packages:
* used to create a namespace -> to modularize the code<br>
makes code easy to use.

i.e:  a project to ingest the data:
1. connector {SQL, Oracle, HANA, mainframe, azure, kafka}
2. cleansing and validate the data
3. transformation (of the data replacing the empty etc.)
4. store (write in some DB: cassandra, HBase, Hive, SQL etc.)
5. Audit: checking all the data are imported or not...?

Syntax:
```scala
package connector{ //package is the first non-commented line
  class kafkaConnector{
    //...
  }
}
```
```scala
package connector

object SQLconnector {

}
```
One package have two package inside: Package nesting => very rare
```scala
package inside package
    package connector {
      package getCount {
        class KafkaConnector
      }

      package getData {
        class KafkaConnector
      }
    }
```
syntax
```scala
package connector
//Syntax
package <top-level-domain>.<domain-name>.<project-name>
//i.e.
package com.google.selfDrivingCar.camera
//selfDrivingCar -> project
//camera -> package
```
examples:
```scala
//packages
com.google.selfDriving.camera
com.uber.selfDrivingCar.camera
com.tesla.selfDrivingCar.camera


//importing => Accessing members of packages
import com.google.selfDriving.camera
import com.uber.Drivingcar.sensor
import com.tesla.driverless-motor

```
### Package: modularize the code
### import: Accessing members of package import

## Imports:
By Default packages:
* java.lang._
* Scala._
* scala.Predef

1. import <package_name>._ : import everything from that package.
```scala
import java.util._ // imported everything of this package
val date1 = new Date() //Output: val date1: java.util.Date = Mon Apr 25 19:17:12 IST 2022
val hashset1 = new HashSet()//Output: val hashset1: java.util.HashSet[Nothing] = []

```
## Abstract Class:
You can't create an instance of an abstract class cuz it doesn't contain the complete inplementation.
The purpose of an abstract class is to function as a base for subclasses. It acts like a  template,
or an empty or partially empty structure, yuou should extend it and build on it before you use it.

2.  to import only given class/trait/interface from that package.
ie. import <package_name>.<GivenClass/trait/interface>
```scala
val hashset1 = new HashSet() //gives error cuz didn't import.
import java.util.HashSet
val hashset1 = new HashSet() //Output: val hashset1: java.util.HashSet[Nothing] = []
```
3. import multiple classes
import <package_name>.{<GivenClass/trait/interface>,..,...,...,} <br>
imports <mark>multiple classes/trait/interface</mark> from that package<br>
Eg.
```scala
 val hashset1 = new HashSet() //gives error cuz didn't import.
val date1 = new Date() //gives error cuz didn't import.


scala> import java.util.{HashSet, Date} //importing...

scala> val date1 = new Date()
//Output: val date1: java.util.Date = Mon Apr 25 19:48:12 IST 2022

scala> val hashset1 = new HashSet() //gives error cuz didn't import.
//Output: val hashset1: java.util.HashSet[Nothing] = []

```
4. Rename/alias an imported class<br>
import <package_name>.{<class_Name> => alias}
ie.
```scala
import java.util.{Date => UtilDate}
```
only used when there is a class with the same name.<br>
```scala
import java.util.Date

val date1 = new Date()
//Output = val date1: java.util.Date = Mon Apr 25 19:55:02 IST 2022

import java.sql.Date

val date1 = new Date()
//pick-up the latest imported package but couldn't figure out which constructor to use.
val date1 = new Date(45)
//output= val date1: java.sql.Date = 1970-01-01
```
Solution to above problem is  to rename the imported package.
```scala
import java.util.{Date => UtilDate}
import java.sql.{Date => sqlDate}
val date = new Date() //error
val date = new UtilDate() //val date: java.util.Date = Mon Apr 25 20:12:19 IST 2022
val date1 = new sqlDate(121,15,25)
//output= val date1: java.sql.Date = 2022-04-25
```
**Note: in Java, you need to write import statement at teh start of program, 
<br>however in scala you can write import statement anywhere in middle of program.**
<br>if you write on top you can use the package anywhere in the program, <br>
but if we are writing in a fn then it will be available to only that funtion that means scope is limited.
```scala
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
```
```scala
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
```