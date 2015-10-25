package com.company;

import java.util.Random;

/**
 * Created by TZ6YSQ on 10/25/2015.
 */
public abstract class aRandom implements iRandom {

    private Random random = new Random();

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

        if (low  > high){
            throw new IllegalArgumentException("Low cannot be greater than high. ");
        }

        /* Get the range, casting to long to avoid overflow problems. */
        long l = (long)high - (long)low + 1;

        /* Compute a fraction of the range, 0 <= frac < range. */
        long l1 = (long)(l * random.nextDouble());

        return (int)(l1 + low);
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
        return (char)num;
    }
}
