import traits.Logged

class SavingAccount extends Logged {
  private var balance: Double = 0
  def withdraw(amount: Double): Unit = {
    if(amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}
