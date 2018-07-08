package com.chosuwai.asarrtaline.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShopByDistanceVO {

    @SerializedName("shopByDistanceId")
    private String shopByDistanceId;

    @SerializedName("mealShop")
    private MealShopVO mealShop;

    @SerializedName("distanceInFeet")
    private double distanceInFeet;

    public String getShopByDistanceId() {
        return shopByDistanceId;
    }

    public MealShopVO getMealShop() {
        return mealShop;
    }

    public double getDistanceInFeet() {
        return distanceInFeet;
    }
}
