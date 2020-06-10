package strings;

import java.util.ArrayList;

public class StringPermutation {

    public static void main(String[] args) {


        ArrayList<String>result= findPermutation("abc");
        for(String s: result)
        {
            System.out.println(s);
        }
    }
    public static ArrayList<String> findPermutation(String str)
    {
        ArrayList<String > perm=new ArrayList<>();
        perm.add(new String());

        char[] strArray=str.toCharArray();

        for(char c: strArray)
        {

            ArrayList<String> temp=new ArrayList<>();
            for(String s: perm)
            {
                for(int i=0;i<s.length();i++)
                {
                    temp.add(new String(s.substring(0,i)+c+s.substring(i,s.length())));
                }
                temp.add(new String (s+c));
            }
            perm=temp;

        }

    return perm;

    }
}
