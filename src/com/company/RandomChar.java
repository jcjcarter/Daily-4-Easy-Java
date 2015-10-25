package com.company;

/**
 * Created by TZ6YSQ on 10/25/2015.
 */
public class RandomChar extends aRandom {
    /**
     * Generates a random number based
     * of the given range.
     *
     * @param low  lowest value allowed.
     * @param high highest value allowed.
     * @return A randomly generated number.
     */
    @Override
    public int randomInteger(int low, int high) {
        return super.randomInteger(low, high);
    }

    /**
     * Returns the character based of
     * the input integer.
     *
     * @param num Integer that will be
     *            mapped to ACSII value.
     * @return The char from the ACSII
     * value.
     */
    @Override
    public char randomChar(int num) {
        return super.randomChar(num);
    }
}
