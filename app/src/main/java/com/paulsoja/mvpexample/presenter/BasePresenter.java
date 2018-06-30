package com.paulsoja.mvpexample.presenter;

import com.paulsoja.mvpexample.contract.BaseContract;
import com.paulsoja.mvpexample.model.BaseModel;

public class BasePresenter implements BaseContract.Presenter {

    //Компоненты MVP приложения
    private BaseContract.View mView;
    private BaseContract.Model mModel;

    //Обрати внимание на аргументы конструктора - мы передаем экземпляр View, а Repository просто создаём конструктором.
    public BasePresenter(BaseContract.View mView) {
        this.mView = mView;
        this.mModel = new BaseModel();
    }

    @Override
    public void onButtonWasClicked() {
        String message = mModel.loadMessage();
        mView.showText(message);
    }

    @Override
    public void onDestroy() {
        /*
         * Если бы мы работали например с RxJava, в этом классе стоило бы отписываться от подписок
         * Кроме того, при работе с другими методами асинхронного андроида,здесь мы боремся с утечкой контекста
         */
    }

}
