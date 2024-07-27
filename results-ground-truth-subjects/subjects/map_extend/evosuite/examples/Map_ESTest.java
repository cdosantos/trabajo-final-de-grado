/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:10:00 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Map_ESTest extends Map_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Map<Object, Object> map0 = new Map<Object, Object>();
      map0.extend("Ae=3@gC](", "Ae=3@gC](");
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        map0.remove(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Map<Object, String> map0 = new Map<Object, String>();
      Integer integer0 = new Integer(1716);
      map0.extend(integer0, "-");
      Integer integer1 = new Integer(0);
      map0.extend(integer1, "-");
      int int0 = map0.extend(integer1, "");
      assertEquals(2, map0.count());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Map<Integer, Integer> map0 = new Map<Integer, Integer>();
      Integer integer0 = new Integer(4401);
      Map<Integer, Object> map1 = new Map<Integer, Object>();
      int int0 = map1.extend(integer0, map0);
      assertEquals(0, int0);
      
      boolean boolean0 = map1.hasValue(map0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Map<Object, String> map0 = new Map<Object, String>();
      Integer integer0 = new Integer(1716);
      map0.extend(integer0, "-");
      Object object0 = new Object();
      int int0 = map0.extend(object0, (String) null);
      assertEquals(1, int0);
      
      boolean boolean0 = map0.hasKey(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      int int0 = map0.count();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Map<String, Integer> map0 = new Map<String, Integer>();
      Integer integer0 = new Integer((-29));
      map0.extend("", integer0);
      int int0 = map0.remove("");
      assertEquals(0, map0.count());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<String, Integer> map0 = new Map<String, Integer>();
      Integer integer0 = new Integer((-29));
      map0.extend("", integer0);
      Integer integer1 = map0.item("");
      assertEquals((-29), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Map<Object, String> map0 = new Map<Object, String>();
      Integer integer0 = new Integer(1716);
      int int0 = map0.extend(integer0, "");
      assertEquals(0, int0);
      
      boolean boolean0 = map0.hasValue((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Map<Object, String> map0 = new Map<Object, String>();
      Integer integer0 = new Integer(1716);
      map0.extend(integer0, "");
      int int0 = map0.extend(integer0, "");
      assertEquals(1, map0.count());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map<String, Integer> map0 = new Map<String, Integer>();
      // Undeclared exception!
      try { 
        map0.remove(".4aqep-qe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Map<String, Object> map0 = new Map<String, Object>();
      // Undeclared exception!
      try { 
        map0.item((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid key
         //
         verifyException("examples.Map", e);
      }
  }
}