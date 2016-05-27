package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PageTests {
    @BeforeMethod
    public void precondition(){
        System.out.println("Precondition");

    }
    @Test(description = "First test of page constructor",enabled =true )
    public void testPage1(){
         Assert.assertEquals(1,1,"Good");
        Assert.assertEquals(1.0,1.1,0.001,"vah");

    }
}
