import java.util.Scanner;

class question_9{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int[] s = new int[20];
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;
        for(int i = 0;i<s.length;i++)
        {
            System.out.println("Enter any 20 numbers ["+i+"]");
            s[i] = a.nextInt();

            if(s[i] > 0)
            {
                positive++;
            }
            else if(s[i] < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
            if(s[i] %2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Positive= "+positive+"\nNegative+ "+negative+"\nZero= "+zero+"\nodd= "+odd+"\neven= "+even);
    }
}