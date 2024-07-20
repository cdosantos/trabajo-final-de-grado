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
        int int2 = java.lang.Integer.min((-3), (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int1 = java.lang.Integer.signum(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int1 = java.lang.Integer.numberOfTrailingZeros(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int2 = java.lang.Integer.rotateLeft((-100), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1585) + "'", int2 == (-1585));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str1 = java.lang.Integer.toOctalString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "40" + "'", str1, "40");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = java.lang.Integer.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = java.lang.Integer.remainderUnsigned((-10), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("40", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int2 = java.lang.Integer.divideUnsigned(32, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = java.lang.Integer.toBinaryString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int1 = java.lang.Integer.highestOneBit(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-10), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967286" + "'", str2, "4294967286");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        long long1 = java.lang.Integer.toUnsignedLong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = java.lang.Integer.rotateRight((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = java.lang.Integer.MIN_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int2 = java.lang.Integer.sum((-1), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate11 = new examples.Polyupdate();
        examples.Polyupdate polyupdate15 = new examples.Polyupdate();
        polyupdate15._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        examples.Polyupdate polyupdate50 = new examples.Polyupdate();
        polyupdate50._var23 = (short) 1;
        polyupdate50._var23 = 1;
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate11, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList46, polyupdate47, ' ', "", polyupdate50, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList68, serializableArray67);
        serializableList68.trimToSize();
        java.lang.Object[] objArray71 = serializableList68.toArray();
        int int72 = serializableList2.indexOf((java.lang.Object) serializableList68);
        boolean boolean74 = serializableList2.contains((java.lang.Object) 3L);
        int int76 = serializableList2.indexOf((java.lang.Object) 4L);
        int int77 = serializableList2.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = serializableList0.addAll((-3), (java.util.Collection<java.io.Serializable>) serializableList2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int1 = java.lang.Integer.numberOfLeadingZeros(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Class<java.lang.Integer> intClass0 = java.lang.Integer.TYPE;
        org.junit.Assert.assertNotNull(intClass0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.Collection<java.io.Serializable> serializableCollection71 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = serializableList0.containsAll(serializableCollection71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator72 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.lang.CharSequence[] charSequenceArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray79 = serializableList0.toArray(charSequenceArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("4294967286");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967286\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = java.lang.Integer.toHexString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        boolean boolean69 = serializableList65.add((java.io.Serializable) (-3L));
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable72 = serializableList65.set(100, (java.io.Serializable) 7.1d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        long long1 = java.lang.Integer.toUnsignedLong((-9));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967287L + "'", long1 == 4294967287L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = java.lang.Integer.divideUnsigned((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable2 = serializableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int1 = java.lang.Integer.reverse((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str1 = java.lang.Integer.toOctalString((-100));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777634" + "'", str1, "37777777634");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Integer int1 = java.lang.Integer.getInteger("0");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int1 = java.lang.Integer.reverseBytes(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-129) + "'", int1 == (-129));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("37777777634");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777634\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable77 = serializableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        java.util.Iterator<java.io.Serializable> serializableItor69 = serializableList65.iterator();
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(serializableItor69);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int2 = java.lang.Integer.compareUnsigned((int) (byte) 0, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int2 = java.lang.Integer.sum((-2), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Integer int1 = java.lang.Integer.getInteger("2");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int1 = java.lang.Integer.lowestOneBit(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int2 = java.lang.Integer.min(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        boolean boolean69 = serializableList65.add((java.io.Serializable) (-3L));
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator70 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList65.replaceAll(serializableUnaryOperator70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int2 = java.lang.Integer.compareUnsigned((int) ' ', (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int2 = java.lang.Integer.remainderUnsigned(8, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int0 = java.lang.Integer.SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int2 = java.lang.Integer.compareUnsigned(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int1 = java.lang.Integer.highestOneBit(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Integer int1 = java.lang.Integer.getInteger("");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("0", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int1 = java.lang.Integer.reverseBytes(1342177280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        examples.Polyupdate polyupdate79 = new examples.Polyupdate();
        polyupdate79._var23 = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable82 = serializableList0.set((int) (short) 0, (java.io.Serializable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        examples.Polyupdate polyupdate75 = new examples.Polyupdate();
        polyupdate75._var23 = (short) 1;
        polyupdate75._var23 = 1;
        polyupdate75._var426 = (byte) -1;
        int int82 = serializableList0.indexOf((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int2 = java.lang.Integer.compareUnsigned(80, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Class<?> wildcardClass68 = serializableList65.getClass();
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = java.lang.Integer.reverseBytes((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int2 = java.lang.Integer.compare(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0._var426 = (byte) -1;
        polyupdate0._var426 = (-129);
        polyupdate0.clear();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int2 = java.lang.Integer.rotateRight((-8), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int2 = java.lang.Integer.max(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0._var23;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int0 = java.lang.Integer.BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int2 = java.lang.Integer.min(40, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        boolean boolean69 = serializableList65.add((java.io.Serializable) (-3L));
        // The following exception was thrown during execution in test generation
        try {
            serializableList65.add((-2), (java.io.Serializable) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable75 = serializableList73.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int2 = java.lang.Integer.compareUnsigned((-29), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable78 = serializableList0.set((-100), (java.io.Serializable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.replaceAll(serializableUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        java.lang.Class<?> wildcardClass84 = serializableList0.getClass();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int2 = java.lang.Integer.divideUnsigned(0, (-1585));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int int1 = java.lang.Integer.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int2 = java.lang.Integer.compareUnsigned(7, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4294967286", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = java.lang.Integer.toOctalString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        boolean boolean78 = serializableList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable81 = serializableList0.set((-2), (java.io.Serializable) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str1 = java.lang.Integer.toHexString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(80, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = java.lang.Integer.numberOfTrailingZeros(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int2 = java.lang.Integer.rotateRight(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList1.add((int) (byte) 0, (java.io.Serializable) 0);
        java.io.Serializable serializable82 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.add((-129), serializable82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -129, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("2", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor79 = serializableList1.iterator();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
        org.junit.Assert.assertNotNull(serializableItor79);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str1 = java.lang.Integer.toHexString(1342177280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "50000000" + "'", str1, "50000000");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList1.listIterator();
        java.lang.Class<?> wildcardClass79 = serializableList1.getClass();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.ArrayList<java.util.RandomAccess> randomAccessList0 = new java.util.ArrayList<java.util.RandomAccess>();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int1 = java.lang.Integer.signum(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int2 = java.lang.Integer.compare((-7), (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int2 = java.lang.Integer.min(100, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int1 = java.lang.Integer.reverse((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        long long1 = java.lang.Integer.toUnsignedLong(9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = java.lang.Integer.toOctalString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int1 = java.lang.Integer.highestOneBit(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable74 = serializableList0.remove((-29));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int1 = java.lang.Integer.parseInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int1 = java.lang.Integer.lowestOneBit(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int2 = java.lang.Integer.rotateRight(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int2 = java.lang.Integer.remainderUnsigned((-10), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483639 + "'", int2 == 2147483639);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int int2 = java.lang.Integer.remainderUnsigned(2147483647, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        int int78 = serializableList1.size();
        serializableList1.clear();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int int2 = java.lang.Integer.max((-4), 2147483639);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483639 + "'", int2 == 2147483639);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int int1 = java.lang.Integer.bitCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int int1 = java.lang.Integer.signum(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int int2 = java.lang.Integer.rotateLeft((int) (short) 1, (-1585));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.Collection<java.io.Serializable> serializableCollection73 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = serializableList0.removeAll(serializableCollection73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int1 = java.lang.Integer.reverse(127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33554432) + "'", int1 == (-33554432));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList1 = new java.util.ArrayList<java.util.Collection<java.io.Serializable>>(32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int int2 = java.lang.Integer.rotateLeft((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int2 = java.lang.Integer.compare(3, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int1 = java.lang.Integer.reverseBytes((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-67108865) + "'", int1 == (-67108865));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) 10, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1280 + "'", int2 == 1280);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int1 = java.lang.Integer.reverse((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int1 = java.lang.Integer.numberOfTrailingZeros(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("0", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = java.lang.Integer.toBinaryString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1001" + "'", str1, "1001");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("3", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0._var23;
        int int7 = polyupdate0._var426;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int1 = java.lang.Integer.parseInt("3");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        long long1 = java.lang.Integer.toUnsignedLong(100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1", 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1342177280 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int2 = java.lang.Integer.max((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.lang.Object[] objArray71 = serializableList66.toArray();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int1 = java.lang.Integer.lowestOneBit(80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int2 = java.lang.Integer.divideUnsigned((-3), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42949672 + "'", int2 == 42949672);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean75 = serializableList0.contains((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("4294967286");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967286\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int int1 = java.lang.Integer.numberOfLeadingZeros(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777634", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.ArrayList<java.util.List<java.io.Serializable>> serializableListList1 = new java.util.ArrayList<java.util.List<java.io.Serializable>>(512);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int1 = java.lang.Integer.lowestOneBit(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable80 = serializableList1.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str1 = java.lang.Integer.toOctalString((-5));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777773" + "'", str1, "37777777773");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int int2 = java.lang.Integer.remainderUnsigned(0, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean75 = serializableList0.add((java.io.Serializable) 0L);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16" + "'", str1, "16");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList1.add((int) (byte) 0, (java.io.Serializable) 0);
        int int81 = serializableList1.size();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("0", (-29));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -29 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.clear();
        polyupdate0._var23 = 10;
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        polyupdate0.a(0);
        polyupdate0.a((-2147483648));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int1 = java.lang.Integer.reverse(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        boolean boolean77 = serializableList0.contains((java.lang.Object) (-5.4d));
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str1 = java.lang.Integer.toOctalString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(6, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6" + "'", str2, "6");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int int1 = java.lang.Integer.bitCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int int2 = java.lang.Integer.compareUnsigned((-8), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int2 = java.lang.Integer.min(512, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int2 = java.lang.Integer.remainderUnsigned(16, 1280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean77 = serializableList0.add((java.io.Serializable) (-2L));
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList0.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable80 = serializableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(serializableItor78);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int1 = java.lang.Integer.parseUnsignedInt("40");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int1 = java.lang.Integer.reverse(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 52);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        int int74 = serializableList0.size();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = java.lang.Integer.divideUnsigned(127, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777773", 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1342177280 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int int1 = java.lang.Integer.reverseBytes(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8388608 + "'", int1 == 8388608);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int2 = java.lang.Integer.remainderUnsigned(26, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int int1 = java.lang.Integer.reverse((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str1 = java.lang.Integer.toHexString((-100));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ffffff9c" + "'", str1, "ffffff9c");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        long long1 = java.lang.Integer.toUnsignedLong((-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967293L + "'", long1 == 4294967293L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.ArrayList<java.util.RandomAccess[]> randomAccessArrayList0 = new java.util.ArrayList<java.util.RandomAccess[]>();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int int1 = java.lang.Integer.parseUnsignedInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        boolean boolean78 = serializableList0.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList0.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor80 = serializableList0.listIterator();
        serializableList0.clear();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertNotNull(serializableItor80);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int int1 = java.lang.Integer.parseUnsignedInt("4294967286");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int int2 = java.lang.Integer.remainderUnsigned((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int int1 = java.lang.Integer.reverse(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-402653184) + "'", int1 == (-402653184));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Integer int1 = java.lang.Integer.getInteger("37777777773");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int1 = java.lang.Integer.signum((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int int2 = java.lang.Integer.parseInt("0", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("80", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -4 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        serializableList65.ensureCapacity((-10));
        int int72 = serializableList65.lastIndexOf((java.lang.Object) (-9L));
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj74 = null;
        boolean boolean75 = serializableList73.contains(obj74);
        boolean boolean76 = serializableList65.containsAll((java.util.Collection<java.io.Serializable>) serializableList73);
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 23 + "'", int72 == 23);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str1 = java.lang.Integer.toHexString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.Iterator<java.io.Serializable> serializableItor76 = serializableList0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(serializableItor76);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int int2 = java.lang.Integer.compareUnsigned(100, (-129));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 32, 5, 5, 1, 1, 1, 10, 6, 2, (-6), 10, (-2), 9, (-1), 2147483647, (-1), 6, 6, 10, (-1585), (-2147483648), (-1585), 1, 1, (-2), 10, (-6), (-4), 0, 9 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList32, (int) (short) 1);
        polyupdate35.a(10);
        polyupdate35._var426 = 6;
        polyupdate35._var23 = 2;
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int int2 = java.lang.Integer.remainderUnsigned((-5), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("40", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (int) (short) -1);
        polyupdate24._var426 = 'a';
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate0.a(40);
        polyupdate0._var426 = 2147483647;
        polyupdate0.add3((-67108865), (int) ' ', 128, (-67108865));
        int int17 = polyupdate0._var23;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-67108865) + "'", int17 == (-67108865));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str1 = java.lang.Integer.toHexString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int int1 = java.lang.Integer.lowestOneBit(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        serializableList65.ensureCapacity((-10));
        int int72 = serializableList65.lastIndexOf((java.lang.Object) (-9L));
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable74 = serializableList65.get((-1585));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1585");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 23 + "'", int72 == 23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("37777777773");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777773\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int2 = java.lang.Integer.max((-402653184), 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-6), (-7));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967290" + "'", str2, "4294967290");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int1 = java.lang.Integer.parseUnsignedInt("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        long long1 = java.lang.Integer.toUnsignedLong(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int int2 = java.lang.Integer.compareUnsigned(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator73 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str1 = java.lang.Integer.toHexString((-9));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffff7" + "'", str1, "fffffff7");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String str1 = java.lang.Integer.toBinaryString(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100001" + "'", str1, "1100001");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        serializableList67.ensureCapacity((-10));
        boolean boolean73 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(serializableItor74);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int2 = java.lang.Integer.compareUnsigned(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("fffffff7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"fffffff7\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate0._var23 = (byte) 100;
        polyupdate0.a((int) (short) 10);
        int int12 = polyupdate0._var23;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 110 + "'", int12 == 110);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("ffffff9c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ffffff9c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int int2 = java.lang.Integer.compare(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate0.a(8);
        int int10 = polyupdate0._var426;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 108 + "'", int10 == 108);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (byte) 1, 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int1 = java.lang.Integer.highestOneBit((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("ffffff9c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ffffff9c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate11 = new examples.Polyupdate();
        examples.Polyupdate polyupdate15 = new examples.Polyupdate();
        polyupdate15._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        examples.Polyupdate polyupdate50 = new examples.Polyupdate();
        polyupdate50._var23 = (short) 1;
        polyupdate50._var23 = 1;
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate11, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList46, polyupdate47, ' ', "", polyupdate50, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList68, serializableArray67);
        serializableList68.trimToSize();
        java.lang.Object[] objArray71 = serializableList68.toArray();
        int int72 = serializableList2.indexOf((java.lang.Object) serializableList68);
        boolean boolean74 = serializableList2.contains((java.lang.Object) 3L);
        int int76 = serializableList2.indexOf((java.lang.Object) 4L);
        int int77 = serializableList2.size();
        int int78 = serializableList1.indexOf((java.lang.Object) int77);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable81 = serializableList1.set((-6), (java.io.Serializable) "a");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        serializableList65.ensureCapacity((-10));
        int int72 = serializableList65.lastIndexOf((java.lang.Object) (-9L));
        serializableList65.trimToSize();
        java.io.Serializable serializable75 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList65.add(16777216, serializable75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16777216, Size: 58");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 23 + "'", int72 == 23);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int int2 = java.lang.Integer.min((-129), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-129) + "'", int2 == (-129));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator76 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-29));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int int2 = java.lang.Integer.compareUnsigned(1073741824, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int1 = java.lang.Integer.lowestOneBit(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str1 = java.lang.Integer.toBinaryString(110);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1101110" + "'", str1, "1101110");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int int1 = java.lang.Integer.numberOfLeadingZeros(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        polyupdate26._var23 = 128;
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int int1 = java.lang.Integer.signum(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        boolean boolean78 = serializableList0.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList0.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor80 = serializableList0.listIterator();
        boolean boolean82 = serializableList0.add((java.io.Serializable) 1L);
        java.util.stream.Stream<java.io.Serializable> serializableStream83 = serializableList0.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertNotNull(serializableItor80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(serializableStream83);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Integer int1 = java.lang.Integer.getInteger("61");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        java.lang.Class<?> wildcardClass23 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int int2 = java.lang.Integer.rotateLeft(32768, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("0", 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1342177280 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int int1 = java.lang.Integer.numberOfLeadingZeros(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int2 = java.lang.Integer.remainderUnsigned(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        int int1 = java.lang.Integer.lowestOneBit(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int1 = java.lang.Integer.signum((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean76 = serializableList75.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        serializableList0.ensureCapacity((-7));
        java.util.Collection<java.io.Serializable> serializableCollection78 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = serializableList0.retainAll(serializableCollection78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList76);
        java.util.Iterator<java.io.Serializable> serializableItor78 = serializableList76.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = serializableList1.addAll(80, (java.util.Collection<java.io.Serializable>) serializableList76);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 80, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        serializableList67.ensureCapacity((-10));
        boolean boolean73 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList67);
        serializableList0.ensureCapacity(23);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int int1 = java.lang.Integer.reverse(8388608);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("37777777634");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777634\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int2 = java.lang.Integer.parseUnsignedInt("2", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        int int77 = serializableList0.lastIndexOf((java.lang.Object) (-100.0d));
        java.lang.Object[] objArray78 = serializableList0.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList0.listIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertNotNull(serializableItor79);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable76 = serializableList0.get(27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111101" + "'", str1, "11111111111111111111111111111101");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("ffffff9c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ffffff9c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("80", (-33554432));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -33554432 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0._var426;
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        int int8 = polyupdate0._var23;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int2 = java.lang.Integer.max(7, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int int2 = java.lang.Integer.rotateRight((-1460), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1824522242) + "'", int2 == (-1824522242));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int int1 = java.lang.Integer.highestOneBit(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor76 = serializableList1.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList19, (-3));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("11111111111111111111111111111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int1 = java.lang.Integer.parseUnsignedInt("1100001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100001 + "'", int1 == 1100001);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        serializableList0.trimToSize();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.clear();
        polyupdate0.add3((-29), 1342177280, 256, (int) (byte) 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int1 = java.lang.Integer.numberOfLeadingZeros(512);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        java.util.ArrayList<java.util.AbstractList<java.io.Serializable>> serializableListList69 = new java.util.ArrayList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean70 = serializableList65.remove((java.lang.Object) serializableListList69);
        serializableList65.ensureCapacity(0);
        examples.Polyupdate polyupdate74 = new examples.Polyupdate();
        polyupdate74._var23 = (short) 1;
        polyupdate74.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate74.a(8);
        polyupdate74._var23 = 512;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable86 = serializableList65.set(100, (java.io.Serializable) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 57");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int1 = java.lang.Integer.parseInt("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        int int1 = java.lang.Integer.signum(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int int1 = java.lang.Integer.signum(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("ffffff9c", 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 16777216 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        int int1 = java.lang.Integer.parseUnsignedInt("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1101110", 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 16777216 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        serializableList0.trimToSize();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int1 = java.lang.Integer.parseInt("40");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        serializableList65.ensureCapacity(80);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable71 = serializableList65.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.Iterator<java.io.Serializable> serializableItor76 = serializableList3.iterator();
        java.util.ArrayList<java.io.Serializable> serializableList78 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList79 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList78);
        java.util.Iterator<java.io.Serializable> serializableItor80 = serializableList78.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor81 = serializableList78.iterator();
        java.util.ListIterator<java.io.Serializable> serializableItor82 = serializableList78.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable83 = serializableList3.set(28, (java.io.Serializable) serializableList78);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(serializableItor76);
        org.junit.Assert.assertNotNull(serializableItor80);
        org.junit.Assert.assertNotNull(serializableItor81);
        org.junit.Assert.assertNotNull(serializableItor82);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        polyupdate0.clear();
        polyupdate0._var426 = 0;
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        java.lang.Object[] objArray69 = serializableList65.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList65.listIterator(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 128");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList0.listIterator();
        serializableList0.clear();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        serializableList67.ensureCapacity((-10));
        boolean boolean73 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList67);
        java.util.stream.Stream<java.io.Serializable> serializableStream74 = serializableList67.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(serializableStream74);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList4 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        examples.Polyupdate polyupdate17 = new examples.Polyupdate();
        polyupdate17._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        examples.Polyupdate polyupdate52 = new examples.Polyupdate();
        polyupdate52._var23 = (short) 1;
        polyupdate52._var23 = 1;
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate13, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList48, polyupdate49, ' ', "", polyupdate52, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList70 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList70, serializableArray69);
        serializableList70.trimToSize();
        java.lang.Object[] objArray73 = serializableList70.toArray();
        int int74 = serializableList4.indexOf((java.lang.Object) serializableList70);
        boolean boolean76 = serializableList4.contains((java.lang.Object) 3L);
        int int78 = serializableList4.indexOf((java.lang.Object) 4L);
        int int79 = serializableList4.size();
        boolean boolean80 = serializableList3.addAll((java.util.Collection<java.io.Serializable>) serializableList4);
        boolean boolean81 = serializableList3.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor82 = serializableList3.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor83 = serializableList3.listIterator();
        boolean boolean85 = serializableList3.add((java.io.Serializable) 1L);
        serializableList3.add((int) (byte) 0, (java.io.Serializable) 1L);
        boolean boolean89 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList3);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator90 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor82);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int1 = java.lang.Integer.bitCount(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("11111111111111111111111111111101", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int int1 = java.lang.Integer.highestOneBit(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("37777777773", 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 110 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        long long1 = java.lang.Integer.toUnsignedLong(2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream72 = serializableList0.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableStream72);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("0", 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 40 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777634", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 37777777634 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int2 = java.lang.Integer.compare((-100), 50000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("4294967290");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967290\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0._var426;
        int int6 = polyupdate0.sm();
        polyupdate0.a((int) (short) -1);
        int int9 = polyupdate0._var426;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0._var426;
        int int6 = polyupdate0.sm();
        polyupdate0.a((int) (short) -1);
        int int9 = polyupdate0._var23;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int int2 = java.lang.Integer.compareUnsigned(80, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int2 = java.lang.Integer.rotateLeft(0, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList19, (-1824522242));
        int int29 = polyupdate28._var23;
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1824522242) + "'", int29 == (-1824522242));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        boolean boolean77 = serializableList0.contains((java.lang.Object) (-5.4d));
        int int78 = serializableList0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor80 = serializableList0.listIterator(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int int2 = java.lang.Integer.rotateLeft((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        java.util.Iterator<java.io.Serializable> serializableItor84 = serializableList0.iterator();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(serializableItor84);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        int int77 = serializableList0.lastIndexOf((java.lang.Object) (-7.3d));
        int int79 = serializableList0.lastIndexOf((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int int2 = java.lang.Integer.min((-1), (-33554432));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33554432) + "'", int2 == (-33554432));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList1 = new java.util.ArrayList<java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean77 = serializableList0.add((java.io.Serializable) (-2L));
        boolean boolean79 = serializableList0.add((java.io.Serializable) (-1.0f));
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        int int1 = java.lang.Integer.numberOfLeadingZeros(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int int1 = java.lang.Integer.parseInt("6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        int int1 = java.lang.Integer.numberOfTrailingZeros(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4294967286", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int int2 = java.lang.Integer.min(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int int2 = java.lang.Integer.compare(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int int2 = java.lang.Integer.compare(16, 50000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate0._var23 = (byte) 100;
        polyupdate0._var426 = 110;
        polyupdate0.clear();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int int2 = java.lang.Integer.compare((-1460), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int int2 = java.lang.Integer.min(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int int1 = java.lang.Integer.signum((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable72 = serializableList0.get(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 40, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 52);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        java.lang.Object[] objArray74 = serializableList0.toArray();
        boolean boolean75 = serializableList0.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int int1 = java.lang.Integer.bitCount(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList76);
        boolean boolean78 = serializableList3.addAll((java.util.Collection<java.io.Serializable>) serializableList77);
        examples.Polyupdate polyupdate80 = new examples.Polyupdate();
        polyupdate80._var23 = (short) 1;
        polyupdate80._var426 = (-1);
        int int85 = polyupdate80._var426;
        polyupdate80._var426 = ' ';
        int int88 = polyupdate80._var426;
        // The following exception was thrown during execution in test generation
        try {
            serializableList77.add(4, (java.io.Serializable) int88);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 32 + "'", int88 == 32);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.lang.Class<?> wildcardClass71 = serializableList0.getClass();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        int int2 = java.lang.Integer.min(100, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        int int1 = java.lang.Integer.bitCount((-33554432));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0._var426 = (byte) -1;
        polyupdate0._var426 = (-129);
        int int9 = polyupdate0._var426;
        polyupdate0._var426 = (-402653184);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-129) + "'", int9 == (-129));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        int int2 = java.lang.Integer.sum((-1), 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        int int2 = java.lang.Integer.rotateLeft(110, (-67108865));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int int2 = java.lang.Integer.rotateLeft(8, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int int2 = java.lang.Integer.min((-2147483648), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        boolean boolean69 = serializableList65.add((java.io.Serializable) (-3L));
        boolean boolean70 = serializableList65.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int2 = java.lang.Integer.compareUnsigned((-7), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int int2 = java.lang.Integer.max(8, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int int1 = java.lang.Integer.signum(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList19, 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor75 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(serializableItor75);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("ffffff9c", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ffffff9c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int int2 = java.lang.Integer.max(110, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        boolean boolean77 = serializableList0.add((java.io.Serializable) (-2L));
        java.util.stream.Stream<java.io.Serializable> serializableStream78 = serializableList0.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(serializableStream78);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = java.lang.Integer.rotateRight((-2), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        int int76 = serializableList75.size();
        java.lang.String[] strArray78 = new java.lang.String[] { "6" };
        java.lang.String[] strArray79 = serializableList75.toArray(strArray78);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int int2 = java.lang.Integer.sum((-100), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-96) + "'", int2 == (-96));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967295" + "'", str1, "4294967295");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var426 = (-1);
        int int5 = polyupdate0._var426;
        int int6 = polyupdate0.sm();
        polyupdate0.a((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int int2 = java.lang.Integer.parseInt("1101110", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 591309 + "'", int2 == 591309);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList76);
        boolean boolean78 = serializableList3.addAll((java.util.Collection<java.io.Serializable>) serializableList77);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable80 = serializableList3.get((-1460));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int2 = java.lang.Integer.divideUnsigned((-2147483648), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 238609294 + "'", int2 == 238609294);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int int2 = java.lang.Integer.min(25, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int int2 = java.lang.Integer.rotateLeft((-4), 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-196609) + "'", int2 == (-196609));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4294967290");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967290\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        int int23 = polyupdate22.sm();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-556) + "'", int23 == (-556));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-8));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111000" + "'", str1, "11111111111111111111111111111000");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        int int1 = java.lang.Integer.bitCount(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int int1 = java.lang.Integer.reverseBytes(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate11 = new examples.Polyupdate();
        examples.Polyupdate polyupdate15 = new examples.Polyupdate();
        polyupdate15._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        examples.Polyupdate polyupdate50 = new examples.Polyupdate();
        polyupdate50._var23 = (short) 1;
        polyupdate50._var23 = 1;
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate11, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList46, polyupdate47, ' ', "", polyupdate50, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList68, serializableArray67);
        serializableList68.trimToSize();
        java.lang.Object[] objArray71 = serializableList68.toArray();
        int int72 = serializableList2.indexOf((java.lang.Object) serializableList68);
        boolean boolean74 = serializableList2.contains((java.lang.Object) 3L);
        int int76 = serializableList2.indexOf((java.lang.Object) 4L);
        int int77 = serializableList2.size();
        int int78 = serializableList1.indexOf((java.lang.Object) int77);
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor81 = serializableList1.listIterator(127);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 127");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(serializableItor79);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(8388608, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean1 = serializableList0.isEmpty();
        serializableList0.trimToSize();
        java.lang.Object[] objArray3 = serializableList0.toArray();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        int int74 = serializableList73.size();
        java.lang.Object[] objArray75 = serializableList73.toArray();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int int1 = java.lang.Integer.highestOneBit(2147483639);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        int int2 = java.lang.Integer.compare(4, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.ArrayList<java.lang.String[]> strArrayList0 = new java.util.ArrayList<java.lang.String[]>();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int int2 = java.lang.Integer.sum(6, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("37777777634");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777634\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate11 = new examples.Polyupdate();
        examples.Polyupdate polyupdate15 = new examples.Polyupdate();
        polyupdate15._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        examples.Polyupdate polyupdate50 = new examples.Polyupdate();
        polyupdate50._var23 = (short) 1;
        polyupdate50._var23 = 1;
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate11, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList46, polyupdate47, ' ', "", polyupdate50, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList68, serializableArray67);
        serializableList68.trimToSize();
        java.lang.Object[] objArray71 = serializableList68.toArray();
        int int72 = serializableList2.indexOf((java.lang.Object) serializableList68);
        boolean boolean74 = serializableList2.contains((java.lang.Object) 3L);
        int int76 = serializableList2.indexOf((java.lang.Object) 4L);
        int int77 = serializableList2.size();
        int int78 = serializableList1.indexOf((java.lang.Object) int77);
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList1.listIterator();
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList81 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList80);
        java.util.Iterator<java.io.Serializable> serializableItor82 = serializableList80.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor83 = serializableList80.iterator();
        java.util.ListIterator<java.io.Serializable> serializableItor84 = serializableList80.listIterator();
        boolean boolean85 = serializableList1.contains((java.lang.Object) serializableItor84);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertNotNull(serializableItor82);
        org.junit.Assert.assertNotNull(serializableItor83);
        org.junit.Assert.assertNotNull(serializableItor84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        examples.Polyupdate polyupdate84 = new examples.Polyupdate();
        polyupdate84._var23 = (short) 1;
        polyupdate84._var23 = 1;
        polyupdate84.a((-1));
        int int91 = polyupdate84._var23;
        boolean boolean92 = serializableList0.remove((java.lang.Object) int91);
        serializableList0.trimToSize();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        long long1 = java.lang.Integer.toUnsignedLong(52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        int int77 = serializableList0.lastIndexOf((java.lang.Object) (-7.3d));
        serializableList0.clear();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        examples.Polyupdate polyupdate84 = new examples.Polyupdate();
        polyupdate84._var23 = (short) 1;
        polyupdate84._var23 = 1;
        polyupdate84.a((-1));
        int int91 = polyupdate84._var23;
        boolean boolean92 = serializableList0.remove((java.lang.Object) int91);
        java.util.ListIterator<java.io.Serializable> serializableItor93 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(serializableItor93);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        long long1 = java.lang.Integer.toUnsignedLong(2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        int int2 = java.lang.Integer.min((int) (short) -1, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList76);
        boolean boolean78 = serializableList3.addAll((java.util.Collection<java.io.Serializable>) serializableList77);
        serializableList3.clear();
        java.lang.Object[] objArray80 = serializableList3.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor76 = serializableList1.listIterator((-96));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -96");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("80", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        int int2 = java.lang.Integer.compareUnsigned(6, (-402653184));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int int2 = java.lang.Integer.rotateLeft(80, 50000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, 8388608);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList19, (int) (byte) 1);
        examples.Polyupdate polyupdate30 = new examples.Polyupdate(intList19, (-556));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str1 = java.lang.Integer.toOctalString(110);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "156" + "'", str1, "156");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int int1 = java.lang.Integer.highestOneBit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.Integer int1 = java.lang.Integer.getInteger("11111111111111111111111111111101");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("37777777773");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777773\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        boolean boolean4 = serializableList0.contains((java.lang.Object) 5);
        boolean boolean6 = serializableList0.add((java.io.Serializable) (-100L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        int int10 = polyupdate0._var426;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1582) + "'", int10 == (-1582));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList0.clear();
        boolean boolean77 = serializableList0.contains((java.lang.Object) 3L);
        serializableList0.ensureCapacity(108);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int int2 = java.lang.Integer.compareUnsigned(127, 1280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable72 = serializableList0.remove((-196609));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(238609294);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int int1 = java.lang.Integer.reverse((-29));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-939524097) + "'", int1 == (-939524097));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, (-1585), 0, (-2), (-3), 9, 32, (-7), (-4), 1, (-4), 32, (-29) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList15, 2);
        java.util.RandomAccess[] randomAccessArray19 = new java.util.RandomAccess[] { intList15 };
        java.util.RandomAccess[] randomAccessArray20 = serializableList0.toArray(randomAccessArray19);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray22 = serializableList0.toArray(annotatedElementArray21);
        java.util.ArrayList<java.io.Serializable> serializableList24 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate33 = new examples.Polyupdate();
        examples.Polyupdate polyupdate37 = new examples.Polyupdate();
        polyupdate37._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate69 = new examples.Polyupdate();
        examples.Polyupdate polyupdate72 = new examples.Polyupdate();
        polyupdate72._var23 = (short) 1;
        polyupdate72._var23 = 1;
        java.io.Serializable[] serializableArray89 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate33, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList68, polyupdate69, ' ', "", polyupdate72, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList90 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList90, serializableArray89);
        serializableList90.trimToSize();
        java.lang.Object[] objArray93 = serializableList90.toArray();
        int int94 = serializableList24.indexOf((java.lang.Object) serializableList90);
        boolean boolean96 = serializableList24.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList97 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList24);
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.add(29, (java.io.Serializable) serializableList97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 29, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(randomAccessArray19);
        org.junit.Assert.assertNotNull(randomAccessArray20);
        org.junit.Assert.assertNotNull(annotatedElementArray21);
        org.junit.Assert.assertNotNull(annotatedElementArray22);
        org.junit.Assert.assertNotNull(serializableArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        boolean boolean74 = serializableList0.remove((java.lang.Object) 4294967293L);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator75 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        examples.Polyupdate polyupdate8 = new examples.Polyupdate();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        polyupdate12._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate44 = new examples.Polyupdate();
        examples.Polyupdate polyupdate47 = new examples.Polyupdate();
        polyupdate47._var23 = (short) 1;
        polyupdate47._var23 = 1;
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate8, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList43, polyupdate44, ' ', "", polyupdate47, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        serializableList65.trimToSize();
        java.lang.Object[] objArray68 = serializableList65.toArray();
        serializableList65.ensureCapacity((-10));
        int int72 = serializableList65.lastIndexOf((java.lang.Object) (-9L));
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList65.iterator();
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 23 + "'", int72 == 23);
        org.junit.Assert.assertNotNull(serializableItor73);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4294967286");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) 'a', 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        int int2 = java.lang.Integer.compareUnsigned((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int int2 = java.lang.Integer.compareUnsigned(32768, 238609294);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, (-1585), 0, (-2), (-3), 9, 32, (-7), (-4), 1, (-4), 32, (-29) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList15, 2);
        java.util.RandomAccess[] randomAccessArray19 = new java.util.RandomAccess[] { intList15 };
        java.util.RandomAccess[] randomAccessArray20 = serializableList0.toArray(randomAccessArray19);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray22 = serializableList0.toArray(annotatedElementArray21);
        java.util.ListIterator<java.io.Serializable> serializableItor23 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(randomAccessArray19);
        org.junit.Assert.assertNotNull(randomAccessArray20);
        org.junit.Assert.assertNotNull(annotatedElementArray21);
        org.junit.Assert.assertNotNull(annotatedElementArray22);
        org.junit.Assert.assertNotNull(serializableItor23);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 32, 5, 5, 1, 1, 1, 10, 6, 2, (-6), 10, (-2), 9, (-1), 2147483647, (-1), 6, 6, 10, (-1585), (-2147483648), (-1585), 1, 1, (-2), 10, (-6), (-4), 0, 9 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList32, (int) (short) 1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList32, 5);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("fffffff7", (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -100 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean1 = serializableList0.isEmpty();
        serializableList0.trimToSize();
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        boolean boolean75 = serializableList3.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList3);
        boolean boolean77 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.lang.Object obj1 = null;
        boolean boolean2 = serializableList0.contains(obj1);
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate12 = new examples.Polyupdate();
        examples.Polyupdate polyupdate16 = new examples.Polyupdate();
        polyupdate16._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        examples.Polyupdate polyupdate51 = new examples.Polyupdate();
        polyupdate51._var23 = (short) 1;
        polyupdate51._var23 = 1;
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate12, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList47, polyupdate48, ' ', "", polyupdate51, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        serializableList69.trimToSize();
        java.lang.Object[] objArray72 = serializableList69.toArray();
        int int73 = serializableList3.indexOf((java.lang.Object) serializableList69);
        java.util.ListIterator<java.io.Serializable> serializableItor74 = serializableList3.listIterator();
        int int75 = serializableList0.indexOf((java.lang.Object) serializableList3);
        java.util.ArrayList<java.io.Serializable> serializableList76 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList76);
        boolean boolean78 = serializableList3.addAll((java.util.Collection<java.io.Serializable>) serializableList77);
        java.util.Collection<java.io.Serializable> serializableCollection79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = serializableList3.addAll(serializableCollection79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        int int2 = java.lang.Integer.rotateLeft(100, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 32, 5, 5, 1, 1, 1, 10, 6, 2, (-6), 10, (-2), 9, (-1), 2147483647, (-1), 6, 6, 10, (-1585), (-2147483648), (-1585), 1, 1, (-2), 10, (-6), (-4), 0, 9 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList32, (int) (short) 1);
        polyupdate35.a((int) (short) 1);
        polyupdate35.clear();
        int int39 = polyupdate35._var426;
        int int40 = polyupdate35._var426;
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        int int3 = polyupdate0._var426;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        int int2 = java.lang.Integer.rotateLeft(108, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 100, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.Iterator<java.io.Serializable> serializableItor1 = serializableList0.iterator();
        int int2 = serializableList0.size();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, (-1585), 0, (-2), (-3), 9, 32, (-7), (-4), 1, (-4), 32, (-29) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList17, 2);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList17, 0);
        int int23 = polyupdate22.sm();
        boolean boolean24 = serializableList0.remove((java.lang.Object) polyupdate22);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1460) + "'", int23 == (-1460));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int int1 = java.lang.Integer.reverse(256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8388608 + "'", int1 == 8388608);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        int int23 = polyupdate22._var23;
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        serializableList0.trimToSize();
        boolean boolean73 = serializableList0.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        serializableList0.trimToSize();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        serializableList1.ensureCapacity((-10));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        int int1 = java.lang.Integer.parseInt("16");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int int2 = java.lang.Integer.compareUnsigned(100, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (-33554432));
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList19, 127);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList19, (-1824522242));
        polyupdate28.a(40);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        java.util.Iterator<java.io.Serializable> serializableItor2 = serializableList0.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor3 = serializableList0.iterator();
        java.util.ArrayList<java.io.Serializable> serializableList4 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        examples.Polyupdate polyupdate17 = new examples.Polyupdate();
        polyupdate17._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        examples.Polyupdate polyupdate52 = new examples.Polyupdate();
        polyupdate52._var23 = (short) 1;
        polyupdate52._var23 = 1;
        java.io.Serializable[] serializableArray69 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate13, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList48, polyupdate49, ' ', "", polyupdate52, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList70 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList70, serializableArray69);
        serializableList70.trimToSize();
        java.lang.Object[] objArray73 = serializableList70.toArray();
        int int74 = serializableList4.indexOf((java.lang.Object) serializableList70);
        boolean boolean76 = serializableList4.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList77 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList4);
        int int78 = serializableList77.size();
        boolean boolean79 = serializableList0.remove((java.lang.Object) int78);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        java.util.ListIterator<java.io.Serializable> serializableItor72 = serializableList1.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor73 = serializableList1.iterator();
        boolean boolean74 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        serializableList0.clear();
        boolean boolean77 = serializableList0.add((java.io.Serializable) 100L);
        boolean boolean78 = serializableList0.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertNotNull(serializableItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableItor79);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777634", 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 37777777634 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int2 = java.lang.Integer.min((int) (short) 10, 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4294967290", (-129));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -129 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        int int2 = java.lang.Integer.rotateRight(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        int int2 = java.lang.Integer.rotateLeft(28, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741823) + "'", int2 == (-1073741823));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1582));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111100111010010" + "'", str1, "11111111111111111111100111010010");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int int1 = java.lang.Integer.reverseBytes(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 469762048 + "'", int1 == 469762048);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        int int1 = java.lang.Integer.reverseBytes(1100001);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-506982400) + "'", int1 == (-506982400));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int int2 = java.lang.Integer.compare(55, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        int int76 = serializableList75.size();
        int int77 = serializableList75.size();
        serializableList75.trimToSize();
        java.util.stream.Stream<java.io.Serializable> serializableStream79 = serializableList75.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(serializableStream79);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        int int1 = java.lang.Integer.reverse(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335544320 + "'", int1 == 335544320);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        int int2 = java.lang.Integer.compareUnsigned((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        int int2 = java.lang.Integer.rotateRight((int) (short) 100, (-1582));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1638400 + "'", int2 == 1638400);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.Iterator<java.io.Serializable> serializableItor1 = serializableList0.iterator();
        java.util.ListIterator<java.io.Serializable> serializableItor2 = serializableList0.listIterator();
        java.util.ArrayList<java.io.Serializable> serializableList3 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList4 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList3);
        java.util.Iterator<java.io.Serializable> serializableItor5 = serializableList3.iterator();
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableList3.iterator();
        java.util.ListIterator<java.io.Serializable> serializableItor7 = serializableList3.listIterator();
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList9 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate18 = new examples.Polyupdate();
        examples.Polyupdate polyupdate22 = new examples.Polyupdate();
        polyupdate22._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList53 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate54 = new examples.Polyupdate();
        examples.Polyupdate polyupdate57 = new examples.Polyupdate();
        polyupdate57._var23 = (short) 1;
        polyupdate57._var23 = 1;
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate18, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList53, polyupdate54, ' ', "", polyupdate57, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList75, serializableArray74);
        serializableList75.trimToSize();
        java.lang.Object[] objArray78 = serializableList75.toArray();
        int int79 = serializableList9.indexOf((java.lang.Object) serializableList75);
        boolean boolean80 = serializableList8.addAll((java.util.Collection<java.io.Serializable>) serializableList75);
        serializableList8.clear();
        java.util.ListIterator<java.io.Serializable> serializableItor82 = serializableList8.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream83 = serializableList8.parallelStream();
        boolean boolean84 = serializableList3.retainAll((java.util.Collection<java.io.Serializable>) serializableList8);
        boolean boolean85 = serializableList0.removeAll((java.util.Collection<java.io.Serializable>) serializableList3);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableItor82);
        org.junit.Assert.assertNotNull(serializableStream83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        polyupdate0._var426 = 4;
        int int12 = polyupdate0._var23;
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        int int74 = serializableList0.indexOf((java.lang.Object) 4L);
        int int75 = serializableList0.size();
        examples.Polyupdate polyupdate76 = new examples.Polyupdate();
        polyupdate76._var23 = (short) 1;
        polyupdate76._var23 = 1;
        polyupdate76._var426 = (byte) -1;
        boolean boolean83 = serializableList0.remove((java.lang.Object) polyupdate76);
        serializableList0.ensureCapacity(9);
        boolean boolean86 = serializableList0.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream87 = serializableList0.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(serializableStream87);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean1 = serializableList0.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableList0.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(serializableStream2);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int2 = java.lang.Integer.max((int) 'a', 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int int1 = java.lang.Integer.parseUnsignedInt("1101110");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1101110 + "'", int1 == 1101110);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        serializableList0.trimToSize();
        boolean boolean78 = serializableList0.remove((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        long long1 = java.lang.Integer.toUnsignedLong(1342177280);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1342177280L + "'", long1 == 1342177280L);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int int1 = java.lang.Integer.reverse((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-96), 50000000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967200" + "'", str2, "4294967200");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.add3((-1585), 1, 2, (-4));
        polyupdate0.a(0);
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        int int2 = java.lang.Integer.max(0, 2147483639);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483639 + "'", int2 == 2147483639);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        int int2 = java.lang.Integer.sum(127, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable72 = serializableList66.remove((-33554432));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.ListIterator<java.io.Serializable> serializableItor78 = serializableList1.listIterator();
        serializableList1.trimToSize();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(serializableItor78);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        int int1 = java.lang.Integer.signum(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ArrayList<java.io.Serializable> serializableList71 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList72 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList71);
        boolean boolean73 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList71);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable75 = serializableList0.get(335544320);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 335544320, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0._var23 = (short) 1;
        polyupdate0._var23 = 1;
        polyupdate0.a((-1));
        int int7 = polyupdate0.sm();
        polyupdate0.a((-5));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.stream.Stream<java.io.Serializable> serializableStream71 = serializableList0.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableStream71);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int int1 = java.lang.Integer.signum(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        int int1 = java.lang.Integer.highestOneBit((-1582));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int int2 = java.lang.Integer.rotateRight(6, 1073741824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        int int1 = java.lang.Integer.parseUnsignedInt("6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 97, (-2), 52, 97, 10, (-7), (-29), (-10), 100, 512, (-1585), (-5), 0, 100, 100, 7, (-9), 6 };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList19, 10);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList19, (int) (short) -1);
        polyupdate24._var426 = 256;
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int int1 = java.lang.Integer.reverseBytes((-1582));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-755367937) + "'", int1 == (-755367937));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int int1 = java.lang.Integer.reverse((-1073741823));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483645) + "'", int1 == (-2147483645));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        boolean boolean72 = serializableList0.contains((java.lang.Object) 3L);
        java.util.ArrayList<java.io.Serializable> serializableList73 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        examples.Polyupdate polyupdate74 = new examples.Polyupdate();
        polyupdate74._var23 = (short) 1;
        polyupdate74.add3((int) (short) 100, (int) (byte) 0, 0, 6);
        polyupdate74.a(40);
        polyupdate74._var426 = 2147483647;
        int int86 = serializableList0.indexOf((java.lang.Object) 2147483647);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        boolean boolean78 = serializableList0.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor79 = serializableList0.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor80 = serializableList0.listIterator();
        boolean boolean82 = serializableList0.add((java.io.Serializable) 1L);
        serializableList0.add((int) (byte) 0, (java.io.Serializable) 1L);
        java.util.ListIterator<java.io.Serializable> serializableItor86 = serializableList0.listIterator();
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertNotNull(serializableItor80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(serializableItor86);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int int2 = java.lang.Integer.divideUnsigned(591309, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable73 = serializableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate9 = new examples.Polyupdate();
        examples.Polyupdate polyupdate13 = new examples.Polyupdate();
        polyupdate13._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate45 = new examples.Polyupdate();
        examples.Polyupdate polyupdate48 = new examples.Polyupdate();
        polyupdate48._var23 = (short) 1;
        polyupdate48._var23 = 1;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate9, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList44, polyupdate45, ' ', "", polyupdate48, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList66 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList66, serializableArray65);
        serializableList66.trimToSize();
        java.lang.Object[] objArray69 = serializableList66.toArray();
        int int70 = serializableList0.indexOf((java.lang.Object) serializableList66);
        java.util.ListIterator<java.io.Serializable> serializableItor71 = serializableList0.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor72 = serializableList0.iterator();
        int int74 = serializableList0.lastIndexOf((java.lang.Object) (-2.1d));
        java.util.ArrayList<java.io.Serializable> serializableList75 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        int int76 = serializableList75.size();
        int int77 = serializableList75.size();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable79 = serializableList75.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableItor71);
        org.junit.Assert.assertNotNull(serializableItor72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "141" + "'", str1, "141");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 2, 32, 5, 5, 1, 1, 1, 10, 6, 2, (-6), 10, (-2), 9, (-1), 2147483647, (-1), 6, 6, 10, (-1585), (-2147483648), (-1585), 1, 1, (-2), 10, (-6), (-4), 0, 9 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList32, (int) (short) 1);
        polyupdate35.a((int) (short) 1);
        polyupdate35.clear();
        int int39 = polyupdate35._var426;
        polyupdate35.add3(26, 10, 4, 80);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.util.ArrayList<java.io.Serializable> serializableList0 = new java.util.ArrayList<java.io.Serializable>();
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate10 = new examples.Polyupdate();
        examples.Polyupdate polyupdate14 = new examples.Polyupdate();
        polyupdate14._var23 = (short) 1;
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>();
        examples.Polyupdate polyupdate46 = new examples.Polyupdate();
        examples.Polyupdate polyupdate49 = new examples.Polyupdate();
        polyupdate49._var23 = (short) 1;
        polyupdate49._var23 = 1;
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 32, ' ', (-3.8d), (-6.9d), (byte) -1, 6L, 2.7d, (byte) -1, polyupdate10, (-4.6d), 0.0d, ' ', (short) 1, 1, ' ', "0", "1", (-1), (-2.1d), 10.5d, (-100.0d), 'a', 7L, (-9L), 0L, (-3.8d), 32, (-1L), (byte) 0, 2147483647, (short) -1, 1.0d, 100L, 4.8d, 0.0d, (-3L), (-1L), "", 5.3d, (-2L), 10L, serializableList45, polyupdate46, ' ', "", polyupdate49, (-3), 2.7d, 100, 7.1d, (-9.3d), (-1L), (-9), (byte) 1, 7.1d, (-8.7d), 0, 6 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        serializableList67.trimToSize();
        java.lang.Object[] objArray70 = serializableList67.toArray();
        int int71 = serializableList1.indexOf((java.lang.Object) serializableList67);
        boolean boolean73 = serializableList1.contains((java.lang.Object) 3L);
        int int75 = serializableList1.indexOf((java.lang.Object) 4L);
        int int76 = serializableList1.size();
        boolean boolean77 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList1);
        boolean boolean78 = serializableList0.isEmpty();
        serializableList0.clear();
        examples.Polyupdate polyupdate80 = new examples.Polyupdate();
        polyupdate80._var23 = (short) 1;
        polyupdate80._var426 = (-1);
        int int85 = polyupdate80._var426;
        int int86 = polyupdate80.sm();
        polyupdate80.clear();
        int int88 = serializableList0.lastIndexOf((java.lang.Object) polyupdate80);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }
}

