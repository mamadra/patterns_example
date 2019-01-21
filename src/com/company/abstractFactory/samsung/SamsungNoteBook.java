package com.company.abstractFactory.samsung;

import com.company.abstractFactory.interfaces.INoteBook;

public class SamsungNoteBook implements INoteBook {
    @Override
    public String getName() {
        return "SAMSUNG NoteBook";
    }

    @Override
    public void openWebPage(String urlPage, String nameApp) {
        System.out.printf("открытие страницы %s в браузере %s %n", urlPage, nameApp);
    }
}
