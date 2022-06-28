# Day 23: Tuples Options and Iterator

## Tuples

* Fixed no. of elements (1 to 22)
* immutable

### A. Define a Tuple

```scala
scala> val tuple1 = (2, "String Data", 3.223)
val tuple1: (Int, String, Double) = (2,String Data,3.223)
                                                                                                                                                                                                                   
scala> tuple1.getClass
val res59: Class[? <: (Int, String, Double)] = class scala.Tuple3
                                                                                                                                                                                                                   
scala> val tuple1 = (2, "String Data", 3.43,22.3)
val tuple1: (Int, String, Double, Double) = (2,String Data,3.43,22.3)
                                                                                                                                                                                                                   
scala> tuple1.getClass
val res60: Class[? <: (Int, String, Double, Double)] = class scala.Tuple4
                                                             
```

Note: you can also create a tuple as below:

```scala
scala> val tuple1 = new Tuple4(2, "String Data", 3.43,22.3)
val tuple1: (Int, String, Double, Double) = (2,String Data,3.43,22.3)
  
//Tuple2 means 2 element is required as params of new tuple
scala> val tuple1 = new Tuple2(2, "String Data", 3.43,22.3)
-- Error: ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1 |val tuple1 = new Tuple2(2, "String Data", 3.43,22.3)
  |                                          ^^^^
  |                                          too many arguments for constructor Tuple2 in class Tuple2: (_1: T1, _2: T2): (T1, T2)
1 error found

```

### B. Accessing element in tuple

```scala
scala> tuple1._1 // for first element, it start with 1 not 0
val res62: Int = 2
                                                                                                                                                                                                                   
scala> tuple1._2
val res63: String = String Data
                                                                                                                                                                                                                   
scala> tuple1._3
val res64: Double = 3.43
                         
//convert it to string.
scala> tuple1.toString
val res65: String = (2,String Data,3.43,22.3)
                                                                                                                                                                                                                   
scala> val tuple2 = (1, "Hello There")
val tuple2: (Int, String) = (1,Hello There)
                                                                                                                                                                                                                   
scala> tuple2.getClass
val res66: Class[? <: (Int, String)] = class scala.Tuple2
       
//to swap values position
scala> tuple2.swap
val res67: (String, Int) = (Hello There,1)
 
//List of tuples:
scala> val carList = List(("mercedes", "High Range"), ("BMW", "High Range"), ("Toyota", "Mid Range"), ("jaguar", "High Range"))
val carList: List[(String, String)] = List((mercedes,High Range), (BMW,High Range), (Toyota,Mid Range), (jaguar,High Range))
                                                             
```

### Tuple inside list

```scala
                      
scala> val carList = List(("mercedes", "High Range"), ("BMW", "High Range"), ("Toyota", "Mid Range"), ("Jaguar", "High Range"))
val carList: List[(String, String)] = List((mercedes,High Range), (BMW,High Range), (Toyota,Mid Range), (Jaguar,High Range))
                                                                                                                                                                                                                   
scala> carList.foreach{ 
     | case ("Jaguar", range) => println("Car is jaguar and the range is " + range)
     | case _ => 
     | }
Car is jaguar and the range is High Range

```

Note:Tuple is not used much, instead of tupple most people will use case class.

```scala
scala> val student1 = (1, "xyz")
val student1: (Int, String) = (1,xyz)
```

problem with tuple is its not have much readablity just like above example.  
So iterpreting is very tedious task and less readable.  
For better readability people use case class.  
i.e.:

```scala
//option 1: usidng a tuple, no code readability .Next person doesn't know "abc" and "xyz" is what????
scala> val student1 = (1, "abc", "xyz")
val student1: (Int, String, String) = (1,abc,xyz)
                                                                                                     
//using a case class. Good code readablity.
scala> case class Student(rollNo: Int, firstNmae: String, lastName: String)
// defined case class Student
                                                                                                                                
scala> val student1 = Student(1, "abc", "xyz")
val student1: Student = Student(1,abc,xyz)

```

