val ada = new Employee("Ada", "Lovelace")

ada.lastName = "Byron, Countess of Lovelace"
println(ada.lastName)
println(ada.title)

val dennis = new Employee(lastName="Ritchie", firstName="Dennis")
println(s"The first name is ${dennis.firstName}")
println(s"The first name is ${dennis.lastName}")

println(ada.fullName)
println(dennis.fullName)
