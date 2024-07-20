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
        java.lang.Throwable throwable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow0.addSuppressed(throwable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Class<?> wildcardClass1 = overflow0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Class<?> wildcardClass8 = underflow4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Class<?> wildcardClass2 = throwableArray1.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray8 = underflow4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Class<?> wildcardClass18 = overflow6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        java.lang.Class<?> wildcardClass9 = underflow5.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Class<?> wildcardClass8 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray11 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass12 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.pop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Class<?> wildcardClass19 = overflow6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray23 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Class<?> wildcardClass6 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            underflow0.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass4 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass7 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray11 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray11 = overflow6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        stackAr1.push((java.lang.Object) underflow8);
        java.lang.Object obj11 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "DataStructures.Underflow");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow7);
        java.lang.Throwable[] throwableArray10 = overflow4.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow3);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Class<?> wildcardClass11 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        underflow7.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray29 = overflow15.getSuppressed();
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Class<?> wildcardClass31 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = underflow10.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        stackAr15.push((java.lang.Object) overflow16);
        java.lang.Throwable[] throwableArray18 = overflow16.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow24);
        underflow19.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        underflow24.addSuppressed((java.lang.Throwable) underflow28);
        overflow16.addSuppressed((java.lang.Throwable) underflow24);
        overflow6.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow40);
        underflow35.addSuppressed((java.lang.Throwable) underflow40);
        overflow32.addSuppressed((java.lang.Throwable) underflow40);
        overflow6.addSuppressed((java.lang.Throwable) underflow40);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray47 = overflow6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = null;
        stackAr1.push(obj7);
        stackAr1.pop();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr6.isEmpty();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr6.push((java.lang.Object) underflow13);
        boolean boolean16 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj18 = stackAr6.top();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "DataStructures.Underflow");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '#');
        stackAr7.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr7.getClass();
        stackAr1.push((java.lang.Object) stackAr7);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.pop();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.pop();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.Class<?> wildcardClass11 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow17);
        java.lang.Throwable[] throwableArray20 = overflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow22.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        overflow22.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow34);
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow33.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray59 = overflow53.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow53);
        underflow40.addSuppressed((java.lang.Throwable) overflow48);
        overflow33.addSuppressed((java.lang.Throwable) overflow48);
        overflow13.addSuppressed((java.lang.Throwable) overflow48);
        overflow0.addSuppressed((java.lang.Throwable) overflow48);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Class<?> wildcardClass29 = overflow15.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.push((java.lang.Object) 8.4d);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        stackAr15.push((java.lang.Object) throwableArray17);
        boolean boolean19 = stackAr15.isFull();
        boolean boolean20 = stackAr15.isFull();
        java.lang.Object obj21 = stackAr15.top();
        java.lang.Object obj22 = stackAr15.top();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray27 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow23.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow30);
        overflow23.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray39 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow34.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow34);
        stackAr15.push((java.lang.Object) overflow29);
        java.lang.Throwable[] throwableArray43 = overflow29.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow29);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-4));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        stackAr9.push((java.lang.Object) 100.0f);
        boolean boolean12 = stackAr9.isEmpty();
        stackAr1.push((java.lang.Object) boolean12);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr6.isEmpty();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr6.push((java.lang.Object) underflow13);
        boolean boolean16 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj18 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray41 = overflow26.getSuppressed();
        java.lang.Class<?> wildcardClass42 = throwableArray41.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 5L + "'", obj6, 5L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        underflow18.addSuppressed((java.lang.Throwable) underflow22);
        overflow10.addSuppressed((java.lang.Throwable) underflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow39.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        underflow26.addSuppressed((java.lang.Throwable) overflow34);
        overflow0.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Class<?> wildcardClass49 = overflow34.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = underflow45.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow45);
        DataStructures.StackAr stackAr50 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        stackAr50.push((java.lang.Object) overflow51);
        overflow41.addSuppressed((java.lang.Throwable) overflow51);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Class<?> wildcardClass55 = overflow41.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr6.topAndPop();
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow7);
        underflow1.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray11 = overflow4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray41 = overflow11.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow53.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Underflow underflow63 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray64 = underflow63.getSuppressed();
        overflow62.addSuppressed((java.lang.Throwable) underflow63);
        java.lang.Throwable[] throwableArray66 = overflow62.getSuppressed();
        java.lang.Throwable[] throwableArray67 = overflow62.getSuppressed();
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        DataStructures.Underflow underflow69 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray70 = underflow69.getSuppressed();
        overflow68.addSuppressed((java.lang.Throwable) underflow69);
        overflow62.addSuppressed((java.lang.Throwable) overflow68);
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray75 = underflow74.getSuppressed();
        overflow73.addSuppressed((java.lang.Throwable) underflow74);
        java.lang.Throwable[] throwableArray77 = overflow73.getSuppressed();
        java.lang.Throwable[] throwableArray78 = overflow73.getSuppressed();
        java.lang.Throwable[] throwableArray79 = overflow73.getSuppressed();
        overflow68.addSuppressed((java.lang.Throwable) overflow73);
        underflow60.addSuppressed((java.lang.Throwable) overflow68);
        overflow53.addSuppressed((java.lang.Throwable) overflow68);
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        DataStructures.Underflow underflow84 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray85 = underflow84.getSuppressed();
        overflow83.addSuppressed((java.lang.Throwable) underflow84);
        DataStructures.Underflow underflow87 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray88 = underflow87.getSuppressed();
        java.lang.Throwable[] throwableArray89 = underflow87.getSuppressed();
        overflow83.addSuppressed((java.lang.Throwable) underflow87);
        DataStructures.StackAr stackAr92 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow93 = new DataStructures.Overflow();
        stackAr92.push((java.lang.Object) overflow93);
        overflow83.addSuppressed((java.lang.Throwable) overflow93);
        overflow68.addSuppressed((java.lang.Throwable) overflow83);
        overflow11.addSuppressed((java.lang.Throwable) overflow83);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Throwable[] throwableArray11 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow7.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        overflow7.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray22 = overflow18.getSuppressed();
        java.lang.Throwable[] throwableArray23 = overflow18.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow28);
        java.lang.Throwable[] throwableArray31 = overflow27.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow27.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow34);
        overflow27.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow39);
        java.lang.Throwable[] throwableArray42 = overflow38.getSuppressed();
        java.lang.Throwable[] throwableArray43 = overflow38.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow38);
        underflow25.addSuppressed((java.lang.Throwable) overflow33);
        overflow18.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray48 = overflow18.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray18 = overflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow7.addSuppressed((java.lang.Throwable) overflow11);
        overflow1.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow22.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow30);
        java.lang.Throwable[] throwableArray33 = overflow29.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow29.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        overflow29.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) underflow41);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow47);
        underflow41.addSuppressed((java.lang.Throwable) overflow44);
        overflow29.addSuppressed((java.lang.Throwable) underflow41);
        java.lang.Throwable[] throwableArray52 = underflow41.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow41);
        java.lang.Throwable[] throwableArray54 = underflow41.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow41);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.pop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        stackAr4.push((java.lang.Object) overflow5);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = underflow45.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow45);
        DataStructures.StackAr stackAr50 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        stackAr50.push((java.lang.Object) overflow51);
        overflow41.addSuppressed((java.lang.Throwable) overflow51);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray55 = overflow41.getSuppressed();
        java.lang.Throwable throwable56 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow41.addSuppressed(throwable56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.Object obj14 = null;
        stackAr1.push(obj14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.Throwable[] throwableArray45 = overflow41.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow41.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) underflow48);
        overflow41.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow53);
        java.lang.Throwable[] throwableArray56 = overflow52.getSuppressed();
        java.lang.Throwable[] throwableArray57 = overflow52.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow52.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray60 = overflow52.getSuppressed();
        java.lang.Throwable[] throwableArray61 = overflow52.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow52);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        underflow3.addSuppressed((java.lang.Throwable) underflow8);
        overflow0.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Class<?> wildcardClass13 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow13);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = underflow16.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.StackAr stackAr21 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        stackAr21.push((java.lang.Object) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow30);
        underflow25.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        underflow30.addSuppressed((java.lang.Throwable) underflow34);
        overflow22.addSuppressed((java.lang.Throwable) underflow30);
        overflow12.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow46);
        underflow41.addSuppressed((java.lang.Throwable) underflow46);
        overflow38.addSuppressed((java.lang.Throwable) underflow46);
        overflow12.addSuppressed((java.lang.Throwable) underflow46);
        overflow6.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray54 = overflow0.getSuppressed();
        java.lang.Throwable throwable55 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow0.addSuppressed(throwable55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        stackAr9.push((java.lang.Object) throwableArray11);
        java.lang.Object obj13 = stackAr9.top();
        java.lang.Object obj14 = stackAr9.top();
        boolean boolean15 = stackAr9.isEmpty();
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        java.lang.Class<?> wildcardClass18 = stackAr9.getClass();
        stackAr1.push((java.lang.Object) stackAr9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(9);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow7);
        underflow1.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            underflow1.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray9 = overflow1.getSuppressed();
        java.lang.Class<?> wildcardClass10 = overflow1.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Class<?> wildcardClass7 = overflow5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = underflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        underflow11.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.Class<?> wildcardClass20 = underflow11.getClass();
        stackAr1.push((java.lang.Object) underflow11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        java.lang.Object obj12 = stackAr1.topAndPop();
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(6);
        boolean boolean8 = stackAr7.isEmpty();
        stackAr7.push((java.lang.Object) 5L);
        boolean boolean11 = stackAr7.isEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        java.lang.Object obj11 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        underflow3.addSuppressed((java.lang.Throwable) underflow8);
        overflow0.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Class<?> wildcardClass13 = underflow8.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        stackAr1.pop();
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 1);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.top();
        java.lang.Object obj5 = stackAr3.topAndPop();
        java.lang.Object obj6 = stackAr3.topAndPop();
        java.lang.Class<?> wildcardClass7 = stackAr3.getClass();
        stackAr1.push((java.lang.Object) stackAr3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) 2L);
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Object obj12 = stackAr1.topAndPop();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow29);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        underflow13.addSuppressed((java.lang.Throwable) underflow23);
        stackAr1.push((java.lang.Object) underflow13);
        java.lang.Class<?> wildcardClass35 = underflow13.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2L + "'", obj12, 2L);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 100 + "'", obj8, (byte) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow15);
        underflow10.addSuppressed((java.lang.Throwable) underflow15);
        overflow7.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow20);
        overflow0.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Class<?> wildcardClass28 = underflow15.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 6);
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow14);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = underflow21.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.StackAr stackAr26 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        stackAr26.push((java.lang.Object) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow27.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        underflow30.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        underflow35.addSuppressed((java.lang.Throwable) underflow39);
        overflow27.addSuppressed((java.lang.Throwable) underflow35);
        overflow17.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow51);
        underflow46.addSuppressed((java.lang.Throwable) underflow51);
        overflow43.addSuppressed((java.lang.Throwable) underflow51);
        overflow17.addSuppressed((java.lang.Throwable) underflow51);
        overflow11.addSuppressed((java.lang.Throwable) overflow17);
        overflow5.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray59 = overflow5.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        stackAr20.push((java.lang.Object) overflow21);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.StackAr stackAr33 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        stackAr33.push((java.lang.Object) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow42);
        underflow37.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        underflow42.addSuppressed((java.lang.Throwable) underflow46);
        overflow34.addSuppressed((java.lang.Throwable) underflow42);
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        overflow11.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray52 = underflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        java.lang.Throwable[] throwableArray8 = overflow2.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow2);
        java.lang.Throwable[] throwableArray10 = overflow2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Throwable[] throwableArray29 = overflow15.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        underflow30.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        underflow30.addSuppressed((java.lang.Throwable) underflow39);
        overflow15.addSuppressed((java.lang.Throwable) underflow30);
        java.lang.Throwable[] throwableArray42 = underflow30.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(6);
        stackAr6.push((java.lang.Object) 100.0f);
        boolean boolean9 = stackAr6.isEmpty();
        java.lang.Object obj10 = stackAr6.topAndPop();
        java.lang.Object obj11 = stackAr6.top();
        boolean boolean12 = stackAr6.isEmpty();
        stackAr6.makeEmpty();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        stackAr6.push((java.lang.Object) overflow14);
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow13.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray39 = overflow13.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow13);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        boolean boolean10 = stackAr9.isEmpty();
        stackAr9.push((java.lang.Object) 5L);
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "DataStructures.Overflow");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr5.push((java.lang.Object) 100.0f);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr12.push((java.lang.Object) throwableArray14);
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.topAndPop();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        stackAr1.push((java.lang.Object) wildcardClass18);
        stackAr1.pop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.pop();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        stackAr20.push((java.lang.Object) overflow21);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.StackAr stackAr33 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        stackAr33.push((java.lang.Object) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow42);
        underflow37.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        underflow42.addSuppressed((java.lang.Throwable) underflow46);
        overflow34.addSuppressed((java.lang.Throwable) underflow42);
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        overflow11.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow53);
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = underflow56.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow56);
        DataStructures.StackAr stackAr61 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        stackAr61.push((java.lang.Object) overflow62);
        overflow52.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray65 = overflow62.getSuppressed();
        DataStructures.StackAr stackAr67 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        stackAr67.push((java.lang.Object) overflow68);
        overflow62.addSuppressed((java.lang.Throwable) overflow68);
        overflow11.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray72 = overflow62.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray72);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow2.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        overflow2.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow0.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow24.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray33 = underflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = underflow4.getClass();
        stackAr1.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class DataStructures.Underflow");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        stackAr4.push((java.lang.Object) throwableArray6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.top();
        boolean boolean10 = stackAr4.isEmpty();
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean13 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) boolean13);
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = underflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow12);
        underflow7.addSuppressed((java.lang.Throwable) underflow12);
        overflow4.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray17 = underflow12.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray19 = underflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.push((java.lang.Object) (short) -1);
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        stackAr20.push((java.lang.Object) overflow21);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.StackAr stackAr33 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        stackAr33.push((java.lang.Object) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow42);
        underflow37.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        underflow42.addSuppressed((java.lang.Throwable) underflow46);
        overflow34.addSuppressed((java.lang.Throwable) underflow42);
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        overflow11.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow53);
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = underflow56.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow56);
        DataStructures.StackAr stackAr61 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        stackAr61.push((java.lang.Object) overflow62);
        overflow52.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray65 = overflow62.getSuppressed();
        DataStructures.StackAr stackAr67 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        stackAr67.push((java.lang.Object) overflow68);
        overflow62.addSuppressed((java.lang.Throwable) overflow68);
        overflow11.addSuppressed((java.lang.Throwable) overflow62);
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Underflow underflow73 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray74 = underflow73.getSuppressed();
        overflow72.addSuppressed((java.lang.Throwable) underflow73);
        java.lang.Throwable[] throwableArray76 = overflow72.getSuppressed();
        java.lang.Throwable[] throwableArray77 = overflow72.getSuppressed();
        java.lang.Throwable[] throwableArray78 = overflow72.getSuppressed();
        DataStructures.Underflow underflow79 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray80 = underflow79.getSuppressed();
        java.lang.Throwable[] throwableArray81 = underflow79.getSuppressed();
        overflow72.addSuppressed((java.lang.Throwable) underflow79);
        overflow62.addSuppressed((java.lang.Throwable) underflow79);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow18.addSuppressed((java.lang.Throwable) overflow26);
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = underflow45.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow45);
        DataStructures.StackAr stackAr50 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        stackAr50.push((java.lang.Object) overflow51);
        overflow41.addSuppressed((java.lang.Throwable) overflow51);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray59 = overflow55.getSuppressed();
        java.lang.Throwable[] throwableArray60 = overflow55.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow55);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow11);
        java.lang.Throwable[] throwableArray13 = underflow11.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        stackAr1.makeEmpty();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        boolean boolean12 = stackAr1.isEmpty();
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(1);
        java.lang.Object obj6 = stackAr5.top();
        stackAr5.makeEmpty();
        boolean boolean8 = stackAr5.isEmpty();
        java.lang.Object obj9 = stackAr5.top();
        stackAr1.push(obj9);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Class<?> wildcardClass11 = overflow6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        boolean boolean12 = stackAr1.isEmpty();
        boolean boolean13 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = underflow1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = underflow1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow2.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        overflow2.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow0.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow24.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Class<?> wildcardClass33 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        stackAr1.push((java.lang.Object) overflow2);
        java.lang.Throwable[] throwableArray4 = overflow2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray28 = overflow20.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow33);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = underflow36.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow36);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow44);
        java.lang.Throwable[] throwableArray47 = overflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow36.addSuppressed((java.lang.Throwable) overflow40);
        overflow30.addSuppressed((java.lang.Throwable) overflow40);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        overflow5.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow60);
        underflow54.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        overflow64.addSuppressed((java.lang.Throwable) underflow65);
        java.lang.Throwable[] throwableArray68 = overflow64.getSuppressed();
        java.lang.Throwable[] throwableArray69 = overflow64.getSuppressed();
        DataStructures.Overflow overflow70 = new DataStructures.Overflow();
        DataStructures.Underflow underflow71 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray72 = underflow71.getSuppressed();
        overflow70.addSuppressed((java.lang.Throwable) underflow71);
        overflow64.addSuppressed((java.lang.Throwable) overflow70);
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        DataStructures.Underflow underflow76 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray77 = underflow76.getSuppressed();
        overflow75.addSuppressed((java.lang.Throwable) underflow76);
        java.lang.Throwable[] throwableArray79 = overflow75.getSuppressed();
        java.lang.Throwable[] throwableArray80 = overflow75.getSuppressed();
        overflow70.addSuppressed((java.lang.Throwable) overflow75);
        overflow57.addSuppressed((java.lang.Throwable) overflow75);
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        DataStructures.Underflow underflow84 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray85 = underflow84.getSuppressed();
        overflow83.addSuppressed((java.lang.Throwable) underflow84);
        DataStructures.Underflow underflow87 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray88 = underflow87.getSuppressed();
        java.lang.Throwable[] throwableArray89 = underflow87.getSuppressed();
        overflow83.addSuppressed((java.lang.Throwable) underflow87);
        overflow57.addSuppressed((java.lang.Throwable) underflow87);
        overflow30.addSuppressed((java.lang.Throwable) underflow87);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        underflow18.addSuppressed((java.lang.Throwable) underflow22);
        overflow10.addSuppressed((java.lang.Throwable) underflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow39.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        underflow26.addSuppressed((java.lang.Throwable) overflow34);
        overflow0.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable throwable49 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow34.addSuppressed(throwable49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        boolean boolean7 = stackAr5.isFull();
        java.lang.Object obj8 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr5.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Throwable[] throwableArray11 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow7.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        overflow7.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow25);
        underflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow7.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray30 = underflow19.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray32 = underflow19.getSuppressed();
        java.lang.Throwable[] throwableArray33 = underflow19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr5.push((java.lang.Object) 100.0f);
        stackAr5.push((java.lang.Object) 2.7d);
        boolean boolean10 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = null;
        stackAr1.push(obj7);
        stackAr1.pop();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 100);
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        underflow18.addSuppressed((java.lang.Throwable) underflow22);
        overflow10.addSuppressed((java.lang.Throwable) underflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow39.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        underflow26.addSuppressed((java.lang.Throwable) overflow34);
        overflow0.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Class<?> wildcardClass49 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        underflow3.addSuppressed((java.lang.Throwable) underflow8);
        overflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow28);
        underflow23.addSuppressed((java.lang.Throwable) underflow28);
        overflow20.addSuppressed((java.lang.Throwable) underflow28);
        overflow13.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow39);
        underflow34.addSuppressed((java.lang.Throwable) underflow39);
        overflow13.addSuppressed((java.lang.Throwable) underflow34);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr6.isEmpty();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr6.push((java.lang.Object) underflow13);
        boolean boolean16 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        stackAr6.makeEmpty();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '#');
        stackAr7.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr7.getClass();
        stackAr1.push((java.lang.Object) stackAr7);
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.topAndPop();
        java.lang.Object obj13 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(7);
        boolean boolean9 = stackAr8.isFull();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        stackAr11.push((java.lang.Object) overflow15);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow20);
        java.lang.Throwable[] throwableArray23 = overflow19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = overflow19.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow26);
        overflow19.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray35 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow30.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray38 = overflow30.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = underflow46.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow46);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) overflow51);
        underflow46.addSuppressed((java.lang.Throwable) overflow50);
        overflow40.addSuppressed((java.lang.Throwable) overflow50);
        overflow30.addSuppressed((java.lang.Throwable) overflow40);
        overflow15.addSuppressed((java.lang.Throwable) overflow40);
        stackAr8.push((java.lang.Object) overflow40);
        stackAr1.push((java.lang.Object) overflow40);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(4);
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(9);
        stackAr11.push((java.lang.Object) stackAr13);
        stackAr1.push((java.lang.Object) stackAr13);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray22 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray23 = overflow16.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow33);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow37);
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = underflow40.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow40);
        DataStructures.StackAr stackAr45 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        stackAr45.push((java.lang.Object) overflow46);
        java.lang.Throwable[] throwableArray48 = overflow46.getSuppressed();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow54);
        underflow49.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        underflow54.addSuppressed((java.lang.Throwable) underflow58);
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
        overflow36.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        overflow67.addSuppressed((java.lang.Throwable) overflow68);
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        overflow67.addSuppressed((java.lang.Throwable) underflow70);
        underflow65.addSuppressed((java.lang.Throwable) underflow70);
        overflow62.addSuppressed((java.lang.Throwable) underflow70);
        overflow36.addSuppressed((java.lang.Throwable) underflow70);
        overflow30.addSuppressed((java.lang.Throwable) overflow36);
        overflow24.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray78 = overflow24.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow24);
        stackAr1.push((java.lang.Object) overflow16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow4.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        stackAr19.push((java.lang.Object) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow20.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow28);
        underflow23.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        underflow28.addSuppressed((java.lang.Throwable) underflow32);
        overflow20.addSuppressed((java.lang.Throwable) underflow28);
        overflow8.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Class<?> wildcardClass36 = overflow20.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow2.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        overflow2.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow0.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray22 = overflow8.getSuppressed();
        java.lang.Throwable[] throwableArray23 = overflow8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Class<?> wildcardClass23 = underflow12.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        stackAr7.push((java.lang.Object) throwableArray9);
        java.lang.Object obj11 = stackAr7.top();
        java.lang.Object obj12 = stackAr7.topAndPop();
        stackAr1.push(obj12);
        java.lang.Object obj14 = stackAr1.top();
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        overflow0.addSuppressed((java.lang.Throwable) underflow10);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        stackAr1.push((java.lang.Object) overflow2);
        java.lang.Throwable[] throwableArray4 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow2.getSuppressed();
        java.lang.Class<?> wildcardClass6 = overflow2.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.topAndPop();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Class<?> wildcardClass18 = stackAr12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow30);
        java.lang.Throwable[] throwableArray33 = overflow29.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow29.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        overflow29.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) underflow41);
        java.lang.Throwable[] throwableArray44 = overflow40.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow40.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow40.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) overflow40);
        underflow27.addSuppressed((java.lang.Throwable) overflow35);
        overflow20.addSuppressed((java.lang.Throwable) overflow35);
        overflow0.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray51 = overflow35.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        stackAr15.push((java.lang.Object) overflow16);
        overflow10.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray19 = overflow10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        stackAr7.push((java.lang.Object) throwableArray9);
        java.lang.Object obj11 = stackAr7.top();
        java.lang.Object obj12 = stackAr7.topAndPop();
        stackAr1.push(obj12);
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) (byte) 0);
        stackAr1.push((java.lang.Object) (byte) 0);
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow11);
        underflow6.addSuppressed((java.lang.Throwable) underflow11);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow22);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        underflow6.addSuppressed((java.lang.Throwable) underflow16);
        underflow3.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.Throwable[] throwableArray28 = underflow16.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(6);
        boolean boolean9 = stackAr8.isEmpty();
        stackAr8.push((java.lang.Object) 5L);
        stackAr8.makeEmpty();
        boolean boolean13 = stackAr8.isEmpty();
        java.lang.Object obj14 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) 6);
        stackAr1.push((java.lang.Object) 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray28 = overflow20.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow33);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = underflow36.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow36);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow44);
        java.lang.Throwable[] throwableArray47 = overflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow36.addSuppressed((java.lang.Throwable) overflow40);
        overflow30.addSuppressed((java.lang.Throwable) overflow40);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        overflow5.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray53 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray54 = overflow5.getSuppressed();
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow60);
        underflow55.addSuppressed((java.lang.Throwable) underflow60);
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        underflow55.addSuppressed((java.lang.Throwable) underflow64);
        overflow5.addSuppressed((java.lang.Throwable) underflow55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        stackAr10.push((java.lang.Object) 100.0f);
        boolean boolean13 = stackAr10.isEmpty();
        java.lang.Object obj14 = stackAr10.topAndPop();
        java.lang.Object obj15 = stackAr10.top();
        boolean boolean16 = stackAr10.isEmpty();
        stackAr10.makeEmpty();
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        stackAr19.push((java.lang.Object) throwableArray21);
        boolean boolean23 = stackAr19.isFull();
        boolean boolean24 = stackAr19.isFull();
        java.lang.Object obj25 = stackAr19.top();
        stackAr10.push(obj25);
        java.lang.Object obj27 = stackAr10.topAndPop();
        stackAr1.push((java.lang.Object) stackAr10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = overflow11.getSuppressed();
        java.lang.Class<?> wildcardClass20 = overflow11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        stackAr1.push((java.lang.Object) overflow15);
        stackAr1.pop();
        java.lang.Class<?> wildcardClass30 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Throwable[] throwableArray11 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow7.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        overflow7.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow25);
        underflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow7.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray30 = underflow19.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray32 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow5.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow9.addSuppressed((java.lang.Throwable) overflow11);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow6);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow12);
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) underflow6);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        stackAr1.pop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Throwable[] throwableArray11 = overflow5.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        overflow0.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        stackAr15.makeEmpty();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        stackAr15.push((java.lang.Object) overflow19);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray27 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow23.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow30);
        overflow23.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray39 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow34.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray42 = overflow34.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        java.lang.Throwable[] throwableArray52 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        overflow55.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) underflow58);
        java.lang.Throwable[] throwableArray61 = overflow55.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        underflow50.addSuppressed((java.lang.Throwable) overflow54);
        overflow44.addSuppressed((java.lang.Throwable) overflow54);
        overflow34.addSuppressed((java.lang.Throwable) overflow44);
        overflow19.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray67 = overflow19.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray69 = overflow19.getSuppressed();
        java.lang.Throwable[] throwableArray70 = overflow19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 7L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow11);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = underflow18.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.StackAr stackAr23 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        stackAr23.push((java.lang.Object) overflow24);
        java.lang.Throwable[] throwableArray26 = overflow24.getSuppressed();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow32);
        underflow27.addSuppressed((java.lang.Throwable) underflow32);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        underflow32.addSuppressed((java.lang.Throwable) underflow36);
        overflow24.addSuppressed((java.lang.Throwable) underflow32);
        overflow14.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow45.addSuppressed((java.lang.Throwable) underflow48);
        underflow43.addSuppressed((java.lang.Throwable) underflow48);
        overflow40.addSuppressed((java.lang.Throwable) underflow48);
        overflow14.addSuppressed((java.lang.Throwable) underflow48);
        overflow8.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray59 = overflow55.getSuppressed();
        java.lang.Throwable[] throwableArray60 = overflow55.getSuppressed();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        overflow61.addSuppressed((java.lang.Throwable) underflow62);
        overflow55.addSuppressed((java.lang.Throwable) overflow61);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) underflow67);
        DataStructures.Overflow overflow70 = new DataStructures.Overflow();
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        overflow70.addSuppressed((java.lang.Throwable) overflow71);
        DataStructures.Underflow underflow73 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray74 = underflow73.getSuppressed();
        overflow70.addSuppressed((java.lang.Throwable) underflow73);
        underflow67.addSuppressed((java.lang.Throwable) overflow70);
        overflow55.addSuppressed((java.lang.Throwable) underflow67);
        overflow14.addSuppressed((java.lang.Throwable) underflow67);
        stackAr1.push((java.lang.Object) underflow67);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(1);
        java.lang.Object obj9 = stackAr8.top();
        stackAr1.push(obj9);
        stackAr1.pop();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = underflow8.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        stackAr13.push((java.lang.Object) overflow14);
        overflow4.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        stackAr9.push((java.lang.Object) throwableArray11);
        java.lang.Object obj13 = stackAr9.top();
        java.lang.Object obj14 = stackAr9.top();
        boolean boolean15 = stackAr9.isEmpty();
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        boolean boolean18 = stackAr9.isFull();
        stackAr1.push((java.lang.Object) stackAr9);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow20.getSuppressed();
        stackAr1.push((java.lang.Object) overflow20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) 2L);
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Object obj12 = stackAr1.topAndPop();
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2L + "'", obj12, 2L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        stackAr7.makeEmpty();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        stackAr7.push((java.lang.Object) overflow11);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow15.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow22);
        overflow15.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray31 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow26.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray34 = overflow26.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = underflow42.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) underflow50);
        java.lang.Throwable[] throwableArray53 = overflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        underflow42.addSuppressed((java.lang.Throwable) overflow46);
        overflow36.addSuppressed((java.lang.Throwable) overflow46);
        overflow26.addSuppressed((java.lang.Throwable) overflow36);
        overflow11.addSuppressed((java.lang.Throwable) overflow36);
        java.lang.Throwable[] throwableArray59 = overflow11.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        stackAr9.push((java.lang.Object) 100.0f);
        stackAr9.makeEmpty();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj15 = stackAr14.top();
        java.lang.Object obj16 = stackAr14.topAndPop();
        java.lang.Object obj17 = stackAr14.topAndPop();
        stackAr14.push((java.lang.Object) (byte) 100);
        boolean boolean20 = stackAr14.isEmpty();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        stackAr14.push((java.lang.Object) underflow21);
        boolean boolean24 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        java.lang.Class<?> wildcardClass26 = stackAr14.getClass();
        stackAr1.push((java.lang.Object) stackAr14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.pop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (byte) 100);
        boolean boolean12 = stackAr6.isEmpty();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr6.push((java.lang.Object) underflow13);
        boolean boolean16 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean18 = stackAr6.isEmpty();
        stackAr6.makeEmpty();
        java.lang.Object obj20 = stackAr6.topAndPop();
        DataStructures.StackAr stackAr22 = new DataStructures.StackAr(6);
        stackAr22.push((java.lang.Object) 100.0f);
        boolean boolean25 = stackAr22.isEmpty();
        boolean boolean26 = stackAr22.isFull();
        java.lang.Class<?> wildcardClass27 = stackAr22.getClass();
        stackAr6.push((java.lang.Object) stackAr22);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = overflow11.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = underflow27.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = overflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        underflow27.addSuppressed((java.lang.Throwable) overflow31);
        overflow21.addSuppressed((java.lang.Throwable) overflow31);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow45.addSuppressed((java.lang.Throwable) underflow46);
        java.lang.Throwable[] throwableArray49 = overflow45.getSuppressed();
        java.lang.Throwable[] throwableArray50 = overflow45.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow52);
        overflow45.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow57);
        java.lang.Throwable[] throwableArray60 = overflow56.getSuppressed();
        java.lang.Throwable[] throwableArray61 = overflow56.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow56.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow56);
        underflow43.addSuppressed((java.lang.Throwable) overflow51);
        overflow11.addSuppressed((java.lang.Throwable) overflow51);
        java.lang.Throwable[] throwableArray66 = overflow51.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr5.push((java.lang.Object) 100.0f);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(1);
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        stackAr12.makeEmpty();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        stackAr12.push((java.lang.Object) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow31.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray39 = overflow31.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow44);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = underflow47.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow47);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow55);
        java.lang.Throwable[] throwableArray58 = overflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        underflow47.addSuppressed((java.lang.Throwable) overflow51);
        overflow41.addSuppressed((java.lang.Throwable) overflow51);
        overflow31.addSuppressed((java.lang.Throwable) overflow41);
        overflow16.addSuppressed((java.lang.Throwable) overflow41);
        stackAr1.push((java.lang.Object) overflow16);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        underflow18.addSuppressed((java.lang.Throwable) underflow22);
        overflow10.addSuppressed((java.lang.Throwable) underflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow34);
        underflow29.addSuppressed((java.lang.Throwable) underflow34);
        overflow26.addSuppressed((java.lang.Throwable) underflow34);
        overflow0.addSuppressed((java.lang.Throwable) underflow34);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) underflow41);
        java.lang.Throwable[] throwableArray44 = overflow40.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow40.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        overflow40.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow52);
        java.lang.Throwable[] throwableArray55 = overflow51.getSuppressed();
        java.lang.Throwable[] throwableArray56 = overflow51.getSuppressed();
        java.lang.Throwable[] throwableArray57 = overflow51.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) overflow51);
        java.lang.Throwable[] throwableArray59 = overflow51.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow51);
        java.lang.Throwable[] throwableArray61 = overflow51.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow51.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        stackAr9.push((java.lang.Object) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow13.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        underflow18.addSuppressed((java.lang.Throwable) underflow22);
        overflow10.addSuppressed((java.lang.Throwable) underflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow39.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        underflow26.addSuppressed((java.lang.Throwable) overflow34);
        overflow0.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) underflow57);
        underflow52.addSuppressed((java.lang.Throwable) underflow57);
        overflow49.addSuppressed((java.lang.Throwable) underflow57);
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Underflow underflow63 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray64 = underflow63.getSuppressed();
        overflow62.addSuppressed((java.lang.Throwable) underflow63);
        java.lang.Throwable[] throwableArray66 = overflow62.getSuppressed();
        java.lang.Throwable[] throwableArray67 = overflow62.getSuppressed();
        underflow57.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray69 = overflow62.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow62);
        java.lang.Throwable[] throwableArray71 = overflow34.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        boolean boolean6 = stackAr5.isEmpty();
        stackAr5.push((java.lang.Object) 5L);
        boolean boolean9 = stackAr5.isEmpty();
        stackAr5.pop();
        boolean boolean11 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean11);
        java.lang.Object obj13 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '#');
        stackAr7.makeEmpty();
        stackAr7.makeEmpty();
        java.lang.Object obj10 = stackAr7.top();
        java.lang.Object obj11 = stackAr7.top();
        java.lang.Object obj12 = stackAr7.topAndPop();
        stackAr1.push((java.lang.Object) stackAr7);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        stackAr9.push((java.lang.Object) 100.0f);
        stackAr9.push((java.lang.Object) 2.7d);
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        stackAr15.push((java.lang.Object) throwableArray17);
        java.lang.Object obj19 = stackAr15.top();
        java.lang.Object obj20 = stackAr15.topAndPop();
        stackAr9.push(obj20);
        java.lang.Class<?> wildcardClass22 = stackAr9.getClass();
        stackAr1.push((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        stackAr4.push((java.lang.Object) throwableArray6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.top();
        boolean boolean10 = stackAr4.isEmpty();
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean13 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) boolean13);
        java.lang.Object obj15 = stackAr1.topAndPop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.topAndPop();
        java.lang.Object obj15 = stackAr12.topAndPop();
        java.lang.Object obj16 = stackAr12.topAndPop();
        stackAr12.makeEmpty();
        java.lang.Object obj18 = stackAr12.topAndPop();
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        stackAr20.push((java.lang.Object) throwableArray22);
        boolean boolean24 = stackAr20.isFull();
        stackAr12.push((java.lang.Object) stackAr20);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray31 = overflow26.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow33);
        overflow26.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow38);
        java.lang.Throwable[] throwableArray41 = overflow37.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow37.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow53);
        overflow46.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow58);
        java.lang.Throwable[] throwableArray61 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray63 = overflow57.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) overflow57);
        underflow44.addSuppressed((java.lang.Throwable) overflow52);
        overflow37.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray67 = overflow37.getSuppressed();
        stackAr20.push((java.lang.Object) overflow37);
        stackAr1.push((java.lang.Object) stackAr20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Throwable[] throwableArray29 = overflow15.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        underflow30.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        underflow30.addSuppressed((java.lang.Throwable) underflow39);
        overflow15.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        overflow42.addSuppressed((java.lang.Throwable) underflow53);
        underflow30.addSuppressed((java.lang.Throwable) overflow42);
        java.lang.Class<?> wildcardClass56 = overflow42.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray18 = overflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow7.addSuppressed((java.lang.Throwable) overflow11);
        overflow1.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray22 = overflow1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 3L);
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 3L + "'", obj8, 3L);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray9 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow1.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow22.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        overflow22.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow34);
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow33.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow33);
        overflow15.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray41 = overflow15.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray59 = overflow53.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow53);
        overflow15.addSuppressed((java.lang.Throwable) overflow48);
        overflow1.addSuppressed((java.lang.Throwable) overflow15);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) 2L);
        stackAr1.pop();
        boolean boolean12 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow8);
        underflow3.addSuppressed((java.lang.Throwable) underflow8);
        overflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow28);
        underflow23.addSuppressed((java.lang.Throwable) underflow28);
        overflow20.addSuppressed((java.lang.Throwable) underflow28);
        overflow13.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray34 = overflow13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.top();
        java.lang.Object obj14 = stackAr9.top();
        stackAr1.push(obj14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 100 + "'", obj7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.Throwable[] throwableArray12 = overflow8.getSuppressed();
        java.lang.Throwable[] throwableArray13 = overflow8.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow15);
        overflow8.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow20);
        java.lang.Throwable[] throwableArray23 = overflow19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = overflow19.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray43 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow39.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow39.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        underflow26.addSuppressed((java.lang.Throwable) overflow34);
        overflow19.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) underflow50);
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = underflow53.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) underflow53);
        DataStructures.StackAr stackAr58 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        stackAr58.push((java.lang.Object) overflow59);
        overflow49.addSuppressed((java.lang.Throwable) overflow59);
        overflow34.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.StackAr stackAr64 = new DataStructures.StackAr(6);
        stackAr64.push((java.lang.Object) 100.0f);
        boolean boolean67 = stackAr64.isEmpty();
        java.lang.Object obj68 = stackAr64.topAndPop();
        java.lang.Object obj69 = stackAr64.top();
        boolean boolean70 = stackAr64.isEmpty();
        stackAr64.makeEmpty();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        java.lang.Throwable[] throwableArray75 = overflow72.getSuppressed();
        stackAr64.push((java.lang.Object) overflow72);
        java.lang.Throwable[] throwableArray77 = overflow72.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow72);
        stackAr1.push((java.lang.Object) overflow72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0f + "'", obj68, 100.0f);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        stackAr4.push((java.lang.Object) throwableArray6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.top();
        boolean boolean10 = stackAr4.isEmpty();
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean13 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) boolean13);
        stackAr1.pop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow4);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow4.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray18 = underflow4.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        underflow22.addSuppressed((java.lang.Throwable) underflow27);
        overflow19.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow33);
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow32.getSuppressed();
        underflow27.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow47);
        underflow42.addSuppressed((java.lang.Throwable) underflow47);
        overflow39.addSuppressed((java.lang.Throwable) underflow47);
        overflow32.addSuppressed((java.lang.Throwable) overflow39);
        underflow4.addSuppressed((java.lang.Throwable) overflow39);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow1.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray9 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        stackAr20.push((java.lang.Object) overflow21);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.StackAr stackAr33 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        stackAr33.push((java.lang.Object) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow42);
        underflow37.addSuppressed((java.lang.Throwable) underflow42);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        underflow42.addSuppressed((java.lang.Throwable) underflow46);
        overflow34.addSuppressed((java.lang.Throwable) underflow42);
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        overflow11.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Class<?> wildcardClass52 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        stackAr1.push((java.lang.Object) underflow8);
        boolean boolean11 = stackAr1.isFull();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        stackAr13.push((java.lang.Object) throwableArray15);
        java.lang.Object obj17 = stackAr13.top();
        boolean boolean18 = stackAr13.isFull();
        boolean boolean19 = stackAr13.isEmpty();
        stackAr1.push((java.lang.Object) boolean19);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr5.push((java.lang.Object) 100.0f);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        stackAr12.push((java.lang.Object) throwableArray14);
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.topAndPop();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        stackAr1.push((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        boolean boolean6 = stackAr5.isEmpty();
        stackAr5.push((java.lang.Object) 5L);
        boolean boolean9 = stackAr5.isEmpty();
        stackAr5.pop();
        boolean boolean11 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean11);
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj15 = stackAr14.top();
        DataStructures.StackAr stackAr17 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        stackAr17.push((java.lang.Object) throwableArray19);
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.top();
        boolean boolean23 = stackAr17.isEmpty();
        stackAr17.makeEmpty();
        stackAr17.makeEmpty();
        boolean boolean26 = stackAr17.isFull();
        stackAr14.push((java.lang.Object) boolean26);
        java.lang.Object obj28 = stackAr14.topAndPop();
        java.lang.Object obj29 = stackAr14.topAndPop();
        boolean boolean30 = stackAr14.isEmpty();
        stackAr1.push((java.lang.Object) boolean30);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray28 = overflow20.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow33);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = underflow36.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow36);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow44);
        java.lang.Throwable[] throwableArray47 = overflow41.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow36.addSuppressed((java.lang.Throwable) overflow40);
        overflow30.addSuppressed((java.lang.Throwable) overflow40);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        overflow5.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow53.getSuppressed();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        overflow59.addSuppressed((java.lang.Throwable) underflow60);
        overflow53.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        overflow64.addSuppressed((java.lang.Throwable) underflow65);
        java.lang.Throwable[] throwableArray68 = overflow64.getSuppressed();
        java.lang.Throwable[] throwableArray69 = overflow64.getSuppressed();
        java.lang.Throwable[] throwableArray70 = overflow64.getSuppressed();
        overflow59.addSuppressed((java.lang.Throwable) overflow64);
        java.lang.Throwable[] throwableArray72 = overflow64.getSuppressed();
        java.lang.Throwable[] throwableArray73 = overflow64.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) overflow64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) underflow7);
        underflow1.addSuppressed((java.lang.Throwable) overflow4);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow18);
        overflow11.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow22.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow22);
        overflow4.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray30 = overflow4.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow38);
        overflow31.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray48 = overflow42.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) overflow42);
        overflow4.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Class<?> wildcardClass51 = overflow4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow5);
        underflow0.addSuppressed((java.lang.Throwable) underflow5);
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        underflow5.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.Throwable[] throwableArray11 = underflow9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = underflow9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(6);
        boolean boolean7 = stackAr6.isEmpty();
        stackAr6.push((java.lang.Object) 5L);
        boolean boolean10 = stackAr6.isEmpty();
        stackAr6.pop();
        boolean boolean12 = stackAr6.isEmpty();
        boolean boolean13 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow20.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Throwable[] throwableArray29 = overflow15.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        underflow30.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        underflow30.addSuppressed((java.lang.Throwable) underflow39);
        overflow15.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow42.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        overflow42.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        overflow42.addSuppressed((java.lang.Throwable) underflow53);
        underflow30.addSuppressed((java.lang.Throwable) overflow42);
        java.lang.Throwable[] throwableArray56 = overflow42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        stackAr4.push((java.lang.Object) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = underflow12.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.StackAr stackAr17 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        stackAr17.push((java.lang.Object) overflow18);
        overflow8.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow18);
        overflow1.addSuppressed((java.lang.Throwable) overflow18);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr5.push((java.lang.Object) 100.0f);
        boolean boolean8 = stackAr5.isEmpty();
        boolean boolean9 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        java.lang.Object obj11 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr10.push((java.lang.Object) throwableArray12);
        boolean boolean14 = stackAr10.isFull();
        boolean boolean15 = stackAr10.isFull();
        java.lang.Object obj16 = stackAr10.top();
        stackAr1.push(obj16);
        java.lang.Object obj18 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.pop();
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow2.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        overflow2.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow0.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow24.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow37);
        java.lang.Throwable[] throwableArray40 = overflow34.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray42 = overflow34.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        boolean boolean6 = stackAr1.isFull();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow10);
        java.lang.Throwable[] throwableArray13 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow7.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.StackAr stackAr36 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        stackAr36.push((java.lang.Object) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow45);
        underflow40.addSuppressed((java.lang.Throwable) underflow45);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        underflow45.addSuppressed((java.lang.Throwable) underflow49);
        overflow37.addSuppressed((java.lang.Throwable) underflow45);
        overflow27.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Underflow underflow61 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray62 = underflow61.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow61);
        underflow56.addSuppressed((java.lang.Throwable) underflow61);
        overflow53.addSuppressed((java.lang.Throwable) underflow61);
        overflow27.addSuppressed((java.lang.Throwable) underflow61);
        overflow21.addSuppressed((java.lang.Throwable) overflow27);
        overflow15.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray69 = overflow15.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow15);
        stackAr1.push((java.lang.Object) overflow15);
        java.lang.Object obj72 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "DataStructures.Overflow");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.pop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        stackAr6.push((java.lang.Object) throwableArray8);
        boolean boolean10 = stackAr6.isFull();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr((int) '#');
        stackAr12.makeEmpty();
        java.lang.Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr6.push((java.lang.Object) stackAr12);
        stackAr6.makeEmpty();
        java.lang.Object obj17 = stackAr6.topAndPop();
        java.lang.Object obj18 = stackAr6.topAndPop();
        boolean boolean19 = stackAr6.isEmpty();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow25);
        underflow20.addSuppressed((java.lang.Throwable) underflow25);
        java.lang.Class<?> wildcardClass29 = underflow20.getClass();
        stackAr6.push((java.lang.Object) underflow20);
        stackAr1.push((java.lang.Object) stackAr6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        stackAr5.push((java.lang.Object) throwableArray7);
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.top();
        boolean boolean11 = stackAr5.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr5.getClass();
        stackAr1.push((java.lang.Object) wildcardClass12);
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj16 = stackAr15.top();
        java.lang.Object obj17 = stackAr15.topAndPop();
        java.lang.Object obj18 = stackAr15.topAndPop();
        java.lang.Object obj19 = stackAr15.topAndPop();
        boolean boolean20 = stackAr15.isFull();
        stackAr1.push((java.lang.Object) stackAr15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        stackAr1.push((java.lang.Object) underflow8);
        boolean boolean11 = stackAr1.isFull();
        boolean boolean12 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-100L));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        stackAr9.push((java.lang.Object) throwableArray11);
        boolean boolean13 = stackAr9.isFull();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj15 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) underflow7);
        overflow0.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = overflow11.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = underflow27.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = overflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        underflow27.addSuppressed((java.lang.Throwable) overflow31);
        overflow21.addSuppressed((java.lang.Throwable) overflow31);
        overflow11.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow45.addSuppressed((java.lang.Throwable) underflow46);
        java.lang.Throwable[] throwableArray49 = overflow45.getSuppressed();
        java.lang.Throwable[] throwableArray50 = overflow45.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow52);
        overflow45.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow57);
        java.lang.Throwable[] throwableArray60 = overflow56.getSuppressed();
        java.lang.Throwable[] throwableArray61 = overflow56.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow56.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow56);
        underflow43.addSuppressed((java.lang.Throwable) overflow51);
        overflow11.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) underflow67);
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = underflow70.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) underflow70);
        DataStructures.StackAr stackAr75 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        stackAr75.push((java.lang.Object) overflow76);
        java.lang.Throwable[] throwableArray78 = overflow76.getSuppressed();
        DataStructures.Underflow underflow79 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray80 = underflow79.getSuppressed();
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        overflow81.addSuppressed((java.lang.Throwable) overflow82);
        DataStructures.Underflow underflow84 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray85 = underflow84.getSuppressed();
        overflow81.addSuppressed((java.lang.Throwable) underflow84);
        underflow79.addSuppressed((java.lang.Throwable) underflow84);
        DataStructures.Underflow underflow88 = new DataStructures.Underflow();
        underflow84.addSuppressed((java.lang.Throwable) underflow88);
        overflow76.addSuppressed((java.lang.Throwable) underflow84);
        overflow66.addSuppressed((java.lang.Throwable) overflow76);
        overflow11.addSuppressed((java.lang.Throwable) overflow66);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        stackAr1.pop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

