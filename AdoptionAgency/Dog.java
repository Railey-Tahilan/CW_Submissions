// The Dog class represents a generic dog, with attributes like adoption status, age, and name.
package AdoptionAgency;

public class Dog {
    
    // Instance variables: 
    // isAdopted stores whether the dog has been adopted (true or false).
    // age stores the dog's age in years.
    // name stores the dog's name.
    protected boolean isAdopted;
    protected int age;
    protected String name;

    // Constructor for the Dog class. It initializes the dog's adoption status, age, and name.
    public Dog(boolean ad, int a, String name) {
        age = a;             // Sets the dog's age based on the argument passed.
        isAdopted = ad;      // Sets the adoption status based on the argument passed.
        this.name = name;    // Sets the dog's name based on the argument passed.
    }

    // This method returns the adoption status of the dog.
    public boolean getAdoptionStatus() {
        return isAdopted;  // Returns whether the dog is adopted (true) or not (false).
    }

    // This method prints out the dog's name and age in years.
    public void stateAge() {
        System.out.print(name + " is " + age + " years old");
    }

    // This method increments the dog's age by one year and prints that the dog has aged.
    public void increaseAge() {
        age++;  // Increases the dog's age by one.
        System.out.print(name + " has aged!");  // Prints that the dog has aged.
    }

    // The toString method provides a string representation of the dog.
    // It prints the dog's age and adoption status.
    public String toString() {
        stateAge();  // Prints the dog's name and age.
        System.out.println("");  // Moves to a new line.
        // If the dog is adopted, it returns a message indicating the dog is adopted.
        if (isAdopted == true) {
            return (name + " is adopted!");
        }
        // Otherwise, it returns a message indicating the dog is not adopted.
        else {
            return (name + " is NOT adopted!");
        }
    }

    // The equals method checks if two Dog objects are equal.
    // It compares the dog's age, name, and adoption status.
    public boolean equals(Dog doggy) {
        // Checks if the age, name, and adoption status are the same for both dogs.
        if (this.age == doggy.age && this.name.equals(doggy.name) && this.isAdopted == doggy.isAdopted) {
            return true;  // If all attributes match, the dogs are considered equal.
        }
        return false;  // If any attribute doesn't match, the dogs are not equal.
    }
}
