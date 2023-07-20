object SeriesMultipliedVlaues {

  def main(args: Array[String]): Unit = {
    for (i <- 2 to 16) {
      val results = i * (i + 1)

      print(results)

      if (i < 16 ) print(", ")



    }
  }


}
