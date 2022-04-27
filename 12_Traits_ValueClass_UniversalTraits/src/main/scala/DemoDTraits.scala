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
