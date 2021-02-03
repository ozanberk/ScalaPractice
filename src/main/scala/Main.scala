import traits.ConsoleLogger

object Main extends App {

  val morning = new Time(9, 0)
  println(morning)
  //val wrongTime = new Time(-12, 20)
  //println(wrongTime)

  val lateMorning = new Time(9, 1)
  val sameMorning = new Time(9, 0)
  val earlyMorning = new Time(8, 59)
  println(lateMorning)

  println(lateMorning.before(morning))
  println(sameMorning.before(morning))
  println(earlyMorning.before(morning))

  val noon = new Time(12)
  println(12)
  println(noon.hours)

  val account = new SavingAccount with ConsoleLogger
  account.withdraw(1000)
}
