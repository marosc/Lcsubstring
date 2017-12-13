/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcsubstring;


/**
 *
 * @author maros
 */
public class Lcsubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(long_substr(new String[]{
        "Marosovi","Maros"
        }));
    }

    public static String long_substr(String[] data) {
        //Finds the longest common string in any arbitrary array of strings
        String substr = "";
        if (data.length > 1 && data[0].length() > 0) {
            for (int i = 0; i < data[0].length(); i++) {
                for (int j = 0; j < data[0].length() - i + 1; j++) {
                    if (j > substr.length() && ( is_substr(data[0].substring(i,i+j), data) )){
                        substr = data[0].substring(i,i+j);
                    }
                }
            }
        }
        return substr;
    }
    
    public static boolean is_substr(String find, String[] data) {
        if (data.length < 1 && find.length() < 1) {
            return false;
        }
      
        for (int i = 0; i < data.length; i++) {
            if (!data[i].contains(find)) {
                return false;
            }
        }
        return true;
    }
}
