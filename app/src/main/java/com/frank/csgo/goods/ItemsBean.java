package com.frank.csgo.goods;

import java.io.Serializable;

public class ItemsBean implements Serializable {
    /**
     * appid : 730
     * bookmarked : false
     * buy_max_price : 1.3
     * buy_num : 6
     * game : csgo
     * goods_info : {"icon_url":"https://g.fp.ps.netease.com/market/file/5aa02bbeee4c0f7336d3d136av4xEi3j","info":{"tags":{"exterior":{"category":"exterior","internal_name":"wearcategory1","localized_name":"略有磨损"},"quality":{"category":"quality","internal_name":"normal","localized_name":"普通"},"rarity":{"category":"rarity","internal_name":"rare_weapon","localized_name":"军规级"},"type":{"category":"type","internal_name":"csgo_type_machinegun","localized_name":"机枪"},"weapon":{"category":"weapon","internal_name":"weapon_negev","localized_name":"内格夫"}}},"item_id":null,"original_icon_url":"https://g.fp.ps.netease.com/market/file/5a7ae58202c9a1bb6a408ae1QZBNJWbR","steam_price":"0.24","steam_price_cny":"1.66"}
     * has_buff_price_history : true
     * id : 35754
     * market_hash_name : Negev | Dazzle (Minimal Wear)
     * name : 内格夫 | 眩目 (略有磨损)
     * quick_price : 0
     * sell_min_price : 4.84
     * sell_num : 14
     * sell_reference_price : 1.66
     * steam_market_url : https://steamcommunity.com/market/listings/730/Negev%20%7C%20Dazzle%20%28Minimal%20Wear%29
     * transacted_num : 0
     */

    private int appid;
    private boolean bookmarked;
    private String buy_max_price;
    private int buy_num;
    private String game;
    private GoodsInfoBean goods_info;
    private boolean has_buff_price_history;
    private int id;
    private String market_hash_name;
    private String name;
    private String quick_price;
    private String sell_min_price;
    private int sell_num;
    private String sell_reference_price;
    private String steam_market_url;
    private int transacted_num;

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public String getBuy_max_price() {
        return buy_max_price;
    }

    public void setBuy_max_price(String buy_max_price) {
        this.buy_max_price = buy_max_price;
    }

    public int getBuy_num() {
        return buy_num;
    }

    public void setBuy_num(int buy_num) {
        this.buy_num = buy_num;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public GoodsInfoBean getGoods_info() {
        return goods_info;
    }

    public void setGoods_info(GoodsInfoBean goods_info) {
        this.goods_info = goods_info;
    }

    public boolean isHas_buff_price_history() {
        return has_buff_price_history;
    }

    public void setHas_buff_price_history(boolean has_buff_price_history) {
        this.has_buff_price_history = has_buff_price_history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarket_hash_name() {
        return market_hash_name;
    }

    public void setMarket_hash_name(String market_hash_name) {
        this.market_hash_name = market_hash_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuick_price() {
        return quick_price;
    }

    public void setQuick_price(String quick_price) {
        this.quick_price = quick_price;
    }

    public String getSell_min_price() {
        return sell_min_price;
    }

    public void setSell_min_price(String sell_min_price) {
        this.sell_min_price = sell_min_price;
    }

    public int getSell_num() {
        return sell_num;
    }

    public void setSell_num(int sell_num) {
        this.sell_num = sell_num;
    }

    public String getSell_reference_price() {
        return sell_reference_price;
    }

    public void setSell_reference_price(String sell_reference_price) {
        this.sell_reference_price = sell_reference_price;
    }

    public String getSteam_market_url() {
        return steam_market_url;
    }

    public void setSteam_market_url(String steam_market_url) {
        this.steam_market_url = steam_market_url;
    }

    public int getTransacted_num() {
        return transacted_num;
    }

    public void setTransacted_num(int transacted_num) {
        this.transacted_num = transacted_num;
    }
}
