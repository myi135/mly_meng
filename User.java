package com.moliying.mly_bmob;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * description:
 * company: moliying.com
 * Created by vince on 16/6/15.
 */
public class User extends BmobUser {
    private BmobFile icon;

    public BmobFile getIcon() {
        return icon;
    }

    public void setIcon(BmobFile icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "User{" +
                "icon=" + icon +
                '}';
    }
}
