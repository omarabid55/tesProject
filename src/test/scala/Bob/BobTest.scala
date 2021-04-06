package Bob

import org.scalatest.{FunSuite, Matchers}

class BobTest extends FunSuite with Matchers {

  test (testName = "test an empty input")  {
    Bob.response("") should be ("Fine. Be that way!")
  }

  test (testName = "test with a normal question") {
    Bob.response(question = "How are you ?")should be ("Sure.")
  }

  test (testName = "test with a question in CAPITALS") {
    Bob.response(question = "HOW ARE YOU ?") should be ("Calm down, I know what I'm doing!")
  }

  test (testName = "test with a sentence in CAPITALS") {
    Bob.response(question = "HOW OLD ARE YOU !") should be ("Whoa, chill out!")
  }

  test (testName = "test anything else ") {
    Bob.response(question = "good ? and you !") should be ("Whatever.")
  }
}
