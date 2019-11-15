package tests.scala.filehandling

import java.io.FileNotFoundException
import java.net.UnknownHostException

import scala.io.{BufferedSource, Source}

object FileExceptions {


  def main(args: Array[String]): Unit = {

    var web :BufferedSource = null
    var file: BufferedSource = null

    try {

      web = Source.fromURL("https://www.googleee.com")

      println(web.mkString)

      file = Source.fromFile("abc")

      println(file.mkString)
    }catch{
      case e: UnknownHostException => println("Wrong URL exception"+e)
      case e: FileNotFoundException => println("file doesn't exist"+e)
      case e: Exception => println("Exception Occurred"+e)
    }
  finally{file.close}
 }

}
