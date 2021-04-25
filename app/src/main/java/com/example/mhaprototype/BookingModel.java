package com.example.mhaprototype;

public class BookingModel {
    private float bookingID;
    private String date;
    private String time;
    private String cancelled;
    private String type;
    private float calendarID;
    private float pairID;


    // Getter Methods

    public float getBookingID() {
        return bookingID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCancelled() {
        return cancelled;
    }

    public String getType() {
        return type;
    }

    public float getCalendarID() {
        return calendarID;
    }

    public float getPairID() {
        return pairID;
    }

    // Setter Methods

    public void setBookingID(float bookingID) {
        this.bookingID = bookingID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCalendarID(float calendarID) {
        this.calendarID = calendarID;
    }

    public void setPairID(float pairID) {
        this.pairID = pairID;
    }
}
