package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
   private Pet[] pets;



    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name) {
    this.name = name;
    this.pets = new Pet[1];

    }
        public  PetOwner(String name, Pet...pets){
        this.name = name;
        if(pets == null){
            this.pets = new Pet[1];
        } else {
            this.pets = pets;
            pets[0].setOwner(this);
           }
        }
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets.length ==1 && pets[0]==null){
        pets[0] = pet;

          } else {
            pets = Arrays.copyOf(pets,pets.length + 1);
            pets[pets.length - 1 ] = pet;
        }

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
            int inDx = 0;
     for(Pet currentPet : pets){
            if(currentPet.equals(pet)){
                pets[inDx] = null;
            }
         inDx++;
     }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet currentPet : pets) {
            if(currentPet.equals(pet)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
     int lowestAge = 10;
        for(Pet theP: pets){
         if(theP.getAge() < lowestAge){
             lowestAge = theP.getAge();
         }
     }
        return lowestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
    int highestAge = 1;
        for(Pet theP : pets){
            if(theP.getAge() > highestAge){
                highestAge = theP.getAge();
            }
        }

        return highestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
   Integer[] petAges = new Integer[pets.length];
   int index = 0;
   for(Pet thisPet : pets){
       petAges[index] = thisPet.getAge();
       index++;

   }
       double doubleAvg = IntegerArrayUtils.getAverage(petAges);
        Float avgPetAge = (float) doubleAvg;
   return avgPetAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets ;
    }
}
