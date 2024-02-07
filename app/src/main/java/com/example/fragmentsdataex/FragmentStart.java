package com.example.fragmentsdataex;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentStart extends Fragment {
    public FragmentStart() {
        super(R.layout.start_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn = view.findViewById(R.id.btn);
        EditText editText = view.findViewById(R.id.et);
        String data = editText.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSecond fragmentSecond = new FragmentSecond();
                Bundle bundle = new Bundle();
                bundle.putString("key",data);
                fragmentSecond.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.container,fragmentSecond,null).commit();
            }
        });
    }
}
