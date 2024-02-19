package lang3;
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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int1 = java.lang.Integer.highestOneBit((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = java.lang.Integer.SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = java.lang.Integer.MIN_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int1 = java.lang.Integer.signum(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = java.lang.Integer.compare((-2147483648), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int1 = java.lang.Integer.reverseBytes((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-83886081) + "'", int1 == (-83886081));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-9), 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "211301422342" + "'", str2, "211301422342");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = java.lang.Integer.BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int2 = java.lang.Integer.max((int) '4', (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("211301422342", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = java.lang.Integer.compare(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = java.lang.Integer.min((int) (byte) 0, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str1 = java.lang.Integer.toOctalString((-10));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777766" + "'", str1, "37777777766");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int0 = java.lang.Integer.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Class<java.lang.Integer> intClass0 = java.lang.Integer.TYPE;
        org.junit.Assert.assertNotNull(intClass0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = java.lang.Integer.toOctalString((-8));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777770" + "'", str1, "37777777770");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int1 = java.lang.Integer.signum((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int1 = java.lang.Integer.reverse((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 738197504 + "'", int1 == 738197504);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int1 = java.lang.Integer.numberOfTrailingZeros(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("211301422342", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int2 = java.lang.Integer.rotateRight((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483600) + "'", int2 == (-2147483600));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = java.lang.Integer.sum((int) 'a', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(52, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1k" + "'", str2, "1k");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int1 = java.lang.Integer.bitCount(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int2 = java.lang.Integer.remainderUnsigned(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int2 = java.lang.Integer.compare(2, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int1 = java.lang.Integer.lowestOneBit((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("211301422342", (-83886081));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -83886081 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = java.lang.Integer.rotateRight((int) (byte) -1, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int1 = java.lang.Integer.bitCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int1 = java.lang.Integer.numberOfTrailingZeros(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("211301422342", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"211301422342\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("hi!", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        java.lang.Class<?> wildcardClass1 = booleanUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int2 = java.lang.Integer.compare(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        long long1 = java.lang.Integer.toUnsignedLong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967295L + "'", long1 == 4294967295L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str1 = java.lang.Integer.toBinaryString(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110" + "'", str1, "110");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str1 = java.lang.Integer.toHexString((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("211301422342");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"211301422342\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 7, (java.lang.Integer) 738197504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int2 = java.lang.Integer.divideUnsigned((-10), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1431655762 + "'", int2 == 1431655762);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int1 = java.lang.Integer.reverse((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-4), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483600), (-8));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2147483696" + "'", str2, "2147483696");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2147483696");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483696\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int2 = java.lang.Integer.rotateLeft(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int1 = java.lang.Integer.numberOfTrailingZeros(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int1 = java.lang.Integer.bitCount((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int2 = java.lang.Integer.sum((int) (short) 100, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1124 + "'", int2 == 1124);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int2 = java.lang.Integer.rotateLeft(100, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51200 + "'", int2 == 51200);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int1 = java.lang.Integer.reverse(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1073741824) + "'", int1 == (-1073741824));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str1 = java.lang.Integer.toOctalString(1342177280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12000000000" + "'", str1, "12000000000");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int1 = java.lang.Integer.numberOfLeadingZeros(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        long long1 = java.lang.Integer.toUnsignedLong((-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967286L + "'", long1 == 4294967286L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int1 = java.lang.Integer.numberOfLeadingZeros(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int1 = java.lang.Integer.highestOneBit(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int2 = java.lang.Integer.compareUnsigned((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int int1 = java.lang.Integer.signum((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int2 = java.lang.Integer.compare(52, 738197504);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967295" + "'", str1, "4294967295");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int2 = java.lang.Integer.max(9, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int1 = java.lang.Integer.reverseBytes(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(16777216);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16777216" + "'", str1, "16777216");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 100, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("37777777770");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777770\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int1 = java.lang.Integer.highestOneBit(51200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int1 = java.lang.Integer.lowestOneBit(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("211301422342", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"211301422342\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int1 = java.lang.Integer.numberOfLeadingZeros(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int2 = java.lang.Integer.min((-5), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int2 = java.lang.Integer.max(100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("37777777770");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777770\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        long long1 = java.lang.Integer.toUnsignedLong(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int1 = java.lang.Integer.highestOneBit(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-8));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111000" + "'", str1, "11111111111111111111111111111000");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int2 = java.lang.Integer.compareUnsigned(16, 1342177280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        long long1 = java.lang.Integer.toUnsignedLong(3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("11111111111111111111111111111000", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int2 = java.lang.Integer.max(8, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-4));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967292" + "'", str1, "4294967292");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = java.lang.Integer.toOctalString(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = java.lang.Integer.divideUnsigned((-5), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 613566755 + "'", int2 == 613566755);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int2 = java.lang.Integer.remainderUnsigned((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int1 = java.lang.Integer.highestOneBit(613566755);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long long1 = java.lang.Integer.toUnsignedLong(2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int1 = java.lang.Integer.lowestOneBit(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = java.lang.Integer.min(613566755, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int1 = java.lang.Integer.highestOneBit((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int2 = java.lang.Integer.rotateLeft(5, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671088640 + "'", int2 == 671088640);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int1 = java.lang.Integer.lowestOneBit(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long long1 = java.lang.Integer.toUnsignedLong((-2147483648));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483648L + "'", long1 == 2147483648L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int int2 = java.lang.Integer.max(1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = java.lang.Integer.toOctalString(1431655762);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12525252522" + "'", str1, "12525252522");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("16777216", 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 16777216 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int1 = java.lang.Integer.signum(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1k", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -7 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int2 = java.lang.Integer.max((-83886081), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int1 = java.lang.Integer.numberOfLeadingZeros(51200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", 103);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 103 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String str1 = java.lang.Integer.toHexString((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int1 = java.lang.Integer.highestOneBit(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str1 = java.lang.Integer.toBinaryString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int2 = java.lang.Integer.remainderUnsigned(5, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("12000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11111111111111111111111111111000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int2 = java.lang.Integer.min(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("37777777770");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777770\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Integer int1 = java.lang.Integer.getInteger("100000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4", 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 51200 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Integer int1 = java.lang.Integer.getInteger("12000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        long long1 = java.lang.Integer.toUnsignedLong(1024);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int1 = java.lang.Integer.numberOfLeadingZeros(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int2 = java.lang.Integer.compareUnsigned((-8), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int2 = java.lang.Integer.divideUnsigned(26, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1024);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1024" + "'", str1, "1024");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int1 = java.lang.Integer.lowestOneBit(1431655762);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int2 = java.lang.Integer.rotateRight(9, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 738197504, (java.lang.Integer) 103, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(9, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9" + "'", str2, "9");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int2 = java.lang.Integer.compareUnsigned(1, 1342177280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int1 = java.lang.Integer.lowestOneBit((-2147483600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = java.lang.Integer.min((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("12", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = java.lang.Integer.compare(1124, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("1k");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1k\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = java.lang.Integer.rotateRight((int) ' ', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int1 = java.lang.Integer.signum((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int2 = java.lang.Integer.max(1124, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1124 + "'", int2 == 1124);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int2 = java.lang.Integer.max((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777777" + "'", str1, "37777777777");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int1 = java.lang.Integer.bitCount(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("64", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "26" + "'", str1, "26");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int2 = java.lang.Integer.divideUnsigned((-3), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44278013 + "'", int2 == 44278013);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-6));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111010" + "'", str1, "11111111111111111111111111111010");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int1 = java.lang.Integer.signum((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10", 44278013);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 44278013 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int1 = java.lang.Integer.bitCount(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int2 = java.lang.Integer.rotateLeft((-5), 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268435457) + "'", int2 == (-268435457));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = java.lang.Integer.parseUnsignedInt("100", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int1 = java.lang.Integer.reverse(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 637534208 + "'", int1 == 637534208);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str1 = java.lang.Integer.toHexString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = java.lang.Integer.compare((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int int1 = java.lang.Integer.lowestOneBit((-83886081));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1024", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = java.lang.Integer.sum(0, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int1 = java.lang.Integer.parseInt("100000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100000 + "'", int1 == 100000);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int2 = java.lang.Integer.rotateRight(671088640, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 655360 + "'", int2 == 655360);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777777" + "'", str1, "37777777777");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String str1 = java.lang.Integer.toHexString((-1073741824));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c0000000" + "'", str1, "c0000000");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int2 = java.lang.Integer.rotateLeft(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int1 = java.lang.Integer.numberOfLeadingZeros(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str1 = java.lang.Integer.toBinaryString(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11010" + "'", str1, "11010");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = java.lang.Integer.rotateLeft(10, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741825 + "'", int2 == 1073741825);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int1 = java.lang.Integer.numberOfLeadingZeros(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-10), (java.lang.Integer) (-83886081));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int2 = java.lang.Integer.sum(0, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str1 = java.lang.Integer.toHexString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int1 = java.lang.Integer.highestOneBit((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int2 = java.lang.Integer.rotateLeft(16777216, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int1 = java.lang.Integer.reverseBytes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        long long1 = java.lang.Integer.toUnsignedLong(1010);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1010L + "'", long1 == 1010L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = java.lang.Integer.divideUnsigned(4, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int1 = java.lang.Integer.bitCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int int2 = java.lang.Integer.remainderUnsigned(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("c0000000", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int1 = java.lang.Integer.highestOneBit((-83886081));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = java.lang.Integer.rotateRight((-268435457), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777217) + "'", int2 == (-16777217));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("a", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1k", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 52 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int1 = java.lang.Integer.lowestOneBit(613566755);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int2 = java.lang.Integer.compareUnsigned(268435456, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = java.lang.Integer.sum((int) (byte) 10, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Integer int1 = java.lang.Integer.getInteger("a");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int int2 = java.lang.Integer.divideUnsigned((-1), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4194303 + "'", int2 == 4194303);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int int1 = java.lang.Integer.numberOfTrailingZeros(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("37777777766");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 37777777766 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str1 = java.lang.Integer.toHexString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int2 = java.lang.Integer.remainderUnsigned((-8), 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32760 + "'", int2 == 32760);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int1 = java.lang.Integer.signum(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str1 = java.lang.Integer.toOctalString((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777777" + "'", str1, "37777777777");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Integer int1 = java.lang.Integer.getInteger("hi!");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int2 = java.lang.Integer.rotateRight(671088640, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741825 + "'", int2 == 1073741825);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int int1 = java.lang.Integer.highestOneBit(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 16777216, (java.lang.Integer) (-1), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("110", (-16777217));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -16777217 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str1 = java.lang.Integer.toHexString((-100));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ffffff9c" + "'", str1, "ffffff9c");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int2 = java.lang.Integer.sum((-16777217), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777212) + "'", int2 == (-16777212));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = java.lang.Integer.min(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = java.lang.Integer.divideUnsigned(671088640, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6710886 + "'", int2 == 6710886);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str1 = java.lang.Integer.toOctalString(1024);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2000" + "'", str1, "2000");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = java.lang.Integer.toHexString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int1 = java.lang.Integer.bitCount(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = java.lang.Integer.rotateRight(1342177280, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1280 + "'", int2 == 1280);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int int2 = java.lang.Integer.sum(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int1 = java.lang.Integer.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = java.lang.Integer.rotateLeft(1, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134217728 + "'", int2 == 134217728);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int1 = java.lang.Integer.numberOfTrailingZeros(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("20", 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 110 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = java.lang.Integer.sum(268435456, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435479 + "'", int2 == 268435479);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int1 = java.lang.Integer.bitCount((-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str1 = java.lang.Integer.toOctalString(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int1 = java.lang.Integer.lowestOneBit(637534208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33554432 + "'", int1 == 33554432);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int2 = java.lang.Integer.sum(1073741824, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741834 + "'", int2 == 1073741834);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int1 = java.lang.Integer.parseInt("20");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int2 = java.lang.Integer.min(5, 613566755);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int1 = java.lang.Integer.bitCount((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int1 = java.lang.Integer.highestOneBit(655360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 524288 + "'", int1 == 524288);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int1 = java.lang.Integer.signum(1280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int2 = java.lang.Integer.compare((-83886081), 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str1 = java.lang.Integer.toHexString((-83886081));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "faffffff" + "'", str1, "faffffff");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int1 = java.lang.Integer.numberOfTrailingZeros(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = java.lang.Integer.compare(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = java.lang.Integer.compare((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int2 = java.lang.Integer.divideUnsigned((-7), 1073741834);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int int1 = java.lang.Integer.signum(103);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int1 = java.lang.Integer.lowestOneBit(32760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = java.lang.Integer.rotateLeft(5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("12000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = java.lang.Integer.rotateLeft(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = java.lang.Integer.divideUnsigned((int) '#', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int1 = java.lang.Integer.lowestOneBit(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("12525252522");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12525252522\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int2 = java.lang.Integer.compareUnsigned((-1), 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111110010" + "'", str1, "1111110010");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str1 = java.lang.Integer.toBinaryString(524288);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000000000000" + "'", str1, "10000000000000000000");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Integer int1 = java.lang.Integer.getInteger("");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int2 = java.lang.Integer.remainderUnsigned(100000, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("faffffff", 1124);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1124 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("c0000000", (-16777217));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -16777217 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("37777777766", 738197504);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 738197504 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int2 = java.lang.Integer.compareUnsigned(5, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int int1 = java.lang.Integer.highestOneBit(80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        long long1 = java.lang.Integer.toUnsignedLong((-6));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967290L + "'", long1 == 4294967290L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Integer int1 = java.lang.Integer.getInteger("37777777770");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int1 = java.lang.Integer.numberOfTrailingZeros(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("c0000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"c0000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2147483696", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("11111111111111111111111111111000", 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1010 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = java.lang.Integer.compareUnsigned(536870912, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int2 = java.lang.Integer.min(100, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int2 = java.lang.Integer.compareUnsigned(9, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int1 = java.lang.Integer.reverse(1073741825);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483646) + "'", int1 == (-2147483646));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int1 = java.lang.Integer.parseUnsignedInt("110");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = java.lang.Integer.remainderUnsigned(1024, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-6));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967290" + "'", str1, "4294967290");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int2 = java.lang.Integer.min((int) (short) 0, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = java.lang.Integer.parseUnsignedInt("2000", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 432 + "'", int2 == 432);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("37777777777");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777777\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int1 = java.lang.Integer.reverseBytes(32760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-125894656) + "'", int1 == (-125894656));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(655360);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "655360" + "'", str1, "655360");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1124, (java.lang.Integer) 8, (java.lang.Integer) 671088640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int2 = java.lang.Integer.remainderUnsigned(1073741834, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(536870912, 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20000000" + "'", str2, "20000000");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int1 = java.lang.Integer.numberOfTrailingZeros(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int2 = java.lang.Integer.rotateLeft((-16777212), 44278013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1612709888) + "'", int2 == (-1612709888));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-10));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111110110" + "'", str1, "11111111111111111111111111110110");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1612709888));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int1 = java.lang.Integer.highestOneBit(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int2 = java.lang.Integer.remainderUnsigned((-8), 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 469762040 + "'", int2 == 469762040);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(32768);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32768" + "'", str1, "32768");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        long long1 = java.lang.Integer.toUnsignedLong(32768);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32768L + "'", long1 == 32768L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int1 = java.lang.Integer.numberOfTrailingZeros(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int1 = java.lang.Integer.bitCount(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int2 = java.lang.Integer.parseInt("23", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 268435479, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int2 = java.lang.Integer.min(1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int int2 = java.lang.Integer.min(31, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int2 = java.lang.Integer.compareUnsigned(524288, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int1 = java.lang.Integer.parseUnsignedInt("25");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43" + "'", str1, "43");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-16777212), 1024);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4278190084" + "'", str2, "4278190084");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str1 = java.lang.Integer.toOctalString((-125894656));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37037600000" + "'", str1, "37037600000");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -6 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int1 = java.lang.Integer.highestOneBit(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int1 = java.lang.Integer.parseInt("1010");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1010 + "'", int1 == 1010);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100000, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = java.lang.Integer.divideUnsigned(100, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int2 = java.lang.Integer.rotateRight((int) '#', 134217728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int2 = java.lang.Integer.min(1, 51200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97" + "'", str1, "97");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1073741834, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10000000012" + "'", str2, "10000000012");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int2 = java.lang.Integer.rotateRight(100000, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200000 + "'", int2 == 200000);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int1 = java.lang.Integer.bitCount((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(32760, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvo" + "'", str2, "vvo");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int1 = java.lang.Integer.bitCount(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-2), (java.lang.Integer) (-268435457));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int int1 = java.lang.Integer.reverseBytes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) 100, 1010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26214400 + "'", int2 == 26214400);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1073741824));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int2 = java.lang.Integer.compare(0, 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int2 = java.lang.Integer.divideUnsigned(2147483647, (-1612709888));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int2 = java.lang.Integer.rotateRight(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int1 = java.lang.Integer.numberOfTrailingZeros(637534208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("hi!", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("16777216", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(200000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200000" + "'", str1, "200000");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int1 = java.lang.Integer.reverse(1010);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1337982976 + "'", int1 == 1337982976);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int1 = java.lang.Integer.parseUnsignedInt("23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int2 = java.lang.Integer.compareUnsigned(26214400, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int2 = java.lang.Integer.rotateRight((-8), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483644 + "'", int2 == 2147483644);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = java.lang.Integer.remainderUnsigned(671088640, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("4", 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073741824 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(1124, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int1 = java.lang.Integer.reverseBytes(655360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2560 + "'", int1 == 2560);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = java.lang.Integer.divideUnsigned(0, 268435479);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str1 = java.lang.Integer.toHexString(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        long long1 = java.lang.Integer.toUnsignedLong(1431655762);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1431655762L + "'", long1 == 1431655762L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = java.lang.Integer.sum(469762040, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 469762039 + "'", int2 == 469762039);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int2 = java.lang.Integer.divideUnsigned((int) '#', 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = java.lang.Integer.min((-4), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        long long1 = java.lang.Integer.toUnsignedLong(738197504);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 738197504L + "'", long1 == 738197504L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(32760, 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1mc0" + "'", str2, "1mc0");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 23, (java.lang.Integer) 200000, (java.lang.Integer) (-16777212));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("37777777770");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777770\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16" + "'", str1, "16");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int1 = java.lang.Integer.bitCount((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        long long1 = java.lang.Integer.toUnsignedLong(32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = java.lang.Integer.sum(0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 29, (java.lang.Integer) 16, (java.lang.Integer) 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = java.lang.Integer.divideUnsigned(1073741825, 51200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20971 + "'", int2 == 20971);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        long long1 = java.lang.Integer.toUnsignedLong(637534208);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 637534208L + "'", long1 == 637534208L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int1 = java.lang.Integer.signum(1124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str1 = java.lang.Integer.toHexString((-2));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffffe" + "'", str1, "fffffffe");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int1 = java.lang.Integer.signum(80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("10000000000000000000", (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -7 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int2 = java.lang.Integer.max((-9), 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int1 = java.lang.Integer.bitCount((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = java.lang.Integer.max(32760, 469762040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 469762040 + "'", int2 == 469762040);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int2 = java.lang.Integer.parseUnsignedInt("4294967292", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("97", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int1 = java.lang.Integer.reverse(432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 226492416 + "'", int1 == 226492416);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = java.lang.Integer.min(10, 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int int2 = java.lang.Integer.compareUnsigned((-100), 6710886);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int2 = java.lang.Integer.rotateRight(32760, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8386560 + "'", int2 == 8386560);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int1 = java.lang.Integer.lowestOneBit((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int1 = java.lang.Integer.bitCount((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        long long1 = java.lang.Integer.toUnsignedLong((-268435457));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4026531839L + "'", long1 == 4026531839L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int1 = java.lang.Integer.bitCount(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-2147483646));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2147483696", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483696\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int1 = java.lang.Integer.reverseBytes(268435456);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int int1 = java.lang.Integer.lowestOneBit(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int2 = java.lang.Integer.rotateLeft(1124, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 562 + "'", int2 == 562);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int1 = java.lang.Integer.parseUnsignedInt("16777216");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int int2 = java.lang.Integer.rotateRight(33554432, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1010");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int1 = java.lang.Integer.reverse((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1879048191 + "'", int1 == 1879048191);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-16777217));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111110111111111111111111111111" + "'", str1, "11111110111111111111111111111111");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37777777777", 1280);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1280 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = java.lang.Integer.compareUnsigned((int) (short) 100, 268435479);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("fffffffe");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"fffffffe\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int2 = java.lang.Integer.rotateRight((-2147483646), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int1 = java.lang.Integer.numberOfLeadingZeros(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str1 = java.lang.Integer.toHexString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int2 = java.lang.Integer.max(432, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 432 + "'", int2 == 432);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int int1 = java.lang.Integer.parseUnsignedInt("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int2 = java.lang.Integer.rotateLeft((int) (byte) 100, 469762040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1677721600 + "'", int2 == 1677721600);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int2 = java.lang.Integer.max(10240, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("10000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int2 = java.lang.Integer.min(671088640, 524288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 524288 + "'", int2 == 524288);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10000000012", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000012\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int2 = java.lang.Integer.min(1431655762, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int2 = java.lang.Integer.min(10240, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int1 = java.lang.Integer.bitCount(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int1 = java.lang.Integer.lowestOneBit(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("211301422342");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"211301422342\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        long long1 = java.lang.Integer.toUnsignedLong((-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967294L + "'", long1 == 4294967294L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int1 = java.lang.Integer.bitCount(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("64", 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1024 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int2 = java.lang.Integer.remainderUnsigned(1677721600, 2147483644);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1677721600 + "'", int2 == 1677721600);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int1 = java.lang.Integer.reverseBytes((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1627389952 + "'", int1 == 1627389952);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int1 = java.lang.Integer.reverse(110);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1979711488 + "'", int1 == 1979711488);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = java.lang.Integer.min(613566755, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int1 = java.lang.Integer.highestOneBit((-9));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1111110010");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str1 = java.lang.Integer.toHexString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int1 = java.lang.Integer.parseUnsignedInt("52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 44278013, (java.lang.Integer) 226492416, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int2 = java.lang.Integer.sum(1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = java.lang.Integer.divideUnsigned(44278013, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 524288, (java.lang.Integer) 3, (java.lang.Integer) 33554432);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int2 = java.lang.Integer.rotateRight(26214400, 524288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26214400 + "'", int2 == 26214400);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str1 = java.lang.Integer.toOctalString(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43" + "'", str1, "43");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("10000000012");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000012\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("25", (-268435457));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -268435457 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = java.lang.Integer.remainderUnsigned(226492416, (-1612709888));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 226492416 + "'", int2 == 226492416);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int2 = java.lang.Integer.sum(2147483647, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483552) + "'", int2 == (-2147483552));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int1 = java.lang.Integer.reverseBytes(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83886080 + "'", int1 == 83886080);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int2 = java.lang.Integer.compare(100, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int1 = java.lang.Integer.signum((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int1 = java.lang.Integer.reverseBytes((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String str1 = java.lang.Integer.toOctalString(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144" + "'", str1, "144");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111101" + "'", str1, "11111111111111111111111111111101");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int2 = java.lang.Integer.compare((-7), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int2 = java.lang.Integer.rotateRight(1073741825, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int2 = java.lang.Integer.compare(83886080, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Integer int1 = java.lang.Integer.getInteger("52");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11010", 200000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 200000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int1 = java.lang.Integer.lowestOneBit(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str1 = java.lang.Integer.toHexString(655360);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0000" + "'", str1, "a0000");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int1 = java.lang.Integer.reverseBytes(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 385875968 + "'", int1 == 385875968);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int1 = java.lang.Integer.signum(32760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int2 = java.lang.Integer.rotateRight((int) (short) 0, 32760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int2 = java.lang.Integer.compare((-16777212), 200000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str1 = java.lang.Integer.toHexString((-2147483646));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "80000002" + "'", str1, "80000002");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int2 = java.lang.Integer.compare((-16777212), 1124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int1 = java.lang.Integer.signum((-2147483552));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int1 = java.lang.Integer.numberOfTrailingZeros(61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int int1 = java.lang.Integer.lowestOneBit(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1k", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int2 = java.lang.Integer.sum(0, 83886080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83886080 + "'", int2 == 83886080);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4294967295");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("43", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int2 = java.lang.Integer.min(31, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int2 = java.lang.Integer.rotateLeft(637534208, 385875968);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 637534208 + "'", int2 == 637534208);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int2 = java.lang.Integer.min(385875968, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(200000, 1073741834);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200000" + "'", str2, "200000");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int1 = java.lang.Integer.lowestOneBit(1124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("4294967292");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967292\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str1 = java.lang.Integer.toHexString(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int1 = java.lang.Integer.signum(1879048191);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int2 = java.lang.Integer.divideUnsigned(226492416, 268435479);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Integer int1 = java.lang.Integer.getInteger("37777777777");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int2 = java.lang.Integer.min(5, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int2 = java.lang.Integer.rotateRight(31, 11010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741817) + "'", int2 == (-1073741817));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        long long1 = java.lang.Integer.toUnsignedLong(1627389952);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1627389952L + "'", long1 == 1627389952L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str1 = java.lang.Integer.toOctalString(562);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1062" + "'", str1, "1062");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-2147483600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        long long1 = java.lang.Integer.toUnsignedLong(100000);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100000L + "'", long1 == 100000L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int2 = java.lang.Integer.parseInt("6", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int2 = java.lang.Integer.min(2, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int2 = java.lang.Integer.rotateRight(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        long long1 = java.lang.Integer.toUnsignedLong(80);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 80L + "'", long1 == 80L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int1 = java.lang.Integer.lowestOneBit(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Integer int1 = java.lang.Integer.getInteger("211301422342");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(655360, (-5));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "655360" + "'", str2, "655360");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String str1 = java.lang.Integer.toOctalString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int2 = java.lang.Integer.sum((-1073741817), (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741821) + "'", int2 == (-1073741821));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = java.lang.Integer.max(0, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1073741824);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1073741824" + "'", str1, "1073741824");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        long long1 = java.lang.Integer.toUnsignedLong(28);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int int1 = java.lang.Integer.reverse(655360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20480 + "'", int1 == 20480);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str1 = java.lang.Integer.toBinaryString(655360);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10100000000000000000" + "'", str1, "10100000000000000000");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("10000000012");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000012\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int2 = java.lang.Integer.rotateRight(20000000, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 156250 + "'", int2 == 156250);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 385875968, (java.lang.Integer) 1124, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int1 = java.lang.Integer.signum(1073741834);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int2 = java.lang.Integer.compare(61, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int1 = java.lang.Integer.highestOneBit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("211301422342");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"211301422342\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int2 = java.lang.Integer.sum(64, 1627389952);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1627390016 + "'", int2 == 1627390016);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

