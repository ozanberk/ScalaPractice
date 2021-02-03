class Time(val h: Int, val m: Int = 0) {
  private val minuteSinceMidnight = h * 60 + m

  def hours = minuteSinceMidnight / 60

  def minutes = minuteSinceMidnight % 60

  //def this(h: Int) { this(h, 0)} // two ways, we can enable this method or assign 0 as a default value
  if (h < 0 || h >= 24 || m < 0 || m >= 60) throw new IllegalArgumentException

  def before(other: Time) = minuteSinceMidnight < other.minuteSinceMidnight

  override def toString: String = f"${hours}:${minutes}%02d"
}