package lang3;
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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100100" + "'", str1, "1100100");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int1 = java.lang.Integer.numberOfTrailingZeros(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int1 = java.lang.Integer.numberOfLeadingZeros(655360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("4294967292", 44278013);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 44278013 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "40" + "'", str1, "40");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int1 = java.lang.Integer.reverse(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1062");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int1 = java.lang.Integer.numberOfTrailingZeros(8386560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1627389952, (-6));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1627389952" + "'", str2, "1627389952");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(6710886, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int1 = java.lang.Integer.reverse(4194303);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1024) + "'", int1 == (-1024));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int int2 = java.lang.Integer.divideUnsigned(432, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("", 26214400);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 26214400 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int1 = java.lang.Integer.parseInt("23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str1 = java.lang.Integer.toHexString(7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 1677721600, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        long long1 = java.lang.Integer.toUnsignedLong((-4));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967292L + "'", long1 == 4294967292L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int int2 = java.lang.Integer.min(1073741824, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int2 = java.lang.Integer.compare(110, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int2 = java.lang.Integer.sum(0, 1342177280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1342177280 + "'", int2 == 1342177280);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("vvo", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 64 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int2 = java.lang.Integer.min(536870912, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int int2 = java.lang.Integer.max((-1073741821), 6710886);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6710886 + "'", int2 == 6710886);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int int2 = java.lang.Integer.rotateRight((-3), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8193) + "'", int2 == (-8193));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int1 = java.lang.Integer.highestOneBit((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.String str1 = java.lang.Integer.toOctalString(64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int int1 = java.lang.Integer.signum(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.Integer int1 = java.lang.Integer.getInteger("144");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int int2 = java.lang.Integer.max(52, (-16777212));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int1 = java.lang.Integer.highestOneBit(562);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int1 = java.lang.Integer.lowestOneBit(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int int2 = java.lang.Integer.divideUnsigned(10, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("a", (-83886081));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -83886081 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("a0000", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("", 562);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 562 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str1 = java.lang.Integer.toHexString(44278013);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2a3a0fd" + "'", str1, "2a3a0fd");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int1 = java.lang.Integer.reverseBytes(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1073741817), (java.lang.Integer) 9, (java.lang.Integer) (-268435457));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int2 = java.lang.Integer.compare(637534208, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("110", 32760);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 32760 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = java.lang.Integer.divideUnsigned(0, 385875968);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(20971, 637534208);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20971" + "'", str2, "20971");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        int int2 = java.lang.Integer.compareUnsigned((-125894656), 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int1 = java.lang.Integer.parseInt("1100100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100100 + "'", int1 == 1100100);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int2 = java.lang.Integer.min(40, (-83886081));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83886081) + "'", int2 == (-83886081));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(103, 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "103" + "'", str2, "103");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int2 = java.lang.Integer.compare((-8193), 655360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1, 200000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int2 = java.lang.Integer.compare(97, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        long long1 = java.lang.Integer.toUnsignedLong((-1612709888));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2682257408L + "'", long1 == 2682257408L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int2 = java.lang.Integer.rotateRight((int) '#', 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2293760 + "'", int2 == 2293760);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int2 = java.lang.Integer.rotateRight(52, (-2147483552));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 512, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("12000000000", 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 110 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1879048191, 1100100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1879048191" + "'", str2, "1879048191");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int2 = java.lang.Integer.rotateRight(16, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int1 = java.lang.Integer.parseUnsignedInt("4294967292");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str1 = java.lang.Integer.toBinaryString(20971);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101000111101011" + "'", str1, "101000111101011");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int2 = java.lang.Integer.sum(25, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int2 = java.lang.Integer.min((-83886081), (-83886081));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83886081) + "'", int2 == (-83886081));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("11111111111111111111111111111010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111010\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28" + "'", str1, "28");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("101000111101011", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.String str1 = java.lang.Integer.toHexString(103);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "67" + "'", str1, "67");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        int int2 = java.lang.Integer.rotateLeft(97, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483600) + "'", int2 == (-2147483600));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int1 = java.lang.Integer.parseInt("28");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str1 = java.lang.Integer.toHexString((-1073741821));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c0000003" + "'", str1, "c0000003");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int1 = java.lang.Integer.parseUnsignedInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int2 = java.lang.Integer.min(2560, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(268435479);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "268435479" + "'", str1, "268435479");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int1 = java.lang.Integer.bitCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int2 = java.lang.Integer.rotateRight(32, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int int1 = java.lang.Integer.highestOneBit(6710886);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4194304 + "'", int1 == 4194304);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int1 = java.lang.Integer.reverseBytes(562);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 838991872 + "'", int1 == 838991872);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int2 = java.lang.Integer.divideUnsigned(110, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        int int1 = java.lang.Integer.parseInt("26");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4278190084");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int1 = java.lang.Integer.bitCount(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int2 = java.lang.Integer.remainderUnsigned((-268435457), (-83886081));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268435457) + "'", int2 == (-268435457));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int1 = java.lang.Integer.reverseBytes(385875968);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(385875968, (-100));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "385875968" + "'", str2, "385875968");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int2 = java.lang.Integer.sum(23, 32760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32783 + "'", int2 == 32783);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int1 = java.lang.Integer.bitCount(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int2 = java.lang.Integer.rotateRight(1879048191, 1431655762);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9217) + "'", int2 == (-9217));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int2 = java.lang.Integer.rotateLeft(7, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741823) + "'", int2 == (-1073741823));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        int int2 = java.lang.Integer.remainderUnsigned(637534208, (-16777212));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 637534208 + "'", int2 == 637534208);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(83886080, (-2147483600));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "83886080" + "'", str2, "83886080");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int int2 = java.lang.Integer.compareUnsigned(2560, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int2 = java.lang.Integer.sum(11, 20480);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20491 + "'", int2 == 20491);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = java.lang.Integer.rotateRight(25, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int2 = java.lang.Integer.rotateLeft(268435479, 1879048191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2013265909) + "'", int2 == (-2013265909));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int1 = java.lang.Integer.reverseBytes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.String str1 = java.lang.Integer.toBinaryString(226492416);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1101100000000000000000000000" + "'", str1, "1101100000000000000000000000");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int1 = java.lang.Integer.signum(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        int int2 = java.lang.Integer.remainderUnsigned((int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int2 = java.lang.Integer.min(469762039, 6710886);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6710886 + "'", int2 == 6710886);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int2 = java.lang.Integer.remainderUnsigned(134217728, (-1073741821));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134217728 + "'", int2 == 134217728);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int1 = java.lang.Integer.reverse(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335544320 + "'", int1 == 335544320);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int int1 = java.lang.Integer.highestOneBit(103);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str1 = java.lang.Integer.toHexString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = java.lang.Integer.sum(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int2 = java.lang.Integer.min(0, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("2147483696");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483696\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1010", (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1073741824 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        int int2 = java.lang.Integer.min((int) '4', (-16777212));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777212) + "'", int2 == (-16777212));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-2147483646));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2147483650" + "'", str1, "2147483650");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-3), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967293" + "'", str2, "4294967293");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1342177280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int2 = java.lang.Integer.rotateRight(10, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5120 + "'", int2 == 5120);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str1 = java.lang.Integer.toHexString(200000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30d40" + "'", str1, "30d40");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("101000111101011", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"101000111101011\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("2147483650");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483650\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(29, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11101" + "'", str2, "11101");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int1 = java.lang.Integer.highestOneBit(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int int2 = java.lang.Integer.rotateLeft(100, (-2147483552));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1342, 134217728);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1342" + "'", str2, "1342");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int1 = java.lang.Integer.parseUnsignedInt("1879048191");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1879048191 + "'", int1 == 1879048191);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = java.lang.Integer.compareUnsigned(23, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int1 = java.lang.Integer.parseInt("144");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int int1 = java.lang.Integer.parseUnsignedInt("16");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int int2 = java.lang.Integer.rotateLeft((-6), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-671088641) + "'", int2 == (-671088641));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int2 = java.lang.Integer.compare((int) (short) 0, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int int1 = java.lang.Integer.signum(671088640);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.Integer int1 = java.lang.Integer.getInteger("655360");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str1 = java.lang.Integer.toOctalString((-671088641));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32777777777" + "'", str1, "32777777777");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = java.lang.Integer.divideUnsigned((-4), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107374182 + "'", int2 == 107374182);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str1 = java.lang.Integer.toHexString((-16777217));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "feffffff" + "'", str1, "feffffff");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(385875968, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "385875968" + "'", str2, "385875968");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("20971", 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1677721600 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int2 = java.lang.Integer.parseInt("7", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int int1 = java.lang.Integer.reverse((-1024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4194303 + "'", int1 == 4194303);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("4", 385875968);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 385875968 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int1 = java.lang.Integer.highestOneBit(83886080);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int int2 = java.lang.Integer.compare(7, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int1 = java.lang.Integer.numberOfTrailingZeros(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int1 = java.lang.Integer.numberOfLeadingZeros(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int int2 = java.lang.Integer.compare(20000000, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int1 = java.lang.Integer.parseInt("20971");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20971 + "'", int1 == 20971);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int1 = java.lang.Integer.numberOfLeadingZeros(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int2 = java.lang.Integer.max(268435479, (-125894656));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435479 + "'", int2 == 268435479);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-1073741821));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3221225475" + "'", str1, "3221225475");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.Integer int1 = java.lang.Integer.getInteger("101000111101011");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 12, (java.lang.Integer) 110, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(738197504, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5400000000" + "'", str2, "5400000000");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("28", 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1010 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int1 = java.lang.Integer.signum(4194304);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int2 = java.lang.Integer.divideUnsigned(35, 134217728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int int2 = java.lang.Integer.compareUnsigned(562, 1124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int2 = java.lang.Integer.sum(24, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671088664 + "'", int2 == 671088664);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int int2 = java.lang.Integer.compareUnsigned((-7), 562);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int1 = java.lang.Integer.numberOfLeadingZeros(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int2 = java.lang.Integer.rotateLeft(29, 156250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1946157056 + "'", int2 == 1946157056);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int2 = java.lang.Integer.compare(838991872, (-1073741817));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 613566755, (java.lang.Integer) (-2013265909), (java.lang.Integer) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("101000111101011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 101000111101011 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int1 = java.lang.Integer.numberOfLeadingZeros(562);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int int1 = java.lang.Integer.signum(200000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1k");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int2 = java.lang.Integer.max((-3), (-671088641));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int2 = java.lang.Integer.compareUnsigned(1024, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int int1 = java.lang.Integer.reverse((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 637534208 + "'", int1 == 637534208);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("fffffffe", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int int2 = java.lang.Integer.rotateLeft(110, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("52", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int2 = java.lang.Integer.rotateRight(1627390016, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1627390016 + "'", int2 == 1627390016);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int2 = java.lang.Integer.rotateRight((-1073741817), 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 507904 + "'", int2 == 507904);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int1 = java.lang.Integer.highestOneBit(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) '4', 32783);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int1 = java.lang.Integer.reverse((-1612709888));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2041 + "'", int1 == 2041);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int2 = java.lang.Integer.max(23, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int2 = java.lang.Integer.compare((-671088641), (-9217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int int2 = java.lang.Integer.rotateRight(637534208, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39845888 + "'", int2 == 39845888);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int int2 = java.lang.Integer.divideUnsigned(144, 385875968);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int int1 = java.lang.Integer.reverseBytes((-9217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2359297) + "'", int1 == (-2359297));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int1 = java.lang.Integer.bitCount(838991872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int2 = java.lang.Integer.rotateRight((-9217), (-2013265909));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483643 + "'", int2 == 2147483643);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int2 = java.lang.Integer.rotateRight(20480, 1431655762);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335544320 + "'", int2 == 335544320);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("16", 152);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 152 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("12000000000", 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1627389952 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int int1 = java.lang.Integer.signum(469762040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 469762040, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("c0000000", 268435479);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 268435479 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int int2 = java.lang.Integer.parseInt("144", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 625 + "'", int2 == 625);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int2 = java.lang.Integer.sum((-16777217), 1010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16776207) + "'", int2 == (-16776207));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        int int2 = java.lang.Integer.max(25, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int int1 = java.lang.Integer.reverseBytes(1431655762);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1381324117 + "'", int1 == 1381324117);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String str1 = java.lang.Integer.toHexString(4194303);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3fffff" + "'", str1, "3fffff");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int int2 = java.lang.Integer.min((int) (short) 10, 625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("10100000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1073741821), 655360);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3221225475" + "'", str2, "3221225475");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 61, (java.lang.Integer) 16777216, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int1 = java.lang.Integer.parseInt("1073741824");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("37777777770", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777770\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.Integer int1 = java.lang.Integer.getInteger("25");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(738197504);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "738197504" + "'", str1, "738197504");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int1 = java.lang.Integer.reverseBytes(10240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2621440 + "'", int1 == 2621440);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str1 = java.lang.Integer.toHexString(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int2 = java.lang.Integer.compare((-16777217), (-9217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4194303, (java.lang.Integer) (-1073741821), (java.lang.Integer) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("3221225475", 32760);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 32760 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("a0000", 1010);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1010 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10000000012", (-2359297));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2359297 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int1 = java.lang.Integer.parseUnsignedInt("3221225475");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1073741821) + "'", int1 == (-1073741821));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int2 = java.lang.Integer.rotateRight(0, 469762040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-16777212));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4278190084" + "'", str1, "4278190084");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 8386560, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int2 = java.lang.Integer.max(613566755, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 613566755 + "'", int2 == 613566755);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("12000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int2 = java.lang.Integer.rotateLeft(1073741825, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335544320 + "'", int2 == 335544320);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("c0000003", 625);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 625 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("32777777777");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32777777777\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("12", (-268435457));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -268435457 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967295" + "'", str1, "4294967295");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int int1 = java.lang.Integer.lowestOneBit(20000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = java.lang.Integer.sum(67108864, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67108863 + "'", int2 == 67108863);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int2 = java.lang.Integer.rotateRight((-268435457), (-2359297));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870913) + "'", int2 == (-536870913));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1879048191");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int2 = java.lang.Integer.sum(10, (-1073741821));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741811) + "'", int2 == (-1073741811));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int1 = java.lang.Integer.numberOfTrailingZeros(625);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int1 = java.lang.Integer.reverse((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("12525252522");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12525252522\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String str1 = java.lang.Integer.toBinaryString(432);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110110000" + "'", str1, "110110000");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int int2 = java.lang.Integer.sum(144, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int2 = java.lang.Integer.divideUnsigned(10240, 39845888);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int2 = java.lang.Integer.rotateRight(1073741834, 469762040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2624 + "'", int2 == 2624);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("738197504", 1337982976);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1337982976 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int int1 = java.lang.Integer.bitCount((-1073741823));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int int1 = java.lang.Integer.numberOfTrailingZeros(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int int1 = java.lang.Integer.highestOneBit(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str1 = java.lang.Integer.toOctalString(1627389952);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14100000000" + "'", str1, "14100000000");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-9));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967287" + "'", str1, "4294967287");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int1 = java.lang.Integer.lowestOneBit(26214400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int int1 = java.lang.Integer.parseUnsignedInt("1342");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342 + "'", int1 == 1342);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int2 = java.lang.Integer.rotateLeft(10, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2560 + "'", int2 == 2560);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1946157056, 107374182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1946157056" + "'", str2, "1946157056");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("80000002", 671088664);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 671088664 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-2147483646));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000000000000000000000010" + "'", str1, "10000000000000000000000000000010");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int1 = java.lang.Integer.highestOneBit(1100100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String str1 = java.lang.Integer.toOctalString(2147483647);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "17777777777" + "'", str1, "17777777777");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37777777770", 8386560);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 8386560 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int1 = java.lang.Integer.signum(562);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.Integer int1 = java.lang.Integer.getInteger("11111110111111111111111111111111");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int2 = java.lang.Integer.remainderUnsigned(536870912, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 536870912 + "'", int2 == 536870912);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int int2 = java.lang.Integer.remainderUnsigned(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = java.lang.Integer.remainderUnsigned(5, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str1 = java.lang.Integer.toBinaryString(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11001" + "'", str1, "11001");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int1 = java.lang.Integer.numberOfLeadingZeros(26214400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str1 = java.lang.Integer.toOctalString((-1073741823));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30000000001" + "'", str1, "30000000001");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int int2 = java.lang.Integer.divideUnsigned(39845888, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 398458 + "'", int2 == 398458);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int2 = java.lang.Integer.rotateLeft(64, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = java.lang.Integer.rotateLeft((int) '4', 20000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("faffffff");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"faffffff\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("30000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"30000000001\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        long long1 = java.lang.Integer.toUnsignedLong(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int1 = java.lang.Integer.parseUnsignedInt("4278190084");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777212) + "'", int1 == (-16777212));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1342", 4194304);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 4194304 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int1 = java.lang.Integer.highestOneBit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", (-2147483600));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147483600 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        long long1 = java.lang.Integer.toUnsignedLong((-1073741823));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3221225473L + "'", long1 == 3221225473L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int1 = java.lang.Integer.signum((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int1 = java.lang.Integer.numberOfTrailingZeros(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int int1 = java.lang.Integer.lowestOneBit((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-16777217));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(152, 1946157056);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "152" + "'", str2, "152");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1073741824", 671088664);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 671088664 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(20491, 1280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20491" + "'", str2, "20491");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1337982976);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1337982976" + "'", str1, "1337982976");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int2 = java.lang.Integer.sum(256, (-2147483600));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483344) + "'", int2 == (-2147483344));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int2 = java.lang.Integer.divideUnsigned(0, 1677721600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int2 = java.lang.Integer.rotateLeft((-2013265909), (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2013265909) + "'", int2 == (-2013265909));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int2 = java.lang.Integer.divideUnsigned((-1024), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4194303 + "'", int2 == 4194303);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(613566755);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "613566755" + "'", str1, "613566755");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int int2 = java.lang.Integer.rotateLeft(1879048191, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-150994945) + "'", int2 == (-150994945));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int1 = java.lang.Integer.lowestOneBit(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int int1 = java.lang.Integer.signum(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1627389952);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1627389952" + "'", str1, "1627389952");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "152" + "'", str1, "152");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.Integer int1 = java.lang.Integer.getInteger("3fffff");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("28", (-16777212));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -16777212 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int1 = java.lang.Integer.parseInt("1111110010");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1111110010 + "'", int1 == 1111110010);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", 1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073741825 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int1 = java.lang.Integer.bitCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int1 = java.lang.Integer.parseInt("52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int int2 = java.lang.Integer.compare(110, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = java.lang.Integer.compare(0, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int1 = java.lang.Integer.bitCount((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2041);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111001" + "'", str1, "11111111001");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int2 = java.lang.Integer.max(22, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        long long1 = java.lang.Integer.toUnsignedLong(1979711488);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1979711488L + "'", long1 == 1979711488L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = java.lang.Integer.compareUnsigned((int) (byte) 100, (-9217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4294967293");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int1 = java.lang.Integer.lowestOneBit((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int int2 = java.lang.Integer.divideUnsigned((-2), 432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9942053 + "'", int2 == 9942053);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int2 = java.lang.Integer.max(4194303, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4194303 + "'", int2 == 4194303);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 512, (java.lang.Integer) 16, (java.lang.Integer) (-2147483344));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1101100000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1101100000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1k", (-2147483344));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147483344 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int int1 = java.lang.Integer.reverse((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741823 + "'", int1 == 1073741823);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("17777777777", 2041);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 2041 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int int2 = java.lang.Integer.sum(0, (-1073741821));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741821) + "'", int2 == (-1073741821));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int2 = java.lang.Integer.rotateRight(128, 4194304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int2 = java.lang.Integer.rotateRight(24, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int1 = java.lang.Integer.signum(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str1 = java.lang.Integer.toBinaryString(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11100" + "'", str1, "11100");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("vvo");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"vvo\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int2 = java.lang.Integer.compareUnsigned((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int int1 = java.lang.Integer.numberOfTrailingZeros(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("28", (-2147483600));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147483600 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        int int1 = java.lang.Integer.parseUnsignedInt("613566755");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 613566755 + "'", int1 == 613566755);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11010" + "'", str1, "11010");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int1 = java.lang.Integer.lowestOneBit(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 64, (java.lang.Integer) 1979711488, (java.lang.Integer) 469762040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 51200, (java.lang.Integer) 1946157056, (java.lang.Integer) 107374182);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int int1 = java.lang.Integer.lowestOneBit(67108863);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int int1 = java.lang.Integer.reverseBytes((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int1 = java.lang.Integer.parseInt("11101");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11101 + "'", int1 == 11101);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        long long1 = java.lang.Integer.toUnsignedLong(398458);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 398458L + "'", long1 == 398458L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-83886081), (java.lang.Integer) 103, (java.lang.Integer) (-268435457));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int2 = java.lang.Integer.rotateRight(385875968, (-1073741824));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 385875968 + "'", int2 == 385875968);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int2 = java.lang.Integer.rotateRight(536870912, 107374182);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388608 + "'", int2 == 8388608);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(24, 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24" + "'", str2, "24");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str1 = java.lang.Integer.toOctalString(51200);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144000" + "'", str1, "144000");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int int1 = java.lang.Integer.lowestOneBit(562);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int2 = java.lang.Integer.remainderUnsigned((-1), 1431655762);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int1 = java.lang.Integer.highestOneBit(11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(536870912);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "536870912" + "'", str1, "536870912");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("3221225475", (-2359297));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2359297 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-268435457));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11101111111111111111111111111111" + "'", str1, "11101111111111111111111111111111");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int2 = java.lang.Integer.rotateRight(30, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870911) + "'", int2 == (-536870911));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int1 = java.lang.Integer.signum((-2147483344));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int2 = java.lang.Integer.compareUnsigned(16, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.lang.String str1 = java.lang.Integer.toBinaryString(44278013);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10101000111010000011111101" + "'", str1, "10101000111010000011111101");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int2 = java.lang.Integer.divideUnsigned(3, 2560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int int2 = java.lang.Integer.compare(20491, (-16777212));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int2 = java.lang.Integer.min(637534208, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33554432 + "'", int2 == 33554432);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37037600000", 1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073741825 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1073741824", 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1073741824\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int1 = java.lang.Integer.highestOneBit((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("30000000001", 1946157056);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1946157056 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int int1 = java.lang.Integer.bitCount(536870912);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int int2 = java.lang.Integer.max((-536870913), 625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 625 + "'", int2 == 625);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int2 = java.lang.Integer.rotateRight((-6), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(398458, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int2 = java.lang.Integer.max(32768, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int2 = java.lang.Integer.sum((int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1073741817), 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3221225479" + "'", str2, "3221225479");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int2 = java.lang.Integer.compareUnsigned(0, 6710886);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int2 = java.lang.Integer.compare(12, 1627389952);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int1 = java.lang.Integer.highestOneBit(5120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1337982976", 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1337982976\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.String str1 = java.lang.Integer.toHexString(20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14" + "'", str1, "14");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("10000000000000000000000000000010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("37777777766");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777766\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int1 = java.lang.Integer.lowestOneBit(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int2 = java.lang.Integer.min(10, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str1 = java.lang.Integer.toBinaryString(80);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010000" + "'", str1, "1010000");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1111110010", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int2 = java.lang.Integer.min((-1073741817), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741817) + "'", int2 == (-1073741817));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(10, 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1612709888));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10011111111000000000000000000000" + "'", str1, "10011111111000000000000000000000");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int1 = java.lang.Integer.parseUnsignedInt("152");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 152 + "'", int1 == 152);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int2 = java.lang.Integer.rotateLeft(48, 8388608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int2 = java.lang.Integer.divideUnsigned(128, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int2 = java.lang.Integer.rotateRight((-83886081), 2147483643);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612735 + "'", int2 == 1610612735);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int2 = java.lang.Integer.compare(1431655762, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("11111111111111111111111111110110", 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 20480 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("3221225479");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3221225479\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2293760, (java.lang.Integer) 26, (java.lang.Integer) (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int2 = java.lang.Integer.rotateLeft(2560, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1280 + "'", int2 == 1280);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int int1 = java.lang.Integer.highestOneBit(107374182);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int1 = java.lang.Integer.reverse(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int int1 = java.lang.Integer.reverseBytes(335544320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int2 = java.lang.Integer.remainderUnsigned(268435456, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1mc0", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int2 = java.lang.Integer.rotateLeft(97, 20971);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198656 + "'", int2 == 198656);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int2 = java.lang.Integer.divideUnsigned(385875968, (-125894656));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int1 = java.lang.Integer.parseInt("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int1 = java.lang.Integer.bitCount(738197504);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int2 = java.lang.Integer.rotateLeft((-1073741811), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483621) + "'", int2 == (-2147483621));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int2 = java.lang.Integer.rotateRight(1, 20000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        int int2 = java.lang.Integer.remainderUnsigned(738197504, 198656);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190464 + "'", int2 == 190464);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int1 = java.lang.Integer.bitCount(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int2 = java.lang.Integer.remainderUnsigned(4194304, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10100000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int2 = java.lang.Integer.compare(671088640, 9942053);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        int int2 = java.lang.Integer.min(738197504, 335544320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 335544320 + "'", int2 == 335544320);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 33554432, (java.lang.Integer) 671088640, (java.lang.Integer) (-16776207));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-4), 67108864);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967292" + "'", str2, "4294967292");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int1 = java.lang.Integer.parseInt("43");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str1 = java.lang.Integer.toOctalString((-2147483621));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20000000033" + "'", str1, "20000000033");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int1 = java.lang.Integer.numberOfLeadingZeros(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int int2 = java.lang.Integer.rotateRight(52, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int1 = java.lang.Integer.bitCount(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int1 = java.lang.Integer.numberOfTrailingZeros(268435456);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int2 = java.lang.Integer.max(2293760, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2293760 + "'", int2 == 2293760);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int1 = java.lang.Integer.reverse((-671088641));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-21) + "'", int1 == (-21));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int int1 = java.lang.Integer.reverse(1627389952);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 134 + "'", int1 == 134);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int2 = java.lang.Integer.rotateLeft(613566755, 134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 613566665 + "'", int2 == 613566665);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.lang.String str1 = java.lang.Integer.toHexString(152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "98" + "'", str1, "98");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int int2 = java.lang.Integer.rotateLeft(2, (-1073741824));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int int2 = java.lang.Integer.compareUnsigned(1124, 469762039);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int2 = java.lang.Integer.rotateRight(29, 11101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int1 = java.lang.Integer.lowestOneBit((-1073741811));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2147483644, (java.lang.Integer) 1979711488, (java.lang.Integer) 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int2 = java.lang.Integer.compare(385875968, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2a3a0fd", 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 61 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int int1 = java.lang.Integer.reverse((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int int2 = java.lang.Integer.compareUnsigned(32783, 1073741824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1381324117);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int1 = java.lang.Integer.signum(232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(31, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51" + "'", str2, "51");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int int2 = java.lang.Integer.compare((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int1 = java.lang.Integer.reverseBytes(44278013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-39804158) + "'", int1 == (-39804158));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int int1 = java.lang.Integer.signum((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int int2 = java.lang.Integer.max(2621440, 10240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2621440 + "'", int2 == 2621440);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str1 = java.lang.Integer.toOctalString(1610612735);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "13777777777" + "'", str1, "13777777777");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("37777777777", 1627390016);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1627390016 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int2 = java.lang.Integer.min(22, (-1073741811));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741811) + "'", int2 == (-1073741811));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int2 = java.lang.Integer.compareUnsigned(67108864, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int2 = java.lang.Integer.sum((-8193), 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8049) + "'", int2 == (-8049));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int int2 = java.lang.Integer.rotateRight((-83886081), 1337982976);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83886081) + "'", int2 == (-83886081));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        int int2 = java.lang.Integer.compareUnsigned(61, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 20491);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int1 = java.lang.Integer.bitCount((-150994945));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1101100000000000000000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.Integer int1 = java.lang.Integer.getInteger("536870912");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int1 = java.lang.Integer.highestOneBit(21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int int2 = java.lang.Integer.rotateRight(512, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int1 = java.lang.Integer.numberOfTrailingZeros(21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) 'a', 4096);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int1 = java.lang.Integer.parseInt("80000002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80000002 + "'", int1 == 80000002);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11111110111111111111111111111111", 1381324117);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1381324117 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20000000033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000000033\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int2 = java.lang.Integer.max(268435456, 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int1 = java.lang.Integer.reverse(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 805306368 + "'", int1 == 805306368);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10011111111000000000000000000000", (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1073741824 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("16777216", 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 4096 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(2147483643);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2147483643" + "'", str1, "2147483643");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10000000000000000000", 156250);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 156250 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int2 = java.lang.Integer.divideUnsigned(838991872, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 419495936 + "'", int2 == 419495936);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int int1 = java.lang.Integer.numberOfTrailingZeros(469762039);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int1 = java.lang.Integer.signum(524288);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int int1 = java.lang.Integer.lowestOneBit((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-21));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111101011" + "'", str1, "11111111111111111111111111101011");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String str1 = java.lang.Integer.toOctalString(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int int2 = java.lang.Integer.rotateLeft(43, 83886080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int2 = java.lang.Integer.divideUnsigned(28, (-2359297));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.Integer int1 = java.lang.Integer.getInteger("32768");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int1 = java.lang.Integer.numberOfTrailingZeros(335544320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1", (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1073741824 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2359297), (java.lang.Integer) 1677721600, (java.lang.Integer) (-16776207));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10101000111010000011111101");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int2 = java.lang.Integer.sum(11010, 156250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167260 + "'", int2 == 167260);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int int2 = java.lang.Integer.max((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("ffffff9c", 107374182);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 107374182 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1342", 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 98 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("11111111111111111111111111101011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111101011\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int1 = java.lang.Integer.reverse(419495936);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32920 + "'", int1 == 32920);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int int2 = java.lang.Integer.rotateLeft(9942053, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9942053 + "'", int2 == 9942053);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int2 = java.lang.Integer.rotateLeft(10240, 20480);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int int2 = java.lang.Integer.compare(1100100, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String str1 = java.lang.Integer.toHexString((-671088641));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d7ffffff" + "'", str1, "d7ffffff");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-671088641));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int int1 = java.lang.Integer.highestOneBit((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 43, (java.lang.Integer) 10240, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int2 = java.lang.Integer.compare(2293760, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(3, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int int2 = java.lang.Integer.compare((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int int1 = java.lang.Integer.lowestOneBit(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str1 = java.lang.Integer.toOctalString(232);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "350" + "'", str1, "350");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int1 = java.lang.Integer.highestOneBit(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("20000000033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 20000000033 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned((-671088641), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int1 = java.lang.Integer.signum(1946157056);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int int1 = java.lang.Integer.numberOfTrailingZeros(432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }
}

