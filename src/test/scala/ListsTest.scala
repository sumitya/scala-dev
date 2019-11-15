package scala

import org.scalatest.FunSuite
import tests.scala.basics.Lists

class ListsTest extends FunSuite {

  test("exercises.scala.basics.Lists.patternMatchList"){
    val listInt = 1::2::3::Nil
    assert(Lists.patternMatchList(listInt)===listInt)
  }

}
