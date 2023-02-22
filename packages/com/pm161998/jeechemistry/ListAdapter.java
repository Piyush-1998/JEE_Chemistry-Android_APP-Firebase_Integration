package com.pm161998.jeechemistry;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ListAdapter extends BaseExpandableListAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<String> Items;
    private Map<String, List<String>> ParentListItems;
    private Activity context;

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListAdapter(Activity activity, List<String> list, Map<String, List<String>> map) {
        this.context = activity;
        this.ParentListItems = map;
        this.Items = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.Items.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        return this.Items.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.parent_item, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.textparent)).setText(str);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        return ((List) Objects.requireNonNull(this.ParentListItems.get(this.Items.get(i)))).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        return ((List) Objects.requireNonNull(this.ParentListItems.get(this.Items.get(i)))).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getChild(i, i2);
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        if (view == null) {
            view = layoutInflater.inflate(R.layout.child_item, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.textchild)).setText(str);
        return view;
    }
}
