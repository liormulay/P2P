package com.example.p2p.viewmodels;

import android.bluetooth.le.ScanCallback;

import androidx.lifecycle.ViewModel;

import com.example.p2p.BluetoothUtils;

public class P2PViewModel extends ViewModel {

    private BluetoothUtils bluetoothUtils = new BluetoothUtils();

    public void scan(ScanCallback leScanCallback) {
        bluetoothUtils.scanLeDevice(leScanCallback);
    }
}
