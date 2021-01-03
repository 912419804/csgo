package com.frank.csgo.bean;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.List;

public class C5Weapon implements Serializable {
    /**
     * id : 819787995760033792
     * sellerInfo : {"userId":"693559471165669376","platformId":2,"thirdUserId":"556373709","nickname":"Ioc.dre","avatar":"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/bf/bfbb6d0c701e758d8a7d67c04d4fb6a150c40a63_full.jpg","lastActive":0,"deliveryInfo":{"day7":{"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0},"day15":{"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0}}}
     * systemTime : 1609666285
     * appId : 730
     * appName : CS:GO
     * itemId : 22720
     * itemName : M4A4 | 二西莫夫 (久经沙场)
     * marketHashName : M4A4 | Asiimov (Field-Tested)
     * price : 687.5
     * sellerPrice : 687.5
     * cnyPrice : 687.5
     * imageUrl : https://game-aesy.c5game.com/steam/730/5968e890efd51b94afafac962a3b9acc.png?x-oss-process=image/resize,w_480,h_360
     * compensateType : 0
     * delivery : 1
     * acceptBargain : 0
     * description :
     * classInfoId : null
     * inspectUrl : steam://rungame/730/76561202255233023/+csgo_econ_action_preview%20S76561198214836005A20222188706D5515889516287822062
     * inspectViewable : 1
     * inspectable : null
     * inspectImageUrl : null
     * assetInfo : {"classInfoId":711478067419828224,"classId":2127286603,"instanceId":480085569,"assetId":20222188706,"styleId":"0","lastStyle":null,"styleProgress":null,"wear":"0.3602060675621032","paintIndex":255,"paintSeed":196,"levelName":null,"levelColor":null,"gradient":0,"fraudwarning":null,"inspectImageUrl":null,"gems":[],"stickers":[{"id":"678782062966755328","stickerId":0,"itemId":505225156,"name":"Virtus.Pro | 2017年亚特兰大锦标赛","image":"https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/atlanta2017/vp.4cc5e6800c1d8f08d0465ad37f1a46ad85051aef.png","slot":0,"wear":"","price":0}],"styles":[],"ext":""}
     * inspect3dViewable : 1
     * inspect3dUrl : https://3d.c5game.com?s=YIxaeLvcnqsHC1wZKQG6OmGsk2rd3Pzp&a=20222188706&c=GkpSCv%2Fq2AwAqxT1m%2Fm4Zg%3D%3D&i=EjkNWqY%2F%2BI9THWLlVcoMMg%3D%3D&isShowBuy=1
     * token : GBn+92KjryU8OpgQgRUgs3GU9r89AOWDhntf6QX2OR32m4HcmYsiv9OX5jfYtpMGdHqw2ILYnkkLy4ROhtTtTQ==
     * itemInfo : {"quality":"normal","qualityName":"普通","qualityColor":"#B2B2B2","rarity":"Rarity_Ancient_Weapon","rarityName":"隐秘","rarityColor":"#eb4b4b","type":"CSGO_Type_Rifle","typeName":"步枪","slot":"","slotName":"","hero":"","heroName":"","heroAvatar":"","exterior":"WearCategory2","exteriorName":"久经沙场","exteriorColor":"#f0ad4e","weapon":"weapon_m4a1","weaponName":"M4A4"}
     */