above both are performing same task but case class is more readable.

## Options

* similar to HashMap in java, gives value or Null
* `options[T] => some[T] or None`

### A. Define

```scala

scala> val option1: Option[Int] = Some(10)
val option1: Option[Int] = Some(10)
                                                                                                                                                                                                                   
scala> //or
                                                                                                                                                                                                                   
scala> val option2 = Some(10)
val option2: Some[Int] = Some(10)

//option here is parent class, if we don't describe it then it will produce its child class (Some)  
scala> val option1: Option[Int] = Some(10)
val option1: Option[Int] = Some(10)
  
//error bcz option1 is defined as val not var
scala> option1 = None
-- [E052] Type Error: ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1 |option1 = None
  |^^^^^^^^^^^^^^
  |Reassignment to val option1

longer explanation available when compiling with `-explain`
1 error found
            
//declared as a var
scala> var option1: Option[Int] = Some(10)
var option1: Option[Int] = Some(10)
                                                                                                                                                                                                                   
scala> option1 = None
option1: Option[Int] = None
                                                                                                                                                                                                                   
```

When option is defined as Int i.e. `option1` it is able to changed to NOne,  
but if we define it without Int i.e. `option2` it is not changing to none.. Why??,  
 bcz it is defined as some by default and when we try to change that it's still some,  
so we can change value from to some(a) to some(b) but can't change it to none.

```scala
                        
scala> //if defined directly

scala> val option2 = Some(10)
val option2: Some[Int] = Some(10)
                                                                                                                                                                                                                   
scala> options2 = None
-- [E006] Not Found Error: ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1 |options2 = None
  |^^^^^^^^
  |Not found: options2

longer explanation available when compiling with `-explain`
1 error found
                                                                                                                                                                                                                   
scala> //Why give error????
                                                                                                                                                                                                                   
scala> val option2 = Some(5)
val option2: Some[Int] = Some(5)
                                                                                                                                                                                       
```

#### b. isEmpty method

```scala
                                                                                                                                                                                                                   
scala> var option1: Option[Int] = Some(10)
var option1: Option[Int] = Some(10)
                                                                                                                                                                                                                   
scala> option1.isEmpty
val res9: Boolean = false
                                                                                                                                                                                                                   
scala> option1 = None
option1: Option[Int] = None
                                                                                                                                                                                                                   
scala> option1.isEmpty
val res10: Boolean = true

```

#### C. Get method

```scala
scala> var cars  = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range")
var cars: Map[String, String] = Map(Mercedes -> High Range, BMW -> High Range, Toyota -> Mid Range, Jaguar -> High Range)
                                                                                                                                                                                                                   
scala> cars.get("BMW")
val res11: Option[String] = Some(High Range)
                                                                                                                                                                                                                   
scala> //gives option as a output.
                                                                                                                                                                                                                   
scala> cars.get("Nano")
val res12: Option[String] = None
                                                                                                                                                                                                                   
scala> //get method returns with datatype as options: Some or None

scala> cars("Nano")
java.util.NoSuchElementException: key not found: Nano
at scala.collection.immutable.Map$Map4.apply(Map.scala:517)
... 30 elided

```

#### D. to remove Some and None

```scala
scala> var cars  = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range")
var cars: Map[String, String] = Map(Mercedes -> High Range, BMW -> High Range, Toyota -> Mid Range, Jaguar -> High Range)
  
//fn to remove Some and None and converting it to string.
scala> def removeSome(x: Option[String]) = {
     | x match {
     | case Some (y) => y
     | case None => "Not Found"
     | }
     | }
def removeSome(x: Option[String]): String
                                                                                                                                                                                                                   
scala> removeSome(cars.get("Jaguar"))
val res16: String = High Range
                                                                                                                                                                                                                   
scala> removeSome(cars.get("Nano"))
val res17: String = Not Found
         
```

#### E. get will give error if option is defined as `None` bcz it doesn't have any method, but if it was some then it will retrieve the element

