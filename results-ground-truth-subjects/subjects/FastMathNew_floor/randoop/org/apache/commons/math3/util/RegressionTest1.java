package org.apache.commons.math3.util;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-1.0f));
        double double20 = fastMathNew0.floor(5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor((double) (short) -1);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor((-7.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((-7.3d));
        double double14 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-8.0d) + "'", double12 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 1);
        double double14 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((-5.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor(3.0d);
        double double20 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) (-1L));
        java.lang.Class<?> wildcardClass5 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor(100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-1.0f));
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor(100.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor((double) (-10L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor((double) (-4));
        double double16 = fastMathNew0.floor((-10.5d));
        double double18 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) (-9));
        java.lang.Class<?> wildcardClass5 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor((double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((-7.3d));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-8.0d) + "'", double12 == (-8.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 7L);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0d + "'", double10 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor(6.9d);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(32.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 3);
        double double10 = fastMathNew0.floor((-2.0d));
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-7));
        double double12 = fastMathNew0.floor(7.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.0d) + "'", double10 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (short) 100);
        double double8 = fastMathNew0.floor((-4.6d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) '4');
        double double14 = fastMathNew0.floor((double) (-3));
        double double16 = fastMathNew0.floor((double) 2L);
        double double18 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) (-6L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((double) (byte) 0);
        double double14 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor((double) (short) -1);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor((double) (-7L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (short) -1);
        double double10 = fastMathNew0.floor((double) (-6L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((double) (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-7L));
        double double16 = fastMathNew0.floor((-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
    }
}

