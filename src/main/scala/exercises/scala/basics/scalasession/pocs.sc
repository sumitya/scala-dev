val a:Int = 100

val b = 100.0f
val c = 100.0D

val d:Short = 100

val e = ()

def myMethod() = {

}

val abc = "sumit"

abc charAt(0)

println(s"This is ${abc}")

val abcOption = Some(123)

val abcOption1 = None

val abcd = null
//if(abcd > 0) println("Some value") else None

if (true) println("True") else println("false")

//for, while, do()while

for(i <- 0 to 10) println("printing"+i)
var j = 10
while(j<5) {
  println(j)
  j = j -1
}

//do{}while()


val myfunc = (x:Int)  => println(x)

myfunc(12)

def testFunc(x:Int)(y:Int)(z:Int)  =  x * y

val partialFunc = testFunc(3) _ _

partialFunc(2)(3)






