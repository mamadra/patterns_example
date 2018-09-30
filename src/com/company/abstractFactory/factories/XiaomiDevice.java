package com.company.abstractFactory.factories;

import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;
import com.company.abstractFactory.xiaomi.XiaomiHeadphones;
import com.company.abstractFactory.xiaomi.XiaomiNoteBook;
import com.company.abstractFactory.xiaomi.Xiaomi;

public class XiaomiDevice implements DeviceFactory {
    @Override
    public IHeadphones getHeadphone() {
        return new XiaomiHeadphones();
    }

    @Override
    public ISmart getSmartPhone() {
        return new Xiaomi();
    }

    @Override
    public INoteBook getNoteBook() {
        return new XiaomiNoteBook();
    }
}
