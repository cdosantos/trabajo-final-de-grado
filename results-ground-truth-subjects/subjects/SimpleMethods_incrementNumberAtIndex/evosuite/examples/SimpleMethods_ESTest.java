/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:15:16 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.SimpleMethods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleMethods_ESTest extends SimpleMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        simpleMethods0.incrementNumberAtIndex(intArray0, 1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[4];
      simpleMethods0.incrementNumberAtIndex(intArray0, 1);
      assertArrayEquals(new int[] {0, 1, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        simpleMethods0.incrementNumberAtIndex(intArray0, (-1605));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[1];
      simpleMethods0.incrementNumberAtIndex(intArray0, 0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        simpleMethods0.incrementNumberAtIndex(intArray0, 0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
