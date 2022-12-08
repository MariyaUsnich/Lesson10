package test;
import Zoo.Animal;
import Zoo.Elephant;
import Zoo.Panda;
import Zoo.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AnimalTest {

    private Animal animal = new Animal();
    private Tiger tiger = new Tiger();
    private Elephant elephant = new Elephant();
    private Panda panda = new Panda();

    @Test(groups = "positive")
    public void doTestAnimalName(){
        Assert.assertEquals(animal.getName(),"Animal");
    }

    @Test(groups = "positive")
    public void doTestAnimalBreathes() {
        Assert.assertEquals(animal.itBreathes(),"Lungs");
    }

    @Test(groups = "positive")
    public void doTestAnimalMove(){
            Assert.assertEquals(animal.itMoves(), "Goes, Runs");
    }

    @Test(groups = "positive")
    public void doTestTigerDang(){
        tiger.isDangerous();
        Assert.assertTrue(true);
    }
    @Test(groups = "positive")
    public void doTestTigerEating() {
        Assert.assertEquals(tiger.isEating(),"Predator");
    }

    @Test(groups = "positive")
    public void doTestElephantEating() {
        Assert.assertEquals(elephant.isEating(),"Herbivores");
    }

    @Test(groups = "positive")
    public void doTestPandaDang(){
        panda.isDangerous();
        Assert.assertFalse(false);
    }

    @Test(groups = "negative")
    public void doTestElephantMoves() {
        Assert.assertNotEquals(elephant.itMoves(),"Goes, Runs");
    }

    @Test(groups = "negative")
    public void doTestTigerEatingN() {
        Assert.assertNotEquals(tiger.isEating(),"Herbivores");
    }
    }



