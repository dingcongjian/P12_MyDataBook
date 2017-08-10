package com.example.a15056251.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class bioFragment extends Fragment {


    public bioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.biofragment, container, false);

//        //LISTVIEW
//        String[] list = {};
//
//        ListView lv = (ListView) rootView.findViewById(R.id.android_list);
//        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
//          getActivity(),
//                android.R.layout.simple_list_item_1, list
//        );
//        lv.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment


//        final ListView lv = (ListView)rootView.findViewById(android.R.id.list);
        Button btnEdit = (Button) rootView.findViewById(R.id.button);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater)
                        getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                LinearLayout passPhrase =
                        (LinearLayout) inflater.inflate(R.layout.passphrase, null);
                final EditText etPassphrase = (EditText) passPhrase
                        .findViewById(R.id.editTextPassPhrase);

                final TextView tv = (TextView)rootView.findViewById(R.id.textView);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Please Enter")
                        .setView(passPhrase)
                        .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                tv.setText(etPassphrase.getText());
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
//                String input = etPassphrase.getText().toString();


            }
        });

        return rootView;
    }


}
