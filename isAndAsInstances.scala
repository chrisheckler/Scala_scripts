val g:Any = "Ice, Ice, Call me Maybe"
val h:String = g.asInstanceOf[String]

def decide(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide(4))
println(decide("Hello!"))

def decidePoorly(x:Any) = x.asInstanceOf[Int] + 10
println(decidePoorly(4))
println(decidePoorly("Zing"))
