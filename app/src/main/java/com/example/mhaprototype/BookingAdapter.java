package com.example.mhaprototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookingCustomViewHolder>{

    List<BookingModel> list;
    Context context;

    public BookingAdapter(List<BookingModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public BookingCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_my_schedule, parent, false);
        return new BookingCustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingCustomViewHolder holder, int position) {
        holder.time1.setText(list.get(position).getTime());
        holder.date.setText(list.get(position).getDate());
      //  holder.appointment.setText(list.get(position).getType());
        holder.time2.setText(list.get(position).getTime());

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BookingCustomViewHolder extends RecyclerView.ViewHolder {
        EditText time1, time2, appointment, date;
        public BookingCustomViewHolder(@NonNull View itemView) {
            super(itemView);
            time1 = itemView.findViewById(R.id.lbltime1);
            time2 = itemView.findViewById(R.id.lbltime2);
           // appointment = itemView.findViewById(R.id.lblappointment1);

        }
    }
}
