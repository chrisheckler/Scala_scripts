class SecretAgent(val name:String) {
    def shoot(n:Int) {
       import SecretAgent._ 
       decrementBullets(n)
    }
}
object SecretAgent {
   private var b:Int = 3000

   private def decrementBullets(count:Int) {
     if (b - count <= 0) b = 0
     else b = b - count	
   }
   
   def bullets = b
}
object SecretAgentRunner extends App {
   val bond = new SecretAgent("James Bond")
   val felix = new SecretAgent("Felix Leitner")
   val jason  = new SecretAgent("Jason Bourne")
   val _99 = new SecretAgent("99")
   val max = new SecretAgent("Max Smart")
   
   bond.shoot(800)
   felix.shoot(200)
   jason.shoot(150)
   _99.shoot(120)
   max.shoot(100)

   println(SecretAgent.bullets)
}
