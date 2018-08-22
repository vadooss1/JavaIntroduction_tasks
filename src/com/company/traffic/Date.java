package com.company.traffic;

public class Date {
        protected int day, month, year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public String getDate(){
            return day + "." + month + "." + year;
        }
    }
