package app

/**
  * Created by digital032676 on 22/01/18.
  */
object NightClubs extends nightclubEntry {

  var hos = "House of Smith"
  var digi = "Digital"
  var flor = "Floritas"

  def whichClub (name: String): Unit = {
    if (name.length > 8) {
      println (s"Hey $name, your fave club is $digi")
    } else if (name == "Daniel") {
      println(s"Hey $name your fave club is $flor")
    } else {
      println(s"Hey $name your fave club is $hos")
    }
  }
  whichClub(name)
}
