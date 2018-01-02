package training.firstthings;

public class Point {
    int x;
    int y;

    //define a constructor - which seems to do nothing at this point
    //  other than require that a new Point has two variables
    //  so that's something, it makes them required
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //furthermore, we can recreate the 'default' constructor
    //  so that we're not 'required' to enter values anymore

    Point(){
        this(0,0); //<- Now saying, "this" in this context really confuses me.
                        //maybe it's saying "for This object, set these two values"
    }

    /*
    * Notice the usage of the this keyword here.
    * We can use it within a constructor to call a different constructor (in order to avoid code duplication).
    *               It can only be the first line within the constructor.
        We also used the this keyword as a reference of the current object we are running on.
    * */
    void printPoint(){
        System.out.println("(" + x + "," + y + ")");
    }

    Point center(Point other){
        //returns the center between this point and the other point
        // since this is an int, we're having to drop the precision
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }
}
