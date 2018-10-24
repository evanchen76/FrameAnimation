package evan.chen.tutorial.frameanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.drawable.AnimationDrawable
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setBackgroundResource(R.drawable.frame_animation)

        start.setOnClickListener {

            //步驟1：將圖片背景轉為AnimationDrawable
            val frameAnimation = imageView.background as AnimationDrawable

            //步驟2：AnimationDrawable.start()，開始動畫
            frameAnimation.start()
        }

        stop.setOnClickListener {
            val frameAnimation = imageView.background as AnimationDrawable

            //結束動畫
            frameAnimation.stop()
        }
    }
}
