class Foo(x:Int) {
  def bar(y:Int) = x + y
  def apply(z:Int) = x * z 
}

object MagicApply extends App {
  val foo = new Foo(10)
  println(foo.bar(20))
  println(foo(20))
}

