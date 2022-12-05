package test;
import Zoo.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import java.util.HashMap;

public class ZooTest2 {
    @Test(groups = "positive")
    public void testAssertList() {

        ZooAnimals[] anList = new ZooAnimals[6];
        anList[0] = new Tiger();
        anList[1] = new Elephant();
        anList[2] = new Panda();
        anList[3] = new Straus();
        anList[4] = new Peacock();
        anList[5] = new Goldfish();
    }
}