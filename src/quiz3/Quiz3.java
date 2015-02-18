
package quiz3;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Quiz3 {

    static List<Integer> numbers = new ArrayList<Integer>();
    public static void main(String[] args) {
        int i=0;
        while(i<50)
        {             
            String input = JOptionPane.showInputDialog("Enter any number or type X to exit");
            System.out.println(input);
            if(input.equals("X"))
            {
                break;
            }
            numbers.add(Integer.parseInt(input));         
            i++;
        }
        ascending();
        descending();
    }
    public static void ascending()
    {
        int length = numbers.size();
        System.out.println("Ascending Order:");
        int x=0;
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length;j++)
            {
                if(numbers.get(j-1)>numbers.get(j))
                {
                    x = numbers.get(j-1);
                    numbers.set(j-1,numbers.get(j));
                    numbers.set(j,x);
                }
            }
        }
        for(int i = 0; i < numbers.size(); i++)
        {   
            System.out.println(numbers.get(i));
        }

    }
    public static void descending()
    {
        int length = numbers.size();
        System.out.println("Descending Order:");
        int x=0;
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length;j++)
            {
                if(numbers.get(j-1)<numbers.get(j))
                {
                    x = numbers.get(j-1);
                    numbers.set(j-1,numbers.get(j));
                    numbers.set(j,x);
                }
            }
        }
        for(int i = 0; i < numbers.size(); i++)
        {   
            System.out.println(numbers.get(i));
        }
    }
    
}
