object CountAlternateEvenNumbers {

  def main(args: Array[String]): Unit = {

    val start = 20
    val end = 140
    var count = 0

    for (num <- start to end by 2) {
      if (num % 4 == 0) {
        count += 1 //(to calculate count of alternate even numbers)

        //println(num)
      }

    }

    println(s"is:" + count)
  }
}