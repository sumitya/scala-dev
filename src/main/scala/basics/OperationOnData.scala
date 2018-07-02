package basics

import io.StdIn._

object OperationOnData {

  type lineData = (String,String, Int,String, Int)

  def parsedata(line:String): lineData = {

    val elements = line.split(",")
    (elements(0),elements(1),elements(2).toInt,elements(3),elements(4).toInt)

  }
  def main(args: Array[String]): Unit = {

    val data = Array.fill(28084)(readLine())
    val parsed = data.map(parsedata)

    //parsed.foreach(println)

    val f1998 = parsed.filter( tp => tp._2 == "F" && tp._3 == 1998)
    val maxnames = f1998.map(_._4).max

    println(maxnames)

    f1998.filter(_._4==maxnames).foreach(println)
  }

}
