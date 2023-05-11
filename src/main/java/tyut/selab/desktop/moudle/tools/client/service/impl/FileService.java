package main.java.tyut.selab.desktop.moudle.tools.client.service.impl;


import main.java.tyut.selab.desktop.moudle.student.userdao.IUserDao;
import main.java.tyut.selab.desktop.moudle.tools.client.dao.IUpFileDao;
import main.java.tyut.selab.desktop.moudle.tools.client.domain.vo.FileUpVo;
import main.java.tyut.selab.desktop.moudle.tools.client.service.IFileUpService;

public class FileService implements IFileUpService {
    private IUserDao userDao;

    private IUpFileDao upFileDao;
    @Override
    public int fileDown(FileUpVo fileUpVo) {
        return 123;
    }

    @Override
    public int fileUpLoading(FileUpVo fileUpVo) {
        return 123;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
