package com.company;

public interface iRandom {


    /**
     * Generates a random number based
     * of the given range.
     * @param low lowest value allowed.
     * @param high highest value allowed.
     *
     * @return A randomly generated number.
     * */
    int randomInteger(int low, int high);

    /**
     * Returns the character based of
     * the input integer.
     *
     * @param num Integer that will be
     *            mapped to ACSII value.
     * @return The char from the ACSII
     * value.
     * */
    char randomChar(int num);
}
