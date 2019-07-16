class Interpolation {
  val list: List[Int] = List(10, 20, 30, 40)
  def findList(index: Int = 0): Unit = {
    val LastIndex: Int = list.length - 1
    index match {
      case LastIndex => println(s"$index=${list(index)}")
      case _ => {
        println(s"$index=${list(index)}")
        findList(index + 1)
          }
        }
      }
}
