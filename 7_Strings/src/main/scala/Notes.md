# Day 7: Strings

collection of characters or numbers.

```scala
val greetings1 = "Hello World !"
val greetings2: String = "Hello India !"
```

intelliJ shortcut for main: "main" + "(ctrl + space + Enter) or Tab  

## Method of length of the string: .length()

i.e.

```scala
val greetings1 = "Hello World !"
var lengthOfString = greetings1.length() //13
```

## Accessor Method

Any method used to get info of an obj is called Accessor method.  

### Concat method

```scala
var var1  = "Hello "
var var2 = "World"
println(var1 + var2) // or
println(var1.concat(var2))
```

### charAt( ) method

```scala
var var3 = var1 + var2 +"!"
//charAt fn:to get char at given index
println("charAt index 6:" + var3.charAt(6))
```

### Equals method

```scala
    var varA = "Hello World"
    var varB = "Hello World"
    println("Equals fn A & B:" + varA.equals(varB))
    var varC = "Hello India"
    println("equals function a and c: " + varA.equals(varC)) // print true if both strings have same content
    println(varA == varB)// same as equals but it does additional step. It first check varA and varB arenot null.

    println("isempty fn: " + varA.isEmpty)
```

### String formatting

```scala
//string formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 5000000
    var mileageOfCar = 8.5
    printf("name of the car is %s, cost of the car is %d and mileage of the car is %f", nameOfCar, costOfCar, mileageOfCar)
```

### Multi Line String

```scala

    //multiLIne string
    var multiLineString =
      """
        |Hello
        |World!
        |HOw
        |Are
        |You
        |""".stripMargin
        println(multiLineString)
// here all the margin before | will be stripped otherwise all teh spaces will be printing as in below case.
    var multiLineStringA =
      """
        Hello
        World!
        HOw
        Are
        You
        """
    println(multiLineStringA)
    //this can be also written as :
    var multiLineStringB =
      """
        $Hello
        $World!
        $HOw
        $Are
        $You
        """.stripMargin('$')
    println(multiLineStringB)
```

### String interpolation

```scala
    //string interpolation
    //1. 's' interpolator
    var name = "PM Modi"
    println("Hello " + name + ", HOw are you?")
    println(s"Hello $name, How are YOu ??")

    //2. 'f' interpolator
    var salary = 20000.2
    println(f"Name is $name%s and salary is $salary%8.2f and designation is PM")

    //3. Raw interpolater: similar to 's' but doesn't perform escaping -\n \t
    println(s"Hello World! \nHow are you?")
    println(raw"Hello World! \nHow are you?")

```

Go through scala string method online.

```scala
OUTPUT:
/*
Hello World!
Hello India!
12
Hello World
Hello World
charAt index 6:W
Equals fn A & B:true
equals function a and c: false
true
isempty fn: false
name of the car is Mercedes, cost of the car is 5000000 and mileage of the car is 8.500000
Hello
World!
HOw
Are
You


        Hello
        World!
        HOw
        Are
        You
        

Hello
World!
HOw
Are
You
        
Hello PM Modi, HOw are you?
Hello PM Modi, How are YOu ??
Name is PM Modi and salary is 20000.20 and designation is PM
Hello World! 
How are you?
Hello World! \nHow are you?

 */
```

<h1 align="center"><sub>***</sub> End <sub>***</sub></h1>