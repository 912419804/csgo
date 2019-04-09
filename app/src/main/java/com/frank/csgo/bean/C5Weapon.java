package com.frank.csgo.bean;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.List;

public class C5Weapon implements Serializable {
        /**
         * app_name : csgo
         * appid : 730
         * asset_id : 15575032653
         * bargain_url : https://www.c5game.com/api/sell/bargain.json?id=723514361
         * bot : {"type":"local"}
         * classid : 3206920621
         * comfirm :
         * create_time : 1552201343
         * currency : ￥
         * flag : 0
         * gem : {"has_gem":true,"image":["https://gem.c5game.com/apps/730/icons/econ/stickers/london2018/sig_kvik_foil.590292d23549e71e8fc5779700240190e8e3b705.png","https://gem.c5game.com/apps/730/icons/econ/stickers/london2018/sig_kvik_foil.590292d23549e71e8fc5779700240190e8e3b705.png"]}
         * has_wear : 1
         * id : 723514361
         * image : https://i.c5game.com/economy/730/2019/03/09/6eb4cd85a318a0412e3e5e271e7c4d72.png@180w.png
         * inspect : steam://rungame/730/76561202255233023/+csgo_econ_action_preview%20S76561198111224428A15575032653D11539357537317435013
         * inspect_image : https://csgo-java-prod.oss-cn-shanghai.aliyuncs.com/76561198111224428/15575032653.jpg
         * instanceid : 480085569
         * is_bargain : N
         * is_self_sell : 1
         * is_vip :
         * item_id : 22554
         * last_style :
         * memo :
         * name : AWP | 二西莫夫 (久经沙场)
         * owner : {"avatar":"https://i.c5game.com/avatar/u-57bef53fa534b.png@100w_100h_1e_1c","avg_time":"0小时2分","id":"39444050","level":9,"nickname":"COCO","success_rate":"100%"}
         * price : 246
         * quick_url : https://www.c5game.com/api/order/quick.json?id=723514361
         * rarity : ancient
         * rarity_name : 非凡
         * store_url : /store/39444050.html
         * trade_after_day : 0
         * trade_after_day_text :
         * type : csgo_type_sniperrifle
         * update_time : 0
         * url : https://www.c5game.com/default/order/quick.html?id=723514361
         * wear : 0.36234626173973
         * wearArrow : 3
         */
        private String time;
        private String app_name;
        private String appid;
        private String asset_id;
        private String bargain_url;
        private BotBean bot;
        private String classid;
        private String comfirm;
        private String create_time;
        private String currency;
        private int flag;
        private GemBean gem;
        private int has_wear;
        private String id;
        private String image;
        private String inspect;
        private String inspect_image;
        private String instanceid;
        private String is_bargain;
        private String is_self_sell;
        private String is_vip;
        private String item_id;
        private String last_style;
        private String memo;
        private String name;
        private OwnerBean owner;
        private String price;
        private String quick_url;
        private String rarity;
        private String rarity_name;
        private String store_url;
        private String trade_after_day;
        private String trade_after_day_text;
        private String type;
        private String update_time;
        private String url;
        private String wear;
        private int wearArrow;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTrade_after_day() {
        return trade_after_day;
    }

    public void setTrade_after_day(String trade_after_day) {
        this.trade_after_day = trade_after_day;
    }

    public String getApp_name() {
            return app_name;
        }

