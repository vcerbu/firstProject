package com.endava.entity;

/**
 * Created by vcerbu on 3/15/2017.
 */
public class Publisher {
    private String group;
    private String parentCompany;
    private String country;

    public Publisher() {
    }

    public Publisher(String group, String parentCompany, String country) {
        this.group = group;
        this.parentCompany = parentCompany;
        this.country = country;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "group='" + group + '\'' +
                ", parentCompany='" + parentCompany + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
