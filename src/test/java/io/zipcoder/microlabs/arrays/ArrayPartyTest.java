package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    ArrayParty arrayParty = new ArrayParty();

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "Mushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);

    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "Tomatoes";
        //: When
        String actual = arrayParty.lastButOne(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);

    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        //:When
        String actual = arrayParty.reverseArray(breakfast);
        //: Then
        Assert.assertEquals(expected, actual);
    }
    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){
        //:Given
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected1 = "true";
        String expected2 = "false";
        //:When
        String actual1 = arrayParty.isPalindrome(palindromic);
        String actual2 = arrayParty.isPalindrome(breakfast);
        //:Then
        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2, actual2);

    }

    //TODO Define the method compressTest
    @Test
    public void compress() {
        int[] nums = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};
        String expected = "***Output***\n1\n3\n2\n1\n4";

        String actual = arrayParty.compress(nums);

        Assert.assertEquals(expected,actual);
    }
    //TODO Define the method packTest

    @Test
    public void pack(){
        char [] letters = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};
        String expected = "aaaa, b, cc, aa, d, eeee";
        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected,actual);
    }

}
