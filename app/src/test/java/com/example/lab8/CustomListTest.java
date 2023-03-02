package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    /**
     * Retrieves the size of the list
     * Increases the list by adding a new city
     * Checks if the current size matches the initial size + 1
     */
    @Test
    public void addCityTest() {
        CustomList list = getCustomList();
        int initialCount = list.getCount();

        list.addCity(getCity());

        assertEquals(initialCount + 1, list.getCount());
    }

    /**
     * Checks that the list does not currently have the city.
     * Adds the city.
     * Checks if the list has the city.
     */
    @Test
    public void hasCityTest() {
        CustomList list = getCustomList();
        City city = getCity();

        assertFalse(list.hasCity(city));

        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * Adds the city to the list.
     * Removes the city from the list.
     * Confirms the count of the list is 0.
     */
    @Test
    public void deleteCityTest() {
        CustomList list = getCustomList();
        City city = getCity();

        list.addCity(city);

        list.deleteCity(city);
        assertEquals(0, list.getCount());
    }

    @Test
    public void getCountTest() {
        CustomList list = getCustomList();
        assertEquals(0, list.getCount());

        City city = getCity();
        list.addCity(city);

        assertEquals(1, list.getCount());
    }


    private static CustomList getCustomList() {
        return new CustomList(null, new ArrayList<>());
    }

    private static City getCity() {
        return new City("PizzaLand", "The Pizza Province");
    }

}
