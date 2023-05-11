package main.java.tyut.selab.desktop.moudle.tools.client.dao.impl;

import main.java.tyut.selab.desktop.moudle.student.domain.User;
import main.java.tyut.selab.desktop.moudle.tools.client.dao.IUpFileDao;
import main.java.tyut.selab.desktop.moudle.tools.client.domain.FileUp;

import java.util.List;

public class UpFileDao implements IUpFileDao {
    @Override
    public List<FileUp> queryAllFileUpInfo() {
        return null;
    }

    @Override
    public List<FileUp> queryFileUpByUser(User user) {
        return null;
    }

    @Override
    public int insertFileUp(FileUp fileUp) {
        return 0;
    }
}
