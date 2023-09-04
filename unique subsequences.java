import java.util.HashSet;

class demo
{
    public static void Subsequenses(int index, String S, String substring,HashSet<String>set)
    {
        if(index==S.length())
        {
           if(set.contains(substring))
           {
            return;
           }
           else
           {
             System.out.println(substring);
             set.add(substring);
             return;
           }
            
            
        }
        char currentChar=S.charAt(index);
        Subsequenses(index+1, S, substring+currentChar,set);

        Subsequenses(index+1, S, substring,set);
    }

    public static void main(String []args)
    {
        String S="aaa";
        String suString="";
        HashSet<String>set=new HashSet<>();
        Subsequenses(0, S, suString,set);
    }
}
