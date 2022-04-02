package com.example.ramzanapp.ui.Duas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DuasViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DuasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is duas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}