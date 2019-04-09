package com.frank.csgo.bean;

import java.io.Serializable;
import java.util.List;

public class Buff implements Serializable {

    private String code;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        private int page_num;
        private int page_size;
        private String sort_by;
        private int total_count;
        private int total_page;
        private List<BuffWeapon> items;


        public int getPage_num() {
            return page_num;
        }

        public void setPage_num(int page_num) {
            this.page_num = page_num;
        }

        public int getPage_size() {
            return page_size;
        }

        public void setPage_size(int page_size) {
            this.page_size = page_size;
        }

        public String getSort_by() {
            return sort_by;
        }

        public void setSort_by(String sort_by) {
            this.sort_by = sort_by;
        }

        public int getTotal_count() {
            return total_count;
        }

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

        public int getTotal_page() {
            return total_page;
        }

        public void setTotal_page(int total_page) {
            this.total_page = total_page;
        }


        public List<BuffWeapon> getItems() {
            return items;
        }

        public void setItems(List<BuffWeapon> items) {
            this.items = items;
        }

    }

}
