package Day16;
import java.util.*;
public class HashMapEx {
private static final String[] name = {
		"ȫ�浿","�̼���","������","������","�տ���","�����"};

	//Ű : ������ ���� ���� �� �� ����.(���� ������ Ű�� ������ ��� ������ �����Ͱ� �����)���� �� �� ����.
	private static final String[] tel = {"111-111","222-2222","233-3333",
			"111-111","222-2222","555-5555"};
	//�� : ������ ���� �����ص� �����ϴ�. why : key���� ���� �����Ͱ��� �ҷ����� ����
	

public static void main(String[] args) {
	
	Hashtable<String, String>ht = new Hashtable<>();
	//�ؽ����̺� Ű, �� �Է� put(k,v)
	for(int i=0;i<name.length;i++)
		ht.put(name[i], tel[i]);
	
	//�ؽ����̺� ���� Ű�� �̿��Ͽ� �˻���
	
	String str = ht.get("ȫ�浿");
	if(str!=null)
	System.out.println("ȫ�浿�� ��ȭ��ȣ:"+str);
	//Ű�� �����ϴ� �˻�
	if(ht.containsKey("�Ӳ���")){
		System.out.println("�Ӳ����� �����Ͱ� �����մϴ�.");
	}
	else 
		System.out.println("�Ӳ����� �����Ͱ� �������� �ʽ��ϴ�.");
	
	if(ht.containsKey("666-666"))
	{
		System.out.println("�����մϴ�");
	}
	else
		System.out.println("������ϴ� ��ȣ");
	
	//Ű �� ����
	ht.remove("�����");
	if(ht.containsKey("�����"))
		System.out.println("������");
	else
		System.out.println("����� ������");
	

}
}
