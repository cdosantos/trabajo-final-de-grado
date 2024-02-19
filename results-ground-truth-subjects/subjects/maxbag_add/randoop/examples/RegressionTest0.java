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
        int int1 = java.lang.Integer.reverse((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1073741825) + "'", int1 == (-1073741825));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.lang.Integer.BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int1 = java.lang.Integer.lowestOneBit((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean1 = java.lang.Boolean.parseBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        boolean boolean1 = java.lang.Boolean.getBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = java.lang.Boolean.logicalXor(false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = java.lang.Integer.SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean2 = java.lang.Boolean.logicalAnd(false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int2 = java.lang.Integer.max((-1), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        long long1 = java.lang.Integer.toUnsignedLong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967295L + "'", long1 == 4294967295L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int2 = java.lang.Integer.min((-9), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        org.junit.Assert.assertEquals("'" + boolean0 + "' != '" + false + "'", boolean0, false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int2 = java.lang.Integer.rotateLeft((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int2 = java.lang.Integer.max((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int2 = java.lang.Integer.remainderUnsigned((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        long long1 = java.lang.Integer.toUnsignedLong((-9));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967287L + "'", long1 == 4294967287L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable9 = strMap1.putIfAbsent("", (java.io.Serializable) (-1.0d));
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (-9L) + "'", serializable9, (-9L));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = strMap1.put("hi!", serializable5);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.ArrayList<java.util.RandomAccess> randomAccessList0 = new java.util.ArrayList<java.util.RandomAccess>();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable9 = strMap1.putIfAbsent("", (java.io.Serializable) (-1.0d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable14 = strMap11.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap17.values();
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap17.values();
        java.io.Serializable serializable22 = strMap17.putIfAbsent("", (java.io.Serializable) (-9L));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap26 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable29 = strMap26.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap36 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable39 = strMap36.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Object[] objArray40 = new java.lang.Object[] { strMap1, true, (-4), serializable22, (-100), 9, true, 1, 7, (-2L), (byte) 1, serializable39 };
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList41, objArray40);
        // The following exception was thrown during execution in test generation
        try {
            objList41.add(52, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (-9L) + "'", serializable9, (-9L));
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + true + "'", serializable14, true);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNull(serializable22);
        org.junit.Assert.assertEquals("'" + serializable29 + "' != '" + true + "'", serializable29, true);
        org.junit.Assert.assertEquals("'" + serializable39 + "' != '" + true + "'", serializable39, true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[{=-9}, true, -4, null, -100, 9, true, 1, 7, -2, 1, true]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean2 = java.lang.Boolean.logicalXor(false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection14 = strMap13.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable21 = strMap18.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass22 = serializable21.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection46 = strMap45.values();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap13, ' ', "", wildcardClass22, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection46, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        boolean boolean55 = objList52.remove((java.lang.Object) (-10.5d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap57 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable60 = strMap57.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.ArrayList<java.lang.Object> objList63 = new java.util.ArrayList<java.lang.Object>();
        objList63.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap76 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection77 = strMap76.values();
        java.util.Collection<java.io.Serializable> serializableCollection78 = strMap76.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap89 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray95 = new java.lang.Object[] { 3L, (-10.5d), serializable60, 10.5d, (-7L), objList63, (-2), (-1.0f), 10.0d, (-4.6d), 1, 0L, (-10), (-6), 100L, (-1L), serializableCollection78, 8.4d, '#', (-7), (-4.6d), (-10), 0L, "hi!", (-100), 100.0d, 7, (byte) 1, (-10), (-7.3d), (byte) 0, 2 };
        java.util.ArrayList<java.lang.Object> objList96 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList96, objArray95);
        int int98 = objList96.size();
        int int99 = objList96.size();
        org.junit.Assert.assertNotNull(serializableCollection14);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + true + "'", serializable21, true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + true + "'", serializable60, true);
        org.junit.Assert.assertNotNull(serializableCollection77);
        org.junit.Assert.assertNotNull(serializableCollection78);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[3, -10.5, true, 10.5, -7, [], -2, -1.0, 10.0, -4.6, 1, 0, -10, -6, 100, -1, [], 8.4, #, -7, -4.6, -10, 0, hi!, -100, 100.0, 7, 1, -10, -7.3, 0, 2]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 32 + "'", int98 == 32);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 32 + "'", int99 == 32);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int1 = java.lang.Integer.highestOneBit((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        objList0.clear();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.set((-1073741825), obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1073741825");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap15 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap15.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass24 = serializable23.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap47 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection48 = strMap47.values();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap15, ' ', "", wildcardClass24, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection48, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.remove((java.lang.Object) (-10.5d));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = objList1.addAll(1, (java.util.Collection<java.lang.Object>) objList54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(serializableCollection48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Boolean boolean1 = new java.lang.Boolean(false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
        int int6 = strMap5.size();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = java.lang.Integer.toOctalString((-5));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777773" + "'", str1, "37777777773");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str1 = java.lang.Integer.toBinaryString(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100100" + "'", str1, "1100100");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int1 = java.lang.Integer.numberOfLeadingZeros(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf(true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "10", "0", "1100100" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray24 = objList17.toArray(charSequenceArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(charSequenceArray23);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Class<java.lang.Integer> intClass0 = java.lang.Integer.TYPE;
        org.junit.Assert.assertNotNull(intClass0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str1 = java.lang.Integer.toOctalString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int1 = java.lang.Integer.signum((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        int int3 = objList1.lastIndexOf((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Boolean boolean1 = new java.lang.Boolean(true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int2 = java.lang.Integer.compare((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        boolean boolean2 = java.lang.Boolean.logicalXor(true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int1 = java.lang.Integer.reverseBytes((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-83886081) + "'", int1 == (-83886081));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int0 = java.lang.Integer.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int2 = java.lang.Integer.divideUnsigned((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134217727 + "'", int2 == 134217727);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        boolean boolean1 = java.lang.Boolean.parseBoolean("1100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int1 = java.lang.Integer.signum(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int1 = java.lang.Integer.lowestOneBit(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        objList25.trimToSize();
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int1 = java.lang.Integer.reverse(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2013265920) + "'", int1 == (-2013265920));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int2 = java.lang.Integer.compareUnsigned(3, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("hi!", (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -6 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Boolean boolean1 = new java.lang.Boolean("10");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10", 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 2147483647 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Class<java.lang.Boolean> booleanClass0 = java.lang.Boolean.TYPE;
        org.junit.Assert.assertNotNull(booleanClass0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        // The following exception was thrown during execution in test generation
        try {
            objList25.add((int) ' ', (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(40, 1.0f);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int1 = java.lang.Integer.reverse(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long1 = java.lang.Integer.toUnsignedLong(48);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48L + "'", long1 == 48L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap0 = new java.util.HashMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable3 = strMap0.replace("1", (java.io.Serializable) false);
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("1");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int2 = java.lang.Integer.max((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        boolean boolean2 = java.lang.Boolean.logicalOr(false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        objList32.ensureCapacity(100);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int2 = java.lang.Integer.divideUnsigned((-2), (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("37777777773");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777773\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        maxBag0.add((java.lang.Integer) 41);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        org.junit.Assert.assertEquals("'" + boolean0 + "' != '" + true + "'", boolean0, true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf(false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int int2 = java.lang.Integer.compare((-10), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int2 = java.lang.Integer.compareUnsigned((-1), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int2 = java.lang.Integer.min(10, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        boolean boolean8 = strMap4.containsValue((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean boolean2 = java.lang.Boolean.logicalOr(true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int int2 = java.lang.Integer.compareUnsigned((-2147483648), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "", "0", "0", "37777777773", "1" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray62 = objList45.toArray(strArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet11 = strMap7.entrySet();
        int int12 = strMap7.size();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(strEntrySet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("37777777773");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int2 = java.lang.Integer.divideUnsigned(17, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8" + "'", str1, "8");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.ArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList1 = new java.util.ArrayList<java.lang.reflect.GenericDeclaration>(10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-2147483648));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2147483648" + "'", str1, "2147483648");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int int2 = java.lang.Integer.max((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2147483648", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(9, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9" + "'", str2, "9");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1100100");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str1 = java.lang.Integer.toHexString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int2 = java.lang.Boolean.compare(true, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable56 = strMap53.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass57 = serializable56.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap80 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection81 = strMap80.values();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap48, ' ', "", wildcardClass57, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection81, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        boolean boolean90 = objList87.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList92 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean93 = objList87.addAll(32, (java.util.Collection<java.lang.Object>) objList92);
        boolean boolean94 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList87);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList87.replaceAll(objUnaryOperator95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertEquals("'" + serializable56 + "' != '" + true + "'", serializable56, true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(serializableCollection81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int2 = java.lang.Integer.rotateLeft(48, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 768 + "'", int2 == 768);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int2 = java.lang.Boolean.compare(true, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable7 = strMap1.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap1.values();
        strMap1.clear();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableCollection8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        java.util.ListIterator<java.lang.Object> objItor32 = objList25.listIterator(5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objItor32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean2 = java.lang.Boolean.logicalOr(true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int1 = java.lang.Integer.reverseBytes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList32.add((-3), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean1 = java.lang.Boolean.parseBoolean("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        boolean boolean1 = java.lang.Boolean.parseBoolean("4294967295");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int1 = java.lang.Integer.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-10), 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "37777777766" + "'", str2, "37777777766");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int2 = java.lang.Boolean.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int2 = java.lang.Integer.compareUnsigned(10, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        examples._Type328393 _Type328393_31 = maxBag0._var4384;
        java.lang.Integer[] intArray32 = _Type328393_31.get_1();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_31);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection15 = strMap14.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable22 = strMap19.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass23 = serializable22.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap46 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection47 = strMap46.values();
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap14, ' ', "", wildcardClass23, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection47, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        boolean boolean56 = objList53.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList53.addAll(32, (java.util.Collection<java.lang.Object>) objList58);
        boolean boolean60 = objList1.removeAll((java.util.Collection<java.lang.Object>) objList53);
        org.junit.Assert.assertNotNull(serializableCollection15);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + true + "'", serializable22, true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(serializableCollection47);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 134217727);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int2 = java.lang.Integer.remainderUnsigned((-4), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = java.lang.Integer.toOctalString((-2));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "37777777776" + "'", str1, "37777777776");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        boolean boolean2 = java.lang.Boolean.logicalAnd(true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int int2 = java.lang.Integer.divideUnsigned((-3), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.Collection[] collectionArray37 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray38 = (java.util.Collection<java.lang.Object>[]) collectionArray37;
        java.util.Collection<java.lang.Object>[] objCollectionArray39 = objList32.toArray(objCollectionArray38);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collectionArray37);
        org.junit.Assert.assertNotNull(objCollectionArray38);
        org.junit.Assert.assertNotNull(objCollectionArray39);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("37777777776", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777776\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int2 = java.lang.Integer.sum((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        boolean boolean1 = java.lang.Boolean.getBoolean("12");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        boolean boolean1 = java.lang.Boolean.getBoolean("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("hi!", (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -10 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = objList56.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int2 = java.lang.Integer.divideUnsigned(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.util.stream.Stream<java.lang.Object> objStream55 = objList17.parallelStream();
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator56 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList17.replaceAll(objUnaryOperator56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objStream55);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag29 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap30 = maxBag29._var721;
        java.util.ArrayList<java.lang.Integer> intList31 = maxBag29._var66253;
        boolean boolean32 = objList25.remove((java.lang.Object) intList31);
        objList25.trimToSize();
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intMap30);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str1 = java.lang.Integer.toOctalString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int int2 = java.lang.Integer.sum((int) (byte) -1, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        boolean boolean2 = java.lang.Boolean.logicalOr(false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        objList0.clear();
        objList0.trimToSize();
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor5 = objList4.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objList0.addAll(134217727, (java.util.Collection<java.lang.Object>) objList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 134217727, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int2 = java.lang.Integer.max(41, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        boolean boolean14 = strMap1.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap13);
        boolean boolean18 = strMap13.replace("37777777773", (java.io.Serializable) 0, (java.io.Serializable) 1.0d);
        boolean boolean19 = strMap13.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable27 = strMap24.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass28 = serializable27.getClass();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable27, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList37 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList37, objArray36);
        int int39 = objList37.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap43 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable46 = strMap43.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable49 = strMap43.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection50 = strMap43.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap58 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-5L), 0, serializableCollection50, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList65 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList65, objArray64);
        boolean boolean68 = objList65.add((java.lang.Object) 1.0f);
        boolean boolean70 = objList65.add((java.lang.Object) (-8L));
        int int71 = objList65.size();
        java.util.ArrayList<java.lang.Object> objList72 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean73 = objList65.removeAll((java.util.Collection<java.lang.Object>) objList72);
        boolean boolean74 = objList37.containsAll((java.util.Collection<java.lang.Object>) objList65);
        objList65.ensureCapacity(11);
        java.lang.Object obj77 = null;
        boolean boolean78 = strMap13.remove((java.lang.Object) 11, obj77);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + true + "'", serializable27, true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11 + "'", int39 == 11);
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + true + "'", serializable46, true);
        org.junit.Assert.assertNull(serializable49);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 17 + "'", int71 == 17);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777766", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("4294967295", (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -5 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.util.AbstractMap<java.lang.String, java.io.Serializable>, java.util.Collection<java.lang.Object>> strMapMap2 = new java.util.HashMap<java.util.AbstractMap<java.lang.String, java.io.Serializable>, java.util.Collection<java.lang.Object>>((-8), (float) (-4L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Integer int1 = java.lang.Integer.getInteger("");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 768);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        objList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.set((-10), (java.lang.Object) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int1 = java.lang.Integer.highestOneBit(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap21 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable24 = strMap21.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass25 = serializable24.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap16, ' ', "", wildcardClass25, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection49, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList55 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList55, objArray54);
        boolean boolean58 = objList55.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = objList55.addAll(32, (java.util.Collection<java.lang.Object>) objList60);
        java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap62 = new java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-5), 100, (-3L), "1100100", objList55, strComparableMap62, (-2L), 100L, (byte) -1 };
        java.util.ArrayList<java.lang.Object> objList67 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList67, objArray66);
        java.lang.Object[] objArray69 = objList67.toArray();
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator70 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList67.replaceAll(objUnaryOperator70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + true + "'", serializable24, true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-9));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int int1 = java.lang.Integer.bitCount((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int2 = java.lang.Integer.divideUnsigned((-2147483648), (-83886081));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        long long1 = java.lang.Integer.toUnsignedLong(67);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 67L + "'", long1 == 67L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.remove((java.lang.Integer) 48);
        examples._Type328393 _Type328393_29 = maxBag0._var4384;
        maxBag0.add((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_29);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "31" + "'", str1, "31");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int1 = java.lang.Integer.reverse((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int int1 = java.lang.Integer.reverseBytes((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777217) + "'", int1 == (-16777217));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap28 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection29 = strMap28.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap33 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable36 = strMap33.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass37 = serializable36.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap60 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection61 = strMap60.values();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap28, ' ', "", wildcardClass37, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection61, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList67 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList67, objArray66);
        boolean boolean70 = objList67.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList72 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean73 = objList67.addAll(32, (java.util.Collection<java.lang.Object>) objList72);
        java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap74 = new java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-5), 100, (-3L), "1100100", objList67, strComparableMap74, (-2L), 100L, (byte) -1 };
        java.util.ArrayList<java.lang.Object> objList79 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList79, objArray78);
        java.lang.Object[] objArray81 = objList79.toArray();
        java.io.Serializable serializable82 = strMap1.getOrDefault((java.lang.Object) 6, (java.io.Serializable) objList79);
        strMap1.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection29);
        org.junit.Assert.assertEquals("'" + serializable36 + "' != '" + true + "'", serializable36, true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(serializableCollection61);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
        org.junit.Assert.assertNotNull(serializable82);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int int2 = java.lang.Integer.min((-100), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-4));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4294967292" + "'", str1, "4294967292");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        boolean boolean14 = strMap1.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap13);
        boolean boolean18 = strMap13.replace("37777777773", (java.io.Serializable) 0, (java.io.Serializable) 1.0d);
        boolean boolean19 = strMap13.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap21 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection22 = strMap21.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection25 = strMap24.values();
        strMap21.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap24);
        strMap13.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap24);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableCollection22);
        org.junit.Assert.assertNotNull(serializableCollection25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor4 = objList2.listIterator(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        boolean boolean14 = strMap1.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap13);
        int int15 = strMap1.size();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        maxBag0._var5992 = 0;
        maxBag0.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intMap1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int int2 = java.lang.Integer.rotateRight((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet6 = strMap1.entrySet();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strEntrySet6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.util.AbstractMap<java.lang.String, java.io.Serializable>, java.util.ArrayList<java.lang.Object>> strMapMap2 = new java.util.HashMap<java.util.AbstractMap<java.lang.String, java.io.Serializable>, java.util.ArrayList<java.lang.Object>>((-1073741825), (float) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -1073741825");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long1 = java.lang.Integer.toUnsignedLong(52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.HashMap<java.lang.String, java.lang.String> strMap0 = new java.util.HashMap<java.lang.String, java.lang.String>();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        int int7 = strMap1.size();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0._var587 = (-5);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        _Type328393_3._0 = 1342177280;
        _Type328393_3._0 = (-6);
        org.junit.Assert.assertNotNull(_Type328393_3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("12", 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 40 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable9 = strMap1.putIfAbsent("8", (java.io.Serializable) (-4L));
        strMap1.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap1.values();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strMap1.putAll(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-4.6d) + "'", serializable7, (-4.6d));
        org.junit.Assert.assertNotNull(serializableCollection8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("hi!", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        examples.MaxBag maxBag1 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap2 = maxBag1._var721;
        maxBag0._var721 = intMap2;
        maxBag0._var1457 = false;
        org.junit.Assert.assertNotNull(intMap2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int int1 = java.lang.Integer.parseUnsignedInt("2147483648");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap15 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap15.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass24 = serializable23.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap47 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection48 = strMap47.values();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap15, ' ', "", wildcardClass24, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection48, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = objList54.addAll(32, (java.util.Collection<java.lang.Object>) objList59);
        int int61 = objList54.size();
        boolean boolean62 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList54);
        java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap63 = new java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        int int64 = objList0.lastIndexOf((java.lang.Object) strComparableMap63);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(serializableCollection48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 41 + "'", int61 == 41);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean1 = java.lang.Boolean.getBoolean("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable13 = strMap1.put("hi!", (java.io.Serializable) 7);
        boolean boolean15 = strMap1.containsValue((java.lang.Object) "1");
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean1 = java.lang.Boolean.parseBoolean("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        boolean boolean57 = objList45.containsAll((java.util.Collection<java.lang.Object>) objList56);
        java.util.ListIterator<java.lang.Object> objItor58 = objList45.listIterator();
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objItor58);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int int2 = java.lang.Boolean.compare(false, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int1 = java.lang.Integer.parseUnsignedInt("4294967295");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        java.lang.Boolean boolean31 = maxBag0._var1457;
        maxBag0.add((java.lang.Integer) (-2147483648));
        examples.MaxBag maxBag34 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap35 = maxBag34._var721;
        java.util.ArrayList<java.lang.Integer> intList36 = maxBag34._var66253;
        maxBag0._var66253 = intList36;
        java.util.ArrayList<java.lang.Integer> intList38 = maxBag0._var66253;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(intMap35);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(intList38);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable13 = strMap10.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass14 = serializable13.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable13, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        int int25 = objList23.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable35 = strMap29.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection36 = strMap29.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-5L), 0, serializableCollection36, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.add((java.lang.Object) 1.0f);
        boolean boolean56 = objList51.add((java.lang.Object) (-8L));
        int int57 = objList51.size();
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList51.removeAll((java.util.Collection<java.lang.Object>) objList58);
        boolean boolean60 = objList23.containsAll((java.util.Collection<java.lang.Object>) objList51);
        boolean boolean61 = strMap1.containsKey((java.lang.Object) objList51);
        boolean boolean63 = objList51.contains((java.lang.Object) 3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + true + "'", serializable13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 17 + "'", int57 == 17);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("0");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        int int58 = objList51.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor60 = objList51.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 41 + "'", int58 == 41);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int int2 = java.lang.Integer.rotateRight(11, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612737 + "'", int2 == 1610612737);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int2 = java.lang.Integer.min(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        boolean boolean2 = java.lang.Boolean.logicalXor(true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int int1 = java.lang.Integer.numberOfLeadingZeros(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable56 = strMap53.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass57 = serializable56.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap80 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection81 = strMap80.values();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap48, ' ', "", wildcardClass57, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection81, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        boolean boolean90 = objList87.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList92 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean93 = objList87.addAll(32, (java.util.Collection<java.lang.Object>) objList92);
        boolean boolean94 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList87);
        java.util.ArrayList<java.lang.Object> objList95 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList87);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertEquals("'" + serializable56 + "' != '" + true + "'", serializable56, true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(serializableCollection81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int1 = java.lang.Integer.signum((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("9", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>> strMap2 = new java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>(17, (float) 768);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Integer int1 = java.lang.Integer.getInteger("2147483648");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.HashMap<java.lang.CharSequence, java.lang.Integer[]> charSequenceMap1 = new java.util.HashMap<java.lang.CharSequence, java.lang.Integer[]>(40);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        strMap5.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable16 = strMap13.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable19 = strMap13.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        strMap5.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap13);
        boolean boolean22 = strMap13.containsValue((java.lang.Object) (-2L));
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (-4.6d) + "'", serializable19, (-4.6d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int int1 = java.lang.Integer.highestOneBit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.HashMap<java.util.ListIterator<java.lang.Object>, java.lang.Comparable<java.lang.String>> objItorMap0 = new java.util.HashMap<java.util.ListIterator<java.lang.Object>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int1 = java.lang.Integer.numberOfLeadingZeros(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int8 = strMap4.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = objList34.add((java.lang.Object) (-8L));
        int int40 = objList34.size();
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = objList34.removeAll((java.util.Collection<java.lang.Object>) objList41);
        boolean boolean43 = strMap4.containsValue((java.lang.Object) objList34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = objList0.addAll(2147483647, (java.util.Collection<java.lang.Object>) objList34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-10.5d) + "'", serializable7, (-10.5d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 17 + "'", int40 == 17);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int1 = java.lang.Integer.reverseBytes(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 671088640 + "'", int1 == 671088640);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList25.set((-4), (java.lang.Object) (-7.3d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        java.lang.Boolean boolean31 = maxBag0._var1457;
        maxBag0.add((java.lang.Integer) (-2147483648));
        examples.MaxBag maxBag34 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap35 = maxBag34._var721;
        java.util.ArrayList<java.lang.Integer> intList36 = maxBag34._var66253;
        maxBag0._var66253 = intList36;
        maxBag0.add((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(intMap35);
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.lang.Class<?> wildcardClass2 = intMap1.getClass();
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable3 = strMap1.get((java.lang.Object) 1L);
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.getOrDefault((java.lang.Object) (byte) 1, (java.io.Serializable) (-8L));
        java.io.Serializable serializable9 = strMap1.get((java.lang.Object) (-3.8d));
        java.io.Serializable serializable11 = strMap1.get((java.lang.Object) (-3L));
        java.io.Serializable serializable14 = strMap1.replace("9", (java.io.Serializable) (-10));
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-8L) + "'", serializable7, (-8L));
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int2 = java.lang.Integer.rotateLeft(100, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(100);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Boolean boolean1 = new java.lang.Boolean("9");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int int1 = java.lang.Integer.highestOneBit(768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int1 = java.lang.Integer.reverse((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(768, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.io.Serializable>> strMapList1 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.io.Serializable>>(31);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        long long1 = java.lang.Integer.toUnsignedLong((-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967295L + "'", long1 == 4294967295L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37777777773", (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -6 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.Boolean boolean1 = new java.lang.Boolean("37777777776");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>((int) ' ');
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.util.ArrayList<java.lang.Integer> intList2 = maxBag0._var66253;
        maxBag0._var1457 = true;
        examples.MaxBag maxBag5 = new examples.MaxBag();
        maxBag5._var587 = (-5);
        examples._Type328393 _Type328393_8 = maxBag5._var4384;
        _Type328393_8._0 = 6;
        maxBag0._var4384 = _Type328393_8;
        examples.MaxBag maxBag12 = new examples.MaxBag();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        maxBag12._var66253 = intList36;
        examples.MaxBag maxBag39 = new examples.MaxBag(intList36);
        maxBag0._var66253 = intList36;
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(_Type328393_8);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int1 = java.lang.Integer.parseUnsignedInt("31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap6 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable9 = strMap6.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass10 = serializable9.getClass();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable9, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList19 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList19, objArray18);
        int int21 = objList19.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap25 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable28 = strMap25.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable31 = strMap25.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection32 = strMap25.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap40 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-5L), 0, serializableCollection32, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList47 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList47, objArray46);
        boolean boolean50 = objList47.add((java.lang.Object) 1.0f);
        boolean boolean52 = objList47.add((java.lang.Object) (-8L));
        int int53 = objList47.size();
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = objList47.removeAll((java.util.Collection<java.lang.Object>) objList54);
        boolean boolean56 = objList19.containsAll((java.util.Collection<java.lang.Object>) objList47);
        java.util.Iterator<java.lang.Object> objItor57 = objList19.iterator();
        java.util.Iterator<java.lang.Object> objItor58 = objList19.iterator();
        boolean boolean59 = objList0.addAll((java.util.Collection<java.lang.Object>) objList19);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + true + "'", serializable9, true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + true + "'", serializable28, true);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertNotNull(serializableCollection32);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 17 + "'", int53 == 17);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objItor57);
        org.junit.Assert.assertNotNull(objItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        boolean boolean1 = java.lang.Boolean.parseBoolean("8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(0);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap21 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable24 = strMap21.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass25 = serializable24.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap16, ' ', "", wildcardClass25, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection49, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList55 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList55, objArray54);
        boolean boolean58 = objList55.remove((java.lang.Object) (-10.5d));
        java.io.Serializable serializable59 = strMap1.put("8", (java.io.Serializable) (-10.5d));
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + true + "'", serializable24, true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(serializable59);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        boolean boolean1 = java.lang.Boolean.parseBoolean("2147483648");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        objList45.ensureCapacity(11);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap58 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable61 = strMap58.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass62 = serializable61.getClass();
        examples.MaxBag maxBag63 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap64 = maxBag63._var721;
        java.lang.Class<?> wildcardClass65 = intMap64.getClass();
        java.lang.Class<java.lang.Integer> intClass66 = java.lang.Integer.TYPE;
        java.lang.Class<java.lang.Integer> intClass67 = java.lang.Integer.TYPE;
        java.lang.Class<java.lang.Integer> intClass68 = java.lang.Integer.TYPE;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray69 = new java.lang.reflect.GenericDeclaration[] { wildcardClass62, wildcardClass65, intClass66, intClass67, intClass68 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[] genericDeclarationArray70 = objList45.toArray(genericDeclarationArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + true + "'", serializable61, true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(intMap64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(intClass66);
        org.junit.Assert.assertNotNull(intClass67);
        org.junit.Assert.assertNotNull(intClass68);
        org.junit.Assert.assertNotNull(genericDeclarationArray69);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int1 = java.lang.Integer.bitCount((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int int0 = java.lang.Integer.MIN_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("37777777776");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777776\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        java.lang.Boolean boolean31 = maxBag0._var1457;
        maxBag0._var5992 = (-2);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int int2 = java.lang.Integer.compare((int) (short) 0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0._var587 = (-5);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        maxBag0.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(_Type328393_3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        java.util.Iterator<java.lang.Object> objItor34 = objList25.iterator();
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objItor34);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable56 = strMap53.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass57 = serializable56.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap80 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection81 = strMap80.values();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap48, ' ', "", wildcardClass57, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection81, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        boolean boolean90 = objList87.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList92 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean93 = objList87.addAll(32, (java.util.Collection<java.lang.Object>) objList92);
        boolean boolean94 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList87);
        objList87.add(4, (java.lang.Object) "0");
        java.lang.Object obj99 = objList87.remove(2);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertEquals("'" + serializable56 + "' != '" + true + "'", serializable56, true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(serializableCollection81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + obj99 + "' != '" + 4294967295L + "'", obj99, 4294967295L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag29 = new examples.MaxBag();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        maxBag29._var66253 = intList53;
        maxBag29._var1457 = false;
        maxBag29._var1457 = false;
        java.lang.Boolean boolean60 = maxBag29._var1457;
        boolean boolean61 = objList25.add((java.lang.Object) boolean60);
        java.util.Iterator<java.lang.Object> objItor62 = objList25.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor64 = objList25.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + boolean60 + "' != '" + false + "'", boolean60, false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objItor62);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        examples.MaxBag maxBag55 = new examples.MaxBag();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        maxBag55._var66253 = intList79;
        int int82 = objList17.indexOf((java.lang.Object) maxBag55);
        java.util.ArrayList<java.lang.Integer> intList83 = maxBag55._var66253;
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intList83);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        int int58 = objList51.size();
        java.lang.Object[] objArray59 = objList51.toArray();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 41 + "'", int58 == 41);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int1 = java.lang.Integer.lowestOneBit(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.stream.Stream<java.lang.Object> objStream20 = objList17.parallelStream();
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(objStream20);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.Integer int1 = java.lang.Integer.getInteger("37777777776");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int2 = java.lang.Integer.compareUnsigned((-2), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable13 = strMap10.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass14 = serializable13.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable13, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        int int25 = objList23.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable35 = strMap29.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection36 = strMap29.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-5L), 0, serializableCollection36, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.add((java.lang.Object) 1.0f);
        boolean boolean56 = objList51.add((java.lang.Object) (-8L));
        int int57 = objList51.size();
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList51.removeAll((java.util.Collection<java.lang.Object>) objList58);
        boolean boolean60 = objList23.containsAll((java.util.Collection<java.lang.Object>) objList51);
        boolean boolean61 = strMap1.containsKey((java.lang.Object) objList51);
        java.util.Iterator<java.lang.Object> objItor62 = objList51.iterator();
        examples.MaxBag maxBag63 = new examples.MaxBag();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        maxBag63._var66253 = intList87;
        maxBag63.clear();
        maxBag63.remove((java.lang.Integer) (-2013265920));
        maxBag63.remove((java.lang.Integer) 17);
        examples.MaxBag maxBag95 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap96 = maxBag95._var721;
        java.util.ArrayList<java.lang.Integer> intList97 = maxBag95._var66253;
        maxBag63._var66253 = intList97;
        int int99 = objList51.indexOf((java.lang.Object) maxBag63);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + true + "'", serializable13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 17 + "'", int57 == 17);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(intMap96);
        org.junit.Assert.assertNotNull(intList97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable15 = strMap9.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-5L), 0, serializableCollection16, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        boolean boolean34 = objList31.add((java.lang.Object) 1.0f);
        boolean boolean36 = objList31.add((java.lang.Object) (-8L));
        int int37 = objList31.size();
        java.util.ArrayList<java.lang.Object> objList38 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean39 = objList31.removeAll((java.util.Collection<java.lang.Object>) objList38);
        boolean boolean40 = strMap1.containsValue((java.lang.Object) objList31);
        int int42 = objList31.lastIndexOf((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("a", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = java.lang.Integer.compareUnsigned(11, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str1 = java.lang.Integer.toHexString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int int2 = java.lang.Integer.max(50, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int2 = java.lang.Integer.max(31, 768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 768 + "'", int2 == 768);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int2 = java.lang.Integer.max(48, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int int1 = java.lang.Integer.lowestOneBit(1610612737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int int2 = java.lang.Integer.divideUnsigned(3, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.Boolean boolean1 = new java.lang.Boolean("37777777766");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4294967295");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967295\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int int1 = java.lang.Integer.parseInt("12");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int2 = java.lang.Integer.remainderUnsigned((int) (short) -1, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int1 = java.lang.Integer.bitCount(1342177280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int int2 = java.lang.Integer.compareUnsigned(35, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        objList56.clear();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.put("hi!", (java.io.Serializable) (-1));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable16 = strMap13.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass17 = serializable16.getClass();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable16, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList26, objArray25);
        int int28 = objList26.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable35 = strMap32.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable38 = strMap32.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection39 = strMap32.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap47 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-5L), 0, serializableCollection39, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.add((java.lang.Object) 1.0f);
        boolean boolean59 = objList54.add((java.lang.Object) (-8L));
        int int60 = objList54.size();
        java.util.ArrayList<java.lang.Object> objList61 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean62 = objList54.removeAll((java.util.Collection<java.lang.Object>) objList61);
        boolean boolean63 = objList26.containsAll((java.util.Collection<java.lang.Object>) objList54);
        examples.MaxBag maxBag64 = new examples.MaxBag();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        maxBag64._var66253 = intList88;
        int int91 = objList26.indexOf((java.lang.Object) maxBag64);
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap92 = maxBag64._var721;
        boolean boolean93 = strMap1.replace("", (java.io.Serializable) (-3), (java.io.Serializable) intMap92);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + true + "'", serializable16, true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + true + "'", serializable35, true);
        org.junit.Assert.assertNull(serializable38);
        org.junit.Assert.assertNotNull(serializableCollection39);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 17 + "'", int60 == 17);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(intMap92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("37777777776");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777776\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.ArrayList<java.util.AbstractCollection<java.lang.Object>> objCollectionList0 = new java.util.ArrayList<java.util.AbstractCollection<java.lang.Object>>();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int2 = java.lang.Integer.sum(67, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int int2 = java.lang.Integer.rotateRight(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        int int55 = objList17.size();
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11 + "'", int55 == 11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String str1 = java.lang.Integer.toBinaryString(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        strMap1.clear();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int2 = java.lang.Integer.divideUnsigned(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap39 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable42 = strMap39.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable45 = strMap39.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection46 = strMap39.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap54 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (-5L), 0, serializableCollection46, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList61 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList61, objArray60);
        boolean boolean64 = objList61.add((java.lang.Object) 1.0f);
        boolean boolean65 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList61);
        java.util.Iterator<java.lang.Object> objItor66 = objList32.iterator();
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + true + "'", serializable42, true);
        org.junit.Assert.assertNull(serializable45);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objItor66);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable15 = strMap9.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-5L), 0, serializableCollection16, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        boolean boolean34 = objList31.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag35 = new examples.MaxBag();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        maxBag35._var66253 = intList59;
        maxBag35._var1457 = false;
        maxBag35._var1457 = false;
        java.lang.Boolean boolean66 = maxBag35._var1457;
        boolean boolean67 = objList31.add((java.lang.Object) boolean66);
        java.util.Iterator<java.lang.Object> objItor68 = objList31.iterator();
        boolean boolean69 = strMap1.replace("37777777766", (java.io.Serializable) (-8.7d), (java.io.Serializable) objList31);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + boolean66 + "' != '" + false + "'", boolean66, false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap8 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable11 = strMap8.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable14 = strMap8.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable22 = strMap19.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable25 = strMap19.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection26 = strMap19.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap34 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-5L), 0, serializableCollection26, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList41, objArray40);
        boolean boolean44 = objList41.add((java.lang.Object) 1.0f);
        boolean boolean46 = strMap8.replace("1100100", (java.io.Serializable) objList41, (java.io.Serializable) (-100));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap50 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable53 = strMap50.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable56 = strMap50.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection57 = strMap50.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap65 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-5L), 0, serializableCollection57, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList72 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList72, objArray71);
        boolean boolean75 = objList72.add((java.lang.Object) 1.0f);
        boolean boolean77 = objList72.add((java.lang.Object) (-8L));
        int int78 = objList72.size();
        boolean boolean79 = objList41.retainAll((java.util.Collection<java.lang.Object>) objList72);
        java.io.Serializable serializable80 = strMap4.remove((java.lang.Object) boolean79);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap82 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection83 = strMap82.values();
        boolean boolean84 = strMap82.isEmpty();
        boolean boolean86 = strMap82.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap88 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection89 = strMap88.values();
        java.util.Collection<java.io.Serializable> serializableCollection90 = strMap88.values();
        java.io.Serializable serializable91 = strMap82.get((java.lang.Object) strMap88);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet92 = strMap88.entrySet();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap88);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + true + "'", serializable22, true);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNotNull(serializableCollection26);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + serializable53 + "' != '" + true + "'", serializable53, true);
        org.junit.Assert.assertNull(serializable56);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 17 + "'", int78 == 17);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(serializable80);
        org.junit.Assert.assertNotNull(serializableCollection83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(serializableCollection89);
        org.junit.Assert.assertNotNull(serializableCollection90);
        org.junit.Assert.assertNull(serializable91);
        org.junit.Assert.assertNotNull(strEntrySet92);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        boolean boolean3 = objList1.contains((java.lang.Object) 28);
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean6 = objList1.removeAll((java.util.Collection<java.lang.Object>) objList5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable12 = strMap1.get((java.lang.Object) (-4));
        boolean boolean13 = strMap1.isEmpty();
        java.util.Collection<java.io.Serializable> serializableCollection14 = strMap1.values();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableCollection14);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
        examples.MaxBag maxBag5 = new examples.MaxBag();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        maxBag5._var66253 = intList29;
        maxBag5._var1457 = false;
        maxBag5._var1457 = false;
        maxBag5.add((java.lang.Integer) (-9));
        java.io.Serializable serializable38 = strMap1.remove((java.lang.Object) (-9));
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(serializable38);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        long long1 = java.lang.Integer.toUnsignedLong(100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        boolean boolean1 = java.lang.Boolean.parseBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int int2 = java.lang.Integer.max((int) (short) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        boolean boolean10 = strMap2.containsKey((java.lang.Object) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        boolean boolean14 = strMap12.isEmpty();
        boolean boolean16 = strMap12.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        boolean boolean25 = strMap12.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap24);
        strMap2.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap24);
        int int27 = strMap2.size();
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>(48);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable11 = strMap5.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap5.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-5L), 0, serializableCollection12, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 1.0f);
        boolean boolean32 = objList27.add((java.lang.Object) (-8L));
        int int33 = objList27.size();
        java.lang.Object[] objArray34 = objList27.toArray();
        boolean boolean35 = objList1.remove((java.lang.Object) objArray34);
        java.util.HashMap<java.util.stream.Stream<java.lang.Object>, java.util.Map<java.lang.String, java.io.Serializable>> objStreamMap37 = new java.util.HashMap<java.util.stream.Stream<java.lang.Object>, java.util.Map<java.lang.String, java.io.Serializable>>(5);
        int int38 = objList1.indexOf((java.lang.Object) objStreamMap37);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int2 = java.lang.Integer.rotateRight(41, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1543503872) + "'", int2 == (-1543503872));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String str1 = java.lang.Integer.toBinaryString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int2 = java.lang.Integer.rotateLeft((int) (short) 1, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 256 + "'", int2 == 256);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(10, (float) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -6.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int int2 = java.lang.Integer.rotateRight((int) (byte) 1, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 536870912 + "'", int2 == 536870912);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet4 = strMap1.entrySet();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strEntrySet4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable56 = strMap53.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass57 = serializable56.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap80 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection81 = strMap80.values();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap48, ' ', "", wildcardClass57, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection81, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        boolean boolean90 = objList87.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList92 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean93 = objList87.addAll(32, (java.util.Collection<java.lang.Object>) objList92);
        boolean boolean94 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList87);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = objList87.remove((-16777217));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16777217");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertEquals("'" + serializable56 + "' != '" + true + "'", serializable56, true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(serializableCollection81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("37777777776");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777776\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean1 = java.lang.Boolean.getBoolean("37777777766");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable13 = strMap10.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable14 = strMap1.getOrDefault((java.lang.Object) "37777777773", (java.io.Serializable) strMap10);
        int int15 = strMap10.size();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + true + "'", serializable13, true);
        org.junit.Assert.assertNotNull(serializable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        examples.MaxBag maxBag55 = new examples.MaxBag();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        maxBag55._var66253 = intList79;
        int int82 = objList17.indexOf((java.lang.Object) maxBag55);
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap83 = maxBag55._var721;
        maxBag55._var5992 = 100;
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intMap83);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        int int8 = strMap1.size();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-4.6d) + "'", serializable7, (-4.6d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int int2 = java.lang.Integer.sum(9, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("4294967292");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4294967292\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int1 = java.lang.Integer.reverseBytes(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap8 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable11 = strMap8.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass12 = serializable11.getClass();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable11, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        int int23 = objList21.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable30 = strMap27.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable33 = strMap27.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection34 = strMap27.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap42 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-5L), 0, serializableCollection34, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        boolean boolean52 = objList49.add((java.lang.Object) 1.0f);
        boolean boolean54 = objList49.add((java.lang.Object) (-8L));
        int int55 = objList49.size();
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList49.removeAll((java.util.Collection<java.lang.Object>) objList56);
        boolean boolean58 = objList21.containsAll((java.util.Collection<java.lang.Object>) objList49);
        java.util.stream.Stream<java.lang.Object> objStream59 = objList21.parallelStream();
        boolean boolean60 = objList21.isEmpty();
        java.io.Serializable serializable61 = strMap1.replace("100000", (java.io.Serializable) boolean60);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + true + "'", serializable11, true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + true + "'", serializable30, true);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNotNull(serializableCollection34);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 17 + "'", int55 == 17);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objStream59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(serializable61);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int int1 = java.lang.Integer.lowestOneBit(48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.util.Iterator<java.lang.Object> objItor55 = objList17.iterator();
        java.util.Iterator<java.lang.Object> objItor56 = objList17.iterator();
        java.lang.Object obj58 = objList17.remove(0);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objItor55);
        org.junit.Assert.assertNotNull(objItor56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1073741825) + "'", obj58, (-1073741825));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int int2 = java.lang.Integer.compareUnsigned((-2013265920), 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.Cloneable, java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>>> cloneableMap2 = new java.util.HashMap<java.lang.Cloneable, java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>>>((int) (short) -1, (float) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap7.values();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int int1 = java.lang.Integer.lowestOneBit(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.Boolean boolean1 = new java.lang.Boolean("100000");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap6 = new java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        boolean boolean7 = objList4.remove((java.lang.Object) strComparableMap6);
        objList4.trimToSize();
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        boolean boolean14 = strMap1.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap13);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable19 = strMap16.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable22 = strMap16.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        java.util.Collection<java.io.Serializable> serializableCollection23 = strMap16.values();
        java.io.Serializable serializable24 = strMap1.get((java.lang.Object) serializableCollection23);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + (-4.6d) + "'", serializable22, (-4.6d));
        org.junit.Assert.assertNotNull(serializableCollection23);
        org.junit.Assert.assertNull(serializable24);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777776", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 37777777776 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int2 = java.lang.Integer.compareUnsigned(2, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) 100);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        examples._Type328393 _Type328393_4 = maxBag0._var4384;
        org.junit.Assert.assertNotNull(_Type328393_3);
        org.junit.Assert.assertNotNull(_Type328393_4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap9.values();
        boolean boolean11 = strMap9.isEmpty();
        boolean boolean13 = strMap9.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap15 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap15.values();
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap15.values();
        java.io.Serializable serializable18 = strMap9.get((java.lang.Object) strMap15);
        java.io.Serializable serializable21 = strMap9.put("hi!", (java.io.Serializable) 7);
        java.util.Set<java.lang.String> strSet22 = strMap9.keySet();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        strMap9.clear();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList1.ensureCapacity(10);
        java.lang.Object[] objArray4 = objList1.toArray();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        examples.MaxBag maxBag1 = new examples.MaxBag();
        maxBag1._var587 = (-5);
        examples._Type328393 _Type328393_4 = maxBag1._var4384;
        java.lang.Integer[] intArray5 = _Type328393_4.get_1();
        examples._Type328393 _Type328393_6 = new examples._Type328393((java.lang.Integer) 1610612737, intArray5);
        org.junit.Assert.assertNotNull(_Type328393_4);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int int1 = java.lang.Integer.reverseBytes(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83886080 + "'", int1 == 83886080);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int int1 = java.lang.Integer.reverseBytes(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag29 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap30 = maxBag29._var721;
        java.util.ArrayList<java.lang.Integer> intList31 = maxBag29._var66253;
        boolean boolean32 = objList25.remove((java.lang.Object) intList31);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList31);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intMap30);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        maxBag0._var5992 = 0;
        maxBag0._var1457 = false;
        maxBag0.clear();
        org.junit.Assert.assertNotNull(intMap1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("37777777766", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.put("hi!", (java.io.Serializable) (-1));
        boolean boolean8 = strMap1.containsKey((java.lang.Object) 3);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.remove((java.lang.Integer) 48);
        examples._Type328393 _Type328393_29 = maxBag0._var4384;
        _Type328393_29._0 = 10;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_29);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>(48);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList2 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        int int3 = objList1.indexOf((java.lang.Object) objIterableList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        int int2 = java.lang.Integer.sum(67108864, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67108857 + "'", int2 == 67108857);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        int int2 = java.lang.Integer.min((-5), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        java.lang.Object obj59 = objList51.get((int) (byte) 0);
        java.util.ListIterator<java.lang.Object> objItor60 = objList51.listIterator();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) -1 + "'", obj59, (short) -1);
        org.junit.Assert.assertNotNull(objItor60);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.HashMap<examples.MaxBag, java.util.HashMap<java.lang.String, java.io.Serializable>> maxBagMap2 = new java.util.HashMap<examples.MaxBag, java.util.HashMap<java.lang.String, java.io.Serializable>>(68, 100.0f);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable12 = strMap7.get((java.lang.Object) 2);
        java.util.ArrayList<java.util.Collection<java.lang.Object>> objCollectionList14 = new java.util.ArrayList<java.util.Collection<java.lang.Object>>();
        boolean boolean15 = strMap7.remove((java.lang.Object) 1L, (java.lang.Object) objCollectionList14);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("hi!", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -4 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(0);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap10.values();
        strMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap10);
        boolean boolean13 = strMap5.containsKey((java.lang.Object) strMap10);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap15 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap15.values();
        boolean boolean17 = strMap15.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable22 = strMap19.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap19);
        java.io.Serializable serializable24 = strMap15.remove((java.lang.Object) strMap19);
        strMap10.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap15);
        java.io.Serializable serializable26 = strMap1.put("0", (java.io.Serializable) strMap10);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + true + "'", serializable22, true);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNull(serializable26);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.lang.Object[] objArray32 = objList25.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList25.get(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 41, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(512, (float) 32);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable15 = strMap9.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-5L), 0, serializableCollection16, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        boolean boolean34 = objList31.add((java.lang.Object) 1.0f);
        boolean boolean36 = objList31.add((java.lang.Object) (-8L));
        int int37 = objList31.size();
        java.util.ArrayList<java.lang.Object> objList38 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean39 = objList31.removeAll((java.util.Collection<java.lang.Object>) objList38);
        boolean boolean40 = strMap1.containsValue((java.lang.Object) objList31);
        boolean boolean42 = strMap1.containsValue((java.lang.Object) 67L);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("37777777766");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777766\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int int1 = java.lang.Integer.parseInt("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap6 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection7 = strMap6.values();
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap6.values();
        java.io.Serializable serializable11 = strMap6.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable14 = strMap6.putIfAbsent("8", (java.io.Serializable) (-4L));
        java.io.Serializable serializable16 = strMap1.getOrDefault((java.lang.Object) "8", (java.io.Serializable) 1.2d);
        java.util.Set<java.lang.String> strSet17 = strMap1.keySet();
        java.util.ArrayList<java.lang.Object> objList19 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList19.ensureCapacity(10);
        boolean boolean22 = strMap1.containsValue((java.lang.Object) 10);
        java.io.Serializable serializable25 = strMap1.replace("31", (java.io.Serializable) "hi!");
        java.util.Set<java.lang.String> strSet26 = strMap1.keySet();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(serializableCollection7);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1.2d + "'", serializable16, 1.2d);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection14 = strMap13.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable21 = strMap18.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass22 = serializable21.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection46 = strMap45.values();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap13, ' ', "", wildcardClass22, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection46, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList52, objArray51);
        boolean boolean55 = objList52.remove((java.lang.Object) (-10.5d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap57 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable60 = strMap57.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.ArrayList<java.lang.Object> objList63 = new java.util.ArrayList<java.lang.Object>();
        objList63.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap76 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection77 = strMap76.values();
        java.util.Collection<java.io.Serializable> serializableCollection78 = strMap76.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap89 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray95 = new java.lang.Object[] { 3L, (-10.5d), serializable60, 10.5d, (-7L), objList63, (-2), (-1.0f), 10.0d, (-4.6d), 1, 0L, (-10), (-6), 100L, (-1L), serializableCollection78, 8.4d, '#', (-7), (-4.6d), (-10), 0L, "hi!", (-100), 100.0d, 7, (byte) 1, (-10), (-7.3d), (byte) 0, 2 };
        java.util.ArrayList<java.lang.Object> objList96 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList96, objArray95);
        int int98 = objList96.size();
        java.lang.Object[] objArray99 = objList96.toArray();
        org.junit.Assert.assertNotNull(serializableCollection14);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + true + "'", serializable21, true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + serializable60 + "' != '" + true + "'", serializable60, true);
        org.junit.Assert.assertNotNull(serializableCollection77);
        org.junit.Assert.assertNotNull(serializableCollection78);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[3, -10.5, true, 10.5, -7, [], -2, -1.0, 10.0, -4.6, 1, 0, -10, -6, 100, -1, [], 8.4, #, -7, -4.6, -10, 0, hi!, -100, 100.0, 7, 1, -10, -7.3, 0, 2]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 32 + "'", int98 == 32);
        org.junit.Assert.assertNotNull(objArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray99), "[3, -10.5, true, 10.5, -7, [], -2, -1.0, 10.0, -4.6, 1, 0, -10, -6, 100, -1, [], 8.4, #, -7, -4.6, -10, 0, hi!, -100, 100.0, 7, 1, -10, -7.3, 0, 2]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int1 = java.lang.Integer.bitCount((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        int int58 = objList51.size();
        boolean boolean59 = objList51.isEmpty();
        java.lang.reflect.Type[] typeArray60 = new java.lang.reflect.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray61 = objList51.toArray(typeArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 41 + "'", int58 == 41);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(typeArray60);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4294967292");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.getOrDefault((java.lang.Object) (byte) 1, (java.io.Serializable) (-8L));
        java.io.Serializable serializable9 = strMap1.get((java.lang.Object) (-3.8d));
        int int10 = strMap1.size();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-8L) + "'", serializable7, (-8L));
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList51.addAll(32, (java.util.Collection<java.lang.Object>) objList56);
        java.lang.Object obj59 = objList51.get((int) (byte) 0);
        boolean boolean60 = objList51.isEmpty();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) -1 + "'", obj59, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        int int3 = strMap2.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap6 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection7 = strMap6.values();
        boolean boolean8 = strMap6.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap6);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap11.values();
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap11.values();
        java.io.Serializable serializable16 = strMap11.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable19 = strMap11.putIfAbsent("8", (java.io.Serializable) (-4L));
        java.io.Serializable serializable21 = strMap6.getOrDefault((java.lang.Object) "8", (java.io.Serializable) 1.2d);
        java.util.Set<java.lang.String> strSet22 = strMap6.keySet();
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList24.ensureCapacity(10);
        boolean boolean27 = strMap6.containsValue((java.lang.Object) 10);
        java.io.Serializable serializable28 = strMap2.putIfAbsent("100000", (java.io.Serializable) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(serializableCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + 1.2d + "'", serializable21, 1.2d);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(serializable28);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable13 = strMap10.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass14 = serializable13.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable13, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        int int25 = objList23.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable35 = strMap29.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection36 = strMap29.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-5L), 0, serializableCollection36, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.add((java.lang.Object) 1.0f);
        boolean boolean56 = objList51.add((java.lang.Object) (-8L));
        int int57 = objList51.size();
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList51.removeAll((java.util.Collection<java.lang.Object>) objList58);
        boolean boolean60 = objList23.containsAll((java.util.Collection<java.lang.Object>) objList51);
        boolean boolean61 = strMap1.containsKey((java.lang.Object) objList51);
        java.util.Iterator<java.lang.Object> objItor62 = objList51.iterator();
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator63 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList51.replaceAll(objUnaryOperator63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + true + "'", serializable13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 17 + "'", int57 == 17);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objItor62);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>((-100), (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37777777773", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777773\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.Collection<java.io.Serializable> serializableCollection6 = strMap4.values();
        java.io.Serializable serializable9 = strMap4.put("hi!", (java.io.Serializable) (-1));
        java.io.Serializable serializable11 = strMap4.get((java.lang.Object) 10);
        boolean boolean12 = objList2.contains((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection6);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1342177280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1342177280" + "'", str1, "1342177280");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        int int2 = java.lang.Integer.compareUnsigned((-3), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = strMap1.replace("1100100", (java.io.Serializable) objList34, (java.io.Serializable) (-100));
        java.lang.Object obj41 = objList34.remove(0);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-5L) + "'", obj41, (-5L));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        int int1 = java.lang.Integer.parseInt("31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Integer> intList3 = maxBag0._var66253;
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        boolean boolean10 = strMap2.containsKey((java.lang.Object) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable17 = strMap14.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable20 = strMap14.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection21 = strMap14.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-5L), 0, serializableCollection21, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean39 = objList36.add((java.lang.Object) 1.0f);
        boolean boolean41 = objList36.add((java.lang.Object) (-8L));
        int int42 = objList36.size();
        java.lang.Object[] objArray43 = objList36.toArray();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable46 = strMap2.getOrDefault((java.lang.Object) objArray43, (java.io.Serializable) strMap45);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + true + "'", serializable17, true);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(serializableCollection21);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 17 + "'", int42 == 17);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
        org.junit.Assert.assertNotNull(serializable46);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(671088640);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "671088640" + "'", str1, "671088640");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4294967295", 67);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 67 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = strMap1.replace("1100100", (java.io.Serializable) objList34, (java.io.Serializable) (-100));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap43 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable46 = strMap43.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable49 = strMap43.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection50 = strMap43.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap58 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-5L), 0, serializableCollection50, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList65 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList65, objArray64);
        boolean boolean68 = objList65.add((java.lang.Object) 1.0f);
        boolean boolean70 = objList65.add((java.lang.Object) (-8L));
        int int71 = objList65.size();
        boolean boolean72 = objList34.retainAll((java.util.Collection<java.lang.Object>) objList65);
        java.util.Iterator<java.lang.Object> objItor73 = objList34.iterator();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + true + "'", serializable46, true);
        org.junit.Assert.assertNull(serializable49);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 17 + "'", int71 == 17);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objItor73);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        int int33 = objList25.lastIndexOf((java.lang.Object) 28);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable41 = strMap38.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable44 = strMap38.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap38.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-5L), 0, serializableCollection45, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        boolean boolean63 = objList60.add((java.lang.Object) 1.0f);
        boolean boolean65 = objList60.add((java.lang.Object) (-8L));
        objList60.trimToSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = objList25.addAll((-83886081), (java.util.Collection<java.lang.Object>) objList60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -83886081, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + true + "'", serializable41, true);
        org.junit.Assert.assertNull(serializable44);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap15 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap15.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass24 = serializable23.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap47 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection48 = strMap47.values();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap15, ' ', "", wildcardClass24, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection48, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = objList54.addAll(32, (java.util.Collection<java.lang.Object>) objList59);
        boolean boolean61 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList59);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(serializableCollection48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable7 = strMap1.putIfAbsent("", (java.io.Serializable) 6.9d);
        examples.MaxBag maxBag8 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap9 = maxBag8._var721;
        java.util.ArrayList<java.lang.Integer> intList10 = maxBag8._var66253;
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        boolean boolean14 = strMap12.isEmpty();
        boolean boolean16 = strMap12.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap18.values();
        java.util.Collection<java.io.Serializable> serializableCollection20 = strMap18.values();
        java.io.Serializable serializable21 = strMap12.get((java.lang.Object) strMap18);
        java.io.Serializable serializable23 = strMap18.get((java.lang.Object) 2);
        int int24 = strMap18.size();
        boolean boolean25 = strMap1.remove((java.lang.Object) maxBag8, (java.lang.Object) int24);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(intMap9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(serializableCollection20);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNull(serializable23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.Collection<java.io.Serializable> serializableCollection14 = strMap12.values();
        java.io.Serializable serializable17 = strMap12.put("hi!", (java.io.Serializable) (-1));
        strMap5.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap12);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertNotNull(serializableCollection14);
        org.junit.Assert.assertNull(serializable17);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        int int1 = java.lang.Integer.parseInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        objList0.clear();
        java.util.ArrayList<java.lang.Object> objList3 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList3.ensureCapacity(10);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable13 = strMap10.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass14 = serializable13.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable13, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        int int25 = objList23.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable35 = strMap29.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection36 = strMap29.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-5L), 0, serializableCollection36, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.add((java.lang.Object) 1.0f);
        boolean boolean56 = objList51.add((java.lang.Object) (-8L));
        int int57 = objList51.size();
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList51.removeAll((java.util.Collection<java.lang.Object>) objList58);
        boolean boolean60 = objList23.containsAll((java.util.Collection<java.lang.Object>) objList51);
        int int61 = objList3.lastIndexOf((java.lang.Object) objList51);
        int int62 = objList0.lastIndexOf((java.lang.Object) int61);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + true + "'", serializable13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 17 + "'", int57 == 17);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int1 = java.lang.Integer.highestOneBit(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) 100);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        _Type328393_3._0 = (-2);
        org.junit.Assert.assertNotNull(_Type328393_3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.lang.Object obj56 = objList17.remove(3);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + true + "'", obj56, true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("671088640");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        boolean boolean2 = java.lang.Boolean.logicalAnd(false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        maxBag0._var587 = (-9);
        org.junit.Assert.assertNotNull(intMap1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("4294967295", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.lang.Boolean boolean2 = maxBag0._var1457;
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int int2 = java.lang.Integer.sum(6, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        boolean boolean1 = java.lang.Boolean.parseBoolean("100000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
        java.lang.Object obj6 = null;
        boolean boolean8 = strMap1.remove(obj6, (java.lang.Object) "4294967295");
        java.io.Serializable serializable11 = strMap1.replace("4294967295", (java.io.Serializable) (-3));
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(serializable11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        boolean boolean1 = java.lang.Boolean.getBoolean("1100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        boolean boolean14 = strMap12.isEmpty();
        boolean boolean16 = strMap12.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap18.values();
        java.util.Collection<java.io.Serializable> serializableCollection20 = strMap18.values();
        java.io.Serializable serializable21 = strMap12.get((java.lang.Object) strMap18);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet22 = strMap18.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet23 = strMap18.entrySet();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap18);
        java.io.Serializable serializable27 = strMap1.replace("671088640", (java.io.Serializable) 68);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(serializableCollection20);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(strEntrySet22);
        org.junit.Assert.assertNotNull(strEntrySet23);
        org.junit.Assert.assertNull(serializable27);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.String str1 = java.lang.Integer.toBinaryString(8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000" + "'", str1, "1000");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        strMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap12);
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap12);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-4.6d) + "'", serializable7, (-4.6d));
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(serializableCollection13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.util.ArrayList<java.lang.Object>, java.util.HashMap<java.lang.String, java.io.Serializable>> objListMap2 = new java.util.HashMap<java.util.ArrayList<java.lang.Object>, java.util.HashMap<java.lang.String, java.io.Serializable>>(83886080, (float) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -4.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass21 = serializable20.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap12, ' ', "", wildcardClass21, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection45, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        boolean boolean54 = objList51.remove((java.lang.Object) (-10.5d));
        int int55 = objList51.size();
        java.lang.Object[] objArray56 = objList51.toArray();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 41 + "'", int55 == 41);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.remove((java.lang.Integer) 17);
        examples.MaxBag maxBag32 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap33 = maxBag32._var721;
        java.util.ArrayList<java.lang.Integer> intList34 = maxBag32._var66253;
        maxBag0._var66253 = intList34;
        maxBag0._var5992 = 3;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intMap33);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        int int2 = java.lang.Integer.max(5, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671088640 + "'", int2 == 671088640);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.Map<java.lang.String, java.io.Serializable> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap28 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection29 = strMap28.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap33 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable36 = strMap33.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass37 = serializable36.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap60 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection61 = strMap60.values();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap28, ' ', "", wildcardClass37, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection61, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList67 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList67, objArray66);
        boolean boolean70 = objList67.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList72 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean73 = objList67.addAll(32, (java.util.Collection<java.lang.Object>) objList72);
        java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap74 = new java.util.HashMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-5), 100, (-3L), "1100100", objList67, strComparableMap74, (-2L), 100L, (byte) -1 };
        java.util.ArrayList<java.lang.Object> objList79 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList79, objArray78);
        java.lang.Object[] objArray81 = objList79.toArray();
        java.io.Serializable serializable82 = strMap1.getOrDefault((java.lang.Object) 6, (java.io.Serializable) objList79);
        objList79.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection29);
        org.junit.Assert.assertEquals("'" + serializable36 + "' != '" + true + "'", serializable36, true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(serializableCollection61);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[-5, 100, -3, 1100100, [-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6], {}, -2, 100, -1]");
        org.junit.Assert.assertNotNull(serializable82);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int int1 = java.lang.Integer.highestOneBit(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.util.ArrayList<java.lang.Integer> intList2 = maxBag0._var66253;
        maxBag0._var1457 = true;
        examples.MaxBag maxBag5 = new examples.MaxBag();
        maxBag5._var587 = (-5);
        examples._Type328393 _Type328393_8 = maxBag5._var4384;
        _Type328393_8._0 = 6;
        maxBag0._var4384 = _Type328393_8;
        java.lang.Integer[] intArray12 = _Type328393_8._1;
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(_Type328393_8);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList1.ensureCapacity(10);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap8 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable11 = strMap8.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass12 = serializable11.getClass();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable11, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        int int23 = objList21.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable30 = strMap27.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable33 = strMap27.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection34 = strMap27.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap42 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-5L), 0, serializableCollection34, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        boolean boolean52 = objList49.add((java.lang.Object) 1.0f);
        boolean boolean54 = objList49.add((java.lang.Object) (-8L));
        int int55 = objList49.size();
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = objList49.removeAll((java.util.Collection<java.lang.Object>) objList56);
        boolean boolean58 = objList21.containsAll((java.util.Collection<java.lang.Object>) objList49);
        int int59 = objList1.lastIndexOf((java.lang.Object) objList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = objList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + true + "'", serializable11, true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + true + "'", serializable30, true);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNotNull(serializableCollection34);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 17 + "'", int55 == 17);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet11 = strMap7.entrySet();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable17 = strMap14.put("", (java.io.Serializable) '4');
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap14.values();
        boolean boolean19 = strMap7.remove((java.lang.Object) 6L, (java.lang.Object) strMap14);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(strEntrySet11);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        boolean boolean10 = strMap2.containsKey((java.lang.Object) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        boolean boolean14 = strMap12.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable19 = strMap16.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap16);
        java.io.Serializable serializable21 = strMap12.remove((java.lang.Object) strMap16);
        strMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap12);
        java.util.Collection<java.io.Serializable> serializableCollection23 = strMap7.values();
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + true + "'", serializable19, true);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(serializableCollection23);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable15 = strMap9.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-5L), 0, serializableCollection16, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        boolean boolean34 = objList31.add((java.lang.Object) 1.0f);
        boolean boolean36 = objList31.add((java.lang.Object) (-8L));
        int int37 = objList31.size();
        java.util.ArrayList<java.lang.Object> objList38 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean39 = objList31.removeAll((java.util.Collection<java.lang.Object>) objList38);
        boolean boolean40 = strMap1.containsValue((java.lang.Object) objList31);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable48 = strMap45.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass49 = serializable48.getClass();
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable48, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList58, objArray57);
        int int60 = objList58.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap64 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable67 = strMap64.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable70 = strMap64.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection71 = strMap64.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap79 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray85 = new java.lang.Object[] { (-5L), 0, serializableCollection71, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList86 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList86, objArray85);
        boolean boolean89 = objList86.add((java.lang.Object) 1.0f);
        boolean boolean91 = objList86.add((java.lang.Object) (-8L));
        int int92 = objList86.size();
        java.util.ArrayList<java.lang.Object> objList93 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean94 = objList86.removeAll((java.util.Collection<java.lang.Object>) objList93);
        boolean boolean95 = objList58.containsAll((java.util.Collection<java.lang.Object>) objList86);
        boolean boolean96 = objList31.containsAll((java.util.Collection<java.lang.Object>) objList58);
        java.util.Iterator<java.lang.Object> objItor97 = objList58.iterator();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + serializable48 + "' != '" + true + "'", serializable48, true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 11 + "'", int60 == 11);
        org.junit.Assert.assertEquals("'" + serializable67 + "' != '" + true + "'", serializable67, true);
        org.junit.Assert.assertNull(serializable70);
        org.junit.Assert.assertNotNull(serializableCollection71);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 17 + "'", int92 == 17);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(objItor97);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        boolean boolean14 = strMap12.isEmpty();
        boolean boolean16 = strMap12.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap18.values();
        java.util.Collection<java.io.Serializable> serializableCollection20 = strMap18.values();
        java.io.Serializable serializable21 = strMap12.get((java.lang.Object) strMap18);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet22 = strMap18.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet23 = strMap18.entrySet();
        java.io.Serializable serializable24 = strMap1.remove((java.lang.Object) strMap18);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet25 = strMap1.entrySet();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(serializableCollection20);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(strEntrySet22);
        org.junit.Assert.assertNotNull(strEntrySet23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(strEntrySet25);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        int int2 = java.lang.Integer.remainderUnsigned(10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.clear();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap1);
        examples.MaxBag maxBag6 = new examples.MaxBag();
        maxBag6.add((java.lang.Integer) 100);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = objList34.add((java.lang.Object) (-8L));
        int int40 = objList34.size();
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = objList34.removeAll((java.util.Collection<java.lang.Object>) objList41);
        int int43 = objList41.size();
        objList41.trimToSize();
        java.io.Serializable serializable45 = strMap1.getOrDefault((java.lang.Object) maxBag6, (java.io.Serializable) objList41);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 17 + "'", int40 == 17);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(serializable45);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.lang.String str1 = java.lang.Integer.toHexString(67108864);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4000000" + "'", str1, "4000000");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        int int35 = objList25.lastIndexOf((java.lang.Object) (-10));
        java.util.ListIterator<java.lang.Object> objItor37 = objList25.listIterator(4);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objItor37);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        int int1 = java.lang.Integer.bitCount(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap34 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable37 = strMap34.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable40 = strMap34.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection41 = strMap34.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap49 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-5L), 0, serializableCollection41, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        boolean boolean59 = objList56.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag60 = new examples.MaxBag();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        maxBag60._var66253 = intList84;
        maxBag60._var1457 = false;
        maxBag60._var1457 = false;
        java.lang.Boolean boolean91 = maxBag60._var1457;
        boolean boolean92 = objList56.add((java.lang.Object) boolean91);
        boolean boolean93 = objList25.addAll((java.util.Collection<java.lang.Object>) objList56);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + true + "'", serializable37, true);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNotNull(serializableCollection41);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + boolean91 + "' != '" + false + "'", boolean91, false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        int int2 = java.lang.Integer.rotateRight(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388608 + "'", int2 == 8388608);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0._var587 = (-5);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        _Type328393_3._0 = 6;
        _Type328393_3._0 = 2;
        org.junit.Assert.assertNotNull(_Type328393_3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        java.util.ListIterator<java.lang.Object> objItor6 = objList4.listIterator();
        java.lang.Object[] objArray7 = objList4.toArray();
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        int int56 = objList45.lastIndexOf((java.lang.Object) 10L);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        int int1 = java.lang.Integer.bitCount(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        examples.MaxBag maxBag29 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap30 = maxBag29._var721;
        java.util.ArrayList<java.lang.Integer> intList31 = maxBag29._var66253;
        boolean boolean32 = objList25.remove((java.lang.Object) intList31);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap46 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection47 = strMap46.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap51 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable54 = strMap51.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass55 = serializable54.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap78 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection79 = strMap78.values();
        java.lang.Object[] objArray84 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap46, ' ', "", wildcardClass55, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection79, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList85 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList85, objArray84);
        boolean boolean88 = objList85.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList90 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean91 = objList85.addAll(32, (java.util.Collection<java.lang.Object>) objList90);
        int int92 = objList85.size();
        boolean boolean93 = objList85.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = objList25.addAll(100, (java.util.Collection<java.lang.Object>) objList85);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 16");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intMap30);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableCollection47);
        org.junit.Assert.assertEquals("'" + serializable54 + "' != '" + true + "'", serializable54, true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(serializableCollection79);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 41 + "'", int92 == 41);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap17.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap22 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable25 = strMap22.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass26 = serializable25.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap49 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection50 = strMap49.values();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap17, ' ', "", wildcardClass26, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection50, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        boolean boolean59 = objList56.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList61 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean62 = objList56.addAll(32, (java.util.Collection<java.lang.Object>) objList61);
        boolean boolean64 = strMap1.remove((java.lang.Object) objList61, (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = objList61.get((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + true + "'", serializable25, true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap8 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable11 = strMap8.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable14 = strMap8.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable22 = strMap19.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable25 = strMap19.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection26 = strMap19.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap34 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-5L), 0, serializableCollection26, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList41, objArray40);
        boolean boolean44 = objList41.add((java.lang.Object) 1.0f);
        boolean boolean46 = strMap8.replace("1100100", (java.io.Serializable) objList41, (java.io.Serializable) (-100));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap50 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable53 = strMap50.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable56 = strMap50.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection57 = strMap50.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap65 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-5L), 0, serializableCollection57, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList72 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList72, objArray71);
        boolean boolean75 = objList72.add((java.lang.Object) 1.0f);
        boolean boolean77 = objList72.add((java.lang.Object) (-8L));
        int int78 = objList72.size();
        boolean boolean79 = objList41.retainAll((java.util.Collection<java.lang.Object>) objList72);
        java.io.Serializable serializable80 = strMap4.remove((java.lang.Object) boolean79);
        int int81 = strMap4.size();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + true + "'", serializable22, true);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNotNull(serializableCollection26);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + serializable53 + "' != '" + true + "'", serializable53, true);
        org.junit.Assert.assertNull(serializable56);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 17 + "'", int78 == 17);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(serializable80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection33 = strMap32.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap37 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable40 = strMap37.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass41 = serializable40.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap64 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection65 = strMap64.values();
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap32, ' ', "", wildcardClass41, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection65, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList71, objArray70);
        boolean boolean74 = objList71.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList76 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean77 = objList71.addAll(32, (java.util.Collection<java.lang.Object>) objList76);
        boolean boolean78 = objList17.retainAll((java.util.Collection<java.lang.Object>) objList71);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(serializableCollection33);
        org.junit.Assert.assertEquals("'" + serializable40 + "' != '" + true + "'", serializable40, true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(serializableCollection65);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int int1 = java.lang.Integer.bitCount((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.remove((java.lang.Integer) 17);
        examples._Type328393 _Type328393_32 = maxBag0._var4384;
        maxBag0._var587 = 5;
        maxBag0._var1457 = false;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_32);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int int2 = java.lang.Integer.compare((int) (byte) 0, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("37777777766");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = strMap1.replace("1100100", (java.io.Serializable) objList34, (java.io.Serializable) (-100));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap43 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable46 = strMap43.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable49 = strMap43.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection50 = strMap43.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap58 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-5L), 0, serializableCollection50, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList65 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList65, objArray64);
        boolean boolean68 = objList65.add((java.lang.Object) 1.0f);
        boolean boolean70 = objList65.add((java.lang.Object) (-8L));
        int int71 = objList65.size();
        boolean boolean72 = objList34.retainAll((java.util.Collection<java.lang.Object>) objList65);
        java.util.HashMap<java.util.Collection<java.lang.Object>, java.util.ListIterator<java.lang.Object>> objCollectionMap73 = new java.util.HashMap<java.util.Collection<java.lang.Object>, java.util.ListIterator<java.lang.Object>>();
        boolean boolean74 = objList65.add((java.lang.Object) objCollectionMap73);
        java.util.ListIterator<java.lang.Object> objItor76 = objList65.listIterator(11);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + true + "'", serializable46, true);
        org.junit.Assert.assertNull(serializable49);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 17 + "'", int71 == 17);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(objItor76);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        int int1 = java.lang.Integer.signum(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int int2 = java.lang.Integer.sum(256, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296 + "'", int2 == 296);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("31");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.util.ArrayList<java.lang.Integer> intList2 = maxBag0._var66253;
        java.util.ArrayList<java.lang.Integer> intList3 = maxBag0._var66253;
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.remove((java.lang.Integer) 48);
        examples._Type328393 _Type328393_29 = maxBag0._var4384;
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap30 = null;
        maxBag0._var721 = intMap30;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_29);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.remove((java.lang.Integer) 17);
        examples.MaxBag maxBag32 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap33 = maxBag32._var721;
        java.util.ArrayList<java.lang.Integer> intList34 = maxBag32._var66253;
        maxBag0._var66253 = intList34;
        maxBag0.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intMap33);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.lang.Boolean boolean1 = new java.lang.Boolean("hi!");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable15 = strMap12.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable18 = strMap12.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection19 = strMap12.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-5L), 0, serializableCollection19, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.add((java.lang.Object) 1.0f);
        boolean boolean39 = strMap1.replace("1100100", (java.io.Serializable) objList34, (java.io.Serializable) (-100));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap43 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable46 = strMap43.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable49 = strMap43.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection50 = strMap43.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap58 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-5L), 0, serializableCollection50, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList65 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList65, objArray64);
        boolean boolean68 = objList65.add((java.lang.Object) 1.0f);
        boolean boolean70 = objList65.add((java.lang.Object) (-8L));
        int int71 = objList65.size();
        boolean boolean72 = objList34.retainAll((java.util.Collection<java.lang.Object>) objList65);
        java.lang.Object[] objArray73 = objList65.toArray();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + true + "'", serializable15, true);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + serializable46 + "' != '" + true + "'", serializable46, true);
        org.junit.Assert.assertNull(serializable49);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 17 + "'", int71 == 17);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable12 = strMap7.get((java.lang.Object) 2);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        boolean boolean18 = strMap16.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        java.io.Serializable serializable25 = strMap16.remove((java.lang.Object) strMap20);
        strMap20.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap28 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable31 = strMap28.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable34 = strMap28.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        strMap20.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap28);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap36 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        java.io.Serializable serializable37 = strMap7.putIfAbsent("12", (java.io.Serializable) strMap20);
        strMap7.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (-4.6d) + "'", serializable34, (-4.6d));
        org.junit.Assert.assertNull(serializable37);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        examples.MaxBag maxBag55 = new examples.MaxBag();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        maxBag55._var66253 = intList79;
        int int82 = objList17.indexOf((java.lang.Object) maxBag55);
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap83 = maxBag55._var721;
        maxBag55.remove((java.lang.Integer) 67);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intMap83);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        boolean boolean2 = java.lang.Boolean.logicalAnd(true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) -1, 8388608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388607 + "'", int2 == 8388607);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        examples.MaxBag maxBag55 = new examples.MaxBag();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        maxBag55._var66253 = intList79;
        int int82 = objList17.indexOf((java.lang.Object) maxBag55);
        java.lang.Boolean boolean83 = maxBag55._var1457;
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertEquals("'" + boolean83 + "' != '" + false + "'", boolean83, false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.lang.String str1 = java.lang.Integer.toHexString(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        objList45.ensureCapacity(11);
        objList45.ensureCapacity((int) '4');
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        boolean boolean10 = strMap2.containsKey((java.lang.Object) strMap7);
        strMap2.clear();
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.lang.String str1 = java.lang.Integer.toBinaryString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1610612737);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1610612737" + "'", str1, "1610612737");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("37777777773", 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 40 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.String str1 = java.lang.Integer.toHexString(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1c" + "'", str1, "1c");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 256 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable7, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        int int19 = objList17.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable29 = strMap23.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection30 = strMap23.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap38 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-5L), 0, serializableCollection30, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 1.0f);
        boolean boolean50 = objList45.add((java.lang.Object) (-8L));
        int int51 = objList45.size();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean53 = objList45.removeAll((java.util.Collection<java.lang.Object>) objList52);
        boolean boolean54 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList45);
        java.util.stream.Stream<java.lang.Object> objStream55 = objList17.parallelStream();
        boolean boolean56 = objList17.isEmpty();
        java.lang.Object obj58 = objList17.remove((int) (short) 10);
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor60 = objList59.listIterator();
        java.util.ArrayList<java.lang.Object> objList61 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList59);
        java.util.ArrayList<java.lang.Object> objList63 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean64 = objList59.retainAll((java.util.Collection<java.lang.Object>) objList63);
        boolean boolean65 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList59);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + true + "'", serializable7, true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNotNull(serializableCollection30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-10.5d) + "'", obj58, (-10.5d));
        org.junit.Assert.assertNotNull(objItor60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable12 = strMap7.get((java.lang.Object) 2);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        boolean boolean18 = strMap16.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable23 = strMap20.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        java.io.Serializable serializable25 = strMap16.remove((java.lang.Object) strMap20);
        strMap20.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap28 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable31 = strMap28.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable34 = strMap28.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        strMap20.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap28);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap36 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        java.io.Serializable serializable37 = strMap7.putIfAbsent("12", (java.io.Serializable) strMap20);
        java.util.Collection<java.io.Serializable> serializableCollection38 = strMap20.values();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + true + "'", serializable23, true);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertEquals("'" + serializable34 + "' != '" + (-4.6d) + "'", serializable34, (-4.6d));
        org.junit.Assert.assertNull(serializable37);
        org.junit.Assert.assertNotNull(serializableCollection38);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        maxBag0._var5992 = 11;
        maxBag0._var5992 = 1342177280;
        org.junit.Assert.assertNotNull(intMap1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("10", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -3 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap3 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable6 = strMap3.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable9 = strMap3.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap3.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap18 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-5L), 0, serializableCollection10, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        boolean boolean28 = objList25.add((java.lang.Object) 1.0f);
        boolean boolean30 = objList25.add((java.lang.Object) (-8L));
        int int31 = objList25.size();
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList32);
        boolean boolean35 = objList32.contains((java.lang.Object) 100.0d);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection49 = strMap48.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap53 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable56 = strMap53.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass57 = serializable56.getClass();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap80 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection81 = strMap80.values();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) -1, 1.0d, 4294967295L, 4.8d, 0.0d, (-2L), 0L, "", 5.3d, (-1L), 100L, strMap48, ' ', "", wildcardClass57, (-3), 2.7d, 100, 7.1d, (-9.3d), 0L, (-9), (byte) 1, 7.1d, (-8.7d), 0, 6, '4', 1L, (-1L), 2.7d, (short) -1, 4L, 100.0d, (-2L), 10, serializableCollection81, 9, 0, 10, (-4.6d) };
        java.util.ArrayList<java.lang.Object> objList87 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        boolean boolean90 = objList87.remove((java.lang.Object) (-10.5d));
        java.util.ArrayList<java.lang.Object> objList92 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean93 = objList87.addAll(32, (java.util.Collection<java.lang.Object>) objList92);
        boolean boolean94 = objList32.containsAll((java.util.Collection<java.lang.Object>) objList87);
        java.lang.Object[] objArray95 = objList32.toArray();
        java.util.ListIterator<java.lang.Object> objItor96 = objList32.listIterator();
        int int98 = objList32.indexOf((java.lang.Object) 4L);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertEquals("'" + serializable56 + "' != '" + true + "'", serializable56, true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(serializableCollection81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[]");
        org.junit.Assert.assertNotNull(objItor96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str1 = java.lang.Integer.toBinaryString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101" + "'", str1, "101");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        int int2 = java.lang.Integer.rotateRight((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>(0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable15 = strMap9.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection16 = strMap9.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap24 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-5L), 0, serializableCollection16, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        boolean boolean34 = objList31.add((java.lang.Object) 1.0f);
        boolean boolean36 = objList31.add((java.lang.Object) (-8L));
        int int37 = objList31.size();
        java.util.ArrayList<java.lang.Object> objList38 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean39 = objList31.removeAll((java.util.Collection<java.lang.Object>) objList38);
        boolean boolean40 = strMap1.containsValue((java.lang.Object) objList31);
        java.util.ArrayList<java.lang.Object> objList43 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor44 = objList43.listIterator();
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList43);
        java.util.ArrayList<java.lang.Object> objList47 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean48 = objList43.retainAll((java.util.Collection<java.lang.Object>) objList47);
        objList47.trimToSize();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap52 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap54 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection55 = strMap54.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap57 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection58 = strMap57.values();
        strMap54.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap57);
        boolean boolean60 = strMap52.containsKey((java.lang.Object) strMap57);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap62 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection63 = strMap62.values();
        boolean boolean64 = strMap62.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap66 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable69 = strMap66.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap70 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap66);
        java.io.Serializable serializable71 = strMap62.remove((java.lang.Object) strMap66);
        strMap57.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap62);
        boolean boolean73 = objList47.contains((java.lang.Object) strMap62);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap75 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection76 = strMap75.values();
        strMap62.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap75);
        boolean boolean78 = strMap1.replace("11", (java.io.Serializable) 83886080, (java.io.Serializable) strMap62);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(serializableCollection55);
        org.junit.Assert.assertNotNull(serializableCollection58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(serializableCollection63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + serializable69 + "' != '" + true + "'", serializable69, true);
        org.junit.Assert.assertNull(serializable71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(serializableCollection76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }
}

