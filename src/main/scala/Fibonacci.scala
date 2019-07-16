import scala.annotation.tailrec

class Fibonacci {

  def NFibonacci(elementIndex : Int) = {
@tailrec
    def findElement(currentIndex : Int, prev : Int = 0, next : Int = 1) : Int =
    {
      currentIndex match {
        case 0 => prev
        case 1 => next
        case _ => findElement(currentIndex -1, next, prev + next)
      }
    }
    println(findElement(elementIndex))
  }
}
