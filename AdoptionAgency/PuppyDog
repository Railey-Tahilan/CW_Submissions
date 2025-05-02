// This package declaration specifies that the class belongs to the AdoptionAgency package.
package AdoptionAgency;

// The PuppyDog class extends the Dog class, adding more specific functionality related to puppies.
public class PuppyDog extends Dog {
    
    // The isFed attribute indicates whether the puppy has been fed.
    protected boolean isFed;
    
    // Constructor for the PuppyDog class. It takes in a boolean for adoption status, an integer for age, 
    // a string for the puppy's name, and a boolean for the feeding status.
    public PuppyDog(boolean ad, int a, String n, boolean f) {
        // Calls the superclass constructor (Dog) to initialize common attributes.
        super(ad, a, n);
        isFed = f;  // Initializes the isFed status based on the argument passed.
    }

    // This method outputs the age of the puppy in months.
    public void stateAge() {
        // Prints out the name and age of the puppy.
        System.out.print(name + " is " + age + " months old");
    }

    // This method sets the isFed status to true, indicating the puppy has been fed.
    public void feedDog() {
        isFed = true;
    }

    // This method increases the puppy's age (by calling the increaseAge() method of the superclass).
    // It also resets the isFed status to false, indicating the puppy needs to be fed again.
    public void increaseAge() {
        // Calls the parent class method to increase the age.
        super.increaseAge();
        // Sets isFed to false, as the puppy is assumed to need food after aging.
        isFed = false;
        // Prints a message indicating the puppy has aged.
        System.out.print(name + " has aged!");
    }

    // The toString method overrides the parent class's toString method to include the feeding status.
    public String toString() {
        // If the puppy is fed, it appends the "has been fed" message.
        if (isFed == true) {
            return super.toString() + "\n" + name + " has been fed";
        }
        // If the puppy is not fed, it appends the "is hungry" message.
        else {
            return super.toString() + "\n" + name + " is hungry";
        }
    }

    // The equals method checks if two PuppyDog objects are equal based on their attributes.
    // It compares both the parent class's attributes and the feeding status.
    public boolean equals(PuppyDog doggy) {
        // First, checks equality based on the parent class's attributes and feeding status.
        if (super.equals(doggy) && this.isFed == doggy.isFed) {
            return true;
        }
        return false;
    }
}
