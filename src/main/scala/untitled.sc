

def printList(number: Int=3): Unit = {
  val list: List[Int] = List(10, 20, 30, 40)
  if (number < list.length) {
    def findList(index: Int = 0): Unit = {

      val LastIndex = list.length - 1
      index match {
        case LastIndex => println(s"$index=${list(index)}")
        case _ => {
          println(s"$index=${list(index)}")
          findList(index + 1)
        }
      }

      findList(0) }
  }
  else println(s"number exceeds the limit")
}
