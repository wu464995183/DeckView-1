/*
 * Copyright (C) 2016 Zheng Li <https://lizheng.me>
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.lizheng.deckviewsample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Simple model class
 * One important requirement for DeckView to function
 * is that all items in the dataset *must be* uniquely
 * identifiable. No two items can be such
 * that `item1.equals(item2)` returns `true`.
 * See equals() implementation below.
 * `id` is generated using `DeckViewSampleActivity#generateuniqueKey()`
 * Implementing `Parcelable` serves only one purpose - to persist data
 * on configuration change.
 */
public class CardDataModel implements Parcelable {

    public int id;
    public String title;

    public CardDataModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public CardDataModel(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        id = in.readInt();
        title = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
    }

    public static final Creator<CardDataModel> CREATOR = new Creator<CardDataModel>() {
        public CardDataModel createFromParcel(Parcel in) {
            return new CardDataModel(in);
        }

        public CardDataModel[] newArray(int size) {
            return new CardDataModel[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        return o instanceof CardDataModel && ((CardDataModel) o).id == this.id;
    }
}