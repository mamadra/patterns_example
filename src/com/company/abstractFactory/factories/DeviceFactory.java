package com.company.abstractFactory.factories;

import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;

public interface DeviceFactory {

    IHeadphones getHeadphone();
    ISmart getSmartPhone();
    INoteBook getNoteBook();
}
