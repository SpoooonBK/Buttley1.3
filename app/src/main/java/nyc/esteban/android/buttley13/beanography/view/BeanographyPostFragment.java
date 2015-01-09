package nyc.esteban.android.buttley13.beanography.view;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.esteban.android.buttley13.beanography.model.Beanography;
import nyc.esteban.android.buttley13.beanography.model.BeanographyPost;

/**
 * Created by Tara on 1/5/2015.
 */
public class BeanographyPostFragment extends ListFragment {

    private List<BeanographyPost> beanographyPosts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        beanographyPosts = Beanography.buildList();


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
