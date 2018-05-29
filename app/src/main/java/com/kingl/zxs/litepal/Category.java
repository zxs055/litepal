package com.kingl.zxs.litepal;

/**
 * Created by Administrator on 2018/5/29.
 */

public class Category {
    private int id;
    private String categoryName;
    private int categoryCode;

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setCategoryName(String categoryName) {

        this.categoryName = categoryName;
    }

    public void setId(int id) {

        this.id = id;
    }
}
