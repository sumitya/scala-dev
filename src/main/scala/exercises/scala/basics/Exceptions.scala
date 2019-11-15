package basics

object Exceptions {

  import io.StdIn._

  def takeInput: Int = {
    try {
      readInt
    } catch {
      case e:NumberFormatException => print("Not an Integer")
        takeInput
    }
  }

  def main(args: Array[String]): Unit = {
    val b  = takeInput
    print("value of input is"+b)

  }

}
