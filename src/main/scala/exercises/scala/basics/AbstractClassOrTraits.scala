package basics

//trait is also used as interface of java8 i.e. with default implementation
trait  Animal{
  var color: String     // abstract field
  val noOfAnimals = 10  // concrete field

  def speak(): Unit ={println("All Animals can speak")} //concrete method

}

trait  birds extends  Animal {

  def fly():Unit //abstract method

}

abstract class FlyingAnimals extends  birds{

}

class Dog extends  Animal{

  var color = "Brown"

  override def speak() = {
    println("Bhaww Bhaww...")
  }
}


class Eagle extends birds{

  var color = "Grey"

  override def fly()= {
    println("I can fly high...")
  }
}