package traits

trait ConsoleLogger extends Logged {
  override def log(msg: String): Unit = {
    println(msg)
  }
}
