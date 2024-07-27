/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:16:13 GMT 2024
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import DataStructures.StackAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackAr_ESTest extends StackAr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1303);
      Object object0 = stackAr0.topAndPop();
      stackAr0.push((Object) null);
      stackAr0.push(object0);
      assertFalse(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1303);
      stackAr0.push((Object) null);
      stackAr0.makeEmpty();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1054);
      boolean boolean0 = stackAr0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      boolean boolean0 = stackAr0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      Object object0 = stackAr0.top();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      stackAr0.push((Object) null);
      stackAr0.pop();
      stackAr0.push((Object) null);
      assertTrue(stackAr0.isFull());
      
      stackAr0.topAndPop();
      assertFalse(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
      try { 
        stackAr0.push(stackAr0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      try { 
        stackAr0.pop();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StackAr stackAr0 = null;
      try {
        stackAr0 = new StackAr((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }
}