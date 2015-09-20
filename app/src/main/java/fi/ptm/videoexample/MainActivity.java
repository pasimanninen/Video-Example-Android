package fi.ptm.videoexample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 *
 * @author PTM
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        // set video path from local SD Card
        Uri uri = Uri.parse("file:///sdcard/yourfile.mp4");
        // set video path from internet
        // Uri uri = Uri.parse("http://domain.com/yourfile.mp4");
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

}
