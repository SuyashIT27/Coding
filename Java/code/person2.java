public class person2{
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static <Person2> void main(String[] args) {
        Person2 person1;
        person1 = new Person2();
        person1.setName("Alice");
        person1.setAge(25);
        person1.setCountry("USA");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Country: " + person1.getCountry());
    }
}

