

class Max {
  val list: List[Int] = List(2, 3, 4, 19)

  def findMax(currentMax: Int = list.head, nextList: List[Int] = list.tail): Int = {
    if ((nextList.head::Nil)==true)
      currentMax
    else if (currentMax > nextList.head )
      findMax(nextList.head, nextList.tail)
    else
      findMax(currentMax, nextList.tail)

  }

  println(findMax())
}
