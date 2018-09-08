package com.epam.atm.api.model;


public class User {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Company company;
    private Address address;

    private class Company {

        private String name;
        private String catchPhrase;
        private String bs;
    }

    private class Address {

        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;
    }

    private class Geo {

        private String lat;
        private String lng;
    }
}