public class Cat {
    private String name;
    private int age;

    public Cat(){
        this("Unnamed", 0);//"this" is a reference to the current object
        //this("Unnamed", 0) is a call to the constructor with two parameters
    }

    public Cat(String name, int age) {
        this.name = name;//"this" is a reference to the current object
        this.age = age;//"this" is a reference to the current object
    }

    public void setName(String name) {
        this.name = name;//"this" is a reference to the current object
    }
    public void setAge(int age) {
        this.age = age;//"this" is a reference to the current object
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
