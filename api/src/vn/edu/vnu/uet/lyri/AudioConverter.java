package vn.edu.vnu.uet.lyri;

import com.musicg.graphic.GraphicRender;
import com.musicg.wave.Wave;
import com.musicg.wave.extension.Spectrogram;

public class AudioConverter {

	public static void main(String[] args) {
		String filename = "data/10001-90210-01803.wav";
		String outFolder="output";

		// create a wave object
		Wave wave = new Wave(filename);
		Spectrogram spectrogram = new Spectrogram(wave);

		// Graphic render
		GraphicRender render = new GraphicRender();
		// render.setHorizontalMarker(1);
		// render.setVerticalMarker(1);
		render.renderSpectrogram(spectrogram, outFolder + "/spectrogram.jpg");

		// change the spectrogram representation
		int fftSampleSize = 512;
		int overlapFactor = 2;
		spectrogram = new Spectrogram(wave, fftSampleSize, overlapFactor);
		render.renderSpectrogram(spectrogram, outFolder + "/spectrogram2.jpg");


	}

}
