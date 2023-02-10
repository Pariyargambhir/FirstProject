package BankProject


  class Account(val accountNumber: String,  val accountHolder: String, var balance: Double) {
    def deposit(amount: Double): Unit = {
      balance += amount
    }

    def withDraw(amount: Double): Unit = {
      if (amount <= balance) {
        balance -= amount
      } else {
        println(s"you donot have sufficient balance.")
      }
    }

    def checkBalance: Double = {
      balance
    }
  }
object Main extends App {
    val account1 = new Account("78930293","John Malik", 100.00)
    val account2 = new Account("35678292", "Joao Cancelo", 400.0)

    account1.deposit(500.0)
    println("Balance of account: " + account1.checkBalance)

    account2.withDraw(400.0)
    println(s"balance of the account is ${account2.checkBalance} ")

  }