```scala
scala> var option1: Option[Int] = None
var option1: Option[Int] = None
                                                                                                                                                                                                                   
scala> option1.get
java.util.NoSuchElementException: None.get
  at scala.None$.get(Option.scala:627)
  at scala.None$.get(Option.scala:626)
  ... 30 elided
                                                                                                                                                                                                                   
```

#### F. instead of get you can use getOrElse()

```scala
scala> var option1: Option[Int] = None
var option1: Option[Int] = None

// if not found output wiil be given zero
scala> option1.getOrElse(0)
val res21: Int = 0
                  
//or 10 in this case
scala> option1.getOrElse(10)
val res22: Int = 10

//but ir some is defined then                                                                                                                                                                                                                   
scala> var option1: Option[Int] = Some(101)
var option1: Option[Int] = Some(101)
                                                                                                                                                                                                                   
scala> option1.getOrElse(10)
val res23: Int = 101
                                                                                                                                                                                                                   
```

## Iterator

* not a collection
* parent have methods to give access/iterate over the elements inside the collection
* Next -> gives next element.
* hasNext -> checks if next element is present

```scala
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> iterator1
val res24: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> //it doesn't even gives the content of iterator, so for the element use next fn:
                                                                                                                                                                                                                   
scala> iterator1.next
val res25: String = Hello
                                                                                                                                                                                                                   
scala> iterator1.next
val res26: String = Hi
                                                                                                                                                                                                                   
scala> iterator1.next
val res27: String = Ciao
                                                                                                                                                                                                                   
scala> iterator1.next
val res28: String = Bonjour
                                                                                                                                                                                                                   
scala> iterator1.next
val res29: String = Namaste
                                                                                                                                                                                                                   
scala> iterator1.next
java.util.NoSuchElementException: next on empty iterator
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:965)
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:963)
  at scala.collection.ArrayOps$ArrayIterator.next(ArrayOps.scala:132)
  ... 30 elided
                                                                                                                                                                                                                   
scala> // when no element is present it will gives error , to avoid that first check for the next element usign hasNext
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res31: Boolean = false
                                                                                                                                                                                                                   
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res32: Boolean = true
                                                                                                                                                                                                                   
scala> iterator1.next
val res33: String = Hello
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res34: Boolean = true
                                                                                                                                                                                                                   
scala> iterator1.next
val res35: String = Hi
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res36: Boolean = true
                                                                                                                                                                                                                   
scala> iterator1.next
val res37: String = Ciao
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res38: Boolean = true
                                                                                                                                                                                                                   
scala> iterator1.next
val res39: String = Bonjour
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res40: Boolean = true
                                                                                                                                                                                                                   
scala> iterator1.next
val res41: String = Namaste
                                                                                                                                                                                                                   
scala> iterator1.hasNext
val res42: Boolean = false
                                                                                                                                                                                                                   
scala> //return false,  so don't use next method

```

### isEmpty in iterator

```scala
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> iterator1.max
val res44: String = Namaste
                                                                                                                                                                                                                   
scala> iterator1.min
java.lang.UnsupportedOperationException: empty.min
  at scala.collection.IterableOnceOps.min(IterableOnce.scala:914)
  at scala.collection.IterableOnceOps.min$(IterableOnce.scala:912)
  at scala.collection.AbstractIterator.min(Iterator.scala:1288)
  ... 30 elided
                                                                                                                                                                                                                   
scala> //error why => bcz it is iterated already and the iterator is empty now.
                                                                                                                                                                                                                   
scala> iterator1.isEmpty
val res46: Boolean = true
                                                                                                                                                                                                                   
scala> // so redefine the iterator.
                                                                                                                                                                                                                   
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> iterator1.min
val res47: String = Bonjour
                                                                                                                                                                                                                   
scala> iterator1.isEmpty
val res48: Boolean = true
                                                                                                                                                                                                                   
scala> //now again empty
                                                                                                                                                                                                                   
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> iterator1.isEmpty
val res49: Boolean = false

// for length      
scala> iterator1.length
val res50: Int = 5

```

