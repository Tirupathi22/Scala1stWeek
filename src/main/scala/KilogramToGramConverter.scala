import scala.io.StdIn

object KilogramToGramConverter {


  def main(args: Array[String]): Unit = {

    println("Enter the weight in kilograms (kg):")

    val kilograms = StdIn.readLine().toDouble
    val grams = kilograms * 1000

    println(s"$kilograms kg is equal to $grams g.")

  }

}