package net.jsquare.spring4;

import java.util.List;

public interface BuildRunner {
    public void build(List<String> srcDirs, String binDir);
}
