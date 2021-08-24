package com.company;

public class Main {

    public static void main(String[] args) {
	String[] name = {"Homer", "Bart", "Lisa", "Maggie"};
        for (int i = 0; i < name.length; i++) {
            switch (name[i]){
                case "Homer":
                    System.out.println("Доброе утро " +name[i]);
                    break;
                case "Bart":
                    System.out.println("Добрый день " +name[i]);
                    break;
                case "Lisa":
                    System.out.println("Добрый вечер " +name[i]);
                    break;
                case "Maggie":
                    System.out.println("she is sleep " +name[i]);
                    break;
                default:
                    System.out.println("Не нашел имя " + name[i]);
            }
        }
    }
}
