package helloworld_stevenjin;

/**
 *
 * @author JZSUPERME
 */
public class Person {
    private String Language;
    private int age;
    private char gender;
    
    public Person(String Language, char gender){
        this.Language=Language;
        this.age=0;
        this.gender=gender;
    }
    
    public void grow(int howmuch){
        this.age+=howmuch;
        System.out.println("I am " + age + " years old");
    }
    
    public void ILoveYou(){
    if(age<=4)
        System.out.println("AHHHHAHAHHASHAIHSUHIahSA");
    else {
    if(this.Language.equals("English"))
        System.out.println("I love you ");
    else if(this.Language.equals("French"))
        System.out.println("je t'aime");
    else if(this.Language.equals("Chinese"))
        System.out.println("我爱你");
    else if(this.Language.equals("Indian"))
        System.out.println("vivian");
    else if(this.Language.equals("Japaness"))
        System.out.println("爱してる");
    else if(this.Language.equals("Korean"))
        System.out.println("사랑해요");
    else if(this.Language.equals("Russain"))
        System.out.println("Я тебя люблю ya jiebia liubliu");
    }
    }
    public  String Gender(){
        if (this.gender=='f')
        return "♀";
        else
        return "♂";
    }
    public void sayGoodbye(){
    System.out.println("Goodbye");
    }
     
    
}
