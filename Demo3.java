package day2;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		String a = "apple";
		String b = a.toUpperCase();
		System.out.println(b);

		String g = "APPLE";
		String h = g.toLowerCase();
		System.out.println(h);

		int c = a.length();
		System.out.println(c);

		String z = "pine";
		String y = "apple";
		String x = z.concat(y);
		System.out.println(x);

		String m = "Lotus";
		boolean n = m.contains("l");
		System.out.println(n);

		boolean o = m.startsWith("lo");
		System.out.println(o);

		boolean f = m.endsWith("S");
		System.out.println(f);

		String j = "priya";
		String k = "priya";
		boolean l = j.equals(k);
		System.out.println(l);

		String p = "mala";
		boolean q = j.equalsIgnoreCase(p);
		System.out.println(q);

		String name = "computer";
		int name1 = name.indexOf("u");
		System.out.println(name1);

		String name2 = "Technology";
		char name3 = name2.charAt(0);
		System.out.println(name3);

		String w = "character";
		char[] s = w.toCharArray();
		System.out.println(s[0]);
		System.out.println(Arrays.toString(s));

		String fruit = "pineApple";
		String fruit1 = fruit.substring(0, 6);
		System.out.println(fruit1);

		String v = "priya";
		String[] v1 = v.split("i");
		System.out.println(v1[0]);

	}

}
