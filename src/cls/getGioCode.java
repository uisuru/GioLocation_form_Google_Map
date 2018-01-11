/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.AddressComponent;
import com.google.maps.model.AddressType;
import com.google.maps.model.GeocodingResult;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isuru
 */
public class getGioCode {

    GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyAhr55gEo-FlzZxO03U_rNMph3p5TSzhIY");
    GeocodingResult[] results;

    public double[] getGioCode(String location) throws Exception {
        double northeastLat = 0, northeastLng = 0, southwestLat = 0, southwestLng = 0;
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyAhr55gEo-FlzZxO03U_rNMph3p5TSzhIY");
        GeocodingResult[] results = GeocodingApi.geocode(context, location).await();
        for (GeocodingResult result : results) {
            northeastLat = result.geometry.bounds.northeast.lat;
            southwestLat = result.geometry.bounds.southwest.lat;
            northeastLng = result.geometry.bounds.northeast.lng;
            southwestLng = result.geometry.bounds.southwest.lng;
        }

        return new double[]{northeastLat, northeastLng, southwestLat, southwestLng};
    }

    public static void main(String[] args) {
        try {
            getGioCode abc = new getGioCode();
            double[] gioCode = abc.getGioCode("matara sri lanka");
            //System.out.println(gioCode[1] +"\n"+ gioCode[1]);
        } catch (Exception ex) {
            Logger.getLogger(getGioCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
/*
    public getGioCode(String location) throws Exception {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyAhr55gEo-FlzZxO03U_rNMph3p5TSzhIY");
        GeocodingResult[] results = GeocodingApi.geocode(context, location).await();
        for (GeocodingResult result : results) {
            System.out.println(result.formattedAddress);
            System.out.println(result.geometry.location);
            System.out.println(result.geometry.bounds.northeast);
            System.out.println(result.geometry.bounds.southwest);
            AddressComponent[] s = result.addressComponents;//Matara Matara Southern Province Sri Lanka
            for (AddressComponent item : s) {
                System.out.println(item.longName);
            }
        }
        return 
    }
*/
