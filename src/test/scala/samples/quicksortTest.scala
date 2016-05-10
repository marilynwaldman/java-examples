
package com.example.coding

import org.junit._
import org.junit.Assert._

class QuickSortTest {

  val arr = Array[Int] (10,2,4,5,7,3,1,8,6,9)
  val result = Array[Int] (1,2,3,4,5,6,7,8,9,10)

  @Test
  def testQuickSort() = {  
       val quickSortResult =  QuickSortRoutine.quicksort(arr)
        assertEquals(result.toList, quickSortResult.toList)
  }
}