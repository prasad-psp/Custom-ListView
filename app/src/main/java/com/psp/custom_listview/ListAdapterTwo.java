package com.psp.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapterTwo extends ArrayAdapter<String> {

    private final Context context;

    private final ArrayList<String> list;

    public ListAdapterTwo(@NonNull Context context, ArrayList<String> list) {
        super(context,R.layout.list_item);
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        TextView textView = view.findViewById(R.id.txtItem);
        textView.setText(list.get(position));

        return view;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }


}
