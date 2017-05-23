package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by getinlight on 2017/5/21.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class sport {
        @SerializedName("txt")
        public String info;
    }

}
