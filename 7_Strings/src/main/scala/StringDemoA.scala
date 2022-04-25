object StringDemoA {
  def main(args: Array[String]): Unit = {
    var greetings = "Hello World!"
    println(greetings)
    val newgreetings: String = "Hello India!"
    println(newgreetings)

    //length of string
    var lengthofgreeting = greetings.length
    println(lengthofgreeting)

    //comcat
    var var1  = "Hello "
    var var2 = "World"
    println(var1 + var2) // or
    println(var1.concat(var2))

    var var3 = var1 + var2 +"!"
    //charAt fn:to get char at given index
    println("charAt index 6:" + var3.charAt(6))

    //equals method
    var varA = "Hello World"
    var varB = "Hello World"
    println("Equals fn A & B:" + varA.equals(varB))
    var varC = "Hello India"
    println("equals function a and c: " + varA.equals(varC)) // print true if both strings have same content
    println(varA == varB)// same as equals but it does additional step. It first check varA and varB arenot null.

    println("isempty fn: " + varA.isEmpty)

    //string formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 5000000
    var mileageOfCar = 8.5
    printf("name of the car is %s, cost of the car is %d and mileage of the car is %f", nameOfCar, costOfCar, mileageOfCar)

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


  }
}
