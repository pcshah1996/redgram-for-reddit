package com.matie.redgram.ui.thread.views.widgets.comment;

import android.content.Context;
import android.util.AttributeSet;

import com.matie.redgram.data.models.main.items.comment.CommentBaseItem;

import butterknife.ButterKnife;

/**
 * Created by matie on 2016-02-12.
 */
public class CommentRegularItemView extends CommentItemView{
    public CommentRegularItemView(Context context) {
        super(context);
    }

    public CommentRegularItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CommentRegularItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void setUpView(CommentBaseItem item) {

    }

    @Override
    public void onFinishInflate(){
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

}