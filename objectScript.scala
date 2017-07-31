object myObject {
   def foo(x:Int, y:Int) = x + y
}
println(myObject.foo(5, 10))

class Employee(val firstName:String, val lastName:String, val title:String)

object Knuth extends Employee("Donalad", "Knuth", "Programmer")
println(Knuth.firstName)
println(Knuth.lastName)
println(Knuth.title)
