/*
 *  * Copyright © Wynntils - 2018.
 */

package cf.wynntils.modules.core.config;

import cf.wynntils.core.framework.enums.ClassType;
import cf.wynntils.core.framework.settings.annotations.SettingsInfo;
import cf.wynntils.core.framework.settings.instances.SettingsClass;

@SettingsInfo(name = "main")
public class CoreDBConfig extends SettingsClass {

    public static CoreDBConfig INSTANCE;

    public String lastToken = "";
    public int lastSelectedClass = -1;
    public ClassType lastClass = ClassType.NONE;

    @Override
    public void onSettingChanged(String name) {

    }
}
