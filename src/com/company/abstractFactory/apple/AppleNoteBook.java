package com.company.abstractFactory.apple;

import com.company.abstractFactory.interfaces.INoteBook;

public class AppleNoteBook implements INoteBook {
    @Override
    public String getName() {
        return "APPLE NoteBook";
    }

    @Override
    public void openWebPage(String urlPage, String nameApp) {
        System.out.printf("открытие страницы %s в браузере %s %n",urlPage,nameApp);
    }
}
