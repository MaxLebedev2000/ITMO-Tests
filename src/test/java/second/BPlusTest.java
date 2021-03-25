package second;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Second task tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BPlusTest {
    private BTree st;

    @BeforeEach
            void init(){
        st = new BTree<Integer, Integer>();
        st.put(1,1);
        st.put(2,2);
        st.put(3,3);
        st.put(4,4);
        st.put(5,5);
        st.put(6,6);
        st.put(7,7);
        st.put(8,8);
        st.put(9,9);
        st.put(10,10);
        st.put(11,11);
        st.put(12,12);
        st.put(13,13);


    }

@Test
@DisplayName(value = "Add test")
    void addTest(){
    assertEquals("     " + "1\n" +
            "     " + "2\n" +
            "     " + "3\n" +
            "(4)\n" +
            "     " + "4\n" +
            "     " + "5\n" +
            "     " + "6\n" +
            "(7)\n" +
            "     " + "7\n" +
            "     " + "8\n" +
            "     " + "9\n" +
            "(10)\n" +
            "     " + "10\n" +
            "     " + "11\n" +
            "     " + "12\n" +
            "     " + "13\n\n", st.toString());
}



}
