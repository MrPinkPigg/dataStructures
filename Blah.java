public class Blah implements Comparable
{
    String wat;

    public Blah(String s){
        wat = s;
    }

    public int compareTo(Object o){
        Blah x = (Blah) o;
        if(wat.equals("Blue")){
            if(x.wat.equals("Blue"))
                return 0;
            if(x.wat.equals("Green"))
                return 1;
        }
        else if(wat.equals("Green")){
            if(x.wat.equals("Blue"))
                return -1;
            if(x.wat.equals("Green"))
                return 0;
        }
        return 0;
    }
}