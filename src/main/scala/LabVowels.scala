object LabVowels {
  def main(args: Array[String]) = {
    println(isVowel('b'))
    println(isVowel('a'))

    println(getVowels("ozan"))

    println(getVowelsAsAList("ozanberk"))

  }

  def isVowel(value: Char): Boolean = {
    "aeoui".contains(value)
  }

  def getVowels(value: String): String = {
    var result = ""
    for(ch <- value) {
      if ("aeoui".contains(ch)) result += ch
    }
    result
  }

  def getVowelsAsAList(value: String) = {
    for(ch <- value if isVowel(ch)) yield ch
  }
}
