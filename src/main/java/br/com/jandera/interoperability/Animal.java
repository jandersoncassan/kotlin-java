package br.com.jandera.interoperability;

public class Animal {

    private final String name;
    private final String kind;
    private Integer weight;

    public Animal(Integer weight, String kind, String name) {
        this.weight = weight;
        this.kind = kind;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String show(){
        return name + " is a " + kind + " and weights " + weight + " kg!";
    }
}
