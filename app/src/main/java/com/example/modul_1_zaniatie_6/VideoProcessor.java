package com.example.modul_1_zaniatie_6;

public class VideoProcessor {

    private VideoCallBack callBack;

    public VideoProcessor(VideoCallBack callBack) {
        this.callBack = callBack;
    }

    void startVideoProcessing(){
        //long video processing
        callBack.onHalfDone();
        //long video processing
        //long video processing
        callBack.onFinished();
    }
}

interface VideoCallBack{
    public void onFinished();
    public void onHalfDone();
}