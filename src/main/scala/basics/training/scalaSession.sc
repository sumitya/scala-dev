//1. The Data Types

val abcInt = 123
val abcFloat = 123.12f
val abcDouble = 123.12D
val abcShort:Short = 123
val abcByte:Byte = 123
val abcUnit = ()
val abcBoolean = true

val abcList:AnyRef = List(1,2,3,4,5)
val abcOption:Option[List[Int]] = Some(List(1,2))
val abcOption1 = None

val abcAssignOption = if (1 > 1) Some(1) else None

if(abcAssignOption.get == 1) println("Hello") else abcAssignOption.get

//val abcSomeOption: Option[Int] = null


//2. val/var/def

val abcVal = 1
var abcVar = 2
//abcVal = 10
abcVar = 20

//def functionName:ReturnType = {}
//def functionName(x:Int):ReturnType = {

def someFunction():Unit = {
  println("Hello World!!!!")
}

//someFunction()


//3. Strings/string interpolation

val abcString = "Sumit"
abcString.charAt(0)
abcString concat("Yadav")

abcString map( a => a.toInt)

println("SOme string" + abcString)

println(s"Some string value is :${abcString}: ${abcVal}")


//4. Expressions y = x2 + x + 1

val x = 1
val y =  {
   x * x + x +1
}

def someOutput = {
  x * x + x +1
}

someOutput

// 5. if/else , loops (for,while,do while)

val today = 2
if(today ==1) println("Office") else if(today ==2)  println("Sh*** office") else println("Yeee..weekend")

for(i <- 0 to 10) println(i)

var j = 1

while(j < 10){
  println(j)
  j = j + 1
}

var k = 1
do{
  println("Value of K is: "+k)
  k = k + 1
}while(k<5)


//6. Functions
// i. anonymous function
//ii. Function Currying / Partially Applied Functions.
//iii. Higher order functions.i. anonymous function


// i. anonymous function

(x:Int,y:Int) => x * y

val abcAnon = () => ()

abcAnon()

def abcAnonDef = (x:Int) => println("Here is the value of x: "+x)

abcAnonDef(1)

// ii. Function currying/Partial applied function

def sum(x:Int)(y:Int):Unit = {

  val sumofTwo = x + y
  println(sumofTwo)
}

val sumPartial = sum(1) _

sumPartial(2)

// iii. higher order functions
val sumofTwo = (first:Int,second:Int) => first + second
val subsOfTwo = (first:Int,second:Int) => first - second

def calc(f:(Int,Int) => Int, a:Int,b:Int) = {
  f(a,b)
}

calc(subsOfTwo,2,3)

//7. Pattern Matching
/* just like java switch
switch(a)
case a
case b
...
*/

val pattern ="abcd"

pattern match {
  case "ab" => println("Found match: "+pattern)
  case "a" => println("Found match: "+pattern)
  case "abc" => println("Found match: "+pattern)
  case _ => println("No Match found!!!")

}

//8. class/object/abstact class/trait

class ScalaTest(args1:Int){
  def this() = this(123)


  def showMeTheWay() = {
    println("Go Straight to the home!!!")
  }
}

new ScalaTest(123)
new ScalaTest()


object ScalaTestObject{
  //public static void main(String[] args){}
  def main(args: Array[String]): Unit = {

    val scalaTestObj = new ScalaTest()
    scalaTestObj.showMeTheWay()

  }
}


// 9. and  10. Please refer below link for abstract class/trait and Type Parameters
// https://github.com/sumitya/scala-dev/blob/master/src/main/scala/basics/GenericsTest.scala

// 11. Companion Objects..Used for static members. Since
//in scala there is no static keywork

class TestCompanion{
  import TestCompanion.amount
  def whatIsAmount = {
    println(amount)

  }
}

object TestCompanion{
  private val amount = 10

}

//12. imports
import scala.collection._
import scala.collection.immutable.AbstractMap

// 13. package objects

import training.TESTCONSTANT

println(TESTCONSTANT)

// 14. case class -> They are generally used as a temporary data holders.

case class Student(name:String, age:Int)

val array = Array[Student](
  new Student("Student1",12),
  new Student("Student2",13)
)


println(array(0).name)
println(array(1).name)

//15. implicits.. compiler checks for any default conversion
// if it doesnt find then implicits else in the last error

implicit def charToString(letter:Char) = letter.toString

val someAlaphbet:String = 'a'

// 16. Access Modifiers
/*
Modifier   |Class|Companion|Subclass|Package |World
no modifier|Y	    |Y	      |Y	     |Y	      | Y
protected	  |Y	  |Y      	|Y       |N       |	N
private	    |Y	  |Y	      |N	     |N       |	N

*: Top-level protected and private members are accessible from inside the package.
*
*/