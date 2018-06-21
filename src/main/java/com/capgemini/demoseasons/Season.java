package com.capgemini.demoseasons;

public enum Season {

    SPRING, SUMMER, FALL {

        @Override
        public boolean liked() {
            return false;
        }
    },

    WINTER;


    public boolean liked() {
        return false;
    }


}
