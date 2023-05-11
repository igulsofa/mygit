package main.java.tyut.selab.desktop.moudle.tools.client.dao;

import main.java.tyut.selab.desktop.moudle.student.domain.User;
import main.java.tyut.selab.desktop.moudle.tools.client.domain.FileUp;

import java.util.List;

public interface IUpFileDao {
    List<FileUp> queryAllFileUpInfo();

    List<FileUp> queryFileUpByUser(User user);

    int insertFileUp(FileUp fileUp);
}
