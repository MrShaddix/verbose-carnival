package training.firstthings;

public class Student {
    //Non static methods in Java are used more than static methods.
    //Those methods can only be run on objects and not on the whole class. (woke!)
    //Non static methods can access and alter the field of the object.
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
