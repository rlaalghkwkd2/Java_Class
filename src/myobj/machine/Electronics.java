package myobj.machine;

public interface Electronics {
	// ���ڱ�� �������̽�
	// ���� ������ �����Ͽ� ���� ��� �������̽��� �ۼ��غ��ÿ�.

	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�.
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����Ҷ� ����
	// ���� �Һ� ��ŭ�� ������ �Һ��Ѵ�.
	// 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�.
	
	// �� ���߿� ������ �� �� �ʿ��� 
	
	void setConnect(ElectricSource src);
//	ElectricSource getConnectedGenerator();
	
	String execute();
}
