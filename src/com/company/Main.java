package com.company;

public class Main {

    public static void main(String[] args) {
	Comparator[] c = new Student[10];

	c[0] = new Student("Коля", 4.6);
	c[1] = new Student("Маша", 3.0);
	c[2] = new Student("Олег", 4.8);
	c[3] = new Student("Катя", 2.3);
	c[4] = new Student("Антон", 3.4);
	c[5] = new Student("Вика", 2.9);
	c[6] = new Student("Cтас", 2.1);
	c[7] = new Student("Вика", 3.7);
	c[8] = new Student("Настя", 4.0);
	c[5] = new Student("Валерий Жмышенко", 5);
	c[9] = new Student("Данила", 4.7);
	((Student)c[5]).print();
	new App();
    }
}
