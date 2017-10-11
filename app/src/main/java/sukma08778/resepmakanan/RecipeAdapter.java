package sukma08778.resepmakanan;

import android.content.Context;
import android.content.Intent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sukma
 */

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {
    private Context c;
    private List<Recipe> recipeList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_list_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Recipe recipe = recipeList.get(position);
        holder.tittle.setText(recipe.getTittle());
        holder.detail.setText(recipe.getDetail());
        holder.picture.setImageResource(recipe.getPicture());
        holder.RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(c, Data.class);
                in.putExtra("Picture", recipe.getPicture());
                in.putExtra("Title", recipe.getTittle());
                in.putExtra("HowToMake", recipe.getMake());
                c.startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tittle, detail;
        public ImageView picture;
        public RelativeLayout RL;

        MyViewHolder(View view) {
            super(view);
            tittle = (TextView) view.findViewById(R.id.tittle);
            detail = (TextView) view.findViewById(R.id.detail);
            picture = (ImageView) view.findViewById(R.id.gambar);

            RL = (RelativeLayout) view.findViewById(R.id.row_data);
        }
    }

    public RecipeAdapter(Context c, List<Recipe> recipeList) {
        this.recipeList = recipeList;
        this.c = c;
    }


}

