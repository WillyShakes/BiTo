package com.willycode.bito.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.willycode.bito.Model.Station;
import com.willycode.bito.R;

import java.util.List;

/**
 * Created by Manuel ELO'O on 06/01/2016.
 */
public class StationAdapter extends RecyclerView.Adapter<StationAdapter.ViewHolder> {
    private List<Station> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView descView;
        public TextView freeBikeView;
        public TextView emptySlotTextView;

        public ViewHolder(View v) {
            super(v);
            nameTextView = (TextView) itemView.findViewById(R.id.name);
            descView = (TextView)itemView.findViewById(R.id.description);
            freeBikeView = (TextView)itemView.findViewById(R.id.free_bikes);
            emptySlotTextView = (TextView)itemView.findViewById(R.id.empty_slots);
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public StationAdapter(List<Station> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public StationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.station_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Station s = mDataset.get(position);
        holder.nameTextView.setText(s.getName());
        holder.descView.setText(s.getDescription());
        holder.freeBikeView.setText(s.getFree_bikes()+" free bikes");
        holder.emptySlotTextView.setText(s.getEmpty_slots()+" empty slots");
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void addItem(Station dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }
}
