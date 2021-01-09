import scala.collection.mutable.ArrayBuffer

val numberArray = new Array[Int](10)
for(i <- 0 until  numberArray.length) numberArray(i) = i
numberArray

for(element <- numberArray) println(element)

val myArrayBuffer = ArrayBuffer("This", "is", "a", "practice", "code", "for", "ArrayBuffer")

myArrayBuffer += "test"

myArrayBuffer += ("this", "ones", "added", "after", "creation", "of", "array")

myArrayBuffer.remove(3)
myArrayBuffer

myArrayBuffer.insert(3, "removed practice added again")
myArrayBuffer

myArrayBuffer.trimEnd(5) // removed last 5 elements
myArrayBuffer

// buffer to Array .toArray
// array to Buffer .toBuffer