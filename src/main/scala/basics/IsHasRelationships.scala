object IsHasRelationships {

  def main(args: Array[String]): Unit = {

    sealed  trait Day

    case class WeekDay(name:String, dayNumber:Int) extends Day

    case class WeekEnd(name:String) extends Day

    // NOTE: 1. Here, we say Days is either a WeekDay or WeekEnd -> Is a relationship
    //       2. Weekday has a name and dayNumber, Weekend just have name -> Has a relationship
    //       When a trait is "sealed" all of its subclasses are declared within the same file and that makes the set of subclasses finite which allows certain compiler checks.


  }

}
