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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(40, 1.0f);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection6 = strMap5.values();
        boolean boolean7 = strMap5.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        java.io.Serializable serializable14 = strMap5.remove((java.lang.Object) strMap9);
        strMap9.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable23 = strMap17.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        strMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap17);
        java.util.Collection<java.io.Serializable> serializableCollection25 = strMap9.values();
        boolean boolean26 = strMap2.remove((java.lang.Object) 100, (java.lang.Object) strMap9);
        org.junit.Assert.assertNotNull(serializableCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (-4.6d) + "'", serializable23, (-4.6d));
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.util.stream.Stream<java.lang.Object> objStream30 = objList25.parallelStream();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection33 = strMap32.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap35 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection36 = strMap35.values();
        strMap32.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap35);
        boolean boolean39 = strMap35.containsValue((java.lang.Object) 11);
        boolean boolean40 = objList25.remove((java.lang.Object) strMap35);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable47 = strMap44.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable50 = strMap44.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection51 = strMap44.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap59 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray65 = new java.lang.Object[] { (-5L), 0, serializableCollection51, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList66 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList66, objArray65);
        boolean boolean69 = objList66.add((java.lang.Object) 1.0f);
        java.io.Serializable serializable70 = strMap35.remove((java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + true + "'", serializable6, true);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objStream30);
        org.junit.Assert.assertNotNull(serializableCollection33);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + serializable47 + "' != '" + true + "'", serializable47, true);
        org.junit.Assert.assertNull(serializable50);
        org.junit.Assert.assertNotNull(serializableCollection51);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(serializable70);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        java.util.Set<java.lang.String> strSet79 = strMap62.keySet();
        boolean boolean80 = strMap62.isEmpty();
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
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.ArrayList<java.lang.Cloneable> cloneableList1 = new java.util.ArrayList<java.lang.Cloneable>(0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        int int2 = java.lang.Integer.min(83886080, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>((-2147483648), (float) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -2147483648");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        int int2 = java.lang.Integer.min((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, java.util.ArrayList<java.lang.Object>> strMapMap0 = new java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, java.util.ArrayList<java.lang.Object>>();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        int int2 = java.lang.Integer.compare((int) (short) 100, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        int int2 = java.lang.Integer.sum((int) (byte) 10, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16777226 + "'", int2 == 16777226);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("9");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        strMap7.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.HashMap<examples.MaxBag, java.lang.Integer[]> maxBagMap0 = new java.util.HashMap<examples.MaxBag, java.lang.Integer[]>();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.Class<?> wildcardClass97 = objList58.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        java.util.stream.Stream<java.lang.Object> objStream58 = objList51.parallelStream();
        boolean boolean59 = objList51.isEmpty();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        java.util.ArrayList<java.lang.Object> objList6 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor7 = objList6.listIterator();
        java.util.ArrayList<java.lang.Object> objList8 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList6);
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean11 = objList6.retainAll((java.util.Collection<java.lang.Object>) objList10);
        java.util.ListIterator<java.lang.Object> objItor12 = objList10.listIterator();
        java.lang.Object[] objArray13 = objList10.toArray();
        objList10.ensureCapacity(28);
        boolean boolean16 = objList0.containsAll((java.util.Collection<java.lang.Object>) objList10);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>(48);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        boolean boolean6 = strMap4.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection10 = strMap9.values();
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap9.values();
        java.io.Serializable serializable14 = strMap9.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable17 = strMap9.putIfAbsent("8", (java.io.Serializable) (-4L));
        java.io.Serializable serializable19 = strMap4.getOrDefault((java.lang.Object) "8", (java.io.Serializable) 1.2d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = objList1.set(67108864, (java.lang.Object) serializable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 67108864, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(serializableCollection11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + 1.2d + "'", serializable19, 1.2d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>> strMapMap0 = new java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>>();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        maxBag55._var1457 = false;
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
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap56 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection57 = strMap56.values();
        boolean boolean58 = strMap56.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap60 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable63 = strMap60.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap64 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap60);
        java.io.Serializable serializable65 = strMap56.remove((java.lang.Object) strMap60);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap67 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection68 = strMap67.values();
        boolean boolean69 = strMap67.isEmpty();
        boolean boolean71 = strMap67.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap73 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection74 = strMap73.values();
        java.util.Collection<java.io.Serializable> serializableCollection75 = strMap73.values();
        java.io.Serializable serializable76 = strMap67.get((java.lang.Object) strMap73);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet77 = strMap73.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet78 = strMap73.entrySet();
        strMap56.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap73);
        boolean boolean80 = objList51.remove((java.lang.Object) strMap73);
        java.lang.Class<?> wildcardClass81 = objList51.getClass();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + serializable63 + "' != '" + true + "'", serializable63, true);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNotNull(serializableCollection68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(serializableCollection74);
        org.junit.Assert.assertNotNull(serializableCollection75);
        org.junit.Assert.assertNull(serializable76);
        org.junit.Assert.assertNotNull(strEntrySet77);
        org.junit.Assert.assertNotNull(strEntrySet78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        long long1 = java.lang.Integer.toUnsignedLong(68);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 68L + "'", long1 == 68L);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        int int1 = java.lang.Integer.highestOneBit((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        int int2 = java.lang.Integer.max((int) (byte) 10, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet6 = strMap1.entrySet();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEntrySet6);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        boolean boolean1 = java.lang.Boolean.getBoolean("1c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet2 = strMap1.entrySet();
        org.junit.Assert.assertNotNull(strEntrySet2);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("0", 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 512 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        java.util.Set<java.lang.String> strSet40 = strMap1.keySet();
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
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        int int2 = java.lang.Integer.divideUnsigned(68, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        int int1 = java.lang.Integer.signum(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        maxBag0.add((java.lang.Integer) 29);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(_Type328393_8);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        int int1 = java.lang.Integer.reverseBytes((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1627389952 + "'", int1 == 1627389952);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        int int1 = java.lang.Integer.reverse(8388607);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-512) + "'", int1 == (-512));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        boolean boolean10 = strMap2.containsKey((java.lang.Object) strMap7);
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap7.values();
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableCollection11);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        int int1 = java.lang.Integer.highestOneBit(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.remove((java.lang.Integer) 48);
        examples._Type328393 _Type328393_29 = maxBag0._var4384;
        maxBag0.add((java.lang.Integer) 32);
        maxBag0.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_29);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        int int1 = java.lang.Integer.highestOneBit(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        int int2 = java.lang.Integer.min((-1073741825), (-83886081));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741825) + "'", int2 == (-1073741825));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.lang.Boolean boolean1 = new java.lang.Boolean("4294967292");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        int int2 = java.lang.Integer.rotateLeft((-1543503872), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 656 + "'", int2 == 656);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        int int2 = java.lang.Integer.compare((-6), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap25 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection26 = strMap25.values();
        boolean boolean27 = strMap25.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap33 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap29);
        java.io.Serializable serializable34 = strMap25.remove((java.lang.Object) strMap29);
        boolean boolean35 = strMap9.containsKey((java.lang.Object) strMap29);
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
        org.junit.Assert.assertNotNull(serializableCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(296, (-100));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "296" + "'", str2, "296");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.lang.String str1 = java.lang.Integer.toHexString((-6));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffffa" + "'", str1, "fffffffa");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        int int1 = java.lang.Integer.parseUnsignedInt("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        long long1 = java.lang.Integer.toUnsignedLong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.lang.String str1 = java.lang.Integer.toOctalString((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43" + "'", str1, "43");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        java.util.ListIterator<java.lang.Object> objItor65 = objList61.listIterator();
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
        org.junit.Assert.assertNotNull(objItor65);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        int int2 = java.lang.Integer.sum(512, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 511 + "'", int2 == 511);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        int int2 = java.lang.Integer.min(0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("1c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        int int2 = java.lang.Integer.min((-3), (-16777217));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16777217) + "'", int2 == (-16777217));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        java.util.ArrayList<java.lang.Object> objList71 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor72 = objList71.listIterator();
        java.util.ArrayList<java.lang.Object> objList73 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList71);
        java.util.ArrayList<java.lang.Object> objList75 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean76 = objList71.retainAll((java.util.Collection<java.lang.Object>) objList75);
        java.util.ListIterator<java.lang.Object> objItor77 = objList75.listIterator();
        java.lang.Object[] objArray78 = objList75.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = objList31.addAll(100, (java.util.Collection<java.lang.Object>) objList75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objItor72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objItor77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        examples.MaxBag maxBag31 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap32 = maxBag31._var721;
        maxBag0._var721 = intMap32;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intMap32);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(100);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        boolean boolean6 = strMap4.isEmpty();
        boolean boolean8 = strMap4.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap10.values();
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap10.values();
        java.io.Serializable serializable13 = strMap4.get((java.lang.Object) strMap10);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet14 = strMap10.entrySet();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable20 = strMap17.put("", (java.io.Serializable) '4');
        java.util.Collection<java.io.Serializable> serializableCollection21 = strMap17.values();
        boolean boolean22 = strMap10.remove((java.lang.Object) 6L, (java.lang.Object) strMap17);
        java.io.Serializable serializable23 = strMap1.getOrDefault((java.lang.Object) (-1073741825), (java.io.Serializable) boolean22);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableCollection11);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertNotNull(strEntrySet14);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(serializableCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + false + "'", serializable23, false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        int int2 = java.lang.Integer.divideUnsigned(16, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        java.lang.Class<?> wildcardClass58 = objList45.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        int int2 = java.lang.Integer.remainderUnsigned(0, 768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.lang.String str1 = java.lang.Integer.toBinaryString(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110100" + "'", str1, "110100");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        int int2 = java.lang.Integer.min(11, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        int int2 = java.lang.Integer.compare(16777216, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("6", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.lang.String str1 = java.lang.Integer.toHexString(50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32" + "'", str1, "32");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        boolean boolean17 = strMap1.isEmpty();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(serializableCollection7);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1.2d + "'", serializable16, 1.2d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        int int2 = java.lang.Integer.min((int) (short) 10, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap42 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable45 = strMap42.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass46 = serializable45.getClass();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable45, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList55 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList55, objArray54);
        int int57 = objList55.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap61 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable64 = strMap61.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable67 = strMap61.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection68 = strMap61.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap76 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray82 = new java.lang.Object[] { (-5L), 0, serializableCollection68, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList83 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList83, objArray82);
        boolean boolean86 = objList83.add((java.lang.Object) 1.0f);
        boolean boolean88 = objList83.add((java.lang.Object) (-8L));
        int int89 = objList83.size();
        java.util.ArrayList<java.lang.Object> objList90 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean91 = objList83.removeAll((java.util.Collection<java.lang.Object>) objList90);
        boolean boolean92 = objList55.containsAll((java.util.Collection<java.lang.Object>) objList83);
        java.util.stream.Stream<java.lang.Object> objStream93 = objList55.parallelStream();
        boolean boolean94 = objList55.isEmpty();
        java.lang.Object obj96 = objList55.remove((int) (short) 10);
        boolean boolean97 = objList25.removeAll((java.util.Collection<java.lang.Object>) objList55);
        java.lang.Object[] objArray98 = objList55.toArray();
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
        org.junit.Assert.assertEquals("'" + serializable45 + "' != '" + true + "'", serializable45, true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 11 + "'", int57 == 11);
        org.junit.Assert.assertEquals("'" + serializable64 + "' != '" + true + "'", serializable64, true);
        org.junit.Assert.assertNull(serializable67);
        org.junit.Assert.assertNotNull(serializableCollection68);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 17 + "'", int89 == 17);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objStream93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + obj96 + "' != '" + (-10.5d) + "'", obj96, (-10.5d));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray98), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        int int1 = java.lang.Integer.signum((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        objList17.clear();
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        int int1 = java.lang.Integer.bitCount(1610612737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        int int1 = java.lang.Integer.numberOfLeadingZeros(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        long long1 = java.lang.Integer.toUnsignedLong(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        int int2 = java.lang.Integer.rotateLeft(0, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        int int1 = java.lang.Integer.parseInt("100000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100000 + "'", int1 == 100000);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor7 = objList0.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        java.util.ListIterator<java.lang.Object> objItor59 = objList17.listIterator();
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
        org.junit.Assert.assertNotNull(objItor59);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-7), (-5));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967289" + "'", str2, "4294967289");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        int int1 = java.lang.Integer.numberOfTrailingZeros(296);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.lang.String str1 = java.lang.Integer.toHexString(31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1f" + "'", str1, "1f");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        int int1 = java.lang.Integer.numberOfLeadingZeros(41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1610612737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        boolean boolean35 = objList25.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, examples.MaxBag> strMapMap0 = new java.util.HashMap<java.util.Map<java.lang.String, java.io.Serializable>, examples.MaxBag>();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10", (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -4 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        java.lang.Boolean boolean31 = maxBag0._var1457;
        java.util.ArrayList<java.lang.Integer> intList32 = maxBag0._var66253;
        java.util.ArrayList<java.lang.Integer> intList33 = maxBag0._var66253;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList33);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        boolean boolean1 = java.lang.Boolean.getBoolean("11111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("671088640", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        java.io.Serializable serializable82 = strMap4.remove((java.lang.Object) 134217727);
        strMap4.clear();
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
        org.junit.Assert.assertNull(serializable82);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        int int2 = java.lang.Integer.min((-100), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("1f");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        java.util.stream.Stream<java.lang.Object> objStream58 = objList51.parallelStream();
        java.lang.Class<?> wildcardClass59 = objStream58.getClass();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objStream58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        int int1 = java.lang.Integer.lowestOneBit(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        int int1 = java.lang.Integer.reverseBytes(67108857);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100663549) + "'", int1 == (-100663549));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        boolean boolean57 = objList45.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable7 = strMap1.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.io.Serializable serializable10 = strMap1.put("12", (java.io.Serializable) 1L);
        java.util.Set<java.lang.String> strSet11 = strMap1.keySet();
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + true + "'", serializable4, true);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ffffffff" + "'", str1, "ffffffff");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>((int) (byte) 10);
        objList1.ensureCapacity(10);
        objList1.clear();
        java.io.Serializable[] serializableArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray6 = objList1.toArray(serializableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        int int2 = java.lang.Integer.max(16777226, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16777226 + "'", int2 == 16777226);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.lang.String str1 = java.lang.Integer.toBinaryString(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1011" + "'", str1, "1011");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        objList4.trimToSize();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap11.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection15 = strMap14.values();
        strMap11.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap14);
        boolean boolean17 = strMap9.containsKey((java.lang.Object) strMap14);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection20 = strMap19.values();
        boolean boolean21 = strMap19.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap23);
        java.io.Serializable serializable28 = strMap19.remove((java.lang.Object) strMap23);
        strMap14.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap19);
        boolean boolean30 = objList4.contains((java.lang.Object) strMap19);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable35 = strMap32.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int36 = strMap32.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap40 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable43 = strMap40.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable46 = strMap40.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection47 = strMap40.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap55 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-5L), 0, serializableCollection47, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList62 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        boolean boolean65 = objList62.add((java.lang.Object) 1.0f);
        boolean boolean67 = objList62.add((java.lang.Object) (-8L));
        int int68 = objList62.size();
        java.util.ArrayList<java.lang.Object> objList69 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean70 = objList62.removeAll((java.util.Collection<java.lang.Object>) objList69);
        boolean boolean71 = strMap32.containsValue((java.lang.Object) objList62);
        boolean boolean72 = objList4.retainAll((java.util.Collection<java.lang.Object>) objList62);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap74 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable77 = strMap74.put("", (java.io.Serializable) '4');
        int int78 = objList62.indexOf((java.lang.Object) strMap74);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(serializableCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (-10.5d) + "'", serializable35, (-10.5d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + true + "'", serializable43, true);
        org.junit.Assert.assertNull(serializable46);
        org.junit.Assert.assertNotNull(serializableCollection47);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 17 + "'", int68 == 17);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(serializable77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        boolean boolean47 = strMap45.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap4.values();
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap4);
        boolean boolean8 = strMap4.containsValue((java.lang.Object) 11);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap10 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection11 = strMap10.values();
        boolean boolean12 = strMap10.isEmpty();
        boolean boolean14 = strMap10.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap16.values();
        java.io.Serializable serializable19 = strMap10.get((java.lang.Object) strMap16);
        java.io.Serializable serializable21 = strMap16.get((java.lang.Object) 2);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap22 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap16);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap25 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection26 = strMap25.values();
        boolean boolean27 = strMap25.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable32 = strMap29.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap33 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap29);
        java.io.Serializable serializable34 = strMap25.remove((java.lang.Object) strMap29);
        strMap29.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap37 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable40 = strMap37.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable43 = strMap37.getOrDefault((java.lang.Object) 0L, (java.io.Serializable) (-4.6d));
        strMap29.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap37);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap29);
        java.io.Serializable serializable46 = strMap16.putIfAbsent("12", (java.io.Serializable) strMap29);
        strMap4.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap16);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serializableCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(serializableCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + serializable32 + "' != '" + true + "'", serializable32, true);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + (-4.6d) + "'", serializable43, (-4.6d));
        org.junit.Assert.assertNull(serializable46);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        java.util.stream.Stream<java.lang.Object> objStream58 = objList51.parallelStream();
        objList51.clear();
        objList51.trimToSize();
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertEquals("'" + serializable20 + "' != '" + true + "'", serializable20, true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, 1.0, 4294967295, 4.8, 0.0, -2, 0, , 5.3, -1, 100, {},  , , class java.lang.Boolean, -3, 2.7, 100, 7.1, -9.3, 0, -9, 1, 7.1, -8.7, 0, 6, 4, 1, -1, 2.7, -1, 4, 100.0, -2, 10, [], 9, 0, 10, -4.6]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objStream58);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        examples._Type328393 _Type328393_31 = maxBag0._var4384;
        maxBag0.remove((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_31);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap6 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable9 = strMap6.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) serializable9);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap12 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection13 = strMap12.values();
        java.util.Collection<java.io.Serializable> serializableCollection14 = strMap12.values();
        java.io.Serializable serializable17 = strMap12.put("hi!", (java.io.Serializable) (-1));
        boolean boolean19 = strMap12.containsKey((java.lang.Object) 3);
        java.io.Serializable serializable22 = strMap12.putIfAbsent("5", (java.io.Serializable) 1L);
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap12);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (-10.5d) + "'", serializable9, (-10.5d));
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertNotNull(serializableCollection14);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(serializable22);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator63 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList25.replaceAll(objUnaryOperator63);
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
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + boolean60 + "' != '" + false + "'", boolean60, false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objItor62);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap21 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable24 = strMap21.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable27 = strMap21.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.io.Serializable serializable30 = strMap21.put("12", (java.io.Serializable) 1L);
        strMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap21);
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
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + true + "'", serializable24, true);
        org.junit.Assert.assertNull(serializable27);
        org.junit.Assert.assertNull(serializable30);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1011", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        int int1 = java.lang.Integer.signum(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int5 = strMap1.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>((int) ' ');
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap7);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap11.values();
        boolean boolean13 = strMap11.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap11);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection17 = strMap16.values();
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap16.values();
        java.io.Serializable serializable21 = strMap16.putIfAbsent("", (java.io.Serializable) (-9L));
        java.io.Serializable serializable24 = strMap16.putIfAbsent("8", (java.io.Serializable) (-4L));
        java.io.Serializable serializable26 = strMap11.getOrDefault((java.lang.Object) "8", (java.io.Serializable) 1.2d);
        java.util.Set<java.lang.String> strSet27 = strMap11.keySet();
        java.io.Serializable serializable28 = strMap7.putIfAbsent("", (java.io.Serializable) strMap11);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + 1.2d + "'", serializable26, 1.2d);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(serializable28);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        int int2 = java.lang.Integer.rotateRight((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        int int2 = java.lang.Integer.rotateLeft((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        boolean boolean4 = objList0.remove((java.lang.Object) 100.0d);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        objList25.trimToSize();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor32 = objList25.listIterator(101);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 101");
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
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        java.util.ArrayList<java.lang.Integer> intList2 = maxBag0._var66253;
        java.util.ArrayList<java.lang.Integer> intList3 = maxBag0._var66253;
        maxBag0.add((java.lang.Integer) (-2147483648));
        maxBag0.remove((java.lang.Integer) 100000);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList3);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        int int2 = java.lang.Integer.sum(100000, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671188640 + "'", int2 == 671188640);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap1 = maxBag0._var721;
        maxBag0._var5992 = 0;
        maxBag0._var1457 = false;
        maxBag0.clear();
        java.util.HashMap<java.lang.Integer, java.lang.Boolean> intMap7 = maxBag0._var721;
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable7 = strMap1.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.Set<java.lang.String> strSet8 = strMap1.keySet();
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.remove((java.lang.Integer) 17);
        maxBag0.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        long long1 = java.lang.Integer.toUnsignedLong((int) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(512, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "512" + "'", str2, "512");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2013265920));
        maxBag0.clear();
        java.util.ArrayList<java.lang.Integer> intList31 = maxBag0._var66253;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        boolean boolean1 = java.lang.Boolean.getBoolean("37777777773");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.lang.Boolean boolean1 = java.lang.Boolean.valueOf("1011");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap25 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable28 = strMap25.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable31 = strMap25.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap34 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable37 = strMap34.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable38 = strMap25.getOrDefault((java.lang.Object) "37777777773", (java.io.Serializable) strMap34);
        strMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap34);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap41 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection42 = strMap41.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap44 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection45 = strMap44.values();
        strMap41.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap44);
        boolean boolean48 = strMap44.containsValue((java.lang.Object) 11);
        boolean boolean49 = strMap34.containsValue((java.lang.Object) 11);
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
        org.junit.Assert.assertNull(serializable28);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + true + "'", serializable37, true);
        org.junit.Assert.assertNotNull(serializable38);
        org.junit.Assert.assertNotNull(serializableCollection42);
        org.junit.Assert.assertNotNull(serializableCollection45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        boolean boolean1 = java.lang.Boolean.getBoolean("11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        int int2 = java.lang.Integer.divideUnsigned(671188640, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95884091 + "'", int2 == 95884091);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap4 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable7 = strMap4.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int8 = strMap4.size();
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
        boolean boolean64 = strMap4.containsKey((java.lang.Object) objList54);
        java.util.Iterator<java.lang.Object> objItor65 = objList54.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = objList0.addAll((-16777217), (java.util.Collection<java.lang.Object>) objList54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -16777217, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (-10.5d) + "'", serializable7, (-10.5d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objItor65);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
        java.util.HashMap<java.util.Collection<java.lang.Object>, java.util.ListIterator<java.lang.Object>> objCollectionMap38 = new java.util.HashMap<java.util.Collection<java.lang.Object>, java.util.ListIterator<java.lang.Object>>();
        int int39 = objList32.lastIndexOf((java.lang.Object) objCollectionMap38);
        objList32.clear();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("37777777766");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777766\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        examples.MaxBag maxBag23 = new examples.MaxBag();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        maxBag23._var66253 = intList47;
        maxBag23._var1457 = false;
        maxBag23._var1457 = false;
        java.lang.Boolean boolean54 = maxBag23._var1457;
        maxBag23.add((java.lang.Integer) (-2147483648));
        maxBag23._var1457 = false;
        maxBag23.remove((java.lang.Integer) 100000);
        boolean boolean61 = strMap13.containsKey((java.lang.Object) 100000);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (-4.6d) + "'", serializable19, (-4.6d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + boolean54 + "' != '" + false + "'", boolean54, false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        java.util.Iterator<java.lang.Object> objItor63 = objList0.iterator();
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
        org.junit.Assert.assertNotNull(objItor63);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = objList17.get(144);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 144, Size: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(objItor55);
        org.junit.Assert.assertNotNull(objItor56);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        boolean boolean1 = java.lang.Boolean.getBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        int int2 = java.lang.Integer.parseUnsignedInt("296", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1707 + "'", int2 == 1707);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.lang.Boolean boolean1 = new java.lang.Boolean("0");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        int int2 = java.lang.Integer.sum(29360128, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29360140 + "'", int2 == 29360140);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
            java.util.ListIterator<java.lang.Object> objItor33 = objList25.listIterator((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -100");
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
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap0 = new java.util.HashMap<java.lang.String, java.io.Serializable>();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap7 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection8 = strMap7.values();
        java.util.Collection<java.io.Serializable> serializableCollection9 = strMap7.values();
        java.io.Serializable serializable10 = strMap1.get((java.lang.Object) strMap7);
        java.io.Serializable serializable12 = strMap1.get((java.lang.Object) (-4));
        strMap1.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(serializable12);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap5 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable8 = strMap5.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap5);
        java.io.Serializable serializable10 = strMap1.remove((java.lang.Object) strMap5);
        strMap5.clear();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap16 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable19 = strMap16.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass20 = serializable19.getClass();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable19, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList29 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList29, objArray28);
        int int31 = objList29.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap35 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable38 = strMap35.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable41 = strMap35.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection42 = strMap35.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap50 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray56 = new java.lang.Object[] { (-5L), 0, serializableCollection42, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList57, objArray56);
        boolean boolean60 = objList57.add((java.lang.Object) 1.0f);
        boolean boolean62 = objList57.add((java.lang.Object) (-8L));
        int int63 = objList57.size();
        java.util.ArrayList<java.lang.Object> objList64 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean65 = objList57.removeAll((java.util.Collection<java.lang.Object>) objList64);
        boolean boolean66 = objList29.containsAll((java.util.Collection<java.lang.Object>) objList57);
        int int67 = objList29.size();
        int int68 = objList29.size();
        boolean boolean69 = strMap5.containsValue((java.lang.Object) objList29);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + true + "'", serializable8, true);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + true + "'", serializable19, true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertEquals("'" + serializable38 + "' != '" + true + "'", serializable38, true);
        org.junit.Assert.assertNull(serializable41);
        org.junit.Assert.assertNotNull(serializableCollection42);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 17 + "'", int63 == 17);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 11 + "'", int67 == 11);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap2 = new java.util.HashMap<java.lang.String, java.io.Serializable>(0, 10.0f);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        int int1 = java.lang.Integer.signum(1610612737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.lang.String str1 = java.lang.Integer.toHexString(67108857);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3fffff9" + "'", str1, "3fffff9");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.lang.Boolean boolean1 = new java.lang.Boolean("a");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        int int1 = java.lang.Integer.reverse(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 671088640 + "'", int1 == 671088640);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.lang.String str1 = java.lang.Integer.toHexString(2147483647);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7fffffff" + "'", str1, "7fffffff");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator57 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList17.replaceAll(objUnaryOperator57);
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
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + true + "'", obj56, true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        long long1 = java.lang.Integer.toUnsignedLong(8388608);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8388608L + "'", long1 == 8388608L);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("37777777766");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777766\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        boolean boolean5 = strMap1.containsKey((java.lang.Object) (-1.2d));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable12 = strMap9.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap13 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap9);
        boolean boolean14 = strMap1.replace("1", (java.io.Serializable) (-7), (java.io.Serializable) strMap13);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap17 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap17.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap20 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection21 = strMap20.values();
        strMap17.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap20);
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor24 = objList23.listIterator();
        boolean boolean25 = strMap1.replace("1011", (java.io.Serializable) strMap17, (java.io.Serializable) objList23);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + true + "'", serializable12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertNotNull(serializableCollection21);
        org.junit.Assert.assertNotNull(objItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        int int1 = java.lang.Integer.bitCount(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>(10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        java.io.Serializable serializable83 = strMap4.remove((java.lang.Object) 67);
        strMap4.clear();
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
        org.junit.Assert.assertNull(serializable83);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.lang.Boolean boolean1 = new java.lang.Boolean("7fffffff");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        objList4.trimToSize();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap11.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection15 = strMap14.values();
        strMap11.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap14);
        boolean boolean17 = strMap9.containsKey((java.lang.Object) strMap14);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap19 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection20 = strMap19.values();
        boolean boolean21 = strMap19.isEmpty();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap23 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable26 = strMap23.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap27 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap23);
        java.io.Serializable serializable28 = strMap19.remove((java.lang.Object) strMap23);
        strMap14.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap19);
        boolean boolean30 = objList4.contains((java.lang.Object) strMap19);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap32 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable35 = strMap32.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        int int36 = strMap32.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap40 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable43 = strMap40.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable46 = strMap40.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection47 = strMap40.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap55 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-5L), 0, serializableCollection47, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList62 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        boolean boolean65 = objList62.add((java.lang.Object) 1.0f);
        boolean boolean67 = objList62.add((java.lang.Object) (-8L));
        int int68 = objList62.size();
        java.util.ArrayList<java.lang.Object> objList69 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean70 = objList62.removeAll((java.util.Collection<java.lang.Object>) objList69);
        boolean boolean71 = strMap32.containsValue((java.lang.Object) objList62);
        boolean boolean72 = objList4.retainAll((java.util.Collection<java.lang.Object>) objList62);
        java.util.ArrayList<java.lang.Object> objList73 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList62);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(serializableCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + serializable26 + "' != '" + true + "'", serializable26, true);
        org.junit.Assert.assertNull(serializable28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + (-10.5d) + "'", serializable35, (-10.5d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + serializable43 + "' != '" + true + "'", serializable43, true);
        org.junit.Assert.assertNull(serializable46);
        org.junit.Assert.assertNotNull(serializableCollection47);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 17 + "'", int68 == 17);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        java.util.ListIterator<java.lang.Object> objItor36 = objList32.listIterator();
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
        org.junit.Assert.assertNotNull(objItor36);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.getOrDefault((java.lang.Object) 4L, (java.io.Serializable) (-10.5d));
        java.io.Serializable serializable7 = strMap1.replace("", (java.io.Serializable) (-1));
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (-10.5d) + "'", serializable4, (-10.5d));
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ListIterator<java.lang.Object> objItor1 = objList0.listIterator();
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>((java.util.Collection<java.lang.Object>) objList0);
        java.util.ArrayList<java.lang.Object> objList4 = new java.util.ArrayList<java.lang.Object>(48);
        boolean boolean5 = objList0.retainAll((java.util.Collection<java.lang.Object>) objList4);
        java.util.ListIterator<java.lang.Object> objItor6 = objList4.listIterator();
        java.lang.Object[] objArray7 = objList4.toArray();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable14 = strMap11.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable17 = strMap11.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection18 = strMap11.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap26 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-5L), 0, serializableCollection18, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList33 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList33, objArray32);
        boolean boolean36 = objList33.add((java.lang.Object) 1.0f);
        boolean boolean38 = objList33.add((java.lang.Object) (-8L));
        int int39 = objList33.size();
        boolean boolean40 = objList4.retainAll((java.util.Collection<java.lang.Object>) objList33);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + true + "'", serializable14, true);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNotNull(serializableCollection18);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 17 + "'", int39 == 17);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("a", 101);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 101 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        int int1 = java.lang.Integer.signum(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 41, (-83886081), (-2147483648), (-2147483648), 100, 134217727, 0, 17, (-1), (-6), (-2), 8, 1, 134217727, (-2147483648), 28, 8, (-100), 1, (-7), 2, (-9) };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        maxBag0._var66253 = intList24;
        maxBag0._var1457 = false;
        maxBag0._var1457 = false;
        examples._Type328393 _Type328393_31 = maxBag0._var4384;
        java.lang.Integer[] intArray32 = _Type328393_31.get_1();
        _Type328393_31._0 = 26;
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(_Type328393_31);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        int int1 = java.lang.Integer.highestOneBit((-2013265920));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable5 = null;
        java.io.Serializable serializable6 = strMap1.put("hi!", serializable5);
        strMap1.clear();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap29 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap31 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection32 = strMap31.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap34 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection35 = strMap34.values();
        strMap31.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap34);
        boolean boolean37 = strMap29.containsKey((java.lang.Object) strMap34);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap41 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable44 = strMap41.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable47 = strMap41.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection48 = strMap41.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap56 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (-5L), 0, serializableCollection48, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList63 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList63, objArray62);
        boolean boolean66 = objList63.add((java.lang.Object) 1.0f);
        boolean boolean68 = objList63.add((java.lang.Object) (-8L));
        int int69 = objList63.size();
        java.lang.Object[] objArray70 = objList63.toArray();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap72 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable73 = strMap29.getOrDefault((java.lang.Object) objArray70, (java.io.Serializable) strMap72);
        strMap1.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap29);
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
        org.junit.Assert.assertNotNull(serializableCollection32);
        org.junit.Assert.assertNotNull(serializableCollection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + true + "'", serializable44, true);
        org.junit.Assert.assertNull(serializable47);
        org.junit.Assert.assertNotNull(serializableCollection48);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 17 + "'", int69 == 17);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
        org.junit.Assert.assertNotNull(serializable73);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        int int2 = java.lang.Integer.rotateRight(0, 1342177280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        int int2 = java.lang.Integer.remainderUnsigned(100000, 83886080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100000 + "'", int2 == 100000);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        int int1 = java.lang.Integer.reverseBytes(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1124073472 + "'", int1 == 1124073472);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        int int2 = java.lang.Integer.remainderUnsigned((-83886081), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        boolean boolean3 = strMap1.isEmpty();
        java.io.Serializable serializable6 = strMap1.putIfAbsent("4000000", (java.io.Serializable) 144);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
        java.util.ListIterator<java.lang.Object> objItor60 = objList19.listIterator();
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
        org.junit.Assert.assertNotNull(objItor60);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        int int1 = java.lang.Integer.parseInt("1100100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100100 + "'", int1 == 1100100);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
            java.lang.Object obj59 = objList51.get((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap68 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable71 = strMap68.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable74 = strMap68.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection75 = strMap68.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap83 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray89 = new java.lang.Object[] { (-5L), 0, serializableCollection75, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList90 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList90, objArray89);
        boolean boolean93 = objList90.add((java.lang.Object) 1.0f);
        boolean boolean95 = objList90.add((java.lang.Object) (-8L));
        int int96 = objList90.size();
        java.util.ArrayList<java.lang.Object> objList97 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean98 = objList90.removeAll((java.util.Collection<java.lang.Object>) objList97);
        // The following exception was thrown during execution in test generation
        try {
            objList51.add(536870912, (java.lang.Object) objList90);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 536870912, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + serializable71 + "' != '" + true + "'", serializable71, true);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNotNull(serializableCollection75);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 17 + "'", int96 == 17);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.putIfAbsent("", (java.io.Serializable) (-9L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = serializable6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1f\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        int int1 = java.lang.Integer.lowestOneBit(67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap41 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable44 = strMap41.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap45 = new java.util.HashMap<java.lang.String, java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) strMap41);
        boolean boolean46 = objList32.contains((java.lang.Object) strMap41);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap48 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable51 = strMap48.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable54 = strMap48.getOrDefault((java.lang.Object) (byte) 1, (java.io.Serializable) (-8L));
        java.io.Serializable serializable56 = strMap48.get((java.lang.Object) (-3.8d));
        java.io.Serializable serializable58 = strMap48.get((java.lang.Object) (-3L));
        boolean boolean59 = objList32.add((java.lang.Object) strMap48);
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
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + true + "'", serializable44, true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertEquals("'" + serializable54 + "' != '" + (-8L) + "'", serializable54, (-8L));
        org.junit.Assert.assertNull(serializable56);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        objList31.ensureCapacity(0);
        objList31.clear();
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection2 = strMap1.values();
        java.util.Collection<java.io.Serializable> serializableCollection3 = strMap1.values();
        java.io.Serializable serializable6 = strMap1.put("hi!", (java.io.Serializable) (-1));
        boolean boolean8 = strMap1.containsKey((java.lang.Object) 3);
        java.util.Set<java.lang.String> strSet9 = strMap1.keySet();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableCollection3);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
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
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap22 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable25 = strMap22.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.lang.Class<?> wildcardClass26 = serializable25.getClass();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1073741825), (-2L), 7L, serializable25, true, (-3.8d), 3.1d, 1, (-5.4d), 0, (-10.5d) };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        int int37 = objList35.size();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap41 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable44 = strMap41.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable47 = strMap41.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection48 = strMap41.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap56 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (-5L), 0, serializableCollection48, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList63 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList63, objArray62);
        boolean boolean66 = objList63.add((java.lang.Object) 1.0f);
        boolean boolean68 = objList63.add((java.lang.Object) (-8L));
        int int69 = objList63.size();
        java.util.ArrayList<java.lang.Object> objList70 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean71 = objList63.removeAll((java.util.Collection<java.lang.Object>) objList70);
        boolean boolean72 = objList35.containsAll((java.util.Collection<java.lang.Object>) objList63);
        java.util.Iterator<java.lang.Object> objItor73 = objList35.iterator();
        java.util.Iterator<java.lang.Object> objItor74 = objList35.iterator();
        java.lang.Object obj76 = objList35.remove(0);
        java.io.Serializable serializable77 = strMap1.replace("0", (java.io.Serializable) objList35);
        java.lang.Object obj79 = objList35.get(7);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(serializableCollection7);
        org.junit.Assert.assertNotNull(serializableCollection8);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + 1.2d + "'", serializable16, 1.2d);
        org.junit.Assert.assertEquals("'" + serializable25 + "' != '" + true + "'", serializable25, true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1073741825, -2, 7, true, true, -3.8, 3.1, 1, -5.4, 0, -10.5]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 11 + "'", int37 == 11);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + true + "'", serializable44, true);
        org.junit.Assert.assertNull(serializable47);
        org.junit.Assert.assertNotNull(serializableCollection48);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 17 + "'", int69 == 17);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objItor73);
        org.junit.Assert.assertNotNull(objItor74);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (-1073741825) + "'", obj76, (-1073741825));
        org.junit.Assert.assertNull(serializable77);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (-5.4d) + "'", obj79, (-5.4d));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0._var587 = (-5);
        examples._Type328393 _Type328393_3 = maxBag0._var4384;
        _Type328393_3._0 = 1342177280;
        java.lang.Integer[] intArray6 = _Type328393_3._1;
        java.lang.Integer[] intArray7 = _Type328393_3.get_1();
        org.junit.Assert.assertNotNull(_Type328393_3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap1 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable4 = strMap1.put("", (java.io.Serializable) '4');
        java.util.Collection<java.io.Serializable> serializableCollection5 = strMap1.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap9 = new java.util.HashMap<java.lang.String, java.io.Serializable>(5, (float) 1);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap11 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection12 = strMap11.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap14 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.util.Collection<java.io.Serializable> serializableCollection15 = strMap14.values();
        strMap11.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap14);
        boolean boolean17 = strMap9.containsKey((java.lang.Object) strMap14);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap21 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable24 = strMap21.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable27 = strMap21.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection28 = strMap21.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap36 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-5L), 0, serializableCollection28, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList43 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList43, objArray42);
        boolean boolean46 = objList43.add((java.lang.Object) 1.0f);
        boolean boolean48 = objList43.add((java.lang.Object) (-8L));
        int int49 = objList43.size();
        java.lang.Object[] objArray50 = objList43.toArray();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap52 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable53 = strMap9.getOrDefault((java.lang.Object) objArray50, (java.io.Serializable) strMap52);
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap55 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable58 = strMap55.put("", (java.io.Serializable) '4');
        java.io.Serializable serializable61 = strMap55.putIfAbsent("hi!", (java.io.Serializable) (-1073741825));
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap66 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.io.Serializable serializable69 = strMap66.getOrDefault((java.lang.Object) (-4L), (java.io.Serializable) true);
        java.io.Serializable serializable72 = strMap66.putIfAbsent("", (java.io.Serializable) 6.9d);
        java.util.Collection<java.io.Serializable> serializableCollection73 = strMap66.values();
        java.util.HashMap<java.lang.String, java.io.Serializable> strMap81 = new java.util.HashMap<java.lang.String, java.io.Serializable>(7);
        java.lang.Object[] objArray87 = new java.lang.Object[] { (-5L), 0, serializableCollection73, 5L, (-8), 100L, '4', (byte) 1, 9.6d, 7, 5, (-9), (-7L), 1.0f, 8 };
        java.util.ArrayList<java.lang.Object> objList88 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList88, objArray87);
        boolean boolean91 = objList88.add((java.lang.Object) 1.0f);
        boolean boolean93 = strMap55.replace("1100100", (java.io.Serializable) objList88, (java.io.Serializable) (-100));
        java.lang.Object obj95 = objList88.remove(0);
        boolean boolean96 = strMap1.replace("4294967289", (java.io.Serializable) strMap9, (java.io.Serializable) objList88);
        java.lang.Object obj98 = objList88.remove(7);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(serializableCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + true + "'", serializable24, true);
        org.junit.Assert.assertNull(serializable27);
        org.junit.Assert.assertNotNull(serializableCollection28);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8, 1.0, -8]");
        org.junit.Assert.assertNotNull(serializable53);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(serializable61);
        org.junit.Assert.assertEquals("'" + serializable69 + "' != '" + true + "'", serializable69, true);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNotNull(serializableCollection73);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[-5, 0, [6.9], 5, -8, 100, 4, 1, 9.6, 7, 5, -9, -7, 1.0, 8]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + (-5L) + "'", obj95, (-5L));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + obj98 + "' != '" + 9.6d + "'", obj98, 9.6d);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
            java.lang.Object obj33 = objList25.get((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        int int1 = java.lang.Integer.reverseBytes(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 520093696 + "'", int1 == 520093696);
    }
}

