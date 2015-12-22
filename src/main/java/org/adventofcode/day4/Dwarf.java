package org.adventofcode.day4;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Dwarf {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        AdventCoinMiner miner = new AdventCoinMiner();

        long firstCombination = miner.getCombination("bgvyzdsv", MiningMode.FIVE_ZEROES);
        long secondCombination = miner.getCombination("bgvyzdsv", MiningMode.SIX_ZEROES);

        System.out.println(firstCombination);
        System.out.println(secondCombination);
    }
}
