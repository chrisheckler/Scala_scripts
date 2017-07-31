import java.time._
class Employee(val firstName:String, val lastName:String, val title:String, val hireDate:LocalDate)

object Employee {
    def create(firstName:String, lastName:String, title:String) =
       new Employee(firstName, lastName, title, LocalDate.now)
}

object EmployeeDesignRunner extends App {
  val employee = Employee.create("Ken", "Thompson", "Programmer")
  println(employee.hireDate)
}
