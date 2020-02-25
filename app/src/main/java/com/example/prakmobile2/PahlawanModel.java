package com.example.prakmobile2;

import android.os.Parcel;
import android.os.Parcelable;

public class PahlawanModel implements Parcelable {


    String heroName,heroDetails;
    int heroesImages;



    public PahlawanModel() {

    }

    protected PahlawanModel(Parcel in) {
        heroName = in.readString();
        heroDetails = in.readString();
        heroesImages = in.readInt();
    }

    public static final Parcelable.Creator<PahlawanModel> CREATOR = new Parcelable.Creator<PahlawanModel>() {
        @Override
        public PahlawanModel createFromParcel(Parcel in) {
            return new PahlawanModel(in);
        }

        @Override
        public PahlawanModel[] newArray(int size) {
            return new PahlawanModel[][size];
        }
    };


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDetails() {
        return heroDetails;
    }

    public void setHeroDetails(String heroDetails) {
        this.heroDetails = heroDetails;
    }

    public int getHeroesImages() {
        return heroesImages;
    }

    public void setHeroesImages(int heroesImages) {
        this.heroesImages = heroesImages;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(heroName);
        dest.writeString(heroDetails);
        dest.writeInt(heroesImages);
    }
}
