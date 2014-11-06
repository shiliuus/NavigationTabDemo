/*
 * Copyright (c) 2014, 青岛司通科技有限公司 All rights reserved.
 * File Name：PlaceholderFragment.java
 * Version：V1.0
 * Author：zhaokaiqiang
 * Date：2014-10-29
 */

package com.systemsinmotion.navigationtabdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.systemsinmotion.navigationtabdemo.R;

public class PlaceholderFragment extends Fragment {
	public static PlaceholderFragment newInstance() {
		return new PlaceholderFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_main, container, false);
	}

}
