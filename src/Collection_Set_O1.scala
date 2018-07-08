//data structure that support setAll in O(1)
class Collection_Set_O1() {

  var defaultValueTime: Long   = 0
  var defaultValue    : Double = 0
  var arr : List [Node1] = List.empty
  case class Node1(var value:Double, var time:Long)


  def setAll(value:Double) : Unit = {
    defaultValueTime = System.currentTimeMillis
    defaultValue = value
  }

  def get(index:Int): Double = {
    val isNewer = arr(index).time  > defaultValueTime
    val x = if (isNewer){
      println("index " + index + ". "+arr(index).time+">"+defaultValueTime+"?. returning value="+arr(index).value)
      arr(index).value
    }
    else{
      println("index " + index + ". "+arr(index).time+">"+defaultValueTime+"?. returning defaultValue="+defaultValue)
      defaultValue

    }
    x
  }


  def add( value:Double) : Unit = {
    val n : Node1 = Node1(value, System.currentTimeMillis  )

    arr = arr:::(n)::Nil


  }

  def set(index:Int, value:Double) : Unit = {

    val n : Node1 = Node1(value, System.currentTimeMillis  )

    arr = arr.updated(index, n)

  }

}
