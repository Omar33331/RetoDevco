package co.com.booking.utils;

public enum NumberConstants {

    TWO(2);

    private int value;

    NumberConstants(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
