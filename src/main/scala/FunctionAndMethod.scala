import scala.math.sqrt

object FunctionAndMethod {
  def main(args: Array[String]) = {

    println(sqrt(2)) //sqrt is function.

    println(BigInt.probablePrime(100, scala.util.Random)) // probablePrime is method

    //method without parameters usually don't use (), if it won't mutate the input
    println("Hello".distinct)
    println("Hello".length)
    println("Hello"(4))

    val methodInvocation = myFirstMethod()
    println(methodInvocation)

    val correctInvocationOfFirstMethod: Unit = myFirstMethod()
    println(correctInvocationOfFirstMethod)

    val secondMethodInvocation = methodThatReturnsInt()
    println(secondMethodInvocation)

    val anotherTypeOfAssigningMethodToVal: Int = methodThatReturnsInt()
    println(anotherTypeOfAssigningMethodToVal)

    println(methodThatReturnsInt())

    println(methodThatGetsString("test"))
    println(methodThatGetsString("longer then 10 char"))

    println(methodWithMultipleFor(3, 5))
    println(methodWithMultipleForAndGuard(3, 5))

    println(methodThatGetsIntReturnsList(5))
  }

  def myFirstMethod(): Unit ={
    println("Method has been invoked")
  }

  def methodThatReturnsInt(): Int ={
    val number = 4
    number
  }

  def methodThatGetsString(value: String): Any = {
    if (value.length < 10) "length is too small" else value.length
  }

  def methodWithMultipleFor(firstValue: Int, secondValue: Int) = {
    var sum = 0
    for (i <- 1 to firstValue; j <- 1 to secondValue) sum += i + j
    sum
  }

  def methodWithMultipleForAndGuard(firstValue: Int, secondValue: Int): Int ={
    var sum = 0
    for (i <- 1 to firstValue; j <- 1 to secondValue if firstValue != secondValue) sum += i + j
    sum
  }

  def methodThatGetsIntReturnsList(value: Int) = {
    // returns IndexedSeq[Int], you can specify or ignore, better to specify
    for(i <- 1 to value) yield i
  }
}
