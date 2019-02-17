package unibg.info3.animals

class Wolf(name: String, age: Int) extends Mammal(name, age) {

  def bark = println("Bark")
  def howl = println("Uuuh")

}