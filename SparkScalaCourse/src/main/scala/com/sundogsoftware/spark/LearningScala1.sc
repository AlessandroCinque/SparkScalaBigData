   // VALUES are immutable like CONST and should be used as much as possible in Scala
   val hello:String = "Hole!"

   //VARIABLES are Mutable but not recomanded
   var hellothere: String = hello
   hellothere = hello + "bukkin!"
   println(hellothere)

   // Use always VALUES allows to run simultaneously
   //stuff without worrying of racing conditions!!!
   //Data types
   val numberOne: Int = 1
   val truth: Boolean = true
   val letterA: Char = 'a'
   val pi: Double = 3.14159265
   val piSinglePrecision: Float = 3.14159265f
   val bigNumber: Long = 1248732648
   val smallNum: Byte = 127 //only from +127 to -127 or if unsigned 255

   println("Porco" + "Dio" + numberOne + truth + letterA + bigNumber)
   println(f"Pi is about $piSinglePrecision%.3f")
   println(f"Zero padding on he left: $numberOne%05d")
   println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

   println(s"the s prefix can also include any expressione like ${1+2}")
   val ultimateAnser: String = "To life the universe is 42"
   // .* is take everything ([\d]) that is a number .* and everything after that
   val pattern = """.* ([\d]+).*""".r
   val pattern(answerString ) = ultimateAnser
   val answer = answerString.toInt
   println(answer)
   // Booleans
   val isGreater = 1> 2
   val isLesser = 1<2
   val impossible = isGreater & isLesser
   // Always use the double because the single one is only for bute operations!!! Which work with true and zeros but may not work for other stuff
   val impossible2 = isGreater && isLesser
   val picard: String = "Picard"
   val bestCaptain: String = "Picard"
   val isBest: Boolean = picard == bestCaptain

   //EXCERISE: Double pi and then print a string with three decimal places
   println(f"Pi times 2 is about ${pi * 2}%.3f")
