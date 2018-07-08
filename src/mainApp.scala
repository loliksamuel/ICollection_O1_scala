
object mainApp extends App {

  mainApp.main(List("s"))
  def main (args: List[String])={


    //implement data structure that support setAll in O(1)
    //var listSetAll1 : MyDS1[Int] = MyDS1(11,22,33,44)//
    var myds = new Collection_Set_O1()
    myds.add( 10.0)
    myds.add( 20.0)
    myds.add( 30.0)
    myds.add( 40.0)
    myds.add( 50.0)
    println("0-"+myds.get(0))
    println("1-"+myds.get(1))

    myds.set(0,11.0)
    println("0-"+myds.get(0))
    println("1-"+myds.get(1))

    myds.setAll(100.0)
    println("0-"+myds.get(0))
    println("1-"+myds.get(1))

    myds.set(0,12.0)
    println("0-"+myds.get(0))
    println("1-"+myds.get(1))

  }
}
