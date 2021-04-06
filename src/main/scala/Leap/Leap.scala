package Leap

object Leap {
  def leap(year: Int): Boolean = {
    //def isYearDivisible (n : Int) : Boolean = (year % n == 0)
    val isYearDivisible: Int => Boolean = d => year % d == 0
    isYearDivisible(400) || (isYearDivisible(4) && !isYearDivisible(100))
  }

}
