package examples;
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
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(10);
        java.lang.Class<?> wildcardClass2 = strRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(9);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(3);
        int int2 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int15 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        int int14 = charSequenceRingBuffer1.dataCount();
        int int15 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 100);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }
}

