package com.frank.csgo.bean.goods;

import java.io.Serializable;

public class InfoBean implements Serializable {
    /**
     * tags : {"exterior":{"category":"exterior","internal_name":"wearcategory1","localized_name":"略有磨损"},"quality":{"category":"quality","internal_name":"normal","localized_name":"普通"},"rarity":{"category":"rarity","internal_name":"rare_weapon","localized_name":"军规级"},"type":{"category":"type","internal_name":"csgo_type_machinegun","localized_name":"机枪"},"weapon":{"category":"weapon","internal_name":"weapon_negev","localized_name":"内格夫"}}
     */

    private TagsBean tags;

    public TagsBean getTags() {
        return tags;
    }

    public void setTags(TagsBean tags) {
        this.tags = tags;
    }
}
