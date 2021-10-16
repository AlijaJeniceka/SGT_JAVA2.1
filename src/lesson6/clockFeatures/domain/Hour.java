package lesson6.clockFeatures.domain;

/**
 * Hour should represent a value between 0 and 24
 */
public class Hour {

    private byte hour;

    public Hour() {
    }

    public Hour(byte hour) {
        this.setHour(hour);
    }

    public byte getHour() {
        return hour;
    }

    /**
     * validation is in place
     * short values between 0 and 24 are allowed
     * @param hour - byte
     */
    public void setHour(byte hour) {
        if(hour <0 ){
            //Throw an error "Number is too small"
            return;
        }else if(hour > 24){
            //Throw an error"Number is too large"
            return;
        }
        this.hour = hour;
    }
}
