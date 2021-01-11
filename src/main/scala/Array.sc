import scala.collection.mutable.ArrayBuffer

val numberArray = new Array[Int](10)
for(i <- 0 until  numberArray.length) numberArray(i) = i
numberArray

for(element <- numberArray) println(element)

val myArrayBuffer = ArrayBuffer("This", "is", "a", "practice", "code", "for", "ArrayBuffer")

myArrayBuffer += "test"

myArrayBuffer += ("these", "ones", "added", "after", "array", "was", "created")

myArrayBuffer.remove(3)
myArrayBuffer

myArrayBuffer.insert(3, "removed practice word added to the array again")
myArrayBuffer

myArrayBuffer.trimEnd(5) // removed last 5 elements
myArrayBuffer

// buffer to Array .toArray
// array to Buffer .toBuffer

val myArray = Array(1,2,3,4,5)
val myResultArray = for(element <- myArray) yield element * 2
myResultArray

// let's include guard also

val mySpecialResultArray = for (element <- myArray if element % 2 == 0) yield element * 2
mySpecialResultArray
