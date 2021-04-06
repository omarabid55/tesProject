package Hamming

object Hamming {
  def compute(dna1: String, dna2: String): Option[Int] = {

    def computeTail(list1: List[Char], list2: List[Char], acc: Int): Option[Int] = (list1, list2) match {
      case (Nil, Nil) => Some(acc)
      case (h1 :: t1, h2 :: t2) => computeTail(t1, t2, if (h1 == h2) acc else acc + 1) //computeTail(t1,t2,acc) else computeTail(t1,t2,acc+1)
      case _ => None
    }

    computeTail(dna1.toList, dna2.toList, 0)
  }
}
