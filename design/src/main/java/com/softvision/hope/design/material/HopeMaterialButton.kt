package com.softvision.hope.design.material

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import androidx.core.content.res.use
import com.google.android.material.button.MaterialButton
import com.softvision.hope.design.R


class HopeMaterialButton @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialButton(context, attributes, defStyleAttr) {
    init {


        context.obtainStyledAttributes(
            attributes,
            R.styleable.HopeMaterialButton
        ).use {

            iconTint = null
            isClickable=true

          if (it.hasValue(R.styleable.HopeMaterialButton_materialButton_text_size)) {
              this.setTextSize(it.getFloat(R.styleable.HopeMaterialButton_materialButton_text_size, R.dimen.default_text_size.toFloat()))
            }else{
                R.dimen.default_text_size.toFloat()
            }



        /*    if (it.hasValue(R.styleable.HopeMaterialButton_materialButton_text_color)) {
                setTextColor(
                    it.getColor(
                        R.styleable.HopeMaterialButton_materialButton_text_color,
                        ContextCompat.getColor(
                            context,
                            R.color.default_text_color
                        )
                    )
                )
            } else {
                setTextColor(
                    ContextCompat.getColor(
                        context,
                        R.color.default_text_color
                    )
                )
            }*/

            backgroundTintList = if (it.hasValue(R.styleable.HopeMaterialButton_materialButton_bg_button)) {
                    ContextCompat.getColorStateList(
                        context,
                        it.getResourceId(
                            R.styleable.HopeMaterialButton_materialButton_bg_button,
                            ContextCompat.getColor(
                                context,
                                R.color.default_background_color
                            )
                        )
                    )
                } else {
                    ContextCompat.getColorStateList(context, R.color.default_background_color)
                }



        }
    }
}