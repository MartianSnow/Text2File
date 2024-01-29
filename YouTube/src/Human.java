public class Human {
    String name;
    int age;
    int weight;
    static int humans;

    Human (String a, int b, int c){
        this.name = a;
        this.age = b;
        this.weight = c;
        humans++;
    }

    void eat (){
        System.out.println(this.name + " is eating food.");
    }
}

