package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import java.util.List;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest(){
     Dog dogtesst = new Dog("",null,1);

        DogHouse.add(dogtesst);

        Dog expected = DogHouse.getDogById(1);


        Assert.assertEquals(expected,dogtesst);
        }


        @Test
    public void removeTest(){

        Dog dogTest = new Dog(null,null,1);

            DogHouse.add(dogTest);
            int actual = DogHouse.getNumberOfDogs();
            DogHouse.remove(dogTest);
            int expected = DogHouse.getNumberOfDogs();

           Assert.assertEquals(expected+1,actual);

        }

        @Test
    public void removeByIdTest(){

            Dog dogTest = new Dog(null,null,1);

            DogHouse.add(dogTest);
            int actual = DogHouse.getNumberOfDogs();
            DogHouse.remove(1);
            int  expected = DogHouse.getNumberOfDogs();

            Assert.assertEquals(expected + 1,actual);


        }

    }




