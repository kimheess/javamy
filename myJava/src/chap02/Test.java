	//========������ ���ͷ� ����� ��============= 
		//boolean power = true;
		//char ch = 'A' 
		//char tab = '\t';    ==> 
		//byte b = 127;
		//short s = 32767;
		//int i = 100; 
		//int oct = 0100;    ==> 0���� �����ϸ� 8���� ���� 
		//int hex = 0x100;   ==> 0x���� �����ϸ� 16���� ����
		//long l = 10000000000L; 
		//float f = 3.14f;
		//double d = 3.14d;
		//float f = 100f;
		//10. ---> 10.0  ���� Ÿ���� �Ǽ� 
		//.10 ---> 0.10  ���� Ÿ���� �Ǽ�
		//10f ---> 10.0f float Ÿ���� �Ǽ� 
		//3.14e4f ---> 3140.0f  3.14*10�� 3�� e�� �������� �ǹ�
		//1e1 ---> 10.0 1*1�� 10�� ��� ������ ǥ����� �Ǽ��� ǥ�� ������ ǥ�� �Ұ� 
		
//		���ڿ� ���ڿ� 
//		char ch = 'A';
//		char ch = 'AB'; //����
//		String s1 = "AB";
		
//		char ch = '';   //���� 
//		String s1 = ""; �� ���ڿ�
//		String s1 = "A"+"B" // "AB" ���⼭ +�� ���ڿ� ���� ������ 
//		""+7 -> �Ͻ��� ����ȯ -> ���ڿ� 7�� �ȴ� ----> "7"
//		""+7+7 -> "7"+7 -> "7"+"7" ---> "77"  
//		7+7+"" -> 14+""-> "14" 
//		���ڿ� + any type -> ���ڿ� 
//		any type + ���ڿ� -> ���ڿ� 
		
//		������ �����÷���(Overflow)
//		byte b = 127;    byte b = 128; //���� 
//		b= b+1 // b�� ����� ���� 1���� 
//		�ִ밪 127 , �ּҰ� -128 
//		��ȯ �Ѵ� 127���� +1 �ϸ� -128 
//		-128���� -1 �ϸ� 127 
//		byte b = (byte)(127+1);
//		System.out.println(b);  //����  -128�� ���´� ����ȯ ���� ������ �ȵȴ� 
//		
//		char c = (char)(65535+1); //char Ÿ�� ���� ���� �ּ� 0 ~ �ִ� 65535
//		int i = c;
//		
//		System.out.println(i);  // ��� 0 
		
//		����ȯ(Casting)
//		����ȯ�̶�?
//		-���� Ÿ���� �ٸ� Ÿ������ ��ȯ �ϴ� ���̴�.
//		-bloolean�� ������ 7���� �⺻���� ���� ����ȯ�� ���� �ϴ� 
//		float f = 1.6f;
//		int i =(int)f;
//		
//		1.byte -> int 
//		byte b = 10; 
//		int i = (int)b;//���� ���� ��ĳ���� �������� ū������ ����ִ°Ŷ� ���� ���� �Ͻ��� ����ȯ
//		2.int -> byte
//		int i2 = 300;
//		byte b2 = (byte)i2; // ���� �Ұ� �ٿ�ĳ���� 