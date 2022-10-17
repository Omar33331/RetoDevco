package co.com.booking.models;

import java.util.Map;

public class Data {

    private static Map<String,Object> map;

    public Data() {
    }

    public static Map<String, Object> getMap() {
        return map;
    }

    public static void setMap(Map<String, Object> map) {
        Data.map = map;
    }

    public static String take(String aData){
        return (String) getMap().get(aData);

    }
}
