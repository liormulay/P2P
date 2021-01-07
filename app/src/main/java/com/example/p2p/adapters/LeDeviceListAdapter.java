package com.example.p2p.adapters;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p2p.R;
import com.example.p2p.views.DeviceViewHolder;

import java.util.ArrayList;
import java.util.List;

public class LeDeviceListAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    private final Context context;

    private List<BluetoothDevice> devices;

    public LeDeviceListAdapter(Context context) {
        this.context = context;
        devices = new ArrayList<>();
    }


    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DeviceViewHolder(LayoutInflater.from(context).inflate(R.layout.device_view_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        holder.bindData(devices.get(position));
    }

    @Override
    public int getItemCount() {
        return devices == null ? 0 : devices.size();
    }

    public void addDevice(BluetoothDevice device) {
        devices.add(device);
        notifyDataSetChanged();
    }
}
