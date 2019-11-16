package scala

import java.io.FileNotFoundException

import exercises.scala.errorhandling.ErrorsClass
import org.scalatest.FunSuite

class ErrorsTest extends FunSuite {

  test("exercises.scala.ErrorsClass.tryErrors") {
    val ioexception = new FileNotFoundException()
    assert(ErrorsClass.tryErrors() === ioexception.getMessage)

  }

  test("exercises.scala.ErrorsClass.tryEither") {
    assert(ErrorsClass.tryEither(1) === Right("someval"))

  }

}
