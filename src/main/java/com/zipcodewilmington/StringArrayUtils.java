package com.zipcodewilmington;


import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        //code already passes tests

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        //code already passes tests

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {


        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean containedValue = false;
        for ( String element : array) {
            if (element == value) {
                containedValue = true;
            }

        }
        return containedValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int j = 0;
        for ( int i = array.length - 1; i >= 0; i--){
            reverseArray[j] = array[i];
            j++;
        }


        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i <= array.length / 2 && array.length !=0; i++){
            if (array[i] != array[array.length - i - 1]){
                break;
            }
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String letterCheck =  Arrays.toString(array).toLowerCase();
            int missingLetter = 0;
            for (char i = 'a'; i <= 'z'; i++){
                if (letterCheck.indexOf(i) == -1){
                    missingLetter++;
                }
            }
            return missingLetter == 0;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occur = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                occur ++;
            }
        }

        return occur;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int curVal = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == valueToRemove){

            }
            else {
                newArray[curVal] = array[i];
                curVal++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String placeHolder = "";
        String[] newRet = new String[array.length];
        newRet[0] = array[0];
        int foundGroups = 1;

        for (int i = 1; i <= array.length - 1; i++){

            String actual = array[i];
            if(array[i].equals(array[i-1])){
                newRet[i] = placeHolder;
            }
            else{
                foundGroups++;
                newRet[i] = actual;
            }
        }
        String[] result = new String[foundGroups];
        int counter = 0;

        for(int x = 0; x <= array.length -1; x++) {
            if(newRet[x].equals(placeHolder)){

            }
            else if(!newRet[x].equals(placeHolder)){
                result[counter] = newRet[x];
                counter++;
            }
        }
    return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String placeHolder = "";
        String[] newRet = new String[array.length];
        int foundGroups = 0;

        for (int i = 0; i <= array.length - 1; i++) {

            String actual = array[i];
            if (i == 0) {
                newRet[i] = array[i];
                foundGroups++;
            }
            else if (array[i].equals(array[i - 1])) {
                newRet[i] = placeHolder;
            }
            else {
                newRet[i] = actual;
                foundGroups++;
            }
        }

        String[] result = new String[foundGroups];
        boolean isFirstLoop = true;
        int counter = 0;

        String current = "";

        for (int i = 0; i <= array.length - 1; i++) {

            if (isFirstLoop) {
                result[0] = newRet[0];
                isFirstLoop = false;
                current = result[0];

            }
            else if (newRet[i].equals(placeHolder)) {
                result[counter] += current;

            }
            else if (!newRet[i].equals(placeHolder)) {
                counter++;
                result[counter] = newRet[i];
                current = newRet[i];
            }


        }
        return result;
    }


}
