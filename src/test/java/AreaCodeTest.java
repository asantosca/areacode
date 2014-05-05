import static org.junit.Assert.*;

import org.junit.Test;


public class AreaCodeTest
{

    @Test
    public void testValid()
    {
        assertEquals("New Jersey",AreaCode.getState(201));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalid()
    {
        AreaCode.getState(200);
    }

}
