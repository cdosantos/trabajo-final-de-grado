package DataStructures;
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
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.lang.Class<?> wildcardClass17 = underflow6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(6);
        stackAr9.push((java.lang.Object) 100.0f);
        boolean boolean12 = stackAr9.isEmpty();
        stackAr9.pop();
        stackAr9.makeEmpty();
        java.lang.Object obj15 = stackAr9.top();
        stackAr9.makeEmpty();
        java.lang.Object obj17 = stackAr9.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj17);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        boolean boolean11 = stackAr10.isEmpty();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        boolean boolean15 = stackAr10.isEmpty();
        stackAr1.push((java.lang.Object) boolean15);
        boolean boolean17 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow26);
        underflow21.addSuppressed((java.lang.Throwable) underflow26);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow31.getSuppressed();
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
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
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) underflow57);
        underflow52.addSuppressed((java.lang.Throwable) underflow57);
        overflow31.addSuppressed((java.lang.Throwable) underflow52);
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        overflow64.addSuppressed((java.lang.Throwable) overflow65);
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow64.addSuppressed((java.lang.Throwable) underflow67);
        underflow62.addSuppressed((java.lang.Throwable) underflow67);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Underflow underflow72 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray73 = underflow72.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) underflow72);
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        overflow75.addSuppressed((java.lang.Throwable) overflow76);
        DataStructures.Underflow underflow78 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray79 = underflow78.getSuppressed();
        overflow75.addSuppressed((java.lang.Throwable) underflow78);
        underflow72.addSuppressed((java.lang.Throwable) overflow75);
        underflow62.addSuppressed((java.lang.Throwable) underflow72);
        overflow31.addSuppressed((java.lang.Throwable) underflow72);
        overflow6.addSuppressed((java.lang.Throwable) underflow72);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray79);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
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
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj5 = stackAr4.top();
        boolean boolean6 = stackAr4.isEmpty();
        stackAr4.push((java.lang.Object) 0);
        boolean boolean9 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) boolean9);
        stackAr1.pop();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(8);
        stackAr1.push((java.lang.Object) 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        java.lang.Class<?> wildcardClass16 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.top();
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        java.lang.Class<?> wildcardClass18 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        java.lang.Throwable[] throwableArray65 = overflow0.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(9);
        boolean boolean11 = stackAr10.isFull();
        stackAr1.push((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.push((java.lang.Object) (short) -1);
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100 + "'", obj10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        boolean boolean6 = stackAr5.isEmpty();
        stackAr5.push((java.lang.Object) 5L);
        stackAr5.pop();
        boolean boolean10 = stackAr5.isEmpty();
        stackAr5.makeEmpty();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr((int) '#');
        stackAr13.makeEmpty();
        stackAr13.makeEmpty();
        java.lang.Object obj16 = stackAr13.top();
        boolean boolean17 = stackAr13.isEmpty();
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr((int) (short) 0);
        stackAr13.push((java.lang.Object) (short) 0);
        stackAr13.push((java.lang.Object) 2L);
        boolean boolean23 = stackAr13.isEmpty();
        java.lang.Object obj24 = stackAr13.topAndPop();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow30);
        underflow25.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow41);
        underflow35.addSuppressed((java.lang.Throwable) overflow38);
        underflow25.addSuppressed((java.lang.Throwable) underflow35);
        stackAr13.push((java.lang.Object) underflow25);
        java.lang.Class<?> wildcardClass47 = underflow25.getClass();
        stackAr5.push((java.lang.Object) underflow25);
        java.lang.Object obj49 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        boolean boolean51 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 2L + "'", obj24, 2L);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "DataStructures.Underflow");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        boolean boolean16 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        java.lang.Class<?> wildcardClass16 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = underflow4.getClass();
        stackAr1.push((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        java.lang.Object obj35 = stackAr1.top();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2L + "'", obj12, 2L);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "DataStructures.Underflow");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        boolean boolean17 = stackAr1.isEmpty();
        boolean boolean18 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = underflow34.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow34);
        overflow4.addSuppressed((java.lang.Throwable) underflow34);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow44);
        underflow39.addSuppressed((java.lang.Throwable) underflow44);
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        underflow39.addSuppressed((java.lang.Throwable) underflow48);
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.StackAr stackAr59 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        stackAr59.push((java.lang.Object) overflow60);
        overflow50.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow64);
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = underflow67.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow67);
        DataStructures.StackAr stackAr72 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        stackAr72.push((java.lang.Object) overflow73);
        java.lang.Throwable[] throwableArray75 = overflow73.getSuppressed();
        DataStructures.Underflow underflow76 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray77 = underflow76.getSuppressed();
        DataStructures.Overflow overflow78 = new DataStructures.Overflow();
        DataStructures.Overflow overflow79 = new DataStructures.Overflow();
        overflow78.addSuppressed((java.lang.Throwable) overflow79);
        DataStructures.Underflow underflow81 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray82 = underflow81.getSuppressed();
        overflow78.addSuppressed((java.lang.Throwable) underflow81);
        underflow76.addSuppressed((java.lang.Throwable) underflow81);
        DataStructures.Underflow underflow85 = new DataStructures.Underflow();
        underflow81.addSuppressed((java.lang.Throwable) underflow85);
        overflow73.addSuppressed((java.lang.Throwable) underflow81);
        overflow63.addSuppressed((java.lang.Throwable) overflow73);
        overflow50.addSuppressed((java.lang.Throwable) overflow63);
        underflow39.addSuppressed((java.lang.Throwable) overflow50);
        overflow4.addSuppressed((java.lang.Throwable) underflow39);
        java.lang.Throwable[] throwableArray92 = overflow4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        boolean boolean6 = stackAr5.isEmpty();
        stackAr5.push((java.lang.Object) 5L);
        stackAr5.pop();
        boolean boolean10 = stackAr5.isEmpty();
        stackAr5.makeEmpty();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr((int) '#');
        stackAr13.makeEmpty();
        stackAr13.makeEmpty();
        java.lang.Object obj16 = stackAr13.top();
        boolean boolean17 = stackAr13.isEmpty();
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr((int) (short) 0);
        stackAr13.push((java.lang.Object) (short) 0);
        stackAr13.push((java.lang.Object) 2L);
        boolean boolean23 = stackAr13.isEmpty();
        java.lang.Object obj24 = stackAr13.topAndPop();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow30);
        underflow25.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow41);
        underflow35.addSuppressed((java.lang.Throwable) overflow38);
        underflow25.addSuppressed((java.lang.Throwable) underflow35);
        stackAr13.push((java.lang.Object) underflow25);
        java.lang.Class<?> wildcardClass47 = underflow25.getClass();
        stackAr5.push((java.lang.Object) underflow25);
        java.lang.Object obj49 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Class<?> wildcardClass51 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 2L + "'", obj24, 2L);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "DataStructures.Underflow");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        boolean boolean16 = stackAr1.isEmpty();
        java.lang.Object obj17 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass18 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) underflow11);
        java.lang.Throwable[] throwableArray14 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray15 = overflow10.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow17);
        overflow10.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow22);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow21.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray35 = overflow30.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow37);
        overflow30.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.Throwable[] throwableArray45 = overflow41.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow41.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow41.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow41);
        underflow28.addSuppressed((java.lang.Throwable) overflow36);
        overflow21.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow52);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        java.lang.Throwable[] throwableArray57 = underflow55.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow55);
        DataStructures.StackAr stackAr60 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        stackAr60.push((java.lang.Object) overflow61);
        overflow51.addSuppressed((java.lang.Throwable) overflow61);
        overflow36.addSuppressed((java.lang.Throwable) overflow51);
        stackAr1.push((java.lang.Object) overflow36);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = underflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = underflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr9.push((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr9.isFull();
        boolean boolean16 = stackAr9.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        boolean boolean20 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        stackAr4.makeEmpty();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push(obj9);
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        java.lang.Class<?> wildcardClass70 = throwableArray69.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        java.lang.Class<?> wildcardClass12 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        stackAr1.push((java.lang.Object) (-5.4d));
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
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean12 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(9);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        overflow7.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.StackAr stackAr22 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        stackAr22.push((java.lang.Object) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow23.getSuppressed();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow31);
        underflow26.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        underflow31.addSuppressed((java.lang.Throwable) underflow35);
        overflow23.addSuppressed((java.lang.Throwable) underflow31);
        overflow13.addSuppressed((java.lang.Throwable) overflow23);
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
        overflow13.addSuppressed((java.lang.Throwable) underflow47);
        overflow7.addSuppressed((java.lang.Throwable) overflow13);
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(6);
        stackAr13.push((java.lang.Object) 100.0f);
        stackAr13.push((java.lang.Object) 2.7d);
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        stackAr19.push((java.lang.Object) throwableArray21);
        java.lang.Object obj23 = stackAr19.top();
        java.lang.Object obj24 = stackAr19.topAndPop();
        stackAr13.push(obj24);
        DataStructures.StackAr stackAr27 = new DataStructures.StackAr((int) (byte) 0);
        stackAr13.push((java.lang.Object) (byte) 0);
        stackAr13.makeEmpty();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray35 = overflow30.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow37);
        overflow30.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.Throwable[] throwableArray45 = overflow41.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow41.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        java.lang.Throwable[] throwableArray54 = overflow50.getSuppressed();
        java.lang.Throwable[] throwableArray55 = overflow50.getSuppressed();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow57);
        overflow50.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        overflow61.addSuppressed((java.lang.Throwable) underflow62);
        java.lang.Throwable[] throwableArray65 = overflow61.getSuppressed();
        java.lang.Throwable[] throwableArray66 = overflow61.getSuppressed();
        java.lang.Throwable[] throwableArray67 = overflow61.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow61);
        underflow48.addSuppressed((java.lang.Throwable) overflow56);
        overflow41.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Underflow underflow72 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray73 = underflow72.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) underflow72);
        DataStructures.Underflow underflow75 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray76 = underflow75.getSuppressed();
        java.lang.Throwable[] throwableArray77 = underflow75.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) underflow75);
        DataStructures.StackAr stackAr80 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow81 = new DataStructures.Overflow();
        stackAr80.push((java.lang.Object) overflow81);
        overflow71.addSuppressed((java.lang.Throwable) overflow81);
        overflow56.addSuppressed((java.lang.Throwable) overflow71);
        DataStructures.Overflow overflow85 = new DataStructures.Overflow();
        DataStructures.Underflow underflow86 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray87 = underflow86.getSuppressed();
        overflow85.addSuppressed((java.lang.Throwable) underflow86);
        java.lang.Throwable[] throwableArray89 = overflow85.getSuppressed();
        java.lang.Throwable[] throwableArray90 = overflow85.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) overflow85);
        stackAr13.push((java.lang.Object) overflow71);
        underflow9.addSuppressed((java.lang.Throwable) overflow71);
        java.lang.Throwable[] throwableArray94 = underflow9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray94);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        java.lang.Throwable[] throwableArray51 = overflow0.getSuppressed();
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        stackAr12.push((java.lang.Object) 100.0f);
        boolean boolean15 = stackAr12.isEmpty();
        java.lang.Object obj16 = stackAr12.topAndPop();
        boolean boolean17 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj21 = stackAr12.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        stackAr6.pop();
        java.lang.Object obj20 = stackAr6.topAndPop();
        java.lang.Object obj21 = stackAr6.topAndPop();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        stackAr1.pop();
        boolean boolean81 = stackAr1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        stackAr12.push((java.lang.Object) 100.0f);
        boolean boolean15 = stackAr12.isEmpty();
        java.lang.Object obj16 = stackAr12.topAndPop();
        boolean boolean17 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        // The following exception was thrown during execution in test generation
        try {
            stackAr12.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass8 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = underflow24.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.StackAr stackAr29 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        stackAr29.push((java.lang.Object) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow38);
        underflow33.addSuppressed((java.lang.Throwable) underflow38);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        underflow38.addSuppressed((java.lang.Throwable) underflow42);
        overflow30.addSuppressed((java.lang.Throwable) underflow38);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow54);
        underflow49.addSuppressed((java.lang.Throwable) underflow54);
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
        overflow20.addSuppressed((java.lang.Throwable) underflow54);
        underflow8.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray61 = underflow54.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
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
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "DataStructures.Underflow");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "DataStructures.Underflow");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(0);
        stackAr11.makeEmpty();
        stackAr11.makeEmpty();
        java.lang.Object obj14 = stackAr11.top();
        stackAr1.push(obj14);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(9);
        stackAr1.push((java.lang.Object) stackAr3);
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        java.lang.Throwable[] throwableArray19 = overflow6.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow25);
        underflow20.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        underflow20.addSuppressed((java.lang.Throwable) underflow29);
        overflow6.addSuppressed((java.lang.Throwable) underflow29);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.top();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow46);
        underflow41.addSuppressed((java.lang.Throwable) underflow46);
        overflow11.addSuppressed((java.lang.Throwable) underflow46);
        java.lang.Throwable[] throwableArray51 = underflow46.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        boolean boolean13 = stackAr12.isEmpty();
        stackAr12.push((java.lang.Object) 5L);
        boolean boolean16 = stackAr12.isEmpty();
        stackAr12.pop();
        boolean boolean18 = stackAr12.isEmpty();
        boolean boolean19 = stackAr12.isFull();
        boolean boolean20 = stackAr12.isEmpty();
        java.lang.Object obj21 = stackAr12.top();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray16 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray22 = overflow18.getSuppressed();
        java.lang.Throwable[] throwableArray23 = overflow18.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        overflow18.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow30);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow36);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        overflow18.addSuppressed((java.lang.Throwable) underflow30);
        java.lang.Throwable[] throwableArray41 = underflow30.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow30);
        stackAr1.push((java.lang.Object) underflow30);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = null;
        stackAr1.push(obj7);
        stackAr1.pop();
        java.lang.Object obj10 = stackAr1.topAndPop();
        java.lang.Object obj11 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 100 + "'", obj10, (byte) 100);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        java.lang.Object obj16 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        java.lang.Throwable throwable63 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow1.addSuppressed(throwable63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(6);
        stackAr12.push((java.lang.Object) 100.0f);
        boolean boolean15 = stackAr12.isEmpty();
        java.lang.Object obj16 = stackAr12.topAndPop();
        boolean boolean17 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean21 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow58);
        java.lang.Throwable[] throwableArray61 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow57.getSuppressed();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow64);
        overflow57.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        DataStructures.Underflow underflow69 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray70 = underflow69.getSuppressed();
        overflow68.addSuppressed((java.lang.Throwable) underflow69);
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        DataStructures.Underflow underflow75 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray76 = underflow75.getSuppressed();
        overflow72.addSuppressed((java.lang.Throwable) underflow75);
        underflow69.addSuppressed((java.lang.Throwable) overflow72);
        overflow57.addSuppressed((java.lang.Throwable) underflow69);
        java.lang.Throwable[] throwableArray80 = underflow69.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow69);
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
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        overflow15.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray49 = overflow15.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = underflow26.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow26);
        DataStructures.StackAr stackAr31 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        stackAr31.push((java.lang.Object) overflow32);
        overflow22.addSuppressed((java.lang.Throwable) overflow32);
        underflow0.addSuppressed((java.lang.Throwable) overflow32);
        java.lang.Throwable[] throwableArray36 = underflow0.getSuppressed();
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
        underflow37.addSuppressed((java.lang.Throwable) underflow46);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = underflow52.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow52);
        DataStructures.StackAr stackAr57 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        stackAr57.push((java.lang.Object) overflow58);
        overflow48.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        overflow61.addSuppressed((java.lang.Throwable) underflow62);
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = underflow65.getSuppressed();
        overflow61.addSuppressed((java.lang.Throwable) underflow65);
        DataStructures.StackAr stackAr70 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        stackAr70.push((java.lang.Object) overflow71);
        java.lang.Throwable[] throwableArray73 = overflow71.getSuppressed();
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray75 = underflow74.getSuppressed();
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        overflow76.addSuppressed((java.lang.Throwable) overflow77);
        DataStructures.Underflow underflow79 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray80 = underflow79.getSuppressed();
        overflow76.addSuppressed((java.lang.Throwable) underflow79);
        underflow74.addSuppressed((java.lang.Throwable) underflow79);
        DataStructures.Underflow underflow83 = new DataStructures.Underflow();
        underflow79.addSuppressed((java.lang.Throwable) underflow83);
        overflow71.addSuppressed((java.lang.Throwable) underflow79);
        overflow61.addSuppressed((java.lang.Throwable) overflow71);
        overflow48.addSuppressed((java.lang.Throwable) overflow61);
        underflow37.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray89 = underflow37.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) underflow37);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        stackAr4.push((java.lang.Object) overflow5);
        overflow1.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow9);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = underflow12.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow20);
        java.lang.Throwable[] throwableArray23 = overflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow12.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray26 = overflow16.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow33);
        underflow28.addSuppressed((java.lang.Throwable) underflow33);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        underflow28.addSuppressed((java.lang.Throwable) underflow37);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        DataStructures.StackAr stackAr48 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        stackAr48.push((java.lang.Object) overflow49);
        overflow39.addSuppressed((java.lang.Throwable) overflow49);
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
        java.lang.Throwable[] throwableArray64 = overflow62.getSuppressed();
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        overflow67.addSuppressed((java.lang.Throwable) overflow68);
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        overflow67.addSuppressed((java.lang.Throwable) underflow70);
        underflow65.addSuppressed((java.lang.Throwable) underflow70);
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        underflow70.addSuppressed((java.lang.Throwable) underflow74);
        overflow62.addSuppressed((java.lang.Throwable) underflow70);
        overflow52.addSuppressed((java.lang.Throwable) overflow62);
        overflow39.addSuppressed((java.lang.Throwable) overflow52);
        underflow28.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray80 = underflow28.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow28);
        java.lang.Class<?> wildcardClass82 = overflow16.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean15 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        java.lang.Throwable[] throwableArray18 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow11.getSuppressed();
        java.lang.Class<?> wildcardClass20 = overflow11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow14);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow20);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = underflow27.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.StackAr stackAr32 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        stackAr32.push((java.lang.Object) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow33.getSuppressed();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow41);
        underflow36.addSuppressed((java.lang.Throwable) underflow41);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        underflow41.addSuppressed((java.lang.Throwable) underflow45);
        overflow33.addSuppressed((java.lang.Throwable) underflow41);
        overflow23.addSuppressed((java.lang.Throwable) overflow33);
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
        overflow23.addSuppressed((java.lang.Throwable) underflow57);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow11.addSuppressed((java.lang.Throwable) overflow17);
        overflow4.addSuppressed((java.lang.Throwable) overflow17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        boolean boolean11 = stackAr10.isEmpty();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        boolean boolean15 = stackAr10.isEmpty();
        stackAr1.push((java.lang.Object) boolean15);
        java.lang.Object obj17 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        java.lang.Class<?> wildcardClass14 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        boolean boolean32 = stackAr1.isEmpty();
        boolean boolean33 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr10.push((java.lang.Object) throwableArray12);
        boolean boolean14 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass15 = stackAr10.getClass();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj17 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        java.lang.Object obj16 = stackAr1.top();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
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
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        stackAr1.push((java.lang.Object) overflow9);
        boolean boolean14 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '#');
        stackAr7.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr7.getClass();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj13 = stackAr12.top();
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr(0);
        stackAr15.makeEmpty();
        stackAr15.makeEmpty();
        boolean boolean18 = stackAr15.isFull();
        java.lang.Object obj19 = stackAr15.top();
        java.lang.Object obj20 = stackAr15.topAndPop();
        stackAr12.push(obj20);
        stackAr12.pop();
        boolean boolean23 = stackAr12.isEmpty();
        java.lang.Object obj24 = stackAr12.top();
        java.lang.Object obj25 = null;
        stackAr12.push(obj25);
        stackAr7.push(obj25);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        java.lang.Object obj31 = stackAr1.topAndPop();
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
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "DataStructures.Overflow");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.pop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr10.push((java.lang.Object) throwableArray12);
        boolean boolean14 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass15 = stackAr10.getClass();
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean17 = stackAr10.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        boolean boolean12 = stackAr1.isEmpty();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        stackAr1.push((java.lang.Object) overflow13);
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-4));
        stackAr1.makeEmpty();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        java.lang.Class<?> wildcardClass23 = throwableArray22.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow6);
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow5.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow12);
        overflow5.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow23);
        underflow17.addSuppressed((java.lang.Throwable) overflow20);
        overflow5.addSuppressed((java.lang.Throwable) underflow17);
        java.lang.Class<?> wildcardClass28 = overflow5.getClass();
        stackAr1.push((java.lang.Object) overflow5);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        boolean boolean16 = stackAr1.isEmpty();
        java.lang.Object obj17 = stackAr1.topAndPop();
        boolean boolean18 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(2);
        java.lang.Class<?> wildcardClass10 = stackAr9.getClass();
        stackAr1.push((java.lang.Object) stackAr9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
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
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.StackAr stackAr59 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        stackAr59.push((java.lang.Object) overflow60);
        overflow50.addSuppressed((java.lang.Throwable) overflow60);
        overflow35.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Class<?> wildcardClass64 = overflow50.getClass();
        stackAr1.push((java.lang.Object) overflow50);
        java.lang.Object obj66 = stackAr1.top();
        java.lang.Object obj67 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "DataStructures.Overflow");
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "DataStructures.Overflow");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) "hi!");
        boolean boolean12 = stackAr1.isEmpty();
        boolean boolean13 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean15 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow39);
        java.lang.Throwable[] throwableArray42 = overflow38.getSuppressed();
        java.lang.Throwable[] throwableArray43 = overflow38.getSuppressed();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow45);
        overflow38.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) underflow50);
        java.lang.Throwable[] throwableArray53 = overflow49.getSuppressed();
        java.lang.Throwable[] throwableArray54 = overflow49.getSuppressed();
        java.lang.Throwable[] throwableArray55 = overflow49.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) overflow49);
        underflow36.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Underflow underflow59 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray60 = underflow59.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow59);
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        java.lang.Throwable[] throwableArray64 = underflow62.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow62);
        DataStructures.StackAr stackAr67 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow68 = new DataStructures.Overflow();
        stackAr67.push((java.lang.Object) overflow68);
        overflow58.addSuppressed((java.lang.Throwable) overflow68);
        underflow36.addSuppressed((java.lang.Throwable) overflow68);
        overflow20.addSuppressed((java.lang.Throwable) overflow68);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        overflow20.addSuppressed((java.lang.Throwable) underflow31);
        overflow13.addSuppressed((java.lang.Throwable) underflow31);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(6);
        stackAr10.push((java.lang.Object) 100.0f);
        stackAr10.push((java.lang.Object) 2.7d);
        java.lang.Class<?> wildcardClass15 = stackAr10.getClass();
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow18);
        java.lang.Throwable[] throwableArray21 = overflow17.getSuppressed();
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow38);
        java.lang.Throwable[] throwableArray41 = overflow37.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow37.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow44);
        overflow37.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        java.lang.Throwable[] throwableArray52 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray53 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray54 = overflow48.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow48);
        underflow35.addSuppressed((java.lang.Throwable) overflow43);
        overflow28.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        DataStructures.Underflow underflow63 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray64 = underflow63.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) underflow63);
        underflow58.addSuppressed((java.lang.Throwable) underflow63);
        overflow28.addSuppressed((java.lang.Throwable) underflow63);
        stackAr1.push((java.lang.Object) overflow28);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 100 + "'", obj7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow32);
        overflow25.addSuppressed((java.lang.Throwable) overflow31);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow37);
        java.lang.Throwable[] throwableArray40 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray41 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow36.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow36);
        underflow23.addSuppressed((java.lang.Throwable) overflow31);
        overflow1.addSuppressed((java.lang.Throwable) overflow31);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        boolean boolean10 = stackAr8.isEmpty();
        stackAr8.push((java.lang.Object) 0);
        boolean boolean13 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj15 = stackAr8.topAndPop();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        java.lang.Throwable[] throwableArray42 = overflow11.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr9.push((java.lang.Object) (byte) 100);
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean16 = stackAr1.isFull();
        java.lang.Object obj17 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 100 + "'", obj17, (byte) 100);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        stackAr1.push((java.lang.Object) overflow9);
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow17);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray27 = overflow16.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Object obj10 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        boolean boolean6 = stackAr1.isFull();
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        DataStructures.StackAr stackAr45 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        stackAr45.push((java.lang.Object) throwableArray47);
        boolean boolean49 = stackAr45.isFull();
        boolean boolean50 = stackAr45.isFull();
        java.lang.Object obj51 = stackAr45.top();
        java.lang.Object obj52 = stackAr45.top();
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
        stackAr45.push((java.lang.Object) overflow59);
        java.lang.Throwable[] throwableArray73 = overflow59.getSuppressed();
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray75 = underflow74.getSuppressed();
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        overflow76.addSuppressed((java.lang.Throwable) overflow77);
        DataStructures.Underflow underflow79 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray80 = underflow79.getSuppressed();
        overflow76.addSuppressed((java.lang.Throwable) underflow79);
        underflow74.addSuppressed((java.lang.Throwable) underflow79);
        DataStructures.Underflow underflow83 = new DataStructures.Underflow();
        underflow74.addSuppressed((java.lang.Throwable) underflow83);
        overflow59.addSuppressed((java.lang.Throwable) underflow74);
        overflow34.addSuppressed((java.lang.Throwable) overflow59);
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
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        java.lang.Object obj15 = null;
        stackAr1.push(obj15);
        stackAr1.pop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        boolean boolean13 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        java.lang.Object obj11 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray32 = overflow27.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
        stackAr15.makeEmpty();
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
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Class<?> wildcardClass13 = stackAr9.getClass();
        stackAr1.push((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
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
        underflow13.addSuppressed((java.lang.Throwable) overflow21);
        overflow10.addSuppressed((java.lang.Throwable) overflow21);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = underflow1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = underflow1.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = underflow13.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow13);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray24 = overflow18.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow13.addSuppressed((java.lang.Throwable) overflow17);
        overflow7.addSuppressed((java.lang.Throwable) overflow17);
        underflow1.addSuppressed((java.lang.Throwable) overflow17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        java.lang.Class<?> wildcardClass33 = throwableArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        stackAr4.makeEmpty();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        stackAr4.push((java.lang.Object) overflow8);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Throwable[] throwableArray16 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow12.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        overflow12.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray27 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow23.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray31 = overflow23.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = underflow39.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow44.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        underflow39.addSuppressed((java.lang.Throwable) overflow43);
        overflow33.addSuppressed((java.lang.Throwable) overflow43);
        overflow23.addSuppressed((java.lang.Throwable) overflow33);
        overflow8.addSuppressed((java.lang.Throwable) overflow33);
        stackAr1.push((java.lang.Object) overflow33);
        java.lang.Object obj57 = stackAr1.top();
        java.lang.Object obj58 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "DataStructures.Overflow");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "DataStructures.Overflow");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        boolean boolean17 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) '#');
        stackAr8.makeEmpty();
        stackAr8.push((java.lang.Object) 100);
        boolean boolean12 = stackAr8.isFull();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj15 = stackAr14.top();
        DataStructures.StackAr stackAr17 = new DataStructures.StackAr(0);
        stackAr17.makeEmpty();
        stackAr17.makeEmpty();
        boolean boolean20 = stackAr17.isFull();
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.topAndPop();
        stackAr14.push(obj22);
        stackAr14.pop();
        stackAr8.push((java.lang.Object) stackAr14);
        stackAr1.push((java.lang.Object) stackAr14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
        java.lang.Class<?> wildcardClass71 = overflow62.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = underflow6.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow6);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow11.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow6.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray20 = underflow6.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow29);
        underflow24.addSuppressed((java.lang.Throwable) underflow29);
        overflow21.addSuppressed((java.lang.Throwable) underflow29);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray39 = overflow34.getSuppressed();
        underflow29.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow49);
        underflow44.addSuppressed((java.lang.Throwable) underflow49);
        overflow41.addSuppressed((java.lang.Throwable) underflow49);
        overflow34.addSuppressed((java.lang.Throwable) overflow41);
        underflow6.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray56 = overflow41.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow41);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
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
        java.lang.Throwable[] throwableArray45 = overflow10.getSuppressed();
        java.lang.Class<?> wildcardClass46 = overflow10.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(1);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Object obj7 = stackAr5.topAndPop();
        java.lang.Object obj8 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(6);
        boolean boolean9 = stackAr8.isEmpty();
        stackAr8.makeEmpty();
        stackAr8.makeEmpty();
        java.lang.Object obj12 = stackAr8.topAndPop();
        boolean boolean13 = stackAr8.isEmpty();
        boolean boolean14 = stackAr8.isFull();
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
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow35.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        underflow33.addSuppressed((java.lang.Throwable) overflow41);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow57);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        java.lang.Throwable[] throwableArray62 = underflow60.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow60);
        DataStructures.StackAr stackAr65 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        stackAr65.push((java.lang.Object) overflow66);
        overflow56.addSuppressed((java.lang.Throwable) overflow66);
        overflow41.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.StackAr stackAr71 = new DataStructures.StackAr(6);
        stackAr71.push((java.lang.Object) 100.0f);
        boolean boolean74 = stackAr71.isEmpty();
        java.lang.Object obj75 = stackAr71.topAndPop();
        java.lang.Object obj76 = stackAr71.top();
        boolean boolean77 = stackAr71.isEmpty();
        stackAr71.makeEmpty();
        DataStructures.Overflow overflow79 = new DataStructures.Overflow();
        DataStructures.Overflow overflow80 = new DataStructures.Overflow();
        overflow79.addSuppressed((java.lang.Throwable) overflow80);
        java.lang.Throwable[] throwableArray82 = overflow79.getSuppressed();
        stackAr71.push((java.lang.Object) overflow79);
        java.lang.Throwable[] throwableArray84 = overflow79.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) overflow79);
        stackAr8.push((java.lang.Object) overflow79);
        boolean boolean87 = stackAr8.isEmpty();
        stackAr1.push((java.lang.Object) stackAr8);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0f + "'", obj75, 100.0f);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(1);
        java.lang.Object obj7 = stackAr6.top();
        boolean boolean8 = stackAr6.isEmpty();
        boolean boolean9 = stackAr6.isEmpty();
        boolean boolean10 = stackAr6.isFull();
        boolean boolean11 = stackAr6.isFull();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(6);
        stackAr13.push((java.lang.Object) 100.0f);
        boolean boolean16 = stackAr13.isEmpty();
        java.lang.Object obj17 = stackAr13.topAndPop();
        boolean boolean18 = stackAr13.isEmpty();
        stackAr13.makeEmpty();
        stackAr13.push((java.lang.Object) 7L);
        stackAr6.push((java.lang.Object) stackAr13);
        stackAr1.push((java.lang.Object) stackAr6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj6 = stackAr4.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        stackAr1.push((java.lang.Object) overflow2);
        java.lang.Throwable[] throwableArray4 = overflow2.getSuppressed();
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
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow17);
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) underflow23);
        overflow16.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow28);
        java.lang.Throwable[] throwableArray31 = overflow27.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow27.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        overflow9.addSuppressed((java.lang.Throwable) overflow27);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow37);
        java.lang.Throwable[] throwableArray40 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray41 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow36.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = underflow43.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Throwable[] throwableArray47 = underflow43.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) underflow43);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow45);
        java.lang.Throwable[] throwableArray48 = overflow44.getSuppressed();
        java.lang.Throwable[] throwableArray49 = overflow44.getSuppressed();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        overflow44.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) underflow56);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Underflow underflow62 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray63 = underflow62.getSuppressed();
        overflow59.addSuppressed((java.lang.Throwable) underflow62);
        underflow56.addSuppressed((java.lang.Throwable) overflow59);
        overflow44.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray67 = overflow44.getSuppressed();
        java.lang.Throwable[] throwableArray68 = overflow44.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Class<?> wildcardClass70 = overflow44.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 6);
        stackAr1.makeEmpty();
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        java.lang.Throwable[] throwableArray24 = overflow8.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = overflow26.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray34 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray35 = overflow26.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow8.addSuppressed(throwable37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        java.lang.Class<?> wildcardClass13 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
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
        boolean boolean14 = stackAr1.isEmpty();
        stackAr1.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2L + "'", obj12, 2L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow13.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow20);
        overflow13.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        java.lang.Throwable[] throwableArray28 = overflow24.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow24.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow24.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow24);
        underflow11.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow38);
        java.lang.Throwable[] throwableArray41 = overflow35.getSuppressed();
        underflow33.addSuppressed((java.lang.Throwable) overflow35);
        underflow11.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray44 = underflow11.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) underflow11);
        java.lang.Class<?> wildcardClass46 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        java.lang.Throwable[] throwableArray24 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow46);
        underflow41.addSuppressed((java.lang.Throwable) underflow46);
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        underflow46.addSuppressed((java.lang.Throwable) underflow50);
        overflow13.addSuppressed((java.lang.Throwable) underflow50);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray58 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray59 = overflow53.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray61 = overflow13.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) underflow44);
        java.lang.Throwable[] throwableArray47 = overflow43.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) underflow49);
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow55);
        underflow49.addSuppressed((java.lang.Throwable) overflow52);
        overflow43.addSuppressed((java.lang.Throwable) underflow49);
        overflow26.addSuppressed((java.lang.Throwable) underflow49);
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
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        java.lang.Object obj28 = stackAr1.topAndPop();
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
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) 2L);
        stackAr1.pop();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.Throwable[] throwableArray19 = overflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        stackAr1.push((java.lang.Object) overflow12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "DataStructures.Overflow");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        boolean boolean5 = stackAr1.isFull();
        stackAr1.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.top();
        java.lang.Object obj10 = stackAr8.topAndPop();
        java.lang.Object obj11 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-1.0f));
        stackAr8.pop();
        stackAr8.makeEmpty();
        java.lang.Object obj16 = stackAr8.top();
        stackAr8.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr8);
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr(7);
        boolean boolean21 = stackAr20.isFull();
        java.lang.Object obj22 = stackAr20.topAndPop();
        stackAr8.push((java.lang.Object) stackAr20);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = underflow24.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray35 = overflow29.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        underflow24.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.StackAr stackAr39 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        stackAr39.push((java.lang.Object) overflow40);
        java.lang.Throwable[] throwableArray42 = overflow40.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow45.addSuppressed((java.lang.Throwable) underflow48);
        underflow43.addSuppressed((java.lang.Throwable) underflow48);
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        underflow48.addSuppressed((java.lang.Throwable) underflow52);
        overflow40.addSuppressed((java.lang.Throwable) underflow48);
        overflow28.addSuppressed((java.lang.Throwable) overflow40);
        overflow11.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow60);
        java.lang.Throwable[] throwableArray63 = overflow57.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow57);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow35.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        underflow33.addSuppressed((java.lang.Throwable) overflow41);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray56 = overflow26.getSuppressed();
        stackAr9.push((java.lang.Object) overflow26);
        java.lang.Throwable[] throwableArray58 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray59 = overflow26.getSuppressed();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = underflow4.getClass();
        stackAr1.push((java.lang.Object) wildcardClass7);
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
        java.lang.Throwable[] throwableArray49 = overflow34.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = underflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        underflow11.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        underflow11.addSuppressed((java.lang.Throwable) underflow21);
        overflow0.addSuppressed((java.lang.Throwable) underflow11);
        java.lang.Throwable[] throwableArray33 = underflow11.getSuppressed();
        java.lang.Class<?> wildcardClass34 = underflow11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) underflow57);
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        overflow62.addSuppressed((java.lang.Throwable) underflow65);
        underflow60.addSuppressed((java.lang.Throwable) underflow65);
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        overflow69.addSuppressed((java.lang.Throwable) underflow70);
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        DataStructures.Overflow overflow74 = new DataStructures.Overflow();
        overflow73.addSuppressed((java.lang.Throwable) overflow74);
        DataStructures.Underflow underflow76 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray77 = underflow76.getSuppressed();
        overflow73.addSuppressed((java.lang.Throwable) underflow76);
        underflow70.addSuppressed((java.lang.Throwable) overflow73);
        underflow60.addSuppressed((java.lang.Throwable) underflow70);
        underflow57.addSuppressed((java.lang.Throwable) underflow70);
        overflow5.addSuppressed((java.lang.Throwable) underflow70);
        java.lang.Throwable[] throwableArray83 = overflow5.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray83);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow35.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        underflow33.addSuppressed((java.lang.Throwable) overflow41);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray56 = overflow26.getSuppressed();
        stackAr9.push((java.lang.Object) overflow26);
        boolean boolean58 = stackAr9.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        DataStructures.Underflow underflow71 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray72 = underflow71.getSuppressed();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        DataStructures.Overflow overflow74 = new DataStructures.Overflow();
        overflow73.addSuppressed((java.lang.Throwable) overflow74);
        DataStructures.Underflow underflow76 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray77 = underflow76.getSuppressed();
        overflow73.addSuppressed((java.lang.Throwable) underflow76);
        underflow71.addSuppressed((java.lang.Throwable) underflow76);
        DataStructures.Underflow underflow80 = new DataStructures.Underflow();
        underflow76.addSuppressed((java.lang.Throwable) underflow80);
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        DataStructures.Underflow underflow83 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray84 = underflow83.getSuppressed();
        overflow82.addSuppressed((java.lang.Throwable) underflow83);
        java.lang.Throwable[] throwableArray86 = overflow82.getSuppressed();
        java.lang.Throwable[] throwableArray87 = overflow82.getSuppressed();
        underflow80.addSuppressed((java.lang.Throwable) overflow82);
        overflow62.addSuppressed((java.lang.Throwable) underflow80);
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
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow35.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        underflow33.addSuppressed((java.lang.Throwable) overflow41);
        overflow26.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray56 = overflow26.getSuppressed();
        stackAr9.push((java.lang.Object) overflow26);
        java.lang.Object obj58 = stackAr9.top();
        boolean boolean59 = stackAr9.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "DataStructures.Overflow");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(6);
        stackAr3.push((java.lang.Object) 100.0f);
        boolean boolean6 = stackAr3.isEmpty();
        stackAr3.pop();
        stackAr3.makeEmpty();
        java.lang.Object obj9 = stackAr3.top();
        stackAr3.makeEmpty();
        java.lang.Object obj11 = stackAr3.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.topAndPop();
        stackAr9.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr9);
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isEmpty();
        boolean boolean15 = stackAr9.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
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
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Throwable[] throwableArray16 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow12.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow19);
        overflow12.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray27 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow23.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow23.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow23);
        overflow4.addSuppressed((java.lang.Throwable) overflow23);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.topAndPop();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        boolean boolean16 = stackAr10.isFull();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
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
        underflow17.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow40);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        DataStructures.StackAr stackAr48 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        stackAr48.push((java.lang.Object) overflow49);
        overflow39.addSuppressed((java.lang.Throwable) overflow49);
        underflow17.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray53 = underflow17.getSuppressed();
        stackAr10.push((java.lang.Object) underflow17);
        stackAr1.push((java.lang.Object) underflow17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 100 + "'", obj8, (byte) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
        boolean boolean20 = stackAr6.isEmpty();
        DataStructures.StackAr stackAr22 = new DataStructures.StackAr((int) (byte) 100);
        boolean boolean23 = stackAr22.isFull();
        stackAr6.push((java.lang.Object) boolean23);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "DataStructures.Underflow");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
        boolean boolean16 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 7L);
        boolean boolean10 = stackAr1.isFull();
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 6);
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
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
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.StackAr stackAr59 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        stackAr59.push((java.lang.Object) overflow60);
        overflow50.addSuppressed((java.lang.Throwable) overflow60);
        overflow35.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Class<?> wildcardClass64 = overflow50.getClass();
        stackAr1.push((java.lang.Object) overflow50);
        boolean boolean66 = stackAr1.isEmpty();
        java.lang.Object obj67 = stackAr1.top();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "DataStructures.Overflow");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) '4');
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.push((java.lang.Object) 2.7d);
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 2.7d + "'", obj6, 2.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 7L);
        stackAr1.pop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray22 = overflow16.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow25);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow31);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray39 = overflow35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow35.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow42);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray50 = overflow46.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow46.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow46);
        overflow28.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray54 = overflow28.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Underflow underflow61 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray62 = underflow61.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow61);
        underflow56.addSuppressed((java.lang.Throwable) underflow61);
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        underflow61.addSuppressed((java.lang.Throwable) underflow65);
        overflow28.addSuppressed((java.lang.Throwable) underflow65);
        stackAr9.push((java.lang.Object) overflow28);
        java.lang.Object obj69 = stackAr9.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "DataStructures.Overflow");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
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
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow51);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        DataStructures.StackAr stackAr59 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        stackAr59.push((java.lang.Object) overflow60);
        overflow50.addSuppressed((java.lang.Throwable) overflow60);
        overflow35.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Class<?> wildcardClass64 = overflow50.getClass();
        stackAr1.push((java.lang.Object) overflow50);
        boolean boolean66 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
        underflow13.addSuppressed((java.lang.Throwable) underflow22);
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
        overflow24.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow38);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = underflow41.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow41);
        DataStructures.StackAr stackAr46 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        stackAr46.push((java.lang.Object) overflow47);
        java.lang.Throwable[] throwableArray49 = overflow47.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow55);
        underflow50.addSuppressed((java.lang.Throwable) underflow55);
        DataStructures.Underflow underflow59 = new DataStructures.Underflow();
        underflow55.addSuppressed((java.lang.Throwable) underflow59);
        overflow47.addSuppressed((java.lang.Throwable) underflow55);
        overflow37.addSuppressed((java.lang.Throwable) overflow47);
        overflow24.addSuppressed((java.lang.Throwable) overflow37);
        underflow13.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        DataStructures.Underflow underflow66 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray67 = underflow66.getSuppressed();
        overflow65.addSuppressed((java.lang.Throwable) underflow66);
        java.lang.Throwable[] throwableArray69 = overflow65.getSuppressed();
        java.lang.Throwable[] throwableArray70 = overflow65.getSuppressed();
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Underflow underflow72 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray73 = underflow72.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) underflow72);
        overflow65.addSuppressed((java.lang.Throwable) overflow71);
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        DataStructures.Underflow underflow77 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray78 = underflow77.getSuppressed();
        overflow76.addSuppressed((java.lang.Throwable) underflow77);
        java.lang.Throwable[] throwableArray80 = overflow76.getSuppressed();
        java.lang.Throwable[] throwableArray81 = overflow76.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) overflow76);
        java.lang.Throwable[] throwableArray83 = overflow76.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) overflow76);
        overflow0.addSuppressed((java.lang.Throwable) overflow76);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray83);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-1.2d));
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Throwable[] throwableArray16 = underflow13.getSuppressed();
        java.lang.Throwable[] throwableArray17 = underflow13.getSuppressed();
        underflow9.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Class<?> wildcardClass19 = underflow9.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
        stackAr1.pop();
        boolean boolean32 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
        boolean boolean31 = stackAr1.isFull();
        DataStructures.StackAr stackAr33 = new DataStructures.StackAr((int) 'a');
        stackAr33.makeEmpty();
        java.lang.Object obj35 = stackAr33.top();
        stackAr33.makeEmpty();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        stackAr33.push((java.lang.Object) overflow37);
        java.lang.Object obj41 = stackAr33.topAndPop();
        boolean boolean42 = stackAr33.isEmpty();
        stackAr1.push((java.lang.Object) stackAr33);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "DataStructures.Overflow");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) underflow13);
        underflow8.addSuppressed((java.lang.Throwable) underflow13);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        underflow13.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow20);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        underflow17.addSuppressed((java.lang.Throwable) overflow19);
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
        overflow19.addSuppressed((java.lang.Throwable) overflow39);
        overflow5.addSuppressed((java.lang.Throwable) overflow39);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
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
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
        java.lang.Class<?> wildcardClass73 = stackAr1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = underflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        underflow11.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        underflow11.addSuppressed((java.lang.Throwable) underflow21);
        overflow0.addSuppressed((java.lang.Throwable) underflow11);
        java.lang.Class<?> wildcardClass33 = underflow11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.pop();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
        java.lang.Throwable[] throwableArray30 = overflow15.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 100 + "'", obj7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        stackAr1.pop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        stackAr9.makeEmpty();
        stackAr9.makeEmpty();
        java.lang.Object obj12 = stackAr9.top();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr((int) (short) 0);
        stackAr9.push((java.lang.Object) (short) 0);
        stackAr9.push((java.lang.Object) 2L);
        boolean boolean19 = stackAr9.isEmpty();
        java.lang.Object obj20 = stackAr9.topAndPop();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow26);
        underflow21.addSuppressed((java.lang.Throwable) underflow26);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow30.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow37);
        underflow31.addSuppressed((java.lang.Throwable) overflow34);
        underflow21.addSuppressed((java.lang.Throwable) underflow31);
        stackAr9.push((java.lang.Object) underflow21);
        java.lang.Class<?> wildcardClass43 = underflow21.getClass();
        stackAr1.push((java.lang.Object) underflow21);
        boolean boolean45 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 2L + "'", obj20, 2L);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow40);
        underflow34.addSuppressed((java.lang.Throwable) overflow37);
        overflow22.addSuppressed((java.lang.Throwable) underflow34);
        java.lang.Throwable[] throwableArray45 = underflow34.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow49);
        java.lang.Throwable[] throwableArray52 = overflow46.getSuppressed();
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
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) underflow67);
        java.lang.Throwable[] throwableArray70 = overflow66.getSuppressed();
        java.lang.Throwable[] throwableArray71 = overflow66.getSuppressed();
        underflow61.addSuppressed((java.lang.Throwable) overflow66);
        overflow46.addSuppressed((java.lang.Throwable) underflow61);
        underflow34.addSuppressed((java.lang.Throwable) overflow46);
        stackAr1.push((java.lang.Object) overflow46);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        stackAr1.push(obj4);
        stackAr1.pop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 3L);
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 3L + "'", obj8, 3L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr10.isFull();
        java.lang.Object obj14 = stackAr10.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
        java.lang.Object obj18 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
        java.lang.Throwable[] throwableArray24 = overflow1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray18 = overflow12.getSuppressed();
        underflow10.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray20 = overflow12.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow21.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow21);
        stackAr1.push((java.lang.Object) overflow12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
        stackAr1.pop();
        boolean boolean81 = stackAr1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
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
        stackAr1.makeEmpty();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
        stackAr1.pop();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow20);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        DataStructures.StackAr stackAr28 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        stackAr28.push((java.lang.Object) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow29.getSuppressed();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow37);
        underflow32.addSuppressed((java.lang.Throwable) underflow37);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        underflow37.addSuppressed((java.lang.Throwable) underflow41);
        overflow29.addSuppressed((java.lang.Throwable) underflow37);
        overflow19.addSuppressed((java.lang.Throwable) overflow29);
        stackAr1.push((java.lang.Object) overflow29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        stackAr1.push((java.lang.Object) overflow2);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
        java.lang.Throwable[] throwableArray56 = overflow52.getSuppressed();
        java.lang.Throwable[] throwableArray57 = overflow52.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Underflow underflow59 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray60 = underflow59.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow59);
        overflow52.addSuppressed((java.lang.Throwable) overflow58);
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow64);
        java.lang.Throwable[] throwableArray67 = overflow63.getSuppressed();
        java.lang.Throwable[] throwableArray68 = overflow63.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray70 = overflow63.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray72 = overflow63.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
        java.lang.Throwable[] throwableArray23 = underflow12.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow27);
        java.lang.Throwable[] throwableArray30 = overflow24.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow39);
        underflow34.addSuppressed((java.lang.Throwable) underflow39);
        overflow31.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow45);
        java.lang.Throwable[] throwableArray48 = overflow44.getSuppressed();
        java.lang.Throwable[] throwableArray49 = overflow44.getSuppressed();
        underflow39.addSuppressed((java.lang.Throwable) overflow44);
        overflow24.addSuppressed((java.lang.Throwable) underflow39);
        underflow12.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray53 = overflow24.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
        java.lang.Object obj14 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        stackAr5.push((java.lang.Object) throwableArray7);
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.top();
        boolean boolean11 = stackAr5.isEmpty();
        stackAr5.makeEmpty();
        stackAr5.makeEmpty();
        boolean boolean14 = stackAr5.isEmpty();
        java.lang.Class<?> wildcardClass15 = stackAr5.getClass();
        stackAr1.push((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(7);
        boolean boolean10 = stackAr9.isFull();
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
        stackAr9.push((java.lang.Object) overflow41);
        stackAr1.push((java.lang.Object) stackAr9);
        stackAr1.push((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
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
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow0.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow11);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = underflow24.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.StackAr stackAr29 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        stackAr29.push((java.lang.Object) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow38);
        underflow33.addSuppressed((java.lang.Throwable) underflow38);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        underflow38.addSuppressed((java.lang.Throwable) underflow42);
        overflow30.addSuppressed((java.lang.Throwable) underflow38);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow54);
        underflow49.addSuppressed((java.lang.Throwable) underflow54);
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
        overflow20.addSuppressed((java.lang.Throwable) underflow54);
        overflow14.addSuppressed((java.lang.Throwable) overflow20);
        overflow8.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray62 = overflow8.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray64 = overflow8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.push((java.lang.Object) 8.4d);
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr9.push((java.lang.Object) (byte) 100);
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean16 = stackAr1.isEmpty();
        boolean boolean17 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow6);
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow10.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow22);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow26);
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = underflow29.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow29);
        DataStructures.StackAr stackAr34 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        stackAr34.push((java.lang.Object) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow35.getSuppressed();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) underflow43);
        underflow38.addSuppressed((java.lang.Throwable) underflow43);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        underflow43.addSuppressed((java.lang.Throwable) underflow47);
        overflow35.addSuppressed((java.lang.Throwable) underflow43);
        overflow25.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Underflow underflow59 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray60 = underflow59.getSuppressed();
        overflow56.addSuppressed((java.lang.Throwable) underflow59);
        underflow54.addSuppressed((java.lang.Throwable) underflow59);
        overflow51.addSuppressed((java.lang.Throwable) underflow59);
        overflow25.addSuppressed((java.lang.Throwable) underflow59);
        overflow19.addSuppressed((java.lang.Throwable) overflow25);
        overflow13.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
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
        java.lang.Object obj32 = stackAr1.top();
        boolean boolean33 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass34 = stackAr1.getClass();
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
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
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
        boolean boolean80 = stackAr1.isFull();
        DataStructures.StackAr stackAr82 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj83 = stackAr82.topAndPop();
        java.lang.Object obj84 = stackAr82.top();
        stackAr1.push((java.lang.Object) stackAr82);
        boolean boolean86 = stackAr82.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
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
        boolean boolean19 = stackAr1.isFull();
        java.lang.Object obj20 = stackAr1.top();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        DataStructures.StackAr stackAr15 = new DataStructures.StackAr(6);
        stackAr15.push((java.lang.Object) 100.0f);
        stackAr15.makeEmpty();
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj21 = stackAr20.top();
        java.lang.Object obj22 = stackAr20.topAndPop();
        java.lang.Object obj23 = stackAr20.topAndPop();
        stackAr20.push((java.lang.Object) (byte) 100);
        boolean boolean26 = stackAr20.isEmpty();
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        stackAr20.push((java.lang.Object) underflow27);
        boolean boolean30 = stackAr20.isFull();
        stackAr15.push((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2L + "'", obj12, 2L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow11);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = underflow24.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow24);
        DataStructures.StackAr stackAr29 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        stackAr29.push((java.lang.Object) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow35.addSuppressed((java.lang.Throwable) underflow38);
        underflow33.addSuppressed((java.lang.Throwable) underflow38);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        underflow38.addSuppressed((java.lang.Throwable) underflow42);
        overflow30.addSuppressed((java.lang.Throwable) underflow38);
        overflow20.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) underflow54);
        underflow49.addSuppressed((java.lang.Throwable) underflow54);
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
        overflow20.addSuppressed((java.lang.Throwable) underflow54);
        overflow14.addSuppressed((java.lang.Throwable) overflow20);
        overflow8.addSuppressed((java.lang.Throwable) overflow14);
        overflow5.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow64);
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = underflow67.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow67);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        DataStructures.Underflow underflow75 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray76 = underflow75.getSuppressed();
        overflow72.addSuppressed((java.lang.Throwable) underflow75);
        java.lang.Throwable[] throwableArray78 = overflow72.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) overflow72);
        underflow67.addSuppressed((java.lang.Throwable) overflow71);
        overflow5.addSuppressed((java.lang.Throwable) overflow71);
        java.lang.Throwable[] throwableArray82 = overflow71.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray82);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        stackAr1.push((java.lang.Object) overflow5);
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) 5L);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 5L + "'", obj5, 5L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
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
        java.lang.Throwable[] throwableArray26 = overflow10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
        DataStructures.StackAr stackAr54 = new DataStructures.StackAr((int) (byte) 10);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        stackAr54.push((java.lang.Object) overflow55);
        java.lang.Throwable[] throwableArray57 = overflow55.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow55);
        java.lang.Class<?> wildcardClass59 = overflow55.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
        java.lang.Throwable[] throwableArray31 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow15.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow4);
        java.lang.Throwable[] throwableArray7 = overflow3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow3.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow10);
        overflow3.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        overflow3.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray16 = underflow14.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        boolean boolean11 = stackAr1.isFull();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow14);
        underflow9.addSuppressed((java.lang.Throwable) underflow14);
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        underflow9.addSuppressed((java.lang.Throwable) underflow18);
        underflow5.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.Throwable[] throwableArray21 = underflow5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray3);
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
        java.lang.Object obj20 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
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
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow22);
        underflow17.addSuppressed((java.lang.Throwable) underflow22);
        overflow14.addSuppressed((java.lang.Throwable) underflow22);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow28);
        java.lang.Throwable[] throwableArray31 = overflow27.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow27.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow42);
        underflow37.addSuppressed((java.lang.Throwable) underflow42);
        overflow34.addSuppressed((java.lang.Throwable) underflow42);
        overflow27.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        overflow50.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Underflow underflow53 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray54 = underflow53.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow53);
        underflow48.addSuppressed((java.lang.Throwable) underflow53);
        overflow27.addSuppressed((java.lang.Throwable) underflow48);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        DataStructures.Underflow underflow63 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray64 = underflow63.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) underflow63);
        underflow58.addSuppressed((java.lang.Throwable) underflow63);
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        DataStructures.Underflow underflow68 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray69 = underflow68.getSuppressed();
        overflow67.addSuppressed((java.lang.Throwable) underflow68);
        DataStructures.Overflow overflow71 = new DataStructures.Overflow();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        overflow71.addSuppressed((java.lang.Throwable) overflow72);
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray75 = underflow74.getSuppressed();
        overflow71.addSuppressed((java.lang.Throwable) underflow74);
        underflow68.addSuppressed((java.lang.Throwable) overflow71);
        underflow58.addSuppressed((java.lang.Throwable) underflow68);
        overflow27.addSuppressed((java.lang.Throwable) underflow68);
        overflow0.addSuppressed((java.lang.Throwable) overflow27);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0f));
        stackAr1.pop();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr10.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) 100.0f);
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
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
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.top();
        boolean boolean15 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
        java.lang.Throwable[] throwableArray45 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow10.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) underflow48);
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow47.getSuppressed();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) underflow54);
        overflow47.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Underflow underflow59 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray60 = underflow59.getSuppressed();
        overflow58.addSuppressed((java.lang.Throwable) underflow59);
        java.lang.Throwable[] throwableArray62 = overflow58.getSuppressed();
        java.lang.Throwable[] throwableArray63 = overflow58.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow58);
        overflow10.addSuppressed((java.lang.Throwable) overflow53);
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
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
    }
}

