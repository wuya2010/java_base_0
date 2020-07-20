package com.alibaba.array3Test.exer2;

/*
 1.打印某字符串型数组中的所有元素
2.定义一个方法，实现判断Animal对象的颜色，如果为white，则提示白色，如果为yellow，则提示黄色，否则提示other

 */
public class StringColorTest {

	public static void main(String[] args) {

		System.out.println("-------------1.打印某字符串型数组中的所有元素----------");
		StringColorTest sc = new StringColorTest();
		sc.showColor(new String[] { "yellow", "red", "blue" });

		System.out.println("---------匿名对象的使用-------------");
		Animal animal = new Animal();
		animal.color = "red";
		animal.name = "旺仔";
		animal.sex = '母';
		sc.showAnimal(animal);
		// 将匿名对象作为实参进行传递 （如果只需要使用一次可以使用匿名对象）
		sc.showAnimal(new Animal()); // 匿名对象

		System.out.println("-------------------------------------");
		Animal[] animals = new Animal[2];
		Animal a = new Animal();
		a.name = "二哈";
		a.sex = '公';
		a.color = "white";
		animals[0] = a;

		Animal a2 = new Animal();
		a2.name = "泰迪";
		a2.sex = '公';
		a2.color = "yellow";
		animals[1] = a2;

		//直接将数组作为实参进行传递
//		sc.showAnimalColor(animals);
		
		//有几个对象就调用几次方法。每次都将一个对象进行传递
		for (int i = 0; i < animals.length; i++) {
			sc.showAnimalColor(animals[i]);
		}
	}

	public void showAnimalColor(Animal animal) {

		switch (animal.color) {
		case "white":
			System.out.println("白色");
			break;
		case "yellow":
			System.out.println("黄色");
			break;
		default:
			System.out.println("other");
		}

	}

	/*
	 * 2.定义一个方法，实现判断Animal对象的颜色，如果为white， 则提示白色，如果为yellow，则提示黄色，否则提示other
	 */
	public void showAnimalColor(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			switch (animal.color) {
			case "white":
				System.out.println("白色");
				break;
			case "yellow":
				System.out.println("黄色");
				break;
			default:
				System.out.println("other");
			}
		}
	}

	/*
	 * 匿名对象的使用
	 */
	public void showAnimal(Animal animal) {
		animal.show();
	}

	/*
	 * 输出数组中所有的元素
	 */
	public void showColor(String[] colors) {
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
	}
}