        public void setApp_name(String app_name) {
            this.app_name = app_name;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getAsset_id() {
            return asset_id;
        }

        public void setAsset_id(String asset_id) {
            this.asset_id = asset_id;
        }

        public String getBargain_url() {
            return bargain_url;
        }

        public void setBargain_url(String bargain_url) {
            this.bargain_url = bargain_url;
        }

        public BotBean getBot() {
            return bot;
        }

        public void setBot(BotBean bot) {
            this.bot = bot;
        }

        public String getClassid() {
            return classid;
        }

        public void setClassid(String classid) {
            this.classid = classid;
        }

        public String getComfirm() {
            return comfirm;
        }

        public void setComfirm(String comfirm) {
            this.comfirm = comfirm;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public GemBean getGem() {
            return gem;
        }

        public void setGem(GemBean gem) {
            this.gem = gem;
        }

        public int getHas_wear() {
            return has_wear;
        }

        public void setHas_wear(int has_wear) {
            this.has_wear = has_wear;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getInspect() {
            return inspect;
        }

        public void setInspect(String inspect) {
            this.inspect = inspect;
        }

        public String getInspect_image() {
            return inspect_image;
        }

        public void setInspect_image(String inspect_image) {
            this.inspect_image = inspect_image;
        }

        public String getInstanceid() {
            return instanceid;
        }

        public void setInstanceid(String instanceid) {
            this.instanceid = instanceid;
        }

        public String getIs_bargain() {
            return is_bargain;
        }

        public void setIs_bargain(String is_bargain) {
            this.is_bargain = is_bargain;
        }

        public String getIs_self_sell() {
            return is_self_sell;
        }

        public void setIs_self_sell(String is_self_sell) {
            this.is_self_sell = is_self_sell;
        }

        public String getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }

        public String getLast_style() {
            return last_style;
        }

        public void setLast_style(String last_style) {
            this.last_style = last_style;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OwnerBean getOwner() {
            return owner;
        }

        public void setOwner(OwnerBean owner) {
            this.owner = owner;
        }


    public String getQuick_url() {
            return quick_url;
        }

        public void setQuick_url(String quick_url) {
            this.quick_url = quick_url;
        }

        public String getRarity() {
            return rarity;
        }

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public String getRarity_name() {
            return rarity_name;
        }

        public void setRarity_name(String rarity_name) {
            this.rarity_name = rarity_name;
        }

        public String getStore_url() {
            return store_url;
        }

        public void setStore_url(String store_url) {
            this.store_url = store_url;
        }


        public String getTrade_after_day_text() {
            return trade_after_day_text;
        }

        public void setTrade_after_day_text(String trade_after_day_text) {
            this.trade_after_day_text = trade_after_day_text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWear() {
            return wear;
        }

        public void setWear(String wear) {
            this.wear = wear;
        }

        public int getWearArrow() {
            return wearArrow;
        }

        public void setWearArrow(int wearArrow) {
            this.wearArrow = wearArrow;
        }

        public static class BotBean implements Serializable{
            /**
             * type : local
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class GemBean implements Serializable{
            /**
             * has_gem : true
             * image : ["https://gem.c5game.com/apps/730/icons/econ/stickers/london2018/sig_kvik_foil.590292d23549e71e8fc5779700240190e8e3b705.png","https://gem.c5game.com/apps/730/icons/econ/stickers/london2018/sig_kvik_foil.590292d23549e71e8fc5779700240190e8e3b705.png"]
             */

            private boolean has_gem;
            private List<String> image;

            public boolean isHas_gem() {
                return has_gem;
            }

            public void setHas_gem(boolean has_gem) {
                this.has_gem = has_gem;
            }

            public List<String> getImage() {
                return image;
            }

            public void setImage(List<String> image) {
                this.image = image;
            }
        }

        public static class OwnerBean implements Serializable{
            /**
             * avatar : https://i.c5game.com/avatar/u-57bef53fa534b.png@100w_100h_1e_1c
             * avg_time : 0小时2分
             * id : 39444050
             * level : 9
             * nickname : COCO
             * success_rate : 100%
             */

            private String avatar;
            private String avg_time;
            private String id;
            private int level;
            private String nickname;
            private String success_rate;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getAvg_time() {
                return avg_time;
            }

            public void setAvg_time(String avg_time) {
                this.avg_time = avg_time;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSuccess_rate() {
                return success_rate;
            }

            public void setSuccess_rate(String success_rate) {
                this.success_rate = success_rate;
            }
        }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof C5Weapon) {
            C5Weapon o = (C5Weapon) obj;
            String exterior_wear = o.getWear();
            if (!TextUtils.isEmpty(exterior_wear)){
                return exterior_wear.equals(this.wear)
                        && o.getId().equals(this.id);
            }else return TextUtils.isEmpty(this.wear);
        }
        return false;
    }
}
