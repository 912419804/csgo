package com.frank.csgo.price;

import java.io.Serializable;
import java.util.HashMap;
import static com.frank.csgo.price.Glove.*;
import static com.frank.csgo.price.Knife.*;

public class BuffMap implements Serializable {

        public static HashMap<Object,Object[]> DATA = new HashMap<>();

        static {
                DATA.putAll(GLOVE_DATA);
                DATA.putAll(KNIFE_DATA);
        }

}
