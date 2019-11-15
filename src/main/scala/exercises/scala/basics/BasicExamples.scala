package basics

object BasicExamples {

  def main(args: Array[String]): Unit = {

    //*********Expressions********//

    //integer no. calculations

    println(1+1)
    println(1*2)

    //string expressions. Anything concatenated with string becomes string

    println("Hello"+1)
    println('c'+"Hi")

    /*float calculations.
    result of calculation is always broadened towards with higher range datatype.
    */
    println(1.2/2.0)
    println(1/1.0)

    //double calculations
    println(1.2D / 1.2)

    //*********Val and Var********//

    // val is a value which will not change. reassignment is not allowed.
    val a = 1 * 2
    println(a)

    //a = 2

    //var is actually is variable/temp. storage in program.  Datatype is optional
    //which is implicit as datatype of output result.
    var b: Int = 1 * 2
    println(a)

    b = 2


    //*********Blocks********//

    //expression or method body can be enclosed around a {} which is block.

    val c = {var p = 2 * 2 + 1
      p * 2

    }
    println(c)

    println(blockFunction(3))

    def blockFunction(a : Int): Int = {
    var p = a * 3 + 1
    p * 2

  }

  }

}
