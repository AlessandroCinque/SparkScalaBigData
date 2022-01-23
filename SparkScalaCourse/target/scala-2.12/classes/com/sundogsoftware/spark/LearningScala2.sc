//Flow control

//if else:

if(1>3) println("Impossible") else println("All ok")

if(1>3)
{
    println("Impossible!")
    println("Really")
}
else
{
    println("What did you expect")
}

//Matching
val number = 4
number match
{
    case 1 => println("One")
    case 2 => println("Two")
    case 3 => println("Three")
    case _ => println("Bhooo")
}

//For loop

for (x<- 1 to 4)
{
    val squared = x * x
    println(squared)
}
//Bad practice but for the sake of the demonstration...
var x = 10
while(x >=0)
{
    println(x)
    x-= 1
}

x = 0
do
{
    println(x); x+=1
}while(x<=10)

//Expressions
{val x= 10; x+20}

println({val x= 10; x+20})

//EXCERCISE
//Write some code that prints out the first 10 values of the Fibonacci sequence.
//This is the sequence where every number is the sum of the two numbers before it
//So the result should be 0,1,1,2,3,5,8,13,21,34

def fib1(n: Long): Long = n match {
    case 0 | 1 => n
    case _ => fib1(n - 1) + fib1(n - 2)
}

def fib3( n : Int) : Int = {
    def fib_tail( n: Int, a:Int, b:Int): Int = n match {
        case 0 => a
        case _ => fib_tail( n-1, b, a+b )
    }
    return fib_tail( n, 0, 1)
}
var acc = 0
while(acc < 10)
{
    val f1 = acc -1
    val f2 = acc -2
    val result = f1+ f2
    println(result)
}
println(fib1(10))