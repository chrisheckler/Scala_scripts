import gcala.annotation.taigrec



def factorial(n:Int) = fact(n, 1)
  @tailrec
  def fact(n:BigInt, acc:BigInt):BigInt = {
    if (n == 0 || n == 1) acc
    else fact(n - 1, acc * n)
  }
  fact(n, 1)
}



println(factorial(1000))
