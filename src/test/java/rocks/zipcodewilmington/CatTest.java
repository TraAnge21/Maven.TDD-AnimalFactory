package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    //Create tests for `void setName(String name)`
    @Test
    public void setNameTest (){

        // Given
        String expectedName ="Lovy";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        //when
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        cat.setName(expectedName);
        String actualName = cat.getName();

        // then

        Assert.assertEquals(expectedName, actualName);
    }


    // Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest (){

        // Given
        String expectedName ="Lovy";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        //when
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        cat.setBirthDate(expectedBirthDate);
        String actualName = cat.getName();

        // then

        Assert.assertEquals(expectedName, actualName);
    }

    // Create tests for `speak`
    @Test
    public void speakTest(){

        // Given
        String expectedName ="";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;
        String expectedSpeak = "meow!";


        //when
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        String actualSpeak = cat.speak();

        // then

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }


    // Create tests for `void eat(Food)
    @Test
    public void testEat() {
        // Given
        String expectedName ="";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Food food=new Food();
        cat.eat(food);
        Integer expected=1;
        Integer actual=cat.getNumberOfMealsEaten();


        //Then
        Assert.assertEquals(actual, expected);
    }



    //  Create tests for `Integer getId()`
    @Test
    public void idTest() {

        // Given
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 5;

        //When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Integer actualId=cat.getId();

        //then
        Assert.assertEquals(actualId, expectedId);
    }



    // Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInstanceTest() {

        //Given
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 2;

        //When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Boolean expectedInstance=true;
        Boolean actualInstance=cat instanceof Animal;

        // Then
        Assert.assertEquals(expectedInstance, actualInstance);
    }


    //  Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInstanceTest() {

        // Given
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 2;

        //When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Boolean expectedInstance=true;
        Boolean actualInstance=cat instanceof Mammal;

        //Then
        Assert.assertEquals(expectedInstance,actualInstance);
    }



}
