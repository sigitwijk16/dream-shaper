package com.gitz.dreamshaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class GoalsAdapter extends RecyclerView.Adapter<GoalsAdapter.GoalsViewHolder> {

    private Goals[] goals;

    public GoalsAdapter(Goals[] goals) {
        this.goals = goals;
    }

    @NonNull
    @Override
    public GoalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_goals, parent, false);
        return new GoalsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoalsViewHolder holder, int position) {
        holder.bind(goals[position]);
    }

    @Override
    public int getItemCount() {
        return goals.length;
    }

    static class GoalsViewHolder extends RecyclerView.ViewHolder {

        private ImageView goalImage;
        private TextView goalTitle;
        private TextView goalDesc;

        public GoalsViewHolder(@NonNull View itemView) {
            super(itemView);

            goalImage = itemView.findViewById(R.id.image_view_goals);
            goalTitle = itemView.findViewById(R.id.text_view_goal_title);
            goalDesc = itemView.findViewById(R.id.text_view_goal_desc);
        }

        public void bind(Goals goal) {
            goalImage.setImageResource(goal.image);
            goalTitle.setText(goal.title);
            goalDesc.setText(goal.description);
        }
    }
}
