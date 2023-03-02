package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


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

    private static CustomList getCustomList() {
        return new CustomList(null, new ArrayList<>());
    }

    private static City getCity() {
        return new City("PizzaLand", "The Pizza Province");
    }

}
