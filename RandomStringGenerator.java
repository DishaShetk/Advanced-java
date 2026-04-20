package lab3;

import java.util.Random;

public class RandomStringGenerator {

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += characters.charAt(rand.nextInt(characters.length()));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(10));
    }
}