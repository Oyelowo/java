// Single line comment

/*ong
Multiline comment
grs
*/

import java.util.Scanner;

import sun.font.TrueTypeFont;

import java.awt.print.Printable;
import java.util.*;

public class Animal {

    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favouriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 2;
        System.out.println("5+1= " + sumOfNumbers);

        int diffOfNumbers = 5 - 2;
        System.out.println("5-1= " + diffOfNumbers);

        int multOfNumbers = 5 * 2;
        System.out.println("5*1= " + multOfNumbers);

        int divOfNumbers = 5 / 2;
        System.out.println("5/1= " + divOfNumbers);

        int modOfNumbers = 5 % 2;
        System.out.println("5%1= " + modOfNumbers);

        System.out.print("Enter the name: \n");

        if (userInput.hasNextLine()) {
            this.setName(userInput.nextLine());
        }

        this.setFavouriteChar();

        this.setUniqueID();
    }

    /**
     * @return the age
     */
    public byte getAge() {
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @return the uniqueID
     */
    public long getUniqueID() {
        return uniqueID;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the favouriteChar
     */
    public char getFavouriteChar() {
        return favouriteChar;
    }

    /**
     * @param age the age to set
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @param uniqueID the uniqueID to set
     */
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    /**
     * @param favouriteChar the favouriteChar to set
     */
    public void setFavouriteChar(char favouriteChar) {
        this.favouriteChar = favouriteChar;
    }

    public void setFavouriteChar() {
        int randomNumber = (int) (Math.random() * 126) + 1;

        this.favouriteChar = (char) randomNumber;

        if (randomNumber == 32) {
            System.out.println("Favourite character set to Space");
        } else if (randomNumber == 10) {
            System.out.println("Favourite character set to Newline");
        } else {
            System.out.println("Favourite character set to " + this.favouriteChar);
        }

        if ((randomNumber > 97) && (randomNumber < 122)) {
            System.out.println("Favourite character is a lowercase letter");
        }

        if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
            System.out.println("Favourite character is a letter");
        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch (randomNumber) {
        case 8:
            System.out.println("Favourite character set to backspace");
            break;

        case 10:
        case 11:
        case 12:
            System.out.println("Favorote character set to backspace");
            break;
        default:
            System.out.println();
            break;
        }

    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumbwer + (long) (Math.random() * ((maxNumber) - (minNumber) + 1));

        String stringNumber = Long.toString(maxNumber);

        int numberString = Integer.parseInt(stringNumber);

    }

    protected static void countTo(int startingNumber) {
        for (int i = startingNumber; i <= 100; i++) {
            if (i == 90)
                continue;

            System.out.println(i);
        }
    }

    protected static String printNumbers(int maxNumbers) {
        int i = 1;
        while (i < (maxNumbers / 2)) {
            System.out.println(i);
            i++;

            if (i == (maxNumbers / 2))
                break;
        }

        Animal.countTo(maxNumbers / 2);

        return "End of printNumbers";
    }

    protected static void guessMyNumber() {
        int number;

        do {
            System.out.println("Guess Number up to 100");
            while (!userInput.hasNextInt()) {
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number\n", numberEntered);

            }
            number = userInput.nextInt();

        } while (number != 50);

    }

    public String makeSound() {
        return "Grrrr";
    }

    public void speakAnimal(Animal randAminal) {
        System.out.println("Animal says " + randAnimal.makeSound());
    }

    public static void main(String[] args) {
        Animal theAnimal = new Animal();

        int[] favouriteNumbers = new int[20];
        favouriteNumbers[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};

        for (String word : stringArray) {
            System.out.println(word);
        }

        String[][][] arrayName ;

    }
}