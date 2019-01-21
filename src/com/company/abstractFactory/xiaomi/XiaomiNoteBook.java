package com.company.abstractFactory.xiaomi;

import com.company.abstractFactory.interfaces.INoteBook;

public class XiaomiNoteBook implements INoteBook {
    @Override
    public String getName() {
        return "XIAOMI NoteBook";
    }

    @Override
    public void openWebPage(String urlPage, String nameApp) {
        System.out.printf("открытие страницы %s в браузере %s %n", urlPage, nameApp);
    }
}
