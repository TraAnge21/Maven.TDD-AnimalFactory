package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

//    @Test
//    public void setNameTest() {
//        // Given (a name exists and a dog exists)
//        Dog dog = new Dog(null, null, null);
//        String givenName = "Milo";
//
//        // When (a dog's name is set to the given name)
//        dog.setName(givenName);
//
//        // Then (we expect to get the given name from the dog)
//        String dogName = dog.getName();
//        Assert.assertEquals(dogName, givenName);
//    }

    //Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){

        // Given
        String expectedName ="Roxy";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        //when
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        dog.setName(expectedName);
        String actualName = dog.getName();

        // then

        Assert.assertEquals(expectedName, actualName);
    }


    // Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest (){

        // Given
        String expectedName ="Roxy";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        //when
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        dog.setBirthDate(expectedBirthDate);
        String actualName = dog.getName();

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
        String expectedSpeak = "bark!";


        //when
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        String actualSpeak = dog.speak();

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
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Food food=new Food();
        dog.eat(food);
        Integer expected=1;
        Integer actual=dog.getNumberOfMealsEaten();


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
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Integer actualId=dog.getId();

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
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Boolean expectedInstance=true;
        Boolean actualInstance=dog instanceof Animal;

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
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Boolean expectedInstance=true;
        Boolean actualInstance= dog instanceof Mammal;

        //Then
        Assert.assertEquals(expectedInstance,actualInstance);
    }






}
