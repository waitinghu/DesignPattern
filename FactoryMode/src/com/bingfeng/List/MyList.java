package com.bingfeng.List;

public interface MyList {
	
	public interface MyIterator {
		Object next();
		boolean hasNext();
	};
	
	void setValue(Object obj);
	Object getValue(int index);
	
	public MyIterator Iterator();
}
