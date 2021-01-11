import scala.collection.mutable.ArrayBuffer

object FindNegativeNumbers {
  def main(args: Array[String]) = {
    val myArrayBuffer = ArrayBuffer(1, 2, -3, 4, -5, 6, -7 ,8)
    println(removeAllButFirstNegative(myArrayBuffer))
  }

  def removeAllButFirstNegative(myArrayBuffer: ArrayBuffer[Int]): ArrayBuffer[Int] ={
    // Array(1,2,3,4,5) if we want to remove 3rd and 4th element from Array and if we start deleting from 3rd, then when we delete 4th element, 5 will be deleted
    // but in the initial phase of Array 4th element was 4. we removed 5. that is not something we want
    // reverse the array and start deleting from the end not from the beginning. In this case shrinking size of our array won't cause deletion of wrong element
    val indexesOfNegativeNumbers = for(i <- 0 until myArrayBuffer.length if myArrayBuffer(i) < 0) yield i
    val indexesToRemove = indexesOfNegativeNumbers.drop(1)
    for (i <- indexesToRemove.reverse) myArrayBuffer.remove(i)  // array should be reversed otherwise we will remove wrong values when we start deleting from the beginning
    myArrayBuffer
  }
}
