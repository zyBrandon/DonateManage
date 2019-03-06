package com.donate.api.model;

public class Hot {
    private String location;
    private String donation;
    private String reason;
    private String hot_time;

    public Hot(){

    }

    public Hot(String location,String donation,String reason,String hot_time){
        this.location = location;
        this.donation = donation;
        this.reason = reason;
        this.hot_time = hot_time;
    }

    public String getDonation() {
        return donation;
    }

    public String getHot_time() {
        return hot_time;
    }

    public String getLocation() {
        return location;
    }

    public String getReason() {
        return reason;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

    public void setHot_time(String hot_time) {
        this.hot_time = hot_time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
