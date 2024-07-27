/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:15:59 GMT 2024
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
  public void test00()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1803);
      stackAr0.push((Object) null);
      stackAr0.push("DataStructures.Overflow");
      assertFalse(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackAr stackAr0 = new StackAr(5984);
      Object object0 = new Object();
      stackAr0.push(object0);
      stackAr0.makeEmpty();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      boolean boolean0 = stackAr0.isFull();
      assertTrue(stackAr0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      boolean boolean0 = stackAr0.isEmpty();
      assertFalse(stackAr0.isFull());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1622);
      stackAr0.topAndPop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1622);
      stackAr0.push((Object) null);
      stackAr0.topAndPop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1622);
      stackAr0.top();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1622);
      stackAr0.push((Object) null);
      assertFalse(stackAr0.isEmpty());
      
      stackAr0.pop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
      try { 
        stackAr0.push((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
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
  public void test10()  throws Throwable  {
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