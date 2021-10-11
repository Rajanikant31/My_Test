class question_7
{
    public static void main(String[] args){
        String word = "Umbrella";
        boolean flag = false;
        for(int i = 0;i < word.length(); i++)
        {
            if(word.charAt(i) == 'e')
            {
                flag=true;
                break;
            }
        }
        if(flag==true)

        System.out.println("e is present");
        else
            System.out.println("e is not present");
    }
}