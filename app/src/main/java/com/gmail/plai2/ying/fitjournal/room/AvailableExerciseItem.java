package com.gmail.plai2.ying.fitjournal.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "available_exercise_table")
public class AvailableExerciseItem {

    // Fields
    @ColumnInfo(name = "exercise_type")
    private ExerciseType mExerciseType;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "exercise_name")
    private String mExerciseName;

    @ColumnInfo(name = "favorited")
    private boolean mFavorited;

    @ColumnInfo(name = "custom")
    private boolean mCustom;

    @Ignore
    private boolean mIsChecked;

    // Empty constructor
    public AvailableExerciseItem() {
    }

    // General constructor for available exercise item
    public AvailableExerciseItem(ExerciseType type, String exerciseName, boolean favorite, boolean custom) {
        mExerciseType = type;
        mExerciseName = exerciseName;
        mFavorited = favorite;
        mCustom = custom;
        mIsChecked = false;
    }

    // Copy constructor
    public AvailableExerciseItem(AvailableExerciseItem anotherItem) {
        mExerciseType = anotherItem.getExerciseType();
        mExerciseName = anotherItem.getExerciseName();
        mFavorited = anotherItem.isFavorited();
        mCustom = anotherItem.isCustom();
        mIsChecked = anotherItem.isChecked();
    }

    // Getters and setters for fields
    public ExerciseType getExerciseType() {
        return mExerciseType;
    }

    public void setExerciseType(ExerciseType exerciseType) {
        this.mExerciseType = exerciseType;
    }

    public void setExerciseName(String exerciseName) {
        this.mExerciseName = exerciseName;
    }

    public String getExerciseName() {
        return mExerciseName;
    }

    public boolean isFavorited() {
        return mFavorited;
    }

    public void setFavorited(boolean favorited) {
        mFavorited = favorited;
    }

    public boolean isCustom() {
        return mCustom;
    }

    public void setCustom(boolean custom) { mCustom = custom; }

    public boolean isChecked() {
        return mIsChecked;
    }

    public void setChecked(boolean isChecked) {
        mIsChecked = isChecked;
    }
    
// Other methods
}