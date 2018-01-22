package app

import scala.io.StdIn
/**
  * Created by digital032676 on 22/01/18.
  */
object GreeterApp extends App{

  val name = StdIn.readLine("Type your name, Then your age ")
  val age = StdIn.readInt()

  def greet(name: String, age: Int): Unit = {
    if ((name == "Matthew") && (age >= 21)) {
      println("Hi Matthew I can confirm you're 21")
      } else if ((name == "Matthew") || (age >= 21)){
      println(s"Hello you're $age and called $name nice to meet you")
    } else {
      println("Your underage mate sorry")
    }
  }
  greet(name, age)
}
