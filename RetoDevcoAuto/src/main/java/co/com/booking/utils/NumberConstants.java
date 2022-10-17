package co.com.booking.utils;

public enum NumberConstants {

    ZERO(0),
    TWO(2),
    THREE(3);

    private int value;

    NumberConstants(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
