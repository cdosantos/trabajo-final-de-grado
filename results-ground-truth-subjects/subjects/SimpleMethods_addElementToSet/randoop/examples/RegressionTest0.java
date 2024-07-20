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
        java.lang.String str1 = java.lang.Integer.toBinaryString((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111101" + "'", str1, "11111111111111111111111111111101");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int2 = java.lang.Integer.min((-100), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = java.lang.Integer.BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int1 = java.lang.Integer.bitCount((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11111111111111111111111111111101", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("11111111111111111111111111111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int1 = java.lang.Integer.reverse(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1879048192) + "'", int1 == (-1879048192));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = java.lang.Integer.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("11111111111111111111111111111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str1 = java.lang.Integer.toHexString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int2 = java.lang.Integer.sum(10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int2 = java.lang.Integer.sum(1, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int2 = java.lang.Integer.sum((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.lang.Integer.SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Integer int1 = java.lang.Integer.getInteger("hi!");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11111111111111111111111111111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int1 = java.lang.Integer.reverse((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 637534208 + "'", int1 == 637534208);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = java.lang.Integer.min(110, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int1 = java.lang.Integer.parseInt("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>> strComparableSetSet1 = new java.util.HashSet<java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>>((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = java.lang.Integer.toHexString((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffffd" + "'", str1, "fffffffd");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-9), (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 10, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int2 = java.lang.Integer.divideUnsigned(8, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>(110);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(32, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) (byte) 100, (float) (-8L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -8.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int2 = java.lang.Integer.sum(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "10");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = java.lang.Integer.min(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int2 = java.lang.Integer.rotateLeft(4, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int1 = java.lang.Integer.parseUnsignedInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int2 = java.lang.Integer.compare((int) (short) 100, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int1 = java.lang.Integer.lowestOneBit(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int2 = java.lang.Integer.min((-1), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray16 = strComparableSet10.toArray();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet57 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean64 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean66 = strComparableSet61.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet68 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableSet68.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet71 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean72 = strComparableSet68.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet71);
        boolean boolean73 = strComparableSet61.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet68);
        boolean boolean74 = strComparableSet61.isEmpty();
        java.util.Set[] setArray76 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Comparable<java.lang.String>>[] strComparableSetArray77 = (java.util.Set<java.lang.Comparable<java.lang.String>>[]) setArray76;
        strComparableSetArray77[0] = strComparableSet27;
        strComparableSetArray77[1] = strComparableSet61;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.Comparable<java.lang.String>>[] strComparableSetArray82 = strComparableSet10.toArray(strComparableSetArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(setArray76);
        org.junit.Assert.assertNotNull(strComparableSetArray77);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1, 4096);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int1 = java.lang.Integer.reverse((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int2 = java.lang.Integer.rotateLeft(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int2 = java.lang.Integer.divideUnsigned((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int2 = java.lang.Integer.sum(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = java.lang.Integer.MIN_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int1 = java.lang.Integer.reverseBytes(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) '4', 1073741824);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int2 = java.lang.Integer.compareUnsigned(32, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long1 = java.lang.Integer.toUnsignedLong((-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967289L + "'", long1 == 4294967289L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int2 = java.lang.Integer.rotateRight((-5), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777217) + "'", int2 == (-16777217));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32" + "'", str1, "32");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 0, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int1 = java.lang.Integer.reverseBytes(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int2 = java.lang.Integer.rotateLeft((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = java.lang.Integer.bitCount((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int2 = java.lang.Integer.parseInt("52", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 162 + "'", int2 == 162);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int1 = java.lang.Integer.highestOneBit(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Class<java.lang.Integer> intClass0 = java.lang.Integer.TYPE;
        org.junit.Assert.assertNotNull(intClass0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int2 = java.lang.Integer.rotateLeft(100, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.lang.Class<?> wildcardClass40 = strComparableSet25.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int2 = java.lang.Integer.sum((int) (short) 100, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        long long1 = java.lang.Integer.toUnsignedLong(110);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 110L + "'", long1 == 110L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.HashSet<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>> strComparableCollectionSet1 = new java.util.HashSet<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>>(110);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int2 = java.lang.Integer.compare(97, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4294967295", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("a", (-1879048192));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1879048192 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("4294967295", 107);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 107 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor41 = strComparableSet40.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableItor41);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str1 = java.lang.Integer.toOctalString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int2 = java.lang.Integer.compare(1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean41 = strComparableSet10.remove((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int2 = java.lang.Integer.min(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100001" + "'", str1, "1100001");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int1 = java.lang.Integer.parseUnsignedInt("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("32", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(9, (-10));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9" + "'", str2, "9");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = java.lang.Integer.highestOneBit((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = java.lang.Integer.parseInt("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean43 = strComparableSet0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        boolean boolean12 = strComparableSet3.contains((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int1 = java.lang.Integer.bitCount(4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int1 = java.lang.Integer.reverse(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 637534208 + "'", int1 == 637534208);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean40 = strComparableSet20.remove((java.lang.Object) false);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet44 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableSet44.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean46 = strComparableSet44.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean47 = strComparableSet44.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean49 = strComparableSet44.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean52 = strComparableSet51.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet54 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean55 = strComparableSet51.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet54);
        boolean boolean56 = strComparableSet44.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean59 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean62 = strComparableSet58.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet66 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean67 = strComparableSet66.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean68 = strComparableSet66.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean69 = strComparableSet66.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean71 = strComparableSet66.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet73 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean74 = strComparableSet73.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet76 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean77 = strComparableSet73.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet76);
        boolean boolean78 = strComparableSet66.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet73);
        boolean boolean79 = strComparableSet61.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        boolean boolean80 = strComparableSet51.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream81 = strComparableSet66.parallelStream();
        boolean boolean82 = strComparableSet20.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        boolean boolean83 = strComparableSet3.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strComparableStream81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(50, (-4));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "50" + "'", str2, "50");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int1 = java.lang.Integer.signum((-1879048192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet4.remove((java.lang.Object) false);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet26.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean37 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean39 = strComparableSet34.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet44 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean45 = strComparableSet41.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet44);
        boolean boolean46 = strComparableSet34.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean47 = strComparableSet29.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        boolean boolean48 = strComparableSet4.contains((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-2147483648));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000000000000000000000000" + "'", str1, "10000000000000000000000000000000");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("50", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int2 = java.lang.Integer.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(107, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int2 = java.lang.Integer.max(1073741824, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-16777217));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111110111111111111111111111111" + "'", str1, "11111110111111111111111111111111");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11111110111111111111111111111111", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111" + "'", str1, "11111111111111111111111111111111");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet4.remove((java.lang.Object) false);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean31 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean33 = strComparableSet28.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        boolean boolean40 = strComparableSet28.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet42.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean53 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean55 = strComparableSet50.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet57 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableSet57.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet60 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean61 = strComparableSet57.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean62 = strComparableSet50.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet57);
        boolean boolean63 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean64 = strComparableSet35.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream65 = strComparableSet50.parallelStream();
        boolean boolean66 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean68 = strComparableSet50.remove((java.lang.Object) "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strComparableStream65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int2 = java.lang.Integer.remainderUnsigned(1, 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean41 = strComparableSet25.contains((java.lang.Object) 3L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int2 = java.lang.Integer.sum(1, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int1 = java.lang.Integer.bitCount((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str1 = java.lang.Integer.toHexString((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int1 = java.lang.Integer.bitCount(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Integer int1 = java.lang.Integer.getInteger("64");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("10000000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967295" + "'", str1, "4294967295");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("0", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet9.remove((java.lang.Object) 100);
        boolean boolean26 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111110111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(strComparableCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = java.lang.Integer.reverse(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 939524096 + "'", int1 == 939524096);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int int1 = java.lang.Integer.bitCount((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = java.lang.Integer.toBinaryString(7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111" + "'", str1, "111");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int1 = java.lang.Integer.lowestOneBit((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int1 = java.lang.Integer.bitCount(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int1 = java.lang.Integer.bitCount((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int1 = java.lang.Integer.highestOneBit(110);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int1 = java.lang.Integer.parseInt("1100001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100001 + "'", int1 == 1100001);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("52", (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -6 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int int2 = java.lang.Integer.compareUnsigned(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int2 = java.lang.Integer.max(107, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor25 = strComparableSet24.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream32 = strComparableSet27.parallelStream();
        boolean boolean33 = strComparableSet24.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean34 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        boolean boolean36 = strComparableSet24.contains((java.lang.Object) (-7.3d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strComparableItor25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int2 = java.lang.Integer.divideUnsigned(107, 162);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967295" + "'", str1, "4294967295");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int2 = java.lang.Integer.parseInt("0", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int1 = java.lang.Integer.bitCount(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Integer int1 = java.lang.Integer.getInteger("23");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int2 = java.lang.Integer.rotateLeft(2147483647, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65) + "'", int2 == (-65));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int2 = java.lang.Integer.compare((-5), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("4294967295", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int2 = java.lang.Integer.max(939524096, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 939524096 + "'", int2 == 939524096);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int2 = java.lang.Integer.min(6, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int int2 = java.lang.Integer.sum(9, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-91) + "'", int2 == (-91));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        long long1 = java.lang.Integer.toUnsignedLong(31);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int1 = java.lang.Integer.reverse((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-536870913) + "'", int1 == (-536870913));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int int2 = java.lang.Integer.rotateRight(0, (-1879048192));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableSet10.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet23 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean24 = strComparableSet20.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet23);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet26.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.lang.Object[] objArray31 = strComparableSet29.toArray();
        boolean boolean32 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean39 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean41 = strComparableSet36.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean47 = strComparableSet43.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean48 = strComparableSet36.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean54 = strComparableSet50.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet53);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean59 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean60 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean61 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean63 = strComparableSet58.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet65 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean66 = strComparableSet65.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet68 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean69 = strComparableSet65.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet68);
        boolean boolean70 = strComparableSet58.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet65);
        boolean boolean71 = strComparableSet53.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean72 = strComparableSet43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream73 = strComparableSet43.parallelStream();
        boolean boolean74 = strComparableSet20.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean75 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strComparableStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "64");
        boolean boolean13 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "50");
        boolean boolean14 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        boolean boolean15 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "9");
        boolean boolean16 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "64");
        boolean boolean17 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111111");
        boolean boolean18 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "1");
        boolean boolean19 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "4294967295");
        boolean boolean20 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "a");
        boolean boolean21 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "50");
        boolean boolean22 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "1");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream29 = strComparableSet24.parallelStream();
        boolean boolean30 = strComparableSet11.contains((java.lang.Object) strComparableSet24);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strComparableStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int int1 = java.lang.Integer.reverseBytes((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167772160 + "'", int1 == 167772160);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int2 = java.lang.Integer.min(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int int2 = java.lang.Integer.remainderUnsigned(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int int2 = java.lang.Integer.rotateLeft((-5), 107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8193) + "'", int2 == (-8193));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList11 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean15 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableSet4.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int2 = java.lang.Integer.compareUnsigned(939524096, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = java.lang.Integer.divideUnsigned(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Integer int1 = java.lang.Integer.getInteger("100000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int int2 = java.lang.Integer.sum((-1879048192), (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1879048292) + "'", int2 == (-1879048292));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int int2 = java.lang.Integer.min(1100001, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65) + "'", int2 == (-65));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int int2 = java.lang.Integer.min(6, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int int2 = java.lang.Integer.rotateLeft(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int2 = java.lang.Integer.compare(10, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int1 = java.lang.Integer.signum(939524096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("9", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-7), (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int1 = java.lang.Integer.reverseBytes(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83886080 + "'", int1 == 83886080);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "9");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111111");
        boolean boolean16 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "52");
        boolean boolean17 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "52");
        boolean boolean18 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "a");
        boolean boolean19 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "111");
        boolean boolean21 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "a");
        boolean boolean22 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "32");
        boolean boolean23 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "50");
        boolean boolean24 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "10000000000000000000000000000000");
        boolean boolean25 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "32");
        boolean boolean26 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "4294967295");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream27 = strComparableList13.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strComparableStream27);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = java.lang.Integer.parseUnsignedInt("50", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet58.iterator();
        boolean boolean60 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean63 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "52");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.HashSet<java.lang.Object[]> objArraySet0 = new java.util.HashSet<java.lang.Object[]>();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet58.iterator();
        boolean boolean60 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet62 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.lang.Class<java.lang.Integer> intClass63 = java.lang.Integer.TYPE;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<java.lang.Integer>[] intClassArray66 = (java.lang.Class<java.lang.Integer>[]) classArray65;
        intClassArray66[0] = intClass63;
        java.lang.Class<java.lang.Integer>[] intClassArray69 = strComparableSet62.toArray(intClassArray66);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream70 = strComparableSet62.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intClass63);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(intClassArray66);
        org.junit.Assert.assertNotNull(intClassArray69);
        org.junit.Assert.assertNotNull(strComparableStream70);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int int1 = java.lang.Integer.numberOfLeadingZeros(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str1 = java.lang.Integer.toHexString((-7));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffff9" + "'", str1, "fffffff9");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int2 = java.lang.Integer.divideUnsigned((-6), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 429496729 + "'", int2 == 429496729);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int int2 = java.lang.Integer.compare(100, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(107);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "107" + "'", str1, "107");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int int2 = java.lang.Integer.min(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int int1 = java.lang.Integer.parseInt("107");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107 + "'", int1 == 107);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10000000000000000000000000000000", 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int1 = java.lang.Integer.parseUnsignedInt("9");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.lang.Object[] objArray23 = strComparableSet9.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, hi!, 11111111111111111111111111111101]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        long long1 = java.lang.Integer.toUnsignedLong(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11111111111111111111111111111111", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int int2 = java.lang.Integer.max(939524096, 100000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 939524096 + "'", int2 == 939524096);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int2 = java.lang.Integer.min(29, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(100);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet6 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean7 = strComparableSet3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet6);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet9.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.Object[] objArray14 = strComparableSet12.toArray();
        boolean boolean15 = strComparableSet3.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean22 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean24 = strComparableSet19.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet26.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        boolean boolean31 = strComparableSet19.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean43 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean44 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean46 = strComparableSet41.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean52 = strComparableSet48.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        boolean boolean53 = strComparableSet41.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        boolean boolean54 = strComparableSet36.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean55 = strComparableSet26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream56 = strComparableSet26.parallelStream();
        boolean boolean57 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean58 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strComparableStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -2147483648");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int int2 = java.lang.Integer.compareUnsigned((-1), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet12 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        simpleMethods0.addElementToSet(intSet12, (-5));
        examples.SimpleMethods simpleMethods16 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods16.addElementToSet(intSet28, (-5));
        examples.SimpleMethods simpleMethods32 = new examples.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods32.addElementToSet(intSet44, (-5));
        simpleMethods16.addElementToSet(intSet44, (-7));
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods51.addElementToSet(intSet63, (-5));
        examples.SimpleMethods simpleMethods67 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods67.addElementToSet(intSet79, (-5));
        simpleMethods51.addElementToSet(intSet79, (-7));
        simpleMethods50.addElementToSet(intSet79, 31);
        simpleMethods16.addElementToSet(intSet79, (-5));
        simpleMethods0.addElementToSet(intSet79, 1100001);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("52", (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -8 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet13 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        simpleMethods1.addElementToSet(intSet13, (-5));
        examples.SimpleMethods simpleMethods17 = new examples.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods17.addElementToSet(intSet29, (-5));
        simpleMethods1.addElementToSet(intSet29, (-7));
        simpleMethods0.addElementToSet(intSet29, 31);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods37.addElementToSet(intSet49, (-5));
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods53.addElementToSet(intSet65, (-5));
        simpleMethods37.addElementToSet(intSet65, (-7));
        simpleMethods0.addElementToSet(intSet65, (-100));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("11111110111111111111111111111111", 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073741824 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int int2 = java.lang.Integer.parseUnsignedInt("1", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int2 = java.lang.Integer.max(167772160, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167772160 + "'", int2 == 167772160);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1879048192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.contains((java.lang.Object) (-7L));
        boolean boolean18 = strComparableSet10.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int1 = java.lang.Integer.lowestOneBit(637534208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33554432 + "'", int1 == 33554432);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("11111111111111111111111111111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int2 = java.lang.Integer.remainderUnsigned((-1879048192), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int2 = java.lang.Integer.remainderUnsigned(0, 100000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str1 = java.lang.Integer.toOctalString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        long long1 = java.lang.Integer.toUnsignedLong(939524096);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 939524096L + "'", long1 == 939524096L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet4.remove((java.lang.Object) false);
        int int25 = strComparableSet4.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int2 = java.lang.Integer.min((int) (byte) 0, (-16777217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777217) + "'", int2 == (-16777217));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean41 = strComparableSet40.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean44 = strComparableSet40.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean51 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean53 = strComparableSet48.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean56 = strComparableSet55.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean59 = strComparableSet55.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean60 = strComparableSet48.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        boolean boolean61 = strComparableSet43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        boolean boolean62 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor65 = strComparableSet64.iterator();
        boolean boolean66 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean67 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet70 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(939524096, (float) 7L);
        boolean boolean71 = strComparableSet4.contains((java.lang.Object) strComparableSet70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strComparableItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int int2 = java.lang.Integer.compare(0, (-16777217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        examples.SimpleMethods[] simpleMethodsArray43 = new examples.SimpleMethods[] {};
        // The following exception was thrown during execution in test generation
        try {
            examples.SimpleMethods[] simpleMethodsArray44 = strComparableSet41.toArray(simpleMethodsArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(simpleMethodsArray43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str1 = java.lang.Integer.toBinaryString(50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110010" + "'", str1, "110010");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int int2 = java.lang.Integer.remainderUnsigned((-2147483648), 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int1 = java.lang.Integer.signum(4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int2 = java.lang.Integer.rotateRight(167772160, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167772160 + "'", int2 == 167772160);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str1 = java.lang.Integer.toHexString(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray16 = strComparableSet10.toArray();
        boolean boolean18 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "1100001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet[] linkedHashSetArray7 = new java.util.LinkedHashSet[0];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray8 = (java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>[]) linkedHashSetArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray9 = strComparableSet1.toArray(strComparableSetArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(linkedHashSetArray7);
        org.junit.Assert.assertNotNull(strComparableSetArray8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int1 = java.lang.Integer.bitCount((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.Integer int1 = java.lang.Integer.getInteger("34");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean20 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean22 = strComparableSet17.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean29 = strComparableSet17.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableSet31.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean35 = strComparableSet31.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean42 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean44 = strComparableSet39.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableSet46.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean50 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean51 = strComparableSet39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean52 = strComparableSet34.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean53 = strComparableSet24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream54 = strComparableSet24.parallelStream();
        boolean boolean55 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream56 = strComparableSet1.parallelStream();
        java.lang.Object[] objArray57 = strComparableSet1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strComparableStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strComparableStream56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[11111111111111111111111111111101]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableSet3.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) (short) 1, (float) (-8L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -8.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet42.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.lang.Object[] objArray47 = strComparableSet45.toArray();
        boolean boolean49 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "1");
        boolean boolean50 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        strComparableSet45.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        int int2 = java.lang.Integer.min((-1879048192), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1879048192) + "'", int2 == (-1879048192));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.Object[] objArray6 = strComparableSet4.toArray();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "1");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean15 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean17 = strComparableSet12.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean23 = strComparableSet19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean24 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet26.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean37 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean39 = strComparableSet34.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet44 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean45 = strComparableSet41.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet44);
        boolean boolean46 = strComparableSet34.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean47 = strComparableSet29.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        boolean boolean48 = strComparableSet19.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream49 = strComparableSet19.parallelStream();
        boolean boolean50 = strComparableSet4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableSet4.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableSet53.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet56 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean57 = strComparableSet53.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet56);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList63 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean65 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean66 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean67 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean68 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean69 = strComparableSet56.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        boolean boolean70 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strComparableStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int int2 = java.lang.Integer.rotateRight(31, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126976 + "'", int2 == 126976);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean44 = strComparableSet0.add((java.lang.Comparable<java.lang.String>) "10000000000000000000000000000000");
        java.lang.Object[] objArray45 = strComparableSet0.toArray();
        java.lang.Class<?> wildcardClass46 = strComparableSet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, hi!, 10000000000000000000000000000000, 11111111111111111111111111111101]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int int2 = java.lang.Integer.compareUnsigned((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(4096, (float) (-8193));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -8193.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Integer int1 = java.lang.Integer.getInteger("fffffff9");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList11 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean15 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        java.lang.Object[] objArray18 = strComparableList11.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[, 0, 0, , hi!]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int2 = java.lang.Integer.min(126976, 83886080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126976 + "'", int2 == 126976);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) 0, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str1 = java.lang.Integer.toOctalString((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777777" + "'", str1, "37777777777");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), (-6), 110, (-1879048292), 939524096, (-8193), (-100), 637534208, 3, 50, (-16777217), 10, 100, (-5), (-536870913), 83886080, (-1), 97, (-8), 7, (-7), 100, 52, 162, 100, 3, 4096, 100 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods0.addElementToSet(intSet30, 2147483647);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods35.addElementToSet(intSet47, (-5));
        simpleMethods34.addElementToSet(intSet47, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet47, 1100001);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int int1 = java.lang.Integer.parseInt("23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((-2147483648), (float) 110L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -2147483648");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int1 = java.lang.Integer.reverseBytes(4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableSet41.iterator();
        boolean boolean43 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.lang.Object[] objArray44 = strComparableSet41.toArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableSet1.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet9.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean19 = strComparableSet15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.lang.Object[] objArray20 = strComparableSet18.toArray();
        boolean boolean21 = strComparableSet9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean43 = strComparableSet39.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet47 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean48 = strComparableSet47.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean49 = strComparableSet47.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean50 = strComparableSet47.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean52 = strComparableSet47.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet54 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean55 = strComparableSet54.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet57 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean58 = strComparableSet54.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet57);
        boolean boolean59 = strComparableSet47.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet54);
        boolean boolean60 = strComparableSet42.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet47);
        boolean boolean61 = strComparableSet32.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet47);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream62 = strComparableSet32.parallelStream();
        boolean boolean63 = strComparableSet9.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream64 = strComparableSet9.parallelStream();
        boolean boolean65 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableSet1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strComparableStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strComparableStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strComparableItor66);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int1 = java.lang.Integer.highestOneBit(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.lang.Object[] objArray1 = strComparableSet0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int int1 = java.lang.Integer.numberOfLeadingZeros(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int2 = java.lang.Integer.rotateRight((-16777217), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1048577) + "'", int2 == (-1048577));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        int int1 = java.lang.Integer.reverseBytes(167772160);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = java.lang.Integer.remainderUnsigned((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int int2 = java.lang.Integer.rotateRight(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int int2 = java.lang.Integer.min(64, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int2 = java.lang.Integer.parseInt("97", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        java.lang.Class<?> wildcardClass12 = strComparableSet11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int int1 = java.lang.Integer.numberOfLeadingZeros(107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int int1 = java.lang.Integer.highestOneBit((-65));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.Object[] objArray6 = strComparableSet4.toArray();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "1");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean15 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean17 = strComparableSet12.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean23 = strComparableSet19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean24 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet26.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean37 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean39 = strComparableSet34.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet44 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean45 = strComparableSet41.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet44);
        boolean boolean46 = strComparableSet34.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean47 = strComparableSet29.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        boolean boolean48 = strComparableSet19.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream49 = strComparableSet19.parallelStream();
        boolean boolean50 = strComparableSet4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet54 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean55 = strComparableSet54.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean56 = strComparableSet54.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean57 = strComparableSet54.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean59 = strComparableSet54.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean65 = strComparableSet61.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean66 = strComparableSet54.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        java.lang.Object[] objArray67 = strComparableSet61.toArray();
        boolean boolean68 = strComparableSet19.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        int int69 = strComparableSet61.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strComparableStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int int1 = java.lang.Integer.signum((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String str1 = java.lang.Integer.toOctalString(23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "27" + "'", str1, "27");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int2 = java.lang.Integer.compareUnsigned((int) (byte) -1, 1073741824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int2 = java.lang.Integer.compareUnsigned(29, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str1 = java.lang.Integer.toHexString(23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "17" + "'", str1, "17");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.String str1 = java.lang.Integer.toHexString(167772160);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a000000" + "'", str1, "a000000");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int int2 = java.lang.Integer.compareUnsigned(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int int1 = java.lang.Integer.bitCount((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int1 = java.lang.Integer.numberOfTrailingZeros(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int int2 = java.lang.Integer.compareUnsigned((-7), 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.HashSet<java.util.Iterator<java.lang.Comparable<java.lang.String>>> strComparableItorSet1 = new java.util.HashSet<java.util.Iterator<java.lang.Comparable<java.lang.String>>>(162);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.lang.Object[] objArray43 = strComparableSet41.toArray();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean49 = strComparableSet45.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream50 = strComparableSet45.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableSet45.iterator();
        strComparableSet45.clear();
        boolean boolean53 = strComparableSet41.remove((java.lang.Object) strComparableSet45);
        boolean boolean55 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "52");
        boolean boolean57 = strComparableSet41.remove((java.lang.Object) "4294967295");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, hi!, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableStream50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int int2 = java.lang.Integer.rotateRight(10, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int2 = java.lang.Integer.rotateRight(1677721600, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1677721600 + "'", int2 == 1677721600);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean24 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean26 = strComparableSet21.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean32 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        boolean boolean33 = strComparableSet21.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean46 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean48 = strComparableSet43.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean54 = strComparableSet50.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet53);
        boolean boolean55 = strComparableSet43.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean56 = strComparableSet38.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean57 = strComparableSet28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean58 = strComparableSet10.remove((java.lang.Object) strComparableSet43);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream59 = strComparableSet10.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strComparableStream59);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int int2 = java.lang.Integer.compareUnsigned(25, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111" + "'", str1, "11111111111111111111111111111111");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableSet1.iterator();
        java.lang.Class<?> wildcardClass3 = strComparableSet1.getClass();
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.HashSet<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>> strComparableCollectionSet0 = new java.util.HashSet<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int int2 = java.lang.Integer.compare(1677721600, 939524096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(637534208, (float) 10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableSet4.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean18 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean20 = strComparableSet15.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean26 = strComparableSet22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean27 = strComparableSet15.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean28 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean30 = strComparableSet15.remove((java.lang.Object) 100);
        boolean boolean31 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean32 = strComparableSet2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.Object[] objArray33 = strComparableSet2.toArray();
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int1 = java.lang.Integer.reverseBytes(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 872415232 + "'", int1 == 872415232);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-1048577));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableSet41.iterator();
        boolean boolean43 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        int int44 = strComparableSet41.size();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream45 = strComparableSet41.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(strComparableStream45);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("0", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -3 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean20 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean22 = strComparableSet17.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean29 = strComparableSet17.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableSet31.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean35 = strComparableSet31.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean42 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean44 = strComparableSet39.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableSet46.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean50 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean51 = strComparableSet39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean52 = strComparableSet34.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean53 = strComparableSet24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream54 = strComparableSet24.parallelStream();
        boolean boolean55 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        boolean boolean57 = strComparableSet1.contains((java.lang.Object) 'a');
        int int58 = strComparableSet1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strComparableStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int1 = java.lang.Integer.highestOneBit(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int int2 = java.lang.Integer.rotateRight(2147483647, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-513) + "'", int2 == (-513));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean20 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean22 = strComparableSet17.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean29 = strComparableSet17.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableSet31.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean35 = strComparableSet31.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean42 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean44 = strComparableSet39.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableSet46.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean50 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean51 = strComparableSet39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean52 = strComparableSet34.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean53 = strComparableSet24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream54 = strComparableSet24.parallelStream();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet56 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean57 = strComparableSet56.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet59 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean60 = strComparableSet56.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet59);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream61 = strComparableSet56.parallelStream();
        java.util.stream.BaseStream[] baseStreamArray63 = new java.util.stream.BaseStream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray64 = (java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[]) baseStreamArray63;
        strComparableBaseStreamArray64[0] = strComparableStream54;
        strComparableBaseStreamArray64[1] = strComparableStream61;
        java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray69 = strComparableSet10.toArray(strComparableBaseStreamArray64);
        strComparableSet10.clear();
        boolean boolean72 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strComparableStream54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableStream61);
        org.junit.Assert.assertNotNull(baseStreamArray63);
        org.junit.Assert.assertNotNull(strComparableBaseStreamArray64);
        org.junit.Assert.assertNotNull(strComparableBaseStreamArray69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet0.contains((java.lang.Object) (-4));
        java.lang.Object[] objArray3 = strComparableSet0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str1 = java.lang.Integer.toBinaryString(64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000000" + "'", str1, "1000000");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableSet1.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean8 = strComparableSet4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet7);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet4.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableSet4.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean16 = strComparableSet12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean33 = strComparableSet15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        boolean boolean35 = strComparableSet15.remove((java.lang.Object) false);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean42 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean44 = strComparableSet39.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableSet46.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean50 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean51 = strComparableSet39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableSet53.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet56 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean57 = strComparableSet53.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet56);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean64 = strComparableSet61.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean66 = strComparableSet61.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet68 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableSet68.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet71 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean72 = strComparableSet68.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet71);
        boolean boolean73 = strComparableSet61.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet68);
        boolean boolean74 = strComparableSet56.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        boolean boolean75 = strComparableSet46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream76 = strComparableSet61.parallelStream();
        boolean boolean77 = strComparableSet15.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        boolean boolean78 = strComparableSet4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean79 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strComparableStream76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97" + "'", str1, "97");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean18 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean20 = strComparableSet15.contains((java.lang.Object) 10.0f);
        boolean boolean22 = strComparableSet15.contains((java.lang.Object) 0L);
        boolean boolean23 = strComparableSet3.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean31 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean33 = strComparableSet28.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        boolean boolean40 = strComparableSet28.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet42.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean53 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean55 = strComparableSet50.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet57 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableSet57.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet60 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean61 = strComparableSet57.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean62 = strComparableSet50.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet57);
        boolean boolean63 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean64 = strComparableSet35.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet65 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean66 = strComparableSet24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet65);
        java.lang.Object[] objArray67 = strComparableSet65.toArray();
        boolean boolean68 = strComparableSet3.contains((java.lang.Object) strComparableSet65);
        java.lang.Object[] objArray69 = strComparableSet65.toArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[0, hi!, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[0, hi!, 11111111111111111111111111111101]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        int int1 = java.lang.Integer.signum(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int int1 = java.lang.Integer.parseUnsignedInt("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableSet10.iterator();
        boolean boolean20 = strComparableSet10.contains((java.lang.Object) (-10.5d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean24 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean26 = strComparableSet21.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean32 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        boolean boolean33 = strComparableSet21.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        boolean boolean34 = strComparableSet21.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean39 = strComparableSet38.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean40 = strComparableSet38.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean41 = strComparableSet38.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean43 = strComparableSet38.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean49 = strComparableSet45.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        boolean boolean50 = strComparableSet38.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean53 = strComparableSet52.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean56 = strComparableSet52.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet60 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean61 = strComparableSet60.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean62 = strComparableSet60.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean63 = strComparableSet60.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean65 = strComparableSet60.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet67 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean68 = strComparableSet67.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet70 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean71 = strComparableSet67.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet70);
        boolean boolean72 = strComparableSet60.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet67);
        boolean boolean73 = strComparableSet55.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean74 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet76 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableSet76.iterator();
        boolean boolean78 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet76);
        boolean boolean79 = strComparableSet21.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet76);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet80 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet76);
        java.lang.Class<java.lang.Integer> intClass81 = java.lang.Integer.TYPE;
        java.lang.Class[] classArray83 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<java.lang.Integer>[] intClassArray84 = (java.lang.Class<java.lang.Integer>[]) classArray83;
        intClassArray84[0] = intClass81;
        java.lang.Class<java.lang.Integer>[] intClassArray87 = strComparableSet80.toArray(intClassArray84);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray88 = strComparableSet10.toArray((java.io.Serializable[]) intClassArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strComparableItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intClass81);
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertNotNull(intClassArray84);
        org.junit.Assert.assertNotNull(intClassArray87);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(100);
        int int2 = strComparableSet1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52" + "'", str1, "52");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int1 = java.lang.Integer.numberOfTrailingZeros(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String str1 = java.lang.Integer.toHexString(872415232);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34000000" + "'", str1, "34000000");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        long long1 = java.lang.Integer.toUnsignedLong(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int int1 = java.lang.Integer.reverse(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1610612736 + "'", int1 == 1610612736);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean13 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean15 = strComparableSet10.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        boolean boolean22 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet17);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean34 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean35 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean37 = strComparableSet32.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean43 = strComparableSet39.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean44 = strComparableSet32.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean45 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean46 = strComparableSet17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream47 = strComparableSet32.parallelStream();
        boolean boolean48 = strComparableSet1.contains((java.lang.Object) strComparableSet32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strComparableStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int int1 = java.lang.Integer.reverseBytes((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-50331649) + "'", int1 == (-50331649));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        int int2 = strComparableSet1.size();
        examples.SimpleMethods simpleMethods3 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods4.addElementToSet(intSet16, (-5));
        simpleMethods3.addElementToSet(intSet16, (int) (byte) -1);
        boolean boolean22 = strComparableSet1.remove((java.lang.Object) simpleMethods3);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods24.addElementToSet(intSet36, (-5));
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods40.addElementToSet(intSet52, (-5));
        simpleMethods24.addElementToSet(intSet52, (-7));
        simpleMethods23.addElementToSet(intSet52, 31);
        simpleMethods3.addElementToSet(intSet52, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str1 = java.lang.Integer.toHexString(637534208);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "26000000" + "'", str1, "26000000");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        strComparableSet10.clear();
        boolean boolean17 = strComparableSet10.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.Integer int1 = java.lang.Integer.getInteger("52");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        int int2 = java.lang.Integer.rotateLeft((-6), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1281) + "'", int2 == (-1281));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        long long1 = java.lang.Integer.toUnsignedLong(23);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int int1 = java.lang.Integer.reverse((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-129) + "'", int1 == (-129));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(1048576);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int int1 = java.lang.Integer.signum(107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int int2 = java.lang.Integer.compare(10, 100000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableSet1.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean8 = strComparableSet4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet7);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean15 = strComparableSet12.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean17 = strComparableSet12.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean23 = strComparableSet19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean24 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean25 = strComparableSet7.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        boolean boolean27 = strComparableSet12.remove((java.lang.Object) 100);
        boolean boolean28 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        int int29 = strComparableSet1.size();
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int int1 = java.lang.Integer.lowestOneBit(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int int2 = java.lang.Integer.rotateRight(429496729, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 858993458 + "'", int2 == 858993458);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int int1 = java.lang.Integer.parseInt("17");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(34, (float) (-1879048292));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -1.87904832E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int int2 = java.lang.Integer.sum((-10), (-91));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        int int2 = java.lang.Integer.sum(1677721600, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1677721625 + "'", int2 == 1677721625);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String str1 = java.lang.Integer.toOctalString(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "31" + "'", str1, "31");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet58.iterator();
        boolean boolean60 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet62 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet63 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet62);
        int int64 = strComparableSet63.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str1 = java.lang.Integer.toBinaryString(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110" + "'", str1, "110");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str1 = java.lang.Integer.toBinaryString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101" + "'", str1, "101");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10000000000000000000000000000000", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int int2 = java.lang.Integer.divideUnsigned((-3), (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int int1 = java.lang.Integer.lowestOneBit(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int int2 = java.lang.Integer.max((-536870913), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int2 = java.lang.Integer.compareUnsigned((int) ' ', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        int int2 = strComparableSet1.size();
        examples.SimpleMethods simpleMethods3 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods4.addElementToSet(intSet16, (-5));
        simpleMethods3.addElementToSet(intSet16, (int) (byte) -1);
        boolean boolean22 = strComparableSet1.remove((java.lang.Object) simpleMethods3);
        boolean boolean23 = strComparableSet1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int int1 = java.lang.Integer.numberOfLeadingZeros(50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int int2 = java.lang.Integer.compareUnsigned((-65), (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.lang.Object[] objArray43 = strComparableSet41.toArray();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean49 = strComparableSet45.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream50 = strComparableSet45.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableSet45.iterator();
        strComparableSet45.clear();
        boolean boolean53 = strComparableSet41.remove((java.lang.Object) strComparableSet45);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor56 = strComparableSet55.iterator();
        boolean boolean57 = strComparableSet45.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        boolean boolean58 = strComparableSet45.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, hi!, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableStream50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strComparableItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-101));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int int1 = java.lang.Integer.numberOfLeadingZeros(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int int2 = java.lang.Integer.divideUnsigned(5, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = java.lang.Integer.min(100, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str1 = java.lang.Integer.toHexString(939524096);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "38000000" + "'", str1, "38000000");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int int2 = java.lang.Integer.compare((int) (byte) 10, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int int2 = java.lang.Integer.min(28, 1677721625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-65), 1073741824);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967231" + "'", str2, "4294967231");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int int1 = java.lang.Integer.bitCount((-1281));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int int1 = java.lang.Integer.reverse((-1879048192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int2 = java.lang.Integer.min((-7), (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean17 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "fffffffd");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean24 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean26 = strComparableSet21.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean32 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        boolean boolean33 = strComparableSet21.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean46 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean48 = strComparableSet43.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean54 = strComparableSet50.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet53);
        boolean boolean55 = strComparableSet43.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean56 = strComparableSet38.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean57 = strComparableSet28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean58 = strComparableSet10.remove((java.lang.Object) strComparableSet43);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet43.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor60 = strComparableSet43.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertNotNull(strComparableItor60);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int int2 = java.lang.Integer.min((-5), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        strComparableSet11.clear();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableSet11.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream40 = strComparableSet25.parallelStream();
        boolean boolean42 = strComparableSet25.remove((java.lang.Object) "11111110111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableStream40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(100, (-10));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean18 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean20 = strComparableSet15.contains((java.lang.Object) 10.0f);
        boolean boolean22 = strComparableSet15.contains((java.lang.Object) 0L);
        boolean boolean23 = strComparableSet3.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableSet3.parallelStream();
        int int25 = strComparableSet3.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strComparableStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int int1 = java.lang.Integer.parseInt("34000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34000000 + "'", int1 == 34000000);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), (-6), 110, (-1879048292), 939524096, (-8193), (-100), 637534208, 3, 50, (-16777217), 10, 100, (-5), (-536870913), 83886080, (-1), 97, (-8), 7, (-7), 100, 52, 162, 100, 3, 4096, 100 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods0.addElementToSet(intSet30, 2147483647);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods35.addElementToSet(intSet47, (-5));
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods51.addElementToSet(intSet63, (-5));
        simpleMethods35.addElementToSet(intSet63, (-7));
        simpleMethods34.addElementToSet(intSet63, 31);
        simpleMethods0.addElementToSet(intSet63, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(7, (-101));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7" + "'", str2, "7");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean14 = strComparableSet1.isEmpty();
        int int15 = strComparableSet1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("50", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-1048577));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4293918719" + "'", str1, "4293918719");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean20 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean22 = strComparableSet17.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean29 = strComparableSet17.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableSet31.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean35 = strComparableSet31.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet34);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean42 = strComparableSet39.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean44 = strComparableSet39.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableSet46.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean50 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean51 = strComparableSet39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean52 = strComparableSet34.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean53 = strComparableSet24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream54 = strComparableSet24.parallelStream();
        boolean boolean55 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        boolean boolean57 = strComparableSet1.remove((java.lang.Object) 64);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet59 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor60 = strComparableSet59.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet62 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean63 = strComparableSet62.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet65 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean66 = strComparableSet62.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet65);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream67 = strComparableSet62.parallelStream();
        boolean boolean68 = strComparableSet59.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet62);
        boolean boolean69 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strComparableStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strComparableItor60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strComparableStream67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int int1 = java.lang.Integer.bitCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        strComparableSet3.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean41 = strComparableSet40.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean44 = strComparableSet40.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean51 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean53 = strComparableSet48.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean56 = strComparableSet55.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean59 = strComparableSet55.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean60 = strComparableSet48.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        boolean boolean61 = strComparableSet43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        boolean boolean62 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor65 = strComparableSet64.iterator();
        boolean boolean66 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean67 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean68 = strComparableSet4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strComparableItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.Object[] objArray6 = strComparableSet4.toArray();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "1");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableSet4.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int int2 = java.lang.Integer.remainderUnsigned(1073741824, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741824 + "'", int2 == 1073741824);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean44 = strComparableSet0.add((java.lang.Comparable<java.lang.String>) "10000000000000000000000000000000");
        java.lang.Object[] objArray45 = strComparableSet0.toArray();
        boolean boolean46 = strComparableSet0.isEmpty();
        boolean boolean48 = strComparableSet0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor49 = strComparableSet0.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, hi!, 10000000000000000000000000000000, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strComparableItor49);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(4096, (-5));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4096" + "'", str2, "4096");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableSet1.iterator();
        boolean boolean3 = strComparableSet1.isEmpty();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean6 = strComparableSet5.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet5.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        java.lang.Object[] objArray16 = strComparableSet14.toArray();
        boolean boolean17 = strComparableSet5.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean24 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean26 = strComparableSet21.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean32 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        boolean boolean33 = strComparableSet21.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean46 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean48 = strComparableSet43.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet53 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean54 = strComparableSet50.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet53);
        boolean boolean55 = strComparableSet43.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean56 = strComparableSet38.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean57 = strComparableSet28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream58 = strComparableSet28.parallelStream();
        boolean boolean59 = strComparableSet5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream60 = strComparableSet5.parallelStream();
        boolean boolean61 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strComparableStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strComparableStream60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.String str1 = java.lang.Integer.toBinaryString(33554432);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000000000000000000" + "'", str1, "10000000000000000000000000");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        long long1 = java.lang.Integer.toUnsignedLong((-129));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967167L + "'", long1 == 4294967167L);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int int2 = java.lang.Integer.compare(872415232, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        long long1 = java.lang.Integer.toUnsignedLong(858993458);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 858993458L + "'", long1 == 858993458L);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean41 = strComparableSet40.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean44 = strComparableSet40.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean51 = strComparableSet48.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean53 = strComparableSet48.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean56 = strComparableSet55.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean59 = strComparableSet55.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean60 = strComparableSet48.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        boolean boolean61 = strComparableSet43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        boolean boolean62 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor65 = strComparableSet64.iterator();
        boolean boolean66 = strComparableSet33.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean67 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream68 = strComparableSet4.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor69 = strComparableSet4.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strComparableItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strComparableStream68);
        org.junit.Assert.assertNotNull(strComparableItor69);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("34000000", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        int int2 = java.lang.Integer.min(0, 1073741824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int int1 = java.lang.Integer.highestOneBit(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        int int2 = java.lang.Integer.rotateRight((-1), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean44 = strComparableSet0.add((java.lang.Comparable<java.lang.String>) "10000000000000000000000000000000");
        java.lang.Object[] objArray45 = strComparableSet0.toArray();
        boolean boolean47 = strComparableSet0.contains((java.lang.Object) 1000000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, hi!, 10000000000000000000000000000000, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int int2 = java.lang.Integer.sum((-513), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-504) + "'", int2 == (-504));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 1, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        int int2 = java.lang.Integer.divideUnsigned(107, (-16777217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        int int2 = java.lang.Integer.compare(4096, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4293918719");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4293918719\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int int1 = java.lang.Integer.signum(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet4.remove((java.lang.Object) false);
        java.lang.Class<?> wildcardClass25 = strComparableSet4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.HashSet<java.lang.CharSequence> charSequenceSet1 = new java.util.HashSet<java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet42.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.lang.Object[] objArray47 = strComparableSet45.toArray();
        boolean boolean49 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "1");
        boolean boolean50 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        strComparableSet10.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        long long1 = java.lang.Integer.toUnsignedLong(27);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 27L + "'", long1 == 27L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int int2 = java.lang.Integer.rotateRight(3, 1073741824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.String str1 = java.lang.Integer.toHexString(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "19" + "'", str1, "19");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("38000000", 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 872415232 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        int int2 = java.lang.Integer.min((-5), 1100001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int int2 = java.lang.Integer.remainderUnsigned(85, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet58.iterator();
        boolean boolean60 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet63 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableSet63.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet66 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean67 = strComparableSet63.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet71 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean72 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean73 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean74 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean76 = strComparableSet71.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet78 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean79 = strComparableSet78.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet81 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean82 = strComparableSet78.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet81);
        boolean boolean83 = strComparableSet71.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet78);
        boolean boolean84 = strComparableSet71.isEmpty();
        boolean boolean85 = strComparableSet63.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet71);
        boolean boolean86 = strComparableSet3.contains((java.lang.Object) strComparableSet71);
        java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray88 = strComparableSet3.toArray(strComparableCollectionArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int int2 = java.lang.Integer.compareUnsigned(858993458, 939524096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(939524096, (float) 7L);
        java.lang.Object[] objArray3 = strComparableSet2.toArray();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        int int1 = java.lang.Integer.highestOneBit((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        int int1 = java.lang.Integer.reverseBytes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet13 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet13, intArray12);
        simpleMethods1.addElementToSet(intSet13, (-5));
        simpleMethods0.addElementToSet(intSet13, (int) (byte) -1);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods19.addElementToSet(intSet31, (-5));
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods35.addElementToSet(intSet47, (-5));
        simpleMethods19.addElementToSet(intSet47, (-7));
        simpleMethods0.addElementToSet(intSet47, 4096);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        int int1 = java.lang.Integer.reverseBytes((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        int int2 = java.lang.Integer.divideUnsigned(10, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        boolean boolean10 = strComparableSet3.contains((java.lang.Object) 0L);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet3);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean17 = strComparableSet13.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableSet19.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean23 = strComparableSet19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        java.lang.Object[] objArray24 = strComparableSet22.toArray();
        boolean boolean25 = strComparableSet13.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean30 = strComparableSet29.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableSet29.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean32 = strComparableSet29.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean34 = strComparableSet29.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean40 = strComparableSet36.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        boolean boolean41 = strComparableSet29.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean47 = strComparableSet43.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean52 = strComparableSet51.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean53 = strComparableSet51.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean54 = strComparableSet51.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean56 = strComparableSet51.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean59 = strComparableSet58.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean62 = strComparableSet58.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet61);
        boolean boolean63 = strComparableSet51.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean64 = strComparableSet46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        boolean boolean65 = strComparableSet36.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream66 = strComparableSet36.parallelStream();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet68 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableSet68.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet71 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean72 = strComparableSet68.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet71);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream73 = strComparableSet68.parallelStream();
        java.util.stream.BaseStream[] baseStreamArray75 = new java.util.stream.BaseStream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray76 = (java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[]) baseStreamArray75;
        strComparableBaseStreamArray76[0] = strComparableStream66;
        strComparableBaseStreamArray76[1] = strComparableStream73;
        java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray81 = strComparableSet22.toArray(strComparableBaseStreamArray76);
        strComparableSet22.clear();
        boolean boolean83 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean84 = strComparableSet11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strComparableStream66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strComparableStream73);
        org.junit.Assert.assertNotNull(baseStreamArray75);
        org.junit.Assert.assertNotNull(strComparableBaseStreamArray76);
        org.junit.Assert.assertNotNull(strComparableBaseStreamArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int int1 = java.lang.Integer.parseInt("64");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("a", 429496729);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 429496729 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        int int1 = java.lang.Integer.bitCount(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        int int2 = java.lang.Integer.rotateLeft((-100), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-793) + "'", int2 == (-793));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int int1 = java.lang.Integer.signum(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int int1 = java.lang.Integer.parseUnsignedInt("1100001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100001 + "'", int1 == 1100001);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int int1 = java.lang.Integer.parseInt("4096");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        int int2 = java.lang.Integer.sum(107, (-8193));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8086) + "'", int2 == (-8086));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("0", (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -100 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        int int1 = java.lang.Integer.parseUnsignedInt("97");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        int int1 = java.lang.Integer.reverseBytes(126976);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15728896 + "'", int1 == 15728896);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", 30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        int int2 = java.lang.Integer.sum((-1048577), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1048585) + "'", int2 == (-1048585));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.HashSet<java.lang.Object> objSet0 = new java.util.HashSet<java.lang.Object>();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int2 = java.lang.Integer.compare((int) (short) 0, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("fffffff9", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean21 = strComparableSet17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean28 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean30 = strComparableSet25.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean37 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet32);
        boolean boolean38 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean39 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableSet41.iterator();
        boolean boolean43 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        int int44 = strComparableSet41.size();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray47 = strComparableSet46.toArray();
        boolean boolean48 = strComparableSet41.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        java.lang.Class<?> wildcardClass49 = strComparableSet41.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-101), (-513));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967195" + "'", str2, "4294967195");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(637534208, (float) 10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableSet4.iterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean18 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean20 = strComparableSet15.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean26 = strComparableSet22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean27 = strComparableSet15.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean28 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean30 = strComparableSet15.remove((java.lang.Object) 100);
        boolean boolean31 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean32 = strComparableSet2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "52", "4293918719" };
        java.lang.String[] strArray37 = strComparableSet2.toArray(strArray36);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(637534208, (float) 10);
        boolean boolean18 = strComparableSet14.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        int int2 = strComparableSet1.size();
        examples.SimpleMethods simpleMethods3 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 4096, 4, (-4), 64, 0, 939524096, 1677721600, 2, (-9), (-5) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods4.addElementToSet(intSet16, (-5));
        simpleMethods3.addElementToSet(intSet16, (int) (byte) -1);
        boolean boolean22 = strComparableSet1.remove((java.lang.Object) simpleMethods3);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray25 = strComparableSet24.toArray();
        boolean boolean26 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.lang.String str1 = java.lang.Integer.toOctalString((-100));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777634" + "'", str1, "37777777634");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        int int1 = java.lang.Integer.signum((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        int int2 = java.lang.Integer.sum(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.lang.String str1 = java.lang.Integer.toHexString((-8086));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ffffe06a" + "'", str1, "ffffe06a");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        int int2 = java.lang.Integer.sum(100, (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870813) + "'", int2 == (-536870813));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        int int2 = java.lang.Integer.parseInt("100000", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33554432 + "'", int2 == 33554432);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        long long1 = java.lang.Integer.toUnsignedLong(1073741824);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1073741824L + "'", long1 == 1073741824L);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>(35);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean23 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean25 = strComparableSet20.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet30 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean31 = strComparableSet27.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet30);
        boolean boolean32 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet34 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableSet34.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet34.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean45 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean47 = strComparableSet42.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet49 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableSet49.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet49.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean54 = strComparableSet42.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet49);
        boolean boolean55 = strComparableSet37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean56 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor59 = strComparableSet58.iterator();
        boolean boolean60 = strComparableSet27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet63 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableSet63.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet66 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean67 = strComparableSet63.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet66);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet71 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean72 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean73 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean74 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean76 = strComparableSet71.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet78 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean79 = strComparableSet78.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet81 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean82 = strComparableSet78.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet81);
        boolean boolean83 = strComparableSet71.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet78);
        boolean boolean84 = strComparableSet71.isEmpty();
        boolean boolean85 = strComparableSet63.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet71);
        boolean boolean86 = strComparableSet3.contains((java.lang.Object) strComparableSet71);
        boolean boolean88 = strComparableSet71.add((java.lang.Comparable<java.lang.String>) "34000000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strComparableItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int int2 = java.lang.Integer.sum((-65), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        long long1 = java.lang.Integer.toUnsignedLong(15728896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15728896L + "'", long1 == 15728896L);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet4.remove((java.lang.Object) false);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean31 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean33 = strComparableSet28.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableSet35.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean39 = strComparableSet35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet38);
        boolean boolean40 = strComparableSet28.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean43 = strComparableSet42.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet42.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet45);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet50 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean53 = strComparableSet50.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean55 = strComparableSet50.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet57 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableSet57.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet60 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean61 = strComparableSet57.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean62 = strComparableSet50.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet57);
        boolean boolean63 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        boolean boolean64 = strComparableSet35.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream65 = strComparableSet50.parallelStream();
        boolean boolean66 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet50);
        int int67 = strComparableSet50.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strComparableStream65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int int1 = java.lang.Integer.reverse(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-134217728) + "'", int1 == (-134217728));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str1 = java.lang.Integer.toHexString((-513));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffdff" + "'", str1, "fffffdff");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet9.isEmpty();
        boolean boolean23 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        strComparableSet9.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean8 = strComparableSet3.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean15 = strComparableSet3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean16 = strComparableSet3.isEmpty();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean28 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.lang.Object[] objArray29 = strComparableSet27.toArray();
        boolean boolean30 = strComparableSet18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean31 = strComparableSet18.isEmpty();
        boolean boolean32 = strComparableSet3.remove((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        int int1 = java.lang.Integer.reverseBytes(33554432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        int int2 = java.lang.Integer.compare((-6), (-1879048192));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.HashSet<java.lang.Class<java.lang.Integer>[]> intClassArraySet1 = new java.util.HashSet<java.lang.Class<java.lang.Integer>[]>(2);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.lang.Object[] objArray6 = strComparableSet4.toArray();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "1");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet4.parallelStream();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableSet14.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableSet14.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean17 = strComparableSet14.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean19 = strComparableSet14.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableSet21.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean25 = strComparableSet21.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        boolean boolean26 = strComparableSet14.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean32 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean39 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean41 = strComparableSet36.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet43 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableSet43.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean47 = strComparableSet43.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        boolean boolean48 = strComparableSet36.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet43);
        boolean boolean49 = strComparableSet31.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean50 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        boolean boolean52 = strComparableSet10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        boolean boolean54 = strComparableSet10.add((java.lang.Comparable<java.lang.String>) "10000000000000000000000000000000");
        java.lang.Object[] objArray55 = strComparableSet10.toArray();
        boolean boolean56 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0, hi!, 10000000000000000000000000000000, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean7 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean9 = strComparableSet4.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean16 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean29 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean31 = strComparableSet26.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean37 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet36);
        boolean boolean38 = strComparableSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        boolean boolean39 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        boolean boolean40 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet26);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean42 = strComparableSet0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.lang.Object[] objArray43 = strComparableSet41.toArray();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet48 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean49 = strComparableSet45.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet48);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream50 = strComparableSet45.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableSet45.iterator();
        strComparableSet45.clear();
        boolean boolean53 = strComparableSet41.remove((java.lang.Object) strComparableSet45);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean56 = strComparableSet55.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet58 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean59 = strComparableSet55.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet58);
        boolean boolean61 = strComparableSet55.remove((java.lang.Object) 4294967289L);
        boolean boolean62 = strComparableSet45.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream63 = strComparableSet55.parallelStream();
        java.lang.Class<?> wildcardClass64 = strComparableStream63.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, hi!, 11111111111111111111111111111101]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableStream50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strComparableStream63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        boolean boolean15 = strComparableSet1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean12 = strComparableSet9.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean14 = strComparableSet9.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet19 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean20 = strComparableSet16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet19);
        boolean boolean21 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean22 = strComparableSet4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean24 = strComparableSet9.remove((java.lang.Object) 100);
        java.lang.Object[] objArray25 = strComparableSet9.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0, hi!, 11111111111111111111111111111101]");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int int1 = java.lang.Integer.bitCount(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        int int1 = java.lang.Integer.signum(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int int2 = java.lang.Integer.divideUnsigned(1048576, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29959 + "'", int2 == 29959);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        int int2 = java.lang.Integer.max(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableSet7.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean11 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        java.lang.Object[] objArray12 = strComparableSet10.toArray();
        boolean boolean13 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet10);
        boolean boolean14 = strComparableSet1.isEmpty();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        boolean boolean21 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "0");
        boolean boolean23 = strComparableSet18.contains((java.lang.Object) 10.0f);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableSet25.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean29 = strComparableSet25.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet28);
        boolean boolean30 = strComparableSet18.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet25);
        boolean boolean31 = strComparableSet1.contains((java.lang.Object) strComparableSet18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int int1 = java.lang.Integer.reverse(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1006632960) + "'", int1 == (-1006632960));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "11111111111111111111111111111101");
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean5 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        int int6 = strComparableSet4.size();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "12");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        int int1 = java.lang.Integer.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        int int1 = java.lang.Integer.numberOfTrailingZeros(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }
}

