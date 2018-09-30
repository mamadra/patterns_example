package com.company.abstractFactory.factories;

import com.company.abstractFactory.apple.AppleHeadphones;
import com.company.abstractFactory.apple.AppleNoteBook;
import com.company.abstractFactory.apple.Apple;
import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;

public class AppleDevice implements DeviceFactory {
    @Override
    public IHeadphones getHeadphone() {
        return new AppleHeadphones();
    }

    @Override
    public ISmart getSmartPhone() {
        return new Apple();
    }

    @Override
    public INoteBook getNoteBook() {
        return new AppleNoteBook();
    }
}
