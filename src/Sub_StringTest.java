import org.junit.Assert;

import static org.junit.Assert.*;

public class Sub_StringTest {
    @org.junit.Test

    public void compare() throws Exception {
        Sub_String k = new Sub_String();
        
        String s1 = "ant";
        String s2 = "tyrant";

                assertEquals(true, Sub_String.Compare(s1, s2));
    }

}