#### Buffered iterator: store some data in memory

```scala
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste")
var iterator1: Iterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> var bufferedIterator1 = iterator1.buffered
var bufferedIterator1: BufferedIterator[String] = <iterator>
                                                                                                                                                                                                                   
scala> bufferedIterator1.head
val res51: String = Hello
                                                                                                                                                                                                                   
scala> bufferedIterator1.next
val res52: String = Hello
                                                                                                                                                                                                                   
scala> bufferedIterator1.next
val res53: String = Hi
                                                                                                                                                                                                                   
scala> bufferedIterator1.head
val res54: String = Ciao
                                                                                                                                                                                                                   
scala> // current iteration is the head 
                                                                                                                                                                                                                   
scala> bufferedIterator1.tail
-- [E008] Not Found Error: ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1 |bufferedIterator1.tail
  |^^^^^^^^^^^^^^^^^^^^^^
  |value tail is not a member of BufferedIterator[String] - did you mean BufferedIterator[String].take?
1 error found
                                                                                                                                                                                                                   
scala> //ha ha not a fn here
 
```

#### duplicate method: store 2 iterator of same data

```scala
                                                                                                                                                                                                                   
scala> var iterator1 = Iterator("Hello", "Hi", "Ciao", "Bonjour", "Namaste").duplicate
var iterator1: (Iterator[String], Iterator[String]) = (<iterator>,<iterator>)
                                                                                                                                                                                                                   
scala> //duplicate has 2 same data stored  
                                                                                                                                                                                                                   
scala> iterator1._1.next
val res55: String = Hello
                                                                                                                                                                                                                   
scala> iterator1._1.next
val res56: String = Hi
                                                                                                                                                                                                                   
scala> iterator1._1.next
val res57: String = Ciao
                                                                                                                                                                                                                   
scala> iterator1._1.next
val res58: String = Bonjour
                                                                                                                                                                                                                   
scala> iterator1._1.next
val res59: String = Namaste
                                                                                                                                                                                                                   
scala> iterator1._1.next
java.util.NoSuchElementException: next on empty iterator
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:965)
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:963)
  at scala.collection.ArrayOps$ArrayIterator.next(ArrayOps.scala:132)
  at scala.collection.Iterator$Partner$1.next(Iterator.scala:878)
  ... 30 elided

  //when first iteration is over we can still use 2nd iterator.
scala> iterator1._2.next
val res61: String = Hello
                                                                                                                                                                                                                   
scala> iterator1._2.next
val res62: String = Hi
                                                                                                                                                                                                                   
scala> iterator1._2.next
val res63: String = Ciao
                                                                                                                                                                                                                   
scala> iterator1._2.next
val res64: String = Bonjour
                                                                                                                                                                                                                   
scala> iterator1._2.next
val res65: String = Namaste
                                                                                                                                                                                                                   
scala> iterator1._2.next
java.util.NoSuchElementException: next on empty iterator
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:965)
  at scala.collection.Iterator$$anon$19.next(Iterator.scala:963)
  at scala.collection.ArrayOps$ArrayIterator.next(ArrayOps.scala:132)
  at scala.collection.Iterator$Partner$1.next(Iterator.scala:878)
  ... 30 elided
            
 //some methods 
scala> iterator1.
!=                    _1                    drop                  hashCode              map                   productElement        splitAt               toIArray              →
##                    _2                    ensuring              head                  ne                    productElementName    swap                  toList
*:                    apply                 eq                    init                  nn                    productElementNames   synchronized          toString
++                    asInstanceOf          equals                invert                notify                productIterator       tail                  wait
->                    canEqual              formatted             isInstanceOf          notifyAll             productPrefix         take                  zip
==                    copy                  getClass              last                  productArity          size                  toArray               zipped

```

<h2 align="center"><sub>*** </sub> End <sub>***</sub></h2>
