class demo
{
    public static boolean[]map=new boolean [26];
    public static void Duplicate(int index, String S, String subString )
    {
        if(index==S.length())
        {
            System.out.println(subString);
            return;
        }
        char currentchar=S.charAt(index);
        if(map[currentchar-'a']==true)
        {
            Duplicate(index+1, S, subString);

        }else
        {
            subString+=currentchar;
            map[currentchar-'a']=true;
            Duplicate(index+1, S, subString);

        }

    }
    public static void main(String []args)
    {
        String S="abcdcfcvxcaf";
        String subString="";
        Duplicate(0, S, subString);
    }
}
