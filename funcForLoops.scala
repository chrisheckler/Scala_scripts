/**
@created by Heckler
Simple list comprehension that creates a new list with 1 added to
the original num in list.
*/

val xs = List(1,2,3,4)
val result = for (a <- xs) yield (a + 1) 
println(result)
println(xs)
