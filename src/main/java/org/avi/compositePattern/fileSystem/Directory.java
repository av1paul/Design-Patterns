package org.avi.compositePattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    private List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(directoryName);
        for(FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
