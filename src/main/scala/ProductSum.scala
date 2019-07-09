class ProductSum {
  def FindProductSum(): Unit = {
    println("enter the number")
    val number = scala.io.StdIn.readInt()
    var product = 1
    if (number > 1)
      for (i <- 1 to number)
        product = product * i
    println(s"$product")
    if (number == 1)
      println("1")
    var sum = 0
    var digit = 0
    while (product > 0) {
      digit = product % 10
      sum = sum + digit
      product /= 10
    }
    println(s"$sum")
  }

}
