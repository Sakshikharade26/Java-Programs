abstract  class Demo { 
    public int A;
    public int B;

    public Demo(){
        System.out.println("Inside Constructor");
        this.A=0;
        this.B=0;

    }

    abstract void fun();
    void run(){

    }
    void gun()
    {

    }

}

class Hello extends Demo{
    void fun(){
        System.out.println("Fun method Inside Hello");
    }

    void run(){

    }

}

class AbstractDemo{

    public static void main(String args[]){
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();

    }
}
