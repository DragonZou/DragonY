package com.zou.app.commons.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.w3c.dom.DOMConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 适配器基础类
 * @Author: 邹苏启
 * @Since: 16/4/21 下午8:13
 */
public abstract class AdapterBase<T, V> extends BaseAdapter {


    private final List<T> mList = new ArrayList<T>();

    /**
     * 获取列表
     *
     * @return
     */
    public List<T> getList() {
        return mList;
    }

    /**
     * 追加列表
     *
     * @param list
     */
    public void appendList(List<T> list) {
        if (list == null) return;
        mList.addAll(list);
        notifyDataSetChanged();
    }

    /**
     * 刷新列表
     *
     * @param list
     */
    public void refreshList(List<T> list) {
        mList.clear();
        appendList(list);
    }

    /**
     * 清除列表
     */
    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }

    /**
     * 删除指定的行
     *
     * @param location
     * @return
     */
    public T remove(int location) {
        T t = mList.remove(location);
        notifyDataSetChanged();
        return t;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        if (position > mList.size() - 1) {
            return null;
        }
        return mList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == getCount() - 1) {
            onReachBottom();
        }
        return getExView(position, convertView, parent);
    }


    /**
     * 显示view
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    protected View getExView(int position, View convertView, ViewGroup parent) {
        V itemView = null; // 通用的 Item 界面控制器
        if (null == convertView) {// 初始化
            itemView = getItemViewHolder();
            convertView = initConvertView(convertView, itemView);
            convertView.setTag(itemView);
        } else {
            itemView = (V) convertView.getTag();
        }
        // 处理数据
        handlerData(mList, position, itemView);
        return convertView;
    }


    /**
     * 处理数据：把数据set到Item界面的控件上面
     *
     * @param list
     * @param position
     * @param itemView
     */
    protected abstract void handlerData(List<T> list, int position, V itemView);

    /**
     * 获取通用的Item界面布局
     *
     * @return
     */
    protected abstract V getItemViewHolder();

    /**
     * 初始化 通用的Item界面布局
     *
     * @param convertView
     * @param v
     * @return
     */
    protected abstract View initConvertView(View convertView, V v);

    /**
     * 到达底部后的动作--显示完所有数据
     */
    protected abstract void onReachBottom();
}
