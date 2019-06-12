package com.frank.csgo.bean.goods;

import java.io.Serializable;

public class TagsBean implements Serializable {
    private Tag exterior;
    private Tag quality;
    private Tag rarity;
    private Tag type;
    private Tag weapon;

    public Tag getExterior() {
        return exterior;
    }

    public void setExterior(Tag exterior) {
        this.exterior = exterior;
    }

    public Tag getQuality() {
        return quality;
    }

    public void setQuality(Tag quality) {
        this.quality = quality;
    }

    public Tag getRarity() {
        return rarity;
    }

    public void setRarity(Tag rarity) {
        this.rarity = rarity;
    }

    public Tag getType() {
        return type;
    }

    public void setType(Tag type) {
        this.type = type;
    }

    public Tag getWeapon() {
        return weapon;
    }

    public void setWeapon(Tag weapon) {
        this.weapon = weapon;
    }
}
