object OOP {
  def main(args: Array[String]) = {
    val myClass = new ImmutableClass(3, 4)
    println(myClass)
    println(myClass.move(10, 20))
    println(myClass.distanceFromOrigin)
    println(myClass.x)
    println(myClass.y)

    // myClass.x = 13 won't work because OOP1 class is immutable, it gets val as an parameter

    val mySecondClass = new MutableClass(3, 4)
    println(mySecondClass)
    println(mySecondClass.move(10, 20))
    println(mySecondClass.distanceFromOrigin)
    println(mySecondClass.x)
    println(mySecondClass.y)

    mySecondClass.x = 13
    println(mySecondClass.x)

    val myThirdClass = new OOP3(3, 4)
    println(myThirdClass)
    println(myThirdClass.move(10, 20))
    println(myThirdClass.distanceFromOrigin)
    println(myThirdClass.x)
    println(myThirdClass.y)

    val myDefaultClass = new OOP3()
    println(myDefaultClass)
    println(myDefaultClass.move(10, 20))
    println(myDefaultClass.distanceFromOrigin)
    println(myDefaultClass.x)
    println(myDefaultClass.y)
  }
}

class ImmutableClass(val x: Double, val y: Double) { // val x and y is an instance variable. this is immutable class
  def move(dx: Double, dy: Double) = new ImmutableClass(x + dx, y + dy)

  def distanceFromOrigin = math.sqrt(x * x + y * y)

  override def toString: String = f"(${x}, ${y})"
}

class MutableClass(var x: Double, var y: Double) { // var x and y is an instance variable. this is mutable class
  def move(dx: Double, dy: Double) = new MutableClass(x + dx, y + dy)

  def distanceFromOrigin = math.sqrt(x * x + y * y)

  override def toString: String = f"(${x}, ${y})"
}

class OOP3(val x: Double = 0, val y: Double = 0) { // auxiliary constructor
  println(f"New OO3 object has been created (${x}, ${y})")

  def move(dx: Double, dy: Double) = new OOP3(x + dx, y + dy)

  def distanceFromOrigin = math.sqrt(x * x + y * y)

  override def toString: String = f"(${x}, ${y})"
}