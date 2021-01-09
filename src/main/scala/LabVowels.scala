object LabVowels {
  def main(args: Array[String]) = {
    println(isVowel('b'))
    println(isVowel('a'))

    println(getVowels("ozan"))

    println(getVowelsAsAList("ozanberk"))

    println(getVowelsWithRecursive("ozanberkonal"))

    println(getVowelsWithDefaultVowels("aeubcd"))
    println(getVowelsAsAListWithDefaultVowels("Aeubcd"))
    println(getVowelsAsAListWithDefaultVowelsVersion2("Aeubcd"))

    println(getVowelsAsAListWithDefaultVowelsVersion2("Aeubcd", "bcek"))

  }

  def isVowel(value: Char): Boolean = {
    "aeoui".contains(value)
  }

  def getVowels(value: String): String = {
    var result = ""
    for(ch <- value) {
      if (isVowel(ch)) result += ch
    }
    result
  }

  def getVowelsAsAList(value: String) = {
    for(ch <- value if isVowel(ch)) yield ch
  }

  def getVowelsWithRecursive(value: String): String = {
    if (value.isEmpty) ""
    else {
      val ch = value(0)
      val rest = getVowelsWithRecursive(value.substring(1))
      if(isVowel(ch)) ch + rest else rest
    }
  }

  def isVowel(value: Char, vowelChar: String): Boolean = {
    vowelChar.contains(value)
  }

  def getVowelsWithDefaultVowels(value: String, vowelChar: String = "aeoui", ignoreCase: Boolean = true): String = {
    var result = ""
    for(ch <- value) {
      if (isVowel(ch, vowelChar)) result += ch
    }
    result
  }

  def getVowelsAsAListWithDefaultVowels(value: String, vowelChar: String = "aeoui", ignoreCase: Boolean = true) = {
    for(ch <- (if(ignoreCase) value.toLowerCase else value) if isVowel(ch, vowelChar)) yield ch
  }

  def getVowelsAsAListWithDefaultVowelsVersion2(value: String, vowelChar: String = "aeoui", ignoreCase: Boolean = true): String = {
    if (ignoreCase) getVowelsAsAListWithDefaultVowelsVersion2(value.toLowerCase(), vowelChar, false)
    else for(ch <- value if isVowel(ch, vowelChar)) yield ch
  }
}
