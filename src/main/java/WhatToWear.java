import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        System.out.println("What is the weather like today: rainy, sunny, cloudy, snow?");
        Scanner reader = new Scanner(System.in);
        String weatherInput = reader.nextLine();
        System.out.println("What is the temperature on average today (in degrees): ");
        int tempInput = reader.nextInt();

        if (weatherInput.equals("rainy")) {
            System.out.println("You need to take a raincoat out");
        } else if (weatherInput.equals("sunny")){
            if (tempInput > 18) {
                System.out.println("You don't need a jacket");
            }
            else {
                System.out.println("You need a light jacket");
            }

        }
        else if (weatherInput.equals("cloudy")) {
            System.out.println("You should bring a coat");
        }
        else if (weatherInput.equals("snow")){
            if (tempInput <8) {
                System.out.println("You need a thick winter coat");

            }
            else {
                System.out.println("You might need a warmer coat");
            }
        }
    }
}






//Allow your program to collect some descriptive user input about the weather ("rainy", "sunny", "cloudy", "snow", etc) and the average temperature for the day (8, 18, 28, etc).
//
//Let your program output clothing suggestions depending on a combination of weather conditions and temperature.
//
//e.g. if it is both "rainy" and less than 12 degrees, output "wear a waterproof winter coat"