import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    public List fizzBuzz(int n) {
        List list=new ArrayList<>();
        while(n>0){
            if(n%3==0 && n%5==0)
                list.add("FizzBuzz");
            else if(n%3==0)
                list.add("Fizz");
            else if(n%5==0)
                list.add("Buzz");
            else{
                int val=n;
                String value=String.valueOf(val);
                list.add(value);
            }
            n--;
        }
        Collections.reverse(list);
        return list;
    }
}
