val a = 99
println(s"${a + 3} luftballons floating in the summer sky")

val ticketCost = 50
val bandName = "Taling Heads"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f")

val percentIncrease = 20
val musicGenre = "New Wave"

println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f%nThat's a $percentIncrease%% bump because everyone likes $musicGenre")

println(f"""The $bandName%s tickets are probably $$$ticketCost%1.2f
	|That's a $percentIncrease%% bump because everyone likes $musicGenre""".stripMargin)

