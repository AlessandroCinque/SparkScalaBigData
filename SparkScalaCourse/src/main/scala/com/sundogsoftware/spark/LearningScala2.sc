import scala.annotation.tailrec
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

var num1 = 0
var num2 = 1
var acc = 0
while(acc < 10)
{
    val result = num1 + num2
    num1 = num2
    num2 = result
    println(result)
    acc +=1
}
//This is the tailrec version which although it cannot satisfy the excercise
//to notice how the logic is pretty much the same
def fib3(acc: Int): Int = {
    @tailrec
    //Here we enter first a and then b
    def fib_tail(acc: Int, a: Int, b: Int): Int =
        acc match {
            //this is the end condition
        case 0 => a
            //here INSTEAD we pass first b (which replaces a) and then the sum of a +b
            //BEFORE all of this of course we decrease the accumulator so that it can meet the end codition above specified
        case _ => fib_tail(acc - 1, b, a + b)
    }
    return fib_tail(acc, 0 , 1)
}