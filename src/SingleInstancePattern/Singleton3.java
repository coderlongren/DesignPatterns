package SingleInstancePattern;
//���������� ����ĳ�ʼ����ʱ�� �Ѿ��Զ�ʵ����  
//����ʽ���ഴ����ͬʱ���Ѿ�������һ����̬�Ķ���ϵͳʹ�ã��Ժ��ٸı䣬�����������̰߳�ȫ�ġ�
public class Singleton3 {
	private Singleton3(){
		
	}
	private static final Singleton3 single = new Singleton3();
	//��̬�������� 
	public static Singleton3 getInstance(){
		return single;
	}

}
