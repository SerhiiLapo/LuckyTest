/**
 * Created by Хонда on 25.12.2016.
 */
public class Yoda {
    public static void main(String[] args)
    {
        // sample text
        String text = "всё так да только наоборот";
        String result = reverseWords(text);
        System.out.println(result);

    }

    static String reverseWords(String s){
        if (s == null || s.length() == 0){
            return "";
        }
        //split words
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; -- i)
        {
            if (!arr[i].equals("")){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" :
                sb.substring(0, sb.length() - 1);
    }
}
