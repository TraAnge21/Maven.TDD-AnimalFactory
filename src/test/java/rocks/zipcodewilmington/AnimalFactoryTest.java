package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`




// Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        // Given
        String expectedName = "Bichon";
        Date expectedBirthdateDate  = new Date();

        // When

        Dog Bichon = AnimalFactory.createDog(expectedName, expectedBirthdateDate);

        // Then
        String actualName = Bichon.getName();
        Date actualBirthDate = Bichon.getBirthDate();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdateDate, actualBirthDate);
    }




    // Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        // Given
        String expectedName = "Milou";
        Date expectedBirthdateDate  = new Date();

        // When

        Cat Milou = AnimalFactory.createCat(expectedName, expectedBirthdateDate);

        // Then
        String actualName = Milou.getName();
        Date actualBirthDate = Milou.getBirthDate();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdateDate, actualBirthDate);
    }



}
