package com.psp.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ListAdapterOne extends BaseAdapter {

    private final Context context;

    private final ArrayList<String> list;


    public ListAdapterOne(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return view1;
    }
}
