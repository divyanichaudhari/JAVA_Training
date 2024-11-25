package coll3;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Song songInfo = new Song();

		        System.out.println("Welcome to the Song Information System!");
		        System.out.print("Enter the number of operations: ");
		        int n = Integer.parseInt(scanner.nextLine());

		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter operation (ADD songTitle:views, GET songTitle, HIGHEST): ");
		            String operation = scanner.nextLine();
		            String[] parts = operation.split(" ", 2);

		            switch (parts[0].toUpperCase()) {
		                case "ADD":
		                    if (parts.length > 1) {
		                        songInfo.addSong(parts[1]);
		                        System.out.println("Song added: " + parts[1]);
		                    } else {
		                        System.out.println("Invalid ADD command. Format: ADD songTitle:views");
		                    }
		                    break;

		                case "GET":
		                    if (parts.length > 1) {
		                        int views = songInfo.findTheViewsForGivenSongTitle(parts[1]);
		                        if (views != -1) {
		                            System.out.println("Views for \"" + parts[1] + "\": " + views);
		                        } else {
		                            System.out.println("Song \"" + parts[1] + "\" not found.");
		                        }
		                    } else {
		                        System.out.println("Invalid GET command. Format: GET songTitle");
		                    }
		                    break;

		                case "HIGHEST":
		                    List<String> highestSongs = songInfo.findTheSongsWithHighestViews();
		                    if (highestSongs.isEmpty()) {
		                        System.out.println("No songs available.");
		                    } else {
		                        System.out.println("Songs with the highest views: " + String.join(", ", highestSongs));
		                    }
		                    break;

		                default:
		                    System.out.println("Invalid operation. Please use ADD, GET, or HIGHEST.");
		            }
		        }

		        System.out.println("Thank you for using the Song Information System!");
		        scanner.close();
		    }


	}


