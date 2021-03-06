package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private final static int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this();
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public boolean play() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean sleep() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean wash() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean walk() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean hunt() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public void eat(int satiety) {
         this.satiety=satiety;
    }

    private String nameOfFood;

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public void eat(int satiety, String nameOfFood) {
        System.out.println(nameOfFood);
         this.satiety=satiety;
    }

    public void eat() {
        eat(satiety, nameOfFood);
    }


    public static String[] result = new String[24];

    public String[] liveAnotherDay() {
        for (int i = 0; i <= 23; i++) {
            int random = (int)(Math.random() * METHODS + 1);
            switch (random) {
                case 1:
                    if (play()) result[i]= (i+"-"+"????????????");
                    else { result[i]= (i+"-"+"??????"); eat(5);}
                    break;
                case 2:
                    if (sleep()) {result[i]= (i+"-"+"????????");}
                    else { result[i]= (i+"-"+"??????"); eat(5);}
                break;
                case 3:
                    if (wash()){result[i]= (i+"-"+"????????????");}
                   else{result[i]= (i+"-"+"??????"); eat(5);}
                    break;
                case 4:
                    if (walk()){result[i]= (i+"-"+"????????????");}
                    else {result[i]= (i+"-"+"??????"); eat(5);}
                    break;
                case 5:
                    if (hunt()){result[i]= (i+"-"+"????????????????");}
                    else {result[i]= (i+"-"+"??????"); eat(5);}
                    break;
            }
        }
        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Kotik.count = count;
    }
}