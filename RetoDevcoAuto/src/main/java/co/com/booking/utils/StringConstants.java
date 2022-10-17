package co.com.booking.utils;

public enum StringConstants {


    DESTINY("destiny"),
    START_DATE("startDate"),
    END_DATE("endDate"),
    ADULTS("adults"),
    CHILDREN("children"),
    BEDROOMS("bedrooms"),
    ACOMODATIONS_FOUND("alojamientos encontrados");

    private String value;

    StringConstants(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
