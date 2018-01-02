package training.firstthings;

public class Main {

    public static void main(String[] args) {
	/*                    /// ^ these args are captured at run time from command prompt
        write your code here
        http://www.learnjavaonline.org/en/arrays
        Ctrl + J = all SNIPPETS!!!
        CTRL +SHIFT + ALT + T? brings up the refactor menu item (which is also just right there
        Alt+Enter = [refactor bulb]
        STATIC means this method belongs to the class Main and not to a specific instance of Main.
            Which means we can call the method from a different class like that Main.foo().

        QUESTIONS
        - I don't understand abstract classes? Are they just classes which can't exist on their own?
        - Why use inheritance vs an interface? Seems very similiar to how abstract classes work

        */


        InterfaceExample();
    	//InheritanceExample();
        //ObjectExample();
	    //MethodSample();
	    //BreakContinue();
        //BeyondBasics();
        //Equals();
        //arrays();
        //Loops();
    }

    private static void InterfaceExample() {
        //Interfaces are class templates -> see Animal
        //Why use interfaces vs classes?
        Dog spot = new Dog();
        spot.groom();

        Tiger tiger = new Tiger();
        tiger.feed();
        tiger.groom();


/*
Think of cutting a duck decoy from a block of wood.
 First, a template is used to trace the pattern onto the wood.
 Then, when the wood is cut, it resembles the template.
 At this point, however, neither the template nor the wood have
    any of the fine details that one would expect from a finished decoy.
 The template was used to define basic characteristics, not precise details.
 After multiple duck-shaped pieces have been cut, each one can be carved
        and decorated uniquely. Yet, they all have the same basic size and shape.

An interface is generally used as a template for multiple classes.
These classes all share the methods defined in the interface.
However, the implementation of the methods may vary from one class to another.
 */
    }

    private static void InheritanceExample() {
        /*
        "Think of a door. It doesn't matter what kind.
        All doors open and close.
        However, some doors open differently than others
            (lifting up vs swinging out, swinging in vs sliding across).
        So, let's say Door is the superclass for a door and it has an open method.
        The method is simple. It's only instruction is push."
         */

        Door door = new Door();
        door.open();
        System.out.println("Now the Bank Door Example ");
        BankVaultDoor bankDoor = new BankVaultDoor();
        bankDoor.open();
        System.out.println("Next example");
        GarageDoor ryansFancyNewGarageDoor = new GarageDoor();
        ryansFancyNewGarageDoor.open();

        // * this would usually just call Open and then entercombination
        // However, I included "Super.Open()" to also call the parent's open() method
        // so i called Open twice, but only specified the difference by saying "super", neat?
    }

    private static void ObjectExample() {
        Point p = new Point(); //<-Newing up, this is a constructor which does nothing
        System.out.println("Hey");
    }

    private static void MethodSample() {
        //represents the 'bar' method in the online example, thingy
        int a = 3;
        int b = 5;
        Bar(a,b);
        //Now with Objects!
        Student Joe = new Student();
        Student Jack = new Student();

        Joe.setName("Joseph");
        Jack.setName("Jackson");
        Bar2(Joe, Jack);
    }
    private static void Bar2(Student joe, Student jack){
        System.out.println("The names are " + joe.getName() + " and " + jack.getName());
        Student s1 = joe;
        System.out.println("S1's name is " + s1.getName());
        s1.setName("Mariah");
        System.out.println("S1 and Joe's names are " + s1.getName() + " and " + joe.getName());
        // this totally confuses it as s1 ='s joe -- so they're the SAME object! (WTF)

    }
    private static void Bar(int num1, int num2) {
        System.out.println("Number one equals " + num1 + " and number two is " + num2);
    }

    private static void BreakContinue() {
        //so continue just skips to the next iteration
        //Break exits the loop

        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            if (i == 1) System.out.println("i ='s 1");
            if (i >= 3) break;
            System.out.println("Yuhu");
            if(i >=1) continue;
            System.out.println("tata");
            System.out.println(i);
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
           if (i >= 3) continue;
            System.out.println("end of iteration");
        }

    }

    private static void Loops() {
        int[] arr = {1,2,3};
        // this is really the only thing that's at all new-ish
        System.out.println("for Loop");
        for (int i : arr) System.out.println(i);

        

    }

    private static void arrays() {
        System.out.println("arrays!");
        int[] arr1;
        arr1 = new int[10];
        System.out.println(arr1.length);
        arr1[0] = 4;
        arr1[1] = arr1[0] + 5;
        Printarray(arr1);
        int[] arr2 = {1,2,3,4,5};
        Printarray(arr2);

    }

    private static void Printarray(int[] arr) {
        System.out.println("Begin Loop");
        for(int i = 0; i < 5; i++)
            System.out.println(arr[i]);
        System.out.println("End Loop");
    }

    private static void BeyondBasics(){
        System.out.println("how long is it going to take to learn this stuff?");
        int a = 4;
        int result = a == 4 ? 1 : 8;
        //     if a = 4, then 1, else 8
        System.out.println(result);
        System.out.println(a == 2 ? 1:8);
        // if a = 2, then 1, else 8 -- done without using the variable...fml
    }
    static void Equals(){  // why does this need to be static and not public (beacuse it's not necessary)??
                            // btw, Ctrl + . collapses this
        String a = new String("TurkeyLeg");
        String b = new String("TurkeyLeg");
        String sameA = a;

        System.out.println("Begin Equals stuff");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == sameA);

    }

}
