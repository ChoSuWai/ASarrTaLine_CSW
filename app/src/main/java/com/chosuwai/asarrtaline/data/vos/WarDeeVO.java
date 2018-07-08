package com.chosuwai.asarrtaline.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WarDeeVO {

    @SerializedName("warDeeId")
    private String warDeeId;

    @SerializedName("name")
    private String warDeeName;

    @SerializedName("images")
    private List<String> warDeeImages;

    @SerializedName("generalTaste")
    private List<GeneralTasteVO> generalTaste;

    @SerializedName("suitedFor")
    private List<SuitedForVO> suitedFor;

    @SerializedName("priceRangeMin")
    private int priceRangeMin;

    @SerializedName("priceRangeMax")
    private int priceRangeMax;

    @SerializedName("matchWarDeeList")
    private List<MatchWarDeeListVO> matchWarDeeList;

    @SerializedName("shopByDistance")
    private List<ShopByDistanceVO> shopByDistance;

    @SerializedName("shopByPopularity")
    private List<ShopByPopularityVO> shopByPopularity;

    public String getWarDeeId() {
        return warDeeId;
    }

    public String getWarDeeName() {
        return warDeeName;
    }

    public List<String> getWarDeeImages() {
        return warDeeImages;
    }

    public List<GeneralTasteVO> getGeneralTaste() {
        return generalTaste;
    }

    public List<SuitedForVO> getSuitedFor() {
        return suitedFor;
    }

    public int getPriceRangeMin() {
        return priceRangeMin;
    }

    public int getPriceRangeMax() {
        return priceRangeMax;
    }

    public List<MatchWarDeeListVO> getMatchWarDeeList() {
        return matchWarDeeList;
    }

    public List<ShopByDistanceVO> getShopByDistance() {
        return shopByDistance;
    }

    public List<ShopByPopularityVO> getShopByPopularity() {
        return shopByPopularity;
    }
}
