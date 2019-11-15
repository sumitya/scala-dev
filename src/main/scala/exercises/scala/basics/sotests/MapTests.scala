package tests.scala.basics.sotests

object MapTests {

  def main(args: Array[String]): Unit = {


    val map = Map(
      "v1" -> Map("p1" -> List(3, 4),"p2" -> List(8, 10)),
      "v2" -> Map("p1" -> List(5, 6), "p2" -> List(11, 12))
    )

  }
}
