
package com.example.coding

import org.junit._
import org.junit.Assert._

class GCDGeneratorTest {

  @Test
  def testGCD() = {   
    assertEquals(Integer.valueOf(10), GCDGenerator.gcd(30,10))
  }

}