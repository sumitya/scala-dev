package scala

import org.scalatest.FunSuite
import tests.scala.basics.Lists

class ListsTest extends FunSuite {

  test("exercises.scala.basics.Lists.patternMatchList"){
    println("Doing the 1st Test...")
    val listInt = 1::2::3::Nil
    val listStr = "Monday"::("Tuesday"::("Wednesday"::Nil))

    assert(Lists.patternMatchList(listInt)===listInt)

  }

  test("exercises.scala.basics.Lists.transformList") {
    val boolList = List[Boolean](true)
    println("Doing the 2nd Test...")
    //assert(Lists.transformList() === true)
    assert(Lists.transformList() === boolList)

  }
}
