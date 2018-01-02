package training.firstthings;

   interface Animal {
        void feed();
        void groom();
        void pet();
   }

class Dog implements Animal {
    public void feed(){
        System.out.println("Dog eats twice a day");

    }
    public void groom(){
        System.out.println("Nice clean dogo");
    }
    public void pet(){
        System.out.println("Good dogo");
    }
}

class Tiger implements Animal {
    public void feed(){
        System.out.println("Watch your fingers");

    }
    public void groom(){
        System.out.println("Be careful");
    }
    public void pet(){
        System.out.println("You are in grave danger!");
    }
}