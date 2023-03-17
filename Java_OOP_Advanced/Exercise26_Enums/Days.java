package Java_OOP_Advanced.Exercise26_Enums;

public enum Days {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    public boolean isWeekend;
    Days(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }
}