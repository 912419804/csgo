package com.frank.csgo;

import android.util.Log;

import com.frank.csgo.bean.Buff;
import com.frank.csgo.bean.Igxe;
import com.frank.csgo.https.JsonCallback;
import com.frank.csgo.utils.NumUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;
import com.lzy.okrx2.adapter.FlowableBody;
import com.lzy.okrx2.adapter.FlowableResponse;
import com.lzy.okrx2.adapter.ObservableBody;
import com.lzy.okrx2.adapter.ObservableResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.net.URL;
import java.util.Random;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */



public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testOkGo() {
      try {
          URL url = new URL("https://www.igxe.cn/csgo/730?is_buying=0&is_stattrak%5B%5D=0&is_stattrak%5B%5D=0&sort=3&ctg_id=0&type_id=0&page_no=2&page_size=20&rarity_id=0&exterior_id=0&quality_id=0&capsule_id=0&is_suit=0&_t=1632921435062");
          Document doc = Jsoup.parse(url, 3000);
          Elements dataList = doc.getElementsByClass("dataList");
          Elements aaa = dataList.get(0).getElementsByTag("a");
          for(Element a : aaa){
              String href = a.attr("href");
              String name = a.getElementsByClass("name").get(0).attr("title");
              int index = href.lastIndexOf("/");
              String substring = href.substring(index+1);
              System.out.println(substring+"--"+name);

          }

      }catch (Exception e){

      }


    }


}