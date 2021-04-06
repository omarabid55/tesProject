package Leap

import org.scalatest.{FunSuite, Matchers}

class LeapTest extends FunSuite with Matchers {

  test(testName = "check a year not divisible by 4") {
    Leap.leap( year = 1997) should be(false)
  }

  test (testName = "check a year divisible only by 4") {
    Leap.leap(year = 1996) should be (true)
  }

  test (testName = "check a year divisible by 400") {
    Leap.leap(year = 2000 ) should be (true)
  }

  test (testName = "check a year divisible by 100 but not 400") {
    Leap.leap(year = 2100) should be (false)
  }

}
