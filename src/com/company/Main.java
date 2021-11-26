package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[] players = {};

    static int getIntInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static String getStringInput() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    static void initPlayers() {
        System.out.println("How many players?");
        int noPlayers = getIntInput();
        players = new String[noPlayers];

        for (int i = 0; i < noPlayers; i++) {
            System.out.println("What is player " + (i + 1) + "'s name?");
            players[i] = getStringInput();
        }
    }

    static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }

    public static void main(String[] args) {
	// write your code here
        int guesses = 2;
        String[] numberNames = new String[11];

        initPlayers();

        while (guesses != 0) {
            for (int i = 0; i < players.length; i++) {
                System.out.println(players[i] + ", pick a random number between 0 and 10");
                int playerNumber = getIntInput();

                if (numberNames[playerNumber] == null) {
                    numberNames[playerNumber] = players[i];
                }
            }
            System.out.println("Computer's turn");
            int comNumber = getRandomNumber();
            if (numberNames[comNumber] == null) {
                numberNames[comNumber] = "Computer";
            }
            guesses--;

        }
        for (int i = 0; i < numberNames.length; i++) {

        }
    }
}