    private String id;
    private SellerInfoBean sellerInfo;
    private int systemTime;
    private int appId;
    private String appName;
    private String itemId;
    private String itemName;
    private String marketHashName;
    private double price;
    private double sellerPrice;
    private double cnyPrice;
    private String imageUrl;
    private int compensateType;
    private int delivery;
    private int acceptBargain;
    private String description;
    private Object classInfoId;
    private String inspectUrl;
    private int inspectViewable;
    private Object inspectable;
    private Object inspectImageUrl;
    private AssetInfoBean assetInfo;
    private int inspect3dViewable;
    private String inspect3dUrl;
    private String token;
    private ItemInfoBean itemInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SellerInfoBean getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(SellerInfoBean sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public int getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(int systemTime) {
        this.systemTime = systemTime;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMarketHashName() {
        return marketHashName;
    }

    public void setMarketHashName(String marketHashName) {
        this.marketHashName = marketHashName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSellerPrice() {
        return sellerPrice;
    }

    public void setSellerPrice(double sellerPrice) {
        this.sellerPrice = sellerPrice;
    }

    public double getCnyPrice() {
        return cnyPrice;
    }

    public void setCnyPrice(double cnyPrice) {
        this.cnyPrice = cnyPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getCompensateType() {
        return compensateType;
    }

    public void setCompensateType(int compensateType) {
        this.compensateType = compensateType;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getAcceptBargain() {
        return acceptBargain;
    }

    public void setAcceptBargain(int acceptBargain) {
        this.acceptBargain = acceptBargain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getClassInfoId() {
        return classInfoId;
    }

    public void setClassInfoId(Object classInfoId) {
        this.classInfoId = classInfoId;
    }

    public String getInspectUrl() {
        return inspectUrl;
    }

    public void setInspectUrl(String inspectUrl) {
        this.inspectUrl = inspectUrl;
    }

    public int getInspectViewable() {
        return inspectViewable;
    }

    public void setInspectViewable(int inspectViewable) {
        this.inspectViewable = inspectViewable;
    }

    public Object getInspectable() {
        return inspectable;
    }

    public void setInspectable(Object inspectable) {
        this.inspectable = inspectable;
    }

    public Object getInspectImageUrl() {
        return inspectImageUrl;
    }

    public void setInspectImageUrl(Object inspectImageUrl) {
        this.inspectImageUrl = inspectImageUrl;
    }

    public AssetInfoBean getAssetInfo() {
        return assetInfo;
    }

    public void setAssetInfo(AssetInfoBean assetInfo) {
        this.assetInfo = assetInfo;
    }

    public int getInspect3dViewable() {
        return inspect3dViewable;
    }

    public void setInspect3dViewable(int inspect3dViewable) {
        this.inspect3dViewable = inspect3dViewable;
    }

    public String getInspect3dUrl() {
        return inspect3dUrl;
    }

    public void setInspect3dUrl(String inspect3dUrl) {
        this.inspect3dUrl = inspect3dUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ItemInfoBean getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfoBean itemInfo) {
        this.itemInfo = itemInfo;
    }

    public String time;
    public void setTime(String timeString) {
        this.time = timeString;
    }

    public String getTime() {
        return time;
    }

    public static class SellerInfoBean {
        /**
         * userId : 693559471165669376
         * platformId : 2
         * thirdUserId : 556373709
         * nickname : Ioc.dre
         * avatar : https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/bf/bfbb6d0c701e758d8a7d67c04d4fb6a150c40a63_full.jpg
         * lastActive : 0
         * deliveryInfo : {"day7":{"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0},"day15":{"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0}}
         */

        private String userId;
        private int platformId;
        private String thirdUserId;
        private String nickname;
        private String avatar;
        private int lastActive;
        private SellerInfoBean.DeliveryInfoBean deliveryInfo;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getPlatformId() {
            return platformId;
        }

        public void setPlatformId(int platformId) {
            this.platformId = platformId;
        }

        public String getThirdUserId() {
            return thirdUserId;
        }

        public void setThirdUserId(String thirdUserId) {
            this.thirdUserId = thirdUserId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getLastActive() {
            return lastActive;
        }

        public void setLastActive(int lastActive) {
            this.lastActive = lastActive;
        }

        public SellerInfoBean.DeliveryInfoBean getDeliveryInfo() {
            return deliveryInfo;
        }

        public void setDeliveryInfo(SellerInfoBean.DeliveryInfoBean deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
        }

        public static class DeliveryInfoBean {
            /**
             * day7 : {"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0}
             * day15 : {"deliverySuccessRate":"0%","deliveryAvgTime":"0","deliveryNoneNum":0}
             */

            private SellerInfoBean.DeliveryInfoBean.Day7Bean day7;
            private SellerInfoBean.DeliveryInfoBean.Day15Bean day15;

            public SellerInfoBean.DeliveryInfoBean.Day7Bean getDay7() {
                return day7;
            }

            public void setDay7(SellerInfoBean.DeliveryInfoBean.Day7Bean day7) {
                this.day7 = day7;
            }

            public SellerInfoBean.DeliveryInfoBean.Day15Bean getDay15() {
                return day15;
            }

            public void setDay15(SellerInfoBean.DeliveryInfoBean.Day15Bean day15) {
                this.day15 = day15;
            }

            public static class Day7Bean {
                /**
                 * deliverySuccessRate : 0%
                 * deliveryAvgTime : 0
                 * deliveryNoneNum : 0
                 */

                private String deliverySuccessRate;
                private String deliveryAvgTime;
                private int deliveryNoneNum;

                public String getDeliverySuccessRate() {
                    return deliverySuccessRate;
                }

                public void setDeliverySuccessRate(String deliverySuccessRate) {
                    this.deliverySuccessRate = deliverySuccessRate;
                }

                public String getDeliveryAvgTime() {
                    return deliveryAvgTime;
                }

                public void setDeliveryAvgTime(String deliveryAvgTime) {
                    this.deliveryAvgTime = deliveryAvgTime;
                }

                public int getDeliveryNoneNum() {
                    return deliveryNoneNum;
                }

                public void setDeliveryNoneNum(int deliveryNoneNum) {
                    this.deliveryNoneNum = deliveryNoneNum;
                }
            }

            public static class Day15Bean {
                /**
                 * deliverySuccessRate : 0%
                 * deliveryAvgTime : 0
                 * deliveryNoneNum : 0
                 */

                private String deliverySuccessRate;
                private String deliveryAvgTime;
                private int deliveryNoneNum;

                public String getDeliverySuccessRate() {
                    return deliverySuccessRate;
                }

                public void setDeliverySuccessRate(String deliverySuccessRate) {
                    this.deliverySuccessRate = deliverySuccessRate;
                }

                public String getDeliveryAvgTime() {
                    return deliveryAvgTime;
                }

                public void setDeliveryAvgTime(String deliveryAvgTime) {
                    this.deliveryAvgTime = deliveryAvgTime;
                }

                public int getDeliveryNoneNum() {
                    return deliveryNoneNum;
                }

                public void setDeliveryNoneNum(int deliveryNoneNum) {
                    this.deliveryNoneNum = deliveryNoneNum;
                }
            }
        }
    }

    public static class AssetInfoBean {
        /**
         * classInfoId : 711478067419828224
         * classId : 2127286603
         * instanceId : 480085569
         * assetId : 20222188706
         * styleId : 0
         * lastStyle : null
         * styleProgress : null
         * wear : 0.3602060675621032
         * paintIndex : 255
         * paintSeed : 196
         * levelName : null
         * levelColor : null
         * gradient : 0
         * fraudwarning : null
         * inspectImageUrl : null
         * gems : []
         * stickers : [{"id":"678782062966755328","stickerId":0,"itemId":505225156,"name":"Virtus.Pro | 2017年亚特兰大锦标赛","image":"https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/atlanta2017/vp.4cc5e6800c1d8f08d0465ad37f1a46ad85051aef.png","slot":0,"wear":"","price":0}]
         * styles : []
         * ext :
         */

        private long classInfoId;
        private int instanceId;
        private long assetId;
        private String styleId;
        private Object lastStyle;
        private Object styleProgress;
        private String wear;
        private int paintIndex;
        private int paintSeed;
        private Object levelName;
        private Object levelColor;
        private int gradient;
        private Object fraudwarning;
        private Object inspectImageUrl;
        private String ext;
        private List<?> gems;
        private List<StickersBean> stickers;
        private List<?> styles;

        public long getClassInfoId() {
            return classInfoId;
        }

        public void setClassInfoId(long classInfoId) {
            this.classInfoId = classInfoId;
        }


        public int getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(int instanceId) {
            this.instanceId = instanceId;
        }

        public long getAssetId() {
            return assetId;
        }

        public void setAssetId(long assetId) {
            this.assetId = assetId;
        }

        public String getStyleId() {
            return styleId;
        }

        public void setStyleId(String styleId) {
            this.styleId = styleId;
        }

        public Object getLastStyle() {
            return lastStyle;
        }

        public void setLastStyle(Object lastStyle) {
            this.lastStyle = lastStyle;
        }

        public Object getStyleProgress() {
            return styleProgress;
        }

        public void setStyleProgress(Object styleProgress) {
            this.styleProgress = styleProgress;
        }

        public String getWear() {
            return wear;
        }

        public void setWear(String wear) {
            this.wear = wear;
        }

        public int getPaintIndex() {
            return paintIndex;
        }

        public void setPaintIndex(int paintIndex) {
            this.paintIndex = paintIndex;
        }

        public int getPaintSeed() {
            return paintSeed;
        }

        public void setPaintSeed(int paintSeed) {
            this.paintSeed = paintSeed;
        }

        public Object getLevelName() {
            return levelName;
        }

        public void setLevelName(Object levelName) {
            this.levelName = levelName;
        }

        public Object getLevelColor() {
            return levelColor;
        }

        public void setLevelColor(Object levelColor) {
            this.levelColor = levelColor;
        }

        public int getGradient() {
            return gradient;
        }

        public void setGradient(int gradient) {
            this.gradient = gradient;
        }

        public Object getFraudwarning() {
            return fraudwarning;
        }

        public void setFraudwarning(Object fraudwarning) {
            this.fraudwarning = fraudwarning;
        }

        public Object getInspectImageUrl() {
            return inspectImageUrl;
        }

        public void setInspectImageUrl(Object inspectImageUrl) {
            this.inspectImageUrl = inspectImageUrl;
        }

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public List<?> getGems() {
            return gems;
        }

        public void setGems(List<?> gems) {
            this.gems = gems;
        }

        public List<StickersBean> getStickers() {
            return stickers;
        }

        public void setStickers(List<StickersBean> stickers) {
            this.stickers = stickers;
        }

        public List<?> getStyles() {
            return styles;
        }

        public void setStyles(List<?> styles) {
            this.styles = styles;
        }

        public static class StickersBean {
            /**
             * id : 678782062966755328
             * stickerId : 0
             * itemId : 505225156
             * name : Virtus.Pro | 2017年亚特兰大锦标赛
             * image : https://steamcdn-a.akamaihd.net/apps/730/icons/econ/stickers/atlanta2017/vp.4cc5e6800c1d8f08d0465ad37f1a46ad85051aef.png
             * slot : 0
             * wear :
             * price : 0
             */

            private String id;
            private int stickerId;
            private int itemId;
            private String name;
            private String image;
            private int slot;
            private String wear;
            private int price;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getStickerId() {
                return stickerId;
            }

            public void setStickerId(int stickerId) {
                this.stickerId = stickerId;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getSlot() {
                return slot;
            }

            public void setSlot(int slot) {
                this.slot = slot;
            }

            public String getWear() {
                return wear;
            }

            public void setWear(String wear) {
                this.wear = wear;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }

    public static class ItemInfoBean {
        /**
         * quality : normal
         * qualityName : 普通
         * qualityColor : #B2B2B2
         * rarity : Rarity_Ancient_Weapon
         * rarityName : 隐秘
         * rarityColor : #eb4b4b
         * type : CSGO_Type_Rifle
         * typeName : 步枪
         * slot :
         * slotName :
         * hero :
         * heroName :
         * heroAvatar :
         * exterior : WearCategory2
         * exteriorName : 久经沙场
         * exteriorColor : #f0ad4e
         * weapon : weapon_m4a1
         * weaponName : M4A4
         */

        private String quality;
        private String qualityName;
        private String qualityColor;
        private String rarity;
        private String rarityName;
        private String rarityColor;
        private String type;
        private String typeName;
        private String slot;
        private String slotName;
        private String hero;
        private String heroName;
        private String heroAvatar;
        private String exterior;
        private String exteriorName;
        private String exteriorColor;
        private String weapon;
        private String weaponName;

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getQualityName() {
            return qualityName;
        }

        public void setQualityName(String qualityName) {
            this.qualityName = qualityName;
        }

        public String getQualityColor() {
            return qualityColor;
        }

        public void setQualityColor(String qualityColor) {
            this.qualityColor = qualityColor;
        }

        public String getRarity() {
            return rarity;
        }

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public String getRarityName() {
            return rarityName;
        }

        public void setRarityName(String rarityName) {
            this.rarityName = rarityName;
        }

        public String getRarityColor() {
            return rarityColor;
        }

        public void setRarityColor(String rarityColor) {
            this.rarityColor = rarityColor;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getSlot() {
            return slot;
        }

        public void setSlot(String slot) {
            this.slot = slot;
        }

        public String getSlotName() {
            return slotName;
        }

        public void setSlotName(String slotName) {
            this.slotName = slotName;
        }

        public String getHero() {
            return hero;
        }

        public void setHero(String hero) {
            this.hero = hero;
        }

        public String getHeroName() {
            return heroName;
        }

        public void setHeroName(String heroName) {
            this.heroName = heroName;
        }

        public String getHeroAvatar() {
            return heroAvatar;
        }

        public void setHeroAvatar(String heroAvatar) {
            this.heroAvatar = heroAvatar;
        }

        public String getExterior() {
            return exterior;
        }

        public void setExterior(String exterior) {
            this.exterior = exterior;
        }

        public String getExteriorName() {
            return exteriorName;
        }

        public void setExteriorName(String exteriorName) {
            this.exteriorName = exteriorName;
        }

        public String getExteriorColor() {
            return exteriorColor;
        }

        public void setExteriorColor(String exteriorColor) {
            this.exteriorColor = exteriorColor;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public String getWeaponName() {
            return weaponName;
        }

        public void setWeaponName(String weaponName) {
            this.weaponName = weaponName;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof C5Weapon) {
            C5Weapon o = (C5Weapon) obj;
            String exterior_wear = o.getAssetInfo().getWear();
            if (!TextUtils.isEmpty(exterior_wear)){
                return exterior_wear.equals(this.getAssetInfo().getWear())
                        && o.getId().equals(this.id);
            }else return TextUtils.isEmpty(this.getAssetInfo().getWear());
        }
        return false;
    }
}
