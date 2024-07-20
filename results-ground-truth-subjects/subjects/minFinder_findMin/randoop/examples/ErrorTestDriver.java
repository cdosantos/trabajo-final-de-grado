package examples;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class ErrorTestDriver {
	@Rule
	public Timeout globalTimeout = Timeout.millis(20000);

    public static void main(String... args) {
        boolean hadFailure = false;
        ErrorTest0 t0 = new ErrorTest0();
        try {
            t0.test1();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        try {
            t0.test2();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        try {
            t0.test3();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        try {
            t0.test4();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        try {
            t0.test5();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        try {
            t0.test6();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }
        if (hadFailure) {
            System.exit(1);
        }
    }
}

