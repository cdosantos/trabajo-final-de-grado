/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:06:57 GMT 2024
 */

package jts;

import org.junit.Test;
import static org.junit.Assert.*;
import jts.Angle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Angle_ESTest extends Angle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Angle.getTurn(0, 3447.616668088994);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Angle.getTurn(3447.616668088994, (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Angle.getTurn(3447.616668088994, 3447.616668088994);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Angle angle0 = new Angle();
  }
}
