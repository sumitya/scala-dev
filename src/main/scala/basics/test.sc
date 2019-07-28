import scala.util.{Failure, Success, Try}
//https://docs.scala-lang.org/tour/tour-of-scala.html
//https://docs.scala-lang.org/cheatsheets/

//1. Types in Scala
//https://docs.scala-lang.org/tour/unified-types.html

/*val nothing: Nothing   -> No representation,
Explanations about Nothing

http://www.nickknowlson.com/blog/2013/03/31/representing-empty-in-scala/

*/

val user_name = "sumitya"

var name = "sumit"

name = "ya"

val someInt = 123
val abc = 1.23
val someChar = 'A'
val someString = "abcd"
val someDouble = 3.1234565
val someFloat = 2.45f
val someShort = 1234545689

print(f"value of abc is $abc%.3f")

// val and def
// The right hand side of a def definition is evaluated on each use.
// The right hand side of a val definition is evaluated at the point of the definition itself. Afterwards, the name refers to the value.
// y above refers to 4, not square(2).

def square(i: Int):Int = i * i

def somevalue = 10

val x = 2
val y = square(2)

def loop:Int = loop

def defLoopCalled = loop

//val valLoopCalled = loop

//. Function currying

//def CurryFunction(x:Int)(y:Int) = x * y

//val firstargs = CurryFunction(1)

//firstargs(2)

//Higher order functions

//2. Class and Objects in scala
//3. require -> is a test class for unit testing

class Numbers(x: Int, y: Int){
  require(y!=0,"denominator can't be zero")

  def first = x
  def second = y

  var res = 0

  def Div(): Unit ={


   res =  first / second

    print("Addition is " + res)

  }

}

val number = new Numbers(2,2)

number.Div()

// Traits

trait Answer
case object Yes extends Answer
case object No extends Answer

val ans: Answer = Yes

ans match {
  case No => println("No")
  case _ => println("No Value")
}

//4. Constructor of a class

class TwoNumbers(x: Int, y: Int){
  require(y!=0,"denominator can't be zero")

  def first = x
  def second = y

  //this defines another constructor of a class with one arg.
  // since two args constructor  is already defined.

  def this(first:Int) = this(first,1)

  var res = 0

  def Div(): Unit ={

    res =  first / second

    print("Addition is " + res)


  }

}

val obj1 = new TwoNumbers(1,2)

obj1.Div()

//5. Generic Types in Scala(Object Orientation)

class Parking[A](val place: A)

new Parking[Int](123)

new Parking(123)

//6. SubTypes and Generics

def assertAllSubTypes[S <: Int](p:S):S = p


def assertAllSuperTypes[S >: Int](q:S):S = q


def assertMixTypes[S >: Int <: String](r:S) = r

//7. Collections in Scala
//a. List

val fruits1 = List("Apples","Oranges","Grapes")

//fruits1(0)= "Banana"  //this is not allowed since List are immutable
println(fruits1(0))


val fruits2 = "Banana"::Nil
print(fruits2)

print(fruits1.head)

fruits1.tail.head

fruits1.isEmpty

//8. =======Scala Exercises======

"Hello, "++ "Scala!"

print(1 to 10)
print(1.to(10))
print(1 to(10))

1 == 2
1.==(2)

1 ==(2)

1 == 2 + 5

1.==(2).==(false)

println(16 toHexString)

println((0 to 10))

println(0 until 10)

"bar".take(2)

//List

val nums = 1 :: 2 :: 3 :: 4 :: Nil

val nums1 = Nil.::(2).::(3)

//flatmap on list
val xs =
  List(1, 2, 3).flatMap { x =>
    List(x, 2 * x, 3 * x)
  }
xs == List(1, 2, 3, 2, 4, 6, 3, 6, 9)

//options in scala

def sqrt(x: Double): Option[Double] =
  if (x < 0) None else Some(0)

def foo(x: Double): String =
  sqrt(x) match {
    case None => "no result"
    case Some(y) => y.toString
  }


/*
* Error Handling
* */
//1. Try
// Try[A] represents a computation that attempted to return an A. It can either be:
// Success[A]
// Failure

def check(x:Double): Try[String] =
  if(x<0) Failure(new IllegalArgumentException("X shold be > than 1"))
else Success("WOO")

check(1.0)

//2. Either