class Fibonacci {
  def NFibonacci(): Unit = {
    println("enter the number")
    val number = scala.io.StdIn.readInt()

    var first = 0
    var second = 1
    if (number == 1) println("0")
    if (number == 2) println("1")
    if (number > 2) {
      for (nth <- 1 to number - 1) {
        var nth = first + second
        first = second
        second = nth
      }
      println(s"$second")
    }
  }
}
