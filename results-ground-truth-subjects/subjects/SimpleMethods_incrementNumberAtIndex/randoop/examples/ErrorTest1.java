package examples;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods6.incrementNumberAtIndex(intArray23, 1);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods6.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, (int) (byte) 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray41, (-10));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods6.incrementNumberAtIndex(intArray23, 1);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods6.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        int[] intArray49 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods38.incrementNumberAtIndex(intArray49, 4);
        simpleMethods0.incrementNumberAtIndex(intArray49, 2);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        int[] intArray57 = new int[] { 9, (-10) };
        simpleMethods54.incrementNumberAtIndex(intArray57, 0);
        int[] intArray65 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods54.incrementNumberAtIndex(intArray65, 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray65, (-9));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods22.incrementNumberAtIndex(intArray47, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray47, (int) ' ');
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        int[] intArray22 = new int[] { 9, (-10) };
        simpleMethods19.incrementNumberAtIndex(intArray22, 0);
        simpleMethods13.incrementNumberAtIndex(intArray22, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods13.incrementNumberAtIndex(intArray30, 1);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods13.incrementNumberAtIndex(intArray38, 0);
        simpleMethods7.incrementNumberAtIndex(intArray38, 0);
        simpleMethods6.incrementNumberAtIndex(intArray38, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        int[] intArray56 = new int[] { 9, (-10) };
        simpleMethods53.incrementNumberAtIndex(intArray56, 0);
        simpleMethods47.incrementNumberAtIndex(intArray56, 0);
        simpleMethods6.incrementNumberAtIndex(intArray56, 1);
        simpleMethods0.incrementNumberAtIndex(intArray56, 0);
        int[] intArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray65, (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        simpleMethods1.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        int[] intArray26 = new int[] { 9, (-10) };
        simpleMethods23.incrementNumberAtIndex(intArray26, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods23.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray32, (-3));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        simpleMethods0.incrementNumberAtIndex(intArray50, 1);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        simpleMethods57.incrementNumberAtIndex(intArray66, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        simpleMethods57.incrementNumberAtIndex(intArray74, 1);
        simpleMethods0.incrementNumberAtIndex(intArray74, (int) (short) 0);
        int[] intArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray81, (-3));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        int[] intArray11 = new int[] { 9, (-10) };
        simpleMethods8.incrementNumberAtIndex(intArray11, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods14.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods14.incrementNumberAtIndex(intArray31, 1);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods14.incrementNumberAtIndex(intArray39, 0);
        simpleMethods8.incrementNumberAtIndex(intArray39, 0);
        simpleMethods7.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        int[] intArray51 = new int[] { 9, (-10) };
        simpleMethods48.incrementNumberAtIndex(intArray51, 0);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        int[] intArray57 = new int[] { 9, (-10) };
        simpleMethods54.incrementNumberAtIndex(intArray57, 0);
        simpleMethods48.incrementNumberAtIndex(intArray57, 0);
        simpleMethods7.incrementNumberAtIndex(intArray57, 1);
        simpleMethods1.incrementNumberAtIndex(intArray57, 0);
        simpleMethods0.incrementNumberAtIndex(intArray57, 1);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        simpleMethods68.incrementNumberAtIndex(intArray77, 0);
        examples.SimpleMethods simpleMethods82 = new examples.SimpleMethods();
        int[] intArray85 = new int[] { 9, (-10) };
        simpleMethods82.incrementNumberAtIndex(intArray85, 0);
        simpleMethods68.incrementNumberAtIndex(intArray85, 1);
        simpleMethods0.incrementNumberAtIndex(intArray85, (int) (byte) 1);
        examples.SimpleMethods simpleMethods92 = new examples.SimpleMethods();
        int[] intArray95 = new int[] { 9, (-10) };
        simpleMethods92.incrementNumberAtIndex(intArray95, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray95, (int) (byte) 100);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods44.incrementNumberAtIndex(intArray61, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods44.incrementNumberAtIndex(intArray69, 0);
        int[] intArray78 = new int[] { (short) 1, (-10), 9, (byte) 0 };
        simpleMethods44.incrementNumberAtIndex(intArray78, 0);
        simpleMethods22.incrementNumberAtIndex(intArray78, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray78, (int) (short) 0);
        int[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, (int) 'a');
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        int[] intArray27 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray27, (int) (byte) 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        int[] intArray48 = new int[] { 9, (-10) };
        simpleMethods45.incrementNumberAtIndex(intArray48, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        int[] intArray54 = new int[] { 9, (-10) };
        simpleMethods51.incrementNumberAtIndex(intArray54, 0);
        simpleMethods45.incrementNumberAtIndex(intArray54, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        simpleMethods45.incrementNumberAtIndex(intArray62, 1);
        examples.SimpleMethods simpleMethods67 = new examples.SimpleMethods();
        int[] intArray70 = new int[] { 9, (-10) };
        simpleMethods67.incrementNumberAtIndex(intArray70, 0);
        simpleMethods45.incrementNumberAtIndex(intArray70, 0);
        examples.SimpleMethods simpleMethods75 = new examples.SimpleMethods();
        int[] intArray78 = new int[] { 9, (-10) };
        simpleMethods75.incrementNumberAtIndex(intArray78, 0);
        examples.SimpleMethods simpleMethods81 = new examples.SimpleMethods();
        int[] intArray84 = new int[] { 9, (-10) };
        simpleMethods81.incrementNumberAtIndex(intArray84, 0);
        simpleMethods75.incrementNumberAtIndex(intArray84, 0);
        simpleMethods45.incrementNumberAtIndex(intArray84, 1);
        simpleMethods44.incrementNumberAtIndex(intArray84, 0);
        simpleMethods30.incrementNumberAtIndex(intArray84, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray84, (int) (short) 0);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray97, 100);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods15.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods15.incrementNumberAtIndex(intArray32, 1);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods43.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods43.incrementNumberAtIndex(intArray60, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods43.incrementNumberAtIndex(intArray68, 0);
        simpleMethods37.incrementNumberAtIndex(intArray68, 0);
        simpleMethods15.incrementNumberAtIndex(intArray68, 1);
        simpleMethods1.incrementNumberAtIndex(intArray68, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray68, (int) (short) 1);
        examples.SimpleMethods simpleMethods81 = new examples.SimpleMethods();
        int[] intArray84 = new int[] { 9, (-10) };
        simpleMethods81.incrementNumberAtIndex(intArray84, 0);
        int[] intArray92 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods81.incrementNumberAtIndex(intArray92, 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray92, (int) (short) 100);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods41.incrementNumberAtIndex(intArray58, 1);
        simpleMethods0.incrementNumberAtIndex(intArray58, (int) (short) 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        simpleMethods65.incrementNumberAtIndex(intArray74, 0);
        examples.SimpleMethods simpleMethods79 = new examples.SimpleMethods();
        int[] intArray82 = new int[] { 9, (-10) };
        simpleMethods79.incrementNumberAtIndex(intArray82, 0);
        simpleMethods65.incrementNumberAtIndex(intArray82, 1);
        simpleMethods0.incrementNumberAtIndex(intArray82, 1);
        examples.SimpleMethods simpleMethods89 = new examples.SimpleMethods();
        int[] intArray92 = new int[] { 9, (-10) };
        simpleMethods89.incrementNumberAtIndex(intArray92, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray92, (int) (short) 10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        int[] intArray51 = new int[] { 9, (-10) };
        simpleMethods48.incrementNumberAtIndex(intArray51, 0);
        simpleMethods42.incrementNumberAtIndex(intArray51, 0);
        simpleMethods36.incrementNumberAtIndex(intArray51, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        int[] intArray67 = new int[] { 9, (-10) };
        simpleMethods64.incrementNumberAtIndex(intArray67, 0);
        simpleMethods58.incrementNumberAtIndex(intArray67, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        int[] intArray75 = new int[] { 9, (-10) };
        simpleMethods72.incrementNumberAtIndex(intArray75, 0);
        simpleMethods58.incrementNumberAtIndex(intArray75, 1);
        simpleMethods36.incrementNumberAtIndex(intArray75, 0);
        simpleMethods30.incrementNumberAtIndex(intArray75, 1);
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 1);
        int[] intArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray86, (int) (short) 10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        int[] intArray33 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods22.incrementNumberAtIndex(intArray33, 4);
        simpleMethods0.incrementNumberAtIndex(intArray33, (int) (byte) 0);
        int[] intArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray38, 3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods41.incrementNumberAtIndex(intArray58, 1);
        simpleMethods0.incrementNumberAtIndex(intArray58, (int) (short) 1);
        int[] intArray66 = new int[] { (-2) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray66, (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, (int) (byte) 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        int[] intArray34 = new int[] { 9, (-10) };
        simpleMethods31.incrementNumberAtIndex(intArray34, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        simpleMethods37.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        int[] intArray54 = new int[] { 9, (-10) };
        simpleMethods51.incrementNumberAtIndex(intArray54, 0);
        simpleMethods37.incrementNumberAtIndex(intArray54, 1);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        simpleMethods37.incrementNumberAtIndex(intArray62, 0);
        simpleMethods31.incrementNumberAtIndex(intArray62, 0);
        simpleMethods30.incrementNumberAtIndex(intArray62, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        examples.SimpleMethods simpleMethods77 = new examples.SimpleMethods();
        int[] intArray80 = new int[] { 9, (-10) };
        simpleMethods77.incrementNumberAtIndex(intArray80, 0);
        simpleMethods71.incrementNumberAtIndex(intArray80, 0);
        examples.SimpleMethods simpleMethods85 = new examples.SimpleMethods();
        int[] intArray88 = new int[] { 9, (-10) };
        simpleMethods85.incrementNumberAtIndex(intArray88, 0);
        simpleMethods71.incrementNumberAtIndex(intArray88, 1);
        simpleMethods30.incrementNumberAtIndex(intArray88, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray88, (int) (byte) 10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        int[] intArray22 = new int[] { 9, (-10) };
        simpleMethods19.incrementNumberAtIndex(intArray22, 0);
        simpleMethods13.incrementNumberAtIndex(intArray22, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods13.incrementNumberAtIndex(intArray30, 1);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods13.incrementNumberAtIndex(intArray38, 0);
        simpleMethods7.incrementNumberAtIndex(intArray38, 0);
        simpleMethods6.incrementNumberAtIndex(intArray38, 0);
        simpleMethods0.incrementNumberAtIndex(intArray38, (int) (short) 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        int[] intArray59 = new int[] { 9, (-10) };
        simpleMethods56.incrementNumberAtIndex(intArray59, 0);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        simpleMethods56.incrementNumberAtIndex(intArray65, 0);
        simpleMethods50.incrementNumberAtIndex(intArray65, 0);
        int[] intArray77 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods50.incrementNumberAtIndex(intArray77, (int) (byte) 1);
        simpleMethods49.incrementNumberAtIndex(intArray77, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray77, (-2));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods41.incrementNumberAtIndex(intArray58, 1);
        simpleMethods0.incrementNumberAtIndex(intArray58, (int) (short) 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        simpleMethods65.incrementNumberAtIndex(intArray74, 0);
        examples.SimpleMethods simpleMethods79 = new examples.SimpleMethods();
        int[] intArray82 = new int[] { 9, (-10) };
        simpleMethods79.incrementNumberAtIndex(intArray82, 0);
        simpleMethods65.incrementNumberAtIndex(intArray82, 1);
        simpleMethods0.incrementNumberAtIndex(intArray82, 1);
        int[] intArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray89, 10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods21.incrementNumberAtIndex(intArray30, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods21.incrementNumberAtIndex(intArray38, 1);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        simpleMethods21.incrementNumberAtIndex(intArray46, 0);
        simpleMethods15.incrementNumberAtIndex(intArray46, 0);
        simpleMethods14.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        int[] intArray66 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods55.incrementNumberAtIndex(intArray66, 4);
        simpleMethods14.incrementNumberAtIndex(intArray66, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        int[] intArray82 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods71.incrementNumberAtIndex(intArray82, 4);
        simpleMethods14.incrementNumberAtIndex(intArray82, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray82, (int) (byte) 10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods44.incrementNumberAtIndex(intArray61, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods44.incrementNumberAtIndex(intArray69, 0);
        int[] intArray78 = new int[] { (short) 1, (-10), 9, (byte) 0 };
        simpleMethods44.incrementNumberAtIndex(intArray78, 0);
        simpleMethods22.incrementNumberAtIndex(intArray78, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray78, (int) (short) 0);
        int[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, (-2));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        simpleMethods0.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods46.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        simpleMethods46.incrementNumberAtIndex(intArray63, 1);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        simpleMethods46.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        int[] intArray79 = new int[] { 9, (-10) };
        simpleMethods76.incrementNumberAtIndex(intArray79, 0);
        examples.SimpleMethods simpleMethods82 = new examples.SimpleMethods();
        int[] intArray85 = new int[] { 9, (-10) };
        simpleMethods82.incrementNumberAtIndex(intArray85, 0);
        simpleMethods76.incrementNumberAtIndex(intArray85, 0);
        simpleMethods46.incrementNumberAtIndex(intArray85, 0);
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int[] intArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray94, 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        simpleMethods0.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods46.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        simpleMethods46.incrementNumberAtIndex(intArray63, 1);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        simpleMethods46.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray71, (-10));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, (int) (byte) 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods36.incrementNumberAtIndex(intArray45, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods36.incrementNumberAtIndex(intArray53, 1);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods36.incrementNumberAtIndex(intArray61, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        int[] intArray75 = new int[] { 9, (-10) };
        simpleMethods72.incrementNumberAtIndex(intArray75, 0);
        simpleMethods66.incrementNumberAtIndex(intArray75, 0);
        simpleMethods36.incrementNumberAtIndex(intArray75, 0);
        simpleMethods30.incrementNumberAtIndex(intArray75, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray75, 7);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        simpleMethods1.incrementNumberAtIndex(intArray18, 1);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        int[] intArray26 = new int[] { 9, (-10) };
        simpleMethods23.incrementNumberAtIndex(intArray26, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods29.incrementNumberAtIndex(intArray38, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        simpleMethods29.incrementNumberAtIndex(intArray46, 1);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        int[] intArray54 = new int[] { 9, (-10) };
        simpleMethods51.incrementNumberAtIndex(intArray54, 0);
        simpleMethods29.incrementNumberAtIndex(intArray54, 0);
        simpleMethods23.incrementNumberAtIndex(intArray54, 0);
        simpleMethods1.incrementNumberAtIndex(intArray54, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray54, (int) ' ');
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods14.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods28.incrementNumberAtIndex(intArray37, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods28.incrementNumberAtIndex(intArray45, 1);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods28.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        int[] intArray67 = new int[] { 9, (-10) };
        simpleMethods64.incrementNumberAtIndex(intArray67, 0);
        simpleMethods58.incrementNumberAtIndex(intArray67, 0);
        simpleMethods28.incrementNumberAtIndex(intArray67, 0);
        simpleMethods14.incrementNumberAtIndex(intArray67, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray67, (int) (short) 100);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods14.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods14.incrementNumberAtIndex(intArray31, 1);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods14.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        simpleMethods14.incrementNumberAtIndex(intArray53, 0);
        simpleMethods0.incrementNumberAtIndex(intArray53, 1);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        simpleMethods62.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        int[] intArray79 = new int[] { 9, (-10) };
        simpleMethods76.incrementNumberAtIndex(intArray79, 0);
        simpleMethods62.incrementNumberAtIndex(intArray79, 1);
        simpleMethods0.incrementNumberAtIndex(intArray79, 0);
        examples.SimpleMethods simpleMethods86 = new examples.SimpleMethods();
        int[] intArray89 = new int[] { 9, (-10) };
        simpleMethods86.incrementNumberAtIndex(intArray89, 0);
        simpleMethods0.incrementNumberAtIndex(intArray89, 0);
        int[] intArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray94, 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods22.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods52.incrementNumberAtIndex(intArray61, 0);
        simpleMethods22.incrementNumberAtIndex(intArray61, 0);
        simpleMethods0.incrementNumberAtIndex(intArray61, (int) (byte) 1);
        int[] intArray71 = new int[] { '#' };
        simpleMethods0.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        examples.SimpleMethods simpleMethods80 = new examples.SimpleMethods();
        int[] intArray83 = new int[] { 9, (-10) };
        simpleMethods80.incrementNumberAtIndex(intArray83, 0);
        simpleMethods74.incrementNumberAtIndex(intArray83, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray83, (int) '4');
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        int[] intArray21 = new int[] { 9, (-10) };
        simpleMethods18.incrementNumberAtIndex(intArray21, 0);
        simpleMethods12.incrementNumberAtIndex(intArray21, 0);
        simpleMethods6.incrementNumberAtIndex(intArray21, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods28.incrementNumberAtIndex(intArray37, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods28.incrementNumberAtIndex(intArray45, 1);
        simpleMethods6.incrementNumberAtIndex(intArray45, 0);
        simpleMethods0.incrementNumberAtIndex(intArray45, 1);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        int[] intArray57 = new int[] { 9, (-10) };
        simpleMethods54.incrementNumberAtIndex(intArray57, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods60.incrementNumberAtIndex(intArray69, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        simpleMethods60.incrementNumberAtIndex(intArray77, 1);
        examples.SimpleMethods simpleMethods82 = new examples.SimpleMethods();
        int[] intArray85 = new int[] { 9, (-10) };
        simpleMethods82.incrementNumberAtIndex(intArray85, 0);
        simpleMethods60.incrementNumberAtIndex(intArray85, 0);
        simpleMethods54.incrementNumberAtIndex(intArray85, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, (-10));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        simpleMethods35.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods35.incrementNumberAtIndex(intArray52, 1);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods35.incrementNumberAtIndex(intArray60, 0);
        simpleMethods29.incrementNumberAtIndex(intArray60, 0);
        simpleMethods28.incrementNumberAtIndex(intArray60, 0);
        simpleMethods22.incrementNumberAtIndex(intArray60, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray60, (int) (short) 1);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        int[] intArray76 = new int[] { 9, (-10) };
        simpleMethods73.incrementNumberAtIndex(intArray76, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray76, (-3));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        simpleMethods1.incrementNumberAtIndex(intArray18, 1);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        int[] intArray26 = new int[] { 9, (-10) };
        simpleMethods23.incrementNumberAtIndex(intArray26, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods23.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        simpleMethods23.incrementNumberAtIndex(intArray40, 1);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        int[] intArray48 = new int[] { 9, (-10) };
        simpleMethods45.incrementNumberAtIndex(intArray48, 0);
        simpleMethods23.incrementNumberAtIndex(intArray48, 0);
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        int[] intArray56 = new int[] { 9, (-10) };
        simpleMethods53.incrementNumberAtIndex(intArray56, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        simpleMethods53.incrementNumberAtIndex(intArray62, 0);
        simpleMethods23.incrementNumberAtIndex(intArray62, 0);
        simpleMethods1.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray62, 0);
        int[] intArray79 = new int[] { 9, 8, (-1), 100, 5, 8 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray79, (-6));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods28.incrementNumberAtIndex(intArray37, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods28.incrementNumberAtIndex(intArray45, 1);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods28.incrementNumberAtIndex(intArray53, 0);
        simpleMethods22.incrementNumberAtIndex(intArray53, 0);
        simpleMethods0.incrementNumberAtIndex(intArray53, 1);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        simpleMethods68.incrementNumberAtIndex(intArray77, 0);
        simpleMethods62.incrementNumberAtIndex(intArray77, 0);
        simpleMethods0.incrementNumberAtIndex(intArray77, 1);
        int[] intArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray86, (int) (byte) -1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        int[] intArray27 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray27, (int) (byte) 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods30.incrementNumberAtIndex(intArray47, 1);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods30.incrementNumberAtIndex(intArray55, 0);
        simpleMethods0.incrementNumberAtIndex(intArray55, 1);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        int[] intArray72 = new int[] { 9, (-10) };
        simpleMethods69.incrementNumberAtIndex(intArray72, 0);
        examples.SimpleMethods simpleMethods75 = new examples.SimpleMethods();
        int[] intArray78 = new int[] { 9, (-10) };
        simpleMethods75.incrementNumberAtIndex(intArray78, 0);
        simpleMethods69.incrementNumberAtIndex(intArray78, 0);
        simpleMethods63.incrementNumberAtIndex(intArray78, 0);
        int[] intArray90 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods63.incrementNumberAtIndex(intArray90, (int) (byte) 1);
        simpleMethods62.incrementNumberAtIndex(intArray90, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray90, 6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        int[] intArray51 = new int[] { 9, (-10) };
        simpleMethods48.incrementNumberAtIndex(intArray51, 0);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        int[] intArray57 = new int[] { 9, (-10) };
        simpleMethods54.incrementNumberAtIndex(intArray57, 0);
        simpleMethods48.incrementNumberAtIndex(intArray57, 0);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        simpleMethods48.incrementNumberAtIndex(intArray65, 1);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        int[] intArray73 = new int[] { 9, (-10) };
        simpleMethods70.incrementNumberAtIndex(intArray73, 0);
        simpleMethods48.incrementNumberAtIndex(intArray73, 0);
        simpleMethods42.incrementNumberAtIndex(intArray73, 0);
        simpleMethods41.incrementNumberAtIndex(intArray73, 0);
        examples.SimpleMethods simpleMethods82 = new examples.SimpleMethods();
        int[] intArray85 = new int[] { 9, (-10) };
        simpleMethods82.incrementNumberAtIndex(intArray85, 0);
        int[] intArray93 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods82.incrementNumberAtIndex(intArray93, 4);
        simpleMethods41.incrementNumberAtIndex(intArray93, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray93, 5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        simpleMethods1.incrementNumberAtIndex(intArray16, 0);
        int[] intArray28 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods1.incrementNumberAtIndex(intArray28, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray28, 0);
        examples.SimpleMethods simpleMethods33 = new examples.SimpleMethods();
        int[] intArray36 = new int[] { 9, (-10) };
        simpleMethods33.incrementNumberAtIndex(intArray36, 0);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        int[] intArray42 = new int[] { 9, (-10) };
        simpleMethods39.incrementNumberAtIndex(intArray42, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        int[] intArray48 = new int[] { 9, (-10) };
        simpleMethods45.incrementNumberAtIndex(intArray48, 0);
        simpleMethods39.incrementNumberAtIndex(intArray48, 0);
        simpleMethods33.incrementNumberAtIndex(intArray48, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        int[] intArray64 = new int[] { 9, (-10) };
        simpleMethods61.incrementNumberAtIndex(intArray64, 0);
        simpleMethods55.incrementNumberAtIndex(intArray64, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        int[] intArray72 = new int[] { 9, (-10) };
        simpleMethods69.incrementNumberAtIndex(intArray72, 0);
        simpleMethods55.incrementNumberAtIndex(intArray72, 1);
        simpleMethods33.incrementNumberAtIndex(intArray72, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray72, (int) (byte) -1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods44.incrementNumberAtIndex(intArray61, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods44.incrementNumberAtIndex(intArray69, 0);
        int[] intArray78 = new int[] { (short) 1, (-10), 9, (byte) 0 };
        simpleMethods44.incrementNumberAtIndex(intArray78, 0);
        simpleMethods22.incrementNumberAtIndex(intArray78, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray78, (int) (short) 0);
        int[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        simpleMethods0.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        int[] intArray56 = new int[] { 9, (-10) };
        simpleMethods53.incrementNumberAtIndex(intArray56, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods59.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        int[] intArray76 = new int[] { 9, (-10) };
        simpleMethods73.incrementNumberAtIndex(intArray76, 0);
        simpleMethods59.incrementNumberAtIndex(intArray76, 1);
        examples.SimpleMethods simpleMethods81 = new examples.SimpleMethods();
        int[] intArray84 = new int[] { 9, (-10) };
        simpleMethods81.incrementNumberAtIndex(intArray84, 0);
        simpleMethods59.incrementNumberAtIndex(intArray84, 0);
        simpleMethods53.incrementNumberAtIndex(intArray84, 0);
        simpleMethods52.incrementNumberAtIndex(intArray84, 0);
        simpleMethods46.incrementNumberAtIndex(intArray84, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray97, (-10));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods36.incrementNumberAtIndex(intArray45, 0);
        simpleMethods30.incrementNumberAtIndex(intArray45, 0);
        int[] intArray57 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods30.incrementNumberAtIndex(intArray57, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray57, 3);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        int[] intArray73 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods62.incrementNumberAtIndex(intArray73, 4);
        simpleMethods0.incrementNumberAtIndex(intArray73, 1);
        int[] intArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray78, 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods22.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods52.incrementNumberAtIndex(intArray61, 0);
        simpleMethods22.incrementNumberAtIndex(intArray61, 0);
        simpleMethods0.incrementNumberAtIndex(intArray61, (int) (byte) 1);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        int[] intArray73 = new int[] { 9, (-10) };
        simpleMethods70.incrementNumberAtIndex(intArray73, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        int[] intArray79 = new int[] { 9, (-10) };
        simpleMethods76.incrementNumberAtIndex(intArray79, 0);
        examples.SimpleMethods simpleMethods82 = new examples.SimpleMethods();
        int[] intArray85 = new int[] { 9, (-10) };
        simpleMethods82.incrementNumberAtIndex(intArray85, 0);
        simpleMethods76.incrementNumberAtIndex(intArray85, 0);
        simpleMethods70.incrementNumberAtIndex(intArray85, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, (int) '4');
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods28.incrementNumberAtIndex(intArray37, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods28.incrementNumberAtIndex(intArray45, 1);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods28.incrementNumberAtIndex(intArray53, 0);
        simpleMethods22.incrementNumberAtIndex(intArray53, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray53, 0);
        int[] intArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        int[] intArray21 = new int[] { 9, (-10) };
        simpleMethods18.incrementNumberAtIndex(intArray21, 0);
        simpleMethods12.incrementNumberAtIndex(intArray21, 0);
        simpleMethods6.incrementNumberAtIndex(intArray21, 0);
        simpleMethods0.incrementNumberAtIndex(intArray21, 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods43.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods43.incrementNumberAtIndex(intArray60, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods43.incrementNumberAtIndex(intArray68, 0);
        simpleMethods37.incrementNumberAtIndex(intArray68, 0);
        simpleMethods36.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods77 = new examples.SimpleMethods();
        int[] intArray80 = new int[] { 9, (-10) };
        simpleMethods77.incrementNumberAtIndex(intArray80, 0);
        examples.SimpleMethods simpleMethods83 = new examples.SimpleMethods();
        int[] intArray86 = new int[] { 9, (-10) };
        simpleMethods83.incrementNumberAtIndex(intArray86, 0);
        simpleMethods77.incrementNumberAtIndex(intArray86, 0);
        simpleMethods36.incrementNumberAtIndex(intArray86, 1);
        simpleMethods30.incrementNumberAtIndex(intArray86, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray86, (int) (byte) -1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods30.incrementNumberAtIndex(intArray47, 1);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods52.incrementNumberAtIndex(intArray61, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods52.incrementNumberAtIndex(intArray69, 1);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        int[] intArray85 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods74.incrementNumberAtIndex(intArray85, 4);
        simpleMethods52.incrementNumberAtIndex(intArray85, (int) (byte) 0);
        simpleMethods30.incrementNumberAtIndex(intArray85, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray85, 100);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods41.incrementNumberAtIndex(intArray58, 1);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        simpleMethods41.incrementNumberAtIndex(intArray66, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods14.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods14.incrementNumberAtIndex(intArray31, 1);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods14.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        simpleMethods14.incrementNumberAtIndex(intArray53, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray53, 7);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        int[] intArray22 = new int[] { 9, (-10) };
        simpleMethods19.incrementNumberAtIndex(intArray22, 0);
        simpleMethods13.incrementNumberAtIndex(intArray22, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods13.incrementNumberAtIndex(intArray30, 1);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods13.incrementNumberAtIndex(intArray38, 0);
        simpleMethods7.incrementNumberAtIndex(intArray38, 0);
        simpleMethods6.incrementNumberAtIndex(intArray38, 0);
        simpleMethods0.incrementNumberAtIndex(intArray38, (int) (short) 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods49.incrementNumberAtIndex(intArray58, 0);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        simpleMethods49.incrementNumberAtIndex(intArray66, 1);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        simpleMethods49.incrementNumberAtIndex(intArray74, 0);
        examples.SimpleMethods simpleMethods79 = new examples.SimpleMethods();
        int[] intArray82 = new int[] { 9, (-10) };
        simpleMethods79.incrementNumberAtIndex(intArray82, 0);
        examples.SimpleMethods simpleMethods85 = new examples.SimpleMethods();
        int[] intArray88 = new int[] { 9, (-10) };
        simpleMethods85.incrementNumberAtIndex(intArray88, 0);
        simpleMethods79.incrementNumberAtIndex(intArray88, 0);
        simpleMethods49.incrementNumberAtIndex(intArray88, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray88, (int) '4');
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods43.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods43.incrementNumberAtIndex(intArray60, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods43.incrementNumberAtIndex(intArray68, 0);
        simpleMethods37.incrementNumberAtIndex(intArray68, 0);
        simpleMethods36.incrementNumberAtIndex(intArray68, 0);
        simpleMethods30.incrementNumberAtIndex(intArray68, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray68, 0);
        int[] intArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray81, (-6));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods38.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods38.incrementNumberAtIndex(intArray55, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray55, 9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods36.incrementNumberAtIndex(intArray45, 0);
        simpleMethods30.incrementNumberAtIndex(intArray45, 0);
        int[] intArray57 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods30.incrementNumberAtIndex(intArray57, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray57, 3);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        int[] intArray73 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods62.incrementNumberAtIndex(intArray73, 4);
        simpleMethods0.incrementNumberAtIndex(intArray73, 1);
        examples.SimpleMethods simpleMethods78 = new examples.SimpleMethods();
        int[] intArray81 = new int[] { 9, (-10) };
        simpleMethods78.incrementNumberAtIndex(intArray81, 0);
        examples.SimpleMethods simpleMethods84 = new examples.SimpleMethods();
        int[] intArray87 = new int[] { 9, (-10) };
        simpleMethods84.incrementNumberAtIndex(intArray87, 0);
        simpleMethods78.incrementNumberAtIndex(intArray87, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) '4');
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods36.incrementNumberAtIndex(intArray45, 0);
        simpleMethods30.incrementNumberAtIndex(intArray45, 0);
        int[] intArray57 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods30.incrementNumberAtIndex(intArray57, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray57, 3);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        int[] intArray65 = new int[] { 9, (-10) };
        simpleMethods62.incrementNumberAtIndex(intArray65, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        simpleMethods62.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        int[] intArray79 = new int[] { 9, (-10) };
        simpleMethods76.incrementNumberAtIndex(intArray79, 0);
        simpleMethods62.incrementNumberAtIndex(intArray79, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray79, 3);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods21.incrementNumberAtIndex(intArray30, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods21.incrementNumberAtIndex(intArray38, 1);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        simpleMethods21.incrementNumberAtIndex(intArray46, 0);
        simpleMethods15.incrementNumberAtIndex(intArray46, 0);
        simpleMethods14.incrementNumberAtIndex(intArray46, 0);
        simpleMethods0.incrementNumberAtIndex(intArray46, 1);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        int[] intArray72 = new int[] { 9, (-10) };
        simpleMethods69.incrementNumberAtIndex(intArray72, 0);
        examples.SimpleMethods simpleMethods75 = new examples.SimpleMethods();
        int[] intArray78 = new int[] { 9, (-10) };
        simpleMethods75.incrementNumberAtIndex(intArray78, 0);
        simpleMethods69.incrementNumberAtIndex(intArray78, 0);
        simpleMethods63.incrementNumberAtIndex(intArray78, 0);
        simpleMethods57.incrementNumberAtIndex(intArray78, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray78, (int) ' ');
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods41.incrementNumberAtIndex(intArray58, 1);
        simpleMethods0.incrementNumberAtIndex(intArray58, (int) (short) 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        examples.SimpleMethods simpleMethods77 = new examples.SimpleMethods();
        int[] intArray80 = new int[] { 9, (-10) };
        simpleMethods77.incrementNumberAtIndex(intArray80, 0);
        simpleMethods71.incrementNumberAtIndex(intArray80, 0);
        simpleMethods65.incrementNumberAtIndex(intArray80, 0);
        int[] intArray92 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods65.incrementNumberAtIndex(intArray92, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray92, (-7));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods15.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods15.incrementNumberAtIndex(intArray32, 1);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods43.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods43.incrementNumberAtIndex(intArray60, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods43.incrementNumberAtIndex(intArray68, 0);
        simpleMethods37.incrementNumberAtIndex(intArray68, 0);
        simpleMethods15.incrementNumberAtIndex(intArray68, 1);
        simpleMethods1.incrementNumberAtIndex(intArray68, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray68, (int) (short) 1);
        examples.SimpleMethods simpleMethods81 = new examples.SimpleMethods();
        int[] intArray84 = new int[] { 9, (-10) };
        simpleMethods81.incrementNumberAtIndex(intArray84, 0);
        examples.SimpleMethods simpleMethods87 = new examples.SimpleMethods();
        int[] intArray90 = new int[] { 9, (-10) };
        simpleMethods87.incrementNumberAtIndex(intArray90, 0);
        simpleMethods81.incrementNumberAtIndex(intArray90, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray90, (-1));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        int[] intArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray14, 3);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods28.incrementNumberAtIndex(intArray37, 0);
        simpleMethods22.incrementNumberAtIndex(intArray37, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods44.incrementNumberAtIndex(intArray61, 1);
        simpleMethods22.incrementNumberAtIndex(intArray61, 0);
        simpleMethods0.incrementNumberAtIndex(intArray61, (int) (short) 0);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        int[] intArray73 = new int[] { 9, (-10) };
        simpleMethods70.incrementNumberAtIndex(intArray73, 0);
        int[] intArray81 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods70.incrementNumberAtIndex(intArray81, 4);
        simpleMethods0.incrementNumberAtIndex(intArray81, 1);
        int[] intArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray86, 10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        int[] intArray18 = new int[] { 9, (-10) };
        simpleMethods15.incrementNumberAtIndex(intArray18, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods15.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods15.incrementNumberAtIndex(intArray32, 1);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        int[] intArray40 = new int[] { 9, (-10) };
        simpleMethods37.incrementNumberAtIndex(intArray40, 0);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        simpleMethods43.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods43.incrementNumberAtIndex(intArray60, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods43.incrementNumberAtIndex(intArray68, 0);
        simpleMethods37.incrementNumberAtIndex(intArray68, 0);
        simpleMethods15.incrementNumberAtIndex(intArray68, 1);
        simpleMethods1.incrementNumberAtIndex(intArray68, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray68, 1);
        int[] intArray85 = new int[] { (short) 100, 100, '4', (short) 100 };
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int[] intArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray88, 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        int[] intArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray22, 5);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        int[] intArray27 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray27, (int) (byte) 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        int[] intArray48 = new int[] { 9, (-10) };
        simpleMethods45.incrementNumberAtIndex(intArray48, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        int[] intArray54 = new int[] { 9, (-10) };
        simpleMethods51.incrementNumberAtIndex(intArray54, 0);
        simpleMethods45.incrementNumberAtIndex(intArray54, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        simpleMethods45.incrementNumberAtIndex(intArray62, 1);
        examples.SimpleMethods simpleMethods67 = new examples.SimpleMethods();
        int[] intArray70 = new int[] { 9, (-10) };
        simpleMethods67.incrementNumberAtIndex(intArray70, 0);
        simpleMethods45.incrementNumberAtIndex(intArray70, 0);
        examples.SimpleMethods simpleMethods75 = new examples.SimpleMethods();
        int[] intArray78 = new int[] { 9, (-10) };
        simpleMethods75.incrementNumberAtIndex(intArray78, 0);
        examples.SimpleMethods simpleMethods81 = new examples.SimpleMethods();
        int[] intArray84 = new int[] { 9, (-10) };
        simpleMethods81.incrementNumberAtIndex(intArray84, 0);
        simpleMethods75.incrementNumberAtIndex(intArray84, 0);
        simpleMethods45.incrementNumberAtIndex(intArray84, 1);
        simpleMethods44.incrementNumberAtIndex(intArray84, 0);
        simpleMethods30.incrementNumberAtIndex(intArray84, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray84, (int) (short) 0);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray97, (-8));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        int[] intArray29 = new int[] { 9, (-10) };
        simpleMethods26.incrementNumberAtIndex(intArray29, 0);
        simpleMethods20.incrementNumberAtIndex(intArray29, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        int[] intArray37 = new int[] { 9, (-10) };
        simpleMethods34.incrementNumberAtIndex(intArray37, 0);
        simpleMethods20.incrementNumberAtIndex(intArray37, 1);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        int[] intArray45 = new int[] { 9, (-10) };
        simpleMethods42.incrementNumberAtIndex(intArray45, 0);
        simpleMethods20.incrementNumberAtIndex(intArray45, 0);
        simpleMethods14.incrementNumberAtIndex(intArray45, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray45, 0);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        int[] intArray57 = new int[] { 9, (-10) };
        simpleMethods54.incrementNumberAtIndex(intArray57, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods60.incrementNumberAtIndex(intArray69, 0);
        simpleMethods54.incrementNumberAtIndex(intArray69, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray69, (-9));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, 0);
        int[] intArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray38, 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        int[] intArray11 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods0.incrementNumberAtIndex(intArray11, 4);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods14.incrementNumberAtIndex(intArray23, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods14.incrementNumberAtIndex(intArray31, 1);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods14.incrementNumberAtIndex(intArray39, 0);
        int[] intArray48 = new int[] { (short) 1, (-10), 9, (byte) 0 };
        simpleMethods14.incrementNumberAtIndex(intArray48, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        int[] intArray54 = new int[] { 9, (-10) };
        simpleMethods51.incrementNumberAtIndex(intArray54, 0);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        simpleMethods51.incrementNumberAtIndex(intArray60, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods51.incrementNumberAtIndex(intArray68, 1);
        simpleMethods14.incrementNumberAtIndex(intArray68, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray68, 6);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        simpleMethods0.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        simpleMethods0.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray49, (-9));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        int[] intArray30 = new int[] { 9, (-10) };
        simpleMethods27.incrementNumberAtIndex(intArray30, 0);
        simpleMethods21.incrementNumberAtIndex(intArray30, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        int[] intArray38 = new int[] { 9, (-10) };
        simpleMethods35.incrementNumberAtIndex(intArray38, 0);
        simpleMethods21.incrementNumberAtIndex(intArray38, 1);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        int[] intArray46 = new int[] { 9, (-10) };
        simpleMethods43.incrementNumberAtIndex(intArray46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        int[] intArray52 = new int[] { 9, (-10) };
        simpleMethods49.incrementNumberAtIndex(intArray52, 0);
        examples.SimpleMethods simpleMethods55 = new examples.SimpleMethods();
        int[] intArray58 = new int[] { 9, (-10) };
        simpleMethods55.incrementNumberAtIndex(intArray58, 0);
        simpleMethods49.incrementNumberAtIndex(intArray58, 0);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        simpleMethods49.incrementNumberAtIndex(intArray66, 1);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        int[] intArray74 = new int[] { 9, (-10) };
        simpleMethods71.incrementNumberAtIndex(intArray74, 0);
        simpleMethods49.incrementNumberAtIndex(intArray74, 0);
        simpleMethods43.incrementNumberAtIndex(intArray74, 0);
        simpleMethods21.incrementNumberAtIndex(intArray74, 1);
        simpleMethods7.incrementNumberAtIndex(intArray74, (int) (short) 0);
        simpleMethods6.incrementNumberAtIndex(intArray74, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray74, 5);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        simpleMethods0.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods46.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        simpleMethods46.incrementNumberAtIndex(intArray63, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray63, (int) ' ');
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods6.incrementNumberAtIndex(intArray23, 1);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods6.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods38.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        int[] intArray67 = new int[] { 9, (-10) };
        simpleMethods64.incrementNumberAtIndex(intArray67, 0);
        simpleMethods58.incrementNumberAtIndex(intArray67, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        int[] intArray75 = new int[] { 9, (-10) };
        simpleMethods72.incrementNumberAtIndex(intArray75, 0);
        simpleMethods58.incrementNumberAtIndex(intArray75, 1);
        examples.SimpleMethods simpleMethods80 = new examples.SimpleMethods();
        int[] intArray83 = new int[] { 9, (-10) };
        simpleMethods80.incrementNumberAtIndex(intArray83, 0);
        simpleMethods58.incrementNumberAtIndex(intArray83, 0);
        simpleMethods52.incrementNumberAtIndex(intArray83, (int) (byte) 0);
        simpleMethods38.incrementNumberAtIndex(intArray83, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray83, (int) ' ');
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        int[] intArray21 = new int[] { 9, (-10) };
        simpleMethods18.incrementNumberAtIndex(intArray21, 0);
        simpleMethods12.incrementNumberAtIndex(intArray21, 0);
        simpleMethods6.incrementNumberAtIndex(intArray21, 0);
        simpleMethods0.incrementNumberAtIndex(intArray21, 1);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods30.incrementNumberAtIndex(intArray39, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods30.incrementNumberAtIndex(intArray47, 1);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods30.incrementNumberAtIndex(intArray55, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        int[] intArray63 = new int[] { 9, (-10) };
        simpleMethods60.incrementNumberAtIndex(intArray63, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods60.incrementNumberAtIndex(intArray69, 0);
        simpleMethods30.incrementNumberAtIndex(intArray69, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray69, 100);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        simpleMethods0.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        int[] intArray17 = new int[] { 9, (-10) };
        simpleMethods14.incrementNumberAtIndex(intArray17, 0);
        simpleMethods0.incrementNumberAtIndex(intArray17, 1);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods22.incrementNumberAtIndex(intArray31, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        int[] intArray39 = new int[] { 9, (-10) };
        simpleMethods36.incrementNumberAtIndex(intArray39, 0);
        simpleMethods22.incrementNumberAtIndex(intArray39, 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        simpleMethods22.incrementNumberAtIndex(intArray47, 0);
        int[] intArray56 = new int[] { (short) 1, (-10), 9, (byte) 0 };
        simpleMethods22.incrementNumberAtIndex(intArray56, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        int[] intArray62 = new int[] { 9, (-10) };
        simpleMethods59.incrementNumberAtIndex(intArray62, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        int[] intArray68 = new int[] { 9, (-10) };
        simpleMethods65.incrementNumberAtIndex(intArray68, 0);
        simpleMethods59.incrementNumberAtIndex(intArray68, 0);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        int[] intArray76 = new int[] { 9, (-10) };
        simpleMethods73.incrementNumberAtIndex(intArray76, 0);
        simpleMethods59.incrementNumberAtIndex(intArray76, 1);
        simpleMethods22.incrementNumberAtIndex(intArray76, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray76, 4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        int[] intArray16 = new int[] { 9, (-10) };
        simpleMethods13.incrementNumberAtIndex(intArray16, 0);
        simpleMethods7.incrementNumberAtIndex(intArray16, 0);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        int[] intArray24 = new int[] { 9, (-10) };
        simpleMethods21.incrementNumberAtIndex(intArray24, 0);
        simpleMethods7.incrementNumberAtIndex(intArray24, 1);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        int[] intArray32 = new int[] { 9, (-10) };
        simpleMethods29.incrementNumberAtIndex(intArray32, 0);
        simpleMethods7.incrementNumberAtIndex(intArray32, 0);
        simpleMethods1.incrementNumberAtIndex(intArray32, 0);
        simpleMethods0.incrementNumberAtIndex(intArray32, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        int[] intArray44 = new int[] { 9, (-10) };
        simpleMethods41.incrementNumberAtIndex(intArray44, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        int[] intArray50 = new int[] { 9, (-10) };
        simpleMethods47.incrementNumberAtIndex(intArray50, 0);
        simpleMethods41.incrementNumberAtIndex(intArray50, 0);
        simpleMethods0.incrementNumberAtIndex(intArray50, 1);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        int[] intArray60 = new int[] { 9, (-10) };
        simpleMethods57.incrementNumberAtIndex(intArray60, 0);
        examples.SimpleMethods simpleMethods63 = new examples.SimpleMethods();
        int[] intArray66 = new int[] { 9, (-10) };
        simpleMethods63.incrementNumberAtIndex(intArray66, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        int[] intArray72 = new int[] { 9, (-10) };
        simpleMethods69.incrementNumberAtIndex(intArray72, 0);
        simpleMethods63.incrementNumberAtIndex(intArray72, 0);
        simpleMethods57.incrementNumberAtIndex(intArray72, 0);
        int[] intArray84 = new int[] { 6, ' ', (short) 100, ' ', (-7) };
        simpleMethods57.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray84, (-7));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int[] intArray3 = new int[] { 9, (-10) };
        simpleMethods0.incrementNumberAtIndex(intArray3, 0);
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        int[] intArray9 = new int[] { 9, (-10) };
        simpleMethods6.incrementNumberAtIndex(intArray9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        int[] intArray15 = new int[] { 9, (-10) };
        simpleMethods12.incrementNumberAtIndex(intArray15, 0);
        simpleMethods6.incrementNumberAtIndex(intArray15, 0);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        int[] intArray23 = new int[] { 9, (-10) };
        simpleMethods20.incrementNumberAtIndex(intArray23, 0);
        simpleMethods6.incrementNumberAtIndex(intArray23, 1);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        int[] intArray31 = new int[] { 9, (-10) };
        simpleMethods28.incrementNumberAtIndex(intArray31, 0);
        simpleMethods6.incrementNumberAtIndex(intArray31, 0);
        simpleMethods0.incrementNumberAtIndex(intArray31, (int) (byte) 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        int[] intArray47 = new int[] { 9, (-10) };
        simpleMethods44.incrementNumberAtIndex(intArray47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        int[] intArray53 = new int[] { 9, (-10) };
        simpleMethods50.incrementNumberAtIndex(intArray53, 0);
        simpleMethods44.incrementNumberAtIndex(intArray53, 0);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        int[] intArray61 = new int[] { 9, (-10) };
        simpleMethods58.incrementNumberAtIndex(intArray61, 0);
        simpleMethods44.incrementNumberAtIndex(intArray61, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        int[] intArray69 = new int[] { 9, (-10) };
        simpleMethods66.incrementNumberAtIndex(intArray69, 0);
        simpleMethods44.incrementNumberAtIndex(intArray69, 0);
        simpleMethods38.incrementNumberAtIndex(intArray69, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        int[] intArray79 = new int[] { 9, (-10) };
        simpleMethods76.incrementNumberAtIndex(intArray79, 0);
        int[] intArray87 = new int[] { ' ', (byte) 100, '#', 0, (-1) };
        simpleMethods76.incrementNumberAtIndex(intArray87, 4);
        simpleMethods38.incrementNumberAtIndex(intArray87, 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray87, 10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        int[] intArray4 = new int[] { 9, (-10) };
        simpleMethods1.incrementNumberAtIndex(intArray4, 0);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        int[] intArray10 = new int[] { 9, (-10) };
        simpleMethods7.incrementNumberAtIndex(intArray10, 0);
        simpleMethods1.incrementNumberAtIndex(intArray10, 0);
        examples.SimpleMethods simpleMethods15 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods16 = new examples.SimpleMethods();
        int[] intArray19 = new int[] { 9, (-10) };
        simpleMethods16.incrementNumberAtIndex(intArray19, 0);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        int[] intArray25 = new int[] { 9, (-10) };
        simpleMethods22.incrementNumberAtIndex(intArray25, 0);
        simpleMethods16.incrementNumberAtIndex(intArray25, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        int[] intArray33 = new int[] { 9, (-10) };
        simpleMethods30.incrementNumberAtIndex(intArray33, 0);
        simpleMethods16.incrementNumberAtIndex(intArray33, 1);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        int[] intArray41 = new int[] { 9, (-10) };
        simpleMethods38.incrementNumberAtIndex(intArray41, 0);
        simpleMethods16.incrementNumberAtIndex(intArray41, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        int[] intArray49 = new int[] { 9, (-10) };
        simpleMethods46.incrementNumberAtIndex(intArray49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        int[] intArray55 = new int[] { 9, (-10) };
        simpleMethods52.incrementNumberAtIndex(intArray55, 0);
        simpleMethods46.incrementNumberAtIndex(intArray55, 0);
        simpleMethods16.incrementNumberAtIndex(intArray55, 1);
        simpleMethods15.incrementNumberAtIndex(intArray55, 0);
        simpleMethods1.incrementNumberAtIndex(intArray55, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray55, 1);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        int[] intArray71 = new int[] { 9, (-10) };
        simpleMethods68.incrementNumberAtIndex(intArray71, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        int[] intArray77 = new int[] { 9, (-10) };
        simpleMethods74.incrementNumberAtIndex(intArray77, 0);
        simpleMethods68.incrementNumberAtIndex(intArray77, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleMethods0.incrementNumberAtIndex(intArray77, (int) 'a');
    }
}

