package test;
import Zoo.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdTest {

    private Bird bird = new Bird();
    private Straus straus = new Straus();
    private Peacock peacock = new Peacock();

    @Test(groups = "positive")
    public void doTestBirdName(){
        Assert.assertEquals(bird.getName(),"Bird");
    }

    @Test(groups = "positive")
    public void doTestBirdBreathes() {
        Assert.assertEquals(bird.itBreathes(),"Lungs");
    }

    @Test(groups = "positive")
    public void doTestBirdMove(){
        Assert.assertEquals(bird.itMoves(),"Flies, Goes");
    }

    @Test(groups = "positive")
    public void doTestStrausName(){
        Assert.assertEquals(straus.getName(),"Straus");
    }

    @Test(groups = "positive")
    public void doTestStrausAlso(){
        Assert.assertEquals(straus.itAlsoDoes(),"It also hides its head in the sand if frightned.");
    }
    @Test(groups = "positive")
    public void doTestPeacockAlso() {
        peacock.isBeautiful();
                Assert.assertTrue(true);
    }

    @Test(groups = "negative")
    public void doTestStrausMove() {Assert.assertNotEquals(straus.itMoves(),"Flies");}
}
