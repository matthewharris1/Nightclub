package app

import scala.io.StdIn

/**
  * Created by digital032676 on 22/01/18.
  */
class nightclubEntry extends App {

  val name = StdIn.readLine("Please enter your name and age ")
  val age = StdIn.readInt()

  def entryReq (name: String, age: Int) : Unit = {
    if (age >= 18) {
      println(s"Hey $name you are old enough to enter")
    } else {
      println(s"Sorry $name you're to young to get in")
    }
  }
  entryReq(name, age)
}
