
package com.example.coding

import org.junit._
import org.junit.Assert._

class FibonacciGeneratorTest {

  val first8Fibs = List[Int] (0,1,1,2,3,5,8,13)

  @Test
  def testGenerate1() = {
    var results = new scala.collection.mutable.ListBuffer[Int]
    for (i <- 0 until 8) {
     results +=  FibonacciGenerator.generate1(i)
    }
    assertEquals(results, first8Fibs)
  }

  @Test
  def testGenerate2() = {
    var results = new scala.collection.mutable.ListBuffer[Int]
    for (i <- 0 until 8) {
      results +=  FibonacciGenerator.generate2(i)
    }
    assertEquals(results, first8Fibs)
  }

@Test
  def testMyGenerator() = {
    var results = new scala.collection.mutable.ListBuffer[Int]
    for (i <- 0 until 8) {
      results +=  FibonacciGenerator.myGenerator(i)
    }
    assertEquals(results, first8Fibs)
  }
}