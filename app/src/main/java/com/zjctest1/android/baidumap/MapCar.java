package com.zjctest1.android.baidumap;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:一句话描述
 */

public class MapCar implements Parcelable {
    private double latitude;
    private double longitude;
    private int imgId;
    private String name;

    static List<MapCar> infos = new ArrayList<MapCar>();

    static {
        infos.add(new MapCar(28.6876884562, 115.8645218847, R.mipmap.placeholder, "共享车位001"));
        infos.add(new MapCar(28.6568828299, 115.8350762063, R.mipmap.placeholder, "共享车位002"));
        infos.add(new MapCar(28.6667491455, 115.8110128188, R.mipmap.placeholder, "共享车位003"));
        infos.add(new MapCar(28.6833061930, 115.9299075035, R.mipmap.placeholder, "共享车位004"));
        infos.add(new MapCar(28.7426815315, 115.8448061446, R.mipmap.placeholder, "共享车位005"));
        infos.add(new MapCar(28.6596980000, 115.8502240000, R.mipmap.placeholder, "共享车位006"));

        infos.add(new MapCar(28.6286374925,115.7991690925, R.mipmap.placeholder, "共享车位007"));
        infos.add(new MapCar(28.6683537235,115.9254639589, R.mipmap.placeholder, "共享车位008"));
        infos.add(new MapCar(28.6437382553,115.8427890829, R.mipmap.placeholder, "共享车位009"));
        infos.add(new MapCar(28.6885984562,115.8688118847, R.mipmap.placeholder, "共享车位0010"));
        infos.add(new MapCar(28.6928417488,115.8634726735, R.mipmap.placeholder, "共享车位0011"));

        infos.add(new MapCar(28.6669866515,115.9062423304, R.mipmap.placeholder, "共享车位0012"));
        infos.add(new MapCar(28.6814488002,115.8949715201, R.mipmap.placeholder, "共享车位0013"));
        infos.add(new MapCar(28.7321940651,115.8493055960, R.mipmap.placeholder, "共享车位0014"));
        infos.add(new MapCar(28.6391289059,115.8648194633, R.mipmap.placeholder, "共享车位0015"));
        infos.add(new MapCar(28.5853719258,115.7931528465, R.mipmap.placeholder, "共享车位0016"));

        infos.add(new MapCar(28.5810410000,115.8845160000, R.mipmap.placeholder, "共享车位0017"));
        infos.add(new MapCar(28.5811000000,115.8851590000, R.mipmap.placeholder, "共享车位0018"));
        infos.add(new MapCar(28.5807200000,115.8848890000, R.mipmap.placeholder, "共享车位0019"));
        infos.add(new MapCar(28.5804360000,115.8845120000, R.mipmap.placeholder, "共享车位0020"));
        infos.add(new MapCar(28.5803910000,115.8841260000, R.mipmap.placeholder, "共享车位0021"));

        infos.add(new MapCar(28.5803650000,115.8820280000, R.mipmap.placeholder, "共享车位0022"));
        infos.add(new MapCar(28.5796480000,115.8830430000, R.mipmap.placeholder, "共享车位0023"));
        infos.add(new MapCar(28.5817590000,115.8852890000, R.mipmap.placeholder, "共享车位0024"));
        infos.add(new MapCar(28.5832080000,115.8902880000, R.mipmap.placeholder, "共享车位0025"));
        infos.add(new MapCar(28.5839090000,115.8899110000, R.mipmap.placeholder, "共享车位0026"));
    }

    public MapCar(double latitude, double longitude, int imgId, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.imgId = imgId;
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public MapCar setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public double getLongitude() {
        return longitude;
    }

    public MapCar setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public int getImgId() {
        return imgId;
    }

    public MapCar setImgId(int imgId) {
        this.imgId = imgId;
        return this;
    }

    public String getName() {
        return name;
    }

    public MapCar setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeInt(this.imgId);
        dest.writeString(this.name);
    }

    public MapCar() {
    }

    protected MapCar(Parcel in) {
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.imgId = in.readInt();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<MapCar> CREATOR = new Parcelable.Creator<MapCar>() {
        @Override
        public MapCar createFromParcel(Parcel source) {
            return new MapCar(source);
        }

        @Override
        public MapCar[] newArray(int size) {
            return new MapCar[size];
        }
    };

    @Override
    public String toString() {
        return "MapCar{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                '}';
    }
}
