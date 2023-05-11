package main.java.tyut.selab.desktop.moudle.login.dao.impl;


import main.java.tyut.selab.desktop.moudle.login.dao.ILoginDao;
import main.java.tyut.selab.desktop.moudle.login.domain.LoginLog;

import javax.xml.crypto.Data;
import java.util.List;

public class LoginDao implements ILoginDao {
    @Override
    public List<LoginLog> queryAllLoginLog() {
        return null;
    }

    @Override
    public List<LoginLog> queryLoginLogByStudentNumber(String studentNumber) {
        return null;
    }

    @Override
    public List<LoginLog> showLoginLog(Data startTime, Data endingTime) {
        return null;
    }

    @Override
    public int insertLoginLog(LoginLog log) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
