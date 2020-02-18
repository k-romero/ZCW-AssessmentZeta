package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets != null){
            for (int i = 0; i < pets.length; i++) {
                this.pets.add(pets[i]);
                pets[i].setOwner(this);
            }
        }


    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngPet = Collections.min(pets, Comparator.comparing(p -> p.getAge()));
        return youngPet.getAge();
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet oldPet = Collections.max(pets, Comparator.comparing(p -> p.getAge()));
        return oldPet.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int result = 0;
        for (Pet p: pets) {
           result += p.getAge();
        }
        int divisor = pets.size();
        return (float) (result / divisor);
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
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
        if(pets.size() == 0){
            pets.add(null);
        }

        return pets.toArray(new Pet[pets.size()]);
    }
}
