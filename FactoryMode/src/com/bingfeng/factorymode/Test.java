package com.bingfeng.factorymode;

import com.bingfeng.List.MyList;
import com.bingfeng.List.MyList.MyIterator;
import com.bingfeng.MyArrayList.MyArrayList;

public class Test {
	/*
	 * �����MyList �ǳ���Ĺ�������MyIterator�ǳ���Ĳ�Ʒ��
	 * MyArraList���Ǿ���Ĺ�����MyArrayList �Ǿ���Ĳ�Ʒ���Ҳ��ö��Ⱪ¶��
	 */
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		MyIterator it  = list.Iterator();
		it.next();
	}
}
