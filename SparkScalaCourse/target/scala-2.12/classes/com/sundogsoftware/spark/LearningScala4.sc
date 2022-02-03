import org.sparkproject.dmg.pmml.True
//Data structures

//Tuples, very common in Sparks
//Immutable lists

//This is a Tuple
val captainStuff = ("Picard", "Enterprise-D", "NCC-17801-D")
println(captainStuff)

//They can be indexed (FROM 1!!!!)
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardShip = "Picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchOfStuff = ("Kirk",1944,true)

//Lists
//Like tuples but with more functionalities and it has to be of the SAME TYPE

val shipList = List("Enterprise","Defienart","Voyager","DeepBho")

//This is ZERO based, yes very confusing
println(shipList(1))

println(shipList.head)
println(shipList.tail)

for(ship <- shipList){println(ship)}
//what ".map" really does is that it applies that function to all elements
val backwards = shipList.map((ship:String) =>{ship.reverse})
for (ship <- backwards){println(ship)}

//reduce() combine alltogheter the items in a collection using a function
val numberlist = List(1,2,3,4,5)
val sum = numberlist.reduce((x: Int,y:Int)=> x + y)
println(sum)
//filter()
val iHateFives = numberlist.filter((x:Int)=> x !=5)
val iHateFives = numberlist.filter(_ != 5)

//Concatenate Lists
val morenumbers = List(6,7,8)
val lotsofNumbers = numberlist ++ morenumbers
val reversED = numberlist.reverse
val sortED = reversED.sorted
val lotsOfDuplicates = numberlist ++ numberlist
val distincVals = lotsOfDuplicates.distinct
val maxvalue = numberlist.max

//============= Just me testing myself =========
def findMax(x: List[Int]): Int =
   {
       def helper(x: List[Int],max: Int): Int = {
           if (x.isEmpty == true) max
           else if(max > x.head) helper(x.tail,max)
           else helper(x.tail,x.head)
       }
       helper(x,0)
   }
//
val porcodio = findMax(List(1,2,8,5,6,10,2))
println(porcodio)

def MyReverse(list: List[String]): List[String] =
{
    def helper(list1: List[String], acc: Int): List[String]=
    {
        if (acc == 0) list1
        else
        {
            val temp =list.tail :+ list.head
            println(temp)
            helper(temp, acc -1)
        }

    }
    helper(list,list.length)
}

val riPorco = MyReverse(List("cane","di","Dio"))

println(riPorco)
//===============================
val total = numberlist.sum
val hasFive = iHateFives.contains(5)


// MAPS

val shipMap = Map("krik" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko"->"Deep Space Nine")


println(shipMap("Kirk"))

// EXERCISE
// Create a list of the numbers 1-20; your job is to print out numbers that are evenly divisible by three. (Scala's
// modula operator, like other languages, is %, which gives you the remainder after division. For example, 9 % 3 = 0
// because 9 is evenly divisible by 3.) Do this first by iterating through all the items in the list and testing each
// one as you go. Then, do it again by using a filter function on the list instead.
