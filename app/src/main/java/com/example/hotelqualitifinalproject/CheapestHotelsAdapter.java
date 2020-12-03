package com.example.hotelqualitifinalproject;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CheapestHotelsAdapter extends ArrayAdapter<Hoteis> {

    private Context context;
    private ArrayList<Hoteis> hoteisArrayList;
    private int layout;


    public CheapestHotelsAdapter(@NonNull Context context, int layout, ArrayList<Hoteis> hoteisArrayList) {
        super(context, layout, hoteisArrayList);

        this.context = context;
        this.hoteisArrayList = hoteisArrayList;
        this.layout = layout;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        }

        Hoteis hotel = hoteisArrayList.get(position);

        ImageView imageView = itemView.findViewById(R.id.imageView7);

        TextView nameHotel = itemView.findViewById(R.id.namehotel);
        nameHotel.setText(hotel.getName());

        TextView localizacao = itemView.findViewById(R.id.city);
        localizacao.setText(hotel.getCity());

        TextView priceweekfid = itemView.findViewById(R.id.priceWeekFidelity);
        priceweekfid.setText(hotel.getPriceWeekFid());

        TextView priceweekendfid = itemView.findViewById(R.id.textView22);
        priceweekendfid.setText(hotel.getPriceWeekendFid());

        TextView priceweeknorm = itemView.findViewById(R.id.textView26);
        priceweeknorm.setText(hotel.getPriceWeekNorm());

        TextView priceweekendnorm = itemView.findViewById(R.id.textView27);
        priceweekendnorm.setText(hotel.getPriceWeekendNorm());


        return itemView;

    }


}
