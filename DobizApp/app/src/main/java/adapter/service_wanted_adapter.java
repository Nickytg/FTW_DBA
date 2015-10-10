package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tb.dobizapp.R;

import java.util.ArrayList;

import dto.service_wanted_request;

/**
 * Created by thaib on 10/7/2015.
 */
public class service_wanted_adapter extends ArrayAdapter<service_wanted_request> {
    Context context;
    int layoutResourceId;
    service_wanted_request data[] = null;

    public service_wanted_adapter(Context context, int layoutResourceId, service_wanted_request[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        dataHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new dataHolder();
            holder.txtTitle = (TextView)row.findViewById(R.id.txtHeader);

            row.setTag(holder);
        }
        else
        {
            holder = (dataHolder)row.getTag();
        }

        service_wanted_request weather = data[position];
        holder.txtTitle.setText(weather.getName());

        return row;

    }
    static class dataHolder
    {
        TextView txtTitle;
    }
}
