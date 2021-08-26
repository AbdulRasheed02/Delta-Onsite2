package com.example.deltaonsite2;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    public MutableLiveData<String> item = new MutableLiveData<>();

    public String getItem() {
        return item.getValue();
    }

    public void setItem(String item) {
        this.item.setValue(item);
    }
}
