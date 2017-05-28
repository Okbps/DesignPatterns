package com.ch11Proxy.person;

/**
 * Created by Aspire on 28.05.2017.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
