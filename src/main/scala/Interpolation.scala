class Interpolation {
  def printList(number: Int): Unit = {
    val list: List[Int] = List(10, 20, 30, 40)
    if (number <= list.length)
      for (index <- 0 to number - 1) println(s"$index=${list(index)}")
    else println("number exceeds the limit")
  }
}