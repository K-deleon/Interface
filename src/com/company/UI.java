package com.company;

import java.io.File;

public interface UI {
    void ok();
    void no();
    void cancel();
    void exit();
    String help();
    void setRes();
    void setTaskbar();
    void startOS();
    void runProgram(String programName);
    void startMouse();
    void keyboardInput(char key);
    void setWallPaper(File image);
    void setTime();

}
