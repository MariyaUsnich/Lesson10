package test;
import Zoo.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FishTest {

    private Fish fish = new Fish();
    private Goldfish goldfish = new Goldfish();

    @Test(groups = "positive")
    public void doTestFishName(){
        Assert.assertEquals(fish.getName(),"Fish");
    }

    @Test(groups = "positive")
    public void doTestFishBreathes() {
        Assert.assertEquals(fish.itBreathes(),"Gills");
    }

    @Test(groups = "positive")
    public void doTestFishMove(){
        Assert.assertEquals(fish.itMoves(),"Swims");
    }

    @Test(groups = "positive")
    public void doTestGoldfishName(){
        Assert.assertEquals(goldfish.getName(),"Goldfish");
    }

    @Test(groups = "negative")
    public void doTestFishNotBreathes() {Assert.assertNotEquals(fish.itBreathes(),"Lungs");}
}
