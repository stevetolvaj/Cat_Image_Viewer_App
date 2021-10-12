package edu.temple.catimageviewerapp

import android.os.Parcel
import android.os.Parcelable

data class ImageObject(val id: Int, val title: String?, val resourceId: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeInt(resourceId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ImageObject> {
        override fun createFromParcel(parcel: Parcel): ImageObject {
            return ImageObject(parcel)
        }

        override fun newArray(size: Int): Array<ImageObject?> {
            return arrayOfNulls(size)
        }
    }
}
