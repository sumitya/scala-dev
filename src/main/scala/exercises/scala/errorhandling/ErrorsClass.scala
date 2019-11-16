package exercises.scala.errorhandling

import scala.io.Source
import scala.util.{Failure, Success, Try}

object ErrorsClass extends App{

  def tryErrors() = {

    val indexedLines = Try(Source.fromFile("").getLines().zipWithIndex)

    indexedLines match {
      case Success(lines) => lines.foreach{
        element => println(element._1)
      }
      case Failure(exception) => println(exception.printStackTrace())
    }
  }

  def tryEither(x:Int) = {
  /*
    Either is just like Option
    Right is just like Some
    Left is just like None, except you can include content with it to describe the problem
    A common use of Either is as an alternative to Option for dealing with possible missing values.
    In this usage, scala.None is replaced with a Left which can contain useful information.
    Right takes the place of Some. Convention dictates that Left is used for failure and Right is used for success.
  */

        if (x < 0) Left("x must be positive")
        else Right("someval")
  }


}
