        /*Write a Java program to create an abstract class Animal with abstract methods eat() and 
        sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() 
        and sleep() methods differently based on their specific behavior*/

abstract class Animal{

    public abstract void eat();
    public abstract void sleep();


    class Lion extends Animal{

        public void eat(){
            System.out.println("Lion eat meat");

        }

        public void sleep() {
            System.out.println("Lion sleep on grassland");
        }

        class Tiger extends Animal{
        
        public void eat(){   
        System.out.println("Tiger eat meat");
        }

        public void sleep() {
            System.out.println()
        }


    }
    
}
}

