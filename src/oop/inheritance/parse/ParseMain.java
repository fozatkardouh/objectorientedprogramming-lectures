package oop.inheritance.parse;

import java.util.List;

public class ParseMain {

    public static void main(String[] args) {
        System.out.println("Parsing things!");

        System.out.println("Parsing dishes!");
        DishParser dishParser = new DishParser();
        String dishesFilepath = "src/oop/inheritance/parse/menu-small.csv";
        List<Dish> dishes = dishParser.asList(dishesFilepath);
        dishes.forEach(System.out::println);

        System.out.println("Parsing developers!");
        DeveloperParser developerParser = new DeveloperParser();
        String developersFilepath = "src/oop/inheritance/parse/developers.csv";
        List<Developer> developers = developerParser.asList(developersFilepath);
        developers.forEach(System.out::println);
    }

}
