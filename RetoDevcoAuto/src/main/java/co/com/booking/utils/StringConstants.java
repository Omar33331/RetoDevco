package co.com.booking.utils;

public enum StringConstants {

    ORIGIN("origin"),
    DESTINY("destiny"),
    START_DATE("startDate"),
    END_DATE("endDate"),
    ADULTS("adults"),
    CHILDREN("children"),
    BEDROOMS("bedrooms"),
    TIME_FLOW("timeFlow"),
    TIME_FROMAT("HHmmss"),
    DATE_FLOW("dateFlow"),
    DATE_FORMAT("yyyyMMdd"),

    ACOMODATIONS_FOUND("alojamientos encontrados"),
    ERROR_MESSAGE("Lo sentimos");

    private String value;

    StringConstants(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
