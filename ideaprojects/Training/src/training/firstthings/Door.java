package training.firstthings;

public class Door {
        public void open()
        {
            push();
        }

        private void push() { //When I later say "Super.Push()" I'm doing this.
            System.out.println("Pushing on door");
        }
}
class BankVaultDoor extends Door {
    //what is this called? Extends? Inheritance..
    //BankVaultDoor inherits from Door

    public void open () {
        enterCombination();
    }

    private void enterCombination() {
        System.out.println("combination entered");
       super.open();
    }
}
class GarageDoor extends Door {
    public void open(){
        System.out.println("Push the garage door button");
        //super.open(); <- we can do this, but I don't want to "push on door".
    }
}