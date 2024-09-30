package lectures.part2oop_24

object Objects_14 extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  // todo but "Objects" has similiar functionality!
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    // todo singleton pattern에서 많이 쓰이고, 클래스의 새 객체를 반환한다. 여기서는 `from` 이름을 `apply`로 바꿨다고 생각하면 쉬움
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS
  // todo (object Person and class Person in the same file)

    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john) // false

    val person1 = Person
    val person2 = Person
    println(person1 == person2) // true

    val bobbie = Person(mary, john)
    
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
