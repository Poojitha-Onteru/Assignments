package com.designpatterns;

public class Youtube extends Video {

	public Youtube(ProcessingQuality quality) {
		super(quality);
	}

	@Override
	public void playVideo() {
		System.out.print("Playing video in youtube");
		quality.processingVideo();
	}

}
