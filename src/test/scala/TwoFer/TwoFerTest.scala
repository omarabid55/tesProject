package TwoFer

import org.scalatest.{FunSuite, Matchers}

/** @version 1.2.0 */
class TwoFerTest extends FunSuite with Matchers {

  test("no name given") {
    TwoFer.twofer() should be ("One for you, one for me.")
  }

  test("a name given") {

    TwoFer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  test("another name given") {
    pending
    TwoFer.twofer("Bob") should be ("One for Bob, one for me.")
  }
}