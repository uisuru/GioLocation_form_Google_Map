/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

/**
 *
 * @author Isuru
 */
public class NewClass {

    public static void main(String[] args) {
        String s = "5° 56' 46.3\"", s1, s2, s3;
        s = s.replaceAll(" ", "");
        s1 = s.replaceAll(".*'", "").replaceAll("\"", "");
        s2 = s.replaceAll(".*°", "").replaceAll("'.*", "");
        s3 = s.replaceAll("°.*", "");
        //String ss = s.substring(s.lastIndexOf("'") + 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        double d1 = (Double.parseDouble(s1) / 60)/60;
        double d2 = Double.parseDouble(s2) / 60;
        double d3 = Double.parseDouble(s3) + d1 + d2;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
