package examples;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        java.lang.Class<?> wildcardClass2 = t1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t13 = new examples.MinFinder.T((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t14 = tList8.set(8, t13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray21 = tList8.toArray(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t17 = new examples.MinFinder.T((-3));
        int int18 = t17.getVal();
        examples.MinFinder.T[] tArray19 = new examples.MinFinder.T[] { t13, t15, t17 };
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList20, tArray19);
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        int int25 = t24.getVal();
        examples.MinFinder.T[] tArray26 = new examples.MinFinder.T[] { t24 };
        java.util.ArrayList<examples.MinFinder.T> tList27 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList27, tArray26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = tList20.addAll((-1), (java.util.Collection<examples.MinFinder.T>) tList27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(tArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3) + "'", int25 == (-3));
        org.junit.Assert.assertNotNull(tArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList3.replaceAll(tUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.lang.Class<?> wildcardClass35 = tList28.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.lang.Class<?> wildcardClass35 = tList8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList28.add((-5), t36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -5, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<examples.MinFinder.T> tItor13 = tList8.listIterator((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        int int15 = t14.getVal();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            tList3.add(9, t21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<examples.MinFinder.T> tItor54 = tList8.listIterator((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.ArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList0 = new java.util.ArrayList<java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        java.util.stream.Stream<examples.MinFinder.T> tStream19 = tList3.parallelStream();
        java.lang.Class<?> wildcardClass20 = tStream19.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t28, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        boolean boolean38 = tList35.contains((java.lang.Object) 10L);
        examples.MinFinder.T t40 = tList35.remove(0);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        boolean boolean59 = tList44.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList55);
        boolean boolean61 = tList35.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = tList9.addAll((int) (short) 10, (java.util.Collection<examples.MinFinder.T>) tList55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        tList3.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        boolean boolean32 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList29);
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList29.replaceAll(tUnaryOperator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        java.lang.Class<?> wildcardClass65 = t63.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.trimToSize();
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] { 9L };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray56 = tList8.toArray(serializableArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(serializableArray55);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray66 = new examples.MinFinder.T[] { t59, t61, t63, t65 };
        java.util.ArrayList<examples.MinFinder.T> tList67 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList67, tArray66);
        java.util.ListIterator<examples.MinFinder.T> tItor69 = tList67.listIterator();
        tList67.trimToSize();
        boolean boolean71 = tList56.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList67);
        examples.MinFinder.T t73 = minFinder72.findmin();
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        minFinder72.add(t75);
        boolean boolean77 = tList8.contains((java.lang.Object) t75);
        int int79 = tList8.indexOf((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tItor69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(t73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t20 = minFinder19.findmin();
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        minFinder19.add(t22);
        java.lang.Class<?> wildcardClass24 = minFinder19.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        int int17 = tList9.indexOf((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<examples.MinFinder.T> tItor19 = tList9.listIterator((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = tList23.set(2, t41);
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        int int49 = t48.getVal();
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t44, t46, t48 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        examples.MinFinder minFinder53 = new examples.MinFinder(tList51);
        tList51.trimToSize();
        java.util.AbstractCollection[] abstractCollectionArray56 = new java.util.AbstractCollection[2];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<examples.MinFinder.T>[] tCollectionArray57 = (java.util.AbstractCollection<examples.MinFinder.T>[]) abstractCollectionArray56;
        tCollectionArray57[0] = tList23;
        tCollectionArray57[1] = tList51;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<examples.MinFinder.T>[] tCollectionArray62 = tList3.toArray(tCollectionArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(t42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-3) + "'", int49 == (-3));
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(abstractCollectionArray56);
        org.junit.Assert.assertNotNull(tCollectionArray57);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = tList9.addAll((int) (short) 100, (java.util.Collection<examples.MinFinder.T>) tList55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t46 = tList9.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t52 = tList28.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.trimToSize();
        java.lang.Object[] objArray17 = tList9.toArray();
        java.lang.Object[] objArray18 = tList9.toArray();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList34);
        examples.MinFinder.T t40 = minFinder39.findmin();
        // The following exception was thrown during execution in test generation
        try {
            tList9.add(97, t40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(t40);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<examples.MinFinder.T> tItor54 = tList46.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t17, t19, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        java.util.ListIterator<examples.MinFinder.T> tItor27 = tList25.listIterator();
        tList25.trimToSize();
        examples.MinFinder.T t30 = tList25.get((int) (byte) 0);
        tList9.add((int) (short) 1, t30);
        int int32 = tList9.size();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tItor27);
        org.junit.Assert.assertNotNull(t30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        tList8.ensureCapacity(3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t20 = minFinder19.findmin();
        minFinder19.clear();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.trimToSize();
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t60, t62, t64, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        java.util.ListIterator<examples.MinFinder.T> tItor70 = tList68.listIterator();
        tList68.trimToSize();
        boolean boolean72 = tList57.addAll((java.util.Collection<examples.MinFinder.T>) tList68);
        tList57.clear();
        boolean boolean74 = tList8.removeAll((java.util.Collection<examples.MinFinder.T>) tList57);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t76 = tList8.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t17, t19, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        java.util.ListIterator<examples.MinFinder.T> tItor27 = tList25.listIterator();
        tList25.trimToSize();
        examples.MinFinder.T t30 = tList25.get((int) (byte) 0);
        tList9.add((int) (short) 1, t30);
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList35.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        boolean boolean51 = tList35.isEmpty();
        boolean boolean52 = tList9.contains((java.lang.Object) boolean51);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tItor27);
        org.junit.Assert.assertNotNull(t30);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.ArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = new java.util.ArrayList<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t27 = tList9.get(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        int int47 = t46.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t46, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        boolean boolean56 = tList53.contains((java.lang.Object) 10L);
        boolean boolean57 = tList35.removeAll((java.util.Collection<examples.MinFinder.T>) tList53);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t59 = tList53.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-3) + "'", int47 == (-3));
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.trimToSize();
        java.lang.Object[] objArray17 = tList9.toArray();
        java.lang.Object[] objArray18 = tList9.toArray();
        java.util.ListIterator<examples.MinFinder.T> tItor19 = tList9.listIterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(tItor19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = tList3.set(3, t25);
        int int27 = t25.getVal();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(t26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList28);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t41 = tList39.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findmin();
        org.junit.Assert.assertNull(t1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        boolean boolean57 = tList42.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        boolean boolean58 = tList42.isEmpty();
        tList42.trimToSize();
        boolean boolean60 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.util.Iterator<examples.MinFinder.T> tItor61 = tList42.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tItor61);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        boolean boolean51 = tList46.isEmpty();
        boolean boolean53 = tList46.remove((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.trimToSize();
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t60, t62, t64, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        java.util.ListIterator<examples.MinFinder.T> tItor70 = tList68.listIterator();
        tList68.trimToSize();
        boolean boolean72 = tList57.addAll((java.util.Collection<examples.MinFinder.T>) tList68);
        tList57.clear();
        boolean boolean74 = tList8.removeAll((java.util.Collection<examples.MinFinder.T>) tList57);
        int int76 = tList57.indexOf((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        java.lang.Class<?> wildcardClass24 = tItor23.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<examples.MinFinder.T> tItor39 = tList28.listIterator(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t22, t24, t26, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        java.util.ListIterator<examples.MinFinder.T> tItor32 = tList30.listIterator();
        tList30.trimToSize();
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        boolean boolean46 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        examples.MinFinder.T t61 = tList56.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream62 = tList56.parallelStream();
        int int64 = tList56.indexOf((java.lang.Object) (-4));
        boolean boolean65 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList56);
        boolean boolean66 = tList3.remove((java.lang.Object) tList56);
        tList3.clear();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tItor32);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertNotNull(t61);
        org.junit.Assert.assertNotNull(tStream62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        java.lang.Class<?> wildcardClass51 = tList46.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t37, t39, t41, t43 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        java.util.ListIterator<examples.MinFinder.T> tItor47 = tList45.listIterator();
        tList45.trimToSize();
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray57 = new examples.MinFinder.T[] { t50, t52, t54, t56 };
        java.util.ArrayList<examples.MinFinder.T> tList58 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList58, tArray57);
        java.util.ListIterator<examples.MinFinder.T> tItor60 = tList58.listIterator();
        boolean boolean61 = tList45.containsAll((java.util.Collection<examples.MinFinder.T>) tList58);
        examples.MinFinder.T t63 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t65 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t67 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t69 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray70 = new examples.MinFinder.T[] { t63, t65, t67, t69 };
        java.util.ArrayList<examples.MinFinder.T> tList71 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList71, tArray70);
        java.util.ListIterator<examples.MinFinder.T> tItor73 = tList71.listIterator();
        tList71.trimToSize();
        examples.MinFinder.T t76 = tList71.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream77 = tList71.parallelStream();
        int int79 = tList71.indexOf((java.lang.Object) (-4));
        boolean boolean80 = tList45.containsAll((java.util.Collection<examples.MinFinder.T>) tList71);
        boolean boolean81 = tList28.removeAll((java.util.Collection<examples.MinFinder.T>) tList71);
        int int82 = tList71.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tItor47);
        org.junit.Assert.assertNotNull(tArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tItor60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tItor73);
        org.junit.Assert.assertNotNull(t76);
        org.junit.Assert.assertNotNull(tStream77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        tList8.ensureCapacity(0);
        tList8.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t22, t24, t26, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        java.util.ListIterator<examples.MinFinder.T> tItor32 = tList30.listIterator();
        tList30.trimToSize();
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        boolean boolean46 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        examples.MinFinder.T t61 = tList56.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream62 = tList56.parallelStream();
        int int64 = tList56.indexOf((java.lang.Object) (-4));
        boolean boolean65 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList56);
        boolean boolean66 = tList3.remove((java.lang.Object) tList56);
        boolean boolean68 = tList56.contains((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tItor32);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertNotNull(t61);
        org.junit.Assert.assertNotNull(tStream62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t22 = tList3.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ArrayList<examples.MinFinder.T> tList36 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t39 = new examples.MinFinder.T(10);
        // The following exception was thrown during execution in test generation
        try {
            tList36.add((int) ' ', t39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        minFinder19.add(t21);
        java.lang.Class<?> wildcardClass23 = t21.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.ArrayList<java.lang.Class<?>> wildcardClassList0 = new java.util.ArrayList<java.lang.Class<?>>();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray26 = new examples.MinFinder.T[] { t25 };
        java.util.ArrayList<examples.MinFinder.T> tList27 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList27, tArray26);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        tList38.trimToSize();
        boolean boolean42 = tList27.addAll((java.util.Collection<examples.MinFinder.T>) tList38);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = tList27.set(2, t45);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t50 = tList27.set(3, t49);
        boolean boolean51 = tList3.remove((java.lang.Object) t49);
        tList3.clear();
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t54 = tList3.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertNotNull(tArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(t46);
        org.junit.Assert.assertNotNull(t50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t56 = tList9.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        boolean boolean12 = tList8.isEmpty();
        java.util.Iterator<examples.MinFinder.T> tItor13 = tList8.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tItor13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        int int54 = tList46.indexOf((java.lang.Object) (-5L));
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray58 = new examples.MinFinder.T[] { t57 };
        java.util.ArrayList<examples.MinFinder.T> tList59 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList59, tArray58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t62, t64, t66, t68 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        java.util.ListIterator<examples.MinFinder.T> tItor72 = tList70.listIterator();
        tList70.trimToSize();
        boolean boolean74 = tList59.addAll((java.util.Collection<examples.MinFinder.T>) tList70);
        examples.MinFinder minFinder75 = new examples.MinFinder(tList70);
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        minFinder75.add(t77);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t79 = tList46.set(6, t77);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(tArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tItor72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray66 = new examples.MinFinder.T[] { t59, t61, t63, t65 };
        java.util.ArrayList<examples.MinFinder.T> tList67 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList67, tArray66);
        java.util.ListIterator<examples.MinFinder.T> tItor69 = tList67.listIterator();
        tList67.trimToSize();
        boolean boolean71 = tList56.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList67);
        examples.MinFinder.T t73 = minFinder72.findmin();
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        minFinder72.add(t75);
        boolean boolean77 = tList8.contains((java.lang.Object) t75);
        examples.MinFinder.T t79 = new examples.MinFinder.T((int) 'a');
        boolean boolean80 = tList8.add(t79);
        int int81 = t79.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tItor69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(t73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 97 + "'", int81 == 97);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        tList8.ensureCapacity(0);
        boolean boolean17 = tList8.remove((java.lang.Object) (short) 100);
        tList8.clear();
        boolean boolean20 = tList8.remove((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = tList3.set(3, t25);
        int int27 = t26.getVal();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(t26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        tList3.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        boolean boolean32 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList29);
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList3.replaceAll(tUnaryOperator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        java.util.ListIterator<examples.MinFinder.T> tItor26 = tList9.listIterator();
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t28, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        boolean boolean38 = tList35.contains((java.lang.Object) 10L);
        examples.MinFinder.T t40 = tList35.remove(0);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        boolean boolean59 = tList44.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList55);
        boolean boolean61 = tList35.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        java.util.Iterator<examples.MinFinder.T> tItor62 = tList55.iterator();
        examples.MinFinder minFinder63 = new examples.MinFinder(tList55);
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray66 = new examples.MinFinder.T[] { t65 };
        java.util.ArrayList<examples.MinFinder.T> tList67 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList67, tArray66);
        examples.MinFinder.T t70 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t72 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t76 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray77 = new examples.MinFinder.T[] { t70, t72, t74, t76 };
        java.util.ArrayList<examples.MinFinder.T> tList78 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList78, tArray77);
        java.util.ListIterator<examples.MinFinder.T> tItor80 = tList78.listIterator();
        tList78.trimToSize();
        boolean boolean82 = tList67.addAll((java.util.Collection<examples.MinFinder.T>) tList78);
        examples.MinFinder.T t85 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t86 = tList67.set(2, t85);
        minFinder63.add(t85);
        boolean boolean88 = tList9.add(t85);
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator89 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList9.replaceAll(tUnaryOperator89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tItor26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tItor62);
        org.junit.Assert.assertNotNull(tArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(tItor80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(t86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        tList3.trimToSize();
        java.util.Iterator<examples.MinFinder.T> tItor21 = tList3.iterator();
        examples.MinFinder.T t23 = tList3.remove(3);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tItor21);
        org.junit.Assert.assertNotNull(t23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.lang.Object[] objArray15 = tList9.toArray();
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t17, t19, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        java.util.ListIterator<examples.MinFinder.T> tItor27 = tList25.listIterator();
        tList25.trimToSize();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        boolean boolean41 = tList25.containsAll((java.util.Collection<examples.MinFinder.T>) tList38);
        java.util.ListIterator<examples.MinFinder.T> tItor42 = tList25.listIterator();
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        int int46 = t45.getVal();
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray51 = new examples.MinFinder.T[] { t45, t48, t50 };
        java.util.ArrayList<examples.MinFinder.T> tList52 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList52, tArray51);
        boolean boolean55 = tList52.contains((java.lang.Object) 10L);
        examples.MinFinder.T t57 = tList52.remove(0);
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray60 = new examples.MinFinder.T[] { t59 };
        java.util.ArrayList<examples.MinFinder.T> tList61 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList61, tArray60);
        examples.MinFinder.T t64 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray71 = new examples.MinFinder.T[] { t64, t66, t68, t70 };
        java.util.ArrayList<examples.MinFinder.T> tList72 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList72, tArray71);
        java.util.ListIterator<examples.MinFinder.T> tItor74 = tList72.listIterator();
        tList72.trimToSize();
        boolean boolean76 = tList61.addAll((java.util.Collection<examples.MinFinder.T>) tList72);
        examples.MinFinder minFinder77 = new examples.MinFinder(tList72);
        boolean boolean78 = tList52.addAll((java.util.Collection<examples.MinFinder.T>) tList72);
        java.util.Iterator<examples.MinFinder.T> tItor79 = tList72.iterator();
        boolean boolean80 = tList25.addAll((int) (short) 1, (java.util.Collection<examples.MinFinder.T>) tList72);
        boolean boolean81 = tList9.retainAll((java.util.Collection<examples.MinFinder.T>) tList25);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tItor27);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tItor42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3) + "'", int46 == (-3));
        org.junit.Assert.assertNotNull(tArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(t57);
        org.junit.Assert.assertNotNull(tArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(tItor74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(tItor79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) (short) 100);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        tList43.trimToSize();
        boolean boolean56 = tList43.isEmpty();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        tList29.trimToSize();
        examples.MinFinder.T t34 = tList29.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream35 = tList29.parallelStream();
        tList29.trimToSize();
        boolean boolean37 = tList14.removeAll((java.util.Collection<examples.MinFinder.T>) tList29);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertNotNull(t34);
        org.junit.Assert.assertNotNull(tStream35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t52 = tList8.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        int int54 = tList46.indexOf((java.lang.Object) (-5L));
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t56 = tList46.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t23, t26, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        boolean boolean33 = tList30.contains((java.lang.Object) 10L);
        examples.MinFinder.T t35 = tList30.remove(0);
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t37 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t44 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray49 = new examples.MinFinder.T[] { t42, t44, t46, t48 };
        java.util.ArrayList<examples.MinFinder.T> tList50 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList50, tArray49);
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList50.listIterator();
        tList50.trimToSize();
        boolean boolean54 = tList39.addAll((java.util.Collection<examples.MinFinder.T>) tList50);
        examples.MinFinder minFinder55 = new examples.MinFinder(tList50);
        boolean boolean56 = tList30.addAll((java.util.Collection<examples.MinFinder.T>) tList50);
        java.util.Iterator<examples.MinFinder.T> tItor57 = tList50.iterator();
        examples.MinFinder minFinder58 = new examples.MinFinder(tList50);
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t60 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        examples.MinFinder.T t65 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t67 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t69 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray72 = new examples.MinFinder.T[] { t65, t67, t69, t71 };
        java.util.ArrayList<examples.MinFinder.T> tList73 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList73, tArray72);
        java.util.ListIterator<examples.MinFinder.T> tItor75 = tList73.listIterator();
        tList73.trimToSize();
        boolean boolean77 = tList62.addAll((java.util.Collection<examples.MinFinder.T>) tList73);
        examples.MinFinder.T t80 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t81 = tList62.set(2, t80);
        minFinder58.add(t80);
        examples.MinFinder.T t83 = minFinder58.findmin();
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t84 = tList3.set(9, t83);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(t35);
        org.junit.Assert.assertNotNull(tArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertNotNull(tArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(tItor75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(t81);
        org.junit.Assert.assertNotNull(t83);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        boolean boolean57 = tList42.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        boolean boolean58 = tList42.isEmpty();
        tList42.trimToSize();
        boolean boolean60 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        examples.MinFinder.T t67 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t69 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t73 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray74 = new examples.MinFinder.T[] { t67, t69, t71, t73 };
        java.util.ArrayList<examples.MinFinder.T> tList75 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList75, tArray74);
        java.util.ListIterator<examples.MinFinder.T> tItor77 = tList75.listIterator();
        tList75.trimToSize();
        boolean boolean79 = tList64.addAll((java.util.Collection<examples.MinFinder.T>) tList75);
        examples.MinFinder.T t82 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t83 = tList64.set(2, t82);
        boolean boolean84 = tList28.add(t83);
        java.util.stream.Stream<examples.MinFinder.T> tStream85 = tList28.parallelStream();
        java.util.Iterator<examples.MinFinder.T> tItor86 = tList28.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(tItor77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(t83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(tStream85);
        org.junit.Assert.assertNotNull(tItor86);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        tList28.ensureCapacity((int) (short) -1);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor37);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        int int21 = tList3.size();
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t23, t25, t27, t29 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        java.util.ListIterator<examples.MinFinder.T> tItor33 = tList31.listIterator();
        tList31.trimToSize();
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t36, t38, t40, t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        java.util.ListIterator<examples.MinFinder.T> tItor46 = tList44.listIterator();
        boolean boolean47 = tList31.containsAll((java.util.Collection<examples.MinFinder.T>) tList44);
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t49, t51, t53, t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        java.util.ListIterator<examples.MinFinder.T> tItor59 = tList57.listIterator();
        tList57.trimToSize();
        examples.MinFinder.T t62 = tList57.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream63 = tList57.parallelStream();
        int int65 = tList57.indexOf((java.lang.Object) (-4));
        boolean boolean66 = tList31.containsAll((java.util.Collection<examples.MinFinder.T>) tList57);
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        int int69 = t68.getVal();
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray74 = new examples.MinFinder.T[] { t68, t71, t73 };
        java.util.ArrayList<examples.MinFinder.T> tList75 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList75, tArray74);
        boolean boolean78 = tList75.contains((java.lang.Object) 10L);
        boolean boolean79 = tList57.removeAll((java.util.Collection<examples.MinFinder.T>) tList75);
        java.util.AbstractList[] abstractListArray81 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<examples.MinFinder.T>[] tListArray82 = (java.util.AbstractList<examples.MinFinder.T>[]) abstractListArray81;
        tListArray82[0] = tList75;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<examples.MinFinder.T>[] tListArray85 = tList3.toArray(tListArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(tArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tItor33);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tItor59);
        org.junit.Assert.assertNotNull(t62);
        org.junit.Assert.assertNotNull(tStream63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-3) + "'", int69 == (-3));
        org.junit.Assert.assertNotNull(tArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(abstractListArray81);
        org.junit.Assert.assertNotNull(tListArray82);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList9.replaceAll(tUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        java.util.Iterator<examples.MinFinder.T> tItor45 = tList35.iterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.ArrayList<java.lang.Iterable<examples.MinFinder.T>> tIterableList0 = new java.util.ArrayList<java.lang.Iterable<examples.MinFinder.T>>();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray53 = new examples.MinFinder.T[] { t52 };
        java.util.ArrayList<examples.MinFinder.T> tList54 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList54, tArray53);
        examples.MinFinder.T t57 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t61 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray64 = new examples.MinFinder.T[] { t57, t59, t61, t63 };
        java.util.ArrayList<examples.MinFinder.T> tList65 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList65, tArray64);
        java.util.ListIterator<examples.MinFinder.T> tItor67 = tList65.listIterator();
        tList65.trimToSize();
        boolean boolean69 = tList54.addAll((java.util.Collection<examples.MinFinder.T>) tList65);
        java.util.stream.Stream<examples.MinFinder.T> tStream70 = tList54.parallelStream();
        boolean boolean71 = tList8.retainAll((java.util.Collection<examples.MinFinder.T>) tList54);
        int int72 = tList54.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tItor67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tStream70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        minFinder0.clear();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.clear();
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray25 = new examples.MinFinder.T[] { t18, t20, t22, t24 };
        java.util.ArrayList<examples.MinFinder.T> tList26 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList26, tArray25);
        java.util.ListIterator<examples.MinFinder.T> tItor28 = tList26.listIterator();
        tList26.trimToSize();
        examples.MinFinder.T t31 = tList26.get((int) (byte) 0);
        java.lang.Object[] objArray32 = tList26.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor33 = tList26.iterator();
        java.util.ListIterator<examples.MinFinder.T> tItor34 = tList26.listIterator();
        boolean boolean35 = tList9.addAll((java.util.Collection<examples.MinFinder.T>) tList26);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(tArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tItor28);
        org.junit.Assert.assertNotNull(t31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(tItor33);
        org.junit.Assert.assertNotNull(tItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        tList28.ensureCapacity((int) (short) -1);
        boolean boolean38 = tList28.remove((java.lang.Object) 5.3d);
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        int int41 = t40.getVal();
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray46 = new examples.MinFinder.T[] { t40, t43, t45 };
        java.util.ArrayList<examples.MinFinder.T> tList47 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList47, tArray46);
        boolean boolean50 = tList47.contains((java.lang.Object) 10L);
        examples.MinFinder.T t52 = tList47.remove(0);
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray66 = new examples.MinFinder.T[] { t59, t61, t63, t65 };
        java.util.ArrayList<examples.MinFinder.T> tList67 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList67, tArray66);
        java.util.ListIterator<examples.MinFinder.T> tItor69 = tList67.listIterator();
        tList67.trimToSize();
        boolean boolean71 = tList56.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList67);
        boolean boolean73 = tList47.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        java.util.Iterator<examples.MinFinder.T> tItor74 = tList67.iterator();
        examples.MinFinder minFinder75 = new examples.MinFinder(tList67);
        boolean boolean76 = tList28.removeAll((java.util.Collection<examples.MinFinder.T>) tList67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-3) + "'", int41 == (-3));
        org.junit.Assert.assertNotNull(tArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(t52);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tItor69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(tItor74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        examples.MinFinder.T t54 = tList46.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(t54);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray47 = new examples.MinFinder.T[] { t40, t42, t44, t46 };
        java.util.ArrayList<examples.MinFinder.T> tList48 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList48, tArray47);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList48.listIterator();
        tList48.trimToSize();
        examples.MinFinder.T t53 = tList48.get((int) (byte) 0);
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t56, t58, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        java.util.ListIterator<examples.MinFinder.T> tItor66 = tList64.listIterator();
        tList64.trimToSize();
        examples.MinFinder.T t69 = tList64.get((int) (byte) 0);
        tList48.add((int) (short) 1, t69);
        tList28.add(0, t69);
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t79 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray80 = new examples.MinFinder.T[] { t73, t75, t77, t79 };
        java.util.ArrayList<examples.MinFinder.T> tList81 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList81, tArray80);
        java.util.ListIterator<examples.MinFinder.T> tItor83 = tList81.listIterator();
        tList81.trimToSize();
        java.lang.Object[] objArray85 = tList81.toArray();
        boolean boolean86 = tList28.removeAll((java.util.Collection<examples.MinFinder.T>) tList81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(t53);
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tItor66);
        org.junit.Assert.assertNotNull(t69);
        org.junit.Assert.assertNotNull(tArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(tItor83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        tList43.trimToSize();
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList43.listIterator(2);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor57);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.clear();
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList9.listIterator();
        tList9.trimToSize();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(tItor17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray40 = new examples.MinFinder.T[] { t33, t35, t37, t39 };
        java.util.ArrayList<examples.MinFinder.T> tList41 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList41, tArray40);
        java.util.ListIterator<examples.MinFinder.T> tItor43 = tList41.listIterator();
        tList41.trimToSize();
        boolean boolean45 = tList30.addAll((java.util.Collection<examples.MinFinder.T>) tList41);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList41);
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        minFinder46.add(t48);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t50 = tList9.set((-7), t48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tItor43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        tList8.clear();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray17 = new examples.MinFinder.T[] { t16 };
        java.util.ArrayList<examples.MinFinder.T> tList18 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList18, tArray17);
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        tList29.trimToSize();
        boolean boolean33 = tList18.addAll((java.util.Collection<examples.MinFinder.T>) tList29);
        boolean boolean34 = tList18.isEmpty();
        examples.MinFinder minFinder35 = new examples.MinFinder(tList18);
        minFinder35.clear();
        examples.MinFinder.T t37 = null;
        minFinder35.chval(t37, (-5));
        int int40 = tList8.lastIndexOf((java.lang.Object) minFinder35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-4));
        int int2 = t1.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        java.util.stream.Stream<examples.MinFinder.T> tStream45 = tList35.parallelStream();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tStream45);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray23 = new examples.MinFinder.T[] { t22 };
        java.util.ArrayList<examples.MinFinder.T> tList24 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList24, tArray23);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        boolean boolean39 = tList24.addAll((java.util.Collection<examples.MinFinder.T>) tList35);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t43 = tList24.set(2, t42);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t47 = tList24.set(3, t46);
        minFinder20.add(t47);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(t43);
        org.junit.Assert.assertNotNull(t47);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t2 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray3 = new examples.MinFinder.T[] { t2 };
        java.util.ArrayList<examples.MinFinder.T> tList4 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList4, tArray3);
        examples.MinFinder.T t7 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t9 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t11 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray14 = new examples.MinFinder.T[] { t7, t9, t11, t13 };
        java.util.ArrayList<examples.MinFinder.T> tList15 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList15, tArray14);
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList15.listIterator();
        tList15.trimToSize();
        boolean boolean19 = tList4.addAll((java.util.Collection<examples.MinFinder.T>) tList15);
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = tList4.set(2, t22);
        java.util.Iterator<examples.MinFinder.T> tItor24 = tList4.iterator();
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t31, t33, t35, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        java.util.ListIterator<examples.MinFinder.T> tItor41 = tList39.listIterator();
        tList39.trimToSize();
        boolean boolean43 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList39);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t47 = tList28.set(2, t46);
        examples.MinFinder.T t50 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = tList28.set(3, t50);
        boolean boolean52 = tList4.remove((java.lang.Object) t50);
        minFinder0.add(t50);
        minFinder0.clear();
        org.junit.Assert.assertNotNull(tArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(t23);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tItor41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(t47);
        org.junit.Assert.assertNotNull(t51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        java.util.ArrayList<examples.MinFinder.T> tList24 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        int int25 = tList3.size();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        int int54 = tList46.indexOf((java.lang.Object) (-5L));
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        int int58 = t57.getVal();
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t57, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        boolean boolean67 = tList64.contains((java.lang.Object) 10L);
        examples.MinFinder.T t69 = tList64.remove(0);
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        int int72 = t71.getVal();
        boolean boolean73 = tList64.add(t71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = tList46.addAll((int) '4', (java.util.Collection<examples.MinFinder.T>) tList64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-3) + "'", int58 == (-3));
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(t69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-3) + "'", int72 == (-3));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        int int17 = tList9.indexOf((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t19 = tList9.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        minFinder20.clear();
        examples.MinFinder.T t22 = null;
        minFinder20.chval(t22, (-5));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        int int27 = t26.getVal();
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray32 = new examples.MinFinder.T[] { t26, t29, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList33 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList33, tArray32);
        boolean boolean36 = tList33.contains((java.lang.Object) 10L);
        examples.MinFinder.T t38 = tList33.remove(0);
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        boolean boolean57 = tList42.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        examples.MinFinder minFinder58 = new examples.MinFinder(tList53);
        boolean boolean59 = tList33.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        java.util.Iterator<examples.MinFinder.T> tItor60 = tList53.iterator();
        examples.MinFinder minFinder61 = new examples.MinFinder(tList53);
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray64 = new examples.MinFinder.T[] { t63 };
        java.util.ArrayList<examples.MinFinder.T> tList65 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList65, tArray64);
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t70 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t72 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray75 = new examples.MinFinder.T[] { t68, t70, t72, t74 };
        java.util.ArrayList<examples.MinFinder.T> tList76 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList76, tArray75);
        java.util.ListIterator<examples.MinFinder.T> tItor78 = tList76.listIterator();
        tList76.trimToSize();
        boolean boolean80 = tList65.addAll((java.util.Collection<examples.MinFinder.T>) tList76);
        examples.MinFinder.T t83 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t84 = tList65.set(2, t83);
        examples.MinFinder.T t87 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t88 = tList65.set(3, t87);
        boolean boolean89 = tList53.add(t88);
        int int90 = t88.getVal();
        int int91 = t88.getVal();
        minFinder20.chval(t88, 7);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(tArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(t38);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tItor60);
        org.junit.Assert.assertNotNull(tArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(tItor78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(t84);
        org.junit.Assert.assertNotNull(t88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-3) + "'", int90 == (-3));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-3) + "'", int91 == (-3));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.ArrayList<java.util.stream.Stream<examples.MinFinder.T>> tStreamList0 = new java.util.ArrayList<java.util.stream.Stream<examples.MinFinder.T>>();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        tList9.trimToSize();
        boolean boolean16 = tList9.isEmpty();
        boolean boolean18 = tList9.remove((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        tList43.trimToSize();
        java.util.ListIterator<examples.MinFinder.T> tItor56 = tList43.listIterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor56);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.lang.Object[] objArray15 = tList9.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor16 = tList9.iterator();
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList9.listIterator();
        int int19 = tList9.indexOf((java.lang.Object) (-6));
        tList9.ensureCapacity(0);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertNotNull(tItor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        boolean boolean13 = tList9.isEmpty();
        java.util.ListIterator<examples.MinFinder.T> tItor14 = tList9.listIterator();
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray23 = new examples.MinFinder.T[] { t16, t18, t20, t22 };
        java.util.ArrayList<examples.MinFinder.T> tList24 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList24, tArray23);
        java.util.ListIterator<examples.MinFinder.T> tItor26 = tList24.listIterator();
        tList24.trimToSize();
        examples.MinFinder.T t29 = tList24.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream30 = tList24.parallelStream();
        tList24.trimToSize();
        java.lang.Object[] objArray32 = tList24.toArray();
        java.util.ArrayList<examples.MinFinder.T> tList33 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList24);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList33.listIterator(4);
        boolean boolean36 = tList9.remove((java.lang.Object) tItor35);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tItor14);
        org.junit.Assert.assertNotNull(tArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tItor26);
        org.junit.Assert.assertNotNull(t29);
        org.junit.Assert.assertNotNull(tStream30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        boolean boolean57 = tList42.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        boolean boolean58 = tList42.isEmpty();
        tList42.trimToSize();
        boolean boolean60 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        int int64 = t63.getVal();
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t63, t66, t68 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        boolean boolean73 = tList70.contains((java.lang.Object) 10L);
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) (short) 1);
        boolean boolean76 = tList70.add(t75);
        // The following exception was thrown during execution in test generation
        try {
            tList42.add(100, t75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-3) + "'", int64 == (-3));
        org.junit.Assert.assertNotNull(tArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        tList3.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        boolean boolean32 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList29);
        java.util.ListIterator<examples.MinFinder.T> tItor34 = tList29.listIterator(1);
        java.util.stream.Stream<examples.MinFinder.T> tStream35 = tList29.parallelStream();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tItor34);
        org.junit.Assert.assertNotNull(tStream35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t72 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray73 = new examples.MinFinder.T[] { t66, t68, t70, t72 };
        java.util.ArrayList<examples.MinFinder.T> tList74 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList74, tArray73);
        java.util.ListIterator<examples.MinFinder.T> tItor76 = tList74.listIterator();
        tList74.trimToSize();
        examples.MinFinder.T t79 = tList74.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream80 = tList74.parallelStream();
        int int82 = tList74.indexOf((java.lang.Object) (-4));
        boolean boolean83 = tList28.containsAll((java.util.Collection<examples.MinFinder.T>) tList74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(tItor76);
        org.junit.Assert.assertNotNull(t79);
        org.junit.Assert.assertNotNull(tStream80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        int int14 = t13.getVal();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray19 = new examples.MinFinder.T[] { t13, t16, t18 };
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList20, tArray19);
        boolean boolean23 = tList20.contains((java.lang.Object) 10L);
        examples.MinFinder.T t25 = tList20.remove(0);
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t32, t34, t36, t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        java.util.ListIterator<examples.MinFinder.T> tItor42 = tList40.listIterator();
        tList40.trimToSize();
        boolean boolean44 = tList29.addAll((java.util.Collection<examples.MinFinder.T>) tList40);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList40);
        boolean boolean46 = tList20.addAll((java.util.Collection<examples.MinFinder.T>) tList40);
        java.util.Iterator<examples.MinFinder.T> tItor47 = tList40.iterator();
        examples.MinFinder minFinder48 = new examples.MinFinder(tList40);
        examples.MinFinder.T t50 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray51 = new examples.MinFinder.T[] { t50 };
        java.util.ArrayList<examples.MinFinder.T> tList52 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList52, tArray51);
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t57 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t61 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t55, t57, t59, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        java.util.ListIterator<examples.MinFinder.T> tItor65 = tList63.listIterator();
        tList63.trimToSize();
        boolean boolean67 = tList52.addAll((java.util.Collection<examples.MinFinder.T>) tList63);
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t71 = tList52.set(2, t70);
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t75 = tList52.set(3, t74);
        boolean boolean76 = tList40.add(t75);
        java.lang.Object[] objArray77 = tList40.toArray();
        boolean boolean78 = tList9.retainAll((java.util.Collection<examples.MinFinder.T>) tList40);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
        org.junit.Assert.assertNotNull(tArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(t25);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tItor42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tItor47);
        org.junit.Assert.assertNotNull(tArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tItor65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(t71);
        org.junit.Assert.assertNotNull(t75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t28, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        boolean boolean38 = tList35.contains((java.lang.Object) 10L);
        examples.MinFinder.T t40 = tList35.remove(0);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        boolean boolean59 = tList44.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList55);
        boolean boolean61 = tList35.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        tList55.ensureCapacity((int) (short) -1);
        boolean boolean65 = tList55.remove((java.lang.Object) 5.3d);
        boolean boolean66 = tList9.addAll(0, (java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t68 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t79 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray80 = new examples.MinFinder.T[] { t73, t75, t77, t79 };
        java.util.ArrayList<examples.MinFinder.T> tList81 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList81, tArray80);
        java.util.ListIterator<examples.MinFinder.T> tItor83 = tList81.listIterator();
        tList81.trimToSize();
        boolean boolean85 = tList70.addAll((java.util.Collection<examples.MinFinder.T>) tList81);
        examples.MinFinder.T t88 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t89 = tList70.set(2, t88);
        java.util.Iterator<examples.MinFinder.T> tItor90 = tList70.iterator();
        int int91 = tList70.size();
        boolean boolean92 = tList55.containsAll((java.util.Collection<examples.MinFinder.T>) tList70);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(tItor83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(t89);
        org.junit.Assert.assertNotNull(tItor90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 5 + "'", int91 == 5);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        int int47 = t46.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t46, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        boolean boolean56 = tList53.contains((java.lang.Object) 10L);
        boolean boolean57 = tList35.removeAll((java.util.Collection<examples.MinFinder.T>) tList53);
        int int58 = tList35.size();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-3) + "'", int47 == (-3));
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        boolean boolean13 = tList9.isEmpty();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t15, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        boolean boolean25 = tList22.contains((java.lang.Object) 10L);
        examples.MinFinder.T t27 = tList22.remove(0);
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t29 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t34, t36, t38, t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        java.util.ListIterator<examples.MinFinder.T> tItor44 = tList42.listIterator();
        tList42.trimToSize();
        boolean boolean46 = tList31.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList42);
        boolean boolean48 = tList22.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.util.ListIterator<examples.MinFinder.T> tItor49 = tList42.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList42.listIterator(2);
        boolean boolean52 = tList9.retainAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.util.Iterator<examples.MinFinder.T> tItor53 = tList42.iterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(t27);
        org.junit.Assert.assertNotNull(tArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tItor44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tItor49);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(tItor53);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        java.util.Iterator<examples.MinFinder.T> tItor51 = tList46.iterator();
        java.lang.Object[] objArray52 = tList46.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray26 = new examples.MinFinder.T[] { t25 };
        java.util.ArrayList<examples.MinFinder.T> tList27 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList27, tArray26);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        tList38.trimToSize();
        boolean boolean42 = tList27.addAll((java.util.Collection<examples.MinFinder.T>) tList38);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = tList27.set(2, t45);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t50 = tList27.set(3, t49);
        boolean boolean51 = tList3.remove((java.lang.Object) t49);
        java.lang.Object[] objArray52 = tList3.toArray();
        int int53 = tList3.size();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertNotNull(tArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(t46);
        org.junit.Assert.assertNotNull(t50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>(0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.ArrayList<java.lang.reflect.Type> typeList0 = new java.util.ArrayList<java.lang.reflect.Type>();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t20 = minFinder19.findmin();
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        minFinder19.add(t22);
        int int24 = t22.getVal();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.clear();
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList9.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t19 = tList9.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(tItor17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.ArrayList<java.util.stream.BaseStream<examples.MinFinder.T, java.util.stream.Stream<examples.MinFinder.T>>> tBaseStreamList0 = new java.util.ArrayList<java.util.stream.BaseStream<examples.MinFinder.T, java.util.stream.Stream<examples.MinFinder.T>>>();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t28, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        boolean boolean38 = tList35.contains((java.lang.Object) 10L);
        examples.MinFinder.T t40 = tList35.remove(0);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        boolean boolean59 = tList44.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList55);
        boolean boolean61 = tList35.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        tList55.ensureCapacity((int) (short) -1);
        boolean boolean65 = tList55.remove((java.lang.Object) 5.3d);
        boolean boolean66 = tList9.addAll(0, (java.util.Collection<examples.MinFinder.T>) tList55);
        java.util.ListIterator<examples.MinFinder.T> tItor67 = tList55.listIterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tItor67);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        tList8.ensureCapacity(0);
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        int int19 = t18.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t18, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        boolean boolean28 = tList25.contains((java.lang.Object) 10L);
        examples.MinFinder.T t30 = tList25.remove(0);
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        int int33 = t32.getVal();
        boolean boolean34 = tList25.add(t32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = tList8.addAll((-6), (java.util.Collection<examples.MinFinder.T>) tList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -6, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(t30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        tList28.clear();
        java.lang.Object[] objArray37 = tList28.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        java.util.Iterator<examples.MinFinder.T> tItor19 = tList3.iterator();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tItor19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        minFinder20.clear();
        examples.MinFinder.T t22 = minFinder20.findmin();
        examples.MinFinder.T t23 = minFinder20.findmin();
        minFinder20.clear();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(t22);
        org.junit.Assert.assertNull(t23);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        tList9.trimToSize();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        java.util.ArrayList<examples.MinFinder.T> tList21 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        tList3.trimToSize();
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList3.replaceAll(tUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t37 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t44 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray49 = new examples.MinFinder.T[] { t42, t44, t46, t48 };
        java.util.ArrayList<examples.MinFinder.T> tList50 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList50, tArray49);
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList50.listIterator();
        tList50.trimToSize();
        boolean boolean54 = tList39.addAll((java.util.Collection<examples.MinFinder.T>) tList50);
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t58 = tList39.set(2, t57);
        examples.MinFinder.T t61 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = tList39.set(3, t61);
        boolean boolean63 = tList28.add(t61);
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator64 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList28.replaceAll(tUnaryOperator64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(t58);
        org.junit.Assert.assertNotNull(t62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        int int55 = t54.getVal();
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray60 = new examples.MinFinder.T[] { t54, t57, t59 };
        java.util.ArrayList<examples.MinFinder.T> tList61 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList61, tArray60);
        boolean boolean64 = tList61.contains((java.lang.Object) 10L);
        examples.MinFinder.T t66 = tList61.remove(0);
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t68 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t79 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray80 = new examples.MinFinder.T[] { t73, t75, t77, t79 };
        java.util.ArrayList<examples.MinFinder.T> tList81 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList81, tArray80);
        java.util.ListIterator<examples.MinFinder.T> tItor83 = tList81.listIterator();
        tList81.trimToSize();
        boolean boolean85 = tList70.addAll((java.util.Collection<examples.MinFinder.T>) tList81);
        examples.MinFinder minFinder86 = new examples.MinFinder(tList81);
        boolean boolean87 = tList61.addAll((java.util.Collection<examples.MinFinder.T>) tList81);
        tList81.ensureCapacity((int) (short) -1);
        boolean boolean90 = tList46.addAll((java.util.Collection<examples.MinFinder.T>) tList81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-3) + "'", int55 == (-3));
        org.junit.Assert.assertNotNull(tArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(t66);
        org.junit.Assert.assertNotNull(tArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(tItor83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        java.lang.Object[] objArray16 = tList9.toArray();
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList9.listIterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(tItor17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t66 = tList28.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        tList28.ensureCapacity((-8));
        boolean boolean67 = tList28.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        tList28.ensureCapacity(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) (short) 1);
        int int2 = t1.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        java.lang.Object[] objArray65 = tList28.toArray();
        boolean boolean66 = tList28.isEmpty();
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList28.replaceAll(tUnaryOperator67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray26 = new examples.MinFinder.T[] { t25 };
        java.util.ArrayList<examples.MinFinder.T> tList27 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList27, tArray26);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        tList38.trimToSize();
        boolean boolean42 = tList27.addAll((java.util.Collection<examples.MinFinder.T>) tList38);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = tList27.set(2, t45);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t50 = tList27.set(3, t49);
        boolean boolean51 = tList3.remove((java.lang.Object) t49);
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray65 = new examples.MinFinder.T[] { t58, t60, t62, t64 };
        java.util.ArrayList<examples.MinFinder.T> tList66 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList66, tArray65);
        java.util.ListIterator<examples.MinFinder.T> tItor68 = tList66.listIterator();
        tList66.trimToSize();
        boolean boolean70 = tList55.addAll((java.util.Collection<examples.MinFinder.T>) tList66);
        boolean boolean71 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList66);
        java.util.Collection<examples.MinFinder.T>[] tCollectionArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<examples.MinFinder.T>[] tCollectionArray73 = tList3.toArray(tCollectionArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertNotNull(tArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(t46);
        org.junit.Assert.assertNotNull(t50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tItor68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t56, t59, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        boolean boolean66 = tList63.contains((java.lang.Object) 10L);
        examples.MinFinder.T t68 = tList63.remove(0);
        tList63.ensureCapacity(0);
        boolean boolean71 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList63);
        boolean boolean72 = tList63.isEmpty();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-3) + "'", int57 == (-3));
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(t68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        minFinder20.clear();
        examples.MinFinder.T t22 = minFinder20.findmin();
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        int int25 = t24.getVal();
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t24, t27, t29 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        boolean boolean34 = tList31.contains((java.lang.Object) 10L);
        examples.MinFinder.T t36 = tList31.remove(0);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder minFinder56 = new examples.MinFinder(tList51);
        boolean boolean57 = tList31.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        java.util.Iterator<examples.MinFinder.T> tItor58 = tList51.iterator();
        examples.MinFinder minFinder59 = new examples.MinFinder(tList51);
        examples.MinFinder.T t61 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t72 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray73 = new examples.MinFinder.T[] { t66, t68, t70, t72 };
        java.util.ArrayList<examples.MinFinder.T> tList74 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList74, tArray73);
        java.util.ListIterator<examples.MinFinder.T> tItor76 = tList74.listIterator();
        tList74.trimToSize();
        boolean boolean78 = tList63.addAll((java.util.Collection<examples.MinFinder.T>) tList74);
        examples.MinFinder.T t81 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t82 = tList63.set(2, t81);
        examples.MinFinder.T t85 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t86 = tList63.set(3, t85);
        boolean boolean87 = tList51.add(t86);
        int int88 = t86.getVal();
        minFinder20.add(t86);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(t22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3) + "'", int25 == (-3));
        org.junit.Assert.assertNotNull(tArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(t36);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(tItor76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(t82);
        org.junit.Assert.assertNotNull(t86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-3) + "'", int88 == (-3));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-5));
        java.lang.Class<?> wildcardClass2 = t1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        tList28.ensureCapacity((int) (short) -1);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        java.util.ListIterator<examples.MinFinder.T> tItor26 = tList9.listIterator();
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        int int30 = t29.getVal();
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray35 = new examples.MinFinder.T[] { t29, t32, t34 };
        java.util.ArrayList<examples.MinFinder.T> tList36 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList36, tArray35);
        boolean boolean39 = tList36.contains((java.lang.Object) 10L);
        examples.MinFinder.T t41 = tList36.remove(0);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t43 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        boolean boolean60 = tList45.addAll((java.util.Collection<examples.MinFinder.T>) tList56);
        examples.MinFinder minFinder61 = new examples.MinFinder(tList56);
        boolean boolean62 = tList36.addAll((java.util.Collection<examples.MinFinder.T>) tList56);
        java.util.Iterator<examples.MinFinder.T> tItor63 = tList56.iterator();
        boolean boolean64 = tList9.addAll((int) (short) 1, (java.util.Collection<examples.MinFinder.T>) tList56);
        tList9.trimToSize();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tItor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(tArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(t41);
        org.junit.Assert.assertNotNull(tArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        int int16 = tList9.size();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.lang.Object[] objArray38 = tList28.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder55 = new examples.MinFinder(tList43);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.util.ArrayList<examples.MinFinder.T> tList13 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList9);
        java.util.Iterator<examples.MinFinder.T> tItor14 = tList9.iterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tItor14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>(9);
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        int int8 = t7.getVal();
        examples.MinFinder.T[] tArray9 = new examples.MinFinder.T[] { t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList10 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList10, tArray9);
        examples.MinFinder minFinder12 = new examples.MinFinder(tList10);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        int int15 = t14.getVal();
        examples.MinFinder.T t17 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray20 = new examples.MinFinder.T[] { t14, t17, t19 };
        java.util.ArrayList<examples.MinFinder.T> tList21 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList21, tArray20);
        boolean boolean24 = tList21.contains((java.lang.Object) 10L);
        examples.MinFinder.T t26 = tList21.remove(0);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray40 = new examples.MinFinder.T[] { t33, t35, t37, t39 };
        java.util.ArrayList<examples.MinFinder.T> tList41 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList41, tArray40);
        java.util.ListIterator<examples.MinFinder.T> tItor43 = tList41.listIterator();
        tList41.trimToSize();
        boolean boolean45 = tList30.addAll((java.util.Collection<examples.MinFinder.T>) tList41);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList41);
        boolean boolean47 = tList21.addAll((java.util.Collection<examples.MinFinder.T>) tList41);
        java.util.Iterator<examples.MinFinder.T> tItor48 = tList41.iterator();
        examples.MinFinder minFinder49 = new examples.MinFinder(tList41);
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t56, t58, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        java.util.ListIterator<examples.MinFinder.T> tItor66 = tList64.listIterator();
        tList64.trimToSize();
        boolean boolean68 = tList53.addAll((java.util.Collection<examples.MinFinder.T>) tList64);
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t72 = tList53.set(2, t71);
        examples.MinFinder.T t75 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t76 = tList53.set(3, t75);
        boolean boolean77 = tList41.add(t76);
        int int78 = t76.getVal();
        minFinder12.add(t76);
        boolean boolean80 = tList1.add(t76);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertNotNull(tArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(tArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(t26);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tItor43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tItor66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(t72);
        org.junit.Assert.assertNotNull(t76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-3) + "'", int78 == (-3));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>(4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.ArrayList<examples.MinFinder.T> tList0 = new java.util.ArrayList<examples.MinFinder.T>();
        java.lang.Object[] objArray1 = tList0.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor2 = tList0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertNotNull(tItor2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        boolean boolean12 = tList8.isEmpty();
        java.util.ListIterator<examples.MinFinder.T> tItor13 = tList8.listIterator();
        tList8.ensureCapacity(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tItor13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        int int24 = tList3.size();
        int int25 = tList3.size();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        tList8.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        tList22.trimToSize();
        examples.MinFinder.T t27 = tList22.get((int) (byte) 0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        tList38.trimToSize();
        examples.MinFinder.T t43 = tList38.get((int) (byte) 0);
        tList22.add((int) (short) 1, t43);
        // The following exception was thrown during execution in test generation
        try {
            tList8.add((int) (short) -1, t43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertNotNull(t27);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertNotNull(t43);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        boolean boolean13 = tList9.isEmpty();
        examples.MinFinder.T t15 = new examples.MinFinder.T(10);
        int int16 = tList9.indexOf((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = tList3.set(2, t21);
        java.util.Iterator<examples.MinFinder.T> tItor23 = tList3.iterator();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray26 = new examples.MinFinder.T[] { t25 };
        java.util.ArrayList<examples.MinFinder.T> tList27 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList27, tArray26);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t30, t32, t34, t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        java.util.ListIterator<examples.MinFinder.T> tItor40 = tList38.listIterator();
        tList38.trimToSize();
        boolean boolean42 = tList27.addAll((java.util.Collection<examples.MinFinder.T>) tList38);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = tList27.set(2, t45);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t50 = tList27.set(3, t49);
        boolean boolean51 = tList3.remove((java.lang.Object) t49);
        java.lang.Class<?> wildcardClass52 = t49.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(t22);
        org.junit.Assert.assertNotNull(tItor23);
        org.junit.Assert.assertNotNull(tArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(t46);
        org.junit.Assert.assertNotNull(t50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t22, t24, t26, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        java.util.ListIterator<examples.MinFinder.T> tItor32 = tList30.listIterator();
        tList30.trimToSize();
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        boolean boolean46 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        examples.MinFinder.T t61 = tList56.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream62 = tList56.parallelStream();
        int int64 = tList56.indexOf((java.lang.Object) (-4));
        boolean boolean65 = tList30.containsAll((java.util.Collection<examples.MinFinder.T>) tList56);
        boolean boolean66 = tList3.remove((java.lang.Object) tList56);
        examples.MinFinder minFinder67 = new examples.MinFinder(tList56);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tItor32);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertNotNull(t61);
        org.junit.Assert.assertNotNull(tStream62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList40.set(3, t62);
        boolean boolean64 = tList28.add(t63);
        java.lang.Object[] objArray65 = tList28.toArray();
        tList28.ensureCapacity((-8));
        java.util.stream.Stream<examples.MinFinder.T> tStream68 = tList28.parallelStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(tStream68);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t3 = tList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        examples.MinFinder minFinder21 = new examples.MinFinder(tList3);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t23 = tList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = new examples.MinFinder.T((int) (short) 1);
        boolean boolean14 = tList8.add(t13);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t16 = tList8.get(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        minFinder20.clear();
        examples.MinFinder.T t22 = null;
        minFinder20.chval(t22, (-5));
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        examples.MinFinder.T t39 = tList34.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream40 = tList34.parallelStream();
        tList34.trimToSize();
        java.lang.Object[] objArray42 = tList34.toArray();
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray47 = new examples.MinFinder.T[] { t46 };
        java.util.ArrayList<examples.MinFinder.T> tList48 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList48, tArray47);
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t53 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray58 = new examples.MinFinder.T[] { t51, t53, t55, t57 };
        java.util.ArrayList<examples.MinFinder.T> tList59 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList59, tArray58);
        java.util.ListIterator<examples.MinFinder.T> tItor61 = tList59.listIterator();
        tList59.trimToSize();
        boolean boolean63 = tList48.addAll((java.util.Collection<examples.MinFinder.T>) tList59);
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t67 = tList48.set(2, t66);
        examples.MinFinder.T t68 = tList34.set((int) (short) 0, t66);
        minFinder20.chval(t68, (int) (short) 0);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tItor36);
        org.junit.Assert.assertNotNull(t39);
        org.junit.Assert.assertNotNull(tStream40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(tArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tItor61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(t67);
        org.junit.Assert.assertNotNull(t68);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.lang.Object[] objArray13 = tList9.toArray();
        java.util.ListIterator<examples.MinFinder.T> tItor14 = tList9.listIterator();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t57 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t61 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t55, t57, t59, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        java.util.ListIterator<examples.MinFinder.T> tItor65 = tList63.listIterator();
        tList63.trimToSize();
        examples.MinFinder.T t68 = tList63.get((int) (byte) 0);
        examples.MinFinder.T t71 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t75 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray78 = new examples.MinFinder.T[] { t71, t73, t75, t77 };
        java.util.ArrayList<examples.MinFinder.T> tList79 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList79, tArray78);
        java.util.ListIterator<examples.MinFinder.T> tItor81 = tList79.listIterator();
        tList79.trimToSize();
        examples.MinFinder.T t84 = tList79.get((int) (byte) 0);
        tList63.add((int) (short) 1, t84);
        tList43.add(0, t84);
        int int87 = tList9.indexOf((java.lang.Object) tList43);
        examples.MinFinder.T t90 = new examples.MinFinder.T((-4));
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t91 = tList43.set((-5), t90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(tItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tItor65);
        org.junit.Assert.assertNotNull(t68);
        org.junit.Assert.assertNotNull(tArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(tItor81);
        org.junit.Assert.assertNotNull(t84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        boolean boolean17 = tList8.add(t15);
        tList8.trimToSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        tList3.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t21, t23, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        java.util.ListIterator<examples.MinFinder.T> tItor31 = tList29.listIterator();
        boolean boolean32 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList29);
        java.util.ListIterator<examples.MinFinder.T> tItor34 = tList29.listIterator(1);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList29.listIterator();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tItor34);
        org.junit.Assert.assertNotNull(tItor35);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray18 = new examples.MinFinder.T[] { t12, t15, t17 };
        java.util.ArrayList<examples.MinFinder.T> tList19 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList19, tArray18);
        boolean boolean22 = tList19.contains((java.lang.Object) 10L);
        examples.MinFinder.T t24 = tList19.remove(0);
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t31, t33, t35, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        java.util.ListIterator<examples.MinFinder.T> tItor41 = tList39.listIterator();
        tList39.trimToSize();
        boolean boolean43 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        boolean boolean45 = tList19.addAll((java.util.Collection<examples.MinFinder.T>) tList39);
        java.util.Iterator<examples.MinFinder.T> tItor46 = tList39.iterator();
        examples.MinFinder minFinder47 = new examples.MinFinder(tList39);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        examples.MinFinder.T t54 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t54, t56, t58, t60 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        java.util.ListIterator<examples.MinFinder.T> tItor64 = tList62.listIterator();
        tList62.trimToSize();
        boolean boolean66 = tList51.addAll((java.util.Collection<examples.MinFinder.T>) tList62);
        examples.MinFinder.T t69 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t70 = tList51.set(2, t69);
        examples.MinFinder.T t73 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t74 = tList51.set(3, t73);
        boolean boolean75 = tList39.add(t74);
        int int76 = t74.getVal();
        minFinder10.add(t74);
        java.lang.Class<?> wildcardClass78 = t74.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertNotNull(tArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(t24);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tItor41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tItor46);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tItor64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(t70);
        org.junit.Assert.assertNotNull(t74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-3) + "'", int76 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.trimToSize();
        java.lang.Object[] objArray17 = tList9.toArray();
        java.util.ArrayList<examples.MinFinder.T> tList18 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList9);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = tList23.set(2, t41);
        examples.MinFinder.T t43 = tList9.set((int) (short) 0, t41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        examples.MinFinder.T t58 = tList53.get((int) (byte) 0);
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t63 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t67 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray68 = new examples.MinFinder.T[] { t61, t63, t65, t67 };
        java.util.ArrayList<examples.MinFinder.T> tList69 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList69, tArray68);
        java.util.ListIterator<examples.MinFinder.T> tItor71 = tList69.listIterator();
        tList69.trimToSize();
        examples.MinFinder.T t74 = tList69.get((int) (byte) 0);
        tList53.add((int) (short) 1, t74);
        java.lang.Class<?> wildcardClass76 = tList53.getClass();
        java.lang.Class[] classArray78 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray79 = (java.lang.Class<?>[]) classArray78;
        wildcardClassArray79[0] = wildcardClass76;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray82 = tList9.toArray(wildcardClassArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(t42);
        org.junit.Assert.assertNotNull(t43);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertNotNull(t58);
        org.junit.Assert.assertNotNull(tArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(tItor71);
        org.junit.Assert.assertNotNull(t74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.lang.Object[] objArray13 = tList9.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor14 = tList9.iterator();
        examples.MinFinder minFinder15 = new examples.MinFinder(tList9);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(tItor14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.trimToSize();
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t60, t62, t64, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        java.util.ListIterator<examples.MinFinder.T> tItor70 = tList68.listIterator();
        tList68.trimToSize();
        boolean boolean72 = tList57.addAll((java.util.Collection<examples.MinFinder.T>) tList68);
        tList57.clear();
        boolean boolean74 = tList8.removeAll((java.util.Collection<examples.MinFinder.T>) tList57);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t76 = tList57.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray18 = new examples.MinFinder.T[] { t12, t15, t17 };
        java.util.ArrayList<examples.MinFinder.T> tList19 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList19, tArray18);
        boolean boolean22 = tList19.contains((java.lang.Object) 10L);
        examples.MinFinder.T t24 = tList19.remove(0);
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t31, t33, t35, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        java.util.ListIterator<examples.MinFinder.T> tItor41 = tList39.listIterator();
        tList39.trimToSize();
        boolean boolean43 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        boolean boolean45 = tList19.addAll((java.util.Collection<examples.MinFinder.T>) tList39);
        java.util.Iterator<examples.MinFinder.T> tItor46 = tList39.iterator();
        examples.MinFinder minFinder47 = new examples.MinFinder(tList39);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        examples.MinFinder.T t54 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t54, t56, t58, t60 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        java.util.ListIterator<examples.MinFinder.T> tItor64 = tList62.listIterator();
        tList62.trimToSize();
        boolean boolean66 = tList51.addAll((java.util.Collection<examples.MinFinder.T>) tList62);
        examples.MinFinder.T t69 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t70 = tList51.set(2, t69);
        examples.MinFinder.T t73 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t74 = tList51.set(3, t73);
        boolean boolean75 = tList39.add(t74);
        int int76 = t74.getVal();
        minFinder10.add(t74);
        minFinder10.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertNotNull(tArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(t24);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tItor41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tItor46);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tItor64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(t70);
        org.junit.Assert.assertNotNull(t74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-3) + "'", int76 == (-3));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t45, t47, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        java.util.ListIterator<examples.MinFinder.T> tItor55 = tList53.listIterator();
        tList53.trimToSize();
        boolean boolean57 = tList42.addAll((java.util.Collection<examples.MinFinder.T>) tList53);
        boolean boolean58 = tList42.isEmpty();
        tList42.trimToSize();
        boolean boolean60 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.lang.Object[] objArray61 = tList42.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tItor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t54 = tList8.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        tList46.ensureCapacity((-10));
        int int54 = tList46.indexOf((java.lang.Object) (-5L));
        tList46.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        int int47 = t46.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray52 = new examples.MinFinder.T[] { t46, t49, t51 };
        java.util.ArrayList<examples.MinFinder.T> tList53 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList53, tArray52);
        boolean boolean56 = tList53.contains((java.lang.Object) 10L);
        boolean boolean57 = tList35.removeAll((java.util.Collection<examples.MinFinder.T>) tList53);
        tList53.ensureCapacity(7);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-3) + "'", int47 == (-3));
        org.junit.Assert.assertNotNull(tArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        java.util.stream.Stream<examples.MinFinder.T> tStream19 = tList3.parallelStream();
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        int int23 = t22.getVal();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t22, t25, t27 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        boolean boolean32 = tList29.contains((java.lang.Object) 10L);
        examples.MinFinder.T t34 = tList29.remove(0);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray37 = new examples.MinFinder.T[] { t36 };
        java.util.ArrayList<examples.MinFinder.T> tList38 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList38, tArray37);
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray48 = new examples.MinFinder.T[] { t41, t43, t45, t47 };
        java.util.ArrayList<examples.MinFinder.T> tList49 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList49, tArray48);
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList49.listIterator();
        tList49.trimToSize();
        boolean boolean53 = tList38.addAll((java.util.Collection<examples.MinFinder.T>) tList49);
        examples.MinFinder minFinder54 = new examples.MinFinder(tList49);
        boolean boolean55 = tList29.addAll((java.util.Collection<examples.MinFinder.T>) tList49);
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        int int58 = t57.getVal();
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t57, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        boolean boolean67 = tList64.contains((java.lang.Object) 10L);
        examples.MinFinder.T t69 = tList64.remove(0);
        java.lang.Class<?> wildcardClass70 = tList64.getClass();
        boolean boolean71 = tList29.remove((java.lang.Object) wildcardClass70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = tList3.addAll((-7), (java.util.Collection<examples.MinFinder.T>) tList29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -7, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tStream19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertNotNull(tArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(t34);
        org.junit.Assert.assertNotNull(tArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-3) + "'", int58 == (-3));
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(t69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray23 = new examples.MinFinder.T[] { t16, t18, t20, t22 };
        java.util.ArrayList<examples.MinFinder.T> tList24 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList24, tArray23);
        java.util.ListIterator<examples.MinFinder.T> tItor26 = tList24.listIterator();
        tList24.trimToSize();
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray36 = new examples.MinFinder.T[] { t29, t31, t33, t35 };
        java.util.ArrayList<examples.MinFinder.T> tList37 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList37, tArray36);
        java.util.ListIterator<examples.MinFinder.T> tItor39 = tList37.listIterator();
        boolean boolean40 = tList24.containsAll((java.util.Collection<examples.MinFinder.T>) tList37);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        int int44 = t43.getVal();
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray49 = new examples.MinFinder.T[] { t43, t46, t48 };
        java.util.ArrayList<examples.MinFinder.T> tList50 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList50, tArray49);
        boolean boolean53 = tList50.contains((java.lang.Object) 10L);
        examples.MinFinder.T t55 = tList50.remove(0);
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray58 = new examples.MinFinder.T[] { t57 };
        java.util.ArrayList<examples.MinFinder.T> tList59 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList59, tArray58);
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t62, t64, t66, t68 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        java.util.ListIterator<examples.MinFinder.T> tItor72 = tList70.listIterator();
        tList70.trimToSize();
        boolean boolean74 = tList59.addAll((java.util.Collection<examples.MinFinder.T>) tList70);
        examples.MinFinder minFinder75 = new examples.MinFinder(tList70);
        boolean boolean76 = tList50.addAll((java.util.Collection<examples.MinFinder.T>) tList70);
        tList70.ensureCapacity((int) (short) -1);
        boolean boolean80 = tList70.remove((java.lang.Object) 5.3d);
        boolean boolean81 = tList24.addAll(0, (java.util.Collection<examples.MinFinder.T>) tList70);
        boolean boolean82 = tList9.addAll((java.util.Collection<examples.MinFinder.T>) tList70);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tItor26);
        org.junit.Assert.assertNotNull(tArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-3) + "'", int44 == (-3));
        org.junit.Assert.assertNotNull(tArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(t55);
        org.junit.Assert.assertNotNull(tArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tItor72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-5));
        int int2 = t1.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        tList28.trimToSize();
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        int int41 = t40.getVal();
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray46 = new examples.MinFinder.T[] { t40, t43, t45 };
        java.util.ArrayList<examples.MinFinder.T> tList47 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList47, tArray46);
        boolean boolean50 = tList47.contains((java.lang.Object) 10L);
        examples.MinFinder.T t52 = tList47.remove(0);
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray66 = new examples.MinFinder.T[] { t59, t61, t63, t65 };
        java.util.ArrayList<examples.MinFinder.T> tList67 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList67, tArray66);
        java.util.ListIterator<examples.MinFinder.T> tItor69 = tList67.listIterator();
        tList67.trimToSize();
        boolean boolean71 = tList56.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList67);
        boolean boolean73 = tList47.addAll((java.util.Collection<examples.MinFinder.T>) tList67);
        java.util.stream.Stream<examples.MinFinder.T> tStream74 = tList67.parallelStream();
        int int75 = tList28.lastIndexOf((java.lang.Object) tList67);
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        int int78 = t77.getVal();
        examples.MinFinder.T t80 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t82 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray83 = new examples.MinFinder.T[] { t77, t80, t82 };
        java.util.ArrayList<examples.MinFinder.T> tList84 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList84, tArray83);
        boolean boolean87 = tList84.contains((java.lang.Object) 10L);
        boolean boolean88 = tList84.isEmpty();
        boolean boolean89 = tList67.remove((java.lang.Object) boolean88);
        boolean boolean90 = tList67.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-3) + "'", int41 == (-3));
        org.junit.Assert.assertNotNull(tArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(t52);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tItor69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(tStream74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-3) + "'", int78 == (-3));
        org.junit.Assert.assertNotNull(tArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.ArrayList<examples.MinFinder.T> tList1 = new java.util.ArrayList<examples.MinFinder.T>((int) '4');
        java.util.ArrayList<examples.MinFinder.T> tList2 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        boolean boolean13 = tList9.isEmpty();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t15, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        boolean boolean25 = tList22.contains((java.lang.Object) 10L);
        examples.MinFinder.T t27 = tList22.remove(0);
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t29 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t34, t36, t38, t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        java.util.ListIterator<examples.MinFinder.T> tItor44 = tList42.listIterator();
        tList42.trimToSize();
        boolean boolean46 = tList31.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList42);
        boolean boolean48 = tList22.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.util.ListIterator<examples.MinFinder.T> tItor49 = tList42.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList42.listIterator(2);
        boolean boolean52 = tList9.retainAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        int int56 = t55.getVal();
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t55, t58, t60 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        boolean boolean65 = tList62.contains((java.lang.Object) 10L);
        examples.MinFinder.T t67 = new examples.MinFinder.T((int) (short) 1);
        boolean boolean68 = tList62.add(t67);
        int int69 = t67.getVal();
        // The following exception was thrown during execution in test generation
        try {
            tList9.add((-8), t67);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -8, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(t27);
        org.junit.Assert.assertNotNull(tArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tItor44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tItor49);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-3) + "'", int56 == (-3));
        org.junit.Assert.assertNotNull(tArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        java.util.stream.Stream<examples.MinFinder.T> tStream19 = tList3.parallelStream();
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray29 = new examples.MinFinder.T[] { t22, t24, t26, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList30 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList30, tArray29);
        java.util.ListIterator<examples.MinFinder.T> tItor32 = tList30.listIterator();
        tList30.trimToSize();
        examples.MinFinder.T t35 = tList30.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream36 = tList30.parallelStream();
        tList30.trimToSize();
        java.lang.Object[] objArray38 = tList30.toArray();
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList30);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray43 = new examples.MinFinder.T[] { t42 };
        java.util.ArrayList<examples.MinFinder.T> tList44 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList44, tArray43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t47, t49, t51, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        java.util.ListIterator<examples.MinFinder.T> tItor57 = tList55.listIterator();
        tList55.trimToSize();
        boolean boolean59 = tList44.addAll((java.util.Collection<examples.MinFinder.T>) tList55);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t63 = tList44.set(2, t62);
        examples.MinFinder.T t64 = tList30.set((int) (short) 0, t62);
        // The following exception was thrown during execution in test generation
        try {
            tList3.add((-1), t62);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tStream19);
        org.junit.Assert.assertNotNull(tArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tItor32);
        org.junit.Assert.assertNotNull(t35);
        org.junit.Assert.assertNotNull(tStream36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(tArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(t63);
        org.junit.Assert.assertNotNull(t64);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream15 = tList9.parallelStream();
        tList9.trimToSize();
        java.lang.Object[] objArray17 = tList9.toArray();
        java.util.ArrayList<examples.MinFinder.T> tList18 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList9);
        int int19 = tList9.size();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tStream15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t36, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        boolean boolean46 = tList43.contains((java.lang.Object) 10L);
        examples.MinFinder.T t48 = tList43.remove(0);
        java.lang.Class<?> wildcardClass49 = tList43.getClass();
        boolean boolean50 = tList8.remove((java.lang.Object) wildcardClass49);
        int int52 = tList8.lastIndexOf((java.lang.Object) (-10));
        tList8.trimToSize();
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t60, t62, t64, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        java.util.ListIterator<examples.MinFinder.T> tItor70 = tList68.listIterator();
        tList68.trimToSize();
        boolean boolean72 = tList57.addAll((java.util.Collection<examples.MinFinder.T>) tList68);
        tList57.clear();
        boolean boolean74 = tList8.removeAll((java.util.Collection<examples.MinFinder.T>) tList57);
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t76 = tList57.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3) + "'", int37 == (-3));
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(t48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t16, t19, t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        boolean boolean26 = tList23.contains((java.lang.Object) 10L);
        examples.MinFinder.T t28 = tList23.remove(0);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t30 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder.T t35 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t35, t37, t39, t41 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        java.util.ListIterator<examples.MinFinder.T> tItor45 = tList43.listIterator();
        tList43.trimToSize();
        boolean boolean47 = tList32.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        boolean boolean49 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList43);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList43.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor52 = tList43.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream53 = tList43.parallelStream();
        boolean boolean54 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList43);
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t56, t59, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        boolean boolean66 = tList63.contains((java.lang.Object) 10L);
        examples.MinFinder.T t68 = tList63.remove(0);
        tList63.ensureCapacity(0);
        boolean boolean71 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList63);
        java.lang.Object[] objArray72 = tList9.toArray();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(t28);
        org.junit.Assert.assertNotNull(tArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-3) + "'", int57 == (-3));
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(t68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        tList9.trimToSize();
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray25 = new examples.MinFinder.T[] { t18, t20, t22, t24 };
        java.util.ArrayList<examples.MinFinder.T> tList26 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList26, tArray25);
        java.util.ListIterator<examples.MinFinder.T> tItor28 = tList26.listIterator();
        tList26.trimToSize();
        java.util.stream.Stream<examples.MinFinder.T> tStream30 = tList26.parallelStream();
        tList26.trimToSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tList9.addAll(97, (java.util.Collection<examples.MinFinder.T>) tList26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tItor28);
        org.junit.Assert.assertNotNull(tStream30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t11 = minFinder10.findmin();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(t11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.stream.Stream<examples.MinFinder.T> tStream35 = tList28.parallelStream();
        int int37 = tList28.indexOf((java.lang.Object) '4');
        java.util.function.UnaryOperator<examples.MinFinder.T> tUnaryOperator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            tList28.replaceAll(tUnaryOperator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tStream35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.lang.Object[] objArray13 = tList9.toArray();
        tList9.ensureCapacity(10);
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        int int19 = t18.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t18, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        boolean boolean28 = tList25.contains((java.lang.Object) 10L);
        examples.MinFinder.T t30 = tList25.remove(0);
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t39 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t37, t39, t41, t43 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        java.util.ListIterator<examples.MinFinder.T> tItor47 = tList45.listIterator();
        tList45.trimToSize();
        boolean boolean49 = tList34.addAll((java.util.Collection<examples.MinFinder.T>) tList45);
        examples.MinFinder minFinder50 = new examples.MinFinder(tList45);
        boolean boolean51 = tList25.addAll((java.util.Collection<examples.MinFinder.T>) tList45);
        java.util.Iterator<examples.MinFinder.T> tItor52 = tList45.iterator();
        examples.MinFinder minFinder53 = new examples.MinFinder(tList45);
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray56 = new examples.MinFinder.T[] { t55 };
        java.util.ArrayList<examples.MinFinder.T> tList57 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList57, tArray56);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t60, t62, t64, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        java.util.ListIterator<examples.MinFinder.T> tItor70 = tList68.listIterator();
        tList68.trimToSize();
        boolean boolean72 = tList57.addAll((java.util.Collection<examples.MinFinder.T>) tList68);
        examples.MinFinder.T t75 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t76 = tList57.set(2, t75);
        examples.MinFinder.T t79 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t80 = tList57.set(3, t79);
        boolean boolean81 = tList45.add(t80);
        int int82 = t80.getVal();
        int int83 = t80.getVal();
        tList9.add(1, t80);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(t30);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tItor52);
        org.junit.Assert.assertNotNull(tArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(t76);
        org.junit.Assert.assertNotNull(t80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-3) + "'", int82 == (-3));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-3) + "'", int83 == (-3));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        boolean boolean39 = tList3.retainAll((java.util.Collection<examples.MinFinder.T>) tList23);
        tList23.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t38 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t43, t45, t47, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        java.util.ListIterator<examples.MinFinder.T> tItor53 = tList51.listIterator();
        tList51.trimToSize();
        boolean boolean55 = tList40.addAll((java.util.Collection<examples.MinFinder.T>) tList51);
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = tList40.set(2, t58);
        minFinder36.add(t58);
        minFinder36.clear();
        minFinder36.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(t59);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        boolean boolean13 = tList9.isEmpty();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t15, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        boolean boolean25 = tList22.contains((java.lang.Object) 10L);
        examples.MinFinder.T t27 = tList22.remove(0);
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t29 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t34, t36, t38, t40 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        java.util.ListIterator<examples.MinFinder.T> tItor44 = tList42.listIterator();
        tList42.trimToSize();
        boolean boolean46 = tList31.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList42);
        boolean boolean48 = tList22.addAll((java.util.Collection<examples.MinFinder.T>) tList42);
        java.util.ListIterator<examples.MinFinder.T> tItor49 = tList42.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList42.listIterator(2);
        boolean boolean52 = tList9.retainAll((java.util.Collection<examples.MinFinder.T>) tList42);
        int int53 = tList42.size();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(t27);
        org.junit.Assert.assertNotNull(tArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tItor44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tItor49);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray48 = new examples.MinFinder.T[] { t41, t43, t45, t47 };
        java.util.ArrayList<examples.MinFinder.T> tList49 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList49, tArray48);
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList49.listIterator();
        tList49.trimToSize();
        examples.MinFinder.T t54 = tList49.get((int) (byte) 0);
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t56, t58, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        java.util.ListIterator<examples.MinFinder.T> tItor66 = tList64.listIterator();
        tList64.trimToSize();
        java.util.stream.Stream<examples.MinFinder.T> tStream68 = tList64.parallelStream();
        boolean boolean69 = tList49.addAll((java.util.Collection<examples.MinFinder.T>) tList64);
        boolean boolean70 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList64);
        examples.MinFinder.T t72 = tList28.get(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertNotNull(t54);
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tItor66);
        org.junit.Assert.assertNotNull(tStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(t72);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.ListIterator<examples.MinFinder.T> tItor35 = tList28.listIterator();
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList28.listIterator(2);
        java.util.stream.Stream<examples.MinFinder.T> tStream38 = tList28.parallelStream();
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray48 = new examples.MinFinder.T[] { t41, t43, t45, t47 };
        java.util.ArrayList<examples.MinFinder.T> tList49 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList49, tArray48);
        java.util.ListIterator<examples.MinFinder.T> tItor51 = tList49.listIterator();
        tList49.trimToSize();
        examples.MinFinder.T t54 = tList49.get((int) (byte) 0);
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t56, t58, t60, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        java.util.ListIterator<examples.MinFinder.T> tItor66 = tList64.listIterator();
        tList64.trimToSize();
        java.util.stream.Stream<examples.MinFinder.T> tStream68 = tList64.parallelStream();
        boolean boolean69 = tList49.addAll((java.util.Collection<examples.MinFinder.T>) tList64);
        boolean boolean70 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList64);
        tList28.ensureCapacity(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(tStream38);
        org.junit.Assert.assertNotNull(tArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertNotNull(t54);
        org.junit.Assert.assertNotNull(tArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tItor66);
        org.junit.Assert.assertNotNull(tStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.lang.Object[] objArray15 = tList9.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor16 = tList9.iterator();
        java.util.ListIterator<examples.MinFinder.T> tItor17 = tList9.listIterator();
        int int19 = tList9.indexOf((java.lang.Object) (-6));
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        int int22 = t21.getVal();
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t21, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        boolean boolean31 = tList28.contains((java.lang.Object) 10L);
        examples.MinFinder.T t33 = tList28.remove(0);
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray36 = new examples.MinFinder.T[] { t35 };
        java.util.ArrayList<examples.MinFinder.T> tList37 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList37, tArray36);
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray47 = new examples.MinFinder.T[] { t40, t42, t44, t46 };
        java.util.ArrayList<examples.MinFinder.T> tList48 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList48, tArray47);
        java.util.ListIterator<examples.MinFinder.T> tItor50 = tList48.listIterator();
        tList48.trimToSize();
        boolean boolean52 = tList37.addAll((java.util.Collection<examples.MinFinder.T>) tList48);
        examples.MinFinder minFinder53 = new examples.MinFinder(tList48);
        boolean boolean54 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList48);
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t56, t59, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        boolean boolean66 = tList63.contains((java.lang.Object) 10L);
        examples.MinFinder.T t68 = tList63.remove(0);
        java.lang.Class<?> wildcardClass69 = tList63.getClass();
        boolean boolean70 = tList28.remove((java.lang.Object) wildcardClass69);
        int int72 = tList28.lastIndexOf((java.lang.Object) (-10));
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray75 = new examples.MinFinder.T[] { t74 };
        java.util.ArrayList<examples.MinFinder.T> tList76 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList76, tArray75);
        examples.MinFinder.T t79 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t81 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t83 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t85 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray86 = new examples.MinFinder.T[] { t79, t81, t83, t85 };
        java.util.ArrayList<examples.MinFinder.T> tList87 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList87, tArray86);
        java.util.ListIterator<examples.MinFinder.T> tItor89 = tList87.listIterator();
        tList87.trimToSize();
        boolean boolean91 = tList76.addAll((java.util.Collection<examples.MinFinder.T>) tList87);
        examples.MinFinder minFinder92 = new examples.MinFinder(tList87);
        examples.MinFinder.T t93 = minFinder92.findmin();
        examples.MinFinder.T t95 = new examples.MinFinder.T((int) 'a');
        minFinder92.add(t95);
        boolean boolean97 = tList28.contains((java.lang.Object) t95);
        boolean boolean98 = tList9.add(t95);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertNotNull(tItor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3) + "'", int22 == (-3));
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(t33);
        org.junit.Assert.assertNotNull(tArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tItor50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-3) + "'", int57 == (-3));
        org.junit.Assert.assertNotNull(tArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(t68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(tArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(tArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(tItor89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(t93);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        java.util.Iterator<examples.MinFinder.T> tItor15 = tList9.iterator();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tItor15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        examples.MinFinder minFinder21 = new examples.MinFinder(tList3);
        minFinder21.clear();
        examples.MinFinder.T t24 = new examples.MinFinder.T(10);
        int int25 = t24.getVal();
        minFinder21.chval(t24, 0);
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        int int30 = t29.getVal();
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray35 = new examples.MinFinder.T[] { t29, t32, t34 };
        java.util.ArrayList<examples.MinFinder.T> tList36 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList36, tArray35);
        boolean boolean39 = tList36.contains((java.lang.Object) 10L);
        examples.MinFinder.T t41 = tList36.remove(0);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t43 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        boolean boolean60 = tList45.addAll((java.util.Collection<examples.MinFinder.T>) tList56);
        examples.MinFinder minFinder61 = new examples.MinFinder(tList56);
        boolean boolean62 = tList36.addAll((java.util.Collection<examples.MinFinder.T>) tList56);
        java.util.Iterator<examples.MinFinder.T> tItor63 = tList56.iterator();
        examples.MinFinder minFinder64 = new examples.MinFinder(tList56);
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t72 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray73 = new examples.MinFinder.T[] { t66, t68, t70, t72 };
        java.util.ArrayList<examples.MinFinder.T> tList74 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList74, tArray73);
        java.util.ListIterator<examples.MinFinder.T> tItor76 = tList74.listIterator();
        tList74.trimToSize();
        boolean boolean78 = tList56.addAll((java.util.Collection<examples.MinFinder.T>) tList74);
        java.util.Iterator<examples.MinFinder.T> tItor79 = tList74.iterator();
        java.util.ArrayList<examples.MinFinder.T> tList80 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList74);
        examples.MinFinder.T t82 = tList74.get(1);
        minFinder21.add(t82);
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(tArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(t41);
        org.junit.Assert.assertNotNull(tArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tItor63);
        org.junit.Assert.assertNotNull(tArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(tItor76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(tItor79);
        org.junit.Assert.assertNotNull(t82);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        minFinder19.clear();
        examples.MinFinder.T t21 = minFinder19.findmin();
        java.lang.Class<?> wildcardClass22 = minFinder19.getClass();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(t21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        java.lang.Object[] objArray13 = tList9.toArray();
        java.util.Iterator<examples.MinFinder.T> tItor14 = tList9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            examples.MinFinder.T t16 = tList9.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(tItor14);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray45 = new examples.MinFinder.T[] { t38, t40, t42, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList46 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList46, tArray45);
        java.util.ListIterator<examples.MinFinder.T> tItor48 = tList46.listIterator();
        tList46.trimToSize();
        boolean boolean50 = tList28.addAll((java.util.Collection<examples.MinFinder.T>) tList46);
        java.util.Iterator<examples.MinFinder.T> tItor51 = tList46.iterator();
        java.util.ArrayList<examples.MinFinder.T> tList52 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList46);
        examples.MinFinder.T t54 = tList46.get(1);
        int int55 = t54.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tItor51);
        org.junit.Assert.assertNotNull(t54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = tList9.get((int) (byte) 0);
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t17, t19, t21, t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        java.util.ListIterator<examples.MinFinder.T> tItor27 = tList25.listIterator();
        tList25.trimToSize();
        examples.MinFinder.T t30 = tList25.get((int) (byte) 0);
        tList9.add((int) (short) 1, t30);
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t39 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray40 = new examples.MinFinder.T[] { t34, t37, t39 };
        java.util.ArrayList<examples.MinFinder.T> tList41 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList41, tArray40);
        boolean boolean44 = tList41.contains((java.lang.Object) 10L);
        examples.MinFinder.T t46 = tList41.remove(0);
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray49 = new examples.MinFinder.T[] { t48 };
        java.util.ArrayList<examples.MinFinder.T> tList50 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList50, tArray49);
        examples.MinFinder.T t53 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t59 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray60 = new examples.MinFinder.T[] { t53, t55, t57, t59 };
        java.util.ArrayList<examples.MinFinder.T> tList61 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList61, tArray60);
        java.util.ListIterator<examples.MinFinder.T> tItor63 = tList61.listIterator();
        tList61.trimToSize();
        boolean boolean65 = tList50.addAll((java.util.Collection<examples.MinFinder.T>) tList61);
        examples.MinFinder minFinder66 = new examples.MinFinder(tList61);
        boolean boolean67 = tList41.addAll((java.util.Collection<examples.MinFinder.T>) tList61);
        java.util.Iterator<examples.MinFinder.T> tItor68 = tList61.iterator();
        examples.MinFinder minFinder69 = new examples.MinFinder(tList61);
        examples.MinFinder.T t71 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t75 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray78 = new examples.MinFinder.T[] { t71, t73, t75, t77 };
        java.util.ArrayList<examples.MinFinder.T> tList79 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList79, tArray78);
        java.util.ListIterator<examples.MinFinder.T> tItor81 = tList79.listIterator();
        tList79.trimToSize();
        boolean boolean83 = tList61.addAll((java.util.Collection<examples.MinFinder.T>) tList79);
        boolean boolean84 = tList79.isEmpty();
        java.util.ListIterator<examples.MinFinder.T> tItor85 = tList79.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = tList9.addAll(97, (java.util.Collection<examples.MinFinder.T>) tList79);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(t14);
        org.junit.Assert.assertNotNull(tArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tItor27);
        org.junit.Assert.assertNotNull(t30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-3) + "'", int35 == (-3));
        org.junit.Assert.assertNotNull(tArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(t46);
        org.junit.Assert.assertNotNull(tArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tItor63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tItor68);
        org.junit.Assert.assertNotNull(tArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(tItor81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tItor85);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.ArrayList<java.util.AbstractList<examples.MinFinder.T>> tListList1 = new java.util.ArrayList<java.util.AbstractList<examples.MinFinder.T>>((int) (short) 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        java.util.ListIterator<examples.MinFinder.T> tItor26 = tList9.listIterator();
        tList9.ensureCapacity((-100));
        tList9.clear();
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tItor26);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        int int2 = t1.getVal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        int int2 = t1.getVal();
        examples.MinFinder.T t4 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t4, t6 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        boolean boolean11 = tList8.contains((java.lang.Object) 10L);
        examples.MinFinder.T t13 = tList8.remove(0);
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray16 = new examples.MinFinder.T[] { t15 };
        java.util.ArrayList<examples.MinFinder.T> tList17 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList17, tArray16);
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray27 = new examples.MinFinder.T[] { t20, t22, t24, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList28 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList28, tArray27);
        java.util.ListIterator<examples.MinFinder.T> tItor30 = tList28.listIterator();
        tList28.trimToSize();
        boolean boolean32 = tList17.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList28);
        boolean boolean34 = tList8.addAll((java.util.Collection<examples.MinFinder.T>) tList28);
        java.util.Iterator<examples.MinFinder.T> tItor35 = tList28.iterator();
        examples.MinFinder minFinder36 = new examples.MinFinder(tList28);
        java.util.Iterator<examples.MinFinder.T> tItor37 = tList28.iterator();
        int int38 = tList28.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(tArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(t13);
        org.junit.Assert.assertNotNull(tArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tItor35);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        minFinder20.clear();
        examples.MinFinder.T t22 = null;
        minFinder20.chval(t22, (-5));
        minFinder20.clear();
        org.junit.Assert.assertNotNull(tArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t3 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray8 = new examples.MinFinder.T[] { t1, t3, t5, t7 };
        java.util.ArrayList<examples.MinFinder.T> tList9 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList9, tArray8);
        java.util.ListIterator<examples.MinFinder.T> tItor11 = tList9.listIterator();
        tList9.trimToSize();
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray21 = new examples.MinFinder.T[] { t14, t16, t18, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList22 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList22, tArray21);
        java.util.ListIterator<examples.MinFinder.T> tItor24 = tList22.listIterator();
        boolean boolean25 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList22);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t27, t29, t31, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        java.util.ListIterator<examples.MinFinder.T> tItor37 = tList35.listIterator();
        tList35.trimToSize();
        examples.MinFinder.T t40 = tList35.get((int) (byte) 0);
        java.util.stream.Stream<examples.MinFinder.T> tStream41 = tList35.parallelStream();
        int int43 = tList35.indexOf((java.lang.Object) (-4));
        boolean boolean44 = tList9.containsAll((java.util.Collection<examples.MinFinder.T>) tList35);
        boolean boolean46 = tList9.remove((java.lang.Object) 9);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t48, t50, t52, t54 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        java.util.ListIterator<examples.MinFinder.T> tItor58 = tList56.listIterator();
        tList56.trimToSize();
        examples.MinFinder.T t61 = tList56.get((int) (byte) 0);
        examples.MinFinder.T t64 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray71 = new examples.MinFinder.T[] { t64, t66, t68, t70 };
        java.util.ArrayList<examples.MinFinder.T> tList72 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList72, tArray71);
        java.util.ListIterator<examples.MinFinder.T> tItor74 = tList72.listIterator();
        tList72.trimToSize();
        examples.MinFinder.T t77 = tList72.get((int) (byte) 0);
        tList56.add((int) (short) 1, t77);
        java.lang.Class<?> wildcardClass79 = tList56.getClass();
        int int80 = tList9.lastIndexOf((java.lang.Object) wildcardClass79);
        org.junit.Assert.assertNotNull(tArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tItor11);
        org.junit.Assert.assertNotNull(tArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tItor37);
        org.junit.Assert.assertNotNull(t40);
        org.junit.Assert.assertNotNull(tStream41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tItor58);
        org.junit.Assert.assertNotNull(t61);
        org.junit.Assert.assertNotNull(tArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(tItor74);
        org.junit.Assert.assertNotNull(t77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }
}

