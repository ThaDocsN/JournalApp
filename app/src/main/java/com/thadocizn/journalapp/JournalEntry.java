package com.thadocizn.journalapp;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import java.io.Serializable;

public class JournalEntry implements Serializable {
    public static final String TAG = "JournalEntry";
    public static final int INVALID_ID = -1;

    private String date, entryText, image;
    private int dayRating, id;

    public static DiffUtil.ItemCallback<JournalEntry> DIFF_CALLBACK = new DiffUtil.ItemCallback<JournalEntry>() {
        @Override
        public boolean areItemsTheSame(@NonNull JournalEntry oldItem, @NonNull JournalEntry newItem) {
            return oldItem.id == newItem.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull JournalEntry oldItem, @NonNull JournalEntry newItem) {
            return oldItem.equals(newItem);
        }
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        JournalEntry user = (JournalEntry) obj;

        return user.id == this.id &&
                user.date == this.date &&
                user.entryText == this.entryText &&
                user.image == this.image &&
                user.dayRating == this.dayRating;
    }

    public JournalEntry(String date, String entryText, String image, int dayRating, int id) {
        this.date = date;
        this.entryText = entryText;
        this.image = image;
        this.dayRating = dayRating;
        this.id = id;
    }

    public JournalEntry(int id) {
        this.id = id;
        this.date = "";
        this.entryText = "";
        this.image = "";
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;

    }

    public String getEntryText() {
        return entryText;
    }

    public void setEntryText(String entryText) {
        this.entryText = entryText;


    }

    public Uri getImage() {
        if (!image.equals("")) {
            return Uri.parse(image);
        } else {
            return null;
        }
    }

    public void setImage(Uri imageUri) {
        this.image = imageUri.toString();


    }

    public int getDayRating() {
        return dayRating;
    }

    public void setDayRating(int dayRating) {
        this.dayRating = dayRating;


    }

    public int getId() {
        return id;
    }
}
