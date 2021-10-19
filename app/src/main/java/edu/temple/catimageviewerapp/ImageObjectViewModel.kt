package edu.temple.catimageviewerapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImageObjectViewModel : ViewModel() {
    private val imageObject : MutableLiveData<ImageObject> by lazy {
        MutableLiveData<ImageObject>()
    }

    fun getImageObject() : LiveData<ImageObject> {
        return imageObject
    }

    fun setImageObject(imageObject: ImageObject) {
        this.imageObject.value = imageObject
    }
}