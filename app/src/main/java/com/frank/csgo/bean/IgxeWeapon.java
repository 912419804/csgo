package com.frank.csgo.bean;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.List;

public class IgxeWeapon implements Serializable {

    /**
     * actions_link : steam://rungame/730/76561202255233023/+csgo_econ_action_preview%20S76561198057253335A14608058627D9982945759530250793
     * app_id : 730
     * exterior_wear : 0.35296136140823364258
     * icon_url : //static.igxe.cn/steam/image/730/188d1e4b8c1eada48b28aa58944a8fb2.png
     * id : 155419372
     * is_weapon_product : 1
     * last_updated : 2018-08-23T14:03:10
     * lock_span : 8
     * lock_span_str : 8天
     * name : AWP | 二西莫夫 (久经沙场)
     * product_name : AWP | 二西莫夫
     * reference_price : 211.94
     * shop_id : 13324
     * shop_img : /static/csgo/image/shop/shop.jpg
     * shop_name : 八手奥拓带回家
     * shop_url : /dmall/shop/13324
     * status : 2
     * steam_type_name : 隐秘 狙击步枪
     * steam_uid : 76561198057253335
     * sticker : [{"sticker_img":"https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/boston2018/sig_karsa.93edcb1b09d01505d08071bcd7bd27c7058f42ed.png","sticker_title":" Karsa | 2018年波士顿锦标赛","wear":-1},{"sticker_img":"https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/boston2018/tyl.ce4f8e7e7b94cbca8be95a0879e1783c4bd0e33f.png","sticker_title":" TYLOO | 2018年波士顿锦标赛","wear":-1},{"sticker_img":"https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/atlanta2017/sig_kennys.a3e1fd2e8cc5c6ca535ba74ad99270ddfa2bb1c8.png","sticker_title":" kennyS | 2017年亚特兰大锦标赛","wear":-1}]
     * tags_exterior : 久经沙场
     * trade_type : 3
     * unit_price : 189.00
     */
    private String time;
    private String actions_link;
    private int app_id;
    private String exterior_wear;
    private String icon_url;
    private int id;
    private int is_weapon_product;
    private String last_updated;
    private int lock_span;
    private String lock_span_str;
    private String name;
    private String product_name;
    private String reference_price;
    private int shop_id;
    private String shop_img;
    private String shop_name;
    private String shop_url;
    private int status;
    private String steam_type_name;
    private String steam_uid;
    private String tags_exterior;
    private int trade_type;
    private String unit_price;
    private List<StickerBean> sticker;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActions_link() {
        return actions_link;
    }

    public void setActions_link(String actions_link) {
        this.actions_link = actions_link;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getExterior_wear() {
        return exterior_wear;
    }

    public void setExterior_wear(String exterior_wear) {
        this.exterior_wear = exterior_wear;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_weapon_product() {
        return is_weapon_product;
    }

    public void setIs_weapon_product(int is_weapon_product) {
        this.is_weapon_product = is_weapon_product;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public int getLock_span() {
        return lock_span;
    }

    public void setLock_span(int lock_span) {
        this.lock_span = lock_span;
    }

    public String getLock_span_str() {
        return lock_span_str;
    }

    public void setLock_span_str(String lock_span_str) {
        this.lock_span_str = lock_span_str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getReference_price() {
        return reference_price;
    }

    public void setReference_price(String reference_price) {
        this.reference_price = reference_price;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_img() {
        return shop_img;
    }

    public void setShop_img(String shop_img) {
        this.shop_img = shop_img;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_url() {
        return shop_url;
    }

    public void setShop_url(String shop_url) {
        this.shop_url = shop_url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSteam_type_name() {
        return steam_type_name;
    }

    public void setSteam_type_name(String steam_type_name) {
        this.steam_type_name = steam_type_name;
    }

    public String getSteam_uid() {
        return steam_uid;
    }

    public void setSteam_uid(String steam_uid) {
        this.steam_uid = steam_uid;
    }

    public String getTags_exterior() {
        return tags_exterior;
    }

    public void setTags_exterior(String tags_exterior) {
        this.tags_exterior = tags_exterior;
    }

    public int getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(int trade_type) {
        this.trade_type = trade_type;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public List<StickerBean> getSticker() {
        return sticker;
    }

    public void setSticker(List<StickerBean> sticker) {
        this.sticker = sticker;
    }

    public static class StickerBean implements Serializable {
        /**
         * sticker_img : https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/boston2018/sig_karsa.93edcb1b09d01505d08071bcd7bd27c7058f42ed.png
         * sticker_title :  Karsa | 2018年波士顿锦标赛
         * wear : -1
         */

        private String sticker_img;
        private String sticker_title;
        private double wear;

        public String getSticker_img() {
            return sticker_img;
        }

        public void setSticker_img(String sticker_img) {
            this.sticker_img = sticker_img;
        }

        public String getSticker_title() {
            return sticker_title;
        }

        public void setSticker_title(String sticker_title) {
            this.sticker_title = sticker_title;
        }

        public double getWear() {
            return wear;
        }

        public void setWear(double wear) {
            this.wear = wear;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof IgxeWeapon) {
            IgxeWeapon o = (IgxeWeapon) obj;
            return o.getId() == this.id;
        }
        return false;
    }

}
