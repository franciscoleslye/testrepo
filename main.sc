//Testing the branch
val name = "Hello branch"
println(name)

class Person(name: String, age: Int):
    def greeting: String = (s"Hi my name is $name, and I'm $age years old")


val f = Person("Francisco", 37)
println(f.greeting)
