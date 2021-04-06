package Bob

object Bob {
  def response(question: String): String = question.trim match {
    case "" => "Fine. Be that way!"
    case q if yelling(q) && isQuestion(q) => "Calm down, I know what I'm doing!"
    case q if yelling(q) => "Whoa, chill out!"
    case q if isQuestion(q) => "Sure."
    case _ => "Whatever."
  }

  def yelling(x: String): Boolean = {
    x == x.toUpperCase()
    }

  def isQuestion(x: String): Boolean = {
    x.endsWith("?")
  }

}
