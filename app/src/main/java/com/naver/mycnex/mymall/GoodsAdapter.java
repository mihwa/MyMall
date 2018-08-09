package com.naver.mycnex.mymall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GoodsAdapter extends BaseAdapter {
    ArrayList<Integer> items = new ArrayList<>();
    DBManager dbManager;

    public GoodsAdapter(ArrayList<Integer> items, DBManager dbManager) {
        this.items = items;
        this.dbManager = dbManager;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_items,parent,false);

        }



        return convertView;
    }

    public class Holder{

    }


}
