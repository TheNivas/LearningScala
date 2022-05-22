import java.io.{FileOutputStream, ObjectOutputStream}

  @SerialVersionUID(15L)
  class Animal(name: String, age: Int) extends Serializable {
    override def toString = s"Animal($name, $age)"
  }

case class Person(name: String) extends Serializable

object DemoFSerialization extends App{
  val fos = new FileOutputStream("SampleSerialization.txt")
  val oos = new ObjectOutputStream(fos)

  oos.writeObject(new Animal("Dvorak", 12))
  oos.writeObject(Person("Dijkstra"))
  oos.close()
}
