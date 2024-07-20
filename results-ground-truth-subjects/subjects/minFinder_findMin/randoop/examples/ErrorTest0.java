package examples;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder10.chval(t12, 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t5 = new examples.MinFinder.T((-3));
        int int6 = t5.getVal();
        examples.MinFinder.T[] tArray7 = new examples.MinFinder.T[] { t1, t3, t5 };
        java.util.ArrayList<examples.MinFinder.T> tList8 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList8, tArray7);
        examples.MinFinder minFinder10 = new examples.MinFinder(tList8);
        examples.MinFinder.T t12 = new examples.MinFinder.T((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder10.chval(t12, (int) (short) 100);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList34);
        examples.MinFinder.T t40 = minFinder39.findmin();
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        minFinder39.add(t42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder19.chval(t42, 4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        examples.MinFinder minFinder20 = new examples.MinFinder(tList3);
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder20.chval(t22, 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        boolean boolean19 = tList3.isEmpty();
        java.util.ArrayList<examples.MinFinder.T> tList20 = new java.util.ArrayList<examples.MinFinder.T>((java.util.Collection<examples.MinFinder.T>) tList3);
        examples.MinFinder minFinder21 = new examples.MinFinder(tList3);
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray24 = new examples.MinFinder.T[] { t23 };
        java.util.ArrayList<examples.MinFinder.T> tList25 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList25, tArray24);
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray35 = new examples.MinFinder.T[] { t28, t30, t32, t34 };
        java.util.ArrayList<examples.MinFinder.T> tList36 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList36, tArray35);
        java.util.ListIterator<examples.MinFinder.T> tItor38 = tList36.listIterator();
        tList36.trimToSize();
        boolean boolean40 = tList25.addAll((java.util.Collection<examples.MinFinder.T>) tList36);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = tList25.set(2, t43);
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = tList25.set(3, t47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder21.chval(t47, 97);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray2 = new examples.MinFinder.T[] { t1 };
        java.util.ArrayList<examples.MinFinder.T> tList3 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList3, tArray2);
        examples.MinFinder.T t6 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t8 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray13 = new examples.MinFinder.T[] { t6, t8, t10, t12 };
        java.util.ArrayList<examples.MinFinder.T> tList14 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList14, tArray13);
        java.util.ListIterator<examples.MinFinder.T> tItor16 = tList14.listIterator();
        tList14.trimToSize();
        boolean boolean18 = tList3.addAll((java.util.Collection<examples.MinFinder.T>) tList14);
        examples.MinFinder minFinder19 = new examples.MinFinder(tList14);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t21 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T[] tArray33 = new examples.MinFinder.T[] { t26, t28, t30, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList34 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList34, tArray33);
        java.util.ListIterator<examples.MinFinder.T> tItor36 = tList34.listIterator();
        tList34.trimToSize();
        boolean boolean38 = tList23.addAll((java.util.Collection<examples.MinFinder.T>) tList34);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = tList23.set(2, t41);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t46 = tList23.set(3, t45);
        int int47 = t45.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder19.chval(t45, 1);
    }
}

