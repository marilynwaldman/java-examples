// Source: src/test/scala/com/example/coding/StringReverserTest.scala
package com.example.coding

import org.junit._
import org.junit.Assert._

@Test
class StringReverserTest {

  @Test
  def testReverse1() = {
    assertEquals("madA m'I madaM", StringReverser.reverse1("Madam I'm Adam"))
  }

  @Test
  def testReverse2() = {
    assertEquals("madA m'I madaM", StringReverser.reverse2("Madam I'm Adam"))
  }

  @Test
  def testReverse3() = {
    assertEquals("madA m'I madaM", StringReverser.reverse3("Madam I'm Adam"))
  }

  @Test
  def testReverse4() = {
    assertEquals("madA m'I madaM", StringReverser.reverse4("Madam I'm Adam"))
  }
 @Test
  def myReverse() = {
    assertEquals("madA m'I madaM", StringReverser.reverse4("Madam I'm Adam"))
  }
}