package tests.scala.basics

object Lists {
    val fruits = "apples"::"oranges"::"banana"::Nil

    // Is same is below declaration
    val days = "Monday"::("Tuesday"::("Wednesday"::Nil))

    //  : can be seen as a method call to the right operand.

    val months = Nil.::("Jan").::("Feb")

    val listInt = 1::2::3::Nil

    // pattern matching
    def patternMatchList(listInt:List[Int]): List[Any]= {

      listInt match {

        case 1 :: 2 :: xs => listInt

        case x :: Nil => Nil

        case List(x) => List(x)

        case List() => List()

      }

    }
  }
