package com.example.ramzanapp.ui.Names_of_Allah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Nmaes_of_AllahViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Nmaes_of_AllahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}