package lang3;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.String str1 = java.lang.Integer.toBinaryString(23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10111" + "'", str1, "10111");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int1 = java.lang.Integer.signum(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int1 = java.lang.Integer.parseInt("103");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103 + "'", int1 == 103);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int2 = java.lang.Integer.min(6710886, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String str1 = java.lang.Integer.toHexString(156250);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2625a" + "'", str1, "2625a");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int int1 = java.lang.Integer.parseUnsignedInt("1946157056");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1946157056 + "'", int1 == 1946157056);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int int2 = java.lang.Integer.rotateLeft((-8), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-113) + "'", int2 == (-113));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int2 = java.lang.Integer.max((-125894656), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int1 = java.lang.Integer.signum(107374182);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("10101000111010000011111101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10101000111010000011111101\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int2 = java.lang.Integer.rotateLeft((-9), (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int int1 = java.lang.Integer.numberOfLeadingZeros(61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-1024), (java.lang.Integer) 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int2 = java.lang.Integer.sum(3, 419495936);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 419495939 + "'", int2 == 419495939);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int2 = java.lang.Integer.max(0, (-1073741811));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int1 = java.lang.Integer.lowestOneBit(110);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int int2 = java.lang.Integer.rotateLeft((-16776207), 226492416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16776207) + "'", int2 == (-16776207));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (byte) -1, 1010000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int1 = java.lang.Integer.numberOfTrailingZeros(4194303);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int1 = java.lang.Integer.lowestOneBit(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str1 = java.lang.Integer.toOctalString((-536870911));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34000000001" + "'", str1, "34000000001");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4294967287");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967287\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int1 = java.lang.Integer.signum(11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int int2 = java.lang.Integer.sum((-2359297), 20000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17640703 + "'", int2 == 17640703);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("5400000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5400000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int int1 = java.lang.Integer.parseUnsignedInt("1062");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1062 + "'", int1 == 1062);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int int2 = java.lang.Integer.remainderUnsigned(6710886, 1010000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 650886 + "'", int2 == 650886);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int2 = java.lang.Integer.compare((-7), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(398458, (-9217));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "398458" + "'", str2, "398458");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str1 = java.lang.Integer.toHexString(469762040);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1bfffff8" + "'", str1, "1bfffff8");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int2 = java.lang.Integer.compareUnsigned(256, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int int1 = java.lang.Integer.bitCount(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-16776207));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int2 = java.lang.Integer.max((-2147483344), 8388608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388608 + "'", int2 == 8388608);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 43, (java.lang.Integer) 1, (java.lang.Integer) 1073741825);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int2 = java.lang.Integer.min(0, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int1 = java.lang.Integer.highestOneBit(432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int2 = java.lang.Integer.sum((-1073741821), 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741794) + "'", int2 == (-1073741794));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-3), (java.lang.Integer) (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 562, (java.lang.Integer) 35, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int1 = java.lang.Integer.bitCount(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = java.lang.Integer.remainderUnsigned((-1073741824), 805306368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("3fffff");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3fffff\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int1 = java.lang.Integer.numberOfLeadingZeros(2621440);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1946157056", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 256 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int1 = java.lang.Integer.highestOneBit((-1073741794));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int2 = java.lang.Integer.rotateLeft(1100100, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 550050 + "'", int2 == 550050);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-2013265909));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10001000000000000000000000001011" + "'", str1, "10001000000000000000000000001011");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int2 = java.lang.Integer.sum(198656, 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198759 + "'", int2 == 198759);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int2 = java.lang.Integer.max(1062, 1100100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1100100 + "'", int2 == 1100100);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int1 = java.lang.Integer.bitCount(419495936);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int2 = java.lang.Integer.compare(1431655762, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = java.lang.Integer.rotateLeft(1111110010, (-268435457));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 555555005 + "'", int2 == 555555005);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int2 = java.lang.Integer.rotateLeft(10, 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2560 + "'", int2 == 2560);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int1 = java.lang.Integer.numberOfLeadingZeros(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = java.lang.Integer.rotateRight((-671088641), 1627389952);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-671088641) + "'", int2 == (-671088641));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("32777777777", (-2359297));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2359297 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("34000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"34000000001\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String str1 = java.lang.Integer.toHexString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2b02" + "'", str1, "2b02");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10000000000000000000000000000010");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int2 = java.lang.Integer.compareUnsigned(2147483647, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        long long1 = java.lang.Integer.toUnsignedLong((-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967295L + "'", long1 == 4294967295L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int2 = java.lang.Integer.remainderUnsigned((-536870911), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(256);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "256" + "'", str1, "256");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(24, (-11));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24" + "'", str2, "24");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int1 = java.lang.Integer.highestOneBit(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30" + "'", str1, "30");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("83886080", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int1 = java.lang.Integer.parseInt("67");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2359297));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("10100000000000000000", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("256", 1010000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1010000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int1 = java.lang.Integer.numberOfLeadingZeros(152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = java.lang.Integer.compareUnsigned(67108863, 2048);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int2 = java.lang.Integer.min(8388608, 51200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51200 + "'", int2 == 51200);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 21, (java.lang.Integer) 11101, (java.lang.Integer) 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int1 = java.lang.Integer.signum((-16777212));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str1 = java.lang.Integer.toOctalString((-3));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777775" + "'", str1, "37777777775");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int1 = java.lang.Integer.numberOfTrailingZeros(6710886);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10011111111000000000000000000000", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10011111111000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = java.lang.Integer.compare(198656, 2147483644);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int1 = java.lang.Integer.lowestOneBit(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-8049), 419495936);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294959247" + "'", str2, "4294959247");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("faffffff", 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"faffffff\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int1 = java.lang.Integer.reverseBytes((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-67108865) + "'", int1 == (-67108865));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int1 = java.lang.Integer.bitCount(20971);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int2 = java.lang.Integer.remainderUnsigned((-6), 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 506 + "'", int2 == 506);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int1 = java.lang.Integer.parseInt("200000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 200000 + "'", int1 == 200000);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("11010", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int2 = java.lang.Integer.rotateLeft(0, 432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int2 = java.lang.Integer.rotateRight((-1073741811), 4194303);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483621) + "'", int2 == (-2147483621));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int int2 = java.lang.Integer.divideUnsigned(7, (-2147483552));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int1 = java.lang.Integer.reverseBytes((-1073741823));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777408 + "'", int1 == 16777408);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        long long1 = java.lang.Integer.toUnsignedLong(40);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 40L + "'", long1 == 40L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(15, 1337982976);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "15" + "'", str2, "15");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.String str1 = java.lang.Integer.toOctalString(32768);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int int1 = java.lang.Integer.reverse(156250);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1514553344 + "'", int1 == 1514553344);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int1 = java.lang.Integer.lowestOneBit(156250);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str1 = java.lang.Integer.toBinaryString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int1 = java.lang.Integer.reverse(637534208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int1 = java.lang.Integer.numberOfLeadingZeros(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int int1 = java.lang.Integer.parseUnsignedInt("4294967287");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9) + "'", int1 == (-9));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4294967290");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = java.lang.Integer.compareUnsigned(1124, 524288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int2 = java.lang.Integer.min(507904, 419495939);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 507904 + "'", int2 == 507904);
    }
}

