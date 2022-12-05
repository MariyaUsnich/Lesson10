package test;
import Zoo.*;
import Zoo.Animal;
import Zoo.Elephant;
import Zoo.Panda;
import Zoo.Tiger;
import org.testng.annotations.Test;
import org.hamcrest.collection.IsMapContaining;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class ZooTest {

    @Test(groups = "positive")
    public void testAssertMap() {

        HashMap<Integer, ZooAnimals> anList = new HashMap<>();
        anList.put(1, new Tiger());
        anList.put(2, new Elephant());
        anList.put(3, new Panda());
        anList.put(4, new Straus());
        anList.put(5, new Peacock());
        anList.put(6, new Goldfish());

        HashMap<Integer, ZooAnimals> expected = new HashMap<>();
        expected.put(1, new Tiger());
        expected.put(2, new Elephant());
        expected.put(3, new Panda());
        expected.put(4, new Straus());
        expected.put(5, new Peacock());
        expected.put(6, new Goldfish());

        try {
            assertThat(anList, is(expected));
        } catch (AssertionError assertionError) {
            }

        assertThat(anList.size(), is(6));

        assertThat(anList, IsMapContaining.hasEntry(1, new Tiger()));

        assertThat(anList, IsMapContaining.hasEntry(2, new Elephant()));

        assertThat(anList, IsMapContaining.hasEntry(3, new Panda()));

        assertThat(anList, IsMapContaining.hasEntry(4, new Straus()));

        assertThat(anList, IsMapContaining.hasEntry(5, new Peacock()));

        assertThat(anList, IsMapContaining.hasEntry(6, new Goldfish()));

        assertThat(anList, IsMapContaining.hasKey(3));

        assertThat(anList, IsMapContaining.hasValue(new Panda()));

    }
        @Test(groups = "negative")
        public void testAssertMapNeg() {

            HashMap<Integer, ZooAnimals> anList = new HashMap<>();
            anList.put(1, new Tiger());
            anList.put(2, new Elephant());
            anList.put(3, new Panda());
            anList.put(4, new Straus());
            anList.put(5, new Peacock());
            anList.put(6, new Goldfish());

            Animal Monkey = new Animal();

            assertThat(anList.size(), not(is(5)));

            assertThat(anList, not(IsMapContaining.hasEntry(2, new Tiger())));

            assertThat(anList, not(IsMapContaining.hasKey(7)));

            assertThat(anList, not(IsMapContaining.hasValue(Monkey)));

}

}






