package com.paulsoja.mvpexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.paulsoja.mvpexample.contract.BaseContract;
import com.paulsoja.mvpexample.presenter.BasePresenter;

public class ViewFragment extends Fragment implements BaseContract.View, View.OnClickListener {

    private BaseContract.Presenter mPresenter;
    private Button add;
    private Button clear;
    private TextView textView;
    private EditText email;
    private EditText name;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mPresenter = new BasePresenter(this);
        add = view.findViewById(R.id.add);
        clear = view.findViewById(R.id.clear);
        textView = view.findViewById(R.id.text);
        email = view.findViewById(R.id.email);
        name = view.findViewById(R.id.name);
        listView = view.findViewById(R.id.list);

        add.setOnClickListener(this);

        return view;
    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @Override
    public void onClick(View view) {
        mPresenter.onButtonWasClicked();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

}
