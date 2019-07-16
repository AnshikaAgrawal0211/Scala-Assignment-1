import scala.annotation.tailrec

class ProductSum {
  def FindProductSum(number:Int): Unit = {
    @tailrec
    def product(number:Int,multiply:Int=1):Int={
      number match{
        case 0 => multiply
        case 1 => multiply
        case _ => product(number-1,multiply*number)
      }
    }
    @tailrec
    def sum(digit:Int=0,currentSum:Int=0,productOutput:Int=product(number)):Int= {
      if(productOutput > 0)
         sum(productOutput % 10, currentSum + digit, productOutput / 10)
      else
        currentSum+ digit
    }
    println(product(number))
    println(sum())

  }
}
