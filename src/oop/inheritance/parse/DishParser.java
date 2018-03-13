package oop.inheritance.parse;

import java.util.function.Function;

public class DishParser extends AbstractParser<Dish> {

    @Override
    protected Function<String[], Dish> toObject() {
        return columns -> {
            Dish dish = new Dish();
            dish.setName(columns[0]);
            dish.setType(columns[1]);
            dish.setPrice(Double.parseDouble(columns[2]));
            return dish;
        };
    }

}
