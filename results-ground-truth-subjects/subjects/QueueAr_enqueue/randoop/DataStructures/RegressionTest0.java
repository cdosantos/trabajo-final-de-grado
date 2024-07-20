package DataStructures;
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
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow0.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Class<?> wildcardClass6 = overflow3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Class<?> wildcardClass1 = overflow0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (-6L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Class<?> wildcardClass3 = overflow0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-3));
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Class<?> wildcardClass8 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass12 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
        boolean boolean2 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Class<?> wildcardClass16 = overflow11.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        java.lang.Object obj2 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(6);
        boolean boolean7 = queueAr6.isEmpty();
        boolean boolean8 = queueAr6.isEmpty();
        boolean boolean9 = queueAr6.isFull();
        boolean boolean10 = queueAr6.isFull();
        java.lang.Object obj11 = queueAr6.getFront();
        queueAr1.enqueue(obj11);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        java.lang.Object obj22 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        boolean boolean2 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass5 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        boolean boolean4 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(5);
        boolean boolean6 = queueAr5.isEmpty();
        java.lang.Object obj7 = queueAr5.dequeue();
        queueAr1.enqueue(obj7);
        java.lang.Object obj9 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Class<?> wildcardClass4 = overflow1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.dequeueAll();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(6);
        boolean boolean18 = queueAr17.isEmpty();
        boolean boolean19 = queueAr17.isEmpty();
        queueAr15.enqueue((java.lang.Object) queueAr17);
        queueAr9.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj22 = queueAr17.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Class<?> wildcardClass33 = overflow25.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        boolean boolean9 = queueAr7.isEmpty();
        queueAr7.enqueue((java.lang.Object) (-10));
        queueAr7.enqueue((java.lang.Object) (-8));
        queueAr7.makeEmpty();
        queueAr7.enqueue((java.lang.Object) 9);
        java.lang.Object obj17 = queueAr7.dequeue();
        boolean boolean18 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) boolean18);
        queueAr1.dequeueAll();
        java.lang.Object obj21 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 9 + "'", obj17, 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Class<?> wildcardClass21 = throwableArray20.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow8.addSuppressed((java.lang.Throwable) overflow12);
        overflow4.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray17 = overflow8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow23.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray36 = overflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray48 = overflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow47);
        overflow38.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow47.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow47);
        overflow26.addSuppressed((java.lang.Throwable) overflow47);
        overflow16.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray56 = overflow16.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.dequeueAll();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '4');
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow16.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        boolean boolean7 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow16.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray30 = overflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray34 = overflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow26.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray42 = overflow26.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Class<?> wildcardClass44 = overflow26.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Object obj5 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow23.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray36 = overflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray48 = overflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow47);
        overflow38.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow47.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow47);
        overflow26.addSuppressed((java.lang.Throwable) overflow47);
        overflow16.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray56 = overflow47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Class<?> wildcardClass12 = overflow8.getClass();
        queueAr1.enqueue((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Class<?> wildcardClass8 = overflow6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass13 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean6 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) '#');
        boolean boolean8 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj6 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-10) + "'", obj6, (-10));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) '#');
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        boolean boolean12 = queueAr9.isFull();
        queueAr9.makeEmpty();
        boolean boolean14 = queueAr9.isFull();
        java.lang.Object obj15 = queueAr9.dequeue();
        queueAr1.enqueue(obj15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        overflow16.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray41 = overflow38.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Object obj5 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(2);
        java.lang.Object obj2 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow7.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        queueAr1.enqueue((java.lang.Object) overflow11);
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 1);
        boolean boolean2 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        boolean boolean13 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr9.enqueue((java.lang.Object) (-10));
        queueAr9.enqueue((java.lang.Object) (-8));
        queueAr9.makeEmpty();
        queueAr9.enqueue((java.lang.Object) 9);
        java.lang.Object obj19 = queueAr9.dequeue();
        boolean boolean20 = queueAr9.isFull();
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 9 + "'", obj19, 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray37 = overflow36.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray43 = overflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        overflow33.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) overflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray53 = overflow49.getSuppressed();
        java.lang.Throwable[] throwableArray54 = overflow49.getSuppressed();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        overflow55.addSuppressed((java.lang.Throwable) overflow56);
        java.lang.Throwable[] throwableArray58 = overflow56.getSuppressed();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow60);
        java.lang.Throwable[] throwableArray62 = overflow59.getSuppressed();
        java.lang.Throwable[] throwableArray63 = overflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        overflow65.addSuppressed((java.lang.Throwable) overflow66);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray69 = overflow68.getSuppressed();
        overflow65.addSuppressed((java.lang.Throwable) overflow68);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        overflow71.addSuppressed((java.lang.Throwable) overflow72);
        DataStructures.Overflow overflow74 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray75 = overflow74.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) overflow74);
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        DataStructures.Overflow overflow78 = new DataStructures.Overflow();
        overflow77.addSuppressed((java.lang.Throwable) overflow78);
        DataStructures.Overflow overflow80 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray81 = overflow80.getSuppressed();
        overflow77.addSuppressed((java.lang.Throwable) overflow80);
        overflow71.addSuppressed((java.lang.Throwable) overflow80);
        java.lang.Throwable[] throwableArray84 = overflow80.getSuppressed();
        java.lang.Throwable[] throwableArray85 = overflow80.getSuppressed();
        overflow68.addSuppressed((java.lang.Throwable) overflow80);
        overflow59.addSuppressed((java.lang.Throwable) overflow80);
        overflow49.addSuppressed((java.lang.Throwable) overflow80);
        overflow25.addSuppressed((java.lang.Throwable) overflow49);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        java.lang.Object obj15 = queueAr9.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        overflow16.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray47 = overflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray53 = overflow52.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow52);
        overflow43.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray60 = overflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        overflow52.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray63 = overflow59.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow59);
        overflow16.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray66 = overflow41.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        boolean boolean2 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        boolean boolean8 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        java.lang.Object obj25 = null;
        queueAr23.enqueue(obj25);
        queueAr23.makeEmpty();
        boolean boolean28 = queueAr23.isFull();
        java.lang.Object obj29 = queueAr23.dequeue();
        queueAr16.enqueue((java.lang.Object) queueAr23);
        queueAr16.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        java.lang.Object obj2 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = null;
        queueAr4.enqueue(obj6);
        queueAr4.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Class<?> wildcardClass11 = queueAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        boolean boolean7 = queueAr5.isEmpty();
        queueAr5.enqueue((java.lang.Object) (-10));
        queueAr5.enqueue((java.lang.Object) (-8));
        queueAr5.makeEmpty();
        queueAr5.enqueue((java.lang.Object) 9);
        java.lang.Object obj15 = queueAr5.dequeue();
        queueAr5.makeEmpty();
        queueAr5.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr5);
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr(5);
        boolean boolean21 = queueAr20.isEmpty();
        queueAr20.makeEmpty();
        queueAr20.dequeueAll();
        java.lang.Object obj24 = queueAr20.getFront();
        queueAr1.enqueue(obj24);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 9 + "'", obj15, 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass23 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        boolean boolean9 = queueAr7.isEmpty();
        queueAr7.enqueue((java.lang.Object) (-10));
        queueAr7.enqueue((java.lang.Object) (-8));
        queueAr7.makeEmpty();
        queueAr7.enqueue((java.lang.Object) 9);
        java.lang.Object obj17 = queueAr7.dequeue();
        boolean boolean18 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) boolean18);
        boolean boolean20 = queueAr1.isEmpty();
        java.lang.Object obj21 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 9 + "'", obj17, 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (short) 1);
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        queueAr3.dequeueAll();
        boolean boolean10 = queueAr3.isFull();
        queueAr3.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj14 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.enqueue((java.lang.Object) (-5L));
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 8 + "'", obj7, 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr3.getFront();
        java.lang.Object obj8 = queueAr3.getFront();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.getFront();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr(6);
        boolean boolean14 = queueAr13.isEmpty();
        java.lang.Object obj15 = queueAr13.dequeue();
        queueAr1.enqueue(obj15);
        java.lang.Object obj17 = queueAr1.dequeue();
        java.lang.Object obj18 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (-1.0d));
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        java.lang.Class<?> wildcardClass13 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow12.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow15.addSuppressed((java.lang.Throwable) overflow24);
        overflow12.addSuppressed((java.lang.Throwable) overflow24);
        overflow8.addSuppressed((java.lang.Throwable) overflow24);
        overflow3.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable throwable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow3.addSuppressed(throwable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Class<?> wildcardClass25 = overflow16.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) (-4.6d));
        DataStructures.QueueAr queueAr14 = new DataStructures.QueueAr(6);
        boolean boolean15 = queueAr14.isEmpty();
        java.lang.Object obj16 = null;
        queueAr14.enqueue(obj16);
        queueAr14.dequeueAll();
        queueAr14.enqueue((java.lang.Object) 0.0f);
        boolean boolean21 = queueAr14.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr15.isFull();
        java.lang.Class<?> wildcardClass23 = queueAr15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.enqueue((java.lang.Object) (-5L));
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj17 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr9.enqueue((java.lang.Object) (-10));
        queueAr9.enqueue((java.lang.Object) (-8));
        queueAr9.makeEmpty();
        queueAr9.enqueue((java.lang.Object) 9);
        java.lang.Object obj19 = queueAr9.dequeue();
        boolean boolean20 = queueAr9.isFull();
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj23 = queueAr1.getFront();
        java.lang.Object obj24 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 9 + "'", obj19, 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow45);
        overflow23.addSuppressed((java.lang.Throwable) overflow45);
        queueAr1.enqueue((java.lang.Object) overflow23);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        overflow23.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray58 = overflow57.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) overflow57);
        java.lang.Throwable[] throwableArray60 = overflow54.getSuppressed();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray63 = overflow61.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray65 = overflow49.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        java.lang.Object obj9 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr7.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray21 = overflow20.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        overflow11.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        queueAr1.enqueue((java.lang.Object) throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-5L));
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
        java.lang.Object obj2 = queueAr1.dequeue();
        boolean boolean3 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-5L));
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj6 = queueAr1.dequeue();
        java.lang.Object obj7 = queueAr1.getFront();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-10) + "'", obj6, (-10));
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray16 = overflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        overflow6.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow27.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        overflow3.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Class<?> wildcardClass32 = overflow22.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        java.lang.Object obj2 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = null;
        queueAr4.enqueue(obj6);
        queueAr4.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) queueAr4);
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray16 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass17 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = null;
        queueAr4.enqueue(obj6);
        queueAr4.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Class<?> wildcardClass11 = queueAr4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.getFront();
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass10 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
        java.lang.Object obj2 = queueAr1.dequeue();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow45);
        overflow23.addSuppressed((java.lang.Throwable) overflow45);
        queueAr1.enqueue((java.lang.Object) overflow23);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        overflow23.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable throwable54 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow23.addSuppressed(throwable54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow16.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray30 = overflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray34 = overflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow26.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray42 = overflow26.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray48 = overflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.QueueAr queueAr53 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj54 = queueAr53.getFront();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray56 = overflow55.getSuppressed();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray61 = overflow60.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        overflow63.addSuppressed((java.lang.Throwable) overflow64);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray67 = overflow66.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) overflow66);
        overflow57.addSuppressed((java.lang.Throwable) overflow66);
        DataStructures.Overflow overflow70 = new DataStructures.Overflow();
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        overflow70.addSuppressed((java.lang.Throwable) overflow71);
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray74 = overflow73.getSuppressed();
        overflow70.addSuppressed((java.lang.Throwable) overflow73);
        overflow66.addSuppressed((java.lang.Throwable) overflow73);
        java.lang.Throwable[] throwableArray77 = overflow73.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) overflow73);
        DataStructures.Overflow overflow79 = new DataStructures.Overflow();
        DataStructures.Overflow overflow80 = new DataStructures.Overflow();
        overflow79.addSuppressed((java.lang.Throwable) overflow80);
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray83 = overflow82.getSuppressed();
        overflow79.addSuppressed((java.lang.Throwable) overflow82);
        DataStructures.Overflow overflow85 = new DataStructures.Overflow();
        DataStructures.Overflow overflow86 = new DataStructures.Overflow();
        overflow85.addSuppressed((java.lang.Throwable) overflow86);
        DataStructures.Overflow overflow88 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray89 = overflow88.getSuppressed();
        overflow85.addSuppressed((java.lang.Throwable) overflow88);
        overflow79.addSuppressed((java.lang.Throwable) overflow88);
        overflow73.addSuppressed((java.lang.Throwable) overflow88);
        queueAr53.enqueue((java.lang.Object) overflow88);
        overflow50.addSuppressed((java.lang.Throwable) overflow88);
        overflow16.addSuppressed((java.lang.Throwable) overflow88);
        java.lang.Throwable[] throwableArray96 = overflow88.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray96);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 8 + "'", obj5, 8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        boolean boolean7 = queueAr5.isEmpty();
        queueAr5.enqueue((java.lang.Object) (-10));
        queueAr5.enqueue((java.lang.Object) (-8));
        queueAr5.makeEmpty();
        queueAr5.enqueue((java.lang.Object) 9);
        java.lang.Object obj15 = queueAr5.dequeue();
        queueAr5.makeEmpty();
        queueAr5.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr5);
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 9 + "'", obj15, 9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr15.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        java.lang.Object obj10 = queueAr1.getFront();
        java.lang.Object obj11 = queueAr1.getFront();
        java.lang.Object obj12 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean13 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj15 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr1.isFull();
        boolean boolean23 = queueAr1.isEmpty();
        boolean boolean24 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        java.lang.Object obj9 = null;
        queueAr7.enqueue(obj9);
        java.lang.Object obj11 = queueAr7.dequeue();
        queueAr7.enqueue((java.lang.Object) (-1.0d));
        boolean boolean14 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        java.lang.Class<?> wildcardClass16 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr(6);
        boolean boolean12 = queueAr11.isEmpty();
        boolean boolean13 = queueAr11.isEmpty();
        queueAr11.enqueue((java.lang.Object) (-10));
        queueAr11.enqueue((java.lang.Object) (-8));
        queueAr11.makeEmpty();
        queueAr11.enqueue((java.lang.Object) 9);
        queueAr11.enqueue((java.lang.Object) (-100L));
        queueAr11.makeEmpty();
        boolean boolean24 = queueAr11.isFull();
        boolean boolean25 = queueAr11.isFull();
        queueAr1.enqueue((java.lang.Object) boolean25);
        java.lang.Object obj27 = queueAr1.getFront();
        boolean boolean28 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow22.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray31 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow26.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray38 = overflow37.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow37);
        overflow26.addSuppressed((java.lang.Throwable) overflow34);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        boolean boolean8 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow3.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow14.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray21 = overflow20.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow17.addSuppressed((java.lang.Throwable) overflow26);
        overflow14.addSuppressed((java.lang.Throwable) overflow26);
        overflow10.addSuppressed((java.lang.Throwable) overflow26);
        overflow1.addSuppressed((java.lang.Throwable) overflow10);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
        java.lang.Object obj2 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        queueAr1.enqueue((java.lang.Object) overflow12);
        java.lang.Object obj24 = queueAr1.getFront();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "DataStructures.Overflow");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow16.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray30 = overflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray34 = overflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow26.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray42 = overflow26.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray44 = overflow26.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.dequeueAll();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(6);
        boolean boolean18 = queueAr17.isEmpty();
        boolean boolean19 = queueAr17.isEmpty();
        queueAr15.enqueue((java.lang.Object) queueAr17);
        queueAr9.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj22 = queueAr17.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        boolean boolean24 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Object obj4 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow7.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        overflow7.addSuppressed((java.lang.Throwable) overflow19);
        overflow3.addSuppressed((java.lang.Throwable) overflow19);
        overflow1.addSuppressed((java.lang.Throwable) overflow3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray33 = overflow25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        java.lang.Object obj2 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = null;
        queueAr4.enqueue(obj6);
        queueAr4.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Object obj11 = queueAr4.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        queueAr1.enqueue((java.lang.Object) boolean6);
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(6);
        boolean boolean7 = queueAr6.isEmpty();
        boolean boolean8 = queueAr6.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr6);
        boolean boolean10 = queueAr6.isEmpty();
        java.lang.Object obj11 = queueAr6.getFront();
        queueAr6.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        java.lang.Object obj10 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        java.lang.Object obj25 = null;
        queueAr23.enqueue(obj25);
        queueAr23.makeEmpty();
        boolean boolean28 = queueAr23.isFull();
        java.lang.Object obj29 = queueAr23.dequeue();
        queueAr16.enqueue((java.lang.Object) queueAr23);
        queueAr16.makeEmpty();
        boolean boolean32 = queueAr16.isEmpty();
        java.lang.Object obj33 = queueAr16.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray22 = overflow16.getSuppressed();
        java.lang.Class<?> wildcardClass23 = overflow16.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        java.lang.Object obj6 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray16 = overflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        overflow6.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow15.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        boolean boolean25 = queueAr23.isEmpty();
        boolean boolean26 = queueAr23.isFull();
        queueAr23.makeEmpty();
        java.lang.Object obj28 = queueAr23.getFront();
        java.lang.Object obj29 = queueAr23.getFront();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow30.addSuppressed((java.lang.Throwable) overflow34);
        queueAr23.enqueue((java.lang.Object) overflow30);
        java.lang.Throwable[] throwableArray39 = overflow30.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray41 = overflow3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        boolean boolean7 = queueAr6.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass10 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        java.lang.Object obj14 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        java.lang.Object obj10 = queueAr1.getFront();
        java.lang.Object obj11 = queueAr1.getFront();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(3);
        queueAr1.dequeueAll();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr3.getFront();
        boolean boolean8 = queueAr3.isEmpty();
        queueAr3.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        overflow9.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow34);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray47 = overflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray53 = overflow52.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow52);
        overflow43.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray60 = overflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        overflow52.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray63 = overflow59.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray65 = overflow59.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray67 = overflow59.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr9.enqueue((java.lang.Object) (-10));
        queueAr9.enqueue((java.lang.Object) (-8));
        queueAr9.makeEmpty();
        queueAr9.enqueue((java.lang.Object) 9);
        java.lang.Object obj19 = queueAr9.dequeue();
        boolean boolean20 = queueAr9.isFull();
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        boolean boolean23 = queueAr9.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 9 + "'", obj19, 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr7.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        queueAr7.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr15.isFull();
        queueAr15.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        queueAr1.enqueue((java.lang.Object) overflow10);
        java.lang.Object obj16 = queueAr1.getFront();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "DataStructures.Overflow");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        queueAr15.makeEmpty();
        queueAr15.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        overflow15.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray31 = overflow15.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray33 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow32.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray39 = overflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray45 = overflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow44);
        overflow35.addSuppressed((java.lang.Throwable) overflow44);
        overflow32.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray49 = overflow44.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow44);
        overflow9.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray52 = overflow44.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(5);
        boolean boolean10 = queueAr9.isEmpty();
        queueAr9.makeEmpty();
        queueAr9.dequeueAll();
        java.lang.Object obj13 = queueAr9.getFront();
        queueAr9.enqueue((java.lang.Object) '#');
        queueAr1.enqueue((java.lang.Object) queueAr9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        overflow5.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray37 = overflow36.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow36);
        overflow27.addSuppressed((java.lang.Throwable) overflow36);
        overflow21.addSuppressed((java.lang.Throwable) overflow36);
        queueAr1.enqueue((java.lang.Object) overflow36);
        boolean boolean42 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow15.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray28 = overflow15.getSuppressed();
        queueAr1.enqueue((java.lang.Object) throwableArray28);
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray9 = overflow7.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow13.addSuppressed((java.lang.Throwable) overflow22);
        overflow10.addSuppressed((java.lang.Throwable) overflow22);
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray37 = overflow36.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray43 = overflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        overflow33.addSuppressed((java.lang.Throwable) overflow42);
        overflow25.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow48.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray54 = overflow51.getSuppressed();
        java.lang.Throwable[] throwableArray55 = overflow51.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray61 = overflow60.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        overflow63.addSuppressed((java.lang.Throwable) overflow64);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray67 = overflow66.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) overflow66);
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        DataStructures.Overflow overflow70 = new DataStructures.Overflow();
        overflow69.addSuppressed((java.lang.Throwable) overflow70);
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray73 = overflow72.getSuppressed();
        overflow69.addSuppressed((java.lang.Throwable) overflow72);
        overflow63.addSuppressed((java.lang.Throwable) overflow72);
        java.lang.Throwable[] throwableArray76 = overflow72.getSuppressed();
        java.lang.Throwable[] throwableArray77 = overflow72.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) overflow72);
        overflow51.addSuppressed((java.lang.Throwable) overflow72);
        DataStructures.Overflow overflow80 = new DataStructures.Overflow();
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        overflow80.addSuppressed((java.lang.Throwable) overflow81);
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray84 = overflow83.getSuppressed();
        overflow80.addSuppressed((java.lang.Throwable) overflow83);
        DataStructures.Overflow overflow86 = new DataStructures.Overflow();
        DataStructures.Overflow overflow87 = new DataStructures.Overflow();
        overflow86.addSuppressed((java.lang.Throwable) overflow87);
        DataStructures.Overflow overflow89 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray90 = overflow89.getSuppressed();
        overflow86.addSuppressed((java.lang.Throwable) overflow89);
        overflow80.addSuppressed((java.lang.Throwable) overflow89);
        overflow72.addSuppressed((java.lang.Throwable) overflow89);
        overflow25.addSuppressed((java.lang.Throwable) overflow89);
        java.lang.Throwable[] throwableArray95 = overflow25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow8.addSuppressed((java.lang.Throwable) overflow12);
        queueAr1.enqueue((java.lang.Object) overflow8);
        queueAr1.dequeueAll();
        java.lang.Object obj18 = queueAr1.dequeue();
        boolean boolean19 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray16 = overflow0.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray29 = overflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        overflow19.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray36 = overflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray45 = overflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        overflow41.addSuppressed((java.lang.Throwable) overflow50);
        overflow35.addSuppressed((java.lang.Throwable) overflow50);
        overflow0.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.QueueAr queueAr57 = new DataStructures.QueueAr(6);
        boolean boolean58 = queueAr57.isEmpty();
        boolean boolean59 = queueAr57.isEmpty();
        boolean boolean60 = queueAr57.isFull();
        queueAr57.makeEmpty();
        java.lang.Object obj62 = queueAr57.getFront();
        java.lang.Object obj63 = queueAr57.getFront();
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        overflow65.addSuppressed((java.lang.Throwable) overflow66);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray69 = overflow68.getSuppressed();
        overflow65.addSuppressed((java.lang.Throwable) overflow68);
        overflow64.addSuppressed((java.lang.Throwable) overflow68);
        queueAr57.enqueue((java.lang.Object) overflow64);
        java.lang.Throwable[] throwableArray73 = overflow64.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow64);
        java.lang.Throwable[] throwableArray75 = overflow64.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) (short) 10);
        queueAr1.enqueue((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        java.lang.Object obj8 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        boolean boolean14 = queueAr1.isFull();
        boolean boolean15 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-3));
        java.lang.Object obj7 = queueAr1.dequeue();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        overflow8.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow17.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray28 = overflow24.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray33 = overflow29.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        overflow29.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray40 = overflow39.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray42 = overflow38.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow38);
        overflow24.addSuppressed((java.lang.Throwable) overflow29);
        queueAr1.enqueue((java.lang.Object) overflow24);
        java.lang.Throwable[] throwableArray46 = overflow24.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.getFront();
        boolean boolean12 = queueAr1.isFull();
        boolean boolean13 = queueAr1.isFull();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        overflow14.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray22 = overflow18.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray33 = overflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow32);
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray40 = overflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow39);
        overflow32.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow44.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray51 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow48.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) overflow48);
        overflow18.addSuppressed((java.lang.Throwable) overflow39);
        queueAr1.enqueue((java.lang.Object) overflow18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '4');
        queueAr1.makeEmpty();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        java.lang.Object obj22 = queueAr16.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow45);
        overflow23.addSuppressed((java.lang.Throwable) overflow45);
        queueAr1.enqueue((java.lang.Object) overflow23);
        java.lang.Throwable[] throwableArray49 = overflow23.getSuppressed();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        overflow50.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray54 = overflow53.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray60 = overflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray66 = overflow65.getSuppressed();
        overflow62.addSuppressed((java.lang.Throwable) overflow65);
        overflow56.addSuppressed((java.lang.Throwable) overflow65);
        java.lang.Throwable[] throwableArray69 = overflow65.getSuppressed();
        java.lang.Throwable[] throwableArray70 = overflow65.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow65);
        DataStructures.QueueAr queueAr73 = new DataStructures.QueueAr(6);
        boolean boolean74 = queueAr73.isEmpty();
        boolean boolean75 = queueAr73.isEmpty();
        boolean boolean76 = queueAr73.isFull();
        queueAr73.makeEmpty();
        java.lang.Object obj78 = queueAr73.getFront();
        java.lang.Object obj79 = queueAr73.getFront();
        DataStructures.Overflow overflow80 = new DataStructures.Overflow();
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        overflow81.addSuppressed((java.lang.Throwable) overflow82);
        DataStructures.Overflow overflow84 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray85 = overflow84.getSuppressed();
        overflow81.addSuppressed((java.lang.Throwable) overflow84);
        overflow80.addSuppressed((java.lang.Throwable) overflow84);
        queueAr73.enqueue((java.lang.Object) overflow80);
        java.lang.Throwable[] throwableArray89 = overflow80.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow80);
        java.lang.Throwable[] throwableArray91 = overflow80.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow80);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray91);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        java.lang.Object obj25 = null;
        queueAr23.enqueue(obj25);
        queueAr23.makeEmpty();
        boolean boolean28 = queueAr23.isFull();
        java.lang.Object obj29 = queueAr23.dequeue();
        queueAr16.enqueue((java.lang.Object) queueAr23);
        java.lang.Object obj31 = queueAr23.dequeue();
        queueAr23.dequeueAll();
        java.lang.Object obj33 = queueAr23.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj11 = queueAr10.getFront();
        boolean boolean12 = queueAr10.isEmpty();
        boolean boolean13 = queueAr10.isEmpty();
        boolean boolean14 = queueAr10.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(5);
        boolean boolean18 = queueAr17.isEmpty();
        queueAr17.dequeueAll();
        boolean boolean20 = queueAr17.isFull();
        java.lang.Object obj21 = queueAr17.getFront();
        queueAr17.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        DataStructures.QueueAr queueAr25 = new DataStructures.QueueAr(6);
        boolean boolean26 = queueAr25.isEmpty();
        boolean boolean27 = queueAr25.isEmpty();
        boolean boolean28 = queueAr25.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr25);
        java.lang.Class<?> wildcardClass30 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 100);
        boolean boolean2 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        overflow1.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        overflow10.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray32 = overflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        overflow10.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray36 = overflow30.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr(5);
        boolean boolean9 = queueAr8.isEmpty();
        queueAr8.makeEmpty();
        queueAr8.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        java.lang.Object obj6 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray37 = overflow36.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray43 = overflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        overflow33.addSuppressed((java.lang.Throwable) overflow42);
        overflow25.addSuppressed((java.lang.Throwable) overflow42);
        java.lang.Throwable[] throwableArray47 = overflow25.getSuppressed();
        java.lang.Class<?> wildcardClass48 = overflow25.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow7.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        queueAr1.enqueue((java.lang.Object) overflow11);
        java.lang.Class<?> wildcardClass17 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.makeEmpty();
        boolean boolean14 = queueAr9.isFull();
        queueAr9.dequeueAll();
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(6);
        boolean boolean18 = queueAr17.isEmpty();
        boolean boolean19 = queueAr17.isEmpty();
        queueAr17.enqueue((java.lang.Object) (-10));
        queueAr17.enqueue((java.lang.Object) (-8));
        queueAr17.makeEmpty();
        queueAr17.enqueue((java.lang.Object) 9);
        java.lang.Object obj27 = queueAr17.dequeue();
        boolean boolean28 = queueAr17.isFull();
        queueAr17.dequeueAll();
        queueAr9.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj31 = queueAr9.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        queueAr1.dequeueAll();
        boolean boolean34 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 9 + "'", obj27, 9);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        java.lang.Object obj15 = queueAr9.dequeue();
        queueAr9.makeEmpty();
        queueAr9.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        boolean boolean14 = queueAr1.isFull();
        boolean boolean15 = queueAr1.isFull();
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr((int) (short) 0);
        queueAr1.enqueue((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr1.isFull();
        DataStructures.QueueAr queueAr24 = new DataStructures.QueueAr(6);
        boolean boolean25 = queueAr24.isEmpty();
        boolean boolean26 = queueAr24.isEmpty();
        queueAr24.enqueue((java.lang.Object) (-10));
        queueAr24.enqueue((java.lang.Object) (-8));
        queueAr24.makeEmpty();
        queueAr24.enqueue((java.lang.Object) 9);
        java.lang.Object obj34 = queueAr24.dequeue();
        queueAr24.makeEmpty();
        queueAr24.dequeueAll();
        queueAr24.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr24);
        java.lang.Object obj39 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 9 + "'", obj34, 9);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj11 = queueAr10.getFront();
        boolean boolean12 = queueAr10.isEmpty();
        boolean boolean13 = queueAr10.isEmpty();
        boolean boolean14 = queueAr10.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(5);
        boolean boolean18 = queueAr17.isEmpty();
        queueAr17.dequeueAll();
        boolean boolean20 = queueAr17.isFull();
        java.lang.Object obj21 = queueAr17.getFront();
        queueAr17.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        DataStructures.QueueAr queueAr25 = new DataStructures.QueueAr(6);
        boolean boolean26 = queueAr25.isEmpty();
        boolean boolean27 = queueAr25.isEmpty();
        boolean boolean28 = queueAr25.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr25);
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        java.lang.Object obj9 = queueAr3.getFront();
        java.lang.Object obj10 = queueAr3.getFront();
        boolean boolean11 = queueAr3.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        boolean boolean6 = queueAr4.isEmpty();
        queueAr4.enqueue((java.lang.Object) (-10));
        queueAr4.enqueue((java.lang.Object) (-8));
        queueAr4.makeEmpty();
        java.lang.Object obj12 = queueAr4.getFront();
        queueAr4.makeEmpty();
        java.lang.Object obj14 = queueAr4.getFront();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow15.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray32 = overflow31.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow31);
        overflow24.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        queueAr4.enqueue((java.lang.Object) overflow31);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        queueAr1.enqueue((java.lang.Object) overflow10);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray33 = overflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow32);
        overflow25.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray41 = overflow32.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray46 = overflow45.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray52 = overflow48.getSuppressed();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        overflow48.addSuppressed((java.lang.Throwable) overflow53);
        overflow42.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray58 = overflow42.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow42);
        overflow10.addSuppressed((java.lang.Throwable) overflow32);
        java.lang.Throwable[] throwableArray61 = overflow10.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(5);
        boolean boolean6 = queueAr5.isEmpty();
        java.lang.Object obj7 = queueAr5.dequeue();
        queueAr1.enqueue(obj7);
        queueAr1.dequeueAll();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.makeEmpty();
        boolean boolean14 = queueAr9.isFull();
        queueAr9.dequeueAll();
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(6);
        boolean boolean18 = queueAr17.isEmpty();
        boolean boolean19 = queueAr17.isEmpty();
        queueAr17.enqueue((java.lang.Object) (-10));
        queueAr17.enqueue((java.lang.Object) (-8));
        queueAr17.makeEmpty();
        queueAr17.enqueue((java.lang.Object) 9);
        java.lang.Object obj27 = queueAr17.dequeue();
        boolean boolean28 = queueAr17.isFull();
        queueAr17.dequeueAll();
        queueAr9.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj31 = queueAr9.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass34 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 9 + "'", obj27, 9);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Class<?> wildcardClass20 = overflow9.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        boolean boolean7 = queueAr6.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.enqueue((java.lang.Object) (-5L));
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Object obj8 = queueAr1.getFront();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr(6);
        boolean boolean11 = queueAr10.isEmpty();
        boolean boolean12 = queueAr10.isEmpty();
        queueAr10.enqueue((java.lang.Object) (-10));
        queueAr10.enqueue((java.lang.Object) (-8));
        queueAr10.makeEmpty();
        queueAr10.enqueue((java.lang.Object) 9);
        java.lang.Object obj20 = queueAr10.dequeue();
        boolean boolean21 = queueAr10.isFull();
        java.lang.Object obj22 = queueAr10.dequeue();
        DataStructures.QueueAr queueAr24 = new DataStructures.QueueAr(6);
        boolean boolean25 = queueAr24.isEmpty();
        boolean boolean26 = queueAr24.isEmpty();
        boolean boolean27 = queueAr24.isFull();
        queueAr24.makeEmpty();
        boolean boolean29 = queueAr24.isFull();
        queueAr10.enqueue((java.lang.Object) queueAr24);
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 8 + "'", obj7, 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 8 + "'", obj8, 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 9 + "'", obj20, 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        DataStructures.QueueAr queueAr14 = new DataStructures.QueueAr(6);
        boolean boolean15 = queueAr14.isEmpty();
        boolean boolean16 = queueAr14.isEmpty();
        boolean boolean17 = queueAr14.isFull();
        queueAr14.makeEmpty();
        java.lang.Object obj19 = queueAr14.getFront();
        java.lang.Object obj20 = queueAr14.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.getFront();
        boolean boolean12 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        overflow5.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow26.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow30);
        overflow0.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray37 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr3.getFront();
        boolean boolean8 = queueAr3.isEmpty();
        boolean boolean9 = queueAr3.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.getFront();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        boolean boolean7 = queueAr5.isEmpty();
        queueAr5.enqueue((java.lang.Object) (-10));
        queueAr5.enqueue((java.lang.Object) (-8));
        queueAr5.makeEmpty();
        queueAr5.enqueue((java.lang.Object) 9);
        java.lang.Object obj15 = queueAr5.dequeue();
        queueAr5.makeEmpty();
        queueAr5.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr5);
        java.lang.Object obj19 = queueAr5.getFront();
        queueAr5.dequeueAll();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 9 + "'", obj15, 9);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        boolean boolean7 = queueAr5.isEmpty();
        queueAr5.enqueue((java.lang.Object) (-10));
        queueAr5.enqueue((java.lang.Object) (-8));
        queueAr5.makeEmpty();
        queueAr5.enqueue((java.lang.Object) 9);
        java.lang.Object obj15 = queueAr5.dequeue();
        queueAr5.makeEmpty();
        queueAr5.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr5);
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr(6);
        boolean boolean21 = queueAr20.isEmpty();
        java.lang.Object obj22 = null;
        queueAr20.enqueue(obj22);
        queueAr20.dequeueAll();
        DataStructures.QueueAr queueAr26 = new DataStructures.QueueAr(6);
        boolean boolean27 = queueAr26.isEmpty();
        boolean boolean28 = queueAr26.isEmpty();
        queueAr26.enqueue((java.lang.Object) (-10));
        queueAr26.enqueue((java.lang.Object) (-8));
        queueAr26.makeEmpty();
        queueAr26.enqueue((java.lang.Object) 9);
        java.lang.Object obj36 = queueAr26.dequeue();
        boolean boolean37 = queueAr26.isFull();
        queueAr20.enqueue((java.lang.Object) boolean37);
        queueAr20.dequeueAll();
        queueAr5.enqueue((java.lang.Object) queueAr20);
        java.lang.Object obj41 = queueAr20.getFront();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 9 + "'", obj15, 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 9 + "'", obj36, 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        java.lang.Object obj25 = null;
        queueAr23.enqueue(obj25);
        queueAr23.makeEmpty();
        boolean boolean28 = queueAr23.isFull();
        java.lang.Object obj29 = queueAr23.dequeue();
        queueAr16.enqueue((java.lang.Object) queueAr23);
        boolean boolean31 = queueAr23.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj7 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.enqueue((java.lang.Object) (-5L));
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        queueAr9.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-3));
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-3) + "'", obj8, (-3));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray16 = overflow0.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray21 = overflow20.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray23 = overflow17.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray29 = overflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow25.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        overflow34.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray48 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        overflow50.addSuppressed((java.lang.Throwable) overflow51);
        java.lang.Throwable[] throwableArray53 = overflow50.getSuppressed();
        java.lang.Throwable[] throwableArray54 = overflow50.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray60 = overflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray62 = overflow56.getSuppressed();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow63);
        overflow41.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray67 = overflow66.getSuppressed();
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        overflow68.addSuppressed((java.lang.Throwable) overflow69);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray72 = overflow71.getSuppressed();
        overflow68.addSuppressed((java.lang.Throwable) overflow71);
        DataStructures.Overflow overflow74 = new DataStructures.Overflow();
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        overflow74.addSuppressed((java.lang.Throwable) overflow75);
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray78 = overflow77.getSuppressed();
        overflow74.addSuppressed((java.lang.Throwable) overflow77);
        overflow68.addSuppressed((java.lang.Throwable) overflow77);
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        overflow81.addSuppressed((java.lang.Throwable) overflow82);
        DataStructures.Overflow overflow84 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray85 = overflow84.getSuppressed();
        overflow81.addSuppressed((java.lang.Throwable) overflow84);
        overflow77.addSuppressed((java.lang.Throwable) overflow84);
        java.lang.Throwable[] throwableArray88 = overflow84.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) overflow84);
        overflow41.addSuppressed((java.lang.Throwable) overflow66);
        overflow17.addSuppressed((java.lang.Throwable) overflow41);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        boolean boolean3 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass10 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        queueAr15.makeEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) boolean18);
        boolean boolean20 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        overflow16.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray41 = overflow16.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray16 = overflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        overflow6.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow15.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        boolean boolean25 = queueAr23.isEmpty();
        boolean boolean26 = queueAr23.isFull();
        queueAr23.makeEmpty();
        java.lang.Object obj28 = queueAr23.getFront();
        java.lang.Object obj29 = queueAr23.getFront();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow30.addSuppressed((java.lang.Throwable) overflow34);
        queueAr23.enqueue((java.lang.Object) overflow30);
        java.lang.Throwable[] throwableArray39 = overflow30.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray41 = overflow30.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray46 = overflow45.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray52 = overflow51.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow51);
        overflow42.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        overflow55.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray59 = overflow58.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) overflow58);
        overflow51.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray65 = overflow63.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        overflow67.addSuppressed((java.lang.Throwable) overflow68);
        java.lang.Throwable[] throwableArray70 = overflow67.getSuppressed();
        java.lang.Throwable[] throwableArray71 = overflow67.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) overflow67);
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        DataStructures.Overflow overflow74 = new DataStructures.Overflow();
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        overflow74.addSuppressed((java.lang.Throwable) overflow75);
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray78 = overflow77.getSuppressed();
        overflow74.addSuppressed((java.lang.Throwable) overflow77);
        overflow73.addSuppressed((java.lang.Throwable) overflow77);
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        overflow82.addSuppressed((java.lang.Throwable) overflow83);
        DataStructures.Overflow overflow85 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray86 = overflow85.getSuppressed();
        overflow82.addSuppressed((java.lang.Throwable) overflow85);
        overflow81.addSuppressed((java.lang.Throwable) overflow85);
        overflow77.addSuppressed((java.lang.Throwable) overflow81);
        overflow58.addSuppressed((java.lang.Throwable) overflow81);
        overflow30.addSuppressed((java.lang.Throwable) overflow81);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray86);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-3));
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        overflow5.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow26.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow30);
        overflow0.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray41 = overflow40.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray47 = overflow46.getSuppressed();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow49.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray56 = overflow55.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray62 = overflow61.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) overflow61);
        overflow52.addSuppressed((java.lang.Throwable) overflow61);
        overflow49.addSuppressed((java.lang.Throwable) overflow61);
        overflow45.addSuppressed((java.lang.Throwable) overflow61);
        overflow40.addSuppressed((java.lang.Throwable) overflow45);
        overflow0.addSuppressed((java.lang.Throwable) overflow45);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        boolean boolean22 = queueAr16.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.dequeue();
        boolean boolean8 = queueAr1.isFull();
        boolean boolean9 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        java.lang.Object obj9 = queueAr3.getFront();
        boolean boolean10 = queueAr3.isEmpty();
        boolean boolean11 = queueAr3.isEmpty();
        queueAr3.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        boolean boolean7 = queueAr6.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        boolean boolean9 = queueAr6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (-1.0d));
        queueAr1.enqueue((java.lang.Object) (-4.6d));
        boolean boolean10 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.getFront();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr(5);
        boolean boolean14 = queueAr13.isEmpty();
        queueAr13.makeEmpty();
        queueAr13.dequeueAll();
        java.lang.Object obj17 = queueAr13.getFront();
        queueAr1.enqueue(obj17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        java.lang.Object obj15 = queueAr9.dequeue();
        queueAr9.makeEmpty();
        queueAr9.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        java.lang.Object obj6 = queueAr3.dequeue();
        queueAr1.enqueue(obj6);
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.dequeue();
        boolean boolean8 = queueAr1.isFull();
        boolean boolean9 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        java.lang.Object obj9 = null;
        queueAr7.enqueue(obj9);
        java.lang.Object obj11 = queueAr7.dequeue();
        queueAr7.enqueue((java.lang.Object) (-1.0d));
        boolean boolean14 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        queueAr7.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        boolean boolean22 = queueAr1.isFull();
        boolean boolean23 = queueAr1.isEmpty();
        boolean boolean24 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.dequeueAll();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(6);
        boolean boolean18 = queueAr17.isEmpty();
        boolean boolean19 = queueAr17.isEmpty();
        queueAr15.enqueue((java.lang.Object) queueAr17);
        queueAr9.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj22 = queueAr17.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        java.lang.Object obj24 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-10) + "'", obj24, (-10));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        boolean boolean7 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        overflow10.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray26 = overflow10.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray33 = overflow27.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow27);
        queueAr1.enqueue((java.lang.Object) overflow27);
        java.lang.Throwable[] throwableArray36 = overflow27.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray32 = overflow26.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow26);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        java.lang.Object obj11 = null;
        queueAr9.enqueue(obj11);
        queueAr9.enqueue((java.lang.Object) (-5L));
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        DataStructures.QueueAr queueAr18 = new DataStructures.QueueAr(6);
        boolean boolean19 = queueAr18.isEmpty();
        boolean boolean20 = queueAr18.isEmpty();
        queueAr18.enqueue((java.lang.Object) (-10));
        queueAr18.enqueue((java.lang.Object) (-8));
        queueAr18.makeEmpty();
        queueAr18.enqueue((java.lang.Object) 9);
        java.lang.Object obj28 = queueAr18.dequeue();
        queueAr9.enqueue((java.lang.Object) queueAr18);
        java.lang.Object obj30 = queueAr9.dequeue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 9 + "'", obj28, 9);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.getFront();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr(6);
        boolean boolean14 = queueAr13.isEmpty();
        java.lang.Object obj15 = queueAr13.dequeue();
        queueAr1.enqueue(obj15);
        java.lang.Object obj17 = queueAr1.dequeue();
        boolean boolean18 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow12.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow15.addSuppressed((java.lang.Throwable) overflow24);
        overflow12.addSuppressed((java.lang.Throwable) overflow24);
        overflow8.addSuppressed((java.lang.Throwable) overflow24);
        overflow3.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Class<?> wildcardClass31 = overflow3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(10);
        java.lang.Object obj10 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(6);
        boolean boolean13 = queueAr12.isEmpty();
        java.lang.Object obj14 = null;
        queueAr12.enqueue(obj14);
        queueAr12.enqueue((java.lang.Object) (-5L));
        queueAr9.enqueue((java.lang.Object) queueAr12);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isFull();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj6 = queueAr5.getFront();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        overflow9.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray41 = overflow40.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) overflow40);
        overflow31.addSuppressed((java.lang.Throwable) overflow40);
        overflow25.addSuppressed((java.lang.Throwable) overflow40);
        queueAr5.enqueue((java.lang.Object) overflow40);
        overflow0.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray53 = overflow47.getSuppressed();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow54);
        overflow40.addSuppressed((java.lang.Throwable) overflow47);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow45);
        overflow23.addSuppressed((java.lang.Throwable) overflow45);
        queueAr1.enqueue((java.lang.Object) overflow23);
        java.lang.Object obj49 = null;
        queueAr1.enqueue(obj49);
        queueAr1.makeEmpty();
        boolean boolean52 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        queueAr1.makeEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        overflow1.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        overflow10.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(6);
        boolean boolean24 = queueAr23.isEmpty();
        boolean boolean25 = queueAr23.isEmpty();
        boolean boolean26 = queueAr23.isFull();
        boolean boolean27 = queueAr23.isFull();
        java.lang.Object obj28 = queueAr23.dequeue();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray33 = overflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        queueAr23.enqueue((java.lang.Object) overflow32);
        java.lang.Throwable[] throwableArray38 = overflow32.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow32);
        java.lang.Throwable[] throwableArray40 = overflow32.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        boolean boolean14 = queueAr1.isFull();
        java.lang.Object obj15 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) 100L);
        DataStructures.QueueAr queueAr19 = new DataStructures.QueueAr(6);
        boolean boolean20 = queueAr19.isEmpty();
        boolean boolean21 = queueAr19.isEmpty();
        boolean boolean22 = queueAr19.isFull();
        queueAr19.makeEmpty();
        java.lang.Object obj24 = queueAr19.getFront();
        java.lang.Object obj25 = queueAr19.getFront();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        overflow26.addSuppressed((java.lang.Throwable) overflow30);
        queueAr19.enqueue((java.lang.Object) overflow26);
        queueAr19.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        java.lang.Object obj15 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) 9L);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr(6);
        boolean boolean11 = queueAr10.isEmpty();
        boolean boolean12 = queueAr10.isEmpty();
        queueAr10.enqueue((java.lang.Object) (-10));
        queueAr10.enqueue((java.lang.Object) (-8));
        queueAr10.makeEmpty();
        java.lang.Object obj18 = queueAr10.getFront();
        queueAr10.makeEmpty();
        java.lang.Object obj20 = queueAr10.getFront();
        DataStructures.QueueAr queueAr22 = new DataStructures.QueueAr(6);
        boolean boolean23 = queueAr22.isEmpty();
        java.lang.Object obj24 = queueAr22.dequeue();
        queueAr10.enqueue(obj24);
        queueAr10.makeEmpty();
        boolean boolean27 = queueAr10.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj6 = queueAr1.dequeue();
        java.lang.Object obj7 = queueAr1.dequeue();
        boolean boolean8 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-10) + "'", obj6, (-10));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = overflow0.getSuppressed();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Class<?> wildcardClass17 = overflow12.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.getFront();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr(6);
        boolean boolean14 = queueAr13.isEmpty();
        java.lang.Object obj15 = queueAr13.dequeue();
        queueAr1.enqueue(obj15);
        boolean boolean17 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean19 = queueAr1.isEmpty();
        java.lang.Object obj20 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray9 = overflow7.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray35 = overflow26.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray40 = overflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray46 = overflow45.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) overflow45);
        overflow36.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray53 = overflow52.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow52);
        overflow45.addSuppressed((java.lang.Throwable) overflow52);
        overflow26.addSuppressed((java.lang.Throwable) overflow45);
        overflow7.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Class<?> wildcardClass58 = overflow7.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Object obj8 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        boolean boolean10 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass12 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 10);
        java.lang.Object obj2 = queueAr1.dequeue();
        boolean boolean3 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(6);
        queueAr1.enqueue((java.lang.Object) queueAr6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow12.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow6.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray22 = overflow6.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray29 = overflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow25.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        overflow34.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray45 = overflow41.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray57 = overflow56.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow56);
        overflow47.addSuppressed((java.lang.Throwable) overflow56);
        overflow41.addSuppressed((java.lang.Throwable) overflow56);
        overflow6.addSuppressed((java.lang.Throwable) overflow41);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj11 = queueAr10.getFront();
        boolean boolean12 = queueAr10.isEmpty();
        boolean boolean13 = queueAr10.isEmpty();
        boolean boolean14 = queueAr10.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr17 = new DataStructures.QueueAr(5);
        boolean boolean18 = queueAr17.isEmpty();
        queueAr17.dequeueAll();
        boolean boolean20 = queueAr17.isFull();
        java.lang.Object obj21 = queueAr17.getFront();
        queueAr17.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr17);
        boolean boolean24 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        queueAr15.makeEmpty();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray27 = overflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray33 = overflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow32);
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray40 = overflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow39);
        overflow32.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray46 = overflow45.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        java.lang.Throwable[] throwableArray48 = overflow44.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        overflow44.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray55 = overflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow53);
        overflow39.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray60 = overflow44.getSuppressed();
        queueAr15.enqueue((java.lang.Object) throwableArray60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(6);
        boolean boolean8 = queueAr7.isEmpty();
        java.lang.Object obj9 = null;
        queueAr7.enqueue(obj9);
        java.lang.Object obj11 = queueAr7.dequeue();
        queueAr7.enqueue((java.lang.Object) (-1.0d));
        boolean boolean14 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        queueAr7.dequeueAll();
        queueAr7.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        overflow10.addSuppressed((java.lang.Throwable) overflow15);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        overflow0.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray41 = overflow40.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) overflow40);
        overflow31.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray48 = overflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow47);
        overflow40.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray54 = overflow52.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        java.lang.Throwable[] throwableArray59 = overflow56.getSuppressed();
        java.lang.Throwable[] throwableArray60 = overflow56.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray66 = overflow65.getSuppressed();
        overflow62.addSuppressed((java.lang.Throwable) overflow65);
        java.lang.Throwable[] throwableArray68 = overflow62.getSuppressed();
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow69);
        overflow47.addSuppressed((java.lang.Throwable) overflow69);
        overflow26.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray73 = overflow26.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        queueAr1.makeEmpty();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr(6);
        boolean boolean6 = queueAr5.isEmpty();
        queueAr1.enqueue((java.lang.Object) boolean6);
        java.lang.Object obj8 = queueAr1.getFront();
        java.lang.Object obj9 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) (-4.6d));
        boolean boolean15 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(6);
        boolean boolean7 = queueAr6.isEmpty();
        boolean boolean8 = queueAr6.isEmpty();
        boolean boolean9 = queueAr6.isFull();
        queueAr6.makeEmpty();
        java.lang.Object obj11 = queueAr6.getFront();
        java.lang.Object obj12 = queueAr6.getFront();
        queueAr1.enqueue(obj12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr7.enqueue((java.lang.Object) queueAr9);
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj14 = queueAr9.dequeue();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(6);
        boolean boolean17 = queueAr16.isEmpty();
        boolean boolean18 = queueAr16.isEmpty();
        boolean boolean19 = queueAr16.isFull();
        queueAr16.makeEmpty();
        queueAr9.enqueue((java.lang.Object) queueAr16);
        boolean boolean22 = queueAr9.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.enqueue((java.lang.Object) (-3));
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Object obj8 = queueAr1.getFront();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        overflow9.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow17.addSuppressed((java.lang.Throwable) overflow21);
        overflow13.addSuppressed((java.lang.Throwable) overflow17);
        queueAr1.enqueue((java.lang.Object) overflow17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        queueAr1.dequeueAll();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(6);
        boolean boolean10 = queueAr9.isEmpty();
        boolean boolean11 = queueAr9.isEmpty();
        queueAr9.enqueue((java.lang.Object) (-10));
        queueAr9.enqueue((java.lang.Object) (-8));
        queueAr9.makeEmpty();
        queueAr9.enqueue((java.lang.Object) 9);
        java.lang.Object obj19 = queueAr9.dequeue();
        boolean boolean20 = queueAr9.isFull();
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        boolean boolean23 = queueAr1.isFull();
        java.lang.Object obj24 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 9 + "'", obj19, 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray13 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        java.lang.Object obj9 = queueAr3.getFront();
        boolean boolean10 = queueAr3.isEmpty();
        boolean boolean11 = queueAr3.isEmpty();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr(8);
        queueAr13.dequeueAll();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow15.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray32 = overflow31.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow31);
        overflow24.addSuppressed((java.lang.Throwable) overflow31);
        queueAr13.enqueue((java.lang.Object) overflow24);
        queueAr3.enqueue((java.lang.Object) overflow24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(5);
        boolean boolean10 = queueAr9.isEmpty();
        queueAr9.dequeueAll();
        boolean boolean12 = queueAr9.isFull();
        queueAr1.enqueue((java.lang.Object) boolean12);
        java.lang.Object obj14 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        overflow9.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        overflow8.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray34 = overflow33.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray40 = overflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow39);
        overflow30.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray47 = overflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow46);
        overflow39.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray53 = overflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray55 = overflow51.getSuppressed();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        overflow51.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray62 = overflow61.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray64 = overflow60.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow60);
        overflow46.addSuppressed((java.lang.Throwable) overflow51);
        java.lang.Throwable[] throwableArray67 = overflow51.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow51);
        queueAr1.enqueue((java.lang.Object) overflow8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass13 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        java.lang.Object obj9 = queueAr3.getFront();
        boolean boolean10 = queueAr3.isEmpty();
        java.lang.Object obj11 = queueAr3.getFront();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        overflow9.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow34);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray41 = overflow25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isEmpty();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray16 = overflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow12.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray29 = overflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        overflow21.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow33.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow33);
        overflow9.addSuppressed((java.lang.Throwable) overflow28);
        queueAr1.enqueue((java.lang.Object) overflow28);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        java.lang.Object obj7 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr(6);
        boolean boolean9 = queueAr8.isEmpty();
        boolean boolean10 = queueAr8.isEmpty();
        queueAr6.enqueue((java.lang.Object) queueAr8);
        java.lang.Object obj12 = queueAr6.getFront();
        queueAr1.enqueue(obj12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow7.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray22 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray23 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        java.lang.Object obj2 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(6);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = null;
        queueAr4.enqueue(obj6);
        queueAr4.enqueue((java.lang.Object) (-5L));
        queueAr1.enqueue((java.lang.Object) queueAr4);
        boolean boolean11 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        queueAr1.enqueue((java.lang.Object) overflow12);
        queueAr1.dequeueAll();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = overflow0.getSuppressed();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray17 = overflow0.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow18.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        overflow21.addSuppressed((java.lang.Throwable) overflow30);
        overflow18.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray35 = overflow30.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray37 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) (-4.6d));
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) (byte) 1);
        boolean boolean11 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        queueAr1.enqueue((java.lang.Object) overflow12);
        boolean boolean24 = queueAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.enqueue((java.lang.Object) (-5L));
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Object obj8 = queueAr1.getFront();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr(5);
        boolean boolean11 = queueAr10.isEmpty();
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        java.lang.Object obj14 = queueAr10.getFront();
        boolean boolean15 = queueAr10.isFull();
        java.lang.Object obj16 = queueAr10.getFront();
        queueAr1.enqueue(obj16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 8 + "'", obj7, 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 8 + "'", obj8, 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        boolean boolean4 = queueAr1.isFull();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow5.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow14.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        overflow23.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow35.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) overflow39);
        overflow9.addSuppressed((java.lang.Throwable) overflow30);
        queueAr1.enqueue((java.lang.Object) overflow9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        boolean boolean14 = queueAr1.isFull();
        java.lang.Object obj15 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean17 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) (-1.0d));
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray24 = overflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray42 = overflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow45);
        overflow23.addSuppressed((java.lang.Throwable) overflow45);
        queueAr1.enqueue((java.lang.Object) overflow23);
        java.lang.Object obj49 = null;
        queueAr1.enqueue(obj49);
        queueAr1.makeEmpty();
        boolean boolean52 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        queueAr1.dequeueAll();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean10 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        queueAr1.makeEmpty();
        boolean boolean14 = queueAr1.isFull();
        java.lang.Object obj15 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        java.lang.Object obj17 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray10 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow1.getSuppressed();
        java.lang.Class<?> wildcardClass12 = overflow1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow7.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray17 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.getFront();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray16 = overflow15.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        overflow9.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow14);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(6);
        boolean boolean4 = queueAr3.isEmpty();
        boolean boolean5 = queueAr3.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean7 = queueAr3.isEmpty();
        java.lang.Object obj8 = queueAr3.getFront();
        queueAr3.dequeueAll();
        boolean boolean10 = queueAr3.isFull();
        java.lang.Object obj11 = queueAr3.getFront();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 8);
        queueAr1.enqueue((java.lang.Object) (-5L));
        java.lang.Object obj7 = queueAr1.getFront();
        java.lang.Object obj8 = queueAr1.getFront();
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr(6);
        boolean boolean11 = queueAr10.isEmpty();
        java.lang.Object obj12 = queueAr10.dequeue();
        java.lang.Object obj13 = queueAr10.dequeue();
        java.lang.Object obj14 = queueAr10.dequeue();
        queueAr1.enqueue(obj14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 8 + "'", obj7, 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 8 + "'", obj8, 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray2 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.QueueAr queueAr14 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj15 = queueAr14.getFront();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray28 = overflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) overflow27);
        overflow18.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray35 = overflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow27.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray44 = overflow43.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) overflow49);
        overflow40.addSuppressed((java.lang.Throwable) overflow49);
        overflow34.addSuppressed((java.lang.Throwable) overflow49);
        queueAr14.enqueue((java.lang.Object) overflow49);
        overflow11.addSuppressed((java.lang.Throwable) overflow49);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray57 = overflow11.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray61 = overflow59.getSuppressed();
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray65 = overflow62.getSuppressed();
        java.lang.Throwable[] throwableArray66 = overflow62.getSuppressed();
        overflow59.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray68 = overflow59.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray70 = overflow59.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj6 = queueAr1.dequeue();
        java.lang.Object obj7 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-10) + "'", obj6, (-10));
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray16 = overflow0.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray18 = overflow17.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray29 = overflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        overflow19.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray36 = overflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray45 = overflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        overflow41.addSuppressed((java.lang.Throwable) overflow50);
        overflow35.addSuppressed((java.lang.Throwable) overflow50);
        overflow0.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Class<?> wildcardClass56 = overflow35.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        queueAr1.enqueue((java.lang.Object) (-100L));
        boolean boolean13 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = null;
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        java.lang.Object obj2 = queueAr1.getFront();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(8);
        boolean boolean5 = queueAr4.isEmpty();
        boolean boolean6 = queueAr4.isFull();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray12 = overflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow7.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        overflow15.addSuppressed((java.lang.Throwable) overflow19);
        overflow11.addSuppressed((java.lang.Throwable) overflow15);
        queueAr4.enqueue((java.lang.Object) overflow15);
        java.lang.Throwable[] throwableArray25 = overflow15.getSuppressed();
        queueAr1.enqueue((java.lang.Object) overflow15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        queueAr1.enqueue((java.lang.Object) 9);
        java.lang.Object obj11 = queueAr1.dequeue();
        boolean boolean12 = queueAr1.isFull();
        java.lang.Object obj13 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr15 = new DataStructures.QueueAr(6);
        boolean boolean16 = queueAr15.isEmpty();
        boolean boolean17 = queueAr15.isEmpty();
        boolean boolean18 = queueAr15.isFull();
        queueAr15.makeEmpty();
        boolean boolean20 = queueAr15.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr15);
        java.lang.Class<?> wildcardClass22 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(6);
        boolean boolean2 = queueAr1.isEmpty();
        boolean boolean3 = queueAr1.isFull();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray8 = overflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray17 = overflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray23 = overflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow13.addSuppressed((java.lang.Throwable) overflow22);
        overflow10.addSuppressed((java.lang.Throwable) overflow22);
        overflow6.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow28.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray39 = overflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray45 = overflow44.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        overflow38.addSuppressed((java.lang.Throwable) overflow43);
        overflow28.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray51 = overflow50.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray53 = overflow49.getSuppressed();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        overflow49.addSuppressed((java.lang.Throwable) overflow54);
        overflow28.addSuppressed((java.lang.Throwable) overflow54);
        overflow6.addSuppressed((java.lang.Throwable) overflow28);
        queueAr1.enqueue((java.lang.Object) overflow6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
    }
}

