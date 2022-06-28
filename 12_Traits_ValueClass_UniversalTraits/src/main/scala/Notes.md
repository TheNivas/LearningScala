# Day 12: Traits, Value Class and Universal Trait

## Traits

* Trait encapsulates methods and field definition
* similar to class
* keyword is "trait"
* can't creat an object of trait
* used only for the purpose of multiple inheritance

```scala
trait  xyz {
  var x = 10
  def double() = 2 * x
}
class xyz1 extends xyz // child class: getting all quality of parent
```

* in class c1(parent) --extends to -> c2 (child)

```scala
class c2 extends  c1
```

* in class (c1 and c2) parent  ---> c3 (child) : not possible  
two parent clas is not a possibility

```scala
class c3 extends c1 and c2 // not possible
```

* but trait can be inherited from two parent trait

```scala
trait c3 extends  c1 with c2
```

* Why Traits: to extends multiple traits  
i.e.

```scala
trait Car {
  def engine(): Unit = {
    println("1000 CC")
  }
  def wheel()
  def breaks()
}
```

Since wheels and breaks are not defined in the above trait teh child funciton which extneds this trait  
will need to defin these function otherwise it'll give error.

```scala
class Mercedes extends  Car {
  def wheel(): Unit = {
    println("4 Wheels")
  }
  def breaks(): Unit = {
    println("Disk Breaks")
  }
}
```

**unimplemented methods in traits should be implemented in class extending given trait.**

### Demo A. Trait program

```scala
trait Car {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC")
  }
  def wheel()                      //body is not present for wheel() method
  def breaks()                     //body is not present for breaks() method
                                   // so their definition should be implemented in class that is extneding trait Car
}

class Mercedes extends  Car {
  def wheel(): Unit = {        //unimplemented wheel() method implemented here
    println("4 Wheels")
  }
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks")
  }
}

object DemoATraits {
  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.engine()
    m1.wheel()
    m1.breaks()
  }
}

```

multiple inheritance in scala is like:

```scala
trait Vehicle {
  
}
trait Car {
  
}
class Mercedes extends Vehicle with Car
```

Example:

```scala
trait FourWheeler{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}


trait CarB {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC in car")
  }
  def wheel()                      //body is not present for wheel() method
  def breaks()                     //body is not present for breaks() method
  // so their definition should be implemented in class that is extneding trait Car
}


class MercedesB extends FourWheeler with CarB { // keyword is extend and with
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks in mercedes")
  }
}


object DemoBTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesB
    m1.engine()
    m1.wheel()
    m1.breaks()
  }
}

```

In above example all different functions are available in different traits/class
i.e.

* engine() fn is defined in CarB trait
* wheel() is defined in FourWheeler Trait and
* breask() is defined in MercedesB class.

Since we're extending one trait with other fn defined in them are usable to the child class/trait.

### What if same function is defined in two traits/classes

```scala
trait FourWheeler{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}

trait CarB {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC in car")
  }
  def wheel(): Unit = {           // what if wheel defined at two places
    println("4 Wheels in car")
  }
  def breaks()                     //body is not present for breaks() method
  // so their definition should be implemented in class that is extneding trait Car
}
```

then in the child class we need to override it like...

```scala
class MercedesB extends FourWheeler with CarB { // keyword is extend and with
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel()
}
```

Fn that will be referred to is from the trait which comes after "With"  
So OUtput will be:  
Engine is 1000 CC in car  
4 Wheels in car  
Disk Breaks in mercedes  

### Demo B. Trait

```scala
trait FourWheeler{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}

trait CarB {                        //keyword : trait
  def engine(): Unit = {           //body is present for engine() method
    println("Engine is 1000 CC in car")
  }
  def wheel(): Unit = {           // what if wheel defined at two places
    println("4 Wheels in car")
  }
  def breaks()                     //body is not present for breaks() method
  // so their definition should be implemented in class that is extneding trait Car
}

class MercedesB extends FourWheeler with CarB { // keyword is extend and with
  def breaks(): Unit = {        //unimplemented breaks() method implemented here
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel()
}


object DemoBTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesB
    m1.engine()
    m1.wheel()
    m1.breaks()
  }
}
```

