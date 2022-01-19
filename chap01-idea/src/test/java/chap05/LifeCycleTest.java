package chap05;

import org.junit.jupiter.api.*;

public class LifeCycleTest {

    public LifeCycleTest() {
        System.out.println("new LifeCycleTest");
    }

    @BeforeAll
    static void testSetUp() {
        System.out.println("setUp All tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @Test
    void a() {
        System.out.println("A");
    }

    @Test
    void b() {
        System.out.println("B");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    static void testTearDown() {
        System.out.println("tearDown All tests");
    }
}
