package com.zzw.java1000000.z1018396.Packingclass.Character;

public class CharacterDemo {
	
	public static void main(String[] args) {
		
		//Character创建对象
		Character character1 = 'a';
		Character character2 = new Character('a');
		Character c_int = 97;
		Character character3 = new Character(c_int);
		
		//常用方法
		char c = character1.charValue();
		System.out.println(character2.compareTo(character3));
		System.out.println(character1.equals(character2));
		c = Character.toUpperCase('a');
		int i = Character.toUpperCase(98);//返回int
		System.out.println(i);
		c = Character.toLowerCase(c);
		i = Character.toLowerCase(i);
		System.out.println(i);
		System.out.println(Character.toString(character1));
		character1.toString();
		
		Character.valueOf(c);
		Character.isUpperCase(c);
		Character.isUpperCase(98);
		Character.isLowerCase(c);
		Character.isLowerCase(98);
		
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('4'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('4'));
//		System.out.println(Character.toUpperCase('4'));
		
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.UNASSIGNED);
		System.out.println(Character.TITLECASE_LETTER);
		System.out.println(Character.CONNECTOR_PUNCTUATION);
		System.out.println(Character.UNASSIGNED);
	}

}
