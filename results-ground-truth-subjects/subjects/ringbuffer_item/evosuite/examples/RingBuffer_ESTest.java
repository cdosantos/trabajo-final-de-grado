/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:14:02 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.RingBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RingBuffer_ESTest extends RingBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(2);
      ringBuffer0.extend((String) null);
      ringBuffer0.wipeOut();
      ringBuffer0.extend("buffer is empty");
      ringBuffer0.remove();
      ringBuffer0.extend("buffer is empty");
      ringBuffer0.extend("buffer is empty");
      assertEquals(3, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1);
      Object object0 = new Object();
      ringBuffer0.extend(object0);
      ringBuffer0.wipeOut();
      ringBuffer0.extend(object0);
      int int0 = ringBuffer0.count();
      assertTrue(ringBuffer0.isFull());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1139);
      ringBuffer0.isFull();
      assertEquals(1140, ringBuffer0.dataCount());
      assertEquals(0, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1089);
      boolean boolean0 = ringBuffer0.isEmpty();
      assertEquals(1090, ringBuffer0.dataCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(826);
      int int0 = ringBuffer0.dataCount();
      assertTrue(ringBuffer0.isEmpty());
      assertEquals(827, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend((String) null);
      ringBuffer0.wipeOut();
      ringBuffer0.extend((String) null);
      ringBuffer0.remove();
      assertEquals(2, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1089);
      ringBuffer0.extend("&R");
      ringBuffer0.item();
      assertEquals(1, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("");
      ringBuffer0.remove();
      ringBuffer0.extend("");
      // Undeclared exception!
      try { 
        ringBuffer0.extend("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // buffer is full
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1419);
      ringBuffer0.extend("");
      int int0 = ringBuffer0.count();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1089);
      int int0 = ringBuffer0.count();
      assertEquals(0, int0);
      assertEquals(1089, ringBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1089);
      int int0 = ringBuffer0.capacity();
      assertEquals(1089, int0);
      assertTrue(ringBuffer0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1089);
      // Undeclared exception!
      try { 
        ringBuffer0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // buffer is empty
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(368);
      // Undeclared exception!
      try { 
        ringBuffer0.item();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // empty buffer
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("");
      // Undeclared exception!
      try { 
        ringBuffer0.extend("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // buffer is full
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RingBuffer<Integer> ringBuffer0 = null;
      try {
        ringBuffer0 = new RingBuffer<Integer>((-2277));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameter must be positive
         //
         verifyException("examples.RingBuffer", e);
      }
  }
}
