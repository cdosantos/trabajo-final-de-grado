/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 02 13:08:49 GMT 2024
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.FastMathNew;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastMathNew_ESTest extends FastMathNew_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor((-4607.0));
      assertEquals((-4607.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor(4.503599627370497E15);
      assertEquals(4.503599627370497E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor(0.42);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor((-4606.947776810702));
      assertEquals((-4607.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FastMathNew fastMathNew0 = new FastMathNew();
      double double0 = fastMathNew0.floor((-4.50359962737051E15));
      assertEquals((-4.50359962737051E15), double0, 0.01);
  }
}