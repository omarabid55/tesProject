package School

 class School {
    type DB = Map[Int, Seq[String]]
    var schoolDb : DB = Map()

    def add(name: String, g: Int) = {
      // Base validations
      if(isStudentCorrect(name,g))
        schoolDb += (g -> (grade(g) :+ name) )  //schoolDB += means schoolDB = schoolDB + || grade(g) :+ name means appends name to grade(g)
    }

    private def isStudentCorrect(name: String, g: Int) : Boolean = {
      g > 0 && name != null && name.nonEmpty && !grade(g).contains(name)
    }

    def grade(g: Int): Seq[String] = {
      schoolDb.getOrElse(g, Seq())
    }

    def sorted: DB = {
      schoolDb.keys.toList.sorted.map(key => key -> schoolDb(key).sorted).toMap
    }

   def db: DB = schoolDb
  }