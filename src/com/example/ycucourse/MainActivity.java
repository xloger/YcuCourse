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
		
		//���ñ������ı���
		setTitle("SlidingMenu Properties");

		//�����Ƿ��ܹ�ʹ��ActionBar������
		setSlidingActionBarEnabled(true);

		//�����Ƿ���ʾHomeͼ�갴ť
		getActionBar().setDisplayHomeAsUpEnabled(true);

		//������������ͼ
		setContentView(R.layout.text);	

		//��ʼ�������˵�
		initSlidingMenu(savedInstanceState);
		
		//��ʼ�����
		initView();	
	}

	/**
	 * ��ʼ�������˵�
	 */
	private void initSlidingMenu(Bundle savedInstanceState) {
		// ���û����˵�����ͼ
		setBehindContentView(R.layout.menu_frame);
		//getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame, new SampleListFragment()).commit();		

		// ʵ���������˵�����
		SlidingMenu sm = getSlidingMenu();
		// ���û�����Ӱ�Ŀ��
		sm.setShadowWidthRes(R.dimen.shadow_width);
		// ���û�����Ӱ��ͼ����Դ
		sm.setShadowDrawable(R.drawable.shadow);
		// ���û����˵���ͼ�Ŀ��
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		// ���ý��뽥��Ч����ֵ
		sm.setFadeDegree(0.35f);
		// ���ô�����Ļ��ģʽ
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);		
	}
	
	/**
	 * ��ʼ�����
	 */
	private void initView() {
		
	}
	
	/**
	 * �˵���ť����¼���ͨ�����ActionBar��Homeͼ�갴ť���򿪻����˵�
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

