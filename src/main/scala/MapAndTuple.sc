val studentMap = Map("Ozan" -> 4, "Berk" -> 1, "Onal" -> 0)
// default Map is immutable
val numberOfOzan = studentMap.get("Ozan")

val mutableMap = scala.collection.mutable.Map("Ozan" -> 3)
mutableMap.put("Berk", 1)
mutableMap.put("Ozan", 4)
mutableMap

mutableMap.getOrElse("Baris", 0)

// if the map is mutable, you can simply update it
mutableMap("Ozan") = 16
mutableMap

val aMapThatCreatedFromStudentMap = studentMap + ("Baris" -> 2, "Berk" -> 2)
aMapThatCreatedFromStudentMap

val anotherMapCreatedFromUpdatedStudentMap = aMapThatCreatedFromStudentMap - "Berk"
anotherMapCreatedFromUpdatedStudentMap

// or we can use var when we specify a Map
// and update whenever we want or need

var secondStudentMap = Map("Ozan" -> 4, "Berk" -> 1, "Onal" -> 0)

secondStudentMap = secondStudentMap + ("Baris" -> 2, "Berk" -> 2)
secondStudentMap

secondStudentMap = secondStudentMap - "Berk"
secondStudentMap

for((k, v) <- secondStudentMap) println("value of "+ k +" is "+ v)

for((k, v) <- secondStudentMap) yield (v,k)

//Tuples

val myTuple = (1, 3.14, "Tuple")
myTuple._2