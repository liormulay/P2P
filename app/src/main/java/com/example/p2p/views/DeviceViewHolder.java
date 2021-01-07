package com.example.p2p.views;

import android.bluetooth.BluetoothDevice;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p2p.R;

public class DeviceViewHolder extends RecyclerView.ViewHolder {
    private BluetoothDevice bluetoothDevice;

    /**
     * If this device is connected to another one then {@link #deviceTextView} text will be at blue
     */
    private final AppCompatTextView deviceTextView;


    public DeviceViewHolder(@NonNull View itemView) {
        super(itemView);
        deviceTextView = itemView.findViewById(R.id.device_text_view);
    }

    public void bindData(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
        deviceTextView.setText(bluetoothDevice.getName());
    }
}
