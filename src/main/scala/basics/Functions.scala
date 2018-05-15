package basics

object Functions {

  def main(args: Array[String]): Unit = {

    //anonymous functions


    val a = (x: Int, y: Int) => x + y

    println(a(4,5))

    val b = (p: Int, q: Int) => p * q

    println(b(4,5))

    val c = (a: Int) => ()


    println(c(3))


    //print(x => x + 1)

  }

}
