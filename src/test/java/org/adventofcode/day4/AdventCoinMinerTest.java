package org.adventofcode.day4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventCoinMinerTest {
    private AdventCoinMiner miner;
    public static final String INPUT_ONE = "abcdef";
    public static final String INPUT_TWO = "pqrstuv";

    @Before
    public void setUp() throws Exception {
        miner = new AdventCoinMiner();
    }

    @After
    public void tearDown() throws Exception {
        miner = null;
    }

    @Test
    public void miningOne() throws Exception {
        long expected = 609043l;

        long actual = miner.getCombination(INPUT_ONE, MiningMode.FIVE_ZEROES);

        assertEquals(expected, actual);
    }

    @Test
    public void miningTwo() throws Exception {
        long expected = 1048970l;

        long actual = miner.getCombination(INPUT_TWO, MiningMode.FIVE_ZEROES);

        assertEquals(expected, actual);
    }
}