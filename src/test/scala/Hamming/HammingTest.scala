package Hamming

import org.scalatest.{FunSuite, Matchers}

/** @version 2.1.0 */
class HammingTest extends FunSuite with Matchers {

  test("empty strands") {
   Hamming.compute("", "") should be (Some(0))
  }

  test("identical strands") {
    //pending
   Hamming.compute("A", "A") should be (Some(0))
  }

  test("long identical strands") {
    //pending
   Hamming.compute("GGACTGA", "GGACTGA") should be (Some(0))
  }

  test("complete compute in single nucleotide strands") {
    //pending
   Hamming.compute("A", "G") should be (Some(1))
  }

  test("complete compute in small strands") {
    //pending
   Hamming.compute("AG", "CT") should be (Some(2))
  }

  test("small compute in small strands") {
    //pending
   Hamming.compute("AT", "CT") should be (Some(1))
  }

  test("small compute") {
    //pending
   Hamming.compute("GGACG", "GGTCG") should be (Some(1))
  }

  test("small compute in long strands") {
    //pending
   Hamming.compute("ACCAGGG", "ACTATGG") should be (Some(2))
  }

  test("non-unique character in first strand") {
    //pending
   Hamming.compute("AAG", "AAA") should be (Some(1))
  }

  test("non-unique character in second strand") {
    //pending
   Hamming.compute("AAA", "AAG") should be (Some(1))
  }

  test("same nucleotides in different positions") {
    //pending
   Hamming.compute("TAG", "GAT") should be (Some(2))
  }

  test("large compute") {
    //pending
   Hamming.compute("GATACA", "GCATAA") should be (Some(4))
  }

  test("large compute in off-by-one strand") {
    //pending
   Hamming.compute("GGACGGATTCTG", "AGGACGGATTCT") should be (Some(9))
  }

  test("disallow first strand longer") {
    //pending
   Hamming.compute("AATG", "AAA") should be (None)
  }

  test("disallow second strand longer") {
    //pending
   Hamming.compute("ATA", "AGTG") should be (None)
  }
}