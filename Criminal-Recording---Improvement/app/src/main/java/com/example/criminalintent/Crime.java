package com.example.criminalintent;

import android.text.format.Time;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private String mDesc;
    private Date mDate;
    private Time mTime;
    private  boolean mSolved;

    public Crime() {
        // Generates a unique random number for the ID
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public Date getmDate() {
        return mDate;
    }

    public Time getmTime() {
        return mTime;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmTime(Time mTime) {
        this.mTime = mTime;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
