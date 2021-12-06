package pract16.ex2;

public class Dish implements Item{
    final int cost;
    final String name;
    final String description;

    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(int cost, String name, String description){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }


    @Override
    public String getname() {
        return this.name;
    }

    @Override
    public String getDiscription() {
        return this.description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String toString(){
        return("Name " + this.name + " | Description " + this.description + " | cost " + this.cost);
    }
}
