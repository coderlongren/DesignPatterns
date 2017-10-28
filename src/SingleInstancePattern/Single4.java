package SingleInstancePattern;

public class Single4 {
	//��̬�ڲ��� 
	//��ʵ���� �̰߳�ȫ �ֱ�����ͬ��������Ӱ�� 
	private static class LazyHolder{
		private static final Single4 instance = new Single4();
	}
	
	private Single4(){
		
	}
	public static final Single4 getInstance(){
		return LazyHolder.instance;
	}
	
	
}
