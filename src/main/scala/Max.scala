

class Max {
  val list: List[Int] = List(2, 3, 4, 19)
  def checkMax (): Unit = {
    if (list.length != 0) {
      def findMax(currentMax: Int = list.head, nextList: List[Int] = list.tail): Int = {
        currentMax match {
          case _ if (nextList.length ==0) => currentMax
          case _ if ((currentMax < nextList.head) || (currentMax == nextList.head)) => findMax(nextList.head, nextList.tail)
          case _ => findMax(currentMax, nextList.tail)
        }
      }
      println(findMax())
    }
    else println("empty list")
  }
}

