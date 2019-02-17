package unibg.info3.animals

class Dog(name: String, age: Int) extends Wolf(name, age) {
  
  override def bark = println("Bau")
  
}