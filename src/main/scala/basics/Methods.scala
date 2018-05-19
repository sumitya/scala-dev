package basics

object Methods {

  //simple method
  def calculation(a: Int, b: Int):Unit = {
    println(a / b)
  }

  //method with function as argument
  def calcWithMethod(a: String,fx:String => String) : String = {

    fx(a).toString
  }

  def justname:String = "It Just Print the name"

  def main(args: Array[String]): Unit = {

    calculation(3,3)

    val fx = (a:String) => a.toUpperCase


    val result = calcWithMethod("example",fx)

    val sameresult = calcWithMethod("example",(a:String) => a.toUpperCase)

    println(result)

    println(sameresult)

    println(justname)
  }
}