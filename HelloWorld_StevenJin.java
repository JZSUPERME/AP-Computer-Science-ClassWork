package helloworld_stevenjin;

/**
 * This is the main class in HelloWorld program;
 * @author:Steven Jin
 * 2017/12/07
 * Instructor: Daniel Gunn
 */

public class HelloWorld_StevenJin {

    public static void main(String[] args) {
         Person Steven = new Person("Japaness",'m');
         Person Judy = new Person("Indian",'f');//Steven==Instance
         Steven.grow(7);
         Judy.grow(2);
         Steven.ILoveYou();
         Judy.ILoveYou();
         System.out.println(Steven.Gender());
         System.out.println(Judy.Gender());
         Steven.sayGoodbye();
         Judy.sayGoodbye();
    }
    
}
