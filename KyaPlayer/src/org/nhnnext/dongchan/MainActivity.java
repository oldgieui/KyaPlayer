package org.nhnnext.dongchan;

import java.util.Random;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	SoundPool sp;

	int s0,s1,s2,s3,s4,s5,s6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		
		s0 = sp.load(this, R.raw.kya00, 1);
		s1 = sp.load(this, R.raw.kya01, 1);
		s2 = sp.load(this, R.raw.kya02, 1);
//		s3 = sp.load(this, R.raw.kya03, 1);
//		s4 = sp.load(this, R.raw.kya04, 1);
		s5 = sp.load(this, R.raw.kya05, 1);
//		s6 = sp.load(this, R.raw.kya06, 1);
		
		Button sayKya = (Button) findViewById(R.id.kya);
		sayKya.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		int soundId;
		
		Random rand = new Random();
		int index = rand.nextInt(6);
		switch (index) {
		case 0:
			soundId = s0;
			break;
		case 1:
			soundId = s1;
			break;
		case 2:
			soundId = s2;
			break;
		case 3:
			soundId = s0;
			break;
		case 4:
			soundId = s1;
			break;
		case 5:
			soundId = s5;
			break;
		case 6:
			soundId = s2;
			break;
		default:
			soundId = s5;
			break;
		}
		System.out.println("soundId:"+soundId);
		sp.play(soundId, 1, 1, 0, 0, 1);
		
	}
	
}
