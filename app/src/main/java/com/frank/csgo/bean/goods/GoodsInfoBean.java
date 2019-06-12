package com.frank.csgo.bean.goods;

import java.io.Serializable;

public class GoodsInfoBean implements Serializable {
    /**
     * icon_url : https://g.fp.ps.netease.com/market/file/5aa02bbeee4c0f7336d3d136av4xEi3j
     * info : {"tags":{"exterior":{"category":"exterior","internal_name":"wearcategory1","localized_name":"略有磨损"},"quality":{"category":"quality","internal_name":"normal","localized_name":"普通"},"rarity":{"category":"rarity","internal_name":"rare_weapon","localized_name":"军规级"},"type":{"category":"type","internal_name":"csgo_type_machinegun","localized_name":"机枪"},"weapon":{"category":"weapon","internal_name":"weapon_negev","localized_name":"内格夫"}}}
     * item_id : null
     * original_icon_url : https://g.fp.ps.netease.com/market/file/5a7ae58202c9a1bb6a408ae1QZBNJWbR
     * steam_price : 0.24
     * steam_price_cny : 1.66
     */

    private String icon_url;
    private InfoBean info;
    private Object item_id;
    private String original_icon_url;
    private String steam_price;
    private String steam_price_cny;

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public Object getItem_id() {
        return item_id;
    }

    public void setItem_id(Object item_id) {
        this.item_id = item_id;
    }

    public String getOriginal_icon_url() {
        return original_icon_url;
    }

    public void setOriginal_icon_url(String original_icon_url) {
        this.original_icon_url = original_icon_url;
    }

    public String getSteam_price() {
        return steam_price;
    }

    public void setSteam_price(String steam_price) {
        this.steam_price = steam_price;
    }

    public String getSteam_price_cny() {
        return steam_price_cny;
    }

    public void setSteam_price_cny(String steam_price_cny) {
        this.steam_price_cny = steam_price_cny;
    }
}
