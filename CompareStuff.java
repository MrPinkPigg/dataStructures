/*public class CompareStuff
{
public static void main(){
Blah x = new Blah("Blue");
Blah y = new Blah("Green");
System.out.println(x.compareTo(y));
}
}*/

import java.util.*;
public class CompareStuff
{
    public static void main(){
        ArrayList <Blah> x = new ArrayList() ;
        int y = 0;
        while(y < 20){
            if(Math.random() < .5)
                x.add(new Blah("Green"));
            else
                x.add(new Blah("Blue"));
            y++;
        }
        for(Blah b : x){
            System.out.println(b.wat);
        }
        System.out.println("SORTED");
        Collections.sort(x);
        for(Blah b : x){
            System.out.println(b.wat);
        }
    }
}