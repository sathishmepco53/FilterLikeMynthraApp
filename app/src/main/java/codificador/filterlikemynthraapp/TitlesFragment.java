package codificador.filterlikemynthraapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

/**
 * Created by Sathish on 8/16/2017.
 */

public class TitlesFragment extends ListFragment implements AdapterView.OnItemClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.titles_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.Planets, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

        if(getListView().getAdapter().getCount()>0){
            DetailFragment fragment = (DetailFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            fragment.setText(getListView().getAdapter().getItem(0).toString());
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
        DetailFragment fragment = (DetailFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        fragment.setText(parent.getAdapter().getItem(position).toString());
    }
}