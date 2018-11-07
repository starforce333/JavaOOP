package lesson01.cat;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String sex;


    public Cat(String name, String breed, int age, double weight, String sex) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public Cat() {
    }

    public String getName() {

        return name;
    }

    public void sayMeow() {
        System.out.println("Meow! Meow!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}

