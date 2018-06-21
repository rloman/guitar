package com.capgemini.demoseasons;

public class Tourist {

    private String name;

    private Season myFavouriteSeason;

    private Season myLeastFavouriteSeason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getMyFavouriteSeason() {
        return myFavouriteSeason;
    }

    public void setMyFavouriteSeason(Season myFavouriteSeason) {
        this.myFavouriteSeason = myFavouriteSeason;
    }

    public Season getMyLeastFavouriteSeason() {
        return myLeastFavouriteSeason;
    }

    public void setMyLeastFavouriteSeason(Season myLeastFavouriteSeason) {
        this.myLeastFavouriteSeason = myLeastFavouriteSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // now I am going deeper in it ...
        Tourist tourist = (Tourist) o;

        return name != null ? name.equals(tourist.name) : tourist.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", myFavouriteSeason=" + myFavouriteSeason +
                ", myLeastFavouriteSeason=" + myLeastFavouriteSeason +
                '}';
    }


}
