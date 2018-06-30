package com.paulsoja.mvpexample.model;

import android.util.Log;

import com.paulsoja.mvpexample.contract.BaseContract;

public class BaseModel implements BaseContract.Model {

    @Override
    public String loadMessage() {
        /* Здесь обращаемся к БД или сети.
         * Я специально ничего не пишу, чтобы не загромождать пример
         * DBHelper'ами и прочими не относяшимся к теме объектами.
         * Поэтому я буду возвращать строку Сосисочная =)
         */
        return "Сосисочная у Пашки";
    }

}
