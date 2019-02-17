import unibg.info3.logging.Logger
import unibg.info3.animals._ // wildcard import

object MainObject extends App { 

    try {
      val dog = new Dog("Hachiko", -2)
    } 
    catch {
      case e: Throwable => Logger.error(s"$e while creating dog")
    }

    val animals = List(
      new Dog("Fido", 8),
      new Dolphin("Flipper", 22),
      new Frog("Jack", 3),
      new GrassHopper("Wilbur", 10),
      new Human("Mario", 52),
      new Mosquito("Bernice", 5),
      new Parrot("Iago", 31),
      new Wolf("Akela", 46)
    )
    
    def concatStrings = (s1: String, s2: String) => s"$s1, $s2"
    val allAnimals = animals.map(_.toString).reduceLeft(concatStrings)
    Logger.info(allAnimals)

    animals
      .filter(_.isInstanceOf[JumperAnimal])
      .map(_.asInstanceOf[JumperAnimal])
      .map(_.jump)
      
}