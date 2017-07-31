import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
               @BeanProperty var lastName:String,
               val title:String) {
//   def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")
  def fullName = s"$firstName $lastName"


}

