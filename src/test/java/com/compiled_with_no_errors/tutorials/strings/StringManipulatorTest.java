package com.compiled_with_no_errors.tutorials.strings;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Date;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private String one, two, three, four;

    @BeforeEach
    void setUp() {
        one = "Mastering Java For Beginners";
        two = "Compiled With No Errors";
        three = one;
        four = new String(two);
    }

    @Test
    void nullCheck() {
        assertThrows(NullPointerException.class, () -> StringManipulator.areStringsEqual(null, ""));
        assertThrows(NullPointerException.class, () -> StringManipulator.areStringsEqual(null, null));

        assertThrows(NullPointerException.class, () -> StringManipulator.areContentsEqual(null, null));
        assertThrows(NullPointerException.class, () -> StringManipulator.areContentsEqual("null", null));

        assertThrows(NullPointerException.class, () -> StringManipulator.generateString(null, ""));
        assertThrows(NullPointerException.class, () -> StringManipulator.generateString("", null));
    }

    @Test
    void areStringsEqual() {
        assertFalse(StringManipulator.areStringsEqual(one, two));

        assertTrue(StringManipulator.areStringsEqual(three, one));

        assertFalse(StringManipulator.areStringsEqual(four, two));
    }

    @Test
    void areContentsIdentical(){
        assertFalse(StringManipulator.areContentsEqual(one, two));
        assertTrue(StringManipulator.areContentsEqual(one, three));
        assertTrue(StringManipulator.areContentsEqual(two, four));
    }

    @Test
    void testStringBuilder() {
        assertEquals("Mastering, Java, For, Beginners", StringManipulator.generateString(", ", "Mastering", "Java", "For", "Beginners"));
        assertEquals("Mastering Java For Beginners and Compiled with No Errors", StringManipulator.generateString(" ", "Mastering", "Java", "For", "Beginners", "and", "Compiled", "with", "No", "Errors"));
    }

    @Test
    void displayGenericTest() {
        assertDoesNotThrow(() -> StringManipulator.displayGenericString("Mastering Java For Beginners", new char[]{'J', 'A', 'V', 'A'}));
    }

    @Test
    void displayNumericTest() {
        assertDoesNotThrow(() -> StringManipulator.displayNumbers(-1904, Float.NEGATIVE_INFINITY));
        assertDoesNotThrow(() -> StringManipulator.displayNumbers(15_508, 25.56E-41F));
    }

    @Nested
    class benchmarking {
        private static final int NB_OF_RUNS = 1500;
        private static final String DELIMITER = " ";
        private static String[] INPUTS;
        private static long[] TIME_SPEND;
        private static float[] MEMORY_USAGE;
        private long initialMemory, initialTime;

        @BeforeAll
        static void beforeAll() {
            INPUTS = new String[10_000];
            Arrays.fill(INPUTS, "Test");

            MEMORY_USAGE = new float[2];
            TIME_SPEND = new long[2];
        }

        @BeforeEach
        void setUp() throws InterruptedException {
            System.gc();
            sleep(100L);

            initialMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            initialTime = new Date().getTime(); // Stores current time in milliseconds
            assertTrue(initialMemory > 0);
            assertTrue(initialTime > 0);
        }

        @AfterEach
        void tearDown(TestInfo testInfo) {
            float memoryUsed = (float) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() - initialMemory) / 1024 / 1024;
            long timeSpend = new Date().getTime() - initialTime;
            assertTrue(memoryUsed >= 0f);
            assertTrue(timeSpend >= 0f);

//            System.out.printf("%s spend %f memory (Mb), %d milliseconds\n", testInfo.getDisplayName(), memoryUsed, timeSpend);

            assertTrue(testInfo.getTestMethod().isPresent());
            if (testInfo.getTestMethod().get().toString().contains("Appender")) {
                MEMORY_USAGE[0] += memoryUsed;
                TIME_SPEND[0] += timeSpend;
            } else if (testInfo.getTestMethod().get().toString().contains("Builder")){
                MEMORY_USAGE[1] += memoryUsed;
                TIME_SPEND[1] += timeSpend;
            } else
                fail("Unknown method");
        }

        @AfterAll
        static void afterAll() {
            System.out.printf("String Appender average memory usage is %e (MB), average time spend is %e (ms)\n", MEMORY_USAGE[0] / NB_OF_RUNS, (float) TIME_SPEND[0] / NB_OF_RUNS);
            System.out.printf("String Builder average memory usage is %e (MB), average time spend is %e (ms)\n", MEMORY_USAGE[1] / NB_OF_RUNS, (float) TIME_SPEND[1] / NB_OF_RUNS);
            assertTrue(MEMORY_USAGE[0] > MEMORY_USAGE[1]);
            assertTrue(TIME_SPEND[0] > TIME_SPEND[1]);
        }

        @RepeatedTest(NB_OF_RUNS)
        void testBenchmarkAppender() {
            assertDoesNotThrow(() -> StringManipulator.generateStringsViaAppender(DELIMITER, INPUTS));
        }

        @RepeatedTest(NB_OF_RUNS)
        void  testBenchmarkStringBuilder(){
            assertDoesNotThrow(() -> StringManipulator.generateString(DELIMITER, INPUTS));
        }
    }

}
