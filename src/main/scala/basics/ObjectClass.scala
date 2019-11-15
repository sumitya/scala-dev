package basics

object ObjectClass {

  def main(args: Array[String]): Unit = {

    //basics.Classes call
   /* val obj = new Classes()
    println(obj.printer("Printer"))*/

    //basics.CaseClasses call
    val caseobj = CaseClasses(1,2)
    println(caseobj.a)

    //basics.Eagle call
    val eagle = new Eagle()
    println(eagle.color)
    eagle.fly()

  }

  /* Object class's main method is the entry point for any program execution.

  javap -p basics/ObjectClass.class

  Compiled from "ObjectClass.scala"

    public final class basics.ObjectClass {
      public static void main(java.lang.String[]);
      ...................
      ........
    }
  */

}
