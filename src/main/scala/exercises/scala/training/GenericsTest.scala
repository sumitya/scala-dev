package tests.scala.training

trait Species{
  def hasLife():Unit = println("All Species has Life!!!")
}

abstract class Animal extends Species {
  def sound()
  def canSwim()
}

abstract class Human extends Species{
  def hasIntelligence()
  def canSpeak()

}

class Cat extends Animal{
  override def sound(): Unit = println("Mewww Mewww!!!")

  override def canSwim(): Unit = println("No I cant")
}

class PetCat extends Cat{

}
class Kid extends Human {
  override def hasIntelligence(): Unit = println("These days more than a adults!!!")

  override def canSpeak(): Unit = println("A little bit if less than a year!!!")
}

object GenericsTest {

  def main(args: Array[String]): Unit = {
    new SpeciyCheck[Cat](new Cat)
    new SpeciyCheckUpperBound[PetCat](new PetCat)
    new SpeciyCheckLowerBound[Cat](new Cat)

    //new SpeciyCheckUpperLowerBound[PetCat](new PetCat)  //--> This doesn't work coz of Bound Validation
    new SpeciyCheckUpperLowerBound[Cat](new Cat)
  }

}
class SpeciyCheck[T](x:T){
  println("everything just works fine here")

}

class SpeciyCheckUpperBound[T<:Cat](x:T){
  println("Upper Bound works here")
}

class SpeciyCheckLowerBound[T>:PetCat](x:T){
  println("Lower Bound works here")
}

class SpeciyCheckUpperLowerBound[T>:Cat<:Animal](x:T){
  println("Upper and Lower Bound works here")
}
