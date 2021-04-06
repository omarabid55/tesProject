package Etl

object Etl {

  def transform(input: Map[Int, Seq[String]]): Map[String, Int] = input.flatMap {
    case (points, values) => values.map(_.toLowerCase -> points)
  }
}
