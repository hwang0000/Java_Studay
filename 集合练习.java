package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * 集合练习
 * 
 * @author hwang
 *
 */
public class Test {

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		// hash_set();
		// tree_set();
		// arr_list();
		// hash_map();
		collection_use();
	}

	// HashSet
	public static void hash_set()
	{
		Set<Object> set = new HashSet<Object>();
		// 添加
		set.add(1);
		set.add("34f");
		set.add('r');
		set.add("e");
		set.add('e');
		set.add(1);// set集合存的值是不重复的
		set.add(null);
		System.out.println("set:" + set);

		// 删除
		if (set.remove('r'))
			System.out.println("删除元素成功,set:" + set);

		if (set.contains(2))
			System.out.println("set中存在此元素");
		else
			System.out.println("set中不存在此元素");

		// 遍历
		// 1.使用迭代器遍历
		Iterator<Object> it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + ",");
		System.out.println();
		// 2.for each,推荐使用
		for (Object obj : set)
			System.out.print(obj + ",");
		System.out.println();

		// 集合大小
		System.out.println("集合大小：" + set.size());

		// 清空
		set.clear();
		System.out.println("set:" + set);

	}

	// TreeSet
	public static void tree_set()
	{
		Set<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(9);
		set.add(1);
		set.add(7);
		System.out.println(set);

		Set<Person> pSet = new TreeSet<Person>(new Person());
		Person p1 = new Person("张三", 18);
		Person p2 = new Person("李四", 18);
		Person p3 = new Person("王麻子", 15);
		Person p4 = new Person("赵六", 24);
		Person[] p5 = { new Person("Lucy", 19), new Person("Alice", 23), new Person("Alice", 23) };
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5[0]);
		pSet.add(p5[1]);
		pSet.add(p5[2]);
		// System.out.println(pSet);
		for (Person p : pSet)
			System.out.print(p.getName() + "(" + p.getAge() + ")" + ",");
		System.out.println();
	}

	// ArrayList
	public static void arr_list()
	{
		List<String> list = new ArrayList<String>();
		list.add("svsd");
		list.add("dbfd");
		list.add("svsd");// 可重复添加
		list.add("mghh");
		System.out.println(list);

		// 获取单个元素
		System.out.println(list.get(3));

		// 指定位置添加
		list.add(1, "bfgnt");
		System.out.println(list);

		// 添加list集合
		List<String> l = new ArrayList<String>();
		l.add("qwvn");
		l.add("hmjug");
		list.addAll(l);
		System.out.println(list);

		// 获取指定元素第一次出现的索引下标
		System.out.print(list.indexOf("dbfd") + ",");
		System.out.print(list.indexOf("he") + ",");
		// 获取指定元素最后一次出现的索引下标
		System.out.println(list.lastIndexOf("svsd"));

		// 删除元素
		list.remove(3);
		System.out.println(list);

		// 修改
		list.set(4, "qwer");
		System.out.println(list);

		// 截取list，包含起始点，不包含结束点
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);

		// 长度
		System.out.println(list.size());

		// 清空
		list.clear();
		System.out.println(list);
	}

	// HashMap
	public static void hash_map()
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 22);
		map.put("e", 15);
		map.put("c", 15);// key不能相同，value可以相同
		System.out.println(map);

		// 根据key取值
		System.out.println(map.get("e"));

		// 查询key值或value值是否存在
		System.out.println(map.containsKey("c"));
		System.out.println(map.containsValue(15));

		// 遍历map
		// 1.通过map.keySet()
		Set<String> keys = map.keySet();
		for (String key : keys)
			System.out.print("(" + key + "," + map.get(key) + ");");
		System.out.println();
		// 2.通过map.entrySet()
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for (Entry<String, Integer> entry : entrys)
			System.out.print("(" + entry.getKey() + "," + entry.getValue() + ");");
		System.out.println();

		// 根据key删除
		map.remove("c");
		System.out.println(map);

		// map集合长度
		System.out.println(map.size());
	}

	// 工具collections的使用
	public static void collection_use()
	{
		List<String> list = new ArrayList<String>();
		list.add("dbt");
		list.add("adnde");
		list.add("im,h");
		list.add("gmyt");
		list.add("23t");
		System.out.println(list);

		// 倒置list
		Collections.reverse(list);
		System.out.println(list);

		// 随机排序
		Collections.shuffle(list);
		System.out.println(list);

		// 升序排序
		Collections.sort(list);
		// Collections.sort(p, new Person());
		System.out.println(list);

		// 最值
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		// 交换指定元素
		Collections.swap(list, 1, 4);
		System.out.println(list);

		// 指定元素出现次数
		System.out.println(Collections.frequency(list, "dbt"));

		// 值替换
		Collections.replaceAll(list, "im,h", "345");
		System.out.println(list);
	}
}

class Person implements Comparator<Person> {
	private int age;
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Person()
	{
		// TODO 自动生成的构造函数存根
	}

	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}

	@Override
	public int compare(Person o1, Person o2)
	{
		// TODO 自动生成的方法存根
		// 年龄大的排前面，姓名小的排前面
		if (o1.age > o2.age)
			return 1;
		else if (o1.age < o2.age)
			return -1;
		else if (o1.name.compareTo(o2.name) < 0)
			return 1;
		else if (o1.name.compareTo(o2.name) > 0)
			return -1;
		else
			return 0;// return 0 代表两人信息完全相同，可认定为一人
	}

}
