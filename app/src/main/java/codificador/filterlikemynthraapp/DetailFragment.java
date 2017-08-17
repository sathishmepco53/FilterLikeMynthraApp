package codificador.filterlikemynthraapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sathish on 8/16/2017.
 */

public class DetailFragment extends Fragment {

    TextView textView = null;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        textView = view.findViewById(R.id.textViewDetail);
        return view;
    }

    public void setText(String text){
        if(textView == null)
        {
            Toast.makeText(getActivity(), "null", Toast.LENGTH_SHORT).show();
        }
        else{
            textView.setText(text);
        }
    }
}
