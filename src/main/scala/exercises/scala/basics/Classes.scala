package basics

object Classes {

  def printer(name: String): Unit = {

    println("This is basic class method with Name" + name)
  }

  def main(args: Array[String]): Unit = {

    class Builder(val i: Int){

      def Foo() {
        println("Value is initialized: " + i)
      }
    }

   printer("Printer")
    val lst = List(1,2,3,4,5)

    val out = lst.map( a => new Builder(a).Foo())

    val out1 = lst.map( a => Classes.printer(a.toString))

    print(out)
    print(out1)


    //val finalBuilder = lst.foldLeft(new Builder(0).Foo())



  }

  /* If this class is decompiled then static void main
   is not available.So other class than object class is not
   the entry point of program execution.It is only Object class
   which has public static void main method.

  javap -p basics/Classes.class

  Compiled from "Classes.scala"
  public class basics.Classes {
    public java.lang.String printer(java.lang.String);
    public void main(java.lang.String[]);
    public basics.Classes();
  }
*/
}
