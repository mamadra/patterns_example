package com.company.abstractFactory.factories;

import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;
import com.company.abstractFactory.samsung.SamsungHeadphones;
import com.company.abstractFactory.samsung.SamsungNoteBook;
import com.company.abstractFactory.samsung.Samsung;

public class SamsungDevice implements DeviceFactory {
    @Override
    public IHeadphones getHeadphone() {
        return new SamsungHeadphones();
    }

    @Override
    public ISmart getSmartPhone() {
        return new Samsung();
    }

    @Override
    public INoteBook getNoteBook() {
        return new SamsungNoteBook();
    }
}
