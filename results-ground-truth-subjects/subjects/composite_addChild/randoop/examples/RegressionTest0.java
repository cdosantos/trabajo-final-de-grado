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
        examples.Composite composite1 = new examples.Composite((-3));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Collection<examples.Composite> compositeCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = compositeSet10.retainAll(compositeCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.lang.Object[] objArray25 = compositeSet24.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream26 = compositeSet24.parallelStream();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.lang.Object[] objArray30 = compositeSet29.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream31 = compositeSet29.parallelStream();
        examples.Composite composite33 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.lang.Object[] objArray35 = compositeSet34.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream36 = compositeSet34.parallelStream();
        examples.Composite composite38 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        java.lang.Object[] objArray40 = compositeSet39.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream41 = compositeSet39.parallelStream();
        examples.Composite composite43 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet44 = composite43.children();
        java.lang.Object[] objArray45 = compositeSet44.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet44.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet49 = composite48.children();
        java.lang.Object[] objArray50 = compositeSet49.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream51 = compositeSet49.parallelStream();
        java.util.stream.BaseStream[] baseStreamArray53 = new java.util.stream.BaseStream[6];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<examples.Composite, java.util.stream.Stream<examples.Composite>>[] compositeBaseStreamArray54 = (java.util.stream.BaseStream<examples.Composite, java.util.stream.Stream<examples.Composite>>[]) baseStreamArray53;
        compositeBaseStreamArray54[0] = compositeStream26;
        compositeBaseStreamArray54[1] = compositeStream31;
        compositeBaseStreamArray54[2] = compositeStream36;
        compositeBaseStreamArray54[3] = compositeStream41;
        compositeBaseStreamArray54[4] = compositeStream46;
        compositeBaseStreamArray54[5] = compositeStream51;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.BaseStream<examples.Composite, java.util.stream.Stream<examples.Composite>>[] compositeBaseStreamArray67 = compositeSet13.toArray(compositeBaseStreamArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: examples.Composite");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertNotNull(compositeStream26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertNotNull(compositeStream31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertNotNull(compositeStream36);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertNotNull(compositeStream41);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertNotNull(compositeStream51);
        org.junit.Assert.assertNotNull(baseStreamArray53);
        org.junit.Assert.assertNotNull(compositeBaseStreamArray54);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        java.lang.Class<?> wildcardClass7 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        int int28 = compositeSet27.size();
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        composite40.addChild(composite42);
        examples.Composite[] compositeArray44 = new examples.Composite[] { composite36, composite38, composite40 };
        java.util.LinkedHashSet<examples.Composite> compositeSet45 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet45, compositeArray44);
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        boolean boolean52 = compositeSet45.add(composite50);
        examples.Composite[] compositeArray53 = new examples.Composite[] { composite32, composite50 };
        java.util.ArrayList<examples.Composite> compositeList54 = new java.util.ArrayList<examples.Composite>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList54, compositeArray53);
        boolean boolean56 = compositeSet27.containsAll((java.util.Collection<examples.Composite>) compositeList54);
        examples.Composite composite58 = new examples.Composite((-3));
        examples.Composite composite60 = new examples.Composite((-3));
        composite58.addChild(composite60);
        java.util.Set<examples.Composite> compositeSet62 = composite60.children();
        int int63 = compositeSet62.size();
        examples.Composite composite65 = new examples.Composite((-3));
        examples.Composite composite67 = new examples.Composite((-3));
        composite65.addChild(composite67);
        java.util.Set<examples.Composite> compositeSet69 = composite67.children();
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        examples.Composite composite75 = new examples.Composite((-3));
        examples.Composite composite77 = new examples.Composite((-3));
        composite75.addChild(composite77);
        examples.Composite[] compositeArray79 = new examples.Composite[] { composite71, composite73, composite75 };
        java.util.LinkedHashSet<examples.Composite> compositeSet80 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet80, compositeArray79);
        examples.Composite composite83 = new examples.Composite((-3));
        examples.Composite composite85 = new examples.Composite((-3));
        composite83.addChild(composite85);
        boolean boolean87 = compositeSet80.add(composite85);
        examples.Composite[] compositeArray88 = new examples.Composite[] { composite67, composite85 };
        java.util.ArrayList<examples.Composite> compositeList89 = new java.util.ArrayList<examples.Composite>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList89, compositeArray88);
        boolean boolean91 = compositeSet62.containsAll((java.util.Collection<examples.Composite>) compositeList89);
        java.util.ArrayList[] arrayListArray93 = new java.util.ArrayList[2];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<examples.Composite>[] compositeListArray94 = (java.util.ArrayList<examples.Composite>[]) arrayListArray93;
        compositeListArray94[0] = compositeList54;
        compositeListArray94[1] = compositeList89;
        java.util.ArrayList<examples.Composite>[] compositeListArray99 = compositeSet2.toArray(compositeListArray94);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(compositeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(compositeSet69);
        org.junit.Assert.assertNotNull(compositeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(compositeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(arrayListArray93);
        org.junit.Assert.assertNotNull(compositeListArray94);
        org.junit.Assert.assertNotNull(compositeListArray99);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = compositeSet2.toArray();
        examples.Composite composite26 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        boolean boolean28 = compositeSet2.add(composite26);
        java.lang.Class<?> wildcardClass29 = composite26.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        java.lang.Class<?> wildcardClass11 = serializableArray10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray18, objArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray21 = compositeSet10.toArray(objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: examples.Composite");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        int int22 = compositeSet13.size();
        java.lang.String[] strArray23 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray24 = compositeSet13.toArray((java.lang.Comparable<java.lang.String>[]) strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: examples.Composite");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        examples.Composite[] compositeArray25 = new examples.Composite[] { composite21 };
        java.util.LinkedHashSet<examples.Composite> compositeSet26 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet26, compositeArray25);
        boolean boolean29 = compositeSet26.remove((java.lang.Object) (-6.9d));
        boolean boolean30 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet26);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        int int37 = compositeSet36.size();
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        java.util.Set<examples.Composite> compositeSet43 = composite41.children();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        examples.Composite composite49 = new examples.Composite((-3));
        examples.Composite composite51 = new examples.Composite((-3));
        composite49.addChild(composite51);
        examples.Composite[] compositeArray53 = new examples.Composite[] { composite45, composite47, composite49 };
        java.util.LinkedHashSet<examples.Composite> compositeSet54 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet54, compositeArray53);
        examples.Composite composite57 = new examples.Composite((-3));
        examples.Composite composite59 = new examples.Composite((-3));
        composite57.addChild(composite59);
        boolean boolean61 = compositeSet54.add(composite59);
        examples.Composite[] compositeArray62 = new examples.Composite[] { composite41, composite59 };
        java.util.ArrayList<examples.Composite> compositeList63 = new java.util.ArrayList<examples.Composite>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList63, compositeArray62);
        boolean boolean65 = compositeSet36.containsAll((java.util.Collection<examples.Composite>) compositeList63);
        examples.Composite composite67 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet68 = composite67.children();
        compositeSet68.clear();
        boolean boolean70 = compositeSet36.remove((java.lang.Object) compositeSet68);
        boolean boolean71 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet68);
        java.util.stream.Stream<examples.Composite> compositeStream72 = compositeSet68.parallelStream();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(compositeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(compositeSet68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(compositeStream72);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        java.lang.Class<?> wildcardClass11 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite23, composite25, composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        boolean boolean39 = compositeSet32.add(composite37);
        boolean boolean40 = compositeSet13.add(composite37);
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        composite46.addChild(composite48);
        examples.Composite[] compositeArray50 = new examples.Composite[] { composite42, composite44, composite46 };
        java.util.LinkedHashSet<examples.Composite> compositeSet51 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet51, compositeArray50);
        examples.Composite composite54 = new examples.Composite((-3));
        examples.Composite composite56 = new examples.Composite((-3));
        composite54.addChild(composite56);
        boolean boolean58 = compositeSet51.add(composite56);
        java.util.Iterator<examples.Composite> compositeItor59 = compositeSet51.iterator();
        examples.Composite composite61 = new examples.Composite((-3));
        examples.Composite composite63 = new examples.Composite((-3));
        composite61.addChild(composite63);
        boolean boolean65 = compositeSet51.remove((java.lang.Object) composite63);
        // The following exception was thrown during execution in test generation
        try {
            composite37.addChild(composite63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(compositeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(compositeItor59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        boolean boolean15 = compositeSet13.remove((java.lang.Object) (-7));
        compositeSet13.clear();
        boolean boolean17 = compositeSet6.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.lang.Class<?> wildcardClass18 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        composite29.addChild(composite31);
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        examples.Composite[] compositeArray42 = new examples.Composite[] { composite34, composite36, composite38 };
        java.util.LinkedHashSet<examples.Composite> compositeSet43 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet43, compositeArray42);
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        composite46.addChild(composite48);
        boolean boolean50 = compositeSet43.add(composite48);
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        examples.Composite composite56 = new examples.Composite((-3));
        composite54.addChild(composite56);
        examples.Composite[] compositeArray58 = new examples.Composite[] { composite29, composite48, composite52, composite56 };
        java.util.LinkedHashSet<examples.Composite> compositeSet59 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet59, compositeArray58);
        java.lang.Object[] objArray61 = compositeSet59.toArray();
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        composite67.addChild(composite69);
        examples.Composite[] compositeArray71 = new examples.Composite[] { composite63, composite65, composite67 };
        java.util.LinkedHashSet<examples.Composite> compositeSet72 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet72, compositeArray71);
        examples.Composite composite75 = new examples.Composite((-3));
        examples.Composite composite77 = new examples.Composite((-3));
        composite75.addChild(composite77);
        boolean boolean79 = compositeSet72.add(composite77);
        java.util.Iterator<examples.Composite> compositeItor80 = compositeSet72.iterator();
        examples.Composite composite82 = new examples.Composite((-3));
        examples.Composite composite84 = new examples.Composite((-3));
        composite82.addChild(composite84);
        boolean boolean86 = compositeSet72.remove((java.lang.Object) composite84);
        java.util.HashSet[] hashSetArray88 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<examples.Composite>[] compositeSetArray89 = (java.util.HashSet<examples.Composite>[]) hashSetArray88;
        compositeSetArray89[0] = compositeSet59;
        compositeSetArray89[1] = compositeSet72;
        java.util.HashSet<examples.Composite>[] compositeSetArray94 = compositeSet25.toArray(compositeSetArray89);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(compositeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(compositeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(compositeItor80);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(hashSetArray88);
        org.junit.Assert.assertNotNull(compositeSetArray89);
        org.junit.Assert.assertNotNull(compositeSetArray94);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        java.lang.Object[] objArray11 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream12 = compositeSet2.parallelStream();
        boolean boolean14 = compositeSet2.contains((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertNotNull(compositeStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        compositeSet6.clear();
        boolean boolean11 = compositeSet6.isEmpty();
        boolean boolean12 = compositeSet6.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        java.lang.Object[] objArray61 = compositeSet25.toArray();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite[] compositeArray13 = new examples.Composite[] { composite5, composite7, composite9 };
        java.util.LinkedHashSet<examples.Composite> compositeSet14 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet14, compositeArray13);
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        boolean boolean21 = compositeSet14.add(composite19);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet14.iterator();
        int int23 = compositeSet14.size();
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        examples.Composite[] compositeArray29 = new examples.Composite[] { composite25 };
        java.util.LinkedHashSet<examples.Composite> compositeSet30 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet30, compositeArray29);
        boolean boolean33 = compositeSet30.remove((java.lang.Object) (-6.9d));
        boolean boolean34 = compositeSet14.retainAll((java.util.Collection<examples.Composite>) compositeSet30);
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        java.util.Set<examples.Composite> compositeSet40 = composite38.children();
        int int41 = compositeSet40.size();
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        java.util.Set<examples.Composite> compositeSet47 = composite45.children();
        examples.Composite composite49 = new examples.Composite((-3));
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        examples.Composite composite55 = new examples.Composite((-3));
        composite53.addChild(composite55);
        examples.Composite[] compositeArray57 = new examples.Composite[] { composite49, composite51, composite53 };
        java.util.LinkedHashSet<examples.Composite> compositeSet58 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet58, compositeArray57);
        examples.Composite composite61 = new examples.Composite((-3));
        examples.Composite composite63 = new examples.Composite((-3));
        composite61.addChild(composite63);
        boolean boolean65 = compositeSet58.add(composite63);
        examples.Composite[] compositeArray66 = new examples.Composite[] { composite45, composite63 };
        java.util.ArrayList<examples.Composite> compositeList67 = new java.util.ArrayList<examples.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList67, compositeArray66);
        boolean boolean69 = compositeSet40.containsAll((java.util.Collection<examples.Composite>) compositeList67);
        examples.Composite composite71 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet72 = composite71.children();
        compositeSet72.clear();
        boolean boolean74 = compositeSet40.remove((java.lang.Object) compositeSet72);
        boolean boolean75 = compositeSet14.addAll((java.util.Collection<examples.Composite>) compositeSet72);
        boolean boolean76 = compositeSet2.addAll((java.util.Collection<examples.Composite>) compositeSet72);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(compositeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(compositeSet47);
        org.junit.Assert.assertNotNull(compositeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(compositeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(compositeSet72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        java.lang.Object[] objArray11 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream12 = compositeSet2.parallelStream();
        java.lang.Class<?> wildcardClass13 = compositeStream12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertNotNull(compositeStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet40.iterator();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet40.remove((java.lang.Object) composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite6, composite10, composite27, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        boolean boolean59 = compositeSet56.remove((java.lang.Object) 10.0f);
        boolean boolean60 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet56);
        java.util.Iterator<examples.Composite> compositeItor61 = compositeSet56.iterator();
        java.lang.Class<?> wildcardClass62 = compositeSet56.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(compositeItor61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = compositeSet2.toArray();
        examples.Composite composite26 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        boolean boolean28 = compositeSet2.add(composite26);
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite26.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.stream.Stream<examples.Composite> compositeStream26 = compositeSet25.parallelStream();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeStream26);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        compositeSet5.clear();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        examples.Composite[] compositeArray11 = new examples.Composite[] { composite3, composite5, composite7 };
        java.util.LinkedHashSet<examples.Composite> compositeSet12 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet12, compositeArray11);
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        boolean boolean19 = compositeSet12.add(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        boolean boolean19 = compositeSet10.remove((java.lang.Object) 3.1d);
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        composite28.addChild(composite30);
        examples.Composite[] compositeArray32 = new examples.Composite[] { composite24, composite26, composite28 };
        java.util.LinkedHashSet<examples.Composite> compositeSet33 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet33, compositeArray32);
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        boolean boolean40 = compositeSet33.add(composite38);
        boolean boolean41 = compositeSet22.containsAll((java.util.Collection<examples.Composite>) compositeSet33);
        java.util.Iterator<examples.Composite> compositeItor42 = compositeSet33.iterator();
        boolean boolean43 = compositeSet10.contains((java.lang.Object) compositeItor42);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(compositeItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        int int22 = compositeSet13.size();
        examples.Composite composite24 = new examples.Composite(0);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        composite46.addChild(composite48);
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        composite51.addChild(composite53);
        java.util.Set<examples.Composite> compositeSet55 = composite53.children();
        java.util.Set<examples.Composite> compositeSet56 = composite53.children();
        examples.Composite[] compositeArray57 = new examples.Composite[] { composite24, composite40, composite44, composite46, composite53 };
        examples.Composite[] compositeArray58 = compositeSet13.toArray(compositeArray57);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeSet56);
        org.junit.Assert.assertNotNull(compositeArray57);
        org.junit.Assert.assertNotNull(compositeArray58);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.Composite composite1 = new examples.Composite((-6));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        examples.Composite[] compositeArray11 = new examples.Composite[] { composite3, composite5, composite7 };
        java.util.LinkedHashSet<examples.Composite> compositeSet12 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet12, compositeArray11);
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        boolean boolean19 = compositeSet12.add(composite17);
        java.util.Iterator<examples.Composite> compositeItor20 = compositeSet12.iterator();
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        boolean boolean26 = compositeSet12.remove((java.lang.Object) composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(compositeItor20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        boolean boolean6 = compositeSet5.isEmpty();
        boolean boolean8 = compositeSet5.remove((java.lang.Object) (-100.0d));
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet5.iterator();
        java.lang.Class<?> wildcardClass10 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite[] compositeArray14 = new examples.Composite[] { composite6, composite8, composite10 };
        java.util.LinkedHashSet<examples.Composite> compositeSet15 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet15, compositeArray14);
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        boolean boolean22 = compositeSet15.add(composite20);
        java.util.Iterator<examples.Composite> compositeItor23 = compositeSet15.iterator();
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet15.remove((java.lang.Object) composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(compositeItor23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        boolean boolean6 = compositeSet5.isEmpty();
        java.lang.Object[] objArray7 = compositeSet5.toArray();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.Iterator<examples.Composite> compositeItor4 = compositeSet2.iterator();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream6 = compositeSet2.parallelStream();
        java.lang.Object[] objArray7 = compositeSet2.toArray();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeItor4);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeStream6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        java.lang.Class<?> wildcardClass23 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        examples.Composite[] compositeArray25 = new examples.Composite[] { composite21 };
        java.util.LinkedHashSet<examples.Composite> compositeSet26 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet26, compositeArray25);
        boolean boolean29 = compositeSet26.remove((java.lang.Object) (-6.9d));
        boolean boolean30 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet26);
        java.lang.Object[] objArray31 = compositeSet10.toArray();
        boolean boolean33 = compositeSet10.remove((java.lang.Object) 9);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.removeAll((java.util.Collection<examples.Composite>) compositeSet73);
        boolean boolean83 = compositeSet62.remove((java.lang.Object) (byte) 0);
        boolean boolean84 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet62);
        compositeSet10.clear();
        examples.Composite composite87 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet88 = composite87.children();
        compositeSet88.clear();
        java.io.Serializable[] serializableArray95 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray96 = compositeSet88.toArray(serializableArray95);
        boolean boolean97 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet88);
        boolean boolean98 = compositeSet10.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(compositeSet88);
        org.junit.Assert.assertNotNull(serializableArray95);
        org.junit.Assert.assertNotNull(serializableArray96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite[] compositeArray16 = new examples.Composite[] { composite8, composite10, composite12 };
        java.util.LinkedHashSet<examples.Composite> compositeSet17 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet17, compositeArray16);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet17.add(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        java.util.Iterator<examples.Composite> compositeItor43 = compositeSet35.iterator();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        boolean boolean49 = compositeSet35.remove((java.lang.Object) composite47);
        examples.Composite[] compositeArray50 = new examples.Composite[] { composite1, composite5, composite22, composite47 };
        java.util.LinkedHashSet<examples.Composite> compositeSet51 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet51, compositeArray50);
        boolean boolean54 = compositeSet51.remove((java.lang.Object) 10.0f);
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        composite56.addChild(composite58);
        examples.Composite[] compositeArray60 = new examples.Composite[] { composite56 };
        java.util.LinkedHashSet<examples.Composite> compositeSet61 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet61, compositeArray60);
        boolean boolean64 = compositeSet61.remove((java.lang.Object) (-6.9d));
        int int65 = compositeSet61.size();
        examples.Composite composite67 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet68 = composite67.children();
        boolean boolean70 = compositeSet68.remove((java.lang.Object) (-7));
        compositeSet68.clear();
        boolean boolean72 = compositeSet61.removeAll((java.util.Collection<examples.Composite>) compositeSet68);
        boolean boolean73 = compositeSet51.removeAll((java.util.Collection<examples.Composite>) compositeSet61);
        org.junit.Assert.assertNotNull(compositeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compositeItor43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(compositeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(compositeSet68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        compositeSet30.clear();
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray38 = compositeSet30.toArray(serializableArray37);
        java.lang.Object[] objArray39 = compositeSet30.toArray();
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        composite52.addChild(composite54);
        examples.Composite[] compositeArray56 = new examples.Composite[] { composite48, composite50, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet57 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet57, compositeArray56);
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        composite60.addChild(composite62);
        boolean boolean64 = compositeSet57.add(composite62);
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        composite70.addChild(composite72);
        examples.Composite[] compositeArray74 = new examples.Composite[] { composite66, composite68, composite70 };
        java.util.LinkedHashSet<examples.Composite> compositeSet75 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet75, compositeArray74);
        examples.Composite composite78 = new examples.Composite((-3));
        examples.Composite composite80 = new examples.Composite((-3));
        composite78.addChild(composite80);
        boolean boolean82 = compositeSet75.add(composite80);
        java.util.Iterator<examples.Composite> compositeItor83 = compositeSet75.iterator();
        examples.Composite composite85 = new examples.Composite((-3));
        examples.Composite composite87 = new examples.Composite((-3));
        composite85.addChild(composite87);
        boolean boolean89 = compositeSet75.remove((java.lang.Object) composite87);
        examples.Composite[] compositeArray90 = new examples.Composite[] { composite41, composite45, composite62, composite87 };
        java.util.LinkedHashSet<examples.Composite> compositeSet91 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet91, compositeArray90);
        boolean boolean94 = compositeSet91.remove((java.lang.Object) 10.0f);
        java.lang.Cloneable[] cloneableArray95 = new java.lang.Cloneable[] { objArray39, compositeSet91 };
        java.lang.Cloneable[] cloneableArray96 = compositeSet25.toArray(cloneableArray95);
        java.lang.Object[] objArray97 = compositeSet25.toArray();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertNotNull(compositeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(compositeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(compositeItor83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(compositeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(cloneableArray95);
        org.junit.Assert.assertNotNull(cloneableArray96);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray97), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        boolean boolean4 = compositeSet2.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        examples.Composite[] compositeArray25 = new examples.Composite[] { composite21 };
        java.util.LinkedHashSet<examples.Composite> compositeSet26 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet26, compositeArray25);
        boolean boolean29 = compositeSet26.remove((java.lang.Object) (-6.9d));
        boolean boolean30 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet26);
        examples.Composite composite32 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        compositeSet33.clear();
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray41 = compositeSet33.toArray(serializableArray40);
        java.lang.Object[] objArray42 = compositeSet33.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream43 = compositeSet33.parallelStream();
        boolean boolean44 = compositeSet26.contains((java.lang.Object) compositeSet33);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertNotNull(compositeStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-7));
        composite1.addChild(composite4);
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        boolean boolean30 = compositeSet11.containsAll((java.util.Collection<examples.Composite>) compositeSet22);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        boolean boolean49 = compositeSet22.add(composite46);
        examples.Composite composite51 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet52 = composite51.children();
        composite46.addChild(composite51);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(compositeSet52);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.lang.Object[] objArray10 = compositeSet9.toArray();
        java.util.Iterator<examples.Composite> compositeItor11 = compositeSet9.iterator();
        java.util.Iterator<examples.Composite> compositeItor12 = compositeSet9.iterator();
        boolean boolean13 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeSet9);
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        int int20 = compositeSet19.size();
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        examples.Composite[] compositeArray36 = new examples.Composite[] { composite28, composite30, composite32 };
        java.util.LinkedHashSet<examples.Composite> compositeSet37 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet37, compositeArray36);
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        composite40.addChild(composite42);
        boolean boolean44 = compositeSet37.add(composite42);
        examples.Composite[] compositeArray45 = new examples.Composite[] { composite24, composite42 };
        java.util.ArrayList<examples.Composite> compositeList46 = new java.util.ArrayList<examples.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList46, compositeArray45);
        boolean boolean48 = compositeSet19.containsAll((java.util.Collection<examples.Composite>) compositeList46);
        examples.Composite composite50 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet51 = composite50.children();
        compositeSet51.clear();
        boolean boolean53 = compositeSet19.remove((java.lang.Object) compositeSet51);
        examples.Composite composite55 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet56 = composite55.children();
        java.lang.Object[] objArray57 = compositeSet56.toArray();
        java.util.Iterator<examples.Composite> compositeItor58 = compositeSet56.iterator();
        java.util.Iterator<examples.Composite> compositeItor59 = compositeSet56.iterator();
        boolean boolean60 = compositeSet19.addAll((java.util.Collection<examples.Composite>) compositeSet56);
        java.util.Iterator<examples.Composite> compositeItor61 = compositeSet56.iterator();
        compositeSet56.clear();
        examples.Composite composite64 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet65 = composite64.children();
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        composite71.addChild(composite73);
        examples.Composite[] compositeArray75 = new examples.Composite[] { composite67, composite69, composite71 };
        java.util.LinkedHashSet<examples.Composite> compositeSet76 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet76, compositeArray75);
        examples.Composite composite79 = new examples.Composite((-3));
        examples.Composite composite81 = new examples.Composite((-3));
        composite79.addChild(composite81);
        boolean boolean83 = compositeSet76.add(composite81);
        boolean boolean84 = compositeSet65.containsAll((java.util.Collection<examples.Composite>) compositeSet76);
        int int85 = compositeSet76.size();
        java.util.stream.Stream<examples.Composite> compositeStream86 = compositeSet76.parallelStream();
        boolean boolean87 = compositeSet56.remove((java.lang.Object) compositeSet76);
        boolean boolean88 = compositeSet9.retainAll((java.util.Collection<examples.Composite>) compositeSet56);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertNotNull(compositeItor11);
        org.junit.Assert.assertNotNull(compositeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(compositeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(compositeSet51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(compositeSet56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertNotNull(compositeItor58);
        org.junit.Assert.assertNotNull(compositeItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(compositeItor61);
        org.junit.Assert.assertNotNull(compositeSet65);
        org.junit.Assert.assertNotNull(compositeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertNotNull(compositeStream86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        composite60.addChild(composite62);
        examples.Composite[] compositeArray64 = new examples.Composite[] { composite60 };
        java.util.LinkedHashSet<examples.Composite> compositeSet65 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet65, compositeArray64);
        boolean boolean68 = compositeSet65.remove((java.lang.Object) (-6.9d));
        int int69 = compositeSet65.size();
        examples.Composite composite71 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet72 = composite71.children();
        compositeSet72.clear();
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray80 = compositeSet72.toArray(serializableArray79);
        java.util.stream.Stream<examples.Composite> compositeStream81 = compositeSet72.parallelStream();
        boolean boolean82 = compositeSet65.containsAll((java.util.Collection<examples.Composite>) compositeSet72);
        boolean boolean83 = compositeSet23.removeAll((java.util.Collection<examples.Composite>) compositeSet72);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compositeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(compositeSet72);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertNotNull(serializableArray80);
        org.junit.Assert.assertNotNull(compositeStream81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        examples.Composite composite25 = new examples.Composite(9);
        boolean boolean26 = compositeSet2.add(composite25);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        int int11 = compositeSet8.size();
        boolean boolean13 = compositeSet8.remove((java.lang.Object) 0.0f);
        java.util.Iterator<examples.Composite> compositeItor14 = compositeSet8.iterator();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(compositeItor14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.removeAll((java.util.Collection<examples.Composite>) compositeSet73);
        boolean boolean83 = compositeSet62.remove((java.lang.Object) (byte) 0);
        boolean boolean84 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet62);
        examples.Composite composite86 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet87 = composite86.children();
        java.lang.Object[] objArray88 = compositeSet87.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream89 = compositeSet87.parallelStream();
        compositeSet87.clear();
        boolean boolean91 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet87);
        java.lang.Object[] objArray92 = compositeSet87.toArray();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(compositeSet87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertNotNull(compositeStream89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Iterator<examples.Composite> compositeItor6 = compositeSet5.iterator();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite[] compositeArray16 = new examples.Composite[] { composite8, composite10, composite12 };
        java.util.LinkedHashSet<examples.Composite> compositeSet17 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet17, compositeArray16);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet17.add(composite22);
        java.util.Iterator<examples.Composite> compositeItor25 = compositeSet17.iterator();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        boolean boolean31 = compositeSet17.remove((java.lang.Object) composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        java.util.Set<examples.Composite> compositeSet33 = composite29.children();
        boolean boolean34 = compositeSet5.contains((java.lang.Object) composite29);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeItor6);
        org.junit.Assert.assertNotNull(compositeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(compositeItor25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((int) ' ');
        boolean boolean20 = compositeSet10.add(composite19);
        examples.Composite composite21 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite41, composite43, composite45 };
        java.util.LinkedHashSet<examples.Composite> compositeSet50 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet50, compositeArray49);
        examples.Composite composite53 = new examples.Composite((-3));
        examples.Composite composite55 = new examples.Composite((-3));
        composite53.addChild(composite55);
        boolean boolean57 = compositeSet50.add(composite55);
        java.util.Set<examples.Composite> compositeSet58 = composite55.children();
        java.util.Set<examples.Composite> compositeSet59 = composite55.children();
        boolean boolean60 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet59);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(compositeSet58);
        org.junit.Assert.assertNotNull(compositeSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        compositeSet6.clear();
        java.lang.Object[] objArray11 = compositeSet6.toArray();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.lang.Class<?> wildcardClass22 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        int int11 = compositeSet8.size();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.lang.Object[] objArray15 = compositeSet14.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream16 = compositeSet14.parallelStream();
        compositeSet14.clear();
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        examples.Composite[] compositeArray27 = new examples.Composite[] { composite19, composite21, composite23 };
        java.util.LinkedHashSet<examples.Composite> compositeSet28 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet28, compositeArray27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        boolean boolean35 = compositeSet28.add(composite33);
        java.util.Iterator<examples.Composite> compositeItor36 = compositeSet28.iterator();
        int int37 = compositeSet28.size();
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        examples.Composite[] compositeArray43 = new examples.Composite[] { composite39 };
        java.util.LinkedHashSet<examples.Composite> compositeSet44 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet44, compositeArray43);
        boolean boolean47 = compositeSet44.remove((java.lang.Object) (-6.9d));
        boolean boolean48 = compositeSet28.retainAll((java.util.Collection<examples.Composite>) compositeSet44);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        java.util.Set<examples.Composite> compositeSet54 = composite52.children();
        int int55 = compositeSet54.size();
        examples.Composite composite57 = new examples.Composite((-3));
        examples.Composite composite59 = new examples.Composite((-3));
        composite57.addChild(composite59);
        java.util.Set<examples.Composite> compositeSet61 = composite59.children();
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        composite67.addChild(composite69);
        examples.Composite[] compositeArray71 = new examples.Composite[] { composite63, composite65, composite67 };
        java.util.LinkedHashSet<examples.Composite> compositeSet72 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet72, compositeArray71);
        examples.Composite composite75 = new examples.Composite((-3));
        examples.Composite composite77 = new examples.Composite((-3));
        composite75.addChild(composite77);
        boolean boolean79 = compositeSet72.add(composite77);
        examples.Composite[] compositeArray80 = new examples.Composite[] { composite59, composite77 };
        java.util.ArrayList<examples.Composite> compositeList81 = new java.util.ArrayList<examples.Composite>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList81, compositeArray80);
        boolean boolean83 = compositeSet54.containsAll((java.util.Collection<examples.Composite>) compositeList81);
        examples.Composite composite85 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet86 = composite85.children();
        compositeSet86.clear();
        boolean boolean88 = compositeSet54.remove((java.lang.Object) compositeSet86);
        boolean boolean89 = compositeSet28.addAll((java.util.Collection<examples.Composite>) compositeSet86);
        boolean boolean90 = compositeSet14.addAll((java.util.Collection<examples.Composite>) compositeSet28);
        boolean boolean91 = compositeSet8.containsAll((java.util.Collection<examples.Composite>) compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertNotNull(compositeStream16);
        org.junit.Assert.assertNotNull(compositeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(compositeItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(compositeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeSet54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(compositeSet61);
        org.junit.Assert.assertNotNull(compositeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(compositeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(compositeSet86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        boolean boolean19 = compositeSet10.remove((java.lang.Object) 3.1d);
        java.util.Iterator<examples.Composite> compositeItor20 = compositeSet10.iterator();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(compositeItor20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        boolean boolean64 = compositeSet55.retainAll((java.util.Collection<examples.Composite>) compositeSet63);
        java.util.stream.Stream<examples.Composite> compositeStream65 = compositeSet63.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(compositeStream65);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite23, composite25, composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        boolean boolean39 = compositeSet32.add(composite37);
        boolean boolean40 = compositeSet13.add(composite37);
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        composite46.addChild(composite48);
        examples.Composite[] compositeArray50 = new examples.Composite[] { composite42, composite44, composite46 };
        java.util.LinkedHashSet<examples.Composite> compositeSet51 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet51, compositeArray50);
        examples.Composite composite54 = new examples.Composite((-3));
        examples.Composite composite56 = new examples.Composite((-3));
        composite54.addChild(composite56);
        boolean boolean58 = compositeSet51.add(composite56);
        java.util.Iterator<examples.Composite> compositeItor59 = compositeSet51.iterator();
        int int60 = compositeSet51.size();
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        examples.Composite[] compositeArray66 = new examples.Composite[] { composite62 };
        java.util.LinkedHashSet<examples.Composite> compositeSet67 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet67, compositeArray66);
        boolean boolean70 = compositeSet67.remove((java.lang.Object) (-6.9d));
        boolean boolean71 = compositeSet51.retainAll((java.util.Collection<examples.Composite>) compositeSet67);
        java.lang.Object[] objArray72 = compositeSet51.toArray();
        boolean boolean73 = compositeSet13.retainAll((java.util.Collection<examples.Composite>) compositeSet51);
        java.lang.Object[] objArray74 = compositeSet51.toArray();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(compositeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(compositeItor59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(compositeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        examples.Composite[] compositeArray47 = new examples.Composite[] { composite39, composite41, composite43 };
        java.util.LinkedHashSet<examples.Composite> compositeSet48 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet48, compositeArray47);
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        composite51.addChild(composite53);
        boolean boolean55 = compositeSet48.add(composite53);
        boolean boolean56 = compositeSet37.containsAll((java.util.Collection<examples.Composite>) compositeSet48);
        examples.Composite composite58 = new examples.Composite((-3));
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        examples.Composite[] compositeArray66 = new examples.Composite[] { composite58, composite60, composite62 };
        java.util.LinkedHashSet<examples.Composite> compositeSet67 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet67, compositeArray66);
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        composite70.addChild(composite72);
        boolean boolean74 = compositeSet67.add(composite72);
        boolean boolean75 = compositeSet48.add(composite72);
        examples.Composite composite77 = new examples.Composite((-3));
        examples.Composite composite79 = new examples.Composite((-3));
        composite77.addChild(composite79);
        java.util.Set<examples.Composite> compositeSet81 = composite79.children();
        int int82 = compositeSet81.size();
        boolean boolean83 = compositeSet48.removeAll((java.util.Collection<examples.Composite>) compositeSet81);
        boolean boolean84 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet81);
        java.lang.Class<?> wildcardClass85 = compositeSet81.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(compositeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(compositeSet81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        java.util.Iterator<examples.Composite> compositeItor64 = compositeSet63.iterator();
        boolean boolean65 = compositeSet55.addAll((java.util.Collection<examples.Composite>) compositeSet63);
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        composite71.addChild(composite73);
        examples.Composite[] compositeArray75 = new examples.Composite[] { composite67, composite69, composite71 };
        java.util.LinkedHashSet<examples.Composite> compositeSet76 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet76, compositeArray75);
        examples.Composite composite79 = new examples.Composite((-3));
        examples.Composite composite81 = new examples.Composite((-3));
        composite79.addChild(composite81);
        boolean boolean83 = compositeSet76.add(composite81);
        java.util.Iterator<examples.Composite> compositeItor84 = compositeSet76.iterator();
        int int85 = compositeSet76.size();
        boolean boolean86 = compositeSet55.removeAll((java.util.Collection<examples.Composite>) compositeSet76);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertNotNull(compositeItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(compositeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(compositeItor84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        boolean boolean6 = compositeSet5.isEmpty();
        examples.Composite composite8 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        boolean boolean10 = compositeSet5.removeAll((java.util.Collection<examples.Composite>) compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        java.lang.Object[] objArray43 = compositeSet42.toArray();
        java.util.Iterator<examples.Composite> compositeItor44 = compositeSet42.iterator();
        java.util.Iterator<examples.Composite> compositeItor45 = compositeSet42.iterator();
        boolean boolean46 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet42);
        java.lang.Object obj47 = null;
        boolean boolean48 = compositeSet42.contains(obj47);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        examples.Composite composite56 = new examples.Composite((-3));
        composite54.addChild(composite56);
        examples.Composite[] compositeArray58 = new examples.Composite[] { composite50, composite52, composite54 };
        java.util.LinkedHashSet<examples.Composite> compositeSet59 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet59, compositeArray58);
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        boolean boolean66 = compositeSet59.add(composite64);
        java.util.Iterator<examples.Composite> compositeItor67 = compositeSet59.iterator();
        examples.Composite composite69 = new examples.Composite((-3));
        examples.Composite composite71 = new examples.Composite((-3));
        composite69.addChild(composite71);
        boolean boolean73 = compositeSet59.remove((java.lang.Object) composite71);
        boolean boolean74 = compositeSet59.isEmpty();
        boolean boolean75 = compositeSet42.contains((java.lang.Object) boolean74);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertNotNull(compositeItor44);
        org.junit.Assert.assertNotNull(compositeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(compositeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(compositeItor67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.lang.Object[] objArray10 = compositeSet9.toArray();
        java.util.Iterator<examples.Composite> compositeItor11 = compositeSet9.iterator();
        java.util.Iterator<examples.Composite> compositeItor12 = compositeSet9.iterator();
        boolean boolean13 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeSet9);
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        compositeSet16.clear();
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray24 = compositeSet16.toArray(serializableArray23);
        java.util.stream.Stream<examples.Composite> compositeStream25 = compositeSet16.parallelStream();
        boolean boolean26 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet16);
        java.lang.Object obj27 = null;
        boolean boolean28 = compositeSet16.remove(obj27);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertNotNull(compositeItor11);
        org.junit.Assert.assertNotNull(compositeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(serializableArray23);
        org.junit.Assert.assertNotNull(serializableArray24);
        org.junit.Assert.assertNotNull(compositeStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        examples.Composite[] compositeArray18 = new examples.Composite[] { composite10, composite12, composite14 };
        java.util.LinkedHashSet<examples.Composite> compositeSet19 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet19, compositeArray18);
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        boolean boolean26 = compositeSet19.add(composite24);
        boolean boolean27 = compositeSet8.containsAll((java.util.Collection<examples.Composite>) compositeSet19);
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        composite33.addChild(composite35);
        examples.Composite[] compositeArray37 = new examples.Composite[] { composite29, composite31, composite33 };
        java.util.LinkedHashSet<examples.Composite> compositeSet38 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet38, compositeArray37);
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        composite41.addChild(composite43);
        boolean boolean45 = compositeSet38.add(composite43);
        boolean boolean46 = compositeSet19.add(composite43);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        java.lang.Object[] objArray11 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream12 = compositeSet2.parallelStream();
        java.util.Iterator<examples.Composite> compositeItor13 = compositeSet2.iterator();
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet21.iterator();
        boolean boolean23 = compositeSet2.addAll((java.util.Collection<examples.Composite>) compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertNotNull(compositeStream12);
        org.junit.Assert.assertNotNull(compositeItor13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        boolean boolean64 = compositeSet55.retainAll((java.util.Collection<examples.Composite>) compositeSet63);
        java.util.Collection<examples.Composite> compositeCollection65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = compositeSet63.retainAll(compositeCollection65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        int int22 = compositeSet13.size();
        boolean boolean23 = compositeSet13.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        int int17 = compositeSet16.size();
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        composite29.addChild(composite31);
        examples.Composite[] compositeArray33 = new examples.Composite[] { composite25, composite27, composite29 };
        java.util.LinkedHashSet<examples.Composite> compositeSet34 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet34, compositeArray33);
        examples.Composite composite37 = new examples.Composite((-3));
        examples.Composite composite39 = new examples.Composite((-3));
        composite37.addChild(composite39);
        boolean boolean41 = compositeSet34.add(composite39);
        examples.Composite[] compositeArray42 = new examples.Composite[] { composite21, composite39 };
        java.util.ArrayList<examples.Composite> compositeList43 = new java.util.ArrayList<examples.Composite>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList43, compositeArray42);
        boolean boolean45 = compositeSet16.containsAll((java.util.Collection<examples.Composite>) compositeList43);
        examples.Composite composite47 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet48 = composite47.children();
        compositeSet48.clear();
        boolean boolean50 = compositeSet16.remove((java.lang.Object) compositeSet48);
        examples.Composite composite52 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet53 = composite52.children();
        java.lang.Object[] objArray54 = compositeSet53.toArray();
        java.util.Iterator<examples.Composite> compositeItor55 = compositeSet53.iterator();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet53.iterator();
        boolean boolean57 = compositeSet16.addAll((java.util.Collection<examples.Composite>) compositeSet53);
        java.util.Iterator<examples.Composite> compositeItor58 = compositeSet53.iterator();
        compositeSet53.clear();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.containsAll((java.util.Collection<examples.Composite>) compositeSet73);
        int int82 = compositeSet73.size();
        java.util.stream.Stream<examples.Composite> compositeStream83 = compositeSet73.parallelStream();
        boolean boolean84 = compositeSet53.remove((java.lang.Object) compositeSet73);
        boolean boolean85 = compositeSet6.contains((java.lang.Object) boolean84);
        examples.Composite composite87 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet88 = composite87.children();
        java.util.Iterator<examples.Composite> compositeItor89 = compositeSet88.iterator();
        boolean boolean90 = compositeSet6.removeAll((java.util.Collection<examples.Composite>) compositeSet88);
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(compositeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compositeSet53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertNotNull(compositeItor55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(compositeItor58);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertNotNull(compositeStream83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(compositeSet88);
        org.junit.Assert.assertNotNull(compositeItor89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        int int26 = compositeSet25.size();
        boolean boolean28 = compositeSet25.remove((java.lang.Object) 9.6d);
        boolean boolean29 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet25);
        java.util.Iterator<examples.Composite> compositeItor30 = compositeSet10.iterator();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeItor30);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.removeAll((java.util.Collection<examples.Composite>) compositeSet73);
        boolean boolean83 = compositeSet62.remove((java.lang.Object) (byte) 0);
        boolean boolean84 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet62);
        compositeSet10.clear();
        examples.Composite composite87 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet88 = composite87.children();
        compositeSet88.clear();
        java.io.Serializable[] serializableArray95 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray96 = compositeSet88.toArray(serializableArray95);
        boolean boolean97 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet88);
        boolean boolean99 = compositeSet88.contains((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(compositeSet88);
        org.junit.Assert.assertNotNull(serializableArray95);
        org.junit.Assert.assertNotNull(serializableArray96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        boolean boolean6 = compositeSet5.isEmpty();
        boolean boolean8 = compositeSet5.remove((java.lang.Object) (-100.0d));
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet5.iterator();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        boolean boolean31 = compositeSet12.containsAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int32 = compositeSet23.size();
        boolean boolean33 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = compositeSet2.toArray();
        int int25 = compositeSet2.size();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.Iterator<examples.Composite> compositeItor4 = compositeSet2.iterator();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite[] compositeArray15 = new examples.Composite[] { composite7, composite9, composite11 };
        java.util.LinkedHashSet<examples.Composite> compositeSet16 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet16, compositeArray15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        boolean boolean23 = compositeSet16.add(composite21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        int int30 = compositeSet29.size();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        composite42.addChild(composite44);
        examples.Composite[] compositeArray46 = new examples.Composite[] { composite38, composite40, composite42 };
        java.util.LinkedHashSet<examples.Composite> compositeSet47 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet47, compositeArray46);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet47.add(composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite34, composite52 };
        java.util.ArrayList<examples.Composite> compositeList56 = new java.util.ArrayList<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList56, compositeArray55);
        boolean boolean58 = compositeSet29.containsAll((java.util.Collection<examples.Composite>) compositeList56);
        examples.Composite composite60 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet61 = composite60.children();
        compositeSet61.clear();
        boolean boolean63 = compositeSet29.remove((java.lang.Object) compositeSet61);
        boolean boolean64 = compositeSet16.removeAll((java.util.Collection<examples.Composite>) compositeSet29);
        int int65 = compositeSet16.size();
        examples.Composite composite67 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet68 = composite67.children();
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        examples.Composite composite74 = new examples.Composite((-3));
        examples.Composite composite76 = new examples.Composite((-3));
        composite74.addChild(composite76);
        examples.Composite[] compositeArray78 = new examples.Composite[] { composite70, composite72, composite74 };
        java.util.LinkedHashSet<examples.Composite> compositeSet79 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet79, compositeArray78);
        examples.Composite composite82 = new examples.Composite((-3));
        examples.Composite composite84 = new examples.Composite((-3));
        composite82.addChild(composite84);
        boolean boolean86 = compositeSet79.add(composite84);
        boolean boolean87 = compositeSet68.removeAll((java.util.Collection<examples.Composite>) compositeSet79);
        boolean boolean89 = compositeSet68.remove((java.lang.Object) (byte) 0);
        boolean boolean90 = compositeSet16.addAll((java.util.Collection<examples.Composite>) compositeSet68);
        examples.Composite composite92 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet93 = composite92.children();
        java.lang.Object[] objArray94 = compositeSet93.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream95 = compositeSet93.parallelStream();
        compositeSet93.clear();
        boolean boolean97 = compositeSet16.addAll((java.util.Collection<examples.Composite>) compositeSet93);
        boolean boolean98 = compositeSet2.contains((java.lang.Object) boolean97);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeItor4);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compositeSet61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertNotNull(compositeSet68);
        org.junit.Assert.assertNotNull(compositeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(compositeSet93);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[]");
        org.junit.Assert.assertNotNull(compositeStream95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.Composite composite1 = new examples.Composite(10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        compositeSet8.clear();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.Composite composite1 = new examples.Composite(7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.lang.Object[] objArray10 = compositeSet9.toArray();
        java.util.Iterator<examples.Composite> compositeItor11 = compositeSet9.iterator();
        java.util.Iterator<examples.Composite> compositeItor12 = compositeSet9.iterator();
        boolean boolean13 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeSet9);
        java.util.Collection<examples.Composite> compositeCollection14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = compositeSet9.containsAll(compositeCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertNotNull(compositeItor11);
        org.junit.Assert.assertNotNull(compositeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.lang.Class<?> wildcardClass46 = compositeSet25.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        boolean boolean13 = compositeSet7.contains((java.lang.Object) composite11);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        java.lang.Object[] objArray61 = compositeSet55.toArray();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        boolean boolean61 = compositeSet10.remove((java.lang.Object) (-1));
        compositeSet10.clear();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        java.lang.Object[] objArray23 = compositeSet13.toArray();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        compositeSet13.clear();
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray21 = compositeSet13.toArray(serializableArray20);
        java.util.stream.Stream<examples.Composite> compositeStream22 = compositeSet13.parallelStream();
        boolean boolean23 = compositeSet6.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        compositeSet6.clear();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(serializableArray20);
        org.junit.Assert.assertNotNull(serializableArray21);
        org.junit.Assert.assertNotNull(compositeStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet40.iterator();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet40.remove((java.lang.Object) composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite6, composite10, composite27, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        boolean boolean59 = compositeSet56.remove((java.lang.Object) 10.0f);
        boolean boolean60 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet56);
        boolean boolean62 = compositeSet56.remove((java.lang.Object) (-4));
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        int int22 = compositeSet13.size();
        boolean boolean24 = compositeSet13.contains((java.lang.Object) 7);
        java.util.Collection<examples.Composite> compositeCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = compositeSet13.removeAll(compositeCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        examples.Composite composite56 = new examples.Composite((-3));
        composite54.addChild(composite56);
        examples.Composite[] compositeArray58 = new examples.Composite[] { composite50, composite52, composite54 };
        java.util.LinkedHashSet<examples.Composite> compositeSet59 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet59, compositeArray58);
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        boolean boolean66 = compositeSet59.add(composite64);
        java.util.Iterator<examples.Composite> compositeItor67 = compositeSet59.iterator();
        examples.Composite composite69 = new examples.Composite((-3));
        examples.Composite composite71 = new examples.Composite((-3));
        composite69.addChild(composite71);
        boolean boolean73 = compositeSet59.remove((java.lang.Object) composite71);
        examples.Composite[] compositeArray74 = new examples.Composite[] { composite25, composite29, composite46, composite71 };
        java.util.LinkedHashSet<examples.Composite> compositeSet75 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet75, compositeArray74);
        boolean boolean78 = compositeSet75.remove((java.lang.Object) 10.0f);
        boolean boolean79 = compositeSet2.retainAll((java.util.Collection<examples.Composite>) compositeSet75);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(compositeItor67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(compositeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        boolean boolean59 = compositeSet10.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        boolean boolean64 = compositeSet55.retainAll((java.util.Collection<examples.Composite>) compositeSet63);
        java.util.Iterator<examples.Composite> compositeItor65 = compositeSet55.iterator();
        java.lang.Class<?> wildcardClass66 = compositeItor65.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(compositeItor65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.lang.Object[] objArray27 = compositeSet26.toArray();
        java.lang.Class<?> wildcardClass28 = compositeSet26.getClass();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        java.lang.Object[] objArray43 = compositeSet42.toArray();
        java.util.Iterator<examples.Composite> compositeItor44 = compositeSet42.iterator();
        java.util.Iterator<examples.Composite> compositeItor45 = compositeSet42.iterator();
        boolean boolean46 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet42);
        java.lang.Object[] objArray47 = compositeSet42.toArray();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertNotNull(compositeItor44);
        org.junit.Assert.assertNotNull(compositeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        compositeSet6.clear();
        java.util.stream.Stream<examples.Composite> compositeStream11 = compositeSet6.parallelStream();
        compositeSet6.clear();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(compositeStream11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        compositeSet13.clear();
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray21 = compositeSet13.toArray(serializableArray20);
        java.util.stream.Stream<examples.Composite> compositeStream22 = compositeSet13.parallelStream();
        boolean boolean23 = compositeSet6.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.lang.Object[] objArray24 = compositeSet13.toArray();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(serializableArray20);
        org.junit.Assert.assertNotNull(serializableArray21);
        org.junit.Assert.assertNotNull(compositeStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.lang.Object[] objArray27 = compositeSet26.toArray();
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        composite33.addChild(composite35);
        examples.Composite[] compositeArray37 = new examples.Composite[] { composite29, composite31, composite33 };
        java.util.LinkedHashSet<examples.Composite> compositeSet38 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet38, compositeArray37);
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        composite41.addChild(composite43);
        boolean boolean45 = compositeSet38.add(composite43);
        java.util.Set<examples.Composite> compositeSet46 = composite43.children();
        boolean boolean47 = compositeSet26.add(composite43);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertNotNull(compositeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(compositeSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet2.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        int int29 = compositeSet28.size();
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        examples.Composite composite37 = new examples.Composite((-3));
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        composite41.addChild(composite43);
        examples.Composite[] compositeArray45 = new examples.Composite[] { composite37, composite39, composite41 };
        java.util.LinkedHashSet<examples.Composite> compositeSet46 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet46, compositeArray45);
        examples.Composite composite49 = new examples.Composite((-3));
        examples.Composite composite51 = new examples.Composite((-3));
        composite49.addChild(composite51);
        boolean boolean53 = compositeSet46.add(composite51);
        examples.Composite[] compositeArray54 = new examples.Composite[] { composite33, composite51 };
        java.util.ArrayList<examples.Composite> compositeList55 = new java.util.ArrayList<examples.Composite>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList55, compositeArray54);
        boolean boolean57 = compositeSet28.containsAll((java.util.Collection<examples.Composite>) compositeList55);
        examples.Composite composite59 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet60 = composite59.children();
        compositeSet60.clear();
        boolean boolean62 = compositeSet28.remove((java.lang.Object) compositeSet60);
        boolean boolean63 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet60);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(compositeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(compositeSet60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.removeAll((java.util.Collection<examples.Composite>) compositeSet73);
        boolean boolean83 = compositeSet62.remove((java.lang.Object) (byte) 0);
        boolean boolean84 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet62);
        compositeSet10.clear();
        examples.Composite composite87 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet88 = composite87.children();
        compositeSet88.clear();
        java.io.Serializable[] serializableArray95 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray96 = compositeSet88.toArray(serializableArray95);
        boolean boolean97 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet88);
        java.lang.Class<?> wildcardClass98 = compositeSet88.getClass();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(compositeSet88);
        org.junit.Assert.assertNotNull(serializableArray95);
        org.junit.Assert.assertNotNull(serializableArray96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        examples.Composite[] compositeArray52 = new examples.Composite[] { composite44, composite46, composite48 };
        java.util.LinkedHashSet<examples.Composite> compositeSet53 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet53, compositeArray52);
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        composite56.addChild(composite58);
        boolean boolean60 = compositeSet53.add(composite58);
        boolean boolean61 = compositeSet42.containsAll((java.util.Collection<examples.Composite>) compositeSet53);
        java.lang.Object[] objArray62 = compositeSet53.toArray();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        composite64.addChild(composite66);
        examples.Composite composite69 = new examples.Composite((-3));
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        examples.Composite composite75 = new examples.Composite((-3));
        composite73.addChild(composite75);
        examples.Composite[] compositeArray77 = new examples.Composite[] { composite69, composite71, composite73 };
        java.util.LinkedHashSet<examples.Composite> compositeSet78 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet78, compositeArray77);
        examples.Composite composite81 = new examples.Composite((-3));
        examples.Composite composite83 = new examples.Composite((-3));
        composite81.addChild(composite83);
        boolean boolean85 = compositeSet78.add(composite83);
        examples.Composite composite87 = new examples.Composite((-3));
        examples.Composite composite89 = new examples.Composite((-3));
        examples.Composite composite91 = new examples.Composite((-3));
        composite89.addChild(composite91);
        examples.Composite[] compositeArray93 = new examples.Composite[] { composite64, composite83, composite87, composite91 };
        java.util.LinkedHashSet<examples.Composite> compositeSet94 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet94, compositeArray93);
        java.lang.Object[] objArray96 = compositeSet94.toArray();
        boolean boolean97 = compositeSet53.addAll((java.util.Collection<examples.Composite>) compositeSet94);
        boolean boolean98 = compositeSet5.contains((java.lang.Object) compositeSet53);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(compositeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(compositeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.Composite composite1 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        examples.Composite[] compositeArray23 = new examples.Composite[] { composite15, composite17, composite19 };
        java.util.LinkedHashSet<examples.Composite> compositeSet24 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet24, compositeArray23);
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        boolean boolean31 = compositeSet24.add(composite29);
        boolean boolean32 = compositeSet13.removeAll((java.util.Collection<examples.Composite>) compositeSet24);
        boolean boolean34 = compositeSet13.remove((java.lang.Object) (byte) 0);
        boolean boolean35 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite37 = new examples.Composite((-3));
        examples.Composite composite39 = new examples.Composite((-3));
        composite37.addChild(composite39);
        java.util.Set<examples.Composite> compositeSet41 = composite39.children();
        examples.Composite composite43 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet44 = composite43.children();
        java.util.Iterator<examples.Composite> compositeItor45 = compositeSet44.iterator();
        boolean boolean46 = compositeSet41.retainAll((java.util.Collection<examples.Composite>) compositeSet44);
        boolean boolean47 = compositeSet2.remove((java.lang.Object) boolean46);
        int int48 = compositeSet2.size();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet49 = composite48.children();
        compositeSet49.clear();
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray57 = compositeSet49.toArray(serializableArray56);
        java.lang.Object[] objArray58 = compositeSet49.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream59 = compositeSet49.parallelStream();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        java.lang.Object[] objArray63 = compositeSet62.toArray();
        java.util.Iterator<examples.Composite> compositeItor64 = compositeSet62.iterator();
        java.util.Iterator<examples.Composite> compositeItor65 = compositeSet62.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream66 = compositeSet62.parallelStream();
        java.lang.AutoCloseable[] autoCloseableArray67 = new java.lang.AutoCloseable[] { compositeStream59, compositeStream66 };
        java.lang.AutoCloseable[] autoCloseableArray68 = compositeSet25.toArray(autoCloseableArray67);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(serializableArray56);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertNotNull(compositeStream59);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertNotNull(compositeItor64);
        org.junit.Assert.assertNotNull(compositeItor65);
        org.junit.Assert.assertNotNull(compositeStream66);
        org.junit.Assert.assertNotNull(autoCloseableArray67);
        org.junit.Assert.assertNotNull(autoCloseableArray68);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean26 = compositeSet18.remove((java.lang.Object) compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.lang.Object[] objArray22 = compositeSet13.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        java.lang.Object[] objArray43 = compositeSet42.toArray();
        java.util.Iterator<examples.Composite> compositeItor44 = compositeSet42.iterator();
        java.util.Iterator<examples.Composite> compositeItor45 = compositeSet42.iterator();
        boolean boolean46 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet42);
        java.util.Iterator<examples.Composite> compositeItor47 = compositeSet42.iterator();
        boolean boolean48 = compositeSet42.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertNotNull(compositeItor44);
        org.junit.Assert.assertNotNull(compositeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(compositeItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        examples.Composite[] compositeArray20 = new examples.Composite[] { composite12, composite14, composite16 };
        java.util.LinkedHashSet<examples.Composite> compositeSet21 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet21, compositeArray20);
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        boolean boolean28 = compositeSet21.add(composite26);
        boolean boolean29 = compositeSet10.containsAll((java.util.Collection<examples.Composite>) compositeSet21);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        boolean boolean48 = compositeSet21.add(composite45);
        examples.Composite composite50 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet51 = composite50.children();
        composite45.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet53 = composite45.children();
        boolean boolean54 = compositeSet7.add(composite45);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeSet51);
        org.junit.Assert.assertNotNull(compositeSet53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = compositeSet2.toArray();
        java.util.Iterator<examples.Composite> compositeItor25 = compositeSet2.iterator();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertNotNull(compositeItor25);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        int int11 = compositeSet8.size();
        compositeSet8.clear();
        java.util.stream.Stream<examples.Composite> compositeStream13 = compositeSet8.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(compositeStream13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        java.util.Iterator<examples.Composite> compositeItor64 = compositeSet63.iterator();
        boolean boolean65 = compositeSet55.addAll((java.util.Collection<examples.Composite>) compositeSet63);
        examples.Composite composite67 = new examples.Composite((int) 'a');
        boolean boolean68 = compositeSet55.add(composite67);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertNotNull(compositeItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite23, composite25, composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        boolean boolean39 = compositeSet32.add(composite37);
        boolean boolean40 = compositeSet13.add(composite37);
        examples.Composite composite42 = new examples.Composite((-2));
        boolean boolean43 = compositeSet13.remove((java.lang.Object) composite42);
        java.lang.Object[] objArray44 = compositeSet13.toArray();
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        composite46.addChild(composite48);
        java.util.Set<examples.Composite> compositeSet50 = composite48.children();
        int int51 = compositeSet50.size();
        examples.Composite composite53 = new examples.Composite((-3));
        examples.Composite composite55 = new examples.Composite((-3));
        composite53.addChild(composite55);
        java.util.Set<examples.Composite> compositeSet57 = composite55.children();
        examples.Composite composite59 = new examples.Composite((-3));
        examples.Composite composite61 = new examples.Composite((-3));
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        composite63.addChild(composite65);
        examples.Composite[] compositeArray67 = new examples.Composite[] { composite59, composite61, composite63 };
        java.util.LinkedHashSet<examples.Composite> compositeSet68 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet68, compositeArray67);
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        composite71.addChild(composite73);
        boolean boolean75 = compositeSet68.add(composite73);
        examples.Composite[] compositeArray76 = new examples.Composite[] { composite55, composite73 };
        java.util.ArrayList<examples.Composite> compositeList77 = new java.util.ArrayList<examples.Composite>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList77, compositeArray76);
        boolean boolean79 = compositeSet50.containsAll((java.util.Collection<examples.Composite>) compositeList77);
        examples.Composite composite81 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet82 = composite81.children();
        compositeSet82.clear();
        boolean boolean84 = compositeSet50.remove((java.lang.Object) compositeSet82);
        boolean boolean85 = compositeSet13.addAll((java.util.Collection<examples.Composite>) compositeSet50);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(compositeSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(compositeSet57);
        org.junit.Assert.assertNotNull(compositeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(compositeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(compositeSet82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        boolean boolean60 = compositeSet10.contains((java.lang.Object) (-5.4d));
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        boolean boolean6 = compositeSet5.isEmpty();
        boolean boolean8 = compositeSet5.remove((java.lang.Object) (-100.0d));
        examples.Composite composite10 = new examples.Composite((int) ' ');
        boolean boolean11 = compositeSet5.add(composite10);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = compositeSet2.toArray();
        examples.Composite composite26 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        boolean boolean28 = compositeSet2.add(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.Composite composite1 = new examples.Composite(3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        boolean boolean49 = compositeSet30.containsAll((java.util.Collection<examples.Composite>) compositeSet41);
        boolean boolean50 = compositeSet25.retainAll((java.util.Collection<examples.Composite>) compositeSet30);
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        composite52.addChild(composite54);
        java.util.Set<examples.Composite> compositeSet56 = composite54.children();
        int int57 = compositeSet56.size();
        examples.Composite composite59 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet60 = composite59.children();
        java.lang.Object[] objArray61 = compositeSet60.toArray();
        java.util.Iterator<examples.Composite> compositeItor62 = compositeSet60.iterator();
        java.util.Iterator<examples.Composite> compositeItor63 = compositeSet60.iterator();
        boolean boolean64 = compositeSet56.containsAll((java.util.Collection<examples.Composite>) compositeSet60);
        boolean boolean65 = compositeSet60.isEmpty();
        boolean boolean66 = compositeSet30.containsAll((java.util.Collection<examples.Composite>) compositeSet60);
        java.lang.Object[] objArray67 = compositeSet60.toArray();
        boolean boolean68 = compositeSet60.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compositeSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(compositeSet60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertNotNull(compositeItor62);
        org.junit.Assert.assertNotNull(compositeItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite23, composite25, composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        boolean boolean39 = compositeSet32.add(composite37);
        boolean boolean40 = compositeSet13.add(composite37);
        examples.Composite composite42 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet43 = composite42.children();
        composite37.addChild(composite42);
        java.util.Set<examples.Composite> compositeSet45 = composite37.children();
        examples.Composite composite47 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet48 = composite47.children();
        composite37.addChild(composite47);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet45);
        org.junit.Assert.assertNotNull(compositeSet48);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        java.util.Iterator<examples.Composite> compositeItor7 = compositeSet5.iterator();
        boolean boolean8 = compositeSet5.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        compositeSet6.clear();
        java.util.Iterator<examples.Composite> compositeItor11 = compositeSet6.iterator();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(compositeItor11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet8.iterator();
        boolean boolean10 = compositeSet5.retainAll((java.util.Collection<examples.Composite>) compositeSet8);
        examples.Composite composite12 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        boolean boolean14 = compositeSet5.add(composite12);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Collection<examples.Composite> compositeCollection21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = compositeSet20.retainAll(compositeCollection21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        compositeSet30.clear();
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray38 = compositeSet30.toArray(serializableArray37);
        java.lang.Object[] objArray39 = compositeSet30.toArray();
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        composite52.addChild(composite54);
        examples.Composite[] compositeArray56 = new examples.Composite[] { composite48, composite50, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet57 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet57, compositeArray56);
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        composite60.addChild(composite62);
        boolean boolean64 = compositeSet57.add(composite62);
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        composite70.addChild(composite72);
        examples.Composite[] compositeArray74 = new examples.Composite[] { composite66, composite68, composite70 };
        java.util.LinkedHashSet<examples.Composite> compositeSet75 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet75, compositeArray74);
        examples.Composite composite78 = new examples.Composite((-3));
        examples.Composite composite80 = new examples.Composite((-3));
        composite78.addChild(composite80);
        boolean boolean82 = compositeSet75.add(composite80);
        java.util.Iterator<examples.Composite> compositeItor83 = compositeSet75.iterator();
        examples.Composite composite85 = new examples.Composite((-3));
        examples.Composite composite87 = new examples.Composite((-3));
        composite85.addChild(composite87);
        boolean boolean89 = compositeSet75.remove((java.lang.Object) composite87);
        examples.Composite[] compositeArray90 = new examples.Composite[] { composite41, composite45, composite62, composite87 };
        java.util.LinkedHashSet<examples.Composite> compositeSet91 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet91, compositeArray90);
        boolean boolean94 = compositeSet91.remove((java.lang.Object) 10.0f);
        java.lang.Cloneable[] cloneableArray95 = new java.lang.Cloneable[] { objArray39, compositeSet91 };
        java.lang.Cloneable[] cloneableArray96 = compositeSet25.toArray(cloneableArray95);
        int int97 = compositeSet25.size();
        java.lang.Class<?> wildcardClass98 = compositeSet25.getClass();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertNotNull(compositeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(compositeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(compositeItor83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(compositeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(cloneableArray95);
        org.junit.Assert.assertNotNull(cloneableArray96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        boolean boolean15 = compositeSet13.remove((java.lang.Object) (-7));
        compositeSet13.clear();
        boolean boolean17 = compositeSet6.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.lang.Object[] objArray18 = compositeSet13.toArray();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite[] compositeArray16 = new examples.Composite[] { composite8, composite10, composite12 };
        java.util.LinkedHashSet<examples.Composite> compositeSet17 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet17, compositeArray16);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet17.add(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        java.util.Iterator<examples.Composite> compositeItor43 = compositeSet35.iterator();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        boolean boolean49 = compositeSet35.remove((java.lang.Object) composite47);
        examples.Composite[] compositeArray50 = new examples.Composite[] { composite1, composite5, composite22, composite47 };
        java.util.LinkedHashSet<examples.Composite> compositeSet51 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet51, compositeArray50);
        boolean boolean54 = compositeSet51.remove((java.lang.Object) 10.0f);
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        composite56.addChild(composite58);
        java.util.Set<examples.Composite> compositeSet60 = composite58.children();
        int int61 = compositeSet60.size();
        boolean boolean63 = compositeSet60.remove((java.lang.Object) 9.6d);
        boolean boolean64 = compositeSet51.contains((java.lang.Object) boolean63);
        org.junit.Assert.assertNotNull(compositeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compositeItor43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(compositeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeSet60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        java.util.stream.Stream<examples.Composite> compositeStream24 = compositeSet2.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(compositeStream24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite[] compositeArray14 = new examples.Composite[] { composite6, composite8, composite10 };
        java.util.LinkedHashSet<examples.Composite> compositeSet15 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet15, compositeArray14);
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        boolean boolean22 = compositeSet15.add(composite20);
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        examples.Composite[] compositeArray30 = new examples.Composite[] { composite1, composite20, composite24, composite28 };
        java.util.LinkedHashSet<examples.Composite> compositeSet31 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet31, compositeArray30);
        java.lang.Object[] objArray33 = compositeSet31.toArray();
        examples.Composite composite35 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.lang.Object[] objArray37 = compositeSet36.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream38 = compositeSet36.parallelStream();
        compositeSet36.clear();
        boolean boolean40 = compositeSet31.addAll((java.util.Collection<examples.Composite>) compositeSet36);
        org.junit.Assert.assertNotNull(compositeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(compositeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertNotNull(compositeStream38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        boolean boolean43 = compositeSet24.removeAll((java.util.Collection<examples.Composite>) compositeSet35);
        java.util.Iterator<examples.Composite> compositeItor44 = compositeSet24.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream45 = compositeSet24.parallelStream();
        boolean boolean46 = compositeSet13.retainAll((java.util.Collection<examples.Composite>) compositeSet24);
        java.util.Iterator<examples.Composite> compositeItor47 = compositeSet24.iterator();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(compositeItor44);
        org.junit.Assert.assertNotNull(compositeStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(compositeItor47);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((int) ' ');
        boolean boolean30 = compositeSet25.add(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        examples.Composite[] compositeArray18 = new examples.Composite[] { composite10, composite12, composite14 };
        java.util.LinkedHashSet<examples.Composite> compositeSet19 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet19, compositeArray18);
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        boolean boolean26 = compositeSet19.add(composite24);
        boolean boolean27 = compositeSet8.containsAll((java.util.Collection<examples.Composite>) compositeSet19);
        java.util.Iterator<examples.Composite> compositeItor28 = compositeSet19.iterator();
        examples.Composite composite30 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        examples.Composite composite39 = new examples.Composite((-3));
        composite37.addChild(composite39);
        examples.Composite[] compositeArray41 = new examples.Composite[] { composite33, composite35, composite37 };
        java.util.LinkedHashSet<examples.Composite> compositeSet42 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet42, compositeArray41);
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        boolean boolean49 = compositeSet42.add(composite47);
        boolean boolean50 = compositeSet31.containsAll((java.util.Collection<examples.Composite>) compositeSet42);
        boolean boolean51 = compositeSet19.contains((java.lang.Object) compositeSet31);
        java.lang.Object[] objArray52 = compositeSet19.toArray();
        boolean boolean53 = compositeSet2.remove((java.lang.Object) compositeSet19);
        java.util.Collection<examples.Composite> compositeCollection54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = compositeSet2.retainAll(compositeCollection54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeItor28);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        compositeSet30.clear();
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray38 = compositeSet30.toArray(serializableArray37);
        java.lang.Object[] objArray39 = compositeSet30.toArray();
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        examples.Composite composite54 = new examples.Composite((-3));
        composite52.addChild(composite54);
        examples.Composite[] compositeArray56 = new examples.Composite[] { composite48, composite50, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet57 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet57, compositeArray56);
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        composite60.addChild(composite62);
        boolean boolean64 = compositeSet57.add(composite62);
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        composite70.addChild(composite72);
        examples.Composite[] compositeArray74 = new examples.Composite[] { composite66, composite68, composite70 };
        java.util.LinkedHashSet<examples.Composite> compositeSet75 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet75, compositeArray74);
        examples.Composite composite78 = new examples.Composite((-3));
        examples.Composite composite80 = new examples.Composite((-3));
        composite78.addChild(composite80);
        boolean boolean82 = compositeSet75.add(composite80);
        java.util.Iterator<examples.Composite> compositeItor83 = compositeSet75.iterator();
        examples.Composite composite85 = new examples.Composite((-3));
        examples.Composite composite87 = new examples.Composite((-3));
        composite85.addChild(composite87);
        boolean boolean89 = compositeSet75.remove((java.lang.Object) composite87);
        examples.Composite[] compositeArray90 = new examples.Composite[] { composite41, composite45, composite62, composite87 };
        java.util.LinkedHashSet<examples.Composite> compositeSet91 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet91, compositeArray90);
        boolean boolean94 = compositeSet91.remove((java.lang.Object) 10.0f);
        java.lang.Cloneable[] cloneableArray95 = new java.lang.Cloneable[] { objArray39, compositeSet91 };
        java.lang.Cloneable[] cloneableArray96 = compositeSet25.toArray(cloneableArray95);
        boolean boolean97 = compositeSet25.isEmpty();
        boolean boolean98 = compositeSet25.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertNotNull(compositeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(compositeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(compositeItor83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(compositeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(cloneableArray95);
        org.junit.Assert.assertNotNull(cloneableArray96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite(0);
        boolean boolean24 = compositeSet13.add(composite23);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Iterator<examples.Composite> compositeItor3 = compositeSet2.iterator();
        int int4 = compositeSet2.size();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        compositeSet8.clear();
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray16 = compositeSet8.toArray(serializableArray15);
        java.lang.Object[] objArray17 = compositeSet8.toArray();
        boolean boolean18 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet8);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Iterator<examples.Composite> compositeItor28 = compositeSet27.iterator();
        boolean boolean29 = compositeSet24.retainAll((java.util.Collection<examples.Composite>) compositeSet27);
        int int30 = compositeSet27.size();
        boolean boolean31 = compositeSet8.containsAll((java.util.Collection<examples.Composite>) compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(serializableArray15);
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Iterator<examples.Composite> compositeItor3 = compositeSet2.iterator();
        int int4 = compositeSet2.size();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        examples.Composite[] compositeArray18 = new examples.Composite[] { composite10, composite12, composite14 };
        java.util.LinkedHashSet<examples.Composite> compositeSet19 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet19, compositeArray18);
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        boolean boolean26 = compositeSet19.add(composite24);
        boolean boolean27 = compositeSet8.containsAll((java.util.Collection<examples.Composite>) compositeSet19);
        java.lang.Object[] objArray28 = compositeSet19.toArray();
        boolean boolean29 = compositeSet2.contains((java.lang.Object) compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        boolean boolean49 = compositeSet30.containsAll((java.util.Collection<examples.Composite>) compositeSet41);
        boolean boolean50 = compositeSet25.retainAll((java.util.Collection<examples.Composite>) compositeSet30);
        examples.Composite composite52 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet53 = composite52.children();
        examples.Composite composite55 = new examples.Composite((-3));
        examples.Composite composite57 = new examples.Composite((-3));
        examples.Composite composite59 = new examples.Composite((-3));
        examples.Composite composite61 = new examples.Composite((-3));
        composite59.addChild(composite61);
        examples.Composite[] compositeArray63 = new examples.Composite[] { composite55, composite57, composite59 };
        java.util.LinkedHashSet<examples.Composite> compositeSet64 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet64, compositeArray63);
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        composite67.addChild(composite69);
        boolean boolean71 = compositeSet64.add(composite69);
        boolean boolean72 = compositeSet53.containsAll((java.util.Collection<examples.Composite>) compositeSet64);
        examples.Composite composite74 = new examples.Composite((-3));
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        examples.Composite composite80 = new examples.Composite((-3));
        composite78.addChild(composite80);
        examples.Composite[] compositeArray82 = new examples.Composite[] { composite74, composite76, composite78 };
        java.util.LinkedHashSet<examples.Composite> compositeSet83 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet83, compositeArray82);
        examples.Composite composite86 = new examples.Composite((-3));
        examples.Composite composite88 = new examples.Composite((-3));
        composite86.addChild(composite88);
        boolean boolean90 = compositeSet83.add(composite88);
        boolean boolean91 = compositeSet64.add(composite88);
        examples.Composite composite93 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet94 = composite93.children();
        composite88.addChild(composite93);
        boolean boolean96 = compositeSet30.add(composite88);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compositeSet53);
        org.junit.Assert.assertNotNull(compositeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(compositeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(compositeSet94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        compositeSet2.clear();
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite[] compositeArray15 = new examples.Composite[] { composite7, composite9, composite11 };
        java.util.LinkedHashSet<examples.Composite> compositeSet16 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet16, compositeArray15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        boolean boolean23 = compositeSet16.add(composite21);
        java.util.Iterator<examples.Composite> compositeItor24 = compositeSet16.iterator();
        int int25 = compositeSet16.size();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        boolean boolean35 = compositeSet32.remove((java.lang.Object) (-6.9d));
        boolean boolean36 = compositeSet16.retainAll((java.util.Collection<examples.Composite>) compositeSet32);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        int int43 = compositeSet42.size();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        java.util.Set<examples.Composite> compositeSet49 = composite47.children();
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        examples.Composite composite55 = new examples.Composite((-3));
        examples.Composite composite57 = new examples.Composite((-3));
        composite55.addChild(composite57);
        examples.Composite[] compositeArray59 = new examples.Composite[] { composite51, composite53, composite55 };
        java.util.LinkedHashSet<examples.Composite> compositeSet60 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet60, compositeArray59);
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        composite63.addChild(composite65);
        boolean boolean67 = compositeSet60.add(composite65);
        examples.Composite[] compositeArray68 = new examples.Composite[] { composite47, composite65 };
        java.util.ArrayList<examples.Composite> compositeList69 = new java.util.ArrayList<examples.Composite>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList69, compositeArray68);
        boolean boolean71 = compositeSet42.containsAll((java.util.Collection<examples.Composite>) compositeList69);
        examples.Composite composite73 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet74 = composite73.children();
        compositeSet74.clear();
        boolean boolean76 = compositeSet42.remove((java.lang.Object) compositeSet74);
        boolean boolean77 = compositeSet16.addAll((java.util.Collection<examples.Composite>) compositeSet74);
        boolean boolean78 = compositeSet2.addAll((java.util.Collection<examples.Composite>) compositeSet16);
        examples.Composite composite79 = null;
        boolean boolean80 = compositeSet16.add(composite79);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(compositeItor24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(compositeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(compositeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(compositeSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Object[] objArray6 = compositeSet5.toArray();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        boolean boolean16 = compositeSet13.remove((java.lang.Object) (-6.9d));
        int int17 = compositeSet13.size();
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        examples.Composite composite59 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet60 = composite59.children();
        java.lang.Object[] objArray61 = compositeSet60.toArray();
        java.util.Iterator<examples.Composite> compositeItor62 = compositeSet60.iterator();
        java.util.Iterator<examples.Composite> compositeItor63 = compositeSet60.iterator();
        boolean boolean64 = compositeSet23.addAll((java.util.Collection<examples.Composite>) compositeSet60);
        java.util.Iterator<examples.Composite> compositeItor65 = compositeSet60.iterator();
        compositeSet60.clear();
        examples.Composite composite68 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet69 = composite68.children();
        examples.Composite composite71 = new examples.Composite((-3));
        examples.Composite composite73 = new examples.Composite((-3));
        examples.Composite composite75 = new examples.Composite((-3));
        examples.Composite composite77 = new examples.Composite((-3));
        composite75.addChild(composite77);
        examples.Composite[] compositeArray79 = new examples.Composite[] { composite71, composite73, composite75 };
        java.util.LinkedHashSet<examples.Composite> compositeSet80 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet80, compositeArray79);
        examples.Composite composite83 = new examples.Composite((-3));
        examples.Composite composite85 = new examples.Composite((-3));
        composite83.addChild(composite85);
        boolean boolean87 = compositeSet80.add(composite85);
        boolean boolean88 = compositeSet69.containsAll((java.util.Collection<examples.Composite>) compositeSet80);
        int int89 = compositeSet80.size();
        java.util.stream.Stream<examples.Composite> compositeStream90 = compositeSet80.parallelStream();
        boolean boolean91 = compositeSet60.remove((java.lang.Object) compositeSet80);
        boolean boolean92 = compositeSet13.contains((java.lang.Object) boolean91);
        boolean boolean93 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.stream.Stream<examples.Composite> compositeStream94 = compositeSet5.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(compositeSet60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertNotNull(compositeItor62);
        org.junit.Assert.assertNotNull(compositeItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(compositeItor65);
        org.junit.Assert.assertNotNull(compositeSet69);
        org.junit.Assert.assertNotNull(compositeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4 + "'", int89 == 4);
        org.junit.Assert.assertNotNull(compositeStream90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(compositeStream94);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite[] compositeArray5 = new examples.Composite[] { composite1 };
        java.util.LinkedHashSet<examples.Composite> compositeSet6 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet6, compositeArray5);
        boolean boolean9 = compositeSet6.remove((java.lang.Object) (-6.9d));
        int int10 = compositeSet6.size();
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        examples.Composite[] compositeArray20 = new examples.Composite[] { composite12, composite14, composite16 };
        java.util.LinkedHashSet<examples.Composite> compositeSet21 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet21, compositeArray20);
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        boolean boolean28 = compositeSet21.add(composite26);
        java.util.Iterator<examples.Composite> compositeItor29 = compositeSet21.iterator();
        int int30 = compositeSet21.size();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        examples.Composite[] compositeArray36 = new examples.Composite[] { composite32 };
        java.util.LinkedHashSet<examples.Composite> compositeSet37 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet37, compositeArray36);
        boolean boolean40 = compositeSet37.remove((java.lang.Object) (-6.9d));
        boolean boolean41 = compositeSet21.retainAll((java.util.Collection<examples.Composite>) compositeSet37);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        java.util.Set<examples.Composite> compositeSet47 = composite45.children();
        int int48 = compositeSet47.size();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        java.util.Set<examples.Composite> compositeSet54 = composite52.children();
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        composite60.addChild(composite62);
        examples.Composite[] compositeArray64 = new examples.Composite[] { composite56, composite58, composite60 };
        java.util.LinkedHashSet<examples.Composite> compositeSet65 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet65, compositeArray64);
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        boolean boolean72 = compositeSet65.add(composite70);
        examples.Composite[] compositeArray73 = new examples.Composite[] { composite52, composite70 };
        java.util.ArrayList<examples.Composite> compositeList74 = new java.util.ArrayList<examples.Composite>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList74, compositeArray73);
        boolean boolean76 = compositeSet47.containsAll((java.util.Collection<examples.Composite>) compositeList74);
        examples.Composite composite78 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet79 = composite78.children();
        compositeSet79.clear();
        boolean boolean81 = compositeSet47.remove((java.lang.Object) compositeSet79);
        boolean boolean82 = compositeSet21.addAll((java.util.Collection<examples.Composite>) compositeSet79);
        boolean boolean83 = compositeSet6.addAll((java.util.Collection<examples.Composite>) compositeSet21);
        java.util.Iterator<examples.Composite> compositeItor84 = compositeSet6.iterator();
        org.junit.Assert.assertNotNull(compositeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(compositeItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(compositeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(compositeSet47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(compositeSet54);
        org.junit.Assert.assertNotNull(compositeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(compositeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(compositeSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(compositeItor84);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        boolean boolean27 = compositeSet26.isEmpty();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet40.iterator();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet40.remove((java.lang.Object) composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite6, composite10, composite27, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        boolean boolean59 = compositeSet56.remove((java.lang.Object) 10.0f);
        boolean boolean60 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet56);
        boolean boolean61 = compositeSet56.isEmpty();
        boolean boolean62 = compositeSet56.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        examples.Composite[] compositeArray47 = new examples.Composite[] { composite39, composite41, composite43 };
        java.util.LinkedHashSet<examples.Composite> compositeSet48 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet48, compositeArray47);
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        composite51.addChild(composite53);
        boolean boolean55 = compositeSet48.add(composite53);
        boolean boolean56 = compositeSet37.containsAll((java.util.Collection<examples.Composite>) compositeSet48);
        examples.Composite composite58 = new examples.Composite((-3));
        examples.Composite composite60 = new examples.Composite((-3));
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        examples.Composite[] compositeArray66 = new examples.Composite[] { composite58, composite60, composite62 };
        java.util.LinkedHashSet<examples.Composite> compositeSet67 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet67, compositeArray66);
        examples.Composite composite70 = new examples.Composite((-3));
        examples.Composite composite72 = new examples.Composite((-3));
        composite70.addChild(composite72);
        boolean boolean74 = compositeSet67.add(composite72);
        boolean boolean75 = compositeSet48.add(composite72);
        examples.Composite composite77 = new examples.Composite((-3));
        examples.Composite composite79 = new examples.Composite((-3));
        composite77.addChild(composite79);
        java.util.Set<examples.Composite> compositeSet81 = composite79.children();
        int int82 = compositeSet81.size();
        boolean boolean83 = compositeSet48.removeAll((java.util.Collection<examples.Composite>) compositeSet81);
        boolean boolean84 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet81);
        examples.Composite composite86 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet87 = composite86.children();
        java.util.Iterator<examples.Composite> compositeItor88 = compositeSet87.iterator();
        boolean boolean89 = compositeSet5.remove((java.lang.Object) compositeItor88);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(compositeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(compositeSet81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(compositeSet87);
        org.junit.Assert.assertNotNull(compositeItor88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        compositeSet2.clear();
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        int int12 = compositeSet11.size();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        examples.Composite[] compositeArray28 = new examples.Composite[] { composite20, composite22, composite24 };
        java.util.LinkedHashSet<examples.Composite> compositeSet29 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet29, compositeArray28);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        boolean boolean36 = compositeSet29.add(composite34);
        examples.Composite[] compositeArray37 = new examples.Composite[] { composite16, composite34 };
        java.util.ArrayList<examples.Composite> compositeList38 = new java.util.ArrayList<examples.Composite>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList38, compositeArray37);
        boolean boolean40 = compositeSet11.containsAll((java.util.Collection<examples.Composite>) compositeList38);
        boolean boolean41 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeList38);
        java.util.Iterator<examples.Composite> compositeItor42 = compositeSet2.iterator();
        examples.Composite composite44 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet45 = composite44.children();
        java.lang.Object[] objArray46 = compositeSet45.toArray();
        java.util.Iterator<examples.Composite> compositeItor47 = compositeSet45.iterator();
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet45.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream49 = compositeSet45.parallelStream();
        examples.Composite composite51 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet52 = composite51.children();
        compositeSet52.clear();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray60 = compositeSet52.toArray(serializableArray59);
        java.lang.Object[] objArray61 = compositeSet52.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream62 = compositeSet52.parallelStream();
        boolean boolean63 = compositeSet45.remove((java.lang.Object) compositeSet52);
        java.lang.Object[] objArray64 = compositeSet45.toArray();
        boolean boolean65 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet45);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(compositeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(compositeItor42);
        org.junit.Assert.assertNotNull(compositeSet45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertNotNull(compositeItor47);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertNotNull(compositeStream49);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertNotNull(compositeStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite[] compositeArray16 = new examples.Composite[] { composite8, composite10, composite12 };
        java.util.LinkedHashSet<examples.Composite> compositeSet17 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet17, compositeArray16);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet17.add(composite22);
        boolean boolean25 = compositeSet6.containsAll((java.util.Collection<examples.Composite>) compositeSet17);
        int int26 = compositeSet17.size();
        java.util.stream.Stream<examples.Composite> compositeStream27 = compositeSet17.parallelStream();
        boolean boolean28 = compositeSet2.retainAll((java.util.Collection<examples.Composite>) compositeSet17);
        int int29 = compositeSet2.size();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(compositeStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite[] compositeArray14 = new examples.Composite[] { composite6, composite8, composite10 };
        java.util.LinkedHashSet<examples.Composite> compositeSet15 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet15, compositeArray14);
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        boolean boolean22 = compositeSet15.add(composite20);
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        examples.Composite[] compositeArray30 = new examples.Composite[] { composite1, composite20, composite24, composite28 };
        java.util.LinkedHashSet<examples.Composite> compositeSet31 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet31, compositeArray30);
        java.lang.Object[] objArray33 = compositeSet31.toArray();
        java.util.Iterator<examples.Composite> compositeItor34 = compositeSet31.iterator();
        org.junit.Assert.assertNotNull(compositeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(compositeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(compositeItor34);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        examples.Composite[] compositeArray25 = new examples.Composite[] { composite21 };
        java.util.LinkedHashSet<examples.Composite> compositeSet26 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet26, compositeArray25);
        boolean boolean29 = compositeSet26.remove((java.lang.Object) (-6.9d));
        boolean boolean30 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet26);
        examples.Composite composite32 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.lang.Object[] objArray34 = compositeSet33.toArray();
        java.util.Iterator<examples.Composite> compositeItor35 = compositeSet33.iterator();
        java.util.Iterator<examples.Composite> compositeItor36 = compositeSet33.iterator();
        examples.Composite composite38 = new examples.Composite((-2));
        boolean boolean39 = compositeSet33.add(composite38);
        boolean boolean40 = compositeSet10.remove((java.lang.Object) composite38);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertNotNull(compositeItor35);
        org.junit.Assert.assertNotNull(compositeItor36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Iterator<examples.Composite> compositeItor26 = compositeSet25.iterator();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        boolean boolean48 = compositeSet29.removeAll((java.util.Collection<examples.Composite>) compositeSet40);
        java.util.Iterator<examples.Composite> compositeItor49 = compositeSet29.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream50 = compositeSet29.parallelStream();
        boolean boolean51 = compositeSet25.remove((java.lang.Object) compositeStream50);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeItor26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(compositeItor49);
        org.junit.Assert.assertNotNull(compositeStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Iterator<examples.Composite> compositeItor8 = compositeSet7.iterator();
        java.util.Iterator<examples.Composite> compositeItor9 = compositeSet7.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream10 = compositeSet7.parallelStream();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        examples.Composite[] compositeArray23 = new examples.Composite[] { composite15, composite17, composite19 };
        java.util.LinkedHashSet<examples.Composite> compositeSet24 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet24, compositeArray23);
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        boolean boolean31 = compositeSet24.add(composite29);
        boolean boolean32 = compositeSet13.containsAll((java.util.Collection<examples.Composite>) compositeSet24);
        java.util.Iterator<examples.Composite> compositeItor33 = compositeSet24.iterator();
        examples.Composite composite35 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        composite42.addChild(composite44);
        examples.Composite[] compositeArray46 = new examples.Composite[] { composite38, composite40, composite42 };
        java.util.LinkedHashSet<examples.Composite> compositeSet47 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet47, compositeArray46);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet47.add(composite52);
        boolean boolean55 = compositeSet36.containsAll((java.util.Collection<examples.Composite>) compositeSet47);
        boolean boolean56 = compositeSet24.contains((java.lang.Object) compositeSet36);
        java.util.stream.Stream<examples.Composite> compositeStream57 = compositeSet36.parallelStream();
        examples.Composite composite59 = new examples.Composite((-3));
        examples.Composite composite61 = new examples.Composite((-3));
        composite59.addChild(composite61);
        java.util.Set<examples.Composite> compositeSet63 = composite61.children();
        examples.Composite composite65 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet66 = composite65.children();
        java.util.Iterator<examples.Composite> compositeItor67 = compositeSet66.iterator();
        boolean boolean68 = compositeSet63.retainAll((java.util.Collection<examples.Composite>) compositeSet66);
        int int69 = compositeSet66.size();
        compositeSet66.clear();
        boolean boolean71 = compositeSet36.containsAll((java.util.Collection<examples.Composite>) compositeSet66);
        examples.Composite composite73 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet74 = composite73.children();
        java.util.Iterator<examples.Composite> compositeItor75 = compositeSet74.iterator();
        boolean boolean76 = compositeSet66.addAll((java.util.Collection<examples.Composite>) compositeSet74);
        boolean boolean77 = compositeSet7.addAll((java.util.Collection<examples.Composite>) compositeSet74);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeItor8);
        org.junit.Assert.assertNotNull(compositeItor9);
        org.junit.Assert.assertNotNull(compositeStream10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(compositeItor33);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(compositeStream57);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertNotNull(compositeSet66);
        org.junit.Assert.assertNotNull(compositeItor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(compositeSet74);
        org.junit.Assert.assertNotNull(compositeItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        boolean boolean6 = compositeSet2.contains((java.lang.Object) 8);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.lang.Object[] objArray10 = compositeSet9.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream11 = compositeSet9.parallelStream();
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        examples.Composite composite24 = new examples.Composite((-3));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        examples.Composite[] compositeArray28 = new examples.Composite[] { composite20, composite22, composite24 };
        java.util.LinkedHashSet<examples.Composite> compositeSet29 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet29, compositeArray28);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        boolean boolean36 = compositeSet29.add(composite34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        composite42.addChild(composite44);
        examples.Composite[] compositeArray46 = new examples.Composite[] { composite38, composite40, composite42 };
        java.util.LinkedHashSet<examples.Composite> compositeSet47 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet47, compositeArray46);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet47.add(composite52);
        java.util.Iterator<examples.Composite> compositeItor55 = compositeSet47.iterator();
        examples.Composite composite57 = new examples.Composite((-3));
        examples.Composite composite59 = new examples.Composite((-3));
        composite57.addChild(composite59);
        boolean boolean61 = compositeSet47.remove((java.lang.Object) composite59);
        examples.Composite[] compositeArray62 = new examples.Composite[] { composite13, composite17, composite34, composite59 };
        java.util.LinkedHashSet<examples.Composite> compositeSet63 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet63, compositeArray62);
        boolean boolean66 = compositeSet63.remove((java.lang.Object) 10.0f);
        boolean boolean67 = compositeSet9.containsAll((java.util.Collection<examples.Composite>) compositeSet63);
        java.util.Iterator<examples.Composite> compositeItor68 = compositeSet63.iterator();
        boolean boolean69 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet63);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertNotNull(compositeStream11);
        org.junit.Assert.assertNotNull(compositeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(compositeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(compositeItor55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(compositeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(compositeItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        examples.Composite composite1 = new examples.Composite(1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite[] compositeArray14 = new examples.Composite[] { composite6, composite8, composite10 };
        java.util.LinkedHashSet<examples.Composite> compositeSet15 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet15, compositeArray14);
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        boolean boolean22 = compositeSet15.add(composite20);
        boolean boolean23 = compositeSet4.containsAll((java.util.Collection<examples.Composite>) compositeSet15);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        composite29.addChild(composite31);
        examples.Composite[] compositeArray33 = new examples.Composite[] { composite25, composite27, composite29 };
        java.util.LinkedHashSet<examples.Composite> compositeSet34 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet34, compositeArray33);
        examples.Composite composite37 = new examples.Composite((-3));
        examples.Composite composite39 = new examples.Composite((-3));
        composite37.addChild(composite39);
        boolean boolean41 = compositeSet34.add(composite39);
        boolean boolean42 = compositeSet15.add(composite39);
        examples.Composite composite44 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet45 = composite44.children();
        composite39.addChild(composite44);
        java.util.Set<examples.Composite> compositeSet47 = composite39.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(compositeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compositeSet45);
        org.junit.Assert.assertNotNull(compositeSet47);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Iterator<examples.Composite> compositeItor26 = compositeSet25.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream27 = compositeSet25.parallelStream();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeItor26);
        org.junit.Assert.assertNotNull(compositeStream27);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        compositeSet2.clear();
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite[] compositeArray15 = new examples.Composite[] { composite7, composite9, composite11 };
        java.util.LinkedHashSet<examples.Composite> compositeSet16 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet16, compositeArray15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        boolean boolean23 = compositeSet16.add(composite21);
        java.util.Iterator<examples.Composite> compositeItor24 = compositeSet16.iterator();
        int int25 = compositeSet16.size();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        boolean boolean35 = compositeSet32.remove((java.lang.Object) (-6.9d));
        boolean boolean36 = compositeSet16.retainAll((java.util.Collection<examples.Composite>) compositeSet32);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        int int43 = compositeSet42.size();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        java.util.Set<examples.Composite> compositeSet49 = composite47.children();
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        examples.Composite composite55 = new examples.Composite((-3));
        examples.Composite composite57 = new examples.Composite((-3));
        composite55.addChild(composite57);
        examples.Composite[] compositeArray59 = new examples.Composite[] { composite51, composite53, composite55 };
        java.util.LinkedHashSet<examples.Composite> compositeSet60 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet60, compositeArray59);
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        composite63.addChild(composite65);
        boolean boolean67 = compositeSet60.add(composite65);
        examples.Composite[] compositeArray68 = new examples.Composite[] { composite47, composite65 };
        java.util.ArrayList<examples.Composite> compositeList69 = new java.util.ArrayList<examples.Composite>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList69, compositeArray68);
        boolean boolean71 = compositeSet42.containsAll((java.util.Collection<examples.Composite>) compositeList69);
        examples.Composite composite73 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet74 = composite73.children();
        compositeSet74.clear();
        boolean boolean76 = compositeSet42.remove((java.lang.Object) compositeSet74);
        boolean boolean77 = compositeSet16.addAll((java.util.Collection<examples.Composite>) compositeSet74);
        boolean boolean78 = compositeSet2.addAll((java.util.Collection<examples.Composite>) compositeSet16);
        java.lang.Object[] objArray79 = compositeSet2.toArray();
        java.lang.Class<?> wildcardClass80 = objArray79.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(compositeItor24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(compositeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(compositeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(compositeSet74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet40.iterator();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet40.remove((java.lang.Object) composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite6, composite10, composite27, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        boolean boolean59 = compositeSet56.remove((java.lang.Object) 10.0f);
        boolean boolean60 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet56);
        java.util.stream.Stream<examples.Composite> compositeStream61 = compositeSet2.parallelStream();
        examples.Composite composite63 = new examples.Composite((-3));
        examples.Composite composite65 = new examples.Composite((-3));
        examples.Composite composite67 = new examples.Composite((-3));
        examples.Composite composite69 = new examples.Composite((-3));
        composite67.addChild(composite69);
        examples.Composite[] compositeArray71 = new examples.Composite[] { composite63, composite65, composite67 };
        java.util.LinkedHashSet<examples.Composite> compositeSet72 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet72, compositeArray71);
        examples.Composite composite75 = new examples.Composite((-3));
        examples.Composite composite77 = new examples.Composite((-3));
        composite75.addChild(composite77);
        boolean boolean79 = compositeSet72.add(composite77);
        boolean boolean80 = compositeSet2.add(composite77);
        examples.Composite composite82 = new examples.Composite((int) '4');
        boolean boolean83 = compositeSet2.add(composite82);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(compositeStream61);
        org.junit.Assert.assertNotNull(compositeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.lang.Object[] objArray25 = compositeSet24.toArray();
        java.util.Iterator<examples.Composite> compositeItor26 = compositeSet24.iterator();
        boolean boolean27 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertNotNull(compositeItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite15.addChild(composite20);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        java.lang.Object[] objArray43 = compositeSet42.toArray();
        java.util.Iterator<examples.Composite> compositeItor44 = compositeSet42.iterator();
        java.util.Iterator<examples.Composite> compositeItor45 = compositeSet42.iterator();
        boolean boolean46 = compositeSet5.addAll((java.util.Collection<examples.Composite>) compositeSet42);
        java.util.Iterator<examples.Composite> compositeItor47 = compositeSet42.iterator();
        compositeSet42.clear();
        int int49 = compositeSet42.size();
        java.lang.Object[] objArray50 = compositeSet42.toArray();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertNotNull(compositeItor44);
        org.junit.Assert.assertNotNull(compositeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(compositeItor47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        examples.Composite composite17 = new examples.Composite((-3));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        examples.Composite[] compositeArray21 = new examples.Composite[] { composite13, composite15, composite17 };
        java.util.LinkedHashSet<examples.Composite> compositeSet22 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet22, compositeArray21);
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        boolean boolean29 = compositeSet22.add(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        examples.Composite[] compositeArray39 = new examples.Composite[] { composite31, composite33, composite35 };
        java.util.LinkedHashSet<examples.Composite> compositeSet40 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet40, compositeArray39);
        examples.Composite composite43 = new examples.Composite((-3));
        examples.Composite composite45 = new examples.Composite((-3));
        composite43.addChild(composite45);
        boolean boolean47 = compositeSet40.add(composite45);
        java.util.Iterator<examples.Composite> compositeItor48 = compositeSet40.iterator();
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        boolean boolean54 = compositeSet40.remove((java.lang.Object) composite52);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite6, composite10, composite27, composite52 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        boolean boolean59 = compositeSet56.remove((java.lang.Object) 10.0f);
        boolean boolean60 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet56);
        examples.Composite composite62 = new examples.Composite((-3));
        examples.Composite composite64 = new examples.Composite((-3));
        composite62.addChild(composite64);
        java.util.Set<examples.Composite> compositeSet66 = composite64.children();
        int int67 = compositeSet66.size();
        java.util.stream.Stream<examples.Composite> compositeStream68 = compositeSet66.parallelStream();
        examples.Composite composite70 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet71 = composite70.children();
        compositeSet71.clear();
        examples.Composite composite74 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet75 = composite74.children();
        examples.Composite composite77 = new examples.Composite((-3));
        examples.Composite composite79 = new examples.Composite((-3));
        examples.Composite composite81 = new examples.Composite((-3));
        examples.Composite composite83 = new examples.Composite((-3));
        composite81.addChild(composite83);
        examples.Composite[] compositeArray85 = new examples.Composite[] { composite77, composite79, composite81 };
        java.util.LinkedHashSet<examples.Composite> compositeSet86 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet86, compositeArray85);
        examples.Composite composite89 = new examples.Composite((-3));
        examples.Composite composite91 = new examples.Composite((-3));
        composite89.addChild(composite91);
        boolean boolean93 = compositeSet86.add(composite91);
        boolean boolean94 = compositeSet75.containsAll((java.util.Collection<examples.Composite>) compositeSet86);
        int int95 = compositeSet86.size();
        java.util.stream.Stream<examples.Composite> compositeStream96 = compositeSet86.parallelStream();
        boolean boolean97 = compositeSet71.retainAll((java.util.Collection<examples.Composite>) compositeSet86);
        boolean boolean98 = compositeSet66.containsAll((java.util.Collection<examples.Composite>) compositeSet71);
        boolean boolean99 = compositeSet2.contains((java.lang.Object) compositeSet66);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertNotNull(compositeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(compositeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(compositeItor48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(compositeSet66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(compositeStream68);
        org.junit.Assert.assertNotNull(compositeSet71);
        org.junit.Assert.assertNotNull(compositeSet75);
        org.junit.Assert.assertNotNull(compositeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 4 + "'", int95 == 4);
        org.junit.Assert.assertNotNull(compositeStream96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        examples.Composite composite23 = new examples.Composite((-3));
        examples.Composite composite25 = new examples.Composite((-3));
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite23, composite25, composite27 };
        java.util.LinkedHashSet<examples.Composite> compositeSet32 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet32, compositeArray31);
        examples.Composite composite35 = new examples.Composite((-3));
        examples.Composite composite37 = new examples.Composite((-3));
        composite35.addChild(composite37);
        boolean boolean39 = compositeSet32.add(composite37);
        boolean boolean40 = compositeSet13.add(composite37);
        examples.Composite composite42 = new examples.Composite((-3));
        examples.Composite composite44 = new examples.Composite((-3));
        composite42.addChild(composite44);
        java.util.Set<examples.Composite> compositeSet46 = composite44.children();
        int int47 = compositeSet46.size();
        boolean boolean48 = compositeSet13.removeAll((java.util.Collection<examples.Composite>) compositeSet46);
        examples.Composite composite50 = new examples.Composite((-3));
        examples.Composite composite52 = new examples.Composite((-3));
        composite50.addChild(composite52);
        java.util.Set<examples.Composite> compositeSet54 = composite52.children();
        int int55 = compositeSet54.size();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet54.iterator();
        boolean boolean57 = compositeSet46.containsAll((java.util.Collection<examples.Composite>) compositeSet54);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(compositeSet46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(compositeSet54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite[] compositeArray22 = new examples.Composite[] { composite14, composite16, composite18 };
        java.util.LinkedHashSet<examples.Composite> compositeSet23 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet23, compositeArray22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        boolean boolean30 = compositeSet23.add(composite28);
        examples.Composite[] compositeArray31 = new examples.Composite[] { composite10, composite28 };
        java.util.ArrayList<examples.Composite> compositeList32 = new java.util.ArrayList<examples.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList32, compositeArray31);
        boolean boolean34 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeList32);
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        compositeSet37.clear();
        boolean boolean39 = compositeSet5.remove((java.lang.Object) compositeSet37);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        examples.Composite[] compositeArray52 = new examples.Composite[] { composite44, composite46, composite48 };
        java.util.LinkedHashSet<examples.Composite> compositeSet53 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet53, compositeArray52);
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        composite56.addChild(composite58);
        boolean boolean60 = compositeSet53.add(composite58);
        boolean boolean61 = compositeSet42.containsAll((java.util.Collection<examples.Composite>) compositeSet53);
        int int62 = compositeSet53.size();
        boolean boolean64 = compositeSet53.contains((java.lang.Object) 7);
        boolean boolean65 = compositeSet5.removeAll((java.util.Collection<examples.Composite>) compositeSet53);
        java.lang.Class<?> wildcardClass66 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        compositeSet2.clear();
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray10 = compositeSet2.toArray(serializableArray9);
        java.lang.Object[] objArray11 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream12 = compositeSet2.parallelStream();
        java.util.Iterator<examples.Composite> compositeItor13 = compositeSet2.iterator();
        int int14 = compositeSet2.size();
        boolean boolean15 = compositeSet2.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertNotNull(compositeStream12);
        org.junit.Assert.assertNotNull(compositeItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Iterator<examples.Composite> compositeItor6 = compositeSet5.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream7 = compositeSet5.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeItor6);
        org.junit.Assert.assertNotNull(compositeStream7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        examples.Composite composite1 = new examples.Composite((-6));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        examples.Composite composite9 = new examples.Composite((-3));
        examples.Composite composite11 = new examples.Composite((-3));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite[] compositeArray15 = new examples.Composite[] { composite7, composite9, composite11 };
        java.util.LinkedHashSet<examples.Composite> compositeSet16 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet16, compositeArray15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        boolean boolean23 = compositeSet16.add(composite21);
        boolean boolean24 = compositeSet5.containsAll((java.util.Collection<examples.Composite>) compositeSet16);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        boolean boolean43 = compositeSet16.add(composite40);
        examples.Composite composite45 = new examples.Composite((-2));
        boolean boolean46 = compositeSet16.remove((java.lang.Object) composite45);
        composite1.addChild(composite45);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        int int24 = compositeSet23.size();
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        composite36.addChild(composite38);
        examples.Composite[] compositeArray40 = new examples.Composite[] { composite32, composite34, composite36 };
        java.util.LinkedHashSet<examples.Composite> compositeSet41 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet41, compositeArray40);
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        composite44.addChild(composite46);
        boolean boolean48 = compositeSet41.add(composite46);
        examples.Composite[] compositeArray49 = new examples.Composite[] { composite28, composite46 };
        java.util.ArrayList<examples.Composite> compositeList50 = new java.util.ArrayList<examples.Composite>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList50, compositeArray49);
        boolean boolean52 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeList50);
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        compositeSet55.clear();
        boolean boolean57 = compositeSet23.remove((java.lang.Object) compositeSet55);
        boolean boolean58 = compositeSet10.removeAll((java.util.Collection<examples.Composite>) compositeSet23);
        int int59 = compositeSet10.size();
        examples.Composite composite61 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet62 = composite61.children();
        examples.Composite composite64 = new examples.Composite((-3));
        examples.Composite composite66 = new examples.Composite((-3));
        examples.Composite composite68 = new examples.Composite((-3));
        examples.Composite composite70 = new examples.Composite((-3));
        composite68.addChild(composite70);
        examples.Composite[] compositeArray72 = new examples.Composite[] { composite64, composite66, composite68 };
        java.util.LinkedHashSet<examples.Composite> compositeSet73 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet73, compositeArray72);
        examples.Composite composite76 = new examples.Composite((-3));
        examples.Composite composite78 = new examples.Composite((-3));
        composite76.addChild(composite78);
        boolean boolean80 = compositeSet73.add(composite78);
        boolean boolean81 = compositeSet62.removeAll((java.util.Collection<examples.Composite>) compositeSet73);
        boolean boolean83 = compositeSet62.remove((java.lang.Object) (byte) 0);
        boolean boolean84 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet62);
        java.lang.Class<?> wildcardClass85 = compositeSet62.getClass();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(compositeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.Iterator<examples.Composite> compositeItor4 = compositeSet2.iterator();
        java.util.Iterator<examples.Composite> compositeItor5 = compositeSet2.iterator();
        java.util.stream.Stream<examples.Composite> compositeStream6 = compositeSet2.parallelStream();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        compositeSet9.clear();
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray17 = compositeSet9.toArray(serializableArray16);
        java.lang.Object[] objArray18 = compositeSet9.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream19 = compositeSet9.parallelStream();
        boolean boolean20 = compositeSet2.remove((java.lang.Object) compositeSet9);
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        compositeSet23.clear();
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray31 = compositeSet23.toArray(serializableArray30);
        examples.Composite composite33 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        examples.Composite composite36 = new examples.Composite((-3));
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        composite40.addChild(composite42);
        examples.Composite[] compositeArray44 = new examples.Composite[] { composite36, composite38, composite40 };
        java.util.LinkedHashSet<examples.Composite> compositeSet45 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet45, compositeArray44);
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        boolean boolean52 = compositeSet45.add(composite50);
        boolean boolean53 = compositeSet34.removeAll((java.util.Collection<examples.Composite>) compositeSet45);
        boolean boolean55 = compositeSet34.remove((java.lang.Object) (byte) 0);
        boolean boolean56 = compositeSet23.containsAll((java.util.Collection<examples.Composite>) compositeSet34);
        examples.Composite composite58 = new examples.Composite((-3));
        examples.Composite composite60 = new examples.Composite((-3));
        composite58.addChild(composite60);
        java.util.Set<examples.Composite> compositeSet62 = composite60.children();
        examples.Composite composite64 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet65 = composite64.children();
        java.util.Iterator<examples.Composite> compositeItor66 = compositeSet65.iterator();
        boolean boolean67 = compositeSet62.retainAll((java.util.Collection<examples.Composite>) compositeSet65);
        boolean boolean68 = compositeSet23.remove((java.lang.Object) boolean67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray72 = compositeSet23.toArray((java.lang.Comparable<java.lang.String>[]) strArray71);
        java.lang.String[] strArray73 = compositeSet2.toArray(strArray71);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeItor4);
        org.junit.Assert.assertNotNull(compositeItor5);
        org.junit.Assert.assertNotNull(compositeStream6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertNotNull(compositeStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(serializableArray30);
        org.junit.Assert.assertNotNull(serializableArray31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(compositeSet62);
        org.junit.Assert.assertNotNull(compositeSet65);
        org.junit.Assert.assertNotNull(compositeItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strComparableArray72);
        org.junit.Assert.assertNotNull(strArray73);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.containsAll((java.util.Collection<examples.Composite>) compositeSet13);
        java.util.Iterator<examples.Composite> compositeItor22 = compositeSet13.iterator();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        examples.Composite composite29 = new examples.Composite((-3));
        examples.Composite composite31 = new examples.Composite((-3));
        examples.Composite composite33 = new examples.Composite((-3));
        composite31.addChild(composite33);
        examples.Composite[] compositeArray35 = new examples.Composite[] { composite27, composite29, composite31 };
        java.util.LinkedHashSet<examples.Composite> compositeSet36 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet36, compositeArray35);
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        boolean boolean43 = compositeSet36.add(composite41);
        boolean boolean44 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet36);
        boolean boolean45 = compositeSet13.contains((java.lang.Object) compositeSet25);
        java.util.stream.Stream<examples.Composite> compositeStream46 = compositeSet25.parallelStream();
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite50.children();
        examples.Composite composite54 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet55 = composite54.children();
        java.util.Iterator<examples.Composite> compositeItor56 = compositeSet55.iterator();
        boolean boolean57 = compositeSet52.retainAll((java.util.Collection<examples.Composite>) compositeSet55);
        int int58 = compositeSet55.size();
        compositeSet55.clear();
        boolean boolean60 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet55);
        examples.Composite composite62 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet63 = composite62.children();
        boolean boolean64 = compositeSet55.retainAll((java.util.Collection<examples.Composite>) compositeSet63);
        java.util.Iterator<examples.Composite> compositeItor65 = compositeSet55.iterator();
        compositeSet55.clear();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compositeItor22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeStream46);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet55);
        org.junit.Assert.assertNotNull(compositeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(compositeSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(compositeItor65);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        int int6 = compositeSet5.size();
        boolean boolean7 = compositeSet5.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        examples.Composite composite19 = new examples.Composite((int) ' ');
        boolean boolean20 = compositeSet10.add(composite19);
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.lang.Object[] objArray24 = compositeSet23.toArray();
        java.util.Iterator<examples.Composite> compositeItor25 = compositeSet23.iterator();
        java.util.Iterator<examples.Composite> compositeItor26 = compositeSet23.iterator();
        examples.Composite composite28 = new examples.Composite((-2));
        boolean boolean29 = compositeSet23.add(composite28);
        composite19.addChild(composite28);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertNotNull(compositeItor25);
        org.junit.Assert.assertNotNull(compositeItor26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        examples.Composite composite12 = new examples.Composite((-3));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite[] compositeArray16 = new examples.Composite[] { composite8, composite10, composite12 };
        java.util.LinkedHashSet<examples.Composite> compositeSet17 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet17, compositeArray16);
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet17.add(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        composite30.addChild(composite32);
        examples.Composite[] compositeArray34 = new examples.Composite[] { composite26, composite28, composite30 };
        java.util.LinkedHashSet<examples.Composite> compositeSet35 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet35, compositeArray34);
        examples.Composite composite38 = new examples.Composite((-3));
        examples.Composite composite40 = new examples.Composite((-3));
        composite38.addChild(composite40);
        boolean boolean42 = compositeSet35.add(composite40);
        java.util.Iterator<examples.Composite> compositeItor43 = compositeSet35.iterator();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        composite45.addChild(composite47);
        boolean boolean49 = compositeSet35.remove((java.lang.Object) composite47);
        examples.Composite[] compositeArray50 = new examples.Composite[] { composite1, composite5, composite22, composite47 };
        java.util.LinkedHashSet<examples.Composite> compositeSet51 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet51, compositeArray50);
        boolean boolean54 = compositeSet51.remove((java.lang.Object) 10.0f);
        java.io.Serializable[][] serializableArray55 = new java.io.Serializable[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray56 = compositeSet51.toArray(serializableArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: examples.Composite");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(compositeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(compositeItor43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(compositeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(serializableArray55);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        int int19 = compositeSet10.size();
        examples.Composite composite21 = new examples.Composite((-3));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        examples.Composite[] compositeArray25 = new examples.Composite[] { composite21 };
        java.util.LinkedHashSet<examples.Composite> compositeSet26 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet26, compositeArray25);
        boolean boolean29 = compositeSet26.remove((java.lang.Object) (-6.9d));
        boolean boolean30 = compositeSet10.retainAll((java.util.Collection<examples.Composite>) compositeSet26);
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        int int37 = compositeSet36.size();
        examples.Composite composite39 = new examples.Composite((-3));
        examples.Composite composite41 = new examples.Composite((-3));
        composite39.addChild(composite41);
        java.util.Set<examples.Composite> compositeSet43 = composite41.children();
        examples.Composite composite45 = new examples.Composite((-3));
        examples.Composite composite47 = new examples.Composite((-3));
        examples.Composite composite49 = new examples.Composite((-3));
        examples.Composite composite51 = new examples.Composite((-3));
        composite49.addChild(composite51);
        examples.Composite[] compositeArray53 = new examples.Composite[] { composite45, composite47, composite49 };
        java.util.LinkedHashSet<examples.Composite> compositeSet54 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet54, compositeArray53);
        examples.Composite composite57 = new examples.Composite((-3));
        examples.Composite composite59 = new examples.Composite((-3));
        composite57.addChild(composite59);
        boolean boolean61 = compositeSet54.add(composite59);
        examples.Composite[] compositeArray62 = new examples.Composite[] { composite41, composite59 };
        java.util.ArrayList<examples.Composite> compositeList63 = new java.util.ArrayList<examples.Composite>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeList63, compositeArray62);
        boolean boolean65 = compositeSet36.containsAll((java.util.Collection<examples.Composite>) compositeList63);
        examples.Composite composite67 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet68 = composite67.children();
        compositeSet68.clear();
        boolean boolean70 = compositeSet36.remove((java.lang.Object) compositeSet68);
        boolean boolean71 = compositeSet10.addAll((java.util.Collection<examples.Composite>) compositeSet68);
        java.util.stream.Stream<examples.Composite> compositeStream72 = compositeSet10.parallelStream();
        java.util.stream.Stream<examples.Composite> compositeStream73 = compositeSet10.parallelStream();
        java.util.stream.Stream<examples.Composite> compositeStream74 = compositeSet10.parallelStream();
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(compositeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(compositeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(compositeSet68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(compositeStream72);
        org.junit.Assert.assertNotNull(compositeStream73);
        org.junit.Assert.assertNotNull(compositeStream74);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        examples.Composite composite5 = new examples.Composite((-3));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite[] compositeArray9 = new examples.Composite[] { composite1, composite3, composite5 };
        java.util.LinkedHashSet<examples.Composite> compositeSet10 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet10, compositeArray9);
        examples.Composite composite13 = new examples.Composite((-3));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        boolean boolean17 = compositeSet10.add(composite15);
        java.util.Iterator<examples.Composite> compositeItor18 = compositeSet10.iterator();
        examples.Composite composite20 = new examples.Composite((-3));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        boolean boolean24 = compositeSet10.remove((java.lang.Object) composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        boolean boolean27 = compositeSet25.remove((java.lang.Object) 1L);
        java.lang.Object[] objArray28 = compositeSet25.toArray();
        examples.Composite composite30 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        compositeSet31.clear();
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] { (-4), (-9L), (byte) 100, (-4L), 0L };
        java.io.Serializable[] serializableArray39 = compositeSet31.toArray(serializableArray38);
        examples.Composite composite41 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        examples.Composite composite44 = new examples.Composite((-3));
        examples.Composite composite46 = new examples.Composite((-3));
        examples.Composite composite48 = new examples.Composite((-3));
        examples.Composite composite50 = new examples.Composite((-3));
        composite48.addChild(composite50);
        examples.Composite[] compositeArray52 = new examples.Composite[] { composite44, composite46, composite48 };
        java.util.LinkedHashSet<examples.Composite> compositeSet53 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet53, compositeArray52);
        examples.Composite composite56 = new examples.Composite((-3));
        examples.Composite composite58 = new examples.Composite((-3));
        composite56.addChild(composite58);
        boolean boolean60 = compositeSet53.add(composite58);
        boolean boolean61 = compositeSet42.removeAll((java.util.Collection<examples.Composite>) compositeSet53);
        boolean boolean63 = compositeSet42.remove((java.lang.Object) (byte) 0);
        boolean boolean64 = compositeSet31.containsAll((java.util.Collection<examples.Composite>) compositeSet42);
        int int65 = compositeSet42.size();
        boolean boolean66 = compositeSet25.containsAll((java.util.Collection<examples.Composite>) compositeSet42);
        org.junit.Assert.assertNotNull(compositeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(compositeItor18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(serializableArray39);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Object[] objArray3 = compositeSet2.toArray();
        java.util.stream.Stream<examples.Composite> compositeStream4 = compositeSet2.parallelStream();
        boolean boolean5 = compositeSet2.isEmpty();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertNotNull(compositeStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        boolean boolean8 = compositeSet7.isEmpty();
        java.util.stream.Stream<examples.Composite> compositeStream9 = compositeSet7.parallelStream();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(compositeStream9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        examples.Composite composite6 = new examples.Composite((-3));
        examples.Composite composite8 = new examples.Composite((-3));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite[] compositeArray12 = new examples.Composite[] { composite4, composite6, composite8 };
        java.util.LinkedHashSet<examples.Composite> compositeSet13 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet13, compositeArray12);
        examples.Composite composite16 = new examples.Composite((-3));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        boolean boolean20 = compositeSet13.add(composite18);
        boolean boolean21 = compositeSet2.removeAll((java.util.Collection<examples.Composite>) compositeSet13);
        boolean boolean23 = compositeSet2.remove((java.lang.Object) (byte) 0);
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((-3));
        examples.Composite composite30 = new examples.Composite((-3));
        examples.Composite composite32 = new examples.Composite((-3));
        examples.Composite composite34 = new examples.Composite((-3));
        composite32.addChild(composite34);
        examples.Composite[] compositeArray36 = new examples.Composite[] { composite28, composite30, composite32 };
        java.util.LinkedHashSet<examples.Composite> compositeSet37 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet37, compositeArray36);
        examples.Composite composite40 = new examples.Composite((-3));
        examples.Composite composite42 = new examples.Composite((-3));
        composite40.addChild(composite42);
        boolean boolean44 = compositeSet37.add(composite42);
        boolean boolean45 = compositeSet26.containsAll((java.util.Collection<examples.Composite>) compositeSet37);
        examples.Composite composite47 = new examples.Composite((-3));
        examples.Composite composite49 = new examples.Composite((-3));
        examples.Composite composite51 = new examples.Composite((-3));
        examples.Composite composite53 = new examples.Composite((-3));
        composite51.addChild(composite53);
        examples.Composite[] compositeArray55 = new examples.Composite[] { composite47, composite49, composite51 };
        java.util.LinkedHashSet<examples.Composite> compositeSet56 = new java.util.LinkedHashSet<examples.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.Composite>) compositeSet56, compositeArray55);
        examples.Composite composite59 = new examples.Composite((-3));
        examples.Composite composite61 = new examples.Composite((-3));
        composite59.addChild(composite61);
        boolean boolean63 = compositeSet56.add(composite61);
        boolean boolean64 = compositeSet37.add(composite61);
        boolean boolean65 = compositeSet2.retainAll((java.util.Collection<examples.Composite>) compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(compositeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }
}

