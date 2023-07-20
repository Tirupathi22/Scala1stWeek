object SumOfEvenNumbers {

  def main(args: Array[String]): Unit = {

    val start = 383
    val end = 582

    val sumOfEvens = (start to end).filter(_ % 2 == 0).sum

println(s"the sum of even numbers between $start to $end is: $sumOfEvens")
  }

}