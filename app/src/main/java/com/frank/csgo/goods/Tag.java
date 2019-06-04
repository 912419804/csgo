package com.frank.csgo.goods;

import java.io.Serializable;

public class Tag implements Serializable {
    /**
     * category : weapon
     * internal_name : weapon_negev
     * localized_name : 内格夫
     */

    private String category;
    private String internal_name;
    private String localized_name;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInternal_name() {
        return internal_name;
    }

    public void setInternal_name(String internal_name) {
        this.internal_name = internal_name;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }
}
