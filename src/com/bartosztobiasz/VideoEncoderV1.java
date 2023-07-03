package com.bartosztobiasz;

public class VideoEncoderV1 implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