We can use one more level of abstraction with abstract class. i.e.

```scala
abstract class  Vehicle {
  def category()

}
```

then we will need to extend child fn like this:

```scala
class MercedesC extends Vehicle with FourWheeler with CarC
```

and then we also need to write category function in the MercedesC class, otherwise it'll show error  
i.e.

```scala
  def category(): Unit = {
    println("This is merdedes $$$")
```

### Program

```scala
abstract class  Vehicle {
  def category()

}


trait FourWheelerC{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}


trait CarC {    
  var x = 1000  
  def engine(): Unit = {          
    println("Engine is "+ x +" CC in car")
  }
  def wheel(): Unit = {           
    println("4 Wheels in car")
  }
}


class MercedesC extends Vehicle with FourWheeler with CarC { 
  def breaks(): Unit = {        
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel()
  def category(): Unit = {
    println("This is mercedes $$$")
  }
}


object DemoCTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesC
    m1.engine()
    m1.wheel()
    m1.breaks()
    m1.category()
  }
}
```

What if we want to override the funciton i.e.  
if a funciton is already defined in a class/trait and we want to override it/change its' value  
then we need to override it in the child class.(in MerecedesC class in this case)

```scala
  override def engine(): Unit = {
    println("Engien of Merecedes is 1200 CC")
  }
//or
  override val wheels = 6 
```

### Program Demo C

```scala
abstract class  Vehicle {   //abstract is keyword for abstract class
  def category() //method category is not implemented

}


trait FourWheelerC{
  def wheel(): Unit = {
    println("Four wheeler has 4 wheels.")
  }
}


trait CarC {
  var x = 1000
  val wheels = 4
  def engine(): Unit = {
    println("Engine is "+ x +" CC in car")
  }
  def wheel(): Unit = {
    println(wheels + " Wheels in car")
  }
}


class MercedesC extends Vehicle with FourWheeler with CarC {
  x = 2000      // to override x in carC trait
  override val wheels = 6 // to override val value in carC trait
  def breaks(): Unit = {
    println("Disk Breaks in mercedes")
  }

  override def wheel(): Unit = super.wheel() // to know from where the function needs to be called/referred
  def category(): Unit = {
    println("This is mercedes $$$")
  }

  override def engine(): Unit = {
    println("Engien of Merecedes is "+ x +" CC")
  }
}


object DemoCTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesC
    m1.engine()
    m1.wheel()
    m1.breaks()
    m1.category()
  }
}
```

### Program demo D

```scala
//written by abc developer, and made it open source
//note: when u extend carD  , you should also extend FourWheelerD and VehicleD
abstract class  VehicleD {

}


trait FourWheelerD{

}


trait CarD {
 this: FourWheelerD with VehicleD => {  //this is the implementation
  //now we just can't extends CarD it will need to extends  FourWheelerD with VehicleD
  }
}

//written by xyz developer
//class MercedesD extends VehicleD  with CarD {   //now we cant write like this , it will give error.
class MercedesD extends VehicleD with FourWheelerD with CarD {

}


object DemoDTraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesD

  }
}

```

## Value class

* Value Class: can not allocate runtime object
* value class always has ONLY 1 Param with type as val
* you can not extend a value class

* value class can't extend a trait. that's why you've a universal traits.
* can't define any var in a value class. can only define methods.

### Benefits of value class

* LESS initialization
* better performance
* less memory usage
* Use Case: performance and memory optimization.

```scala
// Value Class: can not allocate runtime object
// value class always has ONLY 1 Param with type as val
// you can not extend a value class

// value class can't extenda tarit. thats why you've a universal traits.
// can't define any var in a value calss. can only define methods.

//Benefits of value class:

trait CarE extends  Any {     
  def print() = { println(this)}
}
//value class
class MercedesE (val x: Int) extends  AnyVal with CarE {
  //  var y = 1 // error
  def hello = {
    println("Hello ")
  }

}
object DemoETraits {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesE(5)
    m1.print()
    m1.hello
  }
}
```

<h2 align="center"><sub>*** </sub> End <sub>***</sub></h2>
