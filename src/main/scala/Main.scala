object Main extends App {

  println("1: String Interpolation in list")
  println("2: Maximum number of a list")
  println("3: Nth number of Fibonacci Series")
  println("4: Sum of digit of  factorial")

  val choice = scala.io.StdIn.readInt()

  choice match {
    case 1 => val interpolation = new Interpolation
      interpolation.printList(3)
    case 2 => val max = new Max
      max.FindMax()
    case 3 => val fibonacci = new Fibonacci
      fibonacci.NFibonacci()
    case 4 => val productsum = new ProductSum
      productsum.FindProductSum()

    case _ => println("Invalid choice")
  }
}
