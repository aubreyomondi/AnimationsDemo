package com.sriyank.animationsdemo

import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_property_animator_xml.*


class PropertyAnimatorXmlActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_property_animator_xml)

	}

	fun rotateAnimation(view: View) {

		val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
		rotateAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun scaleAnimation(view: View) {

		val scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
		scaleAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun translateAnimation(view: View) {

		val translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
		translateAnimator.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun fadeAnimation(view: View) {

		val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        fadeAnimator?.apply {
            setTarget(targetImage)
            start()
        }
	}
}
