package org.alie.dbdesgin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.alie.dbdesgin.bean.User;
import org.alie.dbdesgin.db.BaseDao;
import org.alie.dbdesgin.db.BaseDaoFactory;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView(){
        btn1 = findViewById(R.id.btn1);
    }
    private void initListener(){
        btn1.setOnClickListener(this);
    }
    private void initData(){}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                insertDataToUser();
                break;
        }
    }

    private void insertDataToUser() {
        BaseDao<User> baseDao = BaseDaoFactory.getOurInstance().getBaseDao(User.class);
        baseDao.insert(new User("西瓜","619"));
    }
}
