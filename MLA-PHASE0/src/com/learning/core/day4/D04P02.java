package com.learning.core.day4;


	
	import java.util.Scanner;

	class NotEligibleException extends Exception {
	    public NotEligibleException(String message) {
	        super(message);
	    }
	}

	class CricketRating {
	    private String playerName;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private float avgRating;
	    private String coins;

	    public CricketRating(String playerName, float critic1, float critic2) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        calculateAverageRating(critic1, critic2);
	        calculateCoins();
	    }

	    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        calculateAverageRating(critic1, critic2, critic3);
	        calculateCoins();
	    }

	    public void calculateAverageRating(float critic1, float critic2) {
	        this.avgRating = (critic1 + critic2) / 2;
	    }

	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        this.avgRating = (critic1 + critic2 + critic3) / 3;
	    }

	    public String calculateCoins() {
	        if (avgRating >= 7) {
	            coins = "Gold";
	        } else if (avgRating >= 5) {
	            coins = "Silver";
	        } else if (avgRating >= 2) {
	            coins = "Copper";
	        } else {
	            try {
	                throw new NotEligibleException("NotEligible");
	            } catch (NotEligibleException e) {
	                coins = e.getMessage();
	            }
	        }
	        return coins;
	    }

	    public void display() {
	        System.out.println("Player Name: " + playerName);
	        System.out.println("Average Rating: " + avgRating);
	        if (!coins.equals("NotEligible")) {
	            System.out.println("Coins: " + coins);
	        } else {
	            System.out.println("Coins: " + coins);
	        }
	    }
	}

	public class D04P02 {
	    public static void main(String[] args) throws NotEligibleException {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter player name:");
	        String playerName = scanner.nextLine();

	        System.out.println("Enter critic1 rating:");
	        float critic1 = scanner.nextFloat();

	        System.out.println("Enter critic2 rating:");
	        float critic2 = scanner.nextFloat();

	        System.out.println("Enter critic3 rating:");
	        float critic3 = scanner.nextFloat();

	        CricketRating player = new CricketRating(playerName, critic1, critic2, critic3);
			player.display();

	        scanner.close();
	    }
	}



