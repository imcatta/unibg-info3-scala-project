package unibg.info3.animals

import unibg.info3.commons.Flyer

class Parrot(name: String, age: Int) extends Mammal(name, age) with Flyer with TalkingAnimal {
  
}