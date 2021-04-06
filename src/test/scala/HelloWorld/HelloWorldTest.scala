package HelloWorld

import org.scalatest.{FunSuite, Matchers}


class HelloWorldTest extends FunSuite with Matchers {

  test("verify Hello, World is OK!") {
    HelloWorld.hello() should be ("Hello, World!")
  }
}