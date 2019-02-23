package com.apps.a7pl4y3r.drawing

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bmp = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        bmp.eraseColor(ContextCompat.getColor(this, R.color.blue))

        val canvas = Canvas(bmp)

        val paint = Paint()
        paint.isAntiAlias = true
        paint.strokeWidth = 3F
        paint.color = ContextCompat.getColor(this, R.color.red)
        paint.style = Paint.Style.STROKE

        val greenPaint = Paint()
        greenPaint.isAntiAlias = true
        greenPaint.strokeWidth = 4F
        greenPaint.color = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        greenPaint.style = Paint.Style.STROKE

        val indigo = Paint()
        indigo.isAntiAlias = true
        indigo.strokeWidth = 3F
        indigo.color = ContextCompat.getColor(this, R.color.indigo)
        indigo.style = Paint.Style.STROKE

        for (i in 0 until 500)
        canvas.drawLine(i.toFloat(), f(i), 500F, f(i), paint)


        canvas.drawLine(20F, 20F, 100F, 20F, greenPaint)
        canvas.drawLine(100F, 20F, 256F, 80F, greenPaint)

        /*
        canvas.drawOval(20F, 200F, 80F, 300F, greenPaint)

        canvas.drawArc(0F, 10F, 200F, 400F, 30F, 30F, false, indigo)
        */

        imageView.setImageBitmap(bmp)

    }

    private fun f(x: Int): Float = x + 1F

}