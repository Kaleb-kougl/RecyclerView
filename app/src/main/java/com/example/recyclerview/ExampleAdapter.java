package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;

        //        gets the references
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.item_number);
            mTextView2 = itemView.findViewById(R.id.content);
        }
    }

    private ArrayList<RecyclerViewItem> mArrayList;

    /**
     * Constructor that will receive the data
     */
    public ExampleAdapter(ArrayList<RecyclerViewItem> mlist) {
        this.mArrayList = mlist;
    }

    /**
     * have to pass the views here
     *
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    /**
     * Pass information to views from arraylist here
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        RecyclerViewItem currentItem = mArrayList.get(position);

        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
