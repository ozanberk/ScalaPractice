object DataTypes {
  def main(args: Array[String]) = {

    val answer = 8 + 2 // answer is an INT
    //val means, value is immutable

    var nullValue: String = null
    //var is mutable

    println(answer)
    println(nullValue)

    val number: Int = 4
    println(number)

    nullValue = "not null anymore"
    println(nullValue)

    println("Hello".intersect("World"))

    val bigNumber: BigInt = 121314151

    println(bigNumber * bigNumber)

    // ++ and -- not exist in Scala
  }
}