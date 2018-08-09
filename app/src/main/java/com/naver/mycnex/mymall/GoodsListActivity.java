package com.naver.mycnex.mymall;



public class GoodsListActivity {
    private Integer goods_id;
    private String goods_name;
    private String goods_price;

    public GoodsListActivity(Integer goods_id, String goods_name, String goods_price) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }
}
