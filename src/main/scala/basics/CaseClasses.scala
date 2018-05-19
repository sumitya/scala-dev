package basics

case class CaseClasses(a: Int, b: Int) {

}

/* Features of case class
1.  It has factory method apply to create objects. So new keyword is not used for object creation.
2. constructor arguments are val i.e. final by default. and they are class members.
3. default implementation for equals,toString and hashcode methods are available.


  javap -p basics/CaseClasses.class

*
* Compiled from "CaseClasses.scala"
public class basics.CaseClasses implements scala.Product,scala.Serializable {
  private final int a;
  private final int b;
  public static scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply(basics.CaseClasses);
  public static basics.CaseClasses apply(int, int);
  public basics.CaseClasses copy(int, int);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public basics.CaseClasses(int, int);
  ......
}
*/