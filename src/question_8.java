import java.util.Scanner;

class question_8
{
    public static void main(String args[])
    {
        int vowel=0, consonant=0, digit=0, white_space=0;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string= ");
        s=sc.nextLine();
        char str[] = s.toCharArray();
        int n= str.length;
        for(int i=0; i < n; i++)
        {
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
            {
                vowel++;
            }
            else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
            {
                consonant++;
            }
            else if(str[i]>='0' && str[i]<='9')
            {
                digit++;
            }
            else if (str[i]==' ')
            {
                white_space++;
            }

        }
        System.out.println("Vowels = "+vowel);
        System.out.println("Consonants = "+consonant);
        System.out.println("Digits = "+digit);
        System.out.println("White spaces = "+white_space);
    }
}