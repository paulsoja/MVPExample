package com.paulsoja.mvpexample.contract;

public interface BaseContract {

    interface View {
        void showText(String text);
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Model {
        String loadMessage();
    }

}
