public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    void sayHi() {
        System.out.println("Hi! My name is " + getName() + ", I’m " + getAge() + " years old");
    }
}
