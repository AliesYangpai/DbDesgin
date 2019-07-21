package org.alie.dbdesgin.bean;

import org.alie.dbdesgin.annotation.DbField;
import org.alie.dbdesgin.annotation.DbTable;

/**
 * Created by Alie on 2019/7/16.
 * 类描述
 * 版本
 */
//user表  字段：id  name  password   api.insert(new user());
@DbTable("tb_user")
public class User {
    @DbField("_id")
    private int id;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
