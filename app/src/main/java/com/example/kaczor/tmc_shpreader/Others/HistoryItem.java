package com.example.kaczor.tmc_shpreader.Others;

public class HistoryItem {
    public String name;
    public String file;
    public String content;

    public HistoryItem(){

    }
    public HistoryItem(String name, String file, String content){
        this.name = name;
        this.file = file;
        this.content = content;
    }
}
