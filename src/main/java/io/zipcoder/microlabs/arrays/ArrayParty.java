package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {
        String printArray = "*** Output ***";

        for (int i = 0; i < inputArray.length; i++) {
            printArray += "\n" + inputArray[i];
        }
        return printArray;
    }

    public String lastElement(String[] inputArray) {

        String lastElement = inputArray[inputArray.length - 1];

        return lastElement;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray) {

        String lastElement = inputArray[inputArray.length - 2];

        return lastElement;
    }

    //TODO Define the method reverse
    public String reverseArray(String[] inputArray) {
        String printArray = "*** Output ***";

        for (int i = inputArray.length - 1; i >= 0; i--) {
            printArray += "\n" + inputArray[i];
        }
        return printArray;
    }

    //TODO Define the method isPalindrome
    public String isPalindrome(String[] inputArray) {

        int length = inputArray.length;
        for (int i = 0; i < length / 2; ++i) {
            if (inputArray[i].equals(inputArray[length - i - 1])) {
                return "true";
            }
        }
        return "false";
    }

    //TODO Define the method compress
    public String compress(int[] inputArray) {
        String output = "***Output***";
        int number = -1;
        for (int i : inputArray) {
            if (i != number) {
                output += "\n" + i;
                number = i;
            }
        }
        return output;
    }

    //TODO Define the method pack

    public String pack(char[] letters) {
        String pack = "";
        char holder = letters[0];
        for (char i : letters) {
            if (i == holder) {
                pack += i;
            } else {
                pack += ", " + i;
                holder = i;
            }
        }
        return pack;
    }
}

