package com.frank.csgo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 作者 hasee
 * @createTime 创建时间： 2018/11/28 17:09
 * 类说明：
 */
public class BuffWeapon implements Serializable {

    private boolean allow_bargain;
    private String appid;
    private AssetInfoBean asset_info;
    private boolean can_bargain;
    private String cannot_bargain_reason;
    private int created_at;
    private String description;
    private int featured;
    private String fee;
    private String game;
    private String goods_id;
    private String id;
    private String lowest_bargain_price;
    private String mode;
    private String price;
    private String recent_average_duration;
    private String recent_deliver_rate;
    private int state;
    private String updated_at;
    private String user_id;
    private String name;
    private String tags_exterior;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTags_exterior() {
        return tags_exterior;
    }

    public void setTags_exterior(String tags_exterior) {
        this.tags_exterior = tags_exterior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAllow_bargain() {
        return allow_bargain;
    }

    public void setAllow_bargain(boolean allow_bargain) {
        this.allow_bargain = allow_bargain;
    }


    public AssetInfoBean getAsset_info() {
        return asset_info;
    }

    public void setAsset_info(AssetInfoBean asset_info) {
        this.asset_info = asset_info;
    }

    public boolean isCan_bargain() {
        return can_bargain;
    }

    public void setCan_bargain(boolean can_bargain) {
        this.can_bargain = can_bargain;
    }

    public String getCannot_bargain_reason() {
        return cannot_bargain_reason;
    }

    public void setCannot_bargain_reason(String cannot_bargain_reason) {
        this.cannot_bargain_reason = cannot_bargain_reason;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFeatured() {
        return featured;
    }

    public void setFeatured(int featured) {
        this.featured = featured;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLowest_bargain_price() {
        return lowest_bargain_price;
    }

    public void setLowest_bargain_price(String lowest_bargain_price) {
        this.lowest_bargain_price = lowest_bargain_price;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRecent_average_duration() {
        return recent_average_duration;
    }

    public void setRecent_average_duration(String recent_average_duration) {
        this.recent_average_duration = recent_average_duration;
    }

    public String getRecent_deliver_rate() {
        return recent_deliver_rate;
    }

    public void setRecent_deliver_rate(String recent_deliver_rate) {
        this.recent_deliver_rate = recent_deliver_rate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public static class AssetInfoBean implements Serializable{
        /**
         * action_link :
         * appid : 730
         * assetid : 14948567500
         * classid : 1440505236
         * contextid : 2
         * goods_id : 33947
         * has_tradable_cooldown : false
         * info : {"icon_url":"https://g.fp.ps.netease.com/market/file/5aa0c349adce5f63e5cc65faqTD8OBOU","inspect_back_image":"","inspect_front_image":"","inspect_mobile_size":"2560x2640","inspect_mobile_url":"https://g.fp.ps.netease.com/market/file/5bfd24276f049476ceed824dvqMDF543","inspect_size":"2560x3458","inspect_start_at":"2018-11-27 19:01:26","inspect_state":2,"inspect_url":"https://g.fp.ps.netease.com/market/file/5bfd2427a7f25257dfe0f0c4qgmpCquT","inspect_version":7,"inspected_at":"2018-11-27 19:02:08","paintindex":506,"paintseed":984,"stickers":[]}
         * instanceid : 480085569
         * paintwear : 0.10805512964725494
         * tradable_cooldown_text : 直接到库存
         */

        private String action_link;
        private int appid;
        private String assetid;
        private String classid;
        private int contextid;
        private int goods_id;
        private boolean has_tradable_cooldown;
        private InfoBean info;
        private String instanceid;
        private String paintwear;
        private String tradable_cooldown_text;

        public String getAction_link() {
            return action_link;
        }

        public void setAction_link(String action_link) {
            this.action_link = action_link;
        }

        public int getAppid() {
            return appid;
        }

        public void setAppid(int appid) {
            this.appid = appid;
        }

        public String getAssetid() {
            return assetid;
        }

        public void setAssetid(String assetid) {
            this.assetid = assetid;
        }

        public String getClassid() {
            return classid;
        }

        public void setClassid(String classid) {
            this.classid = classid;
        }

        public int getContextid() {
            return contextid;
        }

        public void setContextid(int contextid) {
            this.contextid = contextid;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public boolean isHas_tradable_cooldown() {
            return has_tradable_cooldown;
        }

        public void setHas_tradable_cooldown(boolean has_tradable_cooldown) {
            this.has_tradable_cooldown = has_tradable_cooldown;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public String getInstanceid() {
            return instanceid;
        }

        public void setInstanceid(String instanceid) {
            this.instanceid = instanceid;
        }

        public String getPaintwear() {
            return paintwear;
        }

        public void setPaintwear(String paintwear) {
            this.paintwear = paintwear;
        }

        public String getTradable_cooldown_text() {
            return tradable_cooldown_text;
        }

        public void setTradable_cooldown_text(String tradable_cooldown_text) {
            this.tradable_cooldown_text = tradable_cooldown_text;
        }

        public static class InfoBean implements Serializable{
            /**
             * icon_url : https://g.fp.ps.netease.com/market/file/5aa0c349adce5f63e5cc65faqTD8OBOU
             * inspect_back_image :
             * inspect_front_image :
             * inspect_mobile_size : 2560x2640
             * inspect_mobile_url : https://g.fp.ps.netease.com/market/file/5bfd24276f049476ceed824dvqMDF543
             * inspect_size : 2560x3458
             * inspect_start_at : 2018-11-27 19:01:26
             * inspect_state : 2
             * inspect_url : https://g.fp.ps.netease.com/market/file/5bfd2427a7f25257dfe0f0c4qgmpCquT
             * inspect_version : 7
             * inspected_at : 2018-11-27 19:02:08
             * paintindex : 506
             * paintseed : 984
             * stickers : []
             */

            private String icon_url;
            private String inspect_back_image;
            private String inspect_front_image;
            private String inspect_mobile_size;
            private String inspect_mobile_url;
            private String inspect_size;
            private String inspect_start_at;
            private int inspect_state;
            private String inspect_url;
            private int inspect_version;
            private String inspected_at;
            private int paintindex;
            private int paintseed;
            private ArrayList<?> stickers;

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public String getInspect_back_image() {
                return inspect_back_image;
            }

            public void setInspect_back_image(String inspect_back_image) {
                this.inspect_back_image = inspect_back_image;
            }

            public String getInspect_front_image() {
                return inspect_front_image;
            }

            public void setInspect_front_image(String inspect_front_image) {
                this.inspect_front_image = inspect_front_image;
            }

            public String getInspect_mobile_size() {
                return inspect_mobile_size;
            }

            public void setInspect_mobile_size(String inspect_mobile_size) {
                this.inspect_mobile_size = inspect_mobile_size;
            }

            public String getInspect_mobile_url() {
                return inspect_mobile_url;
            }

            public void setInspect_mobile_url(String inspect_mobile_url) {
                this.inspect_mobile_url = inspect_mobile_url;
            }

            public String getInspect_size() {
                return inspect_size;
            }

            public void setInspect_size(String inspect_size) {
                this.inspect_size = inspect_size;
            }

            public String getInspect_start_at() {
                return inspect_start_at;
            }

            public void setInspect_start_at(String inspect_start_at) {
                this.inspect_start_at = inspect_start_at;
            }

            public int getInspect_state() {
                return inspect_state;
            }

            public void setInspect_state(int inspect_state) {
                this.inspect_state = inspect_state;
            }

            public String getInspect_url() {
                return inspect_url;
            }

            public void setInspect_url(String inspect_url) {
                this.inspect_url = inspect_url;
            }

            public int getInspect_version() {
                return inspect_version;
            }

            public void setInspect_version(int inspect_version) {
                this.inspect_version = inspect_version;
            }

            public String getInspected_at() {
                return inspected_at;
            }

            public void setInspected_at(String inspected_at) {
                this.inspected_at = inspected_at;
            }

            public int getPaintindex() {
                return paintindex;
            }

            public void setPaintindex(int paintindex) {
                this.paintindex = paintindex;
            }

            public int getPaintseed() {
                return paintseed;
            }

            public void setPaintseed(int paintseed) {
                this.paintseed = paintseed;
            }

            public ArrayList<?> getStickers() {
                return stickers;
            }

            public void setStickers(ArrayList<?> stickers) {
                this.stickers = stickers;
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuffWeapon that = (BuffWeapon) o;
        return Objects.equals(asset_info.getPaintwear(), that.asset_info.getPaintwear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset_info);
    }
}
