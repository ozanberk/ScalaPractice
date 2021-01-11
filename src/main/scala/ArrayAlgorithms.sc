import scala.collection.mutable.ArrayBuffer

Array(1,2,3,4,5).sum

val myArray = ArrayBuffer("find", "the", "longest", "element")
myArray.max
myArray.min

ArrayBuffer(1,2,3,4,5).max

ArrayBuffer(123,1,32,5,2).sorted

val unsortedArray = Array(123,1,32,5,2)
unsortedArray.sorted
unsortedArray // original array won't be mutated

Array(123,1,32,5,2).reverse

Array(1, 2, 3).toString // won't return the output you want
Array(1, 2, 3).mkString // will return as a string
Array(1, 2, 3).mkString(" ") // possible to arrange output if you pass something to the method
Array(1, 2, 3).mkString(",") // will generate output and put "," after every single element in the Array

ArrayBuffer(1, 2, 3).toString() // to String is enough for ArrayBuffer
ArrayBuffer(1, 2, 3).mkString(",") // will work as in Array