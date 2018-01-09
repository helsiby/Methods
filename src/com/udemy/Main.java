package com.udemy;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 4000, 5, 100);
        int highScore = finScore(true, 4000, 5, 100);
        System.out.println("Your final score was " + highScore);
        calculateScore(true, 2000, 8, 200);
        highScore = finScore(true, 2000, 8, 200);
        System.out.println("Your final score was " + highScore);
        System.out.println();
        System.out.println("And now for something completely different");

        displayHighScorePosition("Mike", calculateHighScorePosition(50));
        displayHighScorePosition("Max", calculateHighScorePosition(1500));
        displayHighScorePosition("Alice", calculateHighScorePosition(400));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));

        System.out.println();

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400000);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(0);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

        public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            // {} creates a Code Block
            if (score < 5000 && score > 1000) {
                System.out.println("Your score was less than 5000, but greater than 1000");
            } else if (score < 1000) {
                System.out.println("Your score was less than 1000");
            } else {
                System.out.println("Got here");
            }
        }

        public static int finScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            if (gameOver == true) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            } else {
                return -1;
            }
        }

        public static void displayHighScorePosition (String player, int position) {
            System.out.println(player + " managed to get into position " + position + " On a high score table");
        }

        public static int calculateHighScorePosition (int playerScore) {
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
            }
        }
