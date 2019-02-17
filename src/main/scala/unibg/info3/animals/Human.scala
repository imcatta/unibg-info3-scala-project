package unibg.info3.animals

class Human(name: String, age: Int) extends Mammal(name, age) with SwimmerAnimal with JumperAnimal  {
  
}