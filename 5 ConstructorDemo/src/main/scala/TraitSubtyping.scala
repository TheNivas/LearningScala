import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name: String
}

class Dog (val name: String) extends Pet
class Cat (val name: String) extends Pet

object TraitSubtyping {
  def main(args: Array[String]): Unit = {
    val dog = new Dog("Rocky")
    val cat = new Cat("Mailo")
    val Animals = ArrayBuffer.empty[Pet]
    Animals.append(dog)
    Animals.append(cat)
    Animals.foreach(pet => println(pet.name))

  }
}
