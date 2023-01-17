package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import javax.swing.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserPlans {

    @Id
    @GeneratedValue
    private final UUID id;

    @Column(name = "username", nullable = false)
    private final String username;
    private final String password;

    @OneToMany (mappedBy = "UserPlans", cascade = CascadeType.ALL)
    private final List<TripPlan> tripPlans;

    public UserPlans(UUID id, String username, String password, List<TripPlan> tripPlans) {
        this.id = id;
        this.username= username;
        this.password = password;
        this.tripPlans = tripPlans;
    }

    public UUID getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public List<TripPlan> getTripPlans() {
        return tripPlans;
    }

    @Entity
    @Table(name="trip_plans")
    public class TripPlan {


        private final Hotel hotel;
        private final Transport transport;
        private final Activity activity;
        private final Food food;

        public TripPlan(Hotel hotel, Transport transport, Activity activity, Food food) {
            this.hotel = hotel;
            this.transport = transport;
            this.activity = activity;
            this.food = food;
        }

        public Hotel getHotel() {
            return hotel;
        }
        public Transport getTransport() {
            return transport;
        }
        public Activity getActivity() {
            return activity;
        }
        public Food getFood() {
            return food;
        }


        public class Hotel {
            private final String hotelName;
            private final String stayDate;
            private final Float price;
            private final String checkinTime;
            private final String checkoutTime;
            private final String siteLink;

            public Hotel(String hotelName, String stayDate, Float price, String checkinTime, String checkoutTime, String siteLink) {
                this.hotelName = hotelName;
                this.stayDate = stayDate;
                this.price = price;
                this.checkinTime = checkinTime;
                this.checkoutTime = checkoutTime;
                this. siteLink = siteLink;
            }

            public String getHotelName() {
                return hotelName;
            }
            public String getStayDate() {
                return stayDate;
            }
            public Float getPrice() {
                return price;
            }
            public String getCheckinTime() {
                return checkinTime;
            }
            public String getCheckoutTime() {
                return checkoutTime;
            }
            public String getSiteLink() {
                return siteLink;
            }

        }



        //  Transport Backend

        public class Transport {
            private final String transportCompany;
            private final String type;
            private final String deptDate;
            private final String arrivalDate;
            private final Float price;
            private final String boardTime;
            private final String arrivalTime;
            private final String siteLink;

            public Transport(String transportCompany, String type, String deptDate, String arrivalDate, Float price, String boardTime, String arrivalTime, String siteLink) {
                this.transportCompany = transportCompany;
                this.type = type;
                this.deptDate = deptDate;
                this.arrivalDate = arrivalDate;
                this.price = price;
                this.boardTime = boardTime;
                this.arrivalTime = arrivalTime;
                this.siteLink = siteLink;
            }

            public String getTransportCompany() {
                return transportCompany;
            }
            public String getType() {
                return type;
            }
            public String getDeptDate() {
                return deptDate;
            }
            public String getArrivalDate() {
                return arrivalDate;
            }
            public Float getPrice() {
                return price;
            }
            public String getBoardTime() {
                return boardTime;
            }
            public String getArrivalTime() {
                return arrivalTime;
            }
            public String getSiteLink() {
                return siteLink;
            }


        }
        public class Activity {
            private final String name;
            private final String startDate;
            private final Float price;
            private final String startTime;
            private final String endTime;
            private final String siteLink;

            public Activity(String name, String startDate, Float price, String startTime, String endTime, String siteLink) {
                this.name = name;
                this.startDate = startDate;
                this.price = price;
                this.startTime = startTime;
                this.endTime = endTime;
                this.siteLink = siteLink;
            }

            public String getName() {
                return name;
            }
            public String getStartDate() {
                return startDate;
            }
            public Float getPrice() {
                return price;
            }
            public String getStartTime() {
                return startTime;
            }
            public String getEndTime() {
                return endTime;
            }
            public String getSiteLink() {
                return siteLink;
            }
        }
        public class Food {
            private final String name;
            private final String date;
            private final Float price;
            private final String rezTime;
            private final String siteLink;

            public Food(String name, String date, Float price, String rezTime, String siteLink) {
                this.name = name;
                this.date = date;
                this.price = price;
                this.rezTime = rezTime;
                this.siteLink = siteLink;
            }

            public String getName() {
                return name;
            }
            public String getDate() {
                return date;
            }
            public Float getPrice() {
                return price;
            }
            public String getRezTime() {
                return rezTime;
            }
            public String getSiteLink() {
                return siteLink;
            }

        }



    }
}
