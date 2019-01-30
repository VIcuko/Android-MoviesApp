package com.example.android.moviesapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Vicuko on 29/1/19.
 */
public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsAdapterViewHolder> {
    private HashMap<String,String> mReviewsHash;

    public static class ReviewsAdapterViewHolder extends RecyclerView.ViewHolder {

        public TextView mAuthorTextView;
        public TextView mContentTextView;

        public ReviewsAdapterViewHolder(View itemView) {
            super(itemView);
            mAuthorTextView = itemView.findViewById(R.id.review_author);
            mContentTextView = itemView.findViewById(R.id.review_content);
        }
    }

    public ReviewsAdapter(HashMap reviewsHash) {
        mReviewsHash = reviewsHash;
    }

    @NonNull
    @Override
    public ReviewsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForReviewItem = R.layout.reviews_list_item;
        boolean shouldAttachToParentImmediately = false;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForReviewItem, viewGroup, shouldAttachToParentImmediately);
        return new ReviewsAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
