package com.example.ycucourse;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.ycucourse.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {
	
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//设置标题栏的标题
		setTitle("SlidingMenu Properties");

		//设置是否能够使用ActionBar来滑动
		setSlidingActionBarEnabled(true);

		//设置是否显示Home图标按钮
		getActionBar().setDisplayHomeAsUpEnabled(true);

		//设置主界面视图
		setContentView(R.layout.text);	

		//初始化滑动菜单
		initSlidingMenu(savedInstanceState);
		
		//初始化组件
		initView();	
	}

	/**
	 * 初始化滑动菜单
	 */
	private void initSlidingMenu(Bundle savedInstanceState) {
		// 设置滑动菜单的视图
		setBehindContentView(R.layout.menu_frame);
		//getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame, new SampleListFragment()).commit();		

		// 实例化滑动菜单对象
		SlidingMenu sm = getSlidingMenu();
		// 设置滑动阴影的宽度
		sm.setShadowWidthRes(R.dimen.shadow_width);
		// 设置滑动阴影的图像资源
		sm.setShadowDrawable(R.drawable.shadow);
		// 设置滑动菜单视图的宽度
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		// 设置渐入渐出效果的值
		sm.setFadeDegree(0.35f);
		// 设置触摸屏幕的模式
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);		
	}
	
	/**
	 * 初始化组件
	 */
	private void initView() {
		
	}
	
	/**
	 * 菜单按钮点击事件，通过点击ActionBar的Home图标按钮来打开滑动菜单
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			toggle();
			return true;		
		}
		return super.onOptionsItemSelected(item);
	}

	
}

