package chap02;

class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name); // "Ja" + "va" ���ڿ��� +�� ��ġ�� ������ 
		System.out.println(str);  // name + 8.0; name�� ���ڿ� �̱� ������ "java"+8.0�̹Ƿ� 8.0�� "8.0"���� ���� "
		System.out.println(7 + " "); //������ ���� �ƶ� 
		System.out.println(" " + 7); //���鵵 ������ �޴´� 
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // �����ڴ� �տ�����()������ +�� ������ ������ 14�� ���ϱⰡ �̷��� �Ŀ� 14�� ���� 
		System.out.println("" + 7 + 7); // ���ڿ��� �տ� �Ա� ������ ����� "77"
	}
}
