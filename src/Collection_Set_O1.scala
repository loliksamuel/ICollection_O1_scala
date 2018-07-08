//data structure that support setAll in O(1)
class Collection_Set_O1() {

  var defaultValueTime: Long  = 0
  var defaultValue    :Double = 0
  var arr : List [Node1] = List.empty
  case class Node1(var value:Double, var time:Long)


  def setAll(value:Double) : Unit = {
    defaultValueTime = System.currentTimeMillis / 1000
    defaultValue = value
  }

  def get(index:Int): Double = {
    val x = if (arr(index).time  > defaultValueTime)
      arr(index).value
    else
      defaultValue
    x
  }


  def add( value:Double) : Unit = {
    val n : Node1 = Node1(value, System.currentTimeMillis / 1000)

    arr = arr:::(n)::Nil


  }

  def set(index:Int, value:Double) : Unit = {
    val n : Node1 = Node1(value, System.currentTimeMillis / 1000)

    arr = arr.updated(index, n)

  }

}
