package basics

class Classes {

  def printer(name: String): String = {

    "This is basic class method with Name" + name
  }

  def main(args: Array[String]): Unit = {
    val obj = new Classes()
    obj.printer("Printer")
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
