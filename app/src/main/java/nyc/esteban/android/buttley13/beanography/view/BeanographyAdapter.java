package nyc.esteban.android.buttley13.beanography.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import nyc.esteban.android.buttley13.beanography.model.BeanographyPost;

/**
 * Created by Tara on 1/2/2015.
 */
public class BeanographyAdapter extends ArrayAdapter<BeanographyPost> {


    public BeanographyAdapter(Context context, int resource, List<BeanographyPost> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.beanography_post, parent, false);



            viewHolder = new ViewHolder();
            viewHolder.snapshot = (ImageView) convertView.findViewById(R.id.postBeanSnapShot);
            viewHolder.type = (TextView) convertView.findViewById(R.id.postBeanType);
            viewHolder.home = (TextView) convertView.findViewById(R.id.postBeanHome);
            viewHolder.likes = (TextView) convertView.findViewById(R.id.postBeanLikes);
            viewHolder.dislikes = (TextView) convertView.findViewById(R.id.postBeanDislikes);
            viewHolder.quotes = (TextView) convertView.findViewById(R.id.postBeanQuotes);


        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        BeanographyPost post = getItem(position);
        viewHolder.snapshot.setImageResource(post.getmSnapshot());
        viewHolder.name.setText(post.getmName());
        viewHolder.home.setText(post.getmHome());
        viewHolder.likes.setText(post.getmLikes());
        viewHolder.dislikes.setText(post.getmDislikes());
        viewHolder.quotes.setText(post.getmQuotes());

        return convertView;
    }

    private class ViewHolder {
        ImageView snapshot;
        TextView name;
        TextView type;
        TextView home;
        TextView likes;
        TextView dislikes;
        TextView quotes;

    }
}





