package com.pm161998.jeechemistry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes.dex */
public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    int[] images = {R.drawable.joy, R.drawable.group_11, R.drawable.group_12, R.drawable.sit_back_and_relax};
    int[] headings = {R.string.first_slide_title, R.string.second_slide_title, R.string.third_slide_title, R.string.fourth_slide_title};
    int[] descriptions = {R.string.first_slide_desc, R.string.second_slide_desc, R.string.third_slide_desc, R.string.fourth_slide_desc};

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.headings.length;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((ConstraintLayout) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        this.layoutInflater = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.slides_layout, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.slider_image)).setImageResource(this.images[i]);
        ((TextView) inflate.findViewById(R.id.slider_head)).setText(this.headings[i]);
        ((TextView) inflate.findViewById(R.id.slider_desc)).setText(this.descriptions[i]);
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((ConstraintLayout) obj);
    }
}
