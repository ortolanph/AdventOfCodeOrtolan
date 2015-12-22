package org.adventofcode.day4;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AdventCoinMiner {
    public long getCombination(String input, MiningMode miningMode) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Long combination = 0l;

        String md5hash = "";
        MessageDigest digest = MessageDigest.getInstance("MD5");

        while (!md5hash.startsWith(miningMode.getMode())) {
            String message = input + combination.toString();

            byte[] hash = digest.digest(message.getBytes("UTF-8"));
            md5hash = convertToHEX(hash);

            combination++;
        }

        return combination - 1;
    }

    private String convertToHEX(byte[] hash) {
        StringBuilder hashBuilder = new StringBuilder();

        for (byte b : hash) {
            hashBuilder.append(String.format("%02X", b));
        }

        return hashBuilder.toString();
    }

}
