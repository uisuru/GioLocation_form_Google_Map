/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Isuru
 */
public class sasa {//2016:11:05 23:40:10 

    public static void main(String[] args) {
        String s = "Mon Nov 14 13:20:32 +05:30 2016", year, month = "01", date;     
        date = "01";
        year = s.replaceAll(".* ", "");
        String dd[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for (int i = 0; i < dd.length; i++) {
            if(s.contains(dd[i])){
                month = ""+ ++i;
            }
        }
        date =""+ s.charAt(8)+s.charAt(9);
    }
}
