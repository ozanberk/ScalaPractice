package static

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
  def test(x: Double, y: Double) = new Point(y, y)
}

class Point(val x: Double, val y: Double) {
  println(s"Object has been created")

  override def toString: String = f"(${x}, ${y})"
}
