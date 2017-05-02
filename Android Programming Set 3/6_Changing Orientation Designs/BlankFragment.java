package ca.algomau.pokemon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    private ImageView image;
    private TextView tv1;
    private TextView tv2;

    public BlankFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        image = (ImageView) getView().findViewById(R.id.image);
        tv1 = (TextView) getView().findViewById(R.id.tv1);
        tv2 = (TextView) getView().findViewById(R.id.tv2);
    }

    public void imageChoice(int src) {

        String [] array1 = getResources().getStringArray(R.array.pokemon_name);
        String [] array2 = getResources().getStringArray(R.array.pokemon_desciption);

        switch(src) {
            case R.drawable.pikachu:
                image.setImageResource(R.drawable.pikachu);
                tv1.setText(array1[0]);
                tv2.setText(array2[0]);
                break;
            case R.drawable.mew:
                image.setImageResource(R.drawable.mew);
                tv1.setText(array1[1]);
                tv2.setText(array2[1]);
                break;
            case R.drawable.charmander:
                image.setImageResource(R.drawable.charmander);
                tv1.setText(array1[2]);
                tv2.setText(array2[2]);
                break;
            case R.drawable.bulbasaur:
                image.setImageResource(R.drawable.bulbasaur);
                tv1.setText(array1[3]);
                tv2.setText(array2[3]);
                break;
            case R.drawable.squirtle:
                image.setImageResource(R.drawable.squirtle);
                tv1.setText(array1[4]);
                tv2.setText(array2[4]);
                break;
            case R.drawable.meowth:
                image.setImageResource(R.drawable.meowth);
                tv1.setText(array1[5]);
                tv2.setText(array2[5]);
                break;
        }
    }
}
