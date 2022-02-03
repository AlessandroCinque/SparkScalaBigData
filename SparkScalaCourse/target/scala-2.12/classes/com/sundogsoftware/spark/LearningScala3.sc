//Functions
//format def <function name>(parameter name:type...):return type = {}
def squareIt(x:Int) =
{
  x * x
}
def cubeIt(x : Int): Int = {x * x * x}

println(squareIt(2))
println(cubeIt(3))
def transformInt(x: Int, f: Int => Int) =
{
  f(x)
}

val result = transformInt(2,cubeIt)
// Instead of saying that the second parameter is a function we are -
//declaring the function's implementation into the parameter itself
//you could even type "y" in it it assumes automatically that -
//this is the f() you specified in the declaration
transformInt(3, x => x * x * x)

transformInt(10, x => x/2)
//This is a multiline lambda function
//The compiler assumes that the first paramter is the x of the lambda function
//ands then assumes that the last "line" is the returning value
transformInt(2, x =>{ val y = x* 2; y* y})


// EXERCISE
// Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
// Write a function that converts a string to upper-case, and use that function of a few test strings.
// Then, do the same thing using a function literal instead of a separate, named function.
def StringTransform(mystring: String, func: String => String): String =
{
  func(mystring)
}

def Upper (x:String): String =
{
  x.toUpperCase
}
StringTransform("puttana e soreta", Upper)

StringTransform("zieta chella zoccl", x => x.toUpperCase